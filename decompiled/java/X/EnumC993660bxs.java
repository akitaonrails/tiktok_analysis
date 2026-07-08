package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993660bxs {
    public static final /* synthetic */ EnumC993660bxs[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993660bxs NO_GOOGLE_PLAY_STORE_INSTALLED;
    public static final EnumC993660bxs UNKNOWN_JUMP_TYPE;
    public static final EnumC993660bxs URL_EMPTY;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993660bxs> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993660bxs enumC993660bxs = new EnumC993660bxs("UNKNOWN_JUMP_TYPE", 0, -1, "Unknown jumpType (authType)");
        UNKNOWN_JUMP_TYPE = enumC993660bxs;
        EnumC993660bxs enumC993660bxs2 = new EnumC993660bxs("NO_GOOGLE_PLAY_STORE_INSTALLED", 1, -2, "No Google Play Store installed.");
        NO_GOOGLE_PLAY_STORE_INSTALLED = enumC993660bxs2;
        EnumC993660bxs enumC993660bxs3 = new EnumC993660bxs("URL_EMPTY", 2, -3, "Url is empty");
        URL_EMPTY = enumC993660bxs3;
        EnumC993660bxs[] enumC993660bxsArr = {enumC993660bxs, enumC993660bxs2, enumC993660bxs3};
        LLILLL = enumC993660bxsArr;
        LLILZ = new C2254308sP(enumC993660bxsArr);
    }

    public static EnumC993660bxs[] values() {
        return (EnumC993660bxs[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC993660bxs valueOf(String str) {
        return (EnumC993660bxs) C08FF.LIZ(EnumC993660bxs.class, str);
    }

    public EnumC993660bxs(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
