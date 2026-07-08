package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19370710qP {
    public final HashMap<EnumC19359510ob, List<InterfaceC19370810qQ>> LIZ = new HashMap<>();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 962));

    public final synchronized void LIZ(InterfaceC19370810qQ interfaceC19370810qQ) {
        EnumC19359510ob enumC19359510obW = interfaceC19370810qQ.W();
        HashMap<EnumC19359510ob, List<InterfaceC19370810qQ>> map = this.LIZ;
        List<InterfaceC19370810qQ> arrayList = map.get(enumC19359510obW);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        map.put(enumC19359510obW, arrayList);
        List<InterfaceC19370810qQ> list = this.LIZ.get(enumC19359510obW);
        if (list != null) {
            list.add(interfaceC19370810qQ);
        }
    }

    public final synchronized void LIZIZ(EnumC1998007sA enumC1998007sA) {
        List list = (List) ((Map) this.LIZIZ.getValue()).get(enumC1998007sA);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (InterfaceC19370810qQ interfaceC19370810qQ : (ArrayList) C15438062q.LJIJJLI(this.LIZ.values())) {
            if (list.contains(interfaceC19370810qQ.W())) {
                interfaceC19370810qQ.pi(4);
            } else {
                interfaceC19370810qQ.Fd();
                interfaceC19370810qQ.pi(0);
            }
        }
    }
}
