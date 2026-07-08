package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1586890rOh {
    public static final EnumC1586890rOh HISTORY;
    public static final EnumC1586890rOh HISTORY_UNVIEWED;
    public static final EnumC1586890rOh HISTORY_VIEWED;
    public static final /* synthetic */ EnumC1586890rOh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1586890rOh SORT;
    public static final EnumC1586890rOh UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1586890rOh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1586890rOh enumC1586890rOh = new EnumC1586890rOh("UNKNOWN", 0, 0);
        UNKNOWN = enumC1586890rOh;
        EnumC1586890rOh enumC1586890rOh2 = new EnumC1586890rOh("SORT", 1, 1);
        SORT = enumC1586890rOh2;
        EnumC1586890rOh enumC1586890rOh3 = new EnumC1586890rOh("HISTORY", 2, 2);
        HISTORY = enumC1586890rOh3;
        EnumC1586890rOh enumC1586890rOh4 = new EnumC1586890rOh("HISTORY_UNVIEWED", 3, 3);
        HISTORY_UNVIEWED = enumC1586890rOh4;
        EnumC1586890rOh enumC1586890rOh5 = new EnumC1586890rOh("HISTORY_VIEWED", 4, 4);
        HISTORY_VIEWED = enumC1586890rOh5;
        EnumC1586890rOh[] enumC1586890rOhArr = {enumC1586890rOh, enumC1586890rOh2, enumC1586890rOh3, enumC1586890rOh4, enumC1586890rOh5};
        LLILLJJLI = enumC1586890rOhArr;
        LLILLL = new C2254308sP(enumC1586890rOhArr);
    }

    public static EnumC1586890rOh[] values() {
        return (EnumC1586890rOh[]) LLILLJJLI.clone();
    }

    public final int getDataLevel() {
        return this.LL;
    }

    public static EnumC1586890rOh valueOf(String str) {
        return (EnumC1586890rOh) C08FF.LIZ(EnumC1586890rOh.class, str);
    }

    public EnumC1586890rOh(String str, int i, int i2) {
        this.LL = i2;
    }
}
