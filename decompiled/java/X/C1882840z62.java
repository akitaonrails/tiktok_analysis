package X;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0z62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882840z62 {
    public static final C1882840z62 LIZ = new C1882840z62();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1882850z63());

    public static final InterfaceC1883030z6L LIZ(String str) {
        boolean z;
        Reference reference;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (reference = (Reference) ((ConcurrentHashMap) LIZIZ.getValue()).get(str)) == null) {
            return null;
        }
        return (InterfaceC1883030z6L) reference.get();
    }

    public static void LIZIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        ((ConcurrentHashMap) LIZIZ.getValue()).remove(str);
    }
}
