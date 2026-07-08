package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment$openSocialAvatarActionSheet$1", f = "ProfileEditFragment.kt", l = {1114, 1121}, m = "invokeSuspend")
public final class C442940HYm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileEditFragment LLILLJJLI;
    public final /* synthetic */ C1255030ilR LLILLL;
    public final /* synthetic */ AvatarComponentView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442940HYm(ProfileEditFragment profileEditFragment, C1255030ilR c1255030ilR, AvatarComponentView avatarComponentView, InterfaceC1364105Vn<? super C442940HYm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileEditFragment;
        this.LLILLL = c1255030ilR;
        this.LLILZ = avatarComponentView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442940HYm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r11 = r14
            java.lang.String r6 = "ProfileEditFragment@18c.openSocialAvatarActionSheet$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L44
            if (r0 != r4) goto L67
            X.C155000ia.LIZIZ(r11)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r11)
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment r0 = r13.LLILLJJLI
            X.01GW r0 = r0.LLLLLLL
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r2 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r2
            if (r2 == 0) goto L17
            boolean r0 = X.C435330H5f.LIZ()
            if (r0 == 0) goto L41
            java.lang.String r1 = "social_avatar_icon_img"
        L34:
            r13.LL = r5
            r0 = 0
            java.lang.Object r11 = r2.LIZ(r1, r0, r13)
            if (r11 != r3) goto L47
            X.C1C7U.LIZIZ(r6)
            return r3
        L41:
            java.lang.String r1 = "social_avatar_creation_icon"
            goto L34
        L44:
            X.C155000ia.LIZIZ(r11)
        L47:
            X.01bL r11 = (X.C364901bL) r11
            if (r11 == 0) goto L17
            X.0ilR r8 = r13.LLILLL
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment r9 = r13.LLILLJJLI
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r10 = r13.LLILZ
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0HYl r7 = new X.0HYl
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r13.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r13, r0, r7)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r6)
            return r3
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C442940HYm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
