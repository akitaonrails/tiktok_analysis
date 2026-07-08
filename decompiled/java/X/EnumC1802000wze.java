package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1802000wze {
    public static final EnumC1802000wze LLILLJJLI;
    public static final EnumC1802000wze LLILLL;
    public static final EnumC1802000wze LLILZ;
    public static final /* synthetic */ EnumC1802000wze[] LLILZIL;
    public final String LL;

    static {
        EnumC1802000wze enumC1802000wze = new EnumC1802000wze("TIKTOK_PERSONAL_PROFILE_CENTER", 0, "tiktok_personal_profile_center");
        LLILLJJLI = enumC1802000wze;
        EnumC1802000wze enumC1802000wze2 = new EnumC1802000wze("TIKTOK_SIDEBAR", 1, "tiktok_sidebar");
        LLILLL = enumC1802000wze2;
        EnumC1802000wze enumC1802000wze3 = new EnumC1802000wze("ADD_TO_HOMESCREEN", 2, "add_to_homescreen");
        LLILZ = enumC1802000wze3;
        EnumC1802000wze[] enumC1802000wzeArr = {enumC1802000wze, enumC1802000wze2, enumC1802000wze3};
        LLILZIL = enumC1802000wzeArr;
        new C2254308sP(enumC1802000wzeArr);
    }

    public static EnumC1802000wze[] values() {
        return (EnumC1802000wze[]) LLILZIL.clone();
    }

    public static EnumC1802000wze valueOf(String str) {
        return (EnumC1802000wze) C08FF.LIZ(EnumC1802000wze.class, str);
    }

    public EnumC1802000wze(String str, int i, String str2) {
        this.LL = str2;
    }
}
