package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC943440aes {
    public static final EnumC943440aes CLICK_ACCEPT;
    public static final EnumC943440aes DISAPPEAR_BEFORE_SHOW;
    public static final EnumC943440aes LINKED;
    public static final /* synthetic */ EnumC943440aes[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC943440aes NO_APPLIED;
    public static final EnumC943440aes NO_MODERATOR_ABILITY;
    public static final EnumC943440aes OTHER;
    public static final EnumC943440aes PERMIT_SUCCESS;
    public static final EnumC943440aes TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC943440aes> getEntries() {
        return LLILLL;
    }

    static {
        EnumC943440aes enumC943440aes = new EnumC943440aes("LINKED", 0, "linked");
        LINKED = enumC943440aes;
        EnumC943440aes enumC943440aes2 = new EnumC943440aes("CLICK_ACCEPT", 1, "click_accept");
        CLICK_ACCEPT = enumC943440aes2;
        EnumC943440aes enumC943440aes3 = new EnumC943440aes("NO_MODERATOR_ABILITY", 2, "no_moderator_ability");
        NO_MODERATOR_ABILITY = enumC943440aes3;
        EnumC943440aes enumC943440aes4 = new EnumC943440aes("TIMEOUT", 3, "timeout");
        TIMEOUT = enumC943440aes4;
        EnumC943440aes enumC943440aes5 = new EnumC943440aes("NO_APPLIED", 4, "no_applied");
        NO_APPLIED = enumC943440aes5;
        EnumC943440aes enumC943440aes6 = new EnumC943440aes("DISAPPEAR_BEFORE_SHOW", 5, "disappear_before_show");
        DISAPPEAR_BEFORE_SHOW = enumC943440aes6;
        EnumC943440aes enumC943440aes7 = new EnumC943440aes("PERMIT_SUCCESS", 6, "permit_success");
        PERMIT_SUCCESS = enumC943440aes7;
        EnumC943440aes enumC943440aes8 = new EnumC943440aes("OTHER", 7, "other");
        OTHER = enumC943440aes8;
        EnumC943440aes[] enumC943440aesArr = {enumC943440aes, enumC943440aes2, enumC943440aes3, enumC943440aes4, enumC943440aes5, enumC943440aes6, enumC943440aes7, enumC943440aes8};
        LLILLJJLI = enumC943440aesArr;
        LLILLL = new C2254308sP(enumC943440aesArr);
    }

    public static EnumC943440aes[] values() {
        return (EnumC943440aes[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC943440aes valueOf(String str) {
        return (EnumC943440aes) C08FF.LIZ(EnumC943440aes.class, str);
    }

    public EnumC943440aes(String str, int i, String str2) {
        this.LL = str2;
    }
}
