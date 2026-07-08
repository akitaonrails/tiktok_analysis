package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC628870OlZ {
    public static final EnumC628870OlZ EMPTY_RESULT;
    public static final EnumC628870OlZ ERROR;
    public static final /* synthetic */ EnumC628870OlZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC628870OlZ LOADING;
    public static final EnumC628870OlZ SUCCESS;

    public static InterfaceC2044707zh<EnumC628870OlZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC628870OlZ enumC628870OlZ = new EnumC628870OlZ("LOADING", 0);
        LOADING = enumC628870OlZ;
        EnumC628870OlZ enumC628870OlZ2 = new EnumC628870OlZ("SUCCESS", 1);
        SUCCESS = enumC628870OlZ2;
        EnumC628870OlZ enumC628870OlZ3 = new EnumC628870OlZ("EMPTY_RESULT", 2);
        EMPTY_RESULT = enumC628870OlZ3;
        EnumC628870OlZ enumC628870OlZ4 = new EnumC628870OlZ("ERROR", 3);
        ERROR = enumC628870OlZ4;
        EnumC628870OlZ[] enumC628870OlZArr = {enumC628870OlZ, enumC628870OlZ2, enumC628870OlZ3, enumC628870OlZ4};
        LL = enumC628870OlZArr;
        LLILLJJLI = new C2254308sP(enumC628870OlZArr);
    }

    public static EnumC628870OlZ[] values() {
        return (EnumC628870OlZ[]) LL.clone();
    }

    public static EnumC628870OlZ valueOf(String str) {
        return (EnumC628870OlZ) C08FF.LIZ(EnumC628870OlZ.class, str);
    }

    public EnumC628870OlZ(String str, int i) {
    }
}
