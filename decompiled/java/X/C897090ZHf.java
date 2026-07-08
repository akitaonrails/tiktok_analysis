package X;

import Y.AComparatorS33S0000000_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897090ZHf {
    public final List<InterfaceC897100ZHg> LIZ;
    public final C823170WQx<Pair<EnumC897070ZHd, String>> LIZIZ = new C823170WQx<>();
    public C823170WQx<Pair<EnumC897070ZHd, InterfaceC1233004s4>> LIZJ = new C823170WQx<>();
    public final C823170WQx<Pair<EnumC897070ZHd, String>> LIZLLL = new C823170WQx<>();
    public final C823170WQx<EnumC897070ZHd> LJ = new C823170WQx<>();
    public final C823170WQx<Pair<EnumC897070ZHd, InterfaceC1233004s4>> LJFF = new C823170WQx<>();

    public C897090ZHf(List<? extends InterfaceC897100ZHg> list) {
        this.LIZ = C13LP.LJLLLL(new AComparatorS33S0000000_14(0), list);
    }

    public final Pair<EnumC897070ZHd, InterfaceC1233004s4> LIZ(String str) {
        Object next;
        C823170WQx<Pair<EnumC897070ZHd, InterfaceC1233004s4>> c823170WQx = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (Pair<EnumC897070ZHd, InterfaceC1233004s4> pair : c823170WQx) {
            Pair<EnumC897070ZHd, InterfaceC1233004s4> pair2 = pair;
            if (!this.LIZIZ.contains(new Pair(pair2.getFirst(), str)) && Intrinsics.LJFF(pair2.getSecond().LIZ(), str)) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int iOrdinal = ((EnumC897070ZHd) ((Pair) next).getFirst()).ordinal();
                do {
                    Object next2 = it2.next();
                    int iOrdinal2 = ((EnumC897070ZHd) ((Pair) next2).getFirst()).ordinal();
                    if (iOrdinal > iOrdinal2) {
                        next = next2;
                        iOrdinal = iOrdinal2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Pair) next;
    }
}
