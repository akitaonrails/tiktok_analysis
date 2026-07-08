package X;

import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS477S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MV1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MV1 extends C1619110sEf implements InterfaceC19330810jy {
    public final C0MVC LL;
    public final boolean LLILLJJLI;
    public final Function1<C0MV1, Unit> LLILLL;
    public final InterfaceC1631620sYq<Boolean, C0MV4, Function0<Unit>, Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public InterfaceC539120LCk LLILZLL;
    public boolean LLIZ = true;
    public final ARunnableS108S0100000_8 LLIZLLLIL = new ARunnableS108S0100000_8(this, 150);

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{LSPassThroughRecordSizeConfig.DEFAULT};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abnormalExitLogService().logRestoreDialogShow(this.LLILLJJLI);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || !Intrinsics.LJFF("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", topActivity.getLocalClassName())) {
            return false;
        }
        return true;
    }

    public final C0MV4 LJIILIIL(boolean z) {
        C0MV9 c0mv9 = C0MV4.Companion;
        C0MVC c0mvc = this.LL;
        boolean z2 = c0mvc.LLJI;
        boolean z3 = c0mvc.LLJIJIL;
        c0mv9.getClass();
        if (z2) {
            return C0MV4.TAP;
        }
        if (z) {
            return C0MV4.SWIPE;
        }
        if (z3) {
            return C0MV4.CLICK_CLOSE;
        }
        return C0MV4.AUTO_DISMISS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        r0 = 5;
     */
    @Override // X.InterfaceC19330810jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20663815tU LJIIIZ(X.C20663515tR r6, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r7) {
        /*
            r5 = this;
            r5.LLILZLL = r6
            X.0MVC r2 = r5.LL
            kotlin.jvm.internal.AwS587S0100000_8 r1 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 777(0x309, float:1.089E-42)
            r1.<init>(r6, r0)
            r2.setDismissAction(r1)
            r4 = 0
            r5.LLIZ = r4
            boolean r0 = X.C0LD1.LIZIZ()
            if (r0 == 0) goto L3e
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L3e
            int r0 = r0.intValue()
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L3e
            long r2 = r0.longValue()
            X.0MVC r1 = r5.LL
            Y.ARunnableS108S0100000_8 r0 = r5.LLIZLLLIL
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r1, r0)
            X.0MVC r1 = r5.LL
            Y.ARunnableS108S0100000_8 r0 = r5.LLIZLLLIL
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r1, r0, r2)
        L3e:
            X.15tU r1 = new X.15tU
            X.0MVC r0 = r5.LL
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MV1.LJIIIZ(X.15tR, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):X.15tU");
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        HandlerHook.viewRemoveCallbacks(this.LL, this.LLIZLLLIL);
        C0MV4 c0mv4LJIILIIL = LJIILIIL(z);
        if (!this.LLIZ) {
            this.LLIZ = true;
            this.LLILZ.invoke(Boolean.valueOf(this.LL.LLJI), c0mv4LJIILIIL, AFwS194S0000000_8.get$arr$(635));
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abnormalExitLogService().logRestoreDialogDismiss(c0mv4LJIILIIL.getMobValue(), this.LLILLJJLI);
        this.LLILLL.invoke(this);
    }

    public C0MV1(C0MVC c0mvc, boolean z, AwS587S0100000_8 awS587S0100000_8, AwS477S0200000_8 awS477S0200000_8, AwS409S0200000_8 awS409S0200000_8) {
        this.LL = c0mvc;
        this.LLILLJJLI = z;
        this.LLILLL = awS587S0100000_8;
        this.LLILZ = awS477S0200000_8;
        this.LLILZIL = awS409S0200000_8;
    }
}
