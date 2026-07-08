package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0app, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950230app {
    public static final EnumC950230app COHOST;
    public static final /* synthetic */ EnumC950230app[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC950230app MULTI_GUEST;
    public static final EnumC950230app SINGLE_LIVE;
    public String LL;

    public static InterfaceC2044707zh<EnumC950230app> getEntries() {
        return LLILLL;
    }

    static {
        EnumC950230app enumC950230app = new EnumC950230app("SINGLE_LIVE", 0, "single_live");
        SINGLE_LIVE = enumC950230app;
        EnumC950230app enumC950230app2 = new EnumC950230app("COHOST", 1, "cohost");
        COHOST = enumC950230app2;
        EnumC950230app enumC950230app3 = new EnumC950230app("MULTI_GUEST", 2, "multi_guest");
        MULTI_GUEST = enumC950230app3;
        EnumC950230app[] enumC950230appArr = {enumC950230app, enumC950230app2, enumC950230app3};
        LLILLJJLI = enumC950230appArr;
        LLILLL = new C2254308sP(enumC950230appArr);
    }

    public static EnumC950230app[] values() {
        return (EnumC950230app[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC950230app valueOf(String str) {
        return (EnumC950230app) C08FF.LIZ(EnumC950230app.class, str);
    }

    public final void setType(String str) {
        this.LL = str;
    }

    public EnumC950230app(String str, int i, String str2) {
        this.LL = str2;
    }
}
