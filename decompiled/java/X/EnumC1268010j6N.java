package X;

/* JADX INFO: renamed from: X.0j6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1268010j6N {
    DEFAULT("default"),
    ANCHOR("anchor"),
    GUEST("guest");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static EnumC1268010j6N valueOf(String str) {
        return (EnumC1268010j6N) C08FF.LIZ(EnumC1268010j6N.class, str);
    }

    EnumC1268010j6N(String str) {
        this.LL = str;
    }
}
