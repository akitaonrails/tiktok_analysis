package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356030DxZ {
    public static final EnumC356030DxZ AUDIO;
    public static final /* synthetic */ EnumC356030DxZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356030DxZ VIDEO;

    public static InterfaceC2044707zh<EnumC356030DxZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356030DxZ enumC356030DxZ = new EnumC356030DxZ("VIDEO", 0);
        VIDEO = enumC356030DxZ;
        EnumC356030DxZ enumC356030DxZ2 = new EnumC356030DxZ("AUDIO", 1);
        AUDIO = enumC356030DxZ2;
        EnumC356030DxZ[] enumC356030DxZArr = {enumC356030DxZ, enumC356030DxZ2};
        LL = enumC356030DxZArr;
        LLILLJJLI = new C2254308sP(enumC356030DxZArr);
    }

    public static EnumC356030DxZ[] values() {
        return (EnumC356030DxZ[]) LL.clone();
    }

    public static EnumC356030DxZ valueOf(String str) {
        return (EnumC356030DxZ) C08FF.LIZ(EnumC356030DxZ.class, str);
    }

    public EnumC356030DxZ(String str, int i) {
    }
}
