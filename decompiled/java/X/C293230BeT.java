package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0BeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293230BeT {
    public final InterfaceC293220BeS LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ;

    public C293230BeT(InterfaceC293220BeS interfaceC293220BeS) {
        this.LIZ = interfaceC293220BeS;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LIZIZ = copyOnWriteArrayList;
        String[] strArrLIZ = interfaceC293220BeS.LIZ();
        if (strArrLIZ.length != 0) {
            C19719612Di.LJJII(copyOnWriteArrayList, strArrLIZ);
        }
    }

    public final void LIZ(List<String> list) {
        Set setLIZIZ = LIZIZ(list, new C293240BeU(this));
        if ((!setLIZIZ.isEmpty()) && setLIZIZ != null) {
            this.LIZIZ.addAll(setLIZIZ);
            this.LIZ.LIZIZ((String[]) this.LIZIZ.toArray(new String[0]));
        }
    }

    public final void LIZJ(List<String> list) {
        Set setLIZIZ = LIZIZ(list, new AwS583S0100000_4(this, 357));
        if ((!setLIZIZ.isEmpty()) && setLIZIZ != null) {
            this.LIZIZ.removeAll(setLIZIZ);
            this.LIZ.LIZIZ((String[]) this.LIZIZ.toArray(new String[0]));
        }
    }

    public static Set LIZIZ(List list, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }
}
