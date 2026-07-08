package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070220dxM {
    public static final EnumC1070220dxM CHECK;
    public static final EnumC1070220dxM END;
    public static final /* synthetic */ EnumC1070220dxM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1070220dxM REQUEST;
    public static final EnumC1070220dxM START;
    public static final EnumC1070220dxM SYNC;
    public static final EnumC1070220dxM UPLOAD;

    public static InterfaceC2044707zh<EnumC1070220dxM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1070220dxM enumC1070220dxM = new EnumC1070220dxM("START", 0);
        START = enumC1070220dxM;
        EnumC1070220dxM enumC1070220dxM2 = new EnumC1070220dxM("CHECK", 1);
        CHECK = enumC1070220dxM2;
        EnumC1070220dxM enumC1070220dxM3 = new EnumC1070220dxM("REQUEST", 2);
        REQUEST = enumC1070220dxM3;
        EnumC1070220dxM enumC1070220dxM4 = new EnumC1070220dxM("SYNC", 3);
        SYNC = enumC1070220dxM4;
        EnumC1070220dxM enumC1070220dxM5 = new EnumC1070220dxM("UPLOAD", 4);
        UPLOAD = enumC1070220dxM5;
        EnumC1070220dxM enumC1070220dxM6 = new EnumC1070220dxM("END", 5);
        END = enumC1070220dxM6;
        EnumC1070220dxM[] enumC1070220dxMArr = {enumC1070220dxM, enumC1070220dxM2, enumC1070220dxM3, enumC1070220dxM4, enumC1070220dxM5, enumC1070220dxM6};
        LL = enumC1070220dxMArr;
        LLILLJJLI = new C2254308sP(enumC1070220dxMArr);
    }

    public static EnumC1070220dxM[] values() {
        return (EnumC1070220dxM[]) LL.clone();
    }

    public static EnumC1070220dxM valueOf(String str) {
        return (EnumC1070220dxM) C08FF.LIZ(EnumC1070220dxM.class, str);
    }

    public EnumC1070220dxM(String str, int i) {
    }
}
