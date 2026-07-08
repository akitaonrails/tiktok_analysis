package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1123500fLI {
    public static final EnumC1123500fLI AVOID_RULES;
    public static final EnumC1123500fLI FANS_CLUB_LIMITED;
    public static final EnumC1123500fLI GIFT_NOT_SUPPORT;
    public static final EnumC1123500fLI INCENTIVE_TASK_INVALID;
    public static final /* synthetic */ EnumC1123500fLI[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1123500fLI MULTI_DISPLAY_CONTROL;
    public static final EnumC1123500fLI NOTIFY_CONTROL;
    public static final EnumC1123500fLI NO_RETENTION_CONSUMPTION_TASK;
    public static final EnumC1123500fLI NO_RETENTION_TASK;
    public static final EnumC1123500fLI ORIENTATION_NOT_SUPPORT;
    public static final EnumC1123500fLI SPECIAL_LAYOUT_CONFLICT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1123500fLI> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1123500fLI enumC1123500fLI = new EnumC1123500fLI("GIFT_NOT_SUPPORT", 0, 1, "not support this gift");
        GIFT_NOT_SUPPORT = enumC1123500fLI;
        EnumC1123500fLI enumC1123500fLI2 = new EnumC1123500fLI("ORIENTATION_NOT_SUPPORT", 1, 2, "orientation unsupport");
        ORIENTATION_NOT_SUPPORT = enumC1123500fLI2;
        EnumC1123500fLI enumC1123500fLI3 = new EnumC1123500fLI("NOTIFY_CONTROL", 2, 3, "notify control");
        NOTIFY_CONTROL = enumC1123500fLI3;
        EnumC1123500fLI enumC1123500fLI4 = new EnumC1123500fLI("MULTI_DISPLAY_CONTROL", 3, 4, "multi times show");
        MULTI_DISPLAY_CONTROL = enumC1123500fLI4;
        EnumC1123500fLI enumC1123500fLI5 = new EnumC1123500fLI("SPECIAL_LAYOUT_CONFLICT", 4, 5, "big party style");
        SPECIAL_LAYOUT_CONFLICT = enumC1123500fLI5;
        EnumC1123500fLI enumC1123500fLI6 = new EnumC1123500fLI("AVOID_RULES", 5, 6, "rule avoid");
        AVOID_RULES = enumC1123500fLI6;
        EnumC1123500fLI enumC1123500fLI7 = new EnumC1123500fLI("FANS_CLUB_LIMITED", 6, 7, "fans club gift limited");
        FANS_CLUB_LIMITED = enumC1123500fLI7;
        EnumC1123500fLI enumC1123500fLI8 = new EnumC1123500fLI("NO_RETENTION_TASK", 7, 8, "no retention task");
        NO_RETENTION_TASK = enumC1123500fLI8;
        EnumC1123500fLI enumC1123500fLI9 = new EnumC1123500fLI("NO_RETENTION_CONSUMPTION_TASK", 8, 9, "no retention consumption task");
        NO_RETENTION_CONSUMPTION_TASK = enumC1123500fLI9;
        EnumC1123500fLI enumC1123500fLI10 = new EnumC1123500fLI("INCENTIVE_TASK_INVALID", 9, 13, "incentive task invalid");
        INCENTIVE_TASK_INVALID = enumC1123500fLI10;
        EnumC1123500fLI[] enumC1123500fLIArr = {enumC1123500fLI, enumC1123500fLI2, enumC1123500fLI3, enumC1123500fLI4, enumC1123500fLI5, enumC1123500fLI6, enumC1123500fLI7, enumC1123500fLI8, enumC1123500fLI9, enumC1123500fLI10};
        LLILLL = enumC1123500fLIArr;
        LLILZ = new C2254308sP(enumC1123500fLIArr);
    }

    public static EnumC1123500fLI[] values() {
        return (EnumC1123500fLI[]) LLILLL.clone();
    }

    public final String getReason() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1123500fLI valueOf(String str) {
        return (EnumC1123500fLI) C08FF.LIZ(EnumC1123500fLI.class, str);
    }

    public EnumC1123500fLI(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
