package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094480eaU {
    public static final EnumC1094480eaU ACTIVE;
    public static final EnumC1094480eaU FINISHED;
    public static final EnumC1094480eaU INACTIVE;
    public static final /* synthetic */ EnumC1094480eaU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1094480eaU MAXLEVEL;
    public static final EnumC1094480eaU UNKNOWN;
    public static final EnumC1094480eaU UNQUALIFIED;

    public static InterfaceC2044707zh<EnumC1094480eaU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1094480eaU enumC1094480eaU = new EnumC1094480eaU("UNQUALIFIED", 0);
        UNQUALIFIED = enumC1094480eaU;
        EnumC1094480eaU enumC1094480eaU2 = new EnumC1094480eaU("INACTIVE", 1);
        INACTIVE = enumC1094480eaU2;
        EnumC1094480eaU enumC1094480eaU3 = new EnumC1094480eaU("ACTIVE", 2);
        ACTIVE = enumC1094480eaU3;
        EnumC1094480eaU enumC1094480eaU4 = new EnumC1094480eaU("FINISHED", 3);
        FINISHED = enumC1094480eaU4;
        EnumC1094480eaU enumC1094480eaU5 = new EnumC1094480eaU("MAXLEVEL", 4);
        MAXLEVEL = enumC1094480eaU5;
        EnumC1094480eaU enumC1094480eaU6 = new EnumC1094480eaU("UNKNOWN", 5);
        UNKNOWN = enumC1094480eaU6;
        EnumC1094480eaU[] enumC1094480eaUArr = {enumC1094480eaU, enumC1094480eaU2, enumC1094480eaU3, enumC1094480eaU4, enumC1094480eaU5, enumC1094480eaU6};
        LL = enumC1094480eaUArr;
        LLILLJJLI = new C2254308sP(enumC1094480eaUArr);
    }

    public static EnumC1094480eaU[] values() {
        return (EnumC1094480eaU[]) LL.clone();
    }

    public static EnumC1094480eaU valueOf(String str) {
        return (EnumC1094480eaU) C08FF.LIZ(EnumC1094480eaU.class, str);
    }

    public EnumC1094480eaU(String str, int i) {
    }
}
