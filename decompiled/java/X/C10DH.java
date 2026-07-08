package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10DH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MRGuideOpenPushPermissionHandler$tryShowMessageRequestPushTurnOnGuidance$1$onDismissAfterShown$1", f = "MRGuideOpenPushPermissionHandler.kt", l = {}, m = "invokeSuspend")
public final class C10DH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19208510Ct LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10DH(C19208510Ct c19208510Ct, Context context, InterfaceC1364105Vn<? super C10DH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19208510Ct;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10DH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "MRGuideOpenPushPermissionHandler@c83f.tryShowMessageRequestPushTurnOnGuidance$1$onDismissAfterShown$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.10eQ r3 = X.C19296410eQ.LIZIZ
            kotlin.jvm.internal.AwS607S0100000_28 r2 = new kotlin.jvm.internal.AwS607S0100000_28
            android.content.Context r1 = r5.LLILLJJLI
            r0 = 315(0x13b, float:4.41E-43)
            r2.<init>(r1, r0)
            java.lang.String r1 = "im_push,1,im_push_select,0,im_msg_req_push,1,in_app_im_push,1,in_app_im_msg_req_push,1"
            r0 = 0
            com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp r3 = r3.batchSetPushSettingItems(r1, r0, r2)
            X.10Ct r1 = r5.LL
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.updatedSwitches
            r1.getClass()
            boolean r0 = X.C19208510Ct.LIZ(r0)
            if (r0 != 0) goto L4f
            X.10Ct r2 = r5.LL
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.updatedSwitches
            android.content.Context r0 = r5.LLILLJJLI
            r2.getClass()
            boolean r0 = X.C19208510Ct.LIZIZ(r0, r1)
            if (r0 != 0) goto L4f
            X.0ZcA r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils r1 = X.C903320ZcA.LIZ()
            if (r1 == 0) goto L49
            android.content.Context r0 = r5.LLILLJJLI
            r1.LIZIZ(r0)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L4f:
            X.10Ct r1 = r5.LL
            android.content.Context r0 = r5.LLILLJJLI
            r1.getClass()
            X.C19208510Ct.LIZJ(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10DH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
