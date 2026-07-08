package X;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0z5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882730z5r {
    public static final C1882730z5r LIZ = new C1882730z5r();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1882720z5q());

    public static final InterfaceC1881340z3c LIZ(String str) {
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
        return (InterfaceC1881340z3c) reference.get();
    }
}
