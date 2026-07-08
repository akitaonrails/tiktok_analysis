package X;

/* JADX INFO: renamed from: X.0aXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC938840aXS {
    DIVIDER_TYPE_NORMAL(0),
    DIVIDER_TYPE_SHARED_BG(1);

    public final int type;

    public static EnumC938840aXS valueOf(String str) {
        return (EnumC938840aXS) C08FF.LIZ(EnumC938840aXS.class, str);
    }

    EnumC938840aXS(int i) {
        this.type = i;
    }
}
