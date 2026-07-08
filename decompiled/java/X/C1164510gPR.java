package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixPostEvent;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0gPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164510gPR implements InterfaceC1165510gR3 {
    public final IRavenEventAbility LIZ;
    public final C1162700gMW LIZIZ;
    public final InterfaceC1164530gPT LIZJ;
    public final IEventCenter LIZLLL = AnonymousClass0378.LIZ();

    @Override // X.InterfaceC1165510gR3
    public final void LIZ(String str) {
        this.LIZ.Lp0(str, this.LIZIZ);
        this.LIZLLL.LIZLLL(str, this.LIZJ);
    }

    @Override // X.InterfaceC1165510gR3
    public final void LIZIZ(String str) {
        this.LIZ.Fk2(str, this.LIZIZ.LIZIZ);
        this.LIZLLL.LIZJ(str, this.LIZJ);
    }

    @Override // X.InterfaceC1165510gR3
    public final void LIZJ(BaseMixPostEvent baseMixPostEvent, String str) {
        String name;
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publishEvent: eventName = ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(C1741890vQh.LJIIIIZZ(baseMixPostEvent));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        IRavenEventAbility iRavenEventAbility = this.LIZ;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        try {
            C089E c089e = new C089E(baseMixPostEvent.getClass().getDeclaredFields());
            while (c089e.hasNext()) {
                Field field = (Field) c089e.next();
                field.setAccessible(true);
                C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
                if (c09ct == null || (name = c09ct.value()) == null) {
                    name = field.getName();
                }
                javaOnlyMap.put(name, field.get(baseMixPostEvent));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        iRavenEventAbility.dZ1(new RavenEvent(str, -1L, javaOnlyMap));
        this.LIZLLL.LIZ(str, C1741890vQh.LJIIIIZZ(baseMixPostEvent));
    }

    public C1164510gPR(IRavenEventAbility iRavenEventAbility, C1162700gMW c1162700gMW, InterfaceC1164530gPT interfaceC1164530gPT) {
        this.LIZ = iRavenEventAbility;
        this.LIZIZ = c1162700gMW;
        this.LIZJ = interfaceC1164530gPT;
    }
}
