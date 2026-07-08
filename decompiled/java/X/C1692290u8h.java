package X;

/* JADX INFO: renamed from: X.0u8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692290u8h<T> {
    public static final /* synthetic */ int LJ = 0;
    public final T LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final String LIZLLL;

    public final C1692270u8f<T> LIZ(int i) {
        int i2 = this.LIZJ;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            C1681000tqU.LIZJ("Item.end should be set first");
        }
        return new C1692270u8f<>(this.LIZ, this.LIZIZ, i, this.LIZLLL);
    }

    public C1692290u8h(T t, int i, int i2, String str) {
        this.LIZ = t;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
    }

    public /* synthetic */ C1692290u8h(Object obj, int i, int i2, String str, int i3) {
        this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
    }
}
