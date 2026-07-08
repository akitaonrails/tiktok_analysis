package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC858180XlY {
    public static final EnumC858180XlY COMMENT;
    public static final /* synthetic */ EnumC858180XlY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC858180XlY VIDEO;

    public static InterfaceC2044707zh<EnumC858180XlY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC858180XlY enumC858180XlY = new EnumC858180XlY("VIDEO", 0);
        VIDEO = enumC858180XlY;
        EnumC858180XlY enumC858180XlY2 = new EnumC858180XlY("COMMENT", 1);
        COMMENT = enumC858180XlY2;
        EnumC858180XlY[] enumC858180XlYArr = {enumC858180XlY, enumC858180XlY2};
        LL = enumC858180XlYArr;
        LLILLJJLI = new C2254308sP(enumC858180XlYArr);
    }

    public static EnumC858180XlY[] values() {
        return (EnumC858180XlY[]) LL.clone();
    }

    public static EnumC858180XlY valueOf(String str) {
        return (EnumC858180XlY) C08FF.LIZ(EnumC858180XlY.class, str);
    }

    public EnumC858180XlY(String str, int i) {
    }
}
