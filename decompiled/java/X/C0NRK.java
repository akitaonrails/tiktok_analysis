package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NRK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MRDefaultOpenPushPermissionHandler$canShow$shouldShow$1", f = "MRDefaultOpenPushPermissionHandler.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0NRK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C0NRK(InterfaceC1364105Vn<? super C0NRK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NRK(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "MRDefaultOpenPushPermissionHandler@1036.canShow$shouldShow$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L12
            goto L5f
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r14)
            X.0NRL r0 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.IIMMessageRequestNoticeApi.LIZ     // Catch: java.lang.Exception -> L65
            r0.getClass()     // Catch: java.lang.Exception -> L65
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r7 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L65
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1     // Catch: java.lang.Exception -> L65
            if (r1 == 0) goto L43
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L65
            X.011f r1 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L65
            if (r1 == 0) goto L43
            java.lang.Class<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.IIMMessageRequestNoticeApi> r0 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.IIMMessageRequestNoticeApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L65
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.IIMMessageRequestNoticeApi r2 = (com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.IIMMessageRequestNoticeApi) r2     // Catch: java.lang.Exception -> L65
            goto L44
        L43:
            r2 = r4
        L44:
            if (r2 == 0) goto L69
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MessageRequestNoticeBody r1 = new com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MessageRequestNoticeBody     // Catch: java.lang.Exception -> L65
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)     // Catch: java.lang.Exception -> L65
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L65
            r1.<init>(r0)     // Catch: java.lang.Exception -> L65
            r13.LL = r3     // Catch: java.lang.Exception -> L65
            java.lang.Object r14 = r2.fetch(r1, r13)     // Catch: java.lang.Exception -> L65
            if (r14 != r5) goto L62
            X.C1C7U.LIZIZ(r6)
            return r5
        L5f:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Exception -> L65
        L62:
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MessageRequestNoticeResp r14 = (com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MessageRequestNoticeResp) r14     // Catch: java.lang.Exception -> L65
            goto L6a
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L69:
            r14 = r4
        L6a:
            if (r14 == 0) goto L94
            java.util.List<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.B2CPopupWindowControl> r0 = r14.controlList
            if (r0 == 0) goto L94
            java.util.Iterator r2 = r0.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.B2CPopupWindowControl r0 = (com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.B2CPopupWindowControl) r0
            java.lang.Integer r0 = r0.scene
            if (r0 == 0) goto L98
            int r0 = r0.intValue()
            if (r0 != r3) goto L98
            r0 = 1
        L8c:
            if (r0 == 0) goto L74
        L8e:
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.B2CPopupWindowControl r1 = (com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.B2CPopupWindowControl) r1
            if (r1 == 0) goto L94
            java.lang.Boolean r4 = r1.need_show
        L94:
            X.C1C7U.LIZIZ(r6)
            return r4
        L98:
            r0 = 0
            goto L8c
        L9a:
            r1 = r4
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NRK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C0NRK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
