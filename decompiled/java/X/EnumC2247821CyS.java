package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1CyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2247821CyS {
    public static final EnumC2247821CyS END;
    public static final /* synthetic */ EnumC2247821CyS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2247821CyS NONE;
    public static final EnumC2247821CyS START;

    public static InterfaceC2044707zh<EnumC2247821CyS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2247821CyS enumC2247821CyS = new EnumC2247821CyS("NONE", 0);
        NONE = enumC2247821CyS;
        EnumC2247821CyS enumC2247821CyS2 = new EnumC2247821CyS("START", 1);
        START = enumC2247821CyS2;
        EnumC2247821CyS enumC2247821CyS3 = new EnumC2247821CyS("END", 2);
        END = enumC2247821CyS3;
        EnumC2247821CyS[] enumC2247821CySArr = {enumC2247821CyS, enumC2247821CyS2, enumC2247821CyS3};
        LL = enumC2247821CySArr;
        LLILLJJLI = new C2254308sP(enumC2247821CySArr);
    }

    public static EnumC2247821CyS[] values() {
        return (EnumC2247821CyS[]) LL.clone();
    }

    public static EnumC2247821CyS valueOf(String str) {
        return (EnumC2247821CyS) C08FF.LIZ(EnumC2247821CyS.class, str);
    }

    public EnumC2247821CyS(String str, int i) {
    }
}
