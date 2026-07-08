package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC382750EzZ {
    public static final EnumC382750EzZ IMAGE;
    public static final /* synthetic */ EnumC382750EzZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC382750EzZ VIDEO;

    public static InterfaceC2044707zh<EnumC382750EzZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC382750EzZ enumC382750EzZ = new EnumC382750EzZ("VIDEO", 0);
        VIDEO = enumC382750EzZ;
        EnumC382750EzZ enumC382750EzZ2 = new EnumC382750EzZ("IMAGE", 1);
        IMAGE = enumC382750EzZ2;
        EnumC382750EzZ[] enumC382750EzZArr = {enumC382750EzZ, enumC382750EzZ2};
        LL = enumC382750EzZArr;
        LLILLJJLI = new C2254308sP(enumC382750EzZArr);
    }

    public static EnumC382750EzZ[] values() {
        return (EnumC382750EzZ[]) LL.clone();
    }

    public static EnumC382750EzZ valueOf(String str) {
        return (EnumC382750EzZ) C08FF.LIZ(EnumC382750EzZ.class, str);
    }

    public EnumC382750EzZ(String str, int i) {
    }
}
