package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19371710qZ {
    public static final /* synthetic */ EnumC19371710qZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19371710qZ MOBILE;
    public static final EnumC19371710qZ NONE;
    public static final EnumC19371710qZ WIFI;

    public static InterfaceC2044707zh<EnumC19371710qZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19371710qZ enumC19371710qZ = new EnumC19371710qZ("WIFI", 0);
        WIFI = enumC19371710qZ;
        EnumC19371710qZ enumC19371710qZ2 = new EnumC19371710qZ("MOBILE", 1);
        MOBILE = enumC19371710qZ2;
        EnumC19371710qZ enumC19371710qZ3 = new EnumC19371710qZ("NONE", 2);
        NONE = enumC19371710qZ3;
        EnumC19371710qZ[] enumC19371710qZArr = {enumC19371710qZ, enumC19371710qZ2, enumC19371710qZ3};
        LL = enumC19371710qZArr;
        LLILLJJLI = new C2254308sP(enumC19371710qZArr);
    }

    public static EnumC19371710qZ[] values() {
        return (EnumC19371710qZ[]) LL.clone();
    }

    public static EnumC19371710qZ valueOf(String str) {
        return (EnumC19371710qZ) C08FF.LIZ(EnumC19371710qZ.class, str);
    }

    public EnumC19371710qZ(String str, int i) {
    }
}
