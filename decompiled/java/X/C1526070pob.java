package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526070pob extends C09AY implements Function0<List<InterfaceC1526120pog<EnumC1527170pqN>>> {
    public C1526070pob() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1526120pog<EnumC1527170pqN>> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1526120pog<EnumC1527170pqN>() { // from class: X.0poU
            @Override // X.InterfaceC1526120pog
            public final boolean LIZ(EnumC1527170pqN enumC1527170pqN) {
                if (enumC1527170pqN == EnumC1527170pqN.ACK) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1526120pog
            public final void LIZIZ(C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
                InterfaceC1525900poK interfaceC1525900poK = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
                for (C1527020pq8 c1527020pq8 : list) {
                    try {
                        interfaceC1525900poK.LIZJ(c1527020pq8.sync_id.longValue(), c1527020pq8.new_cursor.longValue());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                ((InterfaceC1526020poW) C808470VnZ.LIZ(InterfaceC1526020poW.class)).LJJLL();
            }
        });
        return arrayList;
    }
}
