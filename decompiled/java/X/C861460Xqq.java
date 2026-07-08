package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.conflict.TakoAIVideoVoiceCallConflictHandler$requestCapabilities$result$1$onCapabilityPreempted$1", f = "TakoAIVideoVoiceCallConflictHandler.kt", l = {}, m = "invokeSuspend")
public final class C861460Xqq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C861500Xqu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861460Xqq(C861500Xqu c861500Xqu, InterfaceC1364105Vn<? super C861460Xqq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c861500Xqu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861460Xqq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoVoiceCallConflictHandler@e340.requestCapabilities$result$1$onCapabilityPreempted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZ.isAdded()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoVoiceCallConflictHandler@e340.requestCapabilities$result$1$onCapabilityPreempted$1");
            return unit;
        }
        this.LL.LIZIZ(false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoVoiceCallConflictHandler@e340.requestCapabilities$result$1$onCapabilityPreempted$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
