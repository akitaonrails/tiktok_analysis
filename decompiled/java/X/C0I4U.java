package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0I4U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4U {
    /* JADX WARN: Multi-variable type inference failed */
    public static C460810I5f LIZ(C0I4X c0i4x, C869590Y9l c869590Y9l) {
        Iterator<InterfaceC460500I4a> it2 = c0i4x.LIZ().iterator();
        while (it2.hasNext()) {
            C0I3K<C460810I5f> c0i3kLIZ = it2.next().LIZ(c869590Y9l);
            if (c0i3kLIZ instanceof C0I3O) {
                return (C460810I5f) ((C0I3O) c0i3kLIZ).LIZ;
            }
        }
        return new C460810I5f(null, null, null, 63);
    }
}
