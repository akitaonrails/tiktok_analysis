package X;

/* JADX INFO: renamed from: X.0TPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC746240TPa {
    BPEA_ENTRY(0),
    DIRECT_AUTH(1);

    public final int LL;

    public static EnumC746240TPa valueOf(String str) {
        return (EnumC746240TPa) C08FF.LIZ(EnumC746240TPa.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC746240TPa(int i) {
        this.LL = i;
    }
}
