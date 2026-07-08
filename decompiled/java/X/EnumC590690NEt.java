package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590690NEt {
    public static final EnumC590690NEt BY_AGGREGATION;
    public static final EnumC590690NEt BY_BITRATE;
    public static final EnumC590690NEt BY_SIMILARITY;
    public static final C590700NEu Companion;
    public static final /* synthetic */ EnumC590690NEt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC590690NEt NO_SORT;
    public static final EnumC590690NEt RANDOM;
    public final int LL;

    public static InterfaceC2044707zh<EnumC590690NEt> getEntries() {
        return LLILLL;
    }

    public static final EnumC590690NEt parse(int i) {
        Companion.getClass();
        return C590700NEu.LIZ(i);
    }

    static {
        EnumC590690NEt enumC590690NEt = new EnumC590690NEt("NO_SORT", 0, 0);
        NO_SORT = enumC590690NEt;
        EnumC590690NEt enumC590690NEt2 = new EnumC590690NEt("RANDOM", 1, 1);
        RANDOM = enumC590690NEt2;
        EnumC590690NEt enumC590690NEt3 = new EnumC590690NEt("BY_BITRATE", 2, 2);
        BY_BITRATE = enumC590690NEt3;
        EnumC590690NEt enumC590690NEt4 = new EnumC590690NEt("BY_SIMILARITY", 3, 3);
        BY_SIMILARITY = enumC590690NEt4;
        EnumC590690NEt enumC590690NEt5 = new EnumC590690NEt("BY_AGGREGATION", 4, 4);
        BY_AGGREGATION = enumC590690NEt5;
        EnumC590690NEt[] enumC590690NEtArr = {enumC590690NEt, enumC590690NEt2, enumC590690NEt3, enumC590690NEt4, enumC590690NEt5};
        LLILLJJLI = enumC590690NEtArr;
        LLILLL = new C2254308sP(enumC590690NEtArr);
        Companion = new C590700NEu();
    }

    public static EnumC590690NEt[] values() {
        return (EnumC590690NEt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC590690NEt valueOf(String str) {
        return (EnumC590690NEt) C08FF.LIZ(EnumC590690NEt.class, str);
    }

    public EnumC590690NEt(String str, int i, int i2) {
        this.LL = i2;
    }
}
