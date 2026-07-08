package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC518930KWt {
    public static final EnumC518930KWt LEADS_AUDIENCE_SIDE;
    public static final EnumC518930KWt LEADS_HOST_SIDE;
    public static final /* synthetic */ EnumC518930KWt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC518930KWt QUEUE;
    public static final EnumC518930KWt SERVICEPLUS_AUDIENCE_SIDE;
    public static final EnumC518930KWt SERVICEPLUS_HOST_SIDE;
    public static final EnumC518930KWt SUBSCRIPTION_AUDIENCE_SIDE;
    public static final EnumC518930KWt SUBSCRIPTION_HOST_SIDE;

    public static InterfaceC2044707zh<EnumC518930KWt> getEntries() {
        return LLILLJJLI;
    }

    public final boolean isLeadsPage() {
        return C1697810uHb.LJIIJJI(LEADS_HOST_SIDE, LEADS_AUDIENCE_SIDE).contains(this);
    }

    public final boolean isServicePlusPage() {
        return C1697810uHb.LJIIJJI(SERVICEPLUS_HOST_SIDE, SERVICEPLUS_AUDIENCE_SIDE).contains(this);
    }

    public final boolean isSubscriptionPage() {
        return C1697810uHb.LJIIJJI(SUBSCRIPTION_HOST_SIDE, SUBSCRIPTION_AUDIENCE_SIDE).contains(this);
    }

    static {
        EnumC518930KWt enumC518930KWt = new EnumC518930KWt("LEADS_HOST_SIDE", 0);
        LEADS_HOST_SIDE = enumC518930KWt;
        EnumC518930KWt enumC518930KWt2 = new EnumC518930KWt("LEADS_AUDIENCE_SIDE", 1);
        LEADS_AUDIENCE_SIDE = enumC518930KWt2;
        EnumC518930KWt enumC518930KWt3 = new EnumC518930KWt("SUBSCRIPTION_HOST_SIDE", 2);
        SUBSCRIPTION_HOST_SIDE = enumC518930KWt3;
        EnumC518930KWt enumC518930KWt4 = new EnumC518930KWt("SUBSCRIPTION_AUDIENCE_SIDE", 3);
        SUBSCRIPTION_AUDIENCE_SIDE = enumC518930KWt4;
        EnumC518930KWt enumC518930KWt5 = new EnumC518930KWt("SERVICEPLUS_HOST_SIDE", 4);
        SERVICEPLUS_HOST_SIDE = enumC518930KWt5;
        EnumC518930KWt enumC518930KWt6 = new EnumC518930KWt("SERVICEPLUS_AUDIENCE_SIDE", 5);
        SERVICEPLUS_AUDIENCE_SIDE = enumC518930KWt6;
        EnumC518930KWt enumC518930KWt7 = new EnumC518930KWt("QUEUE", 6);
        QUEUE = enumC518930KWt7;
        EnumC518930KWt[] enumC518930KWtArr = {enumC518930KWt, enumC518930KWt2, enumC518930KWt3, enumC518930KWt4, enumC518930KWt5, enumC518930KWt6, enumC518930KWt7};
        LL = enumC518930KWtArr;
        LLILLJJLI = new C2254308sP(enumC518930KWtArr);
    }

    public static EnumC518930KWt[] values() {
        return (EnumC518930KWt[]) LL.clone();
    }

    public static EnumC518930KWt valueOf(String str) {
        return (EnumC518930KWt) C08FF.LIZ(EnumC518930KWt.class, str);
    }

    public EnumC518930KWt(String str, int i) {
    }
}
