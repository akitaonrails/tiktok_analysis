package X;

/* JADX INFO: renamed from: X.137H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C137H<T> {
    public abstract boolean LIZ(T t, T t2);

    public abstract int LIZIZ(T t);

    public final boolean LIZJ(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return LIZ(t, t2);
        }
        return false;
    }
}
