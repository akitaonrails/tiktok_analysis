package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19iB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21612919iB {
    public static final EnumC21612919iB LEFT;
    public static final /* synthetic */ EnumC21612919iB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21612919iB NONE;
    public static final EnumC21612919iB RIGHT;

    public static InterfaceC2044707zh<EnumC21612919iB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21612919iB enumC21612919iB = new EnumC21612919iB("LEFT", 0);
        LEFT = enumC21612919iB;
        EnumC21612919iB enumC21612919iB2 = new EnumC21612919iB("RIGHT", 1);
        RIGHT = enumC21612919iB2;
        EnumC21612919iB enumC21612919iB3 = new EnumC21612919iB("NONE", 2);
        NONE = enumC21612919iB3;
        EnumC21612919iB[] enumC21612919iBArr = {enumC21612919iB, enumC21612919iB2, enumC21612919iB3};
        LL = enumC21612919iBArr;
        LLILLJJLI = new C2254308sP(enumC21612919iBArr);
    }

    public static EnumC21612919iB[] values() {
        return (EnumC21612919iB[]) LL.clone();
    }

    public static EnumC21612919iB valueOf(String str) {
        return (EnumC21612919iB) C08FF.LIZ(EnumC21612919iB.class, str);
    }

    public EnumC21612919iB(String str, int i) {
    }
}
