package X;

/* JADX INFO: renamed from: X.0jKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276740jKS {
    RENDER_UNKNOWN(0),
    RENDER_HIDDEN(1),
    RENDER_FIT(2),
    RENDER_ADAPTIVE(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1276740jKS valueOf(String str) {
        return (EnumC1276740jKS) C08FF.LIZ(EnumC1276740jKS.class, str);
    }

    EnumC1276740jKS(int i) {
        this.LL = i;
    }
}
