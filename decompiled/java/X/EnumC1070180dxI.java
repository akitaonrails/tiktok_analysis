package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070180dxI {
    public static final /* synthetic */ EnumC1070180dxI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1070180dxI PRIMARY;
    public static final EnumC1070180dxI SECONDARY;

    public static InterfaceC2044707zh<EnumC1070180dxI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1070180dxI enumC1070180dxI = new EnumC1070180dxI("PRIMARY", 0);
        PRIMARY = enumC1070180dxI;
        EnumC1070180dxI enumC1070180dxI2 = new EnumC1070180dxI("SECONDARY", 1);
        SECONDARY = enumC1070180dxI2;
        EnumC1070180dxI[] enumC1070180dxIArr = {enumC1070180dxI, enumC1070180dxI2};
        LL = enumC1070180dxIArr;
        LLILLJJLI = new C2254308sP(enumC1070180dxIArr);
    }

    public static EnumC1070180dxI[] values() {
        return (EnumC1070180dxI[]) LL.clone();
    }

    public static EnumC1070180dxI valueOf(String str) {
        return (EnumC1070180dxI) C08FF.LIZ(EnumC1070180dxI.class, str);
    }

    public EnumC1070180dxI(String str, int i) {
    }
}
