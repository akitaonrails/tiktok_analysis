package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$bindBackgroundImage$1", f = "SocialAvatarServiceImpl.kt", l = {843, 853}, m = "invokeSuspend")
public final class C0HBF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarServiceImpl LLILLJJLI;
    public final /* synthetic */ C0HFS LLILLL;
    public final /* synthetic */ SmartImageView LLILZ;
    public final /* synthetic */ InterfaceC427850Gq7 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBF(SocialAvatarServiceImpl socialAvatarServiceImpl, C0HFS c0hfs, SmartImageView smartImageView, InterfaceC427850Gq7 interfaceC427850Gq7, InterfaceC1364105Vn<? super C0HBF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarServiceImpl;
        this.LLILLL = c0hfs;
        this.LLILZ = smartImageView;
        this.LLILZIL = interfaceC427850Gq7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SocialAvatarServiceImpl@45de.bindBackgroundImage$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 == r5) goto L51
            if (r0 != r6) goto L66
            X.C155000ia.LIZIZ(r10)
        L16:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L1c
            java.lang.String r10 = ""
        L1c:
            X.0kl3 r1 = X.C1331660kl2.LJIIIZ(r10)
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LLILZ
            r1.LJJ(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.LJIL = r0
            X.0Gq7 r0 = r9.LLILZIL
            r1.LJIIJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L34:
            X.C155000ia.LIZIZ(r10)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.0HBE r3 = new X.0HBE
            X.0HFS r2 = r9.LLILLL
            com.bytedance.lighten.loader.SmartImageView r1 = r9.LLILZ
            r0 = 0
            r3.<init>(r2, r1, r0)
            r9.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r9, r4, r3)
            if (r0 != r7) goto L54
            X.C1C7U.LIZIZ(r8)
            return r7
        L51:
            X.C155000ia.LIZIZ(r10)
        L54:
            com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl r1 = r9.LLILLJJLI
            X.0HFS r0 = r9.LLILLL
            X.0HFV r0 = r0.LIZLLL
            r9.LL = r6
            java.lang.Object r10 = r1.LJIIIZ(r0, r9)
            if (r10 != r7) goto L16
            X.C1C7U.LIZIZ(r8)
            return r7
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
