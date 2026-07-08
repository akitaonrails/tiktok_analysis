package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik.BlikCodeInputBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik.ConfirmBlikPaymentBottomSheetFragment;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719590uqj {
    public static WeakReference<TuxSheet> LIZIZ;
    public static WeakReference<BlikCodeInputBottomSheetFragment> LIZJ;
    public static WeakReference<ConfirmBlikPaymentBottomSheetFragment> LIZLLL;
    public static WeakReference<TuxSheet> LJ;
    public static final C1719590uqj LIZ = new C1719590uqj();
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);

    public static void LIZIZ() {
        LJI.set(false);
        WeakReference<TuxSheet> weakReference = LJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        LJ = null;
        WeakReference<ConfirmBlikPaymentBottomSheetFragment> weakReference2 = LIZLLL;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        LIZLLL = null;
    }

    public static void LIZJ() {
        LJFF.set(false);
        WeakReference<TuxSheet> weakReference = LIZIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        LIZIZ = null;
        WeakReference<BlikCodeInputBottomSheetFragment> weakReference2 = LIZJ;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        LIZJ = null;
    }

    public static void LJ() {
        WeakReference<BlikCodeInputBottomSheetFragment> weakReference = LIZJ;
        BlikCodeInputBottomSheetFragment blikCodeInputBottomSheetFragment = weakReference != null ? weakReference.get() : null;
        WeakReference<TuxSheet> weakReference2 = LIZIZ;
        TuxSheet tuxSheet = weakReference2 != null ? weakReference2.get() : null;
        if (blikCodeInputBottomSheetFragment != null) {
            blikCodeInputBottomSheetFragment.u3();
        }
        if (tuxSheet != null && tuxSheet.isAdded()) {
            tuxSheet.dismissAllowingStateLoss();
        }
        LIZJ();
    }

    public static void LJI() {
        BlikCodeInputBottomSheetFragment blikCodeInputBottomSheetFragment;
        WeakReference<BlikCodeInputBottomSheetFragment> weakReference = LIZJ;
        if (weakReference == null || (blikCodeInputBottomSheetFragment = weakReference.get()) == null) {
            return;
        }
        blikCodeInputBottomSheetFragment.setLoading(false);
        C1748330vb5 c1748330vb5 = blikCodeInputBottomSheetFragment.LLILZ;
        if (c1748330vb5 != null) {
            Context context = blikCodeInputBottomSheetFragment.getContext();
            c1748330vb5.setMessage(context != null ? context.getString(2131840226) : null);
        }
        C1748330vb5 c1748330vb52 = blikCodeInputBottomSheetFragment.LLILZ;
        if (c1748330vb52 != null) {
            c1748330vb52.setMessageStyle(C338180DNo.LIZ);
        }
        C1748330vb5 c1748330vb53 = blikCodeInputBottomSheetFragment.LLILZ;
        if (c1748330vb53 != null) {
            c1748330vb53.setMessageIcon(C958703ov.LIZ);
        }
        C1754640vlG c1754640vlG = blikCodeInputBottomSheetFragment.LLILLL;
        if (c1754640vlG != null) {
            c1754640vlG.LJI(null);
        }
    }

    public static void LIZLLL() {
        LJ();
        WeakReference<ConfirmBlikPaymentBottomSheetFragment> weakReference = LIZLLL;
        ConfirmBlikPaymentBottomSheetFragment confirmBlikPaymentBottomSheetFragment = weakReference != null ? weakReference.get() : null;
        WeakReference<TuxSheet> weakReference2 = LJ;
        TuxSheet tuxSheet = weakReference2 != null ? weakReference2.get() : null;
        if (confirmBlikPaymentBottomSheetFragment != null) {
            confirmBlikPaymentBottomSheetFragment.u3();
        }
        if (tuxSheet != null && tuxSheet.isAdded()) {
            tuxSheet.dismissAllowingStateLoss();
        }
        LIZIZ();
    }

    public static void LJFF(FragmentManager fragmentManager, AwS545S0100000_1 awS545S0100000_1) {
        TuxSheet tuxSheet;
        WeakReference<TuxSheet> weakReference = LJ;
        if (weakReference != null) {
            tuxSheet = weakReference.get();
        } else {
            tuxSheet = null;
        }
        AtomicBoolean atomicBoolean = LJI;
        if (atomicBoolean.get() && tuxSheet == null) {
            LIZIZ();
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        LJ();
        ConfirmBlikPaymentBottomSheetFragment confirmBlikPaymentBottomSheetFragment = new ConfirmBlikPaymentBottomSheetFragment();
        LIZLLL = new WeakReference<>(confirmBlikPaymentBottomSheetFragment);
        confirmBlikPaymentBottomSheetFragment.LL = new AwS570S0100000_26(awS545S0100000_1, 399);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = confirmBlikPaymentBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(3);
        c1390920mIc.LJFF(0.7f);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLILLL = false;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = false;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0uql
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1719590uqj.LJII.set(true);
                C1719590uqj.LIZ.getClass();
                C1719590uqj.LIZIZ();
            }
        };
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        LJ = new WeakReference<>(tuxSheet3);
        tuxSheet3.show(fragmentManager, "confirm_blik_sheet");
    }

    public static void LIZ(FragmentManager fragmentManager, PaymentInfo paymentInfo, Function1 function1, Function0 function0) {
        TuxSheet tuxSheet;
        LJII.set(false);
        if (paymentInfo == null) {
            LJFF.set(false);
            function0.invoke();
            return;
        }
        WeakReference<TuxSheet> weakReference = LIZIZ;
        if (weakReference != null) {
            tuxSheet = weakReference.get();
        } else {
            tuxSheet = null;
        }
        AtomicBoolean atomicBoolean = LJFF;
        if (atomicBoolean.get() && tuxSheet == null) {
            LIZJ();
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        BlikCodeInputBottomSheetFragment blikCodeInputBottomSheetFragment = new BlikCodeInputBottomSheetFragment();
        LIZJ = new WeakReference<>(blikCodeInputBottomSheetFragment);
        blikCodeInputBottomSheetFragment.LL = new AwS367S0200000_1(paymentInfo, (PaymentInfo) function1, (Function1<? super PaymentInfo, Unit>) 104);
        blikCodeInputBottomSheetFragment.LLILLJJLI = new AwS570S0100000_26(function0, 398);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = blikCodeInputBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(3);
        c1390920mIc.LJFF(0.7f);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLILLL = true;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = true;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0uqk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1719590uqj.LIZ.getClass();
                C1719590uqj.LIZJ();
            }
        };
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC1775850wJT(function0, 2);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        LIZIZ = new WeakReference<>(tuxSheet3);
        tuxSheet3.show(fragmentManager, "blik_code_input_sheet");
    }
}
