package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC651030PgD {
    public static final EnumC651030PgD DO_NOTHING;
    public static final /* synthetic */ EnumC651030PgD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC651030PgD PAUSE_OTHER;
    public static final EnumC651030PgD STOP_OTHER;

    public static InterfaceC2044707zh<EnumC651030PgD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC651030PgD enumC651030PgD = new EnumC651030PgD("STOP_OTHER", 0);
        STOP_OTHER = enumC651030PgD;
        EnumC651030PgD enumC651030PgD2 = new EnumC651030PgD("PAUSE_OTHER", 1);
        PAUSE_OTHER = enumC651030PgD2;
        EnumC651030PgD enumC651030PgD3 = new EnumC651030PgD("DO_NOTHING", 2);
        DO_NOTHING = enumC651030PgD3;
        EnumC651030PgD[] enumC651030PgDArr = {enumC651030PgD, enumC651030PgD2, enumC651030PgD3};
        LL = enumC651030PgDArr;
        LLILLJJLI = new C2254308sP(enumC651030PgDArr);
    }

    public static EnumC651030PgD[] values() {
        return (EnumC651030PgD[]) LL.clone();
    }

    public static EnumC651030PgD valueOf(String str) {
        return (EnumC651030PgD) C08FF.LIZ(EnumC651030PgD.class, str);
    }

    public EnumC651030PgD(String str, int i) {
    }
}
