package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigPayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelManager$deserializePayload$2", f = "EmergencyChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C2155208cQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EmergencyConfigPayload>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2155208cQ(String str, InterfaceC1364105Vn<? super C2155208cQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2155208cQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EmergencyConfigPayload emergencyConfigPayload;
        C1C7U.LIZ("EmergencyChannelManager@f1.deserializePayload$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            emergencyConfigPayload = (EmergencyConfigPayload) C08JS.LIZ(this.LL, EmergencyConfigPayload.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deserializePayload: payload format error: ");
            sbLIZ.append(e);
            C2155608cU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            emergencyConfigPayload = null;
        }
        C1C7U.LIZIZ("EmergencyChannelManager@f1.deserializePayload$2");
        return emergencyConfigPayload;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EmergencyConfigPayload> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
