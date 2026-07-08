package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356020DxY {
    public static final EnumC356020DxY DISABLE_BEAUTY;
    public static final EnumC356020DxY EMPTY;
    public static final EnumC356020DxY ENABLE;
    public static final /* synthetic */ EnumC356020DxY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356020DxY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356020DxY enumC356020DxY = new EnumC356020DxY("ENABLE", 0);
        ENABLE = enumC356020DxY;
        EnumC356020DxY enumC356020DxY2 = new EnumC356020DxY("DISABLE_BEAUTY", 1);
        DISABLE_BEAUTY = enumC356020DxY2;
        EnumC356020DxY enumC356020DxY3 = new EnumC356020DxY("EMPTY", 2);
        EMPTY = enumC356020DxY3;
        EnumC356020DxY[] enumC356020DxYArr = {enumC356020DxY, enumC356020DxY2, enumC356020DxY3};
        LL = enumC356020DxYArr;
        LLILLJJLI = new C2254308sP(enumC356020DxYArr);
    }

    public static EnumC356020DxY[] values() {
        return (EnumC356020DxY[]) LL.clone();
    }

    public static EnumC356020DxY valueOf(String str) {
        return (EnumC356020DxY) C08FF.LIZ(EnumC356020DxY.class, str);
    }

    public EnumC356020DxY(String str, int i) {
    }
}
