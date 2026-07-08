package X;

/* JADX INFO: renamed from: X.00C3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00C3 {
    public static C00C1 LIZ(Object obj) {
        if (obj instanceof C00C1) {
            return (C00C1) obj;
        }
        if (obj == null) {
            return new C00C1(null);
        }
        return new C00C1(obj);
    }
}
