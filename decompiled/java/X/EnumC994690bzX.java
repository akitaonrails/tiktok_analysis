package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994690bzX {
    public static final EnumC994690bzX LL;
    public static final EnumC994690bzX LLILLJJLI;
    public static final EnumC994690bzX LLILLL;
    public static final /* synthetic */ EnumC994690bzX[] LLILZ;

    static {
        EnumC994690bzX enumC994690bzX = new EnumC994690bzX("INVALID", 0);
        LL = enumC994690bzX;
        EnumC994690bzX enumC994690bzX2 = new EnumC994690bzX("IN_RANGE", 1);
        LLILLJJLI = enumC994690bzX2;
        EnumC994690bzX enumC994690bzX3 = new EnumC994690bzX("OUT_RANGE", 2);
        LLILLL = enumC994690bzX3;
        EnumC994690bzX[] enumC994690bzXArr = {enumC994690bzX, enumC994690bzX2, enumC994690bzX3};
        LLILZ = enumC994690bzXArr;
        new C2254308sP(enumC994690bzXArr);
    }

    public static EnumC994690bzX[] values() {
        return (EnumC994690bzX[]) LLILZ.clone();
    }

    public static EnumC994690bzX valueOf(String str) {
        return (EnumC994690bzX) C08FF.LIZ(EnumC994690bzX.class, str);
    }

    public EnumC994690bzX(String str, int i) {
    }
}
