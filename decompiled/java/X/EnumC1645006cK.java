package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1645006cK {
    public static final /* synthetic */ EnumC1645006cK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1645006cK OTHERS;
    public static final EnumC1645006cK POST_AIMOJI_CREATION;
    public static final EnumC1645006cK POST_SA_DUO_CREATION;
    public static final EnumC1645006cK RECOMMENDED_CHAT;
    public static final EnumC1645006cK SAY_HI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1645006cK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1645006cK enumC1645006cK = new EnumC1645006cK("RECOMMENDED_CHAT", 0, "recommended_chat");
        RECOMMENDED_CHAT = enumC1645006cK;
        EnumC1645006cK enumC1645006cK2 = new EnumC1645006cK("POST_AIMOJI_CREATION", 1, "post_aimoji_creation");
        POST_AIMOJI_CREATION = enumC1645006cK2;
        EnumC1645006cK enumC1645006cK3 = new EnumC1645006cK("POST_SA_DUO_CREATION", 2, "post_sa_duo_creation");
        POST_SA_DUO_CREATION = enumC1645006cK3;
        EnumC1645006cK enumC1645006cK4 = new EnumC1645006cK("SAY_HI", 3, "say_hi_chat");
        SAY_HI = enumC1645006cK4;
        EnumC1645006cK enumC1645006cK5 = new EnumC1645006cK("OTHERS", 4, "");
        OTHERS = enumC1645006cK5;
        EnumC1645006cK[] enumC1645006cKArr = {enumC1645006cK, enumC1645006cK2, enumC1645006cK3, enumC1645006cK4, enumC1645006cK5};
        LLILLJJLI = enumC1645006cKArr;
        LLILLL = new C2254308sP(enumC1645006cKArr);
    }

    public static EnumC1645006cK[] values() {
        return (EnumC1645006cK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1645006cK valueOf(String str) {
        return (EnumC1645006cK) C08FF.LIZ(EnumC1645006cK.class, str);
    }

    public EnumC1645006cK(String str, int i, String str2) {
        this.LL = str2;
    }
}
