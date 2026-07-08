package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699150Rbd {
    public static final EnumC699150Rbd BUSINESS_FILTER;
    public static final EnumC699150Rbd DISPERSION_FILTER;
    public static final EnumC699150Rbd ENABLE_FILTER;
    public static final EnumC699150Rbd EXIT_FILTER;
    public static final EnumC699150Rbd FREQUENCY_FILTER;
    public static final /* synthetic */ EnumC699150Rbd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC699150Rbd PRIORITY_FILTER;
    public static final EnumC699150Rbd SERVER_DATA;

    public static InterfaceC2044707zh<EnumC699150Rbd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC699150Rbd enumC699150Rbd = new EnumC699150Rbd("SERVER_DATA", 0);
        SERVER_DATA = enumC699150Rbd;
        EnumC699150Rbd enumC699150Rbd2 = new EnumC699150Rbd("BUSINESS_FILTER", 1);
        BUSINESS_FILTER = enumC699150Rbd2;
        EnumC699150Rbd enumC699150Rbd3 = new EnumC699150Rbd("ENABLE_FILTER", 2);
        ENABLE_FILTER = enumC699150Rbd3;
        EnumC699150Rbd enumC699150Rbd4 = new EnumC699150Rbd("PRIORITY_FILTER", 3);
        PRIORITY_FILTER = enumC699150Rbd4;
        EnumC699150Rbd enumC699150Rbd5 = new EnumC699150Rbd("FREQUENCY_FILTER", 4);
        FREQUENCY_FILTER = enumC699150Rbd5;
        EnumC699150Rbd enumC699150Rbd6 = new EnumC699150Rbd("EXIT_FILTER", 5);
        EXIT_FILTER = enumC699150Rbd6;
        EnumC699150Rbd enumC699150Rbd7 = new EnumC699150Rbd("DISPERSION_FILTER", 6);
        DISPERSION_FILTER = enumC699150Rbd7;
        EnumC699150Rbd[] enumC699150RbdArr = {enumC699150Rbd, enumC699150Rbd2, enumC699150Rbd3, enumC699150Rbd4, enumC699150Rbd5, enumC699150Rbd6, enumC699150Rbd7};
        LL = enumC699150RbdArr;
        LLILLJJLI = new C2254308sP(enumC699150RbdArr);
    }

    public static EnumC699150Rbd[] values() {
        return (EnumC699150Rbd[]) LL.clone();
    }

    public static EnumC699150Rbd valueOf(String str) {
        return (EnumC699150Rbd) C08FF.LIZ(EnumC699150Rbd.class, str);
    }

    public EnumC699150Rbd(String str, int i) {
    }
}
