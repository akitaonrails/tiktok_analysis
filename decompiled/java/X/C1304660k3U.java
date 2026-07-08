package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0k3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304660k3U extends AbstractC1336080ksA {
    public static final C1304660k3U LIZ = new C1304660k3U();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(57));

    @Override // X.AbstractC1336080ksA
    public final int LIZJ() {
        return 0;
    }

    @Override // X.AbstractC1336080ksA
    public final int LIZLLL() {
        return 1000000;
    }

    @Override // X.AbstractC1336080ksA
    public final void LJI(int i, String str, Throwable th, Map map) {
    }

    @Override // X.AbstractC1336080ksA, X.InterfaceC076000Qc
    public final void LIZ(int i, String str, Map<String, String> map) {
        Object next;
        Iterator it2 = ((List) LIZIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((AbstractC1336080ksA) next).LJFF(i)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1336080ksA abstractC1336080ksA = (AbstractC1336080ksA) next;
        if (abstractC1336080ksA != null) {
            abstractC1336080ksA.LIZ(i, str, map);
        } else {
            C1304670k3V.LIZ.LJII(i, str, null, map);
        }
    }

    @Override // X.AbstractC1336080ksA, X.InterfaceC076000Qc
    public final void LIZIZ(int i, String str, Throwable th, Map<String, String> map) {
        Object next;
        Iterator it2 = ((List) LIZIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((AbstractC1336080ksA) next).LJFF(i)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1336080ksA abstractC1336080ksA = (AbstractC1336080ksA) next;
        if (abstractC1336080ksA != null) {
            abstractC1336080ksA.LIZIZ(i, str, th, map);
        } else {
            C1304670k3V.LIZ.LJII(i, str, th, map);
        }
    }
}
