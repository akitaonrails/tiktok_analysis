package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1232600iBG {
    public static final EnumC1232600iBG BACKGROUND;
    public static final EnumC1232600iBG CLOSE;
    public static final EnumC1232600iBG CONFIRM;
    public static final EnumC1232600iBG GO_TO_APP_STORE;
    public static final /* synthetic */ EnumC1232600iBG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1232600iBG NOT_NOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1232600iBG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1232600iBG enumC1232600iBG = new EnumC1232600iBG("CLOSE", 0, "Close");
        CLOSE = enumC1232600iBG;
        EnumC1232600iBG enumC1232600iBG2 = new EnumC1232600iBG("BACKGROUND", 1, "Background");
        BACKGROUND = enumC1232600iBG2;
        EnumC1232600iBG enumC1232600iBG3 = new EnumC1232600iBG("CONFIRM", 2, "Confirm");
        CONFIRM = enumC1232600iBG3;
        EnumC1232600iBG enumC1232600iBG4 = new EnumC1232600iBG("NOT_NOW", 3, "Not Now");
        NOT_NOW = enumC1232600iBG4;
        EnumC1232600iBG enumC1232600iBG5 = new EnumC1232600iBG("GO_TO_APP_STORE", 4, "Go to app store");
        GO_TO_APP_STORE = enumC1232600iBG5;
        EnumC1232600iBG[] enumC1232600iBGArr = {enumC1232600iBG, enumC1232600iBG2, enumC1232600iBG3, enumC1232600iBG4, enumC1232600iBG5};
        LLILLJJLI = enumC1232600iBGArr;
        LLILLL = new C2254308sP(enumC1232600iBGArr);
    }

    public static EnumC1232600iBG[] values() {
        return (EnumC1232600iBG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1232600iBG valueOf(String str) {
        return (EnumC1232600iBG) C08FF.LIZ(EnumC1232600iBG.class, str);
    }

    public EnumC1232600iBG(String str, int i, String str2) {
        this.LL = str2;
    }
}
