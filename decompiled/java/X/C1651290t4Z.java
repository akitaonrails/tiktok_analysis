package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import java.util.Map;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t4Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651290t4Z implements InterfaceC1651340t4e {
    public int LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 786));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 787));

    @Override // X.InterfaceC1651340t4e
    public final int LIZ(EnumC1651310t4b enumC1651310t4b, InterfaceC1651320t4c<?> interfaceC1651320t4c, InterfaceC1651320t4c<?> interfaceC1651320t4c2) {
        Map map;
        int iIntValue;
        int iIntValue2;
        int i = C1651300t4a.LIZ[enumC1651310t4b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                map = (Map) this.LIZJ.getValue();
            } else {
                throw new C1954807lC();
            }
        } else {
            map = (Map) this.LIZIZ.getValue();
        }
        Integer num = (Integer) map.get(interfaceC1651320t4c.getKey());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            iIntValue = this.LIZ;
            this.LIZ = iIntValue + 1;
        }
        Integer num2 = (Integer) map.get(interfaceC1651320t4c2.getKey());
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            iIntValue2 = this.LIZ;
            this.LIZ = iIntValue2 + 1;
        }
        return Intrinsics.LJI(iIntValue, iIntValue2);
    }
}
