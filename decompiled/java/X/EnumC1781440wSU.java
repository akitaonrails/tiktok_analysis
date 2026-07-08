package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781440wSU {
    public static final /* synthetic */ EnumC1781440wSU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781440wSU LYNX;
    public static final EnumC1781440wSU NATIVE;
    public static final EnumC1781440wSU NONE;

    public static InterfaceC2044707zh<EnumC1781440wSU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781440wSU enumC1781440wSU = new EnumC1781440wSU("NONE", 0);
        NONE = enumC1781440wSU;
        EnumC1781440wSU enumC1781440wSU2 = new EnumC1781440wSU("NATIVE", 1);
        NATIVE = enumC1781440wSU2;
        EnumC1781440wSU enumC1781440wSU3 = new EnumC1781440wSU("LYNX", 2);
        LYNX = enumC1781440wSU3;
        EnumC1781440wSU[] enumC1781440wSUArr = {enumC1781440wSU, enumC1781440wSU2, enumC1781440wSU3};
        LL = enumC1781440wSUArr;
        LLILLJJLI = new C2254308sP(enumC1781440wSUArr);
    }

    public static EnumC1781440wSU[] values() {
        return (EnumC1781440wSU[]) LL.clone();
    }

    public static EnumC1781440wSU valueOf(String str) {
        return (EnumC1781440wSU) C08FF.LIZ(EnumC1781440wSU.class, str);
    }

    public EnumC1781440wSU(String str, int i) {
    }
}
