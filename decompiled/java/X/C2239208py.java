package X;

/* JADX INFO: renamed from: X.08py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2239208py {
    public static final String LIZ(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String LIZIZ(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Object c098200Yq;
        if (interfaceC1364105Vn instanceof C2252621DEu) {
            return interfaceC1364105Vn.toString();
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC1364105Vn);
            sbLIZ.append('@');
            sbLIZ.append(LIZ(interfaceC1364105Vn));
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(interfaceC1364105Vn.getClass().getName());
            sbLIZ2.append('@');
            sbLIZ2.append(LIZ(interfaceC1364105Vn));
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return (String) c098200Yq;
    }
}
