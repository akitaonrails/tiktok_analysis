package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAY {
    public static final C0YAY COLUMN_CONV_ID;
    public static final C0YAY COLUMN_MAX_INDEX;
    public static final C0YAY COLUMN_MAX_REGION_ID;
    public static final C0YAY COLUMN_MIN_INDEX;
    public static final C0YAY COLUMN_MIN_REGION_ID;
    public static final C0YAY COLUMN_PREV_INDEX;
    public static final /* synthetic */ C0YAY[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0YAY> getEntries() {
        return LLILZ;
    }

    static {
        C0YAY c0yay = new C0YAY("COLUMN_CONV_ID", 0, "conv_id", "TEXT");
        COLUMN_CONV_ID = c0yay;
        C0YAY c0yay2 = new C0YAY("COLUMN_PREV_INDEX", 1, "prev_index", "INTEGER");
        COLUMN_PREV_INDEX = c0yay2;
        C0YAY c0yay3 = new C0YAY("COLUMN_MIN_INDEX", 2, "min_index", "INTEGER");
        COLUMN_MIN_INDEX = c0yay3;
        C0YAY c0yay4 = new C0YAY("COLUMN_MAX_INDEX", 3, "max_index", "INTEGER");
        COLUMN_MAX_INDEX = c0yay4;
        C0YAY c0yay5 = new C0YAY("COLUMN_MIN_REGION_ID", 4, "min_region_id", "INTEGER");
        COLUMN_MIN_REGION_ID = c0yay5;
        C0YAY c0yay6 = new C0YAY("COLUMN_MAX_REGION_ID", 5, "max_region_id", "INTEGER");
        COLUMN_MAX_REGION_ID = c0yay6;
        C0YAY[] c0yayArr = {c0yay, c0yay2, c0yay3, c0yay4, c0yay5, c0yay6};
        LLILLL = c0yayArr;
        LLILZ = new C2254308sP(c0yayArr);
    }

    public static C0YAY[] values() {
        return (C0YAY[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static C0YAY valueOf(String str) {
        return (C0YAY) C08FF.LIZ(C0YAY.class, str);
    }

    public C0YAY(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
