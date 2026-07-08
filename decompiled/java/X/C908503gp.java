package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.bizum.BizumPhoneInputBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.bizum.ConfirmBizumPaymentBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PhoneInputDefaultSaveSettings;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C908503gp {
    public static WeakReference<TuxSheet> LIZ;
    public static WeakReference<BizumPhoneInputBottomSheetFragment> LIZIZ;
    public static WeakReference<TuxSheet> LIZJ;
    public static WeakReference<ConfirmBizumPaymentBottomSheetFragment> LIZLLL;
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);

    public static void LIZIZ() {
        LJFF.set(false);
        WeakReference<TuxSheet> weakReference = LIZJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        LIZJ = null;
        WeakReference<ConfirmBizumPaymentBottomSheetFragment> weakReference2 = LIZLLL;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        LIZLLL = null;
    }

    public static void LIZJ() {
        LJ.set(false);
        WeakReference<TuxSheet> weakReference = LIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        LIZ = null;
        WeakReference<BizumPhoneInputBottomSheetFragment> weakReference2 = LIZIZ;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        LIZIZ = null;
    }

    public static void LJ() {
        WeakReference<BizumPhoneInputBottomSheetFragment> weakReference = LIZIZ;
        BizumPhoneInputBottomSheetFragment bizumPhoneInputBottomSheetFragment = weakReference != null ? weakReference.get() : null;
        WeakReference<TuxSheet> weakReference2 = LIZ;
        TuxSheet tuxSheet = weakReference2 != null ? weakReference2.get() : null;
        if (bizumPhoneInputBottomSheetFragment != null) {
            bizumPhoneInputBottomSheetFragment.u3();
        }
        if (tuxSheet != null && tuxSheet.isAdded()) {
            tuxSheet.dismissAllowingStateLoss();
        }
        LIZJ();
    }

    public static void LIZLLL() {
        LJ();
        WeakReference<ConfirmBizumPaymentBottomSheetFragment> weakReference = LIZLLL;
        ConfirmBizumPaymentBottomSheetFragment confirmBizumPaymentBottomSheetFragment = weakReference != null ? weakReference.get() : null;
        WeakReference<TuxSheet> weakReference2 = LIZJ;
        TuxSheet tuxSheet = weakReference2 != null ? weakReference2.get() : null;
        if (confirmBizumPaymentBottomSheetFragment != null) {
            confirmBizumPaymentBottomSheetFragment.u3();
        }
        if (tuxSheet != null && tuxSheet.isAdded()) {
            tuxSheet.dismissAllowingStateLoss();
        }
        LIZIZ();
    }

    public static void LJFF(FragmentManager fragmentManager, AwS545S0100000_1 awS545S0100000_1) {
        TuxSheet tuxSheet;
        WeakReference<TuxSheet> weakReference = LIZJ;
        if (weakReference != null) {
            tuxSheet = weakReference.get();
        } else {
            tuxSheet = null;
        }
        AtomicBoolean atomicBoolean = LJFF;
        if (atomicBoolean.get() && tuxSheet == null) {
            LIZIZ();
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        LJ();
        ConfirmBizumPaymentBottomSheetFragment confirmBizumPaymentBottomSheetFragment = new ConfirmBizumPaymentBottomSheetFragment();
        LIZLLL = new WeakReference<>(confirmBizumPaymentBottomSheetFragment);
        confirmBizumPaymentBottomSheetFragment.LL = new AwS545S0100000_1(awS545S0100000_1, 1200);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = confirmBizumPaymentBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(3);
        c1390920mIc.LJFF(0.7f);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLILLL = false;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = false;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.03hN
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C908503gp.LJI.set(true);
                C908503gp.LIZIZ();
            }
        };
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        LIZJ = new WeakReference<>(tuxSheet3);
        tuxSheet3.show(fragmentManager, "confirm_bizum_sheet");
    }

    public static void LIZ(FragmentManager fragmentManager, PaymentInfo paymentInfo, Function1 function1, Function0 function0) {
        TuxSheet tuxSheet;
        boolean z;
        LJI.set(false);
        if (paymentInfo == null) {
            LJ.set(false);
            function0.invoke();
            return;
        }
        WeakReference<TuxSheet> weakReference = LIZ;
        String str = null;
        if (weakReference != null) {
            tuxSheet = weakReference.get();
        } else {
            tuxSheet = null;
        }
        AtomicBoolean atomicBoolean = LJ;
        if (atomicBoolean.get() && tuxSheet == null) {
            LIZJ();
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            str = paymentMethodInfo.id;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PhoneInputDefaultSaveSettings.PhoneInputDefaultSaveConfig phoneInputDefaultSaveConfig = PhoneInputDefaultSaveSettings.LIZ;
        PhoneInputDefaultSaveSettings.PhoneInputDefaultSaveConfig phoneInputDefaultSaveConfig2 = (PhoneInputDefaultSaveSettings.PhoneInputDefaultSaveConfig) settingsManagerLIZLLL.LJIIIIZZ("phone_input_default_save", PhoneInputDefaultSaveSettings.PhoneInputDefaultSaveConfig.class, phoneInputDefaultSaveConfig);
        if (phoneInputDefaultSaveConfig2 != null) {
            phoneInputDefaultSaveConfig = phoneInputDefaultSaveConfig2;
        }
        if (phoneInputDefaultSaveConfig.enable && C13LP.LJJJJ(str, phoneInputDefaultSaveConfig.allowPaymentMethodIds)) {
            z = true;
        } else {
            z = false;
        }
        BizumPhoneInputBottomSheetFragment bizumPhoneInputBottomSheetFragment = new BizumPhoneInputBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg_default_save_enabled", z);
        bizumPhoneInputBottomSheetFragment.setArguments(bundle);
        LIZIZ = new WeakReference<>(bizumPhoneInputBottomSheetFragment);
        bizumPhoneInputBottomSheetFragment.LL = new AwS367S0200000_1(paymentInfo, (PaymentInfo) function1, (Function1<? super PaymentInfo, Unit>) 103);
        bizumPhoneInputBottomSheetFragment.LLILLJJLI = new AwS545S0100000_1(function0, (Function0<Unit>) 1199);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = bizumPhoneInputBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(3);
        c1390920mIc.LJFF(0.7f);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLILLL = true;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = true;
        c1390920mIc.LJI(20);
        DialogInterfaceOnDismissListenerC911803hM dialogInterfaceOnDismissListenerC911803hM = new DialogInterface.OnDismissListener() { // from class: X.03hM
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C908503gp.LIZJ();
            }
        };
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLILLJJLI = dialogInterfaceOnDismissListenerC911803hM;
        tuxSheet3.LL = new C04JN(function0, 0);
        TuxSheet tuxSheet4 = c1390920mIc.LIZ;
        LIZ = new WeakReference<>(tuxSheet4);
        tuxSheet4.show(fragmentManager, "bizum_phone_input_sheet");
    }
}
