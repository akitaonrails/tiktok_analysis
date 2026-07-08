package Y;

import X.AbstractC1896090zRP;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1792840wks;
import X.C1794650wnn;
import X.C1849810yEl;
import X.C1857690yRT;
import X.C1860520yW2;
import X.C1862280yYs;
import X.C19EG;
import X.C1C7U;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1791830wjF;
import X.InterfaceC1794730wnv;
import X.InterfaceC202128147a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS60S0500000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS17S0500000_27 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean z = false;
        if (((List) this.l0).isEmpty()) {
            C1849810yEl c1849810yEl = (C1849810yEl) this.l1;
            C19EG c19eg = (C19EG) this.l2;
            c1849810yEl.getClass();
            C1849810yEl.LJFF(c19eg);
            ((CompletionBlock) this.l3).onSuccess(C1849810yEl.LJ(false), "");
            return;
        }
        C1849810yEl c1849810yEl2 = (C1849810yEl) this.l1;
        C19EG c19eg2 = (C19EG) this.l2;
        c1849810yEl2.getClass();
        if (!C1849810yEl.LIZJ(c19eg2)) {
            ((CompletionBlock) this.l3).onSuccess(C1849810yEl.LJ(false), "");
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW((C19EG) this.l2);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C1849810yEl c1849810yEl3 = (C1849810yEl) this.l1;
        C19EG c19eg3 = (C19EG) this.l2;
        ARunnableS35S0400000_27 aRunnableS35S0400000_27 = new ARunnableS35S0400000_27(c1849810yEl3, c19eg3, dialogC1389620mGW, atomicBoolean, 0);
        c1849810yEl3.getClass();
        if (C1849810yEl.LIZJ(c19eg3) && c19eg3.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            C786410Ut5.J4(dialogC1389620mGW);
        }
        C786410Ut5.LJLIIL(3000L, (Handler) ((C1849810yEl) this.l1).LLILLL.getValue(), aRunnableS35S0400000_27);
        try {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) this.l4;
            if (abstractC1896090zRP != null) {
                abstractC1896090zRP.LIZJ((List) this.l0, new AwS60S0500000_27((C1849810yEl) this.l1, (C19EG) this.l2, dialogC1389620mGW, atomicBoolean, aRunnableS35S0400000_27, 0));
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((CompletionBlock) this.l3).onSuccess(C1849810yEl.LJ(z), "");
        if (z) {
            return;
        }
        ((C1849810yEl) this.l1).LIZLLL((C19EG) this.l2, dialogC1389620mGW, atomicBoolean, aRunnableS35S0400000_27, true);
    }

    public final void LIZ$1() {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Context context = (Context) ((WeakReference) this.l0).get();
        if (C1857690yRT.LJIIJJI(context)) {
            Activity activityLIZ = context != null ? C1388190mED.LIZ(context) : null;
            if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (supportFragmentManager = c19eg.getSupportFragmentManager()) == null) {
                return;
            }
            final TakoEnterParams takoEnterParams = (TakoEnterParams) this.l1;
            final IMessageAbility iMessageAbility = (IMessageAbility) this.l2;
            final ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.l3;
            final ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) this.l4;
            TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment = new TakoDisclaimerWithTosFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "tako_enter_param", takoEnterParams);
            takoDisclaimerWithTosFragment.setArguments(bundle);
            ((ArrayList) takoDisclaimerWithTosFragment.LLILLJJLI).add(new InterfaceC202128147a() { // from class: X.0yZD
                @Override // X.InterfaceC202128147a
                public final void onShow() throws JSONException {
                    C13LC<C1863850ybP> c13lcT71;
                    C1863850ybP c1863850ybP;
                    String str;
                    C13LC<C1863850ybP> c13lcT712;
                    C1863850ybP c1863850ybP2;
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    TakoEnterParams takoEnterParams2 = takoEnterParams;
                    ITakoContextAbility iTakoContextAbility2 = iTakoContextAbility;
                    String str2 = null;
                    if (iTakoContextAbility2 != null && (c13lcT712 = iTakoContextAbility2.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                        str2 = c1863850ybP2.LLILZLL;
                    }
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    ITakoContextAbility iTakoContextAbility3 = iTakoContextAbility;
                    if (iTakoContextAbility3 != null && (c13lcT71 = iTakoContextAbility3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str = c1863850ybP.LLIZ) != null) {
                        str3 = str;
                    }
                    C1862330yYx.LJII(c1862330yYx, takoEnterParams2, str2, str3);
                }

                @Override // X.InterfaceC202128147a
                public final void LIZ(String str) throws JSONException {
                    C13LC<C1863850ybP> c13lcT71;
                    C1863850ybP c1863850ybP;
                    String str2;
                    C13LC<C1863850ybP> c13lcT712;
                    C1863850ybP c1863850ybP2;
                    TakoEnterParams takoEnterParams2 = takoEnterParams;
                    IMessageAbility iMessageAbility2 = iMessageAbility;
                    ITakoContextAbility iTakoContextAbility2 = iTakoContextAbility;
                    if (!C1862280yYs.LIZLLL(takoEnterParams2) && str != null && str.length() != 0 && iMessageAbility2 != null) {
                        iMessageAbility2.Rl2(str, true, EnumC1858090yS7.DIALOG_SUG, takoEnterParams2.getCommonParams(), C2097608Jq.LJIIJ(new Pair("is_resend", CardStruct.IStatusCode.DEFAULT), new Pair("interaction_type", "quick_reaction")), new LinkedHashMap(), null, null, "", 0, null, 0, -1, null, null, UUID.randomUUID().toString(), null, null);
                    }
                    C1862600yZO.LIZ(true, takoEnterParams2, iMessageAbility2);
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str3 = null;
                    if (iTakoContextAbility2 != null && (c13lcT712 = iTakoContextAbility2.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                        str3 = c1863850ybP2.LLILZLL;
                    }
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str2 = c1863850ybP.LLIZ) != null) {
                        str4 = str2;
                    }
                    C1862330yYx.LJI(c1862330yYx, takoEnterParams2, "click_agree", str3, str4);
                }

                @Override // X.InterfaceC202128147a
                public final void LIZIZ(C1863210yaN c1863210yaN) throws JSONException {
                    C13LC<C1863850ybP> c13lcT71;
                    C1863850ybP c1863850ybP;
                    String str;
                    C13LC<C1863850ybP> c13lcT712;
                    C1863850ybP c1863850ybP2;
                    TakoEnterParams takoEnterParams2 = takoEnterParams;
                    ITakoChatPageAbility iTakoChatPageAbility2 = iTakoChatPageAbility;
                    IMessageAbility iMessageAbility2 = iMessageAbility;
                    ITakoContextAbility iTakoContextAbility2 = iTakoContextAbility;
                    if (iTakoChatPageAbility2 != null) {
                        iTakoChatPageAbility2.ts2();
                    }
                    C1862600yZO.LIZ(false, takoEnterParams2, iMessageAbility2);
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str2 = c1863210yaN.LIZ;
                    String str3 = null;
                    if (iTakoContextAbility2 != null && (c13lcT712 = iTakoContextAbility2.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                        str3 = c1863850ybP2.LLILZLL;
                    }
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null && (str = c1863850ybP.LLIZ) != null) {
                        str4 = str;
                    }
                    C1862330yYx.LJI(c1862330yYx, takoEnterParams2, str2, str3, str4);
                }
            });
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = takoDisclaimerWithTosFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0yZo
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C320490ChL.LIZ();
                }
            };
            tuxSheet.show(supportFragmentManager, "TakoDisclaimerWithToS");
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJJIFFI(true);
            if (iMessageAbility != null) {
                iMessageAbility.U61(1, C1862280yYs.LIZ(takoEnterParams) ? 2 : 1, "", "");
            }
        }
    }

    public static final void run$0(ARunnableS17S0500000_27 aRunnableS17S0500000_27) {
        boolean zLIZ;
        C1C7U.LIZ("IncentiveAddVideoToFypMethod@3eff.handle$1$1$1");
        try {
            C1849810yEl c1849810yEl = (C1849810yEl) aRunnableS17S0500000_27.l0;
            C19EG c19eg = (C19EG) aRunnableS17S0500000_27.l1;
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) aRunnableS17S0500000_27.l2;
            AtomicBoolean atomicBoolean = (AtomicBoolean) aRunnableS17S0500000_27.l3;
            Runnable runnable = (Runnable) aRunnableS17S0500000_27.l4;
            int i = C1849810yEl.LLILZ;
            c1849810yEl.LIZLLL(c19eg, dialogC1389620mGW, atomicBoolean, runnable, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IncentiveAddVideoToFypMethod@3eff.handle$1$1$1");
    }

    public static final void run$1(ARunnableS17S0500000_27 aRunnableS17S0500000_27) {
        boolean zLIZ;
        C1C7U.LIZ("IncentiveAddVideoToFypMethod@3eff.handle$1");
        try {
            aRunnableS17S0500000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IncentiveAddVideoToFypMethod@3eff.handle$1");
    }

    public static final void run$2(ARunnableS17S0500000_27 aRunnableS17S0500000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoDisclaimerWithTosHelper@e9bc.showDialog$1");
        try {
            aRunnableS17S0500000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoDisclaimerWithTosHelper@e9bc.showDialog$1");
    }

    public static final void run$3(ARunnableS17S0500000_27 aRunnableS17S0500000_27) {
        C1794650wnn c1794650wnn = (C1794650wnn) aRunnableS17S0500000_27.l0;
        EnumC1791830wjF enumC1791830wjF = (EnumC1791830wjF) aRunnableS17S0500000_27.l1;
        C1792840wks c1792840wks = (C1792840wks) aRunnableS17S0500000_27.l2;
        List list = (List) aRunnableS17S0500000_27.l3;
        InterfaceC1794730wnv interfaceC1794730wnv = (InterfaceC1794730wnv) aRunnableS17S0500000_27.l4;
        c1794650wnn.getClass();
        C1C7U.LIZ("IapObserverProxyServiceImpl@6d8f.notifyQueryProductDetailsCallback$1L");
        C1794650wnn.LIZIZ(c1792840wks, interfaceC1794730wnv, enumC1791830wjF, list);
        C1C7U.LIZIZ("IapObserverProxyServiceImpl@6d8f.notifyQueryProductDetailsCallback$1L");
    }

    public ARunnableS17S0500000_27(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
