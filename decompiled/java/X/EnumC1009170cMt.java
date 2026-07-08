package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1009170cMt {
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_ANCHOR;
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_CTA;
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_DES;
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_LABEL;
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_MUSIC;
    public static final EnumC1009170cMt ANOLE_LEFT_INTERACT_SUB_USER_NAME;
    public static final /* synthetic */ EnumC1009170cMt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1009170cMt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1009170cMt enumC1009170cMt = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_MUSIC", 0, "tt_music_info_interactive");
        ANOLE_LEFT_INTERACT_SUB_MUSIC = enumC1009170cMt;
        EnumC1009170cMt enumC1009170cMt2 = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_USER_NAME", 1, "tt_user_name_interactive");
        ANOLE_LEFT_INTERACT_SUB_USER_NAME = enumC1009170cMt2;
        EnumC1009170cMt enumC1009170cMt3 = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_DES", 2, "tt_description_interactive");
        ANOLE_LEFT_INTERACT_SUB_DES = enumC1009170cMt3;
        EnumC1009170cMt enumC1009170cMt4 = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_LABEL", 3, "tt_sponsor_label_interactive");
        ANOLE_LEFT_INTERACT_SUB_LABEL = enumC1009170cMt4;
        EnumC1009170cMt enumC1009170cMt5 = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_ANCHOR", 4, "tt_anchor_interactive");
        ANOLE_LEFT_INTERACT_SUB_ANCHOR = enumC1009170cMt5;
        EnumC1009170cMt enumC1009170cMt6 = new EnumC1009170cMt("ANOLE_LEFT_INTERACT_SUB_CTA", 5, "tt_cta_interactive");
        ANOLE_LEFT_INTERACT_SUB_CTA = enumC1009170cMt6;
        EnumC1009170cMt[] enumC1009170cMtArr = {enumC1009170cMt, enumC1009170cMt2, enumC1009170cMt3, enumC1009170cMt4, enumC1009170cMt5, enumC1009170cMt6};
        LLILLJJLI = enumC1009170cMtArr;
        LLILLL = new C2254308sP(enumC1009170cMtArr);
    }

    public static EnumC1009170cMt[] values() {
        return (EnumC1009170cMt[]) LLILLJJLI.clone();
    }

    public final String getInteractName() {
        return this.LL;
    }

    public static EnumC1009170cMt valueOf(String str) {
        return (EnumC1009170cMt) C08FF.LIZ(EnumC1009170cMt.class, str);
    }

    public EnumC1009170cMt(String str, int i, String str2) {
        this.LL = str2;
    }
}
