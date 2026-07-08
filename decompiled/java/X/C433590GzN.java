package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment$showSocialAvatarEntranceBanner$4", f = "MusProfileEditFragment.kt", l = {500, 501, 502}, m = "invokeSuspend")
public final class C433590GzN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ MusProfileEditFragment LLILLL;
    public final /* synthetic */ SmartImageView LLILZ;
    public final /* synthetic */ SmartImageView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433590GzN(MusProfileEditFragment musProfileEditFragment, SmartImageView smartImageView, SmartImageView smartImageView2, InterfaceC1364105Vn<? super C433590GzN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = musProfileEditFragment;
        this.LLILZ = smartImageView;
        this.LLILZIL = smartImageView2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433590GzN(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r15
            java.lang.String r6 = "MusProfileEditFragment@fdf.showSocialAvatarEntranceBanner$4"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r3 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L20
            if (r0 == r4) goto L37
            if (r0 == r5) goto L53
            if (r0 != r3) goto L7a
            X.C155000ia.LIZIZ(r9)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L20:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment r0 = r14.LLILLL
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r1 = r0.CT()
            r14.LLILLJJLI = r4
            java.lang.String r0 = "social_avatar_banner_bg"
            java.lang.Object r9 = r1.LIZJ(r0, r14)
            if (r9 != r2) goto L3a
            X.C1C7U.LIZIZ(r6)
            return r2
        L37:
            X.C155000ia.LIZIZ(r9)
        L3a:
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment r0 = r14.LLILLL
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r1 = r0.CT()
            r14.LL = r12
            r14.LLILLJJLI = r5
            java.lang.String r0 = "social_avatar_banner_img"
            java.lang.Object r9 = r1.LIZJ(r0, r14)
            if (r9 != r2) goto L5a
            X.C1C7U.LIZIZ(r6)
            return r2
        L53:
            java.lang.Object r12 = r14.LL
            java.lang.String r12 = (java.lang.String) r12
            X.C155000ia.LIZIZ(r9)
        L5a:
            java.lang.String r9 = (java.lang.String) r9
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0GzM r7 = new X.0GzM
            com.bytedance.lighten.loader.SmartImageView r8 = r14.LLILZ
            com.bytedance.lighten.loader.SmartImageView r10 = r14.LLILZIL
            com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment r11 = r14.LLILLL
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.LL = r13
            r14.LLILLJJLI = r3
            java.lang.Object r0 = X.C23250099c.LJI(r14, r0, r7)
            if (r0 != r2) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r2
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C433590GzN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
