package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NEW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEW {
    public static final C0NEW BACK;
    public static final C0NEW DB;
    public static final C0NEW DB_UID_EXT;
    public static final C0NEW GOLDEN_CACHE;
    public static final C0NEW HIGH_REC;
    public static final C0NEW LAST_BACK_UP;
    public static final /* synthetic */ C0NEW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NEW OFFLINE_CACHE;
    public static final C0NEW ORIGIN;
    public static final C0NEW USING_TEMP;
    public static final C0NEW V3;
    public final int LL;

    public static InterfaceC2044707zh<C0NEW> getEntries() {
        return LLILLL;
    }

    static {
        C0NEW c0new = new C0NEW("ORIGIN", 0, 1);
        ORIGIN = c0new;
        C0NEW c0new2 = new C0NEW("BACK", 1, 2);
        BACK = c0new2;
        C0NEW c0new3 = new C0NEW("V3", 2, 3);
        V3 = c0new3;
        C0NEW c0new4 = new C0NEW("HIGH_REC", 3, 4);
        HIGH_REC = c0new4;
        C0NEW c0new5 = new C0NEW("USING_TEMP", 4, 5);
        USING_TEMP = c0new5;
        C0NEW c0new6 = new C0NEW("LAST_BACK_UP", 5, 6);
        LAST_BACK_UP = c0new6;
        C0NEW c0new7 = new C0NEW("DB", 6, 7);
        DB = c0new7;
        C0NEW c0new8 = new C0NEW("GOLDEN_CACHE", 7, 8);
        GOLDEN_CACHE = c0new8;
        C0NEW c0new9 = new C0NEW("OFFLINE_CACHE", 8, 9);
        OFFLINE_CACHE = c0new9;
        C0NEW c0new10 = new C0NEW("DB_UID_EXT", 9, 10);
        DB_UID_EXT = c0new10;
        C0NEW[] c0newArr = {c0new, c0new2, c0new3, c0new4, c0new5, c0new6, c0new7, c0new8, c0new9, c0new10};
        LLILLJJLI = c0newArr;
        LLILLL = new C2254308sP(c0newArr);
    }

    public static C0NEW[] values() {
        return (C0NEW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NEW valueOf(String str) {
        return (C0NEW) C08FF.LIZ(C0NEW.class, str);
    }

    public C0NEW(String str, int i, int i2) {
        this.LL = i2;
    }
}
