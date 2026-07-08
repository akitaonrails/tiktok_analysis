package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1834800xqY {
    public static final /* synthetic */ EnumC1834800xqY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1834800xqY LOADING;
    public static final EnumC1834800xqY NORMAL;
    public static final EnumC1834800xqY PROCESSED;
    public static final EnumC1834800xqY SPINNER_LOADING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1834800xqY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1834800xqY enumC1834800xqY = new EnumC1834800xqY("NORMAL", 0, 1);
        NORMAL = enumC1834800xqY;
        EnumC1834800xqY enumC1834800xqY2 = new EnumC1834800xqY("LOADING", 1, 2);
        LOADING = enumC1834800xqY2;
        EnumC1834800xqY enumC1834800xqY3 = new EnumC1834800xqY("PROCESSED", 2, 3);
        PROCESSED = enumC1834800xqY3;
        EnumC1834800xqY enumC1834800xqY4 = new EnumC1834800xqY("SPINNER_LOADING", 3, 4);
        SPINNER_LOADING = enumC1834800xqY4;
        EnumC1834800xqY[] enumC1834800xqYArr = {enumC1834800xqY, enumC1834800xqY2, enumC1834800xqY3, enumC1834800xqY4};
        LLILLJJLI = enumC1834800xqYArr;
        LLILLL = new C2254308sP(enumC1834800xqYArr);
    }

    public static EnumC1834800xqY[] values() {
        return (EnumC1834800xqY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1834800xqY valueOf(String str) {
        return (EnumC1834800xqY) C08FF.LIZ(EnumC1834800xqY.class, str);
    }

    public EnumC1834800xqY(String str, int i, int i2) {
        this.LL = i2;
    }
}
