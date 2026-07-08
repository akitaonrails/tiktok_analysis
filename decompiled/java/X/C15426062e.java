package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.AiMojiManageViewHolder$enterManagePage$1", f = "AiMojiBannerEntranceViewHolder.kt", l = {217, 218}, m = "invokeSuspend")
public final class C15426062e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0HYK LLILLL;
    public final /* synthetic */ DialogC1389620mGW LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15426062e(String str, C0HYK c0hyk, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C15426062e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c0hyk;
        this.LLILZ = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15426062e(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AiMojiManageViewHolder@e077.enterManagePage$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L3a
            if (r0 != r4) goto L58
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService> r0 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService r1 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService) r1
            if (r1 == 0) goto L38
            java.lang.String r0 = r8.LLILLJJLI
            r8.LL = r2
            java.lang.Object r9 = r1.LIZIZ(r0, r8)
            if (r9 != r6) goto L3d
            X.C1C7U.LIZIZ(r7)
            return r6
        L38:
            r9 = r5
            goto L3f
        L3a:
            X.C155000ia.LIZIZ(r9)
        L3d:
            java.lang.Integer r9 = (java.lang.Integer) r9
        L3f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.062f r2 = new X.062f
            X.0HYK r1 = r8.LLILLL
            X.0mGW r0 = r8.LLILZ
            r2.<init>(r9, r1, r0, r5)
            r8.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15426062e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
