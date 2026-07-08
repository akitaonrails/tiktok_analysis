package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992040bvG {
    public static final /* synthetic */ EnumC992040bvG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992040bvG NONE;
    public static final EnumC992040bvG THREE_SCREEN;
    public static final EnumC992040bvG UP_DOWN;

    public static InterfaceC2044707zh<EnumC992040bvG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992040bvG enumC992040bvG = new EnumC992040bvG("UP_DOWN", 0);
        UP_DOWN = enumC992040bvG;
        EnumC992040bvG enumC992040bvG2 = new EnumC992040bvG("THREE_SCREEN", 1);
        THREE_SCREEN = enumC992040bvG2;
        EnumC992040bvG enumC992040bvG3 = new EnumC992040bvG("NONE", 2);
        NONE = enumC992040bvG3;
        EnumC992040bvG[] enumC992040bvGArr = {enumC992040bvG, enumC992040bvG2, enumC992040bvG3};
        LL = enumC992040bvGArr;
        LLILLJJLI = new C2254308sP(enumC992040bvGArr);
    }

    public static EnumC992040bvG[] values() {
        return (EnumC992040bvG[]) LL.clone();
    }

    public static EnumC992040bvG valueOf(String str) {
        return (EnumC992040bvG) C08FF.LIZ(EnumC992040bvG.class, str);
    }

    public EnumC992040bvG(String str, int i) {
    }
}
