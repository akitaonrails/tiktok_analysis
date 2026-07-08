package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1Bqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217651Bqt {
    public final CopyOnWriteArrayList<InterfaceC2217711Bqz> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(InterfaceC1546650qLn interfaceC1546650qLn, Function2 function2) {
        if ((interfaceC1546650qLn instanceof InterfaceC1546650qLn) && interfaceC1546650qLn != null) {
            Iterator<InterfaceC2217711Bqz> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                function2.invoke(it2.next(), interfaceC1546650qLn);
            }
        }
    }
}
