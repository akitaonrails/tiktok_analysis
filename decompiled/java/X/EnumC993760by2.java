package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0by2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993760by2 {
    public static final EnumC993760by2 CLICK;
    public static final /* synthetic */ EnumC993760by2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993760by2 SET_SELECT_EFFECT;

    public static InterfaceC2044707zh<EnumC993760by2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993760by2 enumC993760by2 = new EnumC993760by2("CLICK", 0);
        CLICK = enumC993760by2;
        EnumC993760by2 enumC993760by22 = new EnumC993760by2("SET_SELECT_EFFECT", 1);
        SET_SELECT_EFFECT = enumC993760by22;
        EnumC993760by2[] enumC993760by2Arr = {enumC993760by2, enumC993760by22};
        LL = enumC993760by2Arr;
        LLILLJJLI = new C2254308sP(enumC993760by2Arr);
    }

    public static EnumC993760by2[] values() {
        return (EnumC993760by2[]) LL.clone();
    }

    public static EnumC993760by2 valueOf(String str) {
        return (EnumC993760by2) C08FF.LIZ(EnumC993760by2.class, str);
    }

    public EnumC993760by2(String str, int i) {
    }
}
