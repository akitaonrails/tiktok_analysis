package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308140k96 {
    public static final /* synthetic */ EnumC1308140k96[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1308140k96 STRONG;
    public static final EnumC1308140k96 WEAK;

    public static InterfaceC2044707zh<EnumC1308140k96> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308140k96 enumC1308140k96 = new EnumC1308140k96("STRONG", 0);
        STRONG = enumC1308140k96;
        EnumC1308140k96 enumC1308140k962 = new EnumC1308140k96("WEAK", 1);
        WEAK = enumC1308140k962;
        EnumC1308140k96[] enumC1308140k96Arr = {enumC1308140k96, enumC1308140k962};
        LL = enumC1308140k96Arr;
        LLILLJJLI = new C2254308sP(enumC1308140k96Arr);
    }

    public static EnumC1308140k96[] values() {
        return (EnumC1308140k96[]) LL.clone();
    }

    public static EnumC1308140k96 valueOf(String str) {
        return (EnumC1308140k96) C08FF.LIZ(EnumC1308140k96.class, str);
    }

    public EnumC1308140k96(String str, int i) {
    }
}
