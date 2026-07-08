package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.AIBotDisclaimerDialogFragment;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS63S0500000_30;
import njp.a;

/* JADX INFO: renamed from: X.14Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor$handleShow$1", f = "AIBotDisclaimerDialogProcessor.kt", l = {}, m = "invokeSuspend")
public final class C20232614Eq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ AIBotDisclaimerDialogProcessor LLILLL;
    public final /* synthetic */ C1862660yZU LLILZ;
    public final /* synthetic */ C14FD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20232614Eq(Fragment fragment, TakoEnterParams takoEnterParams, AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor, C1862660yZU c1862660yZU, C14FD c14fd, InterfaceC1364105Vn<? super C20232614Eq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = aIBotDisclaimerDialogProcessor;
        this.LLILZ = c1862660yZU;
        this.LLILZIL = c14fd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20232614Eq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIBotDisclaimerDialogProcessor@1aad.handleShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG activity = this.LL.getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            TuxSheet tuxSheet = null;
            if (1 != 0) {
                TakoEnterParams takoEnterParams = this.LLILLJJLI;
                AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor = this.LLILLL;
                AwS63S0500000_30 awS63S0500000_30 = new AwS63S0500000_30(activity, takoEnterParams, this.LLILZIL, this.LLILZ, aIBotDisclaimerDialogProcessor, 3);
                AIBotDisclaimerDialogFragment aIBotDisclaimerDialogFragment = new AIBotDisclaimerDialogFragment();
                awS63S0500000_30.invoke(aIBotDisclaimerDialogFragment.LLJ);
                aIBotDisclaimerDialogFragment.LLJ.LIZ.invoke(aIBotDisclaimerDialogFragment.LLJI);
                aIBotDisclaimerDialogFragment.LLJ.LIZIZ.invoke(aIBotDisclaimerDialogFragment.LLJIJIL);
                aIBotDisclaimerDialogFragment.LLIZLLLIL = activity;
                C1862330yYx.LJJL(C1862330yYx.LIZ, this.LLILLJJLI.getCommonParams());
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJI = aIBotDisclaimerDialogFragment;
                tuxSheet2.LLJJIJIIJIL = true;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                tuxSheet3.LLJLILLLLZIIL = true;
                tuxSheet3.LLILLL = false;
                tuxSheet3.LLJLLL = false;
                tuxSheet3.LLJLLIL = false;
                tuxSheet3.LL = new DialogInterfaceOnCancelListenerC20307114d3(aIBotDisclaimerDialogFragment, 0);
                aIBotDisclaimerDialogFragment.LLJILJIL = tuxSheet3;
                FragmentManager fragmentManagerLIZIZ = C20230914Dz.LIZIZ(aIBotDisclaimerDialogFragment, aIBotDisclaimerDialogFragment.LLIZLLLIL);
                if (fragmentManagerLIZIZ != null) {
                    TuxSheet tuxSheet4 = aIBotDisclaimerDialogFragment.LLJILJIL;
                    if (tuxSheet4 != null) {
                        tuxSheet = tuxSheet4;
                    }
                    tuxSheet.show(fragmentManagerLIZIZ, "TakoDisclaimerDialogFragment");
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AIBotDisclaimerDialogProcessor@1aad.handleShow$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIBotDisclaimerDialogProcessor@1aad.handleShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
