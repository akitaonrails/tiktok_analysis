package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1233700iD2 {
    public static final EnumC1233700iD2 DISCOVERY;
    public static final /* synthetic */ EnumC1233700iD2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1233700iD2 MANDATORY_GPPPA_2SV_FULLSHEET;
    public static final EnumC1233700iD2 MANDATORY_POPUP;
    public static final EnumC1233700iD2 NONMANDATORY_GPPPA_2SV_FULLSHEET;
    public static final EnumC1233700iD2 NONMANDATORY_GPPPA_2SV_PROFILE_POPUP;
    public static final EnumC1233700iD2 NONMANDATORY_GPPPA_2SV_PROFILE_WARNING;
    public static final EnumC1233700iD2 NUDGE_POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1233700iD2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1233700iD2 enumC1233700iD2 = new EnumC1233700iD2("DISCOVERY", 0, "discovery");
        DISCOVERY = enumC1233700iD2;
        EnumC1233700iD2 enumC1233700iD22 = new EnumC1233700iD2("MANDATORY_POPUP", 1, "mandatory_popup");
        MANDATORY_POPUP = enumC1233700iD22;
        EnumC1233700iD2 enumC1233700iD23 = new EnumC1233700iD2("NUDGE_POPUP", 2, "nudge_popup");
        NUDGE_POPUP = enumC1233700iD23;
        EnumC1233700iD2 enumC1233700iD24 = new EnumC1233700iD2("MANDATORY_GPPPA_2SV_FULLSHEET", 3, "mandatory_gpppa_2sv_fullsheet");
        MANDATORY_GPPPA_2SV_FULLSHEET = enumC1233700iD24;
        EnumC1233700iD2 enumC1233700iD25 = new EnumC1233700iD2("NONMANDATORY_GPPPA_2SV_FULLSHEET", 4, "nonmandatory_gpppa_2sv_fullsheet");
        NONMANDATORY_GPPPA_2SV_FULLSHEET = enumC1233700iD25;
        EnumC1233700iD2 enumC1233700iD26 = new EnumC1233700iD2("NONMANDATORY_GPPPA_2SV_PROFILE_POPUP", 5, "nonmandatory_gpppa_2sv_profile_popup");
        NONMANDATORY_GPPPA_2SV_PROFILE_POPUP = enumC1233700iD26;
        EnumC1233700iD2 enumC1233700iD27 = new EnumC1233700iD2("NONMANDATORY_GPPPA_2SV_PROFILE_WARNING", 6, "nonmandatory_gpppa_2sv_profile_warning");
        NONMANDATORY_GPPPA_2SV_PROFILE_WARNING = enumC1233700iD27;
        EnumC1233700iD2[] enumC1233700iD2Arr = {enumC1233700iD2, enumC1233700iD22, enumC1233700iD23, enumC1233700iD24, enumC1233700iD25, enumC1233700iD26, enumC1233700iD27};
        LLILLJJLI = enumC1233700iD2Arr;
        LLILLL = new C2254308sP(enumC1233700iD2Arr);
    }

    public static EnumC1233700iD2[] values() {
        return (EnumC1233700iD2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1233700iD2 valueOf(String str) {
        return (EnumC1233700iD2) C08FF.LIZ(EnumC1233700iD2.class, str);
    }

    public EnumC1233700iD2(String str, int i, String str2) {
        this.LL = str2;
    }
}
