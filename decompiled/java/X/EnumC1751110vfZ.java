package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1751110vfZ {
    public static final EnumC1751110vfZ EMPTY;
    public static final EnumC1751110vfZ FAILED;
    public static final /* synthetic */ EnumC1751110vfZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1751110vfZ REFRESHING;
    public static final EnumC1751110vfZ SUCCESS;

    public static InterfaceC2044707zh<EnumC1751110vfZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1751110vfZ enumC1751110vfZ = new EnumC1751110vfZ("REFRESHING", 0);
        REFRESHING = enumC1751110vfZ;
        EnumC1751110vfZ enumC1751110vfZ2 = new EnumC1751110vfZ("EMPTY", 1);
        EMPTY = enumC1751110vfZ2;
        EnumC1751110vfZ enumC1751110vfZ3 = new EnumC1751110vfZ("SUCCESS", 2);
        SUCCESS = enumC1751110vfZ3;
        EnumC1751110vfZ enumC1751110vfZ4 = new EnumC1751110vfZ("FAILED", 3);
        FAILED = enumC1751110vfZ4;
        EnumC1751110vfZ[] enumC1751110vfZArr = {enumC1751110vfZ, enumC1751110vfZ2, enumC1751110vfZ3, enumC1751110vfZ4};
        LL = enumC1751110vfZArr;
        LLILLJJLI = new C2254308sP(enumC1751110vfZArr);
    }

    public static EnumC1751110vfZ[] values() {
        return (EnumC1751110vfZ[]) LL.clone();
    }

    public static EnumC1751110vfZ valueOf(String str) {
        return (EnumC1751110vfZ) C08FF.LIZ(EnumC1751110vfZ.class, str);
    }

    public EnumC1751110vfZ(String str, int i) {
    }
}
