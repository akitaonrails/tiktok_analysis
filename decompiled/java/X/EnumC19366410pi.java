package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19366410pi {
    public static final /* synthetic */ EnumC19366410pi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19366410pi SUBSCRIPTION_CHANGE;
    public static final EnumC19366410pi SUBSCRIPTION_CREATE;
    public static final EnumC19366410pi SUBSCRIPTION_REACTIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19366410pi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19366410pi enumC19366410pi = new EnumC19366410pi("SUBSCRIPTION_CREATE", 0, "subscribeCreate");
        SUBSCRIPTION_CREATE = enumC19366410pi;
        EnumC19366410pi enumC19366410pi2 = new EnumC19366410pi("SUBSCRIPTION_CHANGE", 1, "subscribeChange");
        SUBSCRIPTION_CHANGE = enumC19366410pi2;
        EnumC19366410pi enumC19366410pi3 = new EnumC19366410pi("SUBSCRIPTION_REACTIVE", 2, "subscribeReactive");
        SUBSCRIPTION_REACTIVE = enumC19366410pi3;
        EnumC19366410pi[] enumC19366410piArr = {enumC19366410pi, enumC19366410pi2, enumC19366410pi3};
        LLILLJJLI = enumC19366410piArr;
        LLILLL = new C2254308sP(enumC19366410piArr);
    }

    public static EnumC19366410pi[] values() {
        return (EnumC19366410pi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19366410pi valueOf(String str) {
        return (EnumC19366410pi) C08FF.LIZ(EnumC19366410pi.class, str);
    }

    public EnumC19366410pi(String str, int i, String str2) {
        this.LL = str2;
    }
}
