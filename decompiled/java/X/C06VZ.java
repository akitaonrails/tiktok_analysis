package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.quickemoji.IMSocialAvatarCreationView$initView$1", f = "IMSocialAvatarCreationView.kt", l = {75, 76}, m = "invokeSuspend")
public final class C06VZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1617606Va LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06VZ(C1617606Va c1617606Va, InterfaceC1364105Vn<? super C06VZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1617606Va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06VZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "IMSocialAvatarCreationView@c84e.initView$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L35
            if (r0 != r4) goto L54
            X.C155000ia.LIZIZ(r8)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r8)
            X.06Va r0 = r7.LLILLJJLI
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r1 = r0.getSocialAvatarService()
            if (r1 == 0) goto L16
            r7.LL = r2
            java.lang.String r0 = "social_avatar_card_img_dark"
            java.lang.Object r8 = r1.LIZJ(r0, r7)
            if (r8 != r5) goto L38
            X.C1C7U.LIZIZ(r6)
            return r5
        L35:
            X.C155000ia.LIZIZ(r8)
        L38:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L16
            X.06Va r3 = r7.LLILLJJLI
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.06VY r1 = new X.06VY
            r0 = 0
            r1.<init>(r8, r3, r0)
            r7.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06VZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
