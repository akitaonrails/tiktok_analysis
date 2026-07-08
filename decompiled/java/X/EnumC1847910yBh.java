package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1847910yBh {
    public static final EnumC1847910yBh CLICK;
    public static final EnumC1847910yBh DOUBLE_CLICK;
    public static final /* synthetic */ EnumC1847910yBh[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1847910yBh LONG_PRESS;
    public static final EnumC1847910yBh SHOW;
    public static final EnumC1847910yBh SLIDE;
    public static final EnumC1847910yBh STAY;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1847910yBh> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1847910yBh enumC1847910yBh = new EnumC1847910yBh(0, 0, 1, "SHOW", "show");
        SHOW = enumC1847910yBh;
        EnumC1847910yBh enumC1847910yBh2 = new EnumC1847910yBh(1, 1, 2, "STAY", "stay");
        STAY = enumC1847910yBh2;
        EnumC1847910yBh enumC1847910yBh3 = new EnumC1847910yBh(2, 2, 4, "CLICK", "click");
        CLICK = enumC1847910yBh3;
        EnumC1847910yBh enumC1847910yBh4 = new EnumC1847910yBh(3, 3, 8, "DOUBLE_CLICK", "double_click");
        DOUBLE_CLICK = enumC1847910yBh4;
        EnumC1847910yBh enumC1847910yBh5 = new EnumC1847910yBh(4, 4, 16, "LONG_PRESS", "long_press");
        LONG_PRESS = enumC1847910yBh5;
        EnumC1847910yBh enumC1847910yBh6 = new EnumC1847910yBh(5, 5, 32, "SLIDE", "slide");
        SLIDE = enumC1847910yBh6;
        EnumC1847910yBh[] enumC1847910yBhArr = {enumC1847910yBh, enumC1847910yBh2, enumC1847910yBh3, enumC1847910yBh4, enumC1847910yBh5, enumC1847910yBh6};
        LLILZ = enumC1847910yBhArr;
        LLILZIL = new C2254308sP(enumC1847910yBhArr);
    }

    public static EnumC1847910yBh[] values() {
        return (EnumC1847910yBh[]) LLILZ.clone();
    }

    public final int getFlag() {
        return this.LLILLL;
    }

    public final int getIndex() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1847910yBh valueOf(String str) {
        return (EnumC1847910yBh) C08FF.LIZ(EnumC1847910yBh.class, str);
    }

    public EnumC1847910yBh(int i, int i2, int i3, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
