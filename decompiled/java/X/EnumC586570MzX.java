package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586570MzX {
    public static final EnumC586570MzX GIFT_ONLY;
    public static final EnumC586570MzX HIGH_SCORE;
    public static final /* synthetic */ EnumC586570MzX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586570MzX NONE;

    public static InterfaceC2044707zh<EnumC586570MzX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586570MzX enumC586570MzX = new EnumC586570MzX("NONE", 0);
        NONE = enumC586570MzX;
        EnumC586570MzX enumC586570MzX2 = new EnumC586570MzX("GIFT_ONLY", 1);
        GIFT_ONLY = enumC586570MzX2;
        EnumC586570MzX enumC586570MzX3 = new EnumC586570MzX("HIGH_SCORE", 2);
        HIGH_SCORE = enumC586570MzX3;
        EnumC586570MzX[] enumC586570MzXArr = {enumC586570MzX, enumC586570MzX2, enumC586570MzX3};
        LL = enumC586570MzXArr;
        LLILLJJLI = new C2254308sP(enumC586570MzXArr);
    }

    public static EnumC586570MzX[] values() {
        return (EnumC586570MzX[]) LL.clone();
    }

    public static EnumC586570MzX valueOf(String str) {
        return (EnumC586570MzX) C08FF.LIZ(EnumC586570MzX.class, str);
    }

    public EnumC586570MzX(String str, int i) {
    }
}
