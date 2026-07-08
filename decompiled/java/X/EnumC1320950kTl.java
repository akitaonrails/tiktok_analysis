package X;

/* JADX INFO: renamed from: X.0kTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1320950kTl {
    FULL_FETCH(1),
    DISK_CACHE(2),
    ENCODED_MEMORY_CACHE(3),
    BITMAP_MEMORY_CACHE(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1320950kTl getMax(EnumC1320950kTl enumC1320950kTl, EnumC1320950kTl enumC1320950kTl2) {
        if (enumC1320950kTl.getValue() <= enumC1320950kTl2.getValue()) {
            return enumC1320950kTl2;
        }
        return enumC1320950kTl;
    }

    EnumC1320950kTl(int i) {
        this.LL = i;
    }
}
