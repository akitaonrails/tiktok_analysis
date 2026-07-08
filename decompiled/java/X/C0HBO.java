package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem$setImmersiveBackground$3", f = "SocialAvatarPageAssem.kt", l = {178, 184}, m = "invokeSuspend")
public final class C0HBO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarPageAssem LLILLJJLI;
    public final /* synthetic */ C0HFS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBO(SocialAvatarPageAssem socialAvatarPageAssem, C0HFS c0hfs, InterfaceC1364105Vn<? super C0HBO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarPageAssem;
        this.LLILLL = c0hfs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r7 = r14
            java.lang.String r5 = "SocialAvatarPageAssem@259e.setImmersiveBackground$3"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L3c
            if (r0 != r3) goto La8
            X.C155000ia.LIZIZ(r7)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJJJLIIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r1 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r1
            if (r1 == 0) goto L43
            X.0HFS r0 = r13.LLILLL
            X.0HFV r0 = r0.LIZJ
            r13.LL = r4
            java.lang.Object r7 = r1.LJIIIZ(r0, r13)
            if (r7 != r2) goto L3f
            X.C1C7U.LIZIZ(r5)
            return r2
        L3c:
            X.C155000ia.LIZIZ(r7)
        L3f:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L45
        L43:
            java.lang.String r7 = ""
        L45:
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L92
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJJ
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r0)
        L6c:
            java.lang.Object r8 = r4.getFirst()
            com.bytedance.lighten.loader.SmartImageView r8 = (com.bytedance.lighten.loader.SmartImageView) r8
            java.lang.Object r10 = r4.getSecond()
            com.bytedance.lighten.loader.SmartImageView r10 = (com.bytedance.lighten.loader.SmartImageView) r10
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0HBP r6 = new X.0HBP
            X.0HFS r9 = r13.LLILLL
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r11 = r13.LLILLJJLI
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r13, r0, r6)
            if (r0 != r2) goto L17
            X.C1C7U.LIZIZ(r5)
            return r2
        L92:
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJJ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r0)
            goto L6c
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
