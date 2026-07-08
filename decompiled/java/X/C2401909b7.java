package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$generateC2PAInfo$6$1", f = "C2PAAIGCManager.kt", l = {}, m = "invokeSuspend")
public final class C2401909b7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IEvent>, Object> {
    public final /* synthetic */ AIGCInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401909b7(AIGCInfo aIGCInfo, InterfaceC1364105Vn<? super C2401909b7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2401909b7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.generateC2PAInfo$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2037007yS c2037007yS = new C2037007yS(this.LL.getBucketTaskId());
        C1440005kM.LIZIZ(c2037007yS);
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.generateC2PAInfo$6$1");
        return c2037007yS;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IEvent> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
