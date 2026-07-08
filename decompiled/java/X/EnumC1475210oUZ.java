package X;

/* JADX INFO: renamed from: X.0oUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1475210oUZ {
    DEFAULT(-1),
    CAPTION_ORIGINAL(0),
    CAPTION_TRANSLATED(1);

    public final int LL;

    public Integer getItemType() {
        return Integer.valueOf(this.LL);
    }

    public String getValue() {
        int i = this.LL;
        return i == CAPTION_ORIGINAL.LL ? "caption_original" : i == CAPTION_TRANSLATED.LL ? "caption_translated" : "default";
    }

    public static EnumC1475210oUZ valueOf(String str) {
        return (EnumC1475210oUZ) C08FF.LIZ(EnumC1475210oUZ.class, str);
    }

    EnumC1475210oUZ(int i) {
        this.LL = i;
    }
}
