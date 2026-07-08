package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1118040fCU {
    public static final EnumC1118040fCU ANIMATION;
    public static final EnumC1118040fCU BUBBLE;
    public static final EnumC1118040fCU DOT;
    public static final /* synthetic */ EnumC1118040fCU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1118040fCU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1118040fCU enumC1118040fCU = new EnumC1118040fCU("ANIMATION", 0);
        ANIMATION = enumC1118040fCU;
        EnumC1118040fCU enumC1118040fCU2 = new EnumC1118040fCU("DOT", 1);
        DOT = enumC1118040fCU2;
        EnumC1118040fCU enumC1118040fCU3 = new EnumC1118040fCU("BUBBLE", 2);
        BUBBLE = enumC1118040fCU3;
        EnumC1118040fCU[] enumC1118040fCUArr = {enumC1118040fCU, enumC1118040fCU2, enumC1118040fCU3};
        LL = enumC1118040fCUArr;
        LLILLJJLI = new C2254308sP(enumC1118040fCUArr);
    }

    public static EnumC1118040fCU[] values() {
        return (EnumC1118040fCU[]) LL.clone();
    }

    public static EnumC1118040fCU valueOf(String str) {
        return (EnumC1118040fCU) C08FF.LIZ(EnumC1118040fCU.class, str);
    }

    public EnumC1118040fCU(String str, int i) {
    }
}
