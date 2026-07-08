package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$sendUseFriendsIDNotification$1", f = "MixStudioBaseViewModel.kt", l = {350}, m = "invokeSuspend")
public final class C439010HJj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C439010HJj(InterfaceC1364105Vn<? super C439010HJj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C439010HJj c439010HJj = new C439010HJj(interfaceC1364105Vn);
        c439010HJj.LLILLJJLI = obj;
        return c439010HJj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "MixStudioBaseViewModel@9c39.sendUseFriendsIDNotification$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L36
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r6)
            X.0HJk r0 = com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi.LIZ     // Catch: java.lang.Throwable -> L3f
            r0.getClass()     // Catch: java.lang.Throwable -> L3f
            X.01GW<com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi> r0 = X.C439020HJk.LIZIZ     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi) r0     // Catch: java.lang.Throwable -> L3f
            r5.LL = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r6 = r0.sendSocialAvatarNotification(r1, r5)     // Catch: java.lang.Throwable -> L3f
            if (r6 != r3) goto L39
            X.C1C7U.LIZIZ(r4)
            return r3
        L36:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L3f
        L39:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi$SocialAvatarSendNotificationResponse r6 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi.SocialAvatarSendNotificationResponse) r6     // Catch: java.lang.Throwable -> L3f
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L4b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 == 0) goto L52
            r6 = 0
        L52:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi$SocialAvatarSendNotificationResponse r6 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi.SocialAvatarSendNotificationResponse) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.getHadSent()
            if (r0 != r2) goto L7e
            r0 = 1
        L5d:
            if (r0 != 0) goto L6a
            if (r6 == 0) goto L68
            boolean r0 = r6.getStatus()
            if (r0 != r2) goto L68
            r1 = 1
        L68:
            if (r1 == 0) goto L78
        L6a:
            X.0HSG r0 = X.C0HSG.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C0HSG.LIZIZ()
            java.lang.String r0 = "has_sent_use_friends_id_notification"
            r1.storeBoolean(r0, r2)
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L7e:
            r0 = 0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439010HJj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
