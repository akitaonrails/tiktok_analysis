package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10DG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MRGuideOpenPushPermissionHandler$onResume$1", f = "MRGuideOpenPushPermissionHandler.kt", l = {}, m = "invokeSuspend")
public final class C10DG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C19208510Ct LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10DG(boolean z, C19208510Ct c19208510Ct, Context context, InterfaceC1364105Vn<? super C10DG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c19208510Ct;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10DG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MRGuideOpenPushPermissionHandler@c83f.onResume$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.10eQ r5 = X.C19296410eQ.LIZIZ
            kotlin.jvm.internal.AwS79S0210000_28 r4 = new kotlin.jvm.internal.AwS79S0210000_28
            boolean r3 = r7.LL
            X.10Ct r2 = r7.LLILLJJLI
            android.content.Context r1 = r7.LLILLL
            r0 = 0
            r4.<init>(r3, r2, r1, r0)
            java.lang.String r1 = "im_push,1,im_push_select,0,im_msg_req_push,1"
            r0 = 1
            com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp r1 = r5.batchSetPushSettingItems(r1, r0, r4)
            boolean r0 = r7.LL
            if (r0 != 0) goto L49
            X.10Ct r2 = r7.LLILLJJLI
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r1.updatedSwitches
            android.content.Context r0 = r7.LLILLL
            r2.getClass()
            boolean r0 = X.C19208510Ct.LIZIZ(r0, r1)
            if (r0 != 0) goto L49
            X.0ZcA r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils r1 = X.C903320ZcA.LIZ()
            if (r1 == 0) goto L43
            android.content.Context r0 = r7.LLILLL
            r1.LIZIZ(r0)
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L49:
            X.10Ct r1 = r7.LLILLJJLI
            android.content.Context r0 = r7.LLILLL
            r1.getClass()
            X.C19208510Ct.LIZJ(r0)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10DG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
