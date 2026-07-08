package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114200c0 {
    public static final EnumC114200c0 IM_PLATFORM_FLAG;
    public static final /* synthetic */ EnumC114200c0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC114200c0 OTHER_PLATFORM_FLAG;
    public static final EnumC114200c0 THIRD_PLATFORM_FLAG;

    public static InterfaceC2044707zh<EnumC114200c0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC114200c0 enumC114200c0 = new EnumC114200c0("OTHER_PLATFORM_FLAG", 0);
        OTHER_PLATFORM_FLAG = enumC114200c0;
        EnumC114200c0 enumC114200c02 = new EnumC114200c0("THIRD_PLATFORM_FLAG", 1);
        THIRD_PLATFORM_FLAG = enumC114200c02;
        EnumC114200c0 enumC114200c03 = new EnumC114200c0("IM_PLATFORM_FLAG", 2);
        IM_PLATFORM_FLAG = enumC114200c03;
        EnumC114200c0[] enumC114200c0Arr = {enumC114200c0, enumC114200c02, enumC114200c03};
        LL = enumC114200c0Arr;
        LLILLJJLI = new C2254308sP(enumC114200c0Arr);
    }

    public static EnumC114200c0[] values() {
        return (EnumC114200c0[]) LL.clone();
    }

    public static EnumC114200c0 valueOf(String str) {
        return (EnumC114200c0) C08FF.LIZ(EnumC114200c0.class, str);
    }

    public EnumC114200c0(String str, int i) {
    }
}
