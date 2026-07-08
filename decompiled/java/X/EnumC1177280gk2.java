package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177280gk2 {
    public static final EnumC1177280gk2 BOTTOM_END;
    public static final EnumC1177280gk2 BOTTOM_START;
    public static final /* synthetic */ EnumC1177280gk2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1177280gk2 TOP_END;
    public static final EnumC1177280gk2 TOP_START;

    public static InterfaceC2044707zh<EnumC1177280gk2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1177280gk2 enumC1177280gk2 = new EnumC1177280gk2("TOP_START", 0);
        TOP_START = enumC1177280gk2;
        EnumC1177280gk2 enumC1177280gk22 = new EnumC1177280gk2("TOP_END", 1);
        TOP_END = enumC1177280gk22;
        EnumC1177280gk2 enumC1177280gk23 = new EnumC1177280gk2("BOTTOM_START", 2);
        BOTTOM_START = enumC1177280gk23;
        EnumC1177280gk2 enumC1177280gk24 = new EnumC1177280gk2("BOTTOM_END", 3);
        BOTTOM_END = enumC1177280gk24;
        EnumC1177280gk2[] enumC1177280gk2Arr = {enumC1177280gk2, enumC1177280gk22, enumC1177280gk23, enumC1177280gk24};
        LL = enumC1177280gk2Arr;
        LLILLJJLI = new C2254308sP(enumC1177280gk2Arr);
    }

    public static EnumC1177280gk2[] values() {
        return (EnumC1177280gk2[]) LL.clone();
    }

    public static EnumC1177280gk2 valueOf(String str) {
        return (EnumC1177280gk2) C08FF.LIZ(EnumC1177280gk2.class, str);
    }

    public EnumC1177280gk2(String str, int i) {
    }
}
