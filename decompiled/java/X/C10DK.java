package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10DK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler.MRGuideOpenPushPermissionHandler$tryShowMessageRequestPushTurnOnGuidance$2$onDismissAfterShown$2", f = "MRGuideOpenPushPermissionHandler.kt", l = {}, m = "invokeSuspend")
public final class C10DK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19208510Ct LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10DK(C19208510Ct c19208510Ct, InterfaceC1364105Vn<? super C10DK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19208510Ct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10DK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MRGuideOpenPushPermissionHandler@c83f.tryShowMessageRequestPushTurnOnGuidance$2$onDismissAfterShown$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BatchUpdatePushSwitchesResp batchUpdatePushSwitchesRespLIZ = C612100Nzc.LIZ(C19296410eQ.LIZIZ, "in_app_im_push,1,in_app_im_msg_req_push,1", false, 4);
        C19208510Ct c19208510Ct = this.LL;
        Map<String, Integer> map = batchUpdatePushSwitchesRespLIZ.updatedSwitches;
        c19208510Ct.getClass();
        c19208510Ct.LIZJ = C19208510Ct.LIZ(map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MRGuideOpenPushPermissionHandler@c83f.tryShowMessageRequestPushTurnOnGuidance$2$onDismissAfterShown$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
