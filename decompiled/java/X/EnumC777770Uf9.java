package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777770Uf9 {
    public static final EnumC777770Uf9 BACK;
    public static final EnumC777770Uf9 CIRCLE_WARNING_RED;
    public static final EnumC777770Uf9 CIRCLE_WARNING_WHITE;
    public static final EnumC777770Uf9 CLOSE;
    public static final /* synthetic */ EnumC777770Uf9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC777770Uf9 NULL;
    public static final EnumC777770Uf9 TICK;
    public static final EnumC777770Uf9 TRIANGLE_WARNING_RED;
    public static final EnumC777770Uf9 TRIANGLE_WARNING_WHITE;

    public static InterfaceC2044707zh<EnumC777770Uf9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC777770Uf9 enumC777770Uf9 = new EnumC777770Uf9("CIRCLE_WARNING_RED", 0);
        CIRCLE_WARNING_RED = enumC777770Uf9;
        EnumC777770Uf9 enumC777770Uf92 = new EnumC777770Uf9("CIRCLE_WARNING_WHITE", 1);
        CIRCLE_WARNING_WHITE = enumC777770Uf92;
        EnumC777770Uf9 enumC777770Uf93 = new EnumC777770Uf9("TRIANGLE_WARNING_RED", 2);
        TRIANGLE_WARNING_RED = enumC777770Uf93;
        EnumC777770Uf9 enumC777770Uf94 = new EnumC777770Uf9("TRIANGLE_WARNING_WHITE", 3);
        TRIANGLE_WARNING_WHITE = enumC777770Uf94;
        EnumC777770Uf9 enumC777770Uf95 = new EnumC777770Uf9("BACK", 4);
        BACK = enumC777770Uf95;
        EnumC777770Uf9 enumC777770Uf96 = new EnumC777770Uf9("CLOSE", 5);
        CLOSE = enumC777770Uf96;
        EnumC777770Uf9 enumC777770Uf97 = new EnumC777770Uf9("TICK", 6);
        TICK = enumC777770Uf97;
        EnumC777770Uf9 enumC777770Uf98 = new EnumC777770Uf9("NULL", 7);
        NULL = enumC777770Uf98;
        EnumC777770Uf9[] enumC777770Uf9Arr = {enumC777770Uf9, enumC777770Uf92, enumC777770Uf93, enumC777770Uf94, enumC777770Uf95, enumC777770Uf96, enumC777770Uf97, enumC777770Uf98};
        LL = enumC777770Uf9Arr;
        LLILLJJLI = new C2254308sP(enumC777770Uf9Arr);
    }

    public static EnumC777770Uf9[] values() {
        return (EnumC777770Uf9[]) LL.clone();
    }

    public static EnumC777770Uf9 valueOf(String str) {
        return (EnumC777770Uf9) C08FF.LIZ(EnumC777770Uf9.class, str);
    }

    public EnumC777770Uf9(String str, int i) {
    }
}
