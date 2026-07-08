package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0poh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526130poh extends C09AY implements Function0<List<InterfaceC1526120pog<EnumC1526160pok>>> {
    public C1526130poh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1526120pog<EnumC1526160pok>> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1526120pog<EnumC1526160pok>() { // from class: X.0poj
            @Override // X.InterfaceC1526120pog
            public final boolean LIZ(EnumC1526160pok enumC1526160pok) {
                if (enumC1526160pok == EnumC1526160pok.HttpPoll) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1526120pog
            public final void LIZIZ(C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
                C1527890prX.LIZLLL("received http poll cmd, do http poll");
                ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(EnumC1526180pom.HttpPollCtrl.getValue(), true);
            }
        });
        arrayList.add(new InterfaceC1526120pog<EnumC1526160pok>() { // from class: X.0poi
            @Override // X.InterfaceC1526120pog
            public final boolean LIZ(EnumC1526160pok enumC1526160pok) {
                if (enumC1526160pok == EnumC1526160pok.NeedAck) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1526120pog
            public final void LIZIZ(C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
                C1527890prX.LIZLLL("received ack poll cmd, do http poll");
                ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(EnumC1526180pom.DataAck.getValue(), false);
            }
        });
        return arrayList;
    }
}
