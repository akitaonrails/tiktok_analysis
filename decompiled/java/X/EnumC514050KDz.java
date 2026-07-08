package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC514050KDz {
    public static final /* synthetic */ EnumC514050KDz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC514050KDz PRE_CHECK_STATUS_ELIGIBLE;
    public static final EnumC514050KDz PRE_CHECK_STATUS_INCORRECT_ACCOUNT;
    public static final EnumC514050KDz PRE_CHECK_STATUS_INCORRECT_APP_STORE_ACCOUNT;
    public static final EnumC514050KDz PRE_CHECK_STATUS_INCORRECT_PAYMENT_CHANNEL;
    public static final EnumC514050KDz PRE_CHECK_STATUS_UNKNOWN;

    public static InterfaceC2044707zh<EnumC514050KDz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC514050KDz enumC514050KDz = new EnumC514050KDz("PRE_CHECK_STATUS_ELIGIBLE", 0);
        PRE_CHECK_STATUS_ELIGIBLE = enumC514050KDz;
        EnumC514050KDz enumC514050KDz2 = new EnumC514050KDz("PRE_CHECK_STATUS_INCORRECT_ACCOUNT", 1);
        PRE_CHECK_STATUS_INCORRECT_ACCOUNT = enumC514050KDz2;
        EnumC514050KDz enumC514050KDz3 = new EnumC514050KDz("PRE_CHECK_STATUS_INCORRECT_APP_STORE_ACCOUNT", 2);
        PRE_CHECK_STATUS_INCORRECT_APP_STORE_ACCOUNT = enumC514050KDz3;
        EnumC514050KDz enumC514050KDz4 = new EnumC514050KDz("PRE_CHECK_STATUS_INCORRECT_PAYMENT_CHANNEL", 3);
        PRE_CHECK_STATUS_INCORRECT_PAYMENT_CHANNEL = enumC514050KDz4;
        EnumC514050KDz enumC514050KDz5 = new EnumC514050KDz("PRE_CHECK_STATUS_UNKNOWN", 4);
        PRE_CHECK_STATUS_UNKNOWN = enumC514050KDz5;
        EnumC514050KDz[] enumC514050KDzArr = {enumC514050KDz, enumC514050KDz2, enumC514050KDz3, enumC514050KDz4, enumC514050KDz5};
        LL = enumC514050KDzArr;
        LLILLJJLI = new C2254308sP(enumC514050KDzArr);
    }

    public static EnumC514050KDz[] values() {
        return (EnumC514050KDz[]) LL.clone();
    }

    public static EnumC514050KDz valueOf(String str) {
        return (EnumC514050KDz) C08FF.LIZ(EnumC514050KDz.class, str);
    }

    public EnumC514050KDz(String str, int i) {
    }
}
