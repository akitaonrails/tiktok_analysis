package X;

/* JADX INFO: renamed from: X.0j9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269840j9K {
    DURATION_TYPE_CAPTURE(0),
    DURATION_TYPE_PRE_EFFECT(1),
    DURATION_TYPE_PRE_ENCODE(2),
    DURATION_TYPE_LIVE(3),
    DURATION_TYPE_LINKMIC(3);

    public final int LL;

    public static EnumC1269840j9K valueOf(String str) {
        return (EnumC1269840j9K) C08FF.LIZ(EnumC1269840j9K.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC1269840j9K(int i) {
        this.LL = i;
    }
}
