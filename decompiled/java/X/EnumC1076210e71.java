package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1076210e71 {
    public static final EnumC1076210e71 COARSE;
    public static final /* synthetic */ EnumC1076210e71[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1076210e71 NO_PERMISSION;
    public static final EnumC1076210e71 PRECISE;

    public static InterfaceC2044707zh<EnumC1076210e71> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1076210e71 enumC1076210e71 = new EnumC1076210e71("NO_PERMISSION", 0);
        NO_PERMISSION = enumC1076210e71;
        EnumC1076210e71 enumC1076210e712 = new EnumC1076210e71("COARSE", 1);
        COARSE = enumC1076210e712;
        EnumC1076210e71 enumC1076210e713 = new EnumC1076210e71("PRECISE", 2);
        PRECISE = enumC1076210e713;
        EnumC1076210e71[] enumC1076210e71Arr = {enumC1076210e71, enumC1076210e712, enumC1076210e713};
        LL = enumC1076210e71Arr;
        LLILLJJLI = new C2254308sP(enumC1076210e71Arr);
    }

    public static EnumC1076210e71[] values() {
        return (EnumC1076210e71[]) LL.clone();
    }

    public static EnumC1076210e71 valueOf(String str) {
        return (EnumC1076210e71) C08FF.LIZ(EnumC1076210e71.class, str);
    }

    public EnumC1076210e71(String str, int i) {
    }
}
