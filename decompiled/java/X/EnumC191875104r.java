package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.104r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC191875104r {
    public static final EnumC191875104r ALL;
    public static final /* synthetic */ EnumC191875104r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC191875104r PROMPT;
    public static final EnumC191875104r RESTRICTION;
    public static final EnumC191875104r SETTING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC191875104r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC191875104r enumC191875104r = new EnumC191875104r("ALL", 0, null);
        ALL = enumC191875104r;
        EnumC191875104r enumC191875104r2 = new EnumC191875104r("SETTING", 1, "setting");
        SETTING = enumC191875104r2;
        EnumC191875104r enumC191875104r3 = new EnumC191875104r("RESTRICTION", 2, "restriction");
        RESTRICTION = enumC191875104r3;
        EnumC191875104r enumC191875104r4 = new EnumC191875104r("PROMPT", 3, "prompt");
        PROMPT = enumC191875104r4;
        EnumC191875104r[] enumC191875104rArr = {enumC191875104r, enumC191875104r2, enumC191875104r3, enumC191875104r4};
        LLILLJJLI = enumC191875104rArr;
        LLILLL = new C2254308sP(enumC191875104rArr);
    }

    public static EnumC191875104r[] values() {
        return (EnumC191875104r[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC191875104r valueOf(String str) {
        return (EnumC191875104r) C08FF.LIZ(EnumC191875104r.class, str);
    }

    public EnumC191875104r(String str, int i, String str2) {
        this.LL = str2;
    }
}
