package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002140cBY {
    public static final /* synthetic */ EnumC1002140cBY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1002140cBY ONE_PIXEL;
    public static final EnumC1002140cBY SLIDE_FOLLOW;
    public static final EnumC1002140cBY SLIDE_GUIDE;
    public static final EnumC1002140cBY SUPPLY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1002140cBY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1002140cBY enumC1002140cBY = new EnumC1002140cBY("SLIDE_FOLLOW", 0, "pan");
        SLIDE_FOLLOW = enumC1002140cBY;
        EnumC1002140cBY enumC1002140cBY2 = new EnumC1002140cBY("ONE_PIXEL", 1, "click");
        ONE_PIXEL = enumC1002140cBY2;
        EnumC1002140cBY enumC1002140cBY3 = new EnumC1002140cBY("SLIDE_GUIDE", 2, "loadmore");
        SLIDE_GUIDE = enumC1002140cBY3;
        EnumC1002140cBY enumC1002140cBY4 = new EnumC1002140cBY("SUPPLY", 3, "supply");
        SUPPLY = enumC1002140cBY4;
        EnumC1002140cBY[] enumC1002140cBYArr = {enumC1002140cBY, enumC1002140cBY2, enumC1002140cBY3, enumC1002140cBY4};
        LLILLJJLI = enumC1002140cBYArr;
        LLILLL = new C2254308sP(enumC1002140cBYArr);
    }

    public static EnumC1002140cBY[] values() {
        return (EnumC1002140cBY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1002140cBY valueOf(String str) {
        return (EnumC1002140cBY) C08FF.LIZ(EnumC1002140cBY.class, str);
    }

    public EnumC1002140cBY(String str, int i, String str2) {
        this.LL = str2;
    }
}
