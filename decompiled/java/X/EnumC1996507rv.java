package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996507rv {
    public static final /* synthetic */ EnumC1996507rv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1996507rv NETWORK_WIFI_UNAVAILABLE;
    public final String LL = "network_wifi";

    public static InterfaceC2044707zh<EnumC1996507rv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1996507rv enumC1996507rv = new EnumC1996507rv();
        NETWORK_WIFI_UNAVAILABLE = enumC1996507rv;
        EnumC1996507rv[] enumC1996507rvArr = {enumC1996507rv};
        LLILLJJLI = enumC1996507rvArr;
        LLILLL = new C2254308sP(enumC1996507rvArr);
    }

    public static EnumC1996507rv[] values() {
        return (EnumC1996507rv[]) LLILLJJLI.clone();
    }

    public final String getConfigName() {
        return this.LL;
    }

    public static EnumC1996507rv valueOf(String str) {
        return (EnumC1996507rv) C08FF.LIZ(EnumC1996507rv.class, str);
    }
}
