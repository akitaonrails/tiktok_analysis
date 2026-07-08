package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579210rCJ {
    public static final EnumC1579210rCJ IMMEDIATE;
    public static final EnumC1579210rCJ LAZY;
    public static final /* synthetic */ EnumC1579210rCJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1579210rCJ SPARSE;
    public static final EnumC1579210rCJ VIDEO_FIRST_FRAME;

    public static InterfaceC2044707zh<EnumC1579210rCJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1579210rCJ enumC1579210rCJ = new EnumC1579210rCJ("IMMEDIATE", 0);
        IMMEDIATE = enumC1579210rCJ;
        EnumC1579210rCJ enumC1579210rCJ2 = new EnumC1579210rCJ("VIDEO_FIRST_FRAME", 1);
        VIDEO_FIRST_FRAME = enumC1579210rCJ2;
        EnumC1579210rCJ enumC1579210rCJ3 = new EnumC1579210rCJ("SPARSE", 2);
        SPARSE = enumC1579210rCJ3;
        EnumC1579210rCJ enumC1579210rCJ4 = new EnumC1579210rCJ("LAZY", 3);
        LAZY = enumC1579210rCJ4;
        EnumC1579210rCJ[] enumC1579210rCJArr = {enumC1579210rCJ, enumC1579210rCJ2, enumC1579210rCJ3, enumC1579210rCJ4};
        LL = enumC1579210rCJArr;
        LLILLJJLI = new C2254308sP(enumC1579210rCJArr);
    }

    public static EnumC1579210rCJ[] values() {
        return (EnumC1579210rCJ[]) LL.clone();
    }

    public static EnumC1579210rCJ valueOf(String str) {
        return (EnumC1579210rCJ) C08FF.LIZ(EnumC1579210rCJ.class, str);
    }

    public EnumC1579210rCJ(String str, int i) {
    }
}
