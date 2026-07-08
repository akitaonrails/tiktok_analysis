package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2196301AxY {
    public static final C2196321Axa Companion;
    public static final /* synthetic */ EnumC2196301AxY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2196301AxY MINI_APP;
    public static final EnumC2196301AxY MINI_GAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2196301AxY> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Axa] */
    static {
        EnumC2196301AxY enumC2196301AxY = new EnumC2196301AxY("MINI_APP", 0, "short_drama");
        MINI_APP = enumC2196301AxY;
        EnumC2196301AxY enumC2196301AxY2 = new EnumC2196301AxY("MINI_GAME", 1, "mini_game");
        MINI_GAME = enumC2196301AxY2;
        EnumC2196301AxY[] enumC2196301AxYArr = {enumC2196301AxY, enumC2196301AxY2};
        LLILLJJLI = enumC2196301AxYArr;
        LLILLL = new C2254308sP(enumC2196301AxYArr);
        Companion = new Object() { // from class: X.1Axa
        };
    }

    public static EnumC2196301AxY[] values() {
        return (EnumC2196301AxY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2196301AxY valueOf(String str) {
        return (EnumC2196301AxY) C08FF.LIZ(EnumC2196301AxY.class, str);
    }

    public EnumC2196301AxY(String str, int i, String str2) {
        this.LL = str2;
    }
}
