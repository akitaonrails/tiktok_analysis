package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584480MwA {
    public static final /* synthetic */ EnumC584480MwA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC584480MwA TYPE_AD;
    public static final EnumC584480MwA TYPE_LIVE;
    public static final EnumC584480MwA TYPE_LONG;
    public static final EnumC584480MwA TYPE_MIX;
    public static final EnumC584480MwA TYPE_OTHERS;
    public static final EnumC584480MwA TYPE_PHOTO_MODE;
    public static final EnumC584480MwA TYPE_STORY;
    public static final EnumC584480MwA TYPE_VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC584480MwA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC584480MwA enumC584480MwA = new EnumC584480MwA("TYPE_VIDEO", 0, 0);
        TYPE_VIDEO = enumC584480MwA;
        EnumC584480MwA enumC584480MwA2 = new EnumC584480MwA("TYPE_AD", 1, 1);
        TYPE_AD = enumC584480MwA2;
        EnumC584480MwA enumC584480MwA3 = new EnumC584480MwA("TYPE_MIX", 2, 2);
        TYPE_MIX = enumC584480MwA3;
        EnumC584480MwA enumC584480MwA4 = new EnumC584480MwA("TYPE_PHOTO_MODE", 3, 3);
        TYPE_PHOTO_MODE = enumC584480MwA4;
        EnumC584480MwA enumC584480MwA5 = new EnumC584480MwA("TYPE_LIVE", 4, 4);
        TYPE_LIVE = enumC584480MwA5;
        EnumC584480MwA enumC584480MwA6 = new EnumC584480MwA("TYPE_LONG", 5, 5);
        TYPE_LONG = enumC584480MwA6;
        EnumC584480MwA enumC584480MwA7 = new EnumC584480MwA("TYPE_OTHERS", 6, 6);
        TYPE_OTHERS = enumC584480MwA7;
        EnumC584480MwA enumC584480MwA8 = new EnumC584480MwA("TYPE_STORY", 7, 7);
        TYPE_STORY = enumC584480MwA8;
        EnumC584480MwA[] enumC584480MwAArr = {enumC584480MwA, enumC584480MwA2, enumC584480MwA3, enumC584480MwA4, enumC584480MwA5, enumC584480MwA6, enumC584480MwA7, enumC584480MwA8};
        LLILLJJLI = enumC584480MwAArr;
        LLILLL = new C2254308sP(enumC584480MwAArr);
    }

    public static EnumC584480MwA[] values() {
        return (EnumC584480MwA[]) LLILLJJLI.clone();
    }

    public final int getNum() {
        return this.LL;
    }

    public static EnumC584480MwA valueOf(String str) {
        return (EnumC584480MwA) C08FF.LIZ(EnumC584480MwA.class, str);
    }

    public EnumC584480MwA(String str, int i, int i2) {
        this.LL = i2;
    }
}
