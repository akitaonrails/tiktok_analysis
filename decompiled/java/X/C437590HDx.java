package X;

import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel$listenToSocialAvatarStatus$1", f = "SocialAvatarIconFlipPrerequisiteViewModel.kt", l = {136}, m = "invokeSuspend")
public final class C437590HDx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialAvatarIconFlipPrerequisiteViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437590HDx(SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel, InterfaceC1364105Vn<? super C437590HDx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarIconFlipPrerequisiteViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C437590HDx c437590HDx = new C437590HDx(this.LLILLL, interfaceC1364105Vn);
        c437590HDx.LLILLJJLI = obj;
        return c437590HDx;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:16:0x005b, B:17:0x005e, B:18:0x0060, B:20:0x0077, B:21:0x0079, B:23:0x007d), top: B:30:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:16:0x005b, B:17:0x005e, B:18:0x0060, B:20:0x0077, B:21:0x0079, B:23:0x007d), top: B:30:0x005b }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r7 = "SocialAvatarIconFlipPrerequisiteViewModel listenToSocialAvatarStatus get firstState is "
            java.lang.String r9 = "SocialAvatarIconFlipPrerequisiteViewModel@7f93.listenToSocialAvatarStatus$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LL
            java.lang.String r4 = "iconFlipVM"
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 != r2) goto L18
            java.lang.Object r5 = r10.LLILLJJLI
            goto L5b
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r5 = r10.LLILLJJLI
            com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel r0 = r10.LLILLL     // Catch: java.lang.Exception -> L85
            r0.getClass()     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Exception -> L85
            X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = r0.getCurUserId()     // Catch: java.lang.Exception -> L85
            if (r6 == 0) goto L59
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L85
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService> r0 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService r0 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService) r0     // Catch: java.lang.Exception -> L85
            X.0951 r1 = r0.LIZ(r6)     // Catch: java.lang.Exception -> L85
            X.0HDw r0 = new X.0HDw     // Catch: java.lang.Exception -> L85
            r0.<init>(r3)     // Catch: java.lang.Exception -> L85
            r10.LLILLJJLI = r5     // Catch: java.lang.Exception -> L85
            r10.LL = r2     // Catch: java.lang.Exception -> L85
            java.lang.Object r11 = X.C09IC.LJIJ(r1, r10, r0)     // Catch: java.lang.Exception -> L85
            if (r11 != r8) goto L5e
            X.C1C7U.LIZIZ(r9)
            return r8
        L59:
            r11 = r3
            goto L60
        L5b:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> L87
        L5e:
            X.0HDu r11 = (X.C437560HDu) r11     // Catch: java.lang.Exception -> L87
        L60:
            com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel r0 = r10.LLILLL     // Catch: java.lang.Exception -> L87
            X.0zpH r1 = r0.getLogger()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r0.<init>(r7)     // Catch: java.lang.Exception -> L87
            r0.append(r11)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L87
            r1.LIZ(r4, r0)     // Catch: java.lang.Exception -> L87
            if (r11 == 0) goto L79
            X.0HDs r3 = r11.LIZ     // Catch: java.lang.Exception -> L87
        L79:
            X.0HDs r0 = X.EnumC437540HDs.IDLE     // Catch: java.lang.Exception -> L87
            if (r3 != r0) goto Lae
            com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel r0 = r10.LLILLL     // Catch: java.lang.Exception -> L87
            r0.LLIZLLLIL = r2     // Catch: java.lang.Exception -> L87
            r0.vQ2()     // Catch: java.lang.Exception -> L87
            goto Lae
        L85:
            r3 = move-exception
            goto L88
        L87:
            r3 = move-exception
        L88:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel r0 = r10.LLILLL
            X.0zpH r2 = r0.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "listenToSocialAvatarStatus meets error with exception as "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", in scope "
            r1.append(r0)
            int r0 = r5.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.LIZ(r4, r0)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C437590HDx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
