package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1010840cPa {
    public static final EnumC1010840cPa AUTO_PLAY;
    public static final EnumC1010840cPa BREAK;
    public static final EnumC1010840cPa FIRST_QUARTILE;
    public static final /* synthetic */ EnumC1010840cPa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1010840cPa MIDPOINT;
    public static final EnumC1010840cPa OVER;
    public static final EnumC1010840cPa PAUSE;
    public static final EnumC1010840cPa PLAY_2S;
    public static final EnumC1010840cPa PLAY_6S;
    public static final EnumC1010840cPa RESUME;
    public static final EnumC1010840cPa THIRD_QUARTILE;

    public static InterfaceC2044707zh<EnumC1010840cPa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1010840cPa enumC1010840cPa = new EnumC1010840cPa("AUTO_PLAY", 0);
        AUTO_PLAY = enumC1010840cPa;
        EnumC1010840cPa enumC1010840cPa2 = new EnumC1010840cPa("FIRST_QUARTILE", 1);
        FIRST_QUARTILE = enumC1010840cPa2;
        EnumC1010840cPa enumC1010840cPa3 = new EnumC1010840cPa("MIDPOINT", 2);
        MIDPOINT = enumC1010840cPa3;
        EnumC1010840cPa enumC1010840cPa4 = new EnumC1010840cPa("THIRD_QUARTILE", 3);
        THIRD_QUARTILE = enumC1010840cPa4;
        EnumC1010840cPa enumC1010840cPa5 = new EnumC1010840cPa("PLAY_2S", 4);
        PLAY_2S = enumC1010840cPa5;
        EnumC1010840cPa enumC1010840cPa6 = new EnumC1010840cPa("PLAY_6S", 5);
        PLAY_6S = enumC1010840cPa6;
        EnumC1010840cPa enumC1010840cPa7 = new EnumC1010840cPa("BREAK", 6);
        BREAK = enumC1010840cPa7;
        EnumC1010840cPa enumC1010840cPa8 = new EnumC1010840cPa("OVER", 7);
        OVER = enumC1010840cPa8;
        EnumC1010840cPa enumC1010840cPa9 = new EnumC1010840cPa("PAUSE", 8);
        PAUSE = enumC1010840cPa9;
        EnumC1010840cPa enumC1010840cPa10 = new EnumC1010840cPa("RESUME", 9);
        RESUME = enumC1010840cPa10;
        EnumC1010840cPa[] enumC1010840cPaArr = {enumC1010840cPa, enumC1010840cPa2, enumC1010840cPa3, enumC1010840cPa4, enumC1010840cPa5, enumC1010840cPa6, enumC1010840cPa7, enumC1010840cPa8, enumC1010840cPa9, enumC1010840cPa10};
        LL = enumC1010840cPaArr;
        LLILLJJLI = new C2254308sP(enumC1010840cPaArr);
    }

    public static EnumC1010840cPa[] values() {
        return (EnumC1010840cPa[]) LL.clone();
    }

    public static EnumC1010840cPa valueOf(String str) {
        return (EnumC1010840cPa) C08FF.LIZ(EnumC1010840cPa.class, str);
    }

    public EnumC1010840cPa(String str, int i) {
    }
}
