package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC746780TRc {
    public static final EnumC746780TRc CLIENT_STRATEGY_AI;
    public static final EnumC746780TRc CLIENT_STRATEGY_DIRECT;
    public static final EnumC746780TRc CLIENT_STRATEGY_RECOMMEND;
    public static final /* synthetic */ EnumC746780TRc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC746780TRc OTHER;
    public static final EnumC746780TRc SERVER_STRATEGY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC746780TRc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC746780TRc enumC746780TRc = new EnumC746780TRc("OTHER", 0, "other");
        OTHER = enumC746780TRc;
        EnumC746780TRc enumC746780TRc2 = new EnumC746780TRc("SERVER_STRATEGY", 1, "server_strategy");
        SERVER_STRATEGY = enumC746780TRc2;
        EnumC746780TRc enumC746780TRc3 = new EnumC746780TRc("CLIENT_STRATEGY_AI", 2, "client_strategy_ai");
        CLIENT_STRATEGY_AI = enumC746780TRc3;
        EnumC746780TRc enumC746780TRc4 = new EnumC746780TRc("CLIENT_STRATEGY_DIRECT", 3, "client_strategy_direct");
        CLIENT_STRATEGY_DIRECT = enumC746780TRc4;
        EnumC746780TRc enumC746780TRc5 = new EnumC746780TRc("CLIENT_STRATEGY_RECOMMEND", 4, "client_strategy_recommend");
        CLIENT_STRATEGY_RECOMMEND = enumC746780TRc5;
        EnumC746780TRc[] enumC746780TRcArr = {enumC746780TRc, enumC746780TRc2, enumC746780TRc3, enumC746780TRc4, enumC746780TRc5};
        LLILLJJLI = enumC746780TRcArr;
        LLILLL = new C2254308sP(enumC746780TRcArr);
    }

    public static EnumC746780TRc[] values() {
        return (EnumC746780TRc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC746780TRc valueOf(String str) {
        return (EnumC746780TRc) C08FF.LIZ(EnumC746780TRc.class, str);
    }

    public EnumC746780TRc(String str, int i, String str2) {
        this.LL = str2;
    }
}
