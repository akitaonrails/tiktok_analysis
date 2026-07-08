package X;

/* JADX INFO: renamed from: X.0jKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276690jKN {
    MIXED_STREAM_RENDER_MODE_HIDDEN(1),
    MIXED_STREAM_RENDER_MODE_FIT(2),
    MIXED_STREAM_RENDER_MODE_ADAPTIVE(3),
    MIXED_STREAM_RENDER_MODE_BOTTOM_CROP(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1276690jKN valueOf(String str) {
        return (EnumC1276690jKN) C08FF.LIZ(EnumC1276690jKN.class, str);
    }

    EnumC1276690jKN(int i) {
        this.LL = i;
    }
}
