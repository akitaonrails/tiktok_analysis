package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ope, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488280ope {
    public static final EnumC1488280ope ERR_NO_CONFIG;
    public static final EnumC1488280ope ERR_STARSHIP_STRATEGY;
    public static final EnumC1488280ope ERR_STREAM_STRATEGY;
    public static final EnumC1488280ope IDLE;
    public static final /* synthetic */ EnumC1488280ope[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1488280ope RUN_STRATEGY;

    public static InterfaceC2044707zh<EnumC1488280ope> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1488280ope enumC1488280ope = new EnumC1488280ope("IDLE", 0);
        IDLE = enumC1488280ope;
        EnumC1488280ope enumC1488280ope2 = new EnumC1488280ope("ERR_STREAM_STRATEGY", 1);
        ERR_STREAM_STRATEGY = enumC1488280ope2;
        EnumC1488280ope enumC1488280ope3 = new EnumC1488280ope("ERR_STARSHIP_STRATEGY", 2);
        ERR_STARSHIP_STRATEGY = enumC1488280ope3;
        EnumC1488280ope enumC1488280ope4 = new EnumC1488280ope("ERR_NO_CONFIG", 3);
        ERR_NO_CONFIG = enumC1488280ope4;
        EnumC1488280ope enumC1488280ope5 = new EnumC1488280ope("RUN_STRATEGY", 4);
        RUN_STRATEGY = enumC1488280ope5;
        EnumC1488280ope[] enumC1488280opeArr = {enumC1488280ope, enumC1488280ope2, enumC1488280ope3, enumC1488280ope4, enumC1488280ope5};
        LL = enumC1488280opeArr;
        LLILLJJLI = new C2254308sP(enumC1488280opeArr);
    }

    public static EnumC1488280ope[] values() {
        return (EnumC1488280ope[]) LL.clone();
    }

    public static EnumC1488280ope valueOf(String str) {
        return (EnumC1488280ope) C08FF.LIZ(EnumC1488280ope.class, str);
    }

    public EnumC1488280ope(String str, int i) {
    }
}
