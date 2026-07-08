package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513810KDb {
    public static final /* synthetic */ EnumC513810KDb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC513810KDb PAY_ENDED;
    public static final EnumC513810KDb PAY_INPROGRESS;
    public static final EnumC513810KDb PAY_NOT_STARTED;

    public static InterfaceC2044707zh<EnumC513810KDb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC513810KDb enumC513810KDb = new EnumC513810KDb("PAY_NOT_STARTED", 0);
        PAY_NOT_STARTED = enumC513810KDb;
        EnumC513810KDb enumC513810KDb2 = new EnumC513810KDb("PAY_INPROGRESS", 1);
        PAY_INPROGRESS = enumC513810KDb2;
        EnumC513810KDb enumC513810KDb3 = new EnumC513810KDb("PAY_ENDED", 2);
        PAY_ENDED = enumC513810KDb3;
        EnumC513810KDb[] enumC513810KDbArr = {enumC513810KDb, enumC513810KDb2, enumC513810KDb3};
        LL = enumC513810KDbArr;
        LLILLJJLI = new C2254308sP(enumC513810KDbArr);
    }

    public static EnumC513810KDb[] values() {
        return (EnumC513810KDb[]) LL.clone();
    }

    public static EnumC513810KDb valueOf(String str) {
        return (EnumC513810KDb) C08FF.LIZ(EnumC513810KDb.class, str);
    }

    public EnumC513810KDb(String str, int i) {
    }
}
