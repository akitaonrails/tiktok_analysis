package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10o9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19356710o9 {
    public static final EnumC19356710o9 ALWAYS;
    public static final /* synthetic */ EnumC19356710o9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19356710o9 NONE;
    public static final EnumC19356710o9 ONLY_BOTTOM;
    public static final EnumC19356710o9 ONLY_TOP;

    public static InterfaceC2044707zh<EnumC19356710o9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19356710o9 enumC19356710o9 = new EnumC19356710o9("ONLY_TOP", 0);
        ONLY_TOP = enumC19356710o9;
        EnumC19356710o9 enumC19356710o92 = new EnumC19356710o9("ONLY_BOTTOM", 1);
        ONLY_BOTTOM = enumC19356710o92;
        EnumC19356710o9 enumC19356710o93 = new EnumC19356710o9("ALWAYS", 2);
        ALWAYS = enumC19356710o93;
        EnumC19356710o9 enumC19356710o94 = new EnumC19356710o9("NONE", 3);
        NONE = enumC19356710o94;
        EnumC19356710o9[] enumC19356710o9Arr = {enumC19356710o9, enumC19356710o92, enumC19356710o93, enumC19356710o94};
        LL = enumC19356710o9Arr;
        LLILLJJLI = new C2254308sP(enumC19356710o9Arr);
    }

    public static EnumC19356710o9[] values() {
        return (EnumC19356710o9[]) LL.clone();
    }

    public static EnumC19356710o9 valueOf(String str) {
        return (EnumC19356710o9) C08FF.LIZ(EnumC19356710o9.class, str);
    }

    public EnumC19356710o9(String str, int i) {
    }
}
