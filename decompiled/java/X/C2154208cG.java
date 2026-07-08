package X;

import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigDomain;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelManager$registerByteSync$1", f = "EmergencyChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C2154208cG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C08NI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154208cG(C08NI c08ni, InterfaceC1364105Vn<? super C2154208cG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c08ni;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2154208cG(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmergencyChannelManager@f1.registerByteSync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!((Boolean) C2154408cI.LIZ.getValue()).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EmergencyChannelManager@f1.registerByteSync$1");
            return unit;
        }
        Map<EmergencyConfigDomain, C2155708cV> map = C08NF.LIZ;
        C08NF.LIZJ = this.LL;
        C596970NbD c596970NbD = C596970NbD.LIZIZ;
        EnumC1733330vCt enumC1733330vCt = EnumC1733330vCt.EMERGENCY_CONFIG_CHANNEL;
        C08NI c08ni = C08NF.LIZJ;
        if (c08ni == null) {
            c08ni = null;
        }
        c596970NbD.LIZ(enumC1733330vCt, c08ni);
        if (C2155408cS.LIZ() >= 1) {
            C793770VBv.LJII("emergency_bytesync_registered", null, null, null);
        }
        C23250099c.LIZLLL(C08NF.LIZIZ, null, null, new C2154308cH(null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EmergencyChannelManager@f1.registerByteSync$1");
        return unit2;
    }
}
