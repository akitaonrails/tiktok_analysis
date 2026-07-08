package X;

import com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CY2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction$startLikePanelFlow$1", f = "SocialThoughtRouteAction.kt", l = {189, 202}, m = "invokeSuspend")
public final class C0CY2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ DialogC1389620mGW LLILZ;
    public final /* synthetic */ SocialThoughtRouteAction LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;
    public final /* synthetic */ SocialThoughtInteractionVM LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY2(String str, DialogC1389620mGW dialogC1389620mGW, SocialThoughtRouteAction socialThoughtRouteAction, C19EG c19eg, SocialThoughtInteractionVM socialThoughtInteractionVM, String str2, String str3, InterfaceC1364105Vn<? super C0CY2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = dialogC1389620mGW;
        this.LLILZIL = socialThoughtRouteAction;
        this.LLILZLL = c19eg;
        this.LLIZ = socialThoughtInteractionVM;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CY2 c0cy2 = new C0CY2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0cy2.LLILLJJLI = obj;
        return c0cy2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SocialThoughtRouteAction@262b.startLikePanelFlow$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L3f
            if (r0 != r4) goto Lb9
            X.C155000ia.LIZIZ(r8)
        L16:
            X.0Cfn r8 = (X.C319530Cfn) r8
            X.0mGW r0 = r7.LLILZ
            X.C786410Ut5.LJIIJ(r0)
            java.lang.Throwable r0 = r8.LJFF
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction r1 = r7.LLILZIL
            X.19EG r0 = r7.LLILZLL
            r1.showUnavailable(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L2e:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction r1 = r7.LLILZIL
            java.lang.String r0 = r7.LLILLL
            r7.LL = r2     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = r1.validateOwnedTid(r0, r7)     // Catch: java.lang.Throwable -> L50
            if (r8 != r5) goto L42
            goto Lc1
        L3f:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L50
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L50
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L50
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L50
            goto L5c
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L5c:
            X.C189200o6.m5exceptionOrNullimpl(r2)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L6b
            r2 = r1
        L6b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L85
            X.0mGW r0 = r7.LLILZ
            X.C786410Ut5.LJIIJ(r0)
            com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction r1 = r7.LLILZIL
            X.19EG r0 = r7.LLILZLL
            r1.showUnavailable(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L85:
            com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM r1 = r7.LLIZ
            java.lang.String r0 = r7.LLILLL
            r1.vQ2(r0)
            com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM r0 = r7.LLIZ
            X.0951 r3 = r0.LLILLJJLI
            X.0CUu r2 = new X.0CUu
            java.lang.String r1 = r7.LLILLL
            r0 = 0
            r2.<init>(r1, r0)
            r7.LL = r4
            java.lang.Object r8 = X.C09IC.LJIJ(r3, r7, r2)
            if (r8 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        La4:
            java.lang.String r0 = com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtLikePanelFragment._pnsPageId
            X.19EG r0 = r7.LLILZLL
            java.lang.String r1 = r7.LLILLL
            java.lang.String r2 = r7.LLIZLLLIL
            java.lang.String r3 = r7.LLJ
            r4 = 0
            r5 = r4
            X.C336580DHk.LIZ(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            X.C1C7U.LIZIZ(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CY2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
