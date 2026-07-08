package X;

/* JADX INFO: renamed from: X.0Q8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public enum EnumC665490Q8l {
    ALL_ON_UI(0),
    MOST_ON_TASM(1),
    PART_ON_LAYOUT(2),
    MULTI_THREADS(3);

    public final int LL;

    public int id() {
        return this.LL;
    }

    public static EnumC665490Q8l valueOf(String str) {
        return (EnumC665490Q8l) C08FF.LIZ(EnumC665490Q8l.class, str);
    }

    EnumC665490Q8l(int i) {
        this.LL = i;
    }
}
