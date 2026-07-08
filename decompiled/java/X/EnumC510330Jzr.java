package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC510330Jzr {
    public static final EnumC510330Jzr EMOTE;
    public static final EnumC510330Jzr GENERAL;
    public static final /* synthetic */ EnumC510330Jzr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC510330Jzr PRIVILEGE;
    public static final EnumC510330Jzr SUBINFO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC510330Jzr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC510330Jzr enumC510330Jzr = new EnumC510330Jzr("SUBINFO", 0, "get_sub_info");
        SUBINFO = enumC510330Jzr;
        EnumC510330Jzr enumC510330Jzr2 = new EnumC510330Jzr("EMOTE", 1, "get_emotes");
        EMOTE = enumC510330Jzr2;
        EnumC510330Jzr enumC510330Jzr3 = new EnumC510330Jzr("PRIVILEGE", 2, "privilege_all_detail");
        PRIVILEGE = enumC510330Jzr3;
        EnumC510330Jzr enumC510330Jzr4 = new EnumC510330Jzr("GENERAL", 3, "general");
        GENERAL = enumC510330Jzr4;
        EnumC510330Jzr[] enumC510330JzrArr = {enumC510330Jzr, enumC510330Jzr2, enumC510330Jzr3, enumC510330Jzr4};
        LLILLJJLI = enumC510330JzrArr;
        LLILLL = new C2254308sP(enumC510330JzrArr);
    }

    public static EnumC510330Jzr[] values() {
        return (EnumC510330Jzr[]) LLILLJJLI.clone();
    }

    public final String getEvent() {
        return this.LL;
    }

    public static EnumC510330Jzr valueOf(String str) {
        return (EnumC510330Jzr) C08FF.LIZ(EnumC510330Jzr.class, str);
    }

    public EnumC510330Jzr(String str, int i, String str2) {
        this.LL = str2;
    }
}
