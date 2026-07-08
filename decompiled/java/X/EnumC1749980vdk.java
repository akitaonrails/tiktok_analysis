package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749980vdk {
    public static final C1750010vdn Companion;
    public static final EnumC1749980vdk FAMILY_PAIRING_ENUM_CHILD;
    public static final EnumC1749980vdk FAMILY_PAIRING_ENUM_NO_PAIRING;
    public static final EnumC1749980vdk FAMILY_PAIRING_ENUM_PARENT;
    public static final /* synthetic */ EnumC1749980vdk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1749980vdk> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0vdn] */
    static {
        EnumC1749980vdk enumC1749980vdk = new EnumC1749980vdk("FAMILY_PAIRING_ENUM_NO_PAIRING", 0);
        FAMILY_PAIRING_ENUM_NO_PAIRING = enumC1749980vdk;
        EnumC1749980vdk enumC1749980vdk2 = new EnumC1749980vdk("FAMILY_PAIRING_ENUM_PARENT", 1);
        FAMILY_PAIRING_ENUM_PARENT = enumC1749980vdk2;
        EnumC1749980vdk enumC1749980vdk3 = new EnumC1749980vdk("FAMILY_PAIRING_ENUM_CHILD", 2);
        FAMILY_PAIRING_ENUM_CHILD = enumC1749980vdk3;
        EnumC1749980vdk[] enumC1749980vdkArr = {enumC1749980vdk, enumC1749980vdk2, enumC1749980vdk3};
        LL = enumC1749980vdkArr;
        LLILLJJLI = new C2254308sP(enumC1749980vdkArr);
        Companion = new Object() { // from class: X.0vdn
        };
    }

    public static EnumC1749980vdk[] values() {
        return (EnumC1749980vdk[]) LL.clone();
    }

    public static EnumC1749980vdk valueOf(String str) {
        return (EnumC1749980vdk) C08FF.LIZ(EnumC1749980vdk.class, str);
    }

    public EnumC1749980vdk(String str, int i) {
    }
}
