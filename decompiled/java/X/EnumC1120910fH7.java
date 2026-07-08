package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1120910fH7 {
    public static final EnumC1120910fH7 ANIMATION;
    public static final EnumC1120910fH7 BUBBLE;
    public static final EnumC1120910fH7 DOT;
    public static final /* synthetic */ EnumC1120910fH7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1120910fH7 MIX;
    public static final EnumC1120910fH7 NORMAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1120910fH7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1120910fH7 enumC1120910fH7 = new EnumC1120910fH7("ANIMATION", 0, "animation");
        ANIMATION = enumC1120910fH7;
        EnumC1120910fH7 enumC1120910fH72 = new EnumC1120910fH7("NORMAL", 1, "normal");
        NORMAL = enumC1120910fH72;
        EnumC1120910fH7 enumC1120910fH73 = new EnumC1120910fH7("DOT", 2, "reddot");
        DOT = enumC1120910fH73;
        EnumC1120910fH7 enumC1120910fH74 = new EnumC1120910fH7("BUBBLE", 3, "bubble");
        BUBBLE = enumC1120910fH74;
        EnumC1120910fH7 enumC1120910fH75 = new EnumC1120910fH7("MIX", 4, "mix");
        MIX = enumC1120910fH75;
        EnumC1120910fH7[] enumC1120910fH7Arr = {enumC1120910fH7, enumC1120910fH72, enumC1120910fH73, enumC1120910fH74, enumC1120910fH75};
        LLILLJJLI = enumC1120910fH7Arr;
        LLILLL = new C2254308sP(enumC1120910fH7Arr);
    }

    public static EnumC1120910fH7[] values() {
        return (EnumC1120910fH7[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1120910fH7 valueOf(String str) {
        return (EnumC1120910fH7) C08FF.LIZ(EnumC1120910fH7.class, str);
    }

    public EnumC1120910fH7(String str, int i, String str2) {
        this.LL = str2;
    }
}
