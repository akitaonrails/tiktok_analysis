package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576010r79 {
    public static final EnumC1576010r79 GROUP;
    public static final /* synthetic */ EnumC1576010r79[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1576010r79 NONE;
    public static final EnumC1576010r79 SINGLE;
    public static final EnumC1576010r79 UNIFIED;

    public static InterfaceC2044707zh<EnumC1576010r79> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1576010r79 enumC1576010r79 = new EnumC1576010r79("NONE", 0);
        NONE = enumC1576010r79;
        EnumC1576010r79 enumC1576010r792 = new EnumC1576010r79("SINGLE", 1);
        SINGLE = enumC1576010r792;
        EnumC1576010r79 enumC1576010r793 = new EnumC1576010r79("GROUP", 2);
        GROUP = enumC1576010r793;
        EnumC1576010r79 enumC1576010r794 = new EnumC1576010r79("UNIFIED", 3);
        UNIFIED = enumC1576010r794;
        EnumC1576010r79[] enumC1576010r79Arr = {enumC1576010r79, enumC1576010r792, enumC1576010r793, enumC1576010r794};
        LL = enumC1576010r79Arr;
        LLILLJJLI = new C2254308sP(enumC1576010r79Arr);
    }

    public static EnumC1576010r79[] values() {
        return (EnumC1576010r79[]) LL.clone();
    }

    public static EnumC1576010r79 valueOf(String str) {
        return (EnumC1576010r79) C08FF.LIZ(EnumC1576010r79.class, str);
    }

    public EnumC1576010r79(String str, int i) {
    }
}
