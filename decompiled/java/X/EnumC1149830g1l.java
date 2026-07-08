package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1149830g1l {
    public static final EnumC1149830g1l LIVE_EXCHANGE_AND_SEND;
    public static final EnumC1149830g1l LIVE_EXCHANGE_ONLY;
    public static final /* synthetic */ EnumC1149830g1l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1149830g1l UG;

    public static InterfaceC2044707zh<EnumC1149830g1l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1149830g1l enumC1149830g1l = new EnumC1149830g1l("LIVE_EXCHANGE_ONLY", 0);
        LIVE_EXCHANGE_ONLY = enumC1149830g1l;
        EnumC1149830g1l enumC1149830g1l2 = new EnumC1149830g1l("LIVE_EXCHANGE_AND_SEND", 1);
        LIVE_EXCHANGE_AND_SEND = enumC1149830g1l2;
        EnumC1149830g1l enumC1149830g1l3 = new EnumC1149830g1l("UG", 2);
        UG = enumC1149830g1l3;
        EnumC1149830g1l[] enumC1149830g1lArr = {enumC1149830g1l, enumC1149830g1l2, enumC1149830g1l3};
        LL = enumC1149830g1lArr;
        LLILLJJLI = new C2254308sP(enumC1149830g1lArr);
    }

    public static EnumC1149830g1l[] values() {
        return (EnumC1149830g1l[]) LL.clone();
    }

    public static EnumC1149830g1l valueOf(String str) {
        return (EnumC1149830g1l) C08FF.LIZ(EnumC1149830g1l.class, str);
    }

    public EnumC1149830g1l(String str, int i) {
    }
}
