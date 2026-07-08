package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC654070Pl7 {
    public static final C654100PlA Companion;
    public static final EnumC654070Pl7 GAME;
    public static final EnumC654070Pl7 IMDB;
    public static final /* synthetic */ EnumC654070Pl7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC654070Pl7 MUSIC;
    public static final EnumC654070Pl7 WIKI;
    public final int LL;

    public static InterfaceC2044707zh<EnumC654070Pl7> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0PlA] */
    static {
        EnumC654070Pl7 enumC654070Pl7 = new EnumC654070Pl7("WIKI", 0, 2);
        WIKI = enumC654070Pl7;
        EnumC654070Pl7 enumC654070Pl72 = new EnumC654070Pl7("IMDB", 1, 3);
        IMDB = enumC654070Pl72;
        EnumC654070Pl7 enumC654070Pl73 = new EnumC654070Pl7("GAME", 2, 4);
        GAME = enumC654070Pl73;
        EnumC654070Pl7 enumC654070Pl74 = new EnumC654070Pl7("MUSIC", 3, 6);
        MUSIC = enumC654070Pl74;
        EnumC654070Pl7[] enumC654070Pl7Arr = {enumC654070Pl7, enumC654070Pl72, enumC654070Pl73, enumC654070Pl74};
        LLILLJJLI = enumC654070Pl7Arr;
        LLILLL = new C2254308sP(enumC654070Pl7Arr);
        Companion = new Object() { // from class: X.0PlA
        };
    }

    public static EnumC654070Pl7[] values() {
        return (EnumC654070Pl7[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC654070Pl7 valueOf(String str) {
        return (EnumC654070Pl7) C08FF.LIZ(EnumC654070Pl7.class, str);
    }

    public EnumC654070Pl7(String str, int i, int i2) {
        this.LL = i2;
    }
}
