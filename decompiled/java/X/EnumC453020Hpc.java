package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC453020Hpc {
    public static final /* synthetic */ EnumC453020Hpc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC453020Hpc LONG_PRESS;
    public static final EnumC453020Hpc NORMAL;

    public static InterfaceC2044707zh<EnumC453020Hpc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC453020Hpc enumC453020Hpc = new EnumC453020Hpc("NORMAL", 0);
        NORMAL = enumC453020Hpc;
        EnumC453020Hpc enumC453020Hpc2 = new EnumC453020Hpc("LONG_PRESS", 1);
        LONG_PRESS = enumC453020Hpc2;
        EnumC453020Hpc[] enumC453020HpcArr = {enumC453020Hpc, enumC453020Hpc2};
        LL = enumC453020HpcArr;
        LLILLJJLI = new C2254308sP(enumC453020HpcArr);
    }

    public static EnumC453020Hpc[] values() {
        return (EnumC453020Hpc[]) LL.clone();
    }

    public static EnumC453020Hpc valueOf(String str) {
        return (EnumC453020Hpc) C08FF.LIZ(EnumC453020Hpc.class, str);
    }

    public EnumC453020Hpc(String str, int i) {
    }
}
