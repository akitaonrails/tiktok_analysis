package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1145990fvZ {
    public static final EnumC1145990fvZ IDLE;
    public static final /* synthetic */ EnumC1145990fvZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1145990fvZ LOAD_MORE_FAIL;
    public static final EnumC1145990fvZ LOAD_MORE_START;
    public static final EnumC1145990fvZ LOAD_MORE_SUCCESS;
    public static final EnumC1145990fvZ REFRESH_SUCCESS;
    public static final EnumC1145990fvZ REMOVE_TIP;

    public static InterfaceC2044707zh<EnumC1145990fvZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1145990fvZ enumC1145990fvZ = new EnumC1145990fvZ("IDLE", 0);
        IDLE = enumC1145990fvZ;
        EnumC1145990fvZ enumC1145990fvZ2 = new EnumC1145990fvZ("REFRESH_SUCCESS", 1);
        REFRESH_SUCCESS = enumC1145990fvZ2;
        EnumC1145990fvZ enumC1145990fvZ3 = new EnumC1145990fvZ("LOAD_MORE_SUCCESS", 2);
        LOAD_MORE_SUCCESS = enumC1145990fvZ3;
        EnumC1145990fvZ enumC1145990fvZ4 = new EnumC1145990fvZ("LOAD_MORE_START", 3);
        LOAD_MORE_START = enumC1145990fvZ4;
        EnumC1145990fvZ enumC1145990fvZ5 = new EnumC1145990fvZ("LOAD_MORE_FAIL", 4);
        LOAD_MORE_FAIL = enumC1145990fvZ5;
        EnumC1145990fvZ enumC1145990fvZ6 = new EnumC1145990fvZ("REMOVE_TIP", 5);
        REMOVE_TIP = enumC1145990fvZ6;
        EnumC1145990fvZ[] enumC1145990fvZArr = {enumC1145990fvZ, enumC1145990fvZ2, enumC1145990fvZ3, enumC1145990fvZ4, enumC1145990fvZ5, enumC1145990fvZ6};
        LL = enumC1145990fvZArr;
        LLILLJJLI = new C2254308sP(enumC1145990fvZArr);
    }

    public static EnumC1145990fvZ[] values() {
        return (EnumC1145990fvZ[]) LL.clone();
    }

    public static EnumC1145990fvZ valueOf(String str) {
        return (EnumC1145990fvZ) C08FF.LIZ(EnumC1145990fvZ.class, str);
    }

    public EnumC1145990fvZ(String str, int i) {
    }
}
