package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007720cKY {
    public static final EnumC1007720cKY FAILED;
    public static final EnumC1007720cKY IDLE;
    public static final /* synthetic */ EnumC1007720cKY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1007720cKY LOADING;
    public static final EnumC1007720cKY SUCCESS;
    public static final EnumC1007720cKY SUCCESS_WITHOUT_RESULT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1007720cKY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1007720cKY enumC1007720cKY = new EnumC1007720cKY("IDLE", 0, -1);
        IDLE = enumC1007720cKY;
        EnumC1007720cKY enumC1007720cKY2 = new EnumC1007720cKY("FAILED", 1, 0);
        FAILED = enumC1007720cKY2;
        EnumC1007720cKY enumC1007720cKY3 = new EnumC1007720cKY("SUCCESS", 2, 1);
        SUCCESS = enumC1007720cKY3;
        EnumC1007720cKY enumC1007720cKY4 = new EnumC1007720cKY("SUCCESS_WITHOUT_RESULT", 3, 2);
        SUCCESS_WITHOUT_RESULT = enumC1007720cKY4;
        EnumC1007720cKY enumC1007720cKY5 = new EnumC1007720cKY("LOADING", 4, 3);
        LOADING = enumC1007720cKY5;
        EnumC1007720cKY[] enumC1007720cKYArr = {enumC1007720cKY, enumC1007720cKY2, enumC1007720cKY3, enumC1007720cKY4, enumC1007720cKY5};
        LLILLJJLI = enumC1007720cKYArr;
        LLILLL = new C2254308sP(enumC1007720cKYArr);
    }

    public static EnumC1007720cKY[] values() {
        return (EnumC1007720cKY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1007720cKY valueOf(String str) {
        return (EnumC1007720cKY) C08FF.LIZ(EnumC1007720cKY.class, str);
    }

    public EnumC1007720cKY(String str, int i, int i2) {
        this.LL = i2;
    }
}
