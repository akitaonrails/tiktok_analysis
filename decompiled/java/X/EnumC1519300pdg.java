package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1519300pdg {
    public static final EnumC1519300pdg LLILLL;
    public static final EnumC1519300pdg LLILZ;
    public static final EnumC1519300pdg LLILZIL;
    public static final EnumC1519300pdg LLILZLL;
    public static final EnumC1519300pdg LLIZ;
    public static final EnumC1519300pdg LLIZLLLIL;
    public static final /* synthetic */ EnumC1519300pdg[] LLJ;
    public final boolean LL;
    public final String LLILLJJLI;

    static {
        EnumC1519300pdg enumC1519300pdg = new EnumC1519300pdg(0, "SHOW", "show", true);
        LLILLL = enumC1519300pdg;
        EnumC1519300pdg enumC1519300pdg2 = new EnumC1519300pdg(1, "SHOW_FORCE", "force_show", true);
        LLILZ = enumC1519300pdg2;
        EnumC1519300pdg enumC1519300pdg3 = new EnumC1519300pdg(2, "NO_POPUP", "no_popup", false);
        LLILZIL = enumC1519300pdg3;
        EnumC1519300pdg enumC1519300pdg4 = new EnumC1519300pdg(3, "DEFERRED_NUJ", "deferred_nuj", false);
        LLILZLL = enumC1519300pdg4;
        EnumC1519300pdg enumC1519300pdg5 = new EnumC1519300pdg(4, "DEFERRED_LOGIN_PANEL", "deferred_login_panel", false);
        LLIZ = enumC1519300pdg5;
        EnumC1519300pdg enumC1519300pdg6 = new EnumC1519300pdg(5, "DEFERRED_POST_REGISTRATION", "deferred_post_registration", false);
        LLIZLLLIL = enumC1519300pdg6;
        EnumC1519300pdg[] enumC1519300pdgArr = {enumC1519300pdg, enumC1519300pdg2, enumC1519300pdg3, enumC1519300pdg4, enumC1519300pdg5, enumC1519300pdg6};
        LLJ = enumC1519300pdgArr;
        new C2254308sP(enumC1519300pdgArr);
    }

    public static EnumC1519300pdg[] values() {
        return (EnumC1519300pdg[]) LLJ.clone();
    }

    public static EnumC1519300pdg valueOf(String str) {
        return (EnumC1519300pdg) C08FF.LIZ(EnumC1519300pdg.class, str);
    }

    public EnumC1519300pdg(int i, String str, String str2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = str2;
    }
}
