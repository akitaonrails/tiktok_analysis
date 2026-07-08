package X;

/* JADX INFO: renamed from: X.0WMX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMX {
    public static C0WMW LIZ() {
        ThreadLocal<C0WMW> threadLocal = C0WMW.LIZIZ;
        C0WMW c0wmw = threadLocal.get();
        if (c0wmw != null) {
            return c0wmw;
        }
        C0WMW c0wmw2 = new C0WMW();
        threadLocal.set(c0wmw2);
        return c0wmw2;
    }
}
