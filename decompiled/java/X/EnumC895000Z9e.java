package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895000Z9e {
    public static final /* synthetic */ EnumC895000Z9e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895000Z9e NUDGE;
    public static final EnumC895000Z9e NUDGE_BACK;
    public static final EnumC895000Z9e STREAK;
    public static final EnumC895000Z9e STREAK_BACK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC895000Z9e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895000Z9e enumC895000Z9e = new EnumC895000Z9e("NUDGE", 0, "nudge");
        NUDGE = enumC895000Z9e;
        EnumC895000Z9e enumC895000Z9e2 = new EnumC895000Z9e("NUDGE_BACK", 1, "nudge_back");
        NUDGE_BACK = enumC895000Z9e2;
        EnumC895000Z9e enumC895000Z9e3 = new EnumC895000Z9e("STREAK", 2, "spark");
        STREAK = enumC895000Z9e3;
        EnumC895000Z9e enumC895000Z9e4 = new EnumC895000Z9e("STREAK_BACK", 3, "spark_back");
        STREAK_BACK = enumC895000Z9e4;
        EnumC895000Z9e[] enumC895000Z9eArr = {enumC895000Z9e, enumC895000Z9e2, enumC895000Z9e3, enumC895000Z9e4};
        LLILLJJLI = enumC895000Z9eArr;
        LLILLL = new C2254308sP(enumC895000Z9eArr);
    }

    public static EnumC895000Z9e[] values() {
        return (EnumC895000Z9e[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC895000Z9e valueOf(String str) {
        return (EnumC895000Z9e) C08FF.LIZ(EnumC895000Z9e.class, str);
    }

    public EnumC895000Z9e(String str, int i, String str2) {
        this.LL = str2;
    }
}
