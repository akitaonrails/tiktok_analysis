package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$updateLikeAvatar$1$2", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {704, 710}, m = "invokeSuspend")
public final class C0HEC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C442840HYc LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C442840HYc LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEC(C442840HYc c442840HYc, View view, InterfaceC1364105Vn<? super C0HEC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c442840HYc;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEC(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r10 = "EnlargeAvatarSocialAvatarHelper@38b.updateLikeAvatar$1$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r5 = X.C099R.LJFF()
            r6 = r18
            int r0 = r6.LLILLL
            r9 = 0
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L1f
            if (r0 != r4) goto Lab
            X.C155000ia.LIZIZ(r19)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1f:
            java.lang.Object r3 = r6.LLILLJJLI
            android.view.View r3 = (android.view.View) r3
            X.0HYc r2 = r6.LL
            goto L68
        L26:
            X.C155000ia.LIZIZ(r19)
            X.0HYc r0 = r6.LLILZ
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo r0 = X.C1245160iVW.LIZIZ(r0)
            if (r0 == 0) goto L19
            java.lang.Long r0 = r0.socialAvatarID
            if (r0 == 0) goto L19
            X.0HYc r2 = r6.LLILZ
            android.view.View r3 = r6.LLILZIL
            long r13 = r0.longValue()
            X.0HMR r0 = X.C0HMR.LIZ     // Catch: java.lang.Exception -> L75
            r0.getClass()     // Catch: java.lang.Exception -> L75
            X.0HEN r11 = X.C0HMR.LIZ()     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = r0.getUid()     // Catch: java.lang.Exception -> L75
            long r15 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L75
            boolean r0 = r2.LJIJJLI     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L58
            r12 = 2
            goto L59
        L58:
            r12 = 1
        L59:
            r6.LL = r2     // Catch: java.lang.Exception -> L75
            r6.LLILLJJLI = r3     // Catch: java.lang.Exception -> L75
            r6.LLILLL = r1     // Catch: java.lang.Exception -> L75
            r17 = r6
            java.lang.Object r0 = r11.LIZLLL(r12, r13, r15, r17)     // Catch: java.lang.Exception -> L75
            if (r0 != r5) goto L6b
            goto Lb3
        L68:
            X.C155000ia.LIZIZ(r19)     // Catch: java.lang.Exception -> L75
        L6b:
            boolean r0 = r2.LJIJJLI     // Catch: java.lang.Exception -> L75
            if (r0 != 0) goto L71
            r0 = 1
            goto L72
        L71:
            r0 = 0
        L72:
            r2.LJIJJLI = r0     // Catch: java.lang.Exception -> L75
            goto L19
        L75:
            r8 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r8)
            boolean r0 = r8 instanceof X.C0XIR
            r7 = 0
            if (r0 == 0) goto La9
            X.0XIR r8 = (X.C0XIR) r8
        L80:
            if (r8 == 0) goto L19
            int r1 = r8.getErrorCode()
            r0 = 2150(0x866, float:3.013E-42)
            if (r1 != r0) goto L8b
            r9 = 1
        L8b:
            if (r9 != 0) goto L8e
            r8 = r7
        L8e:
            if (r8 == 0) goto L19
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0HEB r0 = new X.0HEB
            r0.<init>(r2, r8, r3, r7)
            r6.LL = r7
            r6.LLILLJJLI = r7
            r6.LLILLL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r10)
            return r5
        La9:
            r8 = r7
            goto L80
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb3:
            X.C1C7U.LIZIZ(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HEC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
