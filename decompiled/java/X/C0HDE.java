package X;

import android.view.View;
import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment$setUpCellsInSocialAvatar$2$1$1$1$1$1", f = "SocialAvatarBottomSheetActionFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarQuotaResponse LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ SocialAvatarBottomSheetActionFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDE(SocialAvatarQuotaResponse socialAvatarQuotaResponse, View view, SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment, InterfaceC1364105Vn<? super C0HDE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarQuotaResponse;
        this.LLILLJJLI = view;
        this.LLILLL = socialAvatarBottomSheetActionFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r4 = "SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r19)
            r3 = r18
            com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse r0 = r3.LL
            java.lang.Boolean r1 = r0.isAllowed()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarService> r0 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r2 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r2
            X.0HHA r5 = new X.0HHA
            android.view.View r0 = r3.LLILLJJLI
            android.content.Context r6 = r0.getContext()
            java.lang.String r7 = "profile_regenerate"
            java.lang.String r8 = "personal_homepage"
            r9 = 0
            r11 = 4
            r12 = 0
            r13 = 1
            X.0HZ2 r14 = X.C0HZ2.EDIT_PROFILE_TWO_HEADER_SHEET_REGENERATE
            r1 = r5
            r17 = 3256(0xcb8, float:4.563E-42)
            r10 = r9
            r15 = r12
            r16 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0HDs r0 = X.EnumC437540HDs.START_REGENERATE
            r2.LJIILLIIL(r1, r0, r9)
            com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment r0 = r3.LLILLL
            X.0HFL r0 = r0.LLILLL
            if (r0 == 0) goto L6e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LIZLLL
            if (r0 == 0) goto L6e
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L5a:
            X.C1C7U.LIZIZ(r4)
            return r0
        L5e:
            com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment r0 = r3.LLILLL
            X.0HFL r0 = r0.LLILLL
            if (r0 == 0) goto L6e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LJ
            if (r0 == 0) goto L6e
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L5a
        L6e:
            r0 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HDE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
