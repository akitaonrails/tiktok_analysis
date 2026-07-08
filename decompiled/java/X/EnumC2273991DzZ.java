package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2273991DzZ {
    public static final EnumC2273991DzZ CALENDLY_WEB_LOAD_END;
    public static final EnumC2273991DzZ FAILURE;
    public static final EnumC2273991DzZ INIT;
    public static final /* synthetic */ EnumC2273991DzZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2273991DzZ LOADING;
    public static final EnumC2273991DzZ PARTIAL_FAILURE;
    public static final EnumC2273991DzZ PARTIAL_LOADING;
    public static final EnumC2273991DzZ SMB_API_SUCCESS;

    public static InterfaceC2044707zh<EnumC2273991DzZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2273991DzZ enumC2273991DzZ = new EnumC2273991DzZ("INIT", 0);
        INIT = enumC2273991DzZ;
        EnumC2273991DzZ enumC2273991DzZ2 = new EnumC2273991DzZ("LOADING", 1);
        LOADING = enumC2273991DzZ2;
        EnumC2273991DzZ enumC2273991DzZ3 = new EnumC2273991DzZ("PARTIAL_LOADING", 2);
        PARTIAL_LOADING = enumC2273991DzZ3;
        EnumC2273991DzZ enumC2273991DzZ4 = new EnumC2273991DzZ("SMB_API_SUCCESS", 3);
        SMB_API_SUCCESS = enumC2273991DzZ4;
        EnumC2273991DzZ enumC2273991DzZ5 = new EnumC2273991DzZ("CALENDLY_WEB_LOAD_END", 4);
        CALENDLY_WEB_LOAD_END = enumC2273991DzZ5;
        EnumC2273991DzZ enumC2273991DzZ6 = new EnumC2273991DzZ("FAILURE", 5);
        FAILURE = enumC2273991DzZ6;
        EnumC2273991DzZ enumC2273991DzZ7 = new EnumC2273991DzZ("PARTIAL_FAILURE", 6);
        PARTIAL_FAILURE = enumC2273991DzZ7;
        EnumC2273991DzZ[] enumC2273991DzZArr = {enumC2273991DzZ, enumC2273991DzZ2, enumC2273991DzZ3, enumC2273991DzZ4, enumC2273991DzZ5, enumC2273991DzZ6, enumC2273991DzZ7};
        LL = enumC2273991DzZArr;
        LLILLJJLI = new C2254308sP(enumC2273991DzZArr);
    }

    public static EnumC2273991DzZ[] values() {
        return (EnumC2273991DzZ[]) LL.clone();
    }

    public static EnumC2273991DzZ valueOf(String str) {
        return (EnumC2273991DzZ) C08FF.LIZ(EnumC2273991DzZ.class, str);
    }

    public EnumC2273991DzZ(String str, int i) {
    }
}
