package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154300g8y {
    public static final EnumC1154300g8y CLIENT_KEY_TYPE_PROD;
    public static final EnumC1154300g8y CLIENT_KEY_TYPE_SANDBOX;
    public static final EnumC1154300g8y CLIENT_KEY_TYPE_TEST;
    public static final C1154310g8z Companion;
    public static final /* synthetic */ EnumC1154300g8y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154300g8y> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0g8z] */
    static {
        EnumC1154300g8y enumC1154300g8y = new EnumC1154300g8y("CLIENT_KEY_TYPE_PROD", 0);
        CLIENT_KEY_TYPE_PROD = enumC1154300g8y;
        EnumC1154300g8y enumC1154300g8y2 = new EnumC1154300g8y("CLIENT_KEY_TYPE_TEST", 1);
        CLIENT_KEY_TYPE_TEST = enumC1154300g8y2;
        EnumC1154300g8y enumC1154300g8y3 = new EnumC1154300g8y("CLIENT_KEY_TYPE_SANDBOX", 2);
        CLIENT_KEY_TYPE_SANDBOX = enumC1154300g8y3;
        EnumC1154300g8y[] enumC1154300g8yArr = {enumC1154300g8y, enumC1154300g8y2, enumC1154300g8y3};
        LL = enumC1154300g8yArr;
        LLILLJJLI = new C2254308sP(enumC1154300g8yArr);
        Companion = new Object() { // from class: X.0g8z
        };
    }

    public static EnumC1154300g8y[] values() {
        return (EnumC1154300g8y[]) LL.clone();
    }

    public static EnumC1154300g8y valueOf(String str) {
        return (EnumC1154300g8y) C08FF.LIZ(EnumC1154300g8y.class, str);
    }

    public EnumC1154300g8y(String str, int i) {
    }
}
