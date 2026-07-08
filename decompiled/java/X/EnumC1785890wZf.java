package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1785890wZf {
    public static final EnumC1785890wZf EMPTY;
    public static final EnumC1785890wZf FRIEND_RANKING_EMPTY;
    public static final EnumC1785890wZf FRIEND_RANKING_OPT_OUT;
    public static final /* synthetic */ EnumC1785890wZf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1785890wZf LOADING;
    public static final EnumC1785890wZf NO_NETWORK;
    public static final EnumC1785890wZf SERVER_ERROR;

    public static InterfaceC2044707zh<EnumC1785890wZf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1785890wZf enumC1785890wZf = new EnumC1785890wZf("LOADING", 0);
        LOADING = enumC1785890wZf;
        EnumC1785890wZf enumC1785890wZf2 = new EnumC1785890wZf("EMPTY", 1);
        EMPTY = enumC1785890wZf2;
        EnumC1785890wZf enumC1785890wZf3 = new EnumC1785890wZf("FRIEND_RANKING_EMPTY", 2);
        FRIEND_RANKING_EMPTY = enumC1785890wZf3;
        EnumC1785890wZf enumC1785890wZf4 = new EnumC1785890wZf("FRIEND_RANKING_OPT_OUT", 3);
        FRIEND_RANKING_OPT_OUT = enumC1785890wZf4;
        EnumC1785890wZf enumC1785890wZf5 = new EnumC1785890wZf("SERVER_ERROR", 4);
        SERVER_ERROR = enumC1785890wZf5;
        EnumC1785890wZf enumC1785890wZf6 = new EnumC1785890wZf("NO_NETWORK", 5);
        NO_NETWORK = enumC1785890wZf6;
        EnumC1785890wZf[] enumC1785890wZfArr = {enumC1785890wZf, enumC1785890wZf2, enumC1785890wZf3, enumC1785890wZf4, enumC1785890wZf5, enumC1785890wZf6};
        LL = enumC1785890wZfArr;
        LLILLJJLI = new C2254308sP(enumC1785890wZfArr);
    }

    public static EnumC1785890wZf[] values() {
        return (EnumC1785890wZf[]) LL.clone();
    }

    public static EnumC1785890wZf valueOf(String str) {
        return (EnumC1785890wZf) C08FF.LIZ(EnumC1785890wZf.class, str);
    }

    public EnumC1785890wZf(String str, int i) {
    }
}
