package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ewL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1108030ewL {
    public static final EnumC1108030ewL CANCEL;
    public static final EnumC1108030ewL INTERRUPT;
    public static final /* synthetic */ EnumC1108030ewL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1108030ewL NULL;
    public static final EnumC1108030ewL REPLACE;
    public static final EnumC1108030ewL TIME_OUT;

    public static InterfaceC2044707zh<EnumC1108030ewL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1108030ewL enumC1108030ewL = new EnumC1108030ewL("TIME_OUT", 0);
        TIME_OUT = enumC1108030ewL;
        EnumC1108030ewL enumC1108030ewL2 = new EnumC1108030ewL("CANCEL", 1);
        CANCEL = enumC1108030ewL2;
        EnumC1108030ewL enumC1108030ewL3 = new EnumC1108030ewL("REPLACE", 2);
        REPLACE = enumC1108030ewL3;
        EnumC1108030ewL enumC1108030ewL4 = new EnumC1108030ewL("INTERRUPT", 3);
        INTERRUPT = enumC1108030ewL4;
        EnumC1108030ewL enumC1108030ewL5 = new EnumC1108030ewL("NULL", 4);
        NULL = enumC1108030ewL5;
        EnumC1108030ewL[] enumC1108030ewLArr = {enumC1108030ewL, enumC1108030ewL2, enumC1108030ewL3, enumC1108030ewL4, enumC1108030ewL5};
        LL = enumC1108030ewLArr;
        LLILLJJLI = new C2254308sP(enumC1108030ewLArr);
    }

    public static EnumC1108030ewL[] values() {
        return (EnumC1108030ewL[]) LL.clone();
    }

    public static EnumC1108030ewL valueOf(String str) {
        return (EnumC1108030ewL) C08FF.LIZ(EnumC1108030ewL.class, str);
    }

    public EnumC1108030ewL(String str, int i) {
    }
}
