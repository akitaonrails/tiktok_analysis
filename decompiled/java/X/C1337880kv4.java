package X;

/* JADX INFO: renamed from: X.0kv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337880kv4 {
    public static final C1337880kv4 LIZJ = new C1337880kv4(0.0f, 1);
    public final float LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1337880kv4)) {
            return false;
        }
        C1337880kv4 c1337880kv4 = (C1337880kv4) obj;
        return Float.compare(this.LIZ, c1337880kv4.LIZ) == 0 && this.LIZIZ == c1337880kv4.LIZIZ;
    }

    public C1337880kv4(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
    }
}
