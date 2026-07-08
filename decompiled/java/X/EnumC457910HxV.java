package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC457910HxV {
    public static final EnumC457910HxV CUSTOM;
    public static final EnumC457910HxV LIFECYCLE;
    public static final /* synthetic */ EnumC457910HxV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC457910HxV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC457910HxV enumC457910HxV = new EnumC457910HxV("LIFECYCLE", 0);
        LIFECYCLE = enumC457910HxV;
        EnumC457910HxV enumC457910HxV2 = new EnumC457910HxV("CUSTOM", 1);
        CUSTOM = enumC457910HxV2;
        EnumC457910HxV[] enumC457910HxVArr = {enumC457910HxV, enumC457910HxV2};
        LL = enumC457910HxVArr;
        LLILLJJLI = new C2254308sP(enumC457910HxVArr);
    }

    public static EnumC457910HxV[] values() {
        return (EnumC457910HxV[]) LL.clone();
    }

    public static EnumC457910HxV valueOf(String str) {
        return (EnumC457910HxV) C08FF.LIZ(EnumC457910HxV.class, str);
    }

    public EnumC457910HxV(String str, int i) {
    }
}
