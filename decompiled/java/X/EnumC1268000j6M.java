package X;

/* JADX INFO: renamed from: X.0j6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1268000j6M {
    DEFAULT("default"),
    LIVE("live"),
    LINK_MIC("linkmic"),
    GAME_LIVE("game_live"),
    GAME_DUAL_DEVICE("game_dual_device");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static EnumC1268000j6M valueOf(String str) {
        return (EnumC1268000j6M) C08FF.LIZ(EnumC1268000j6M.class, str);
    }

    EnumC1268000j6M(String str) {
        this.LL = str;
    }
}
