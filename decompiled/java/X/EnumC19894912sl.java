package X;

/* JADX INFO: renamed from: X.12sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19894912sl {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    public final char innerNodeCode;
    public final char leafNodeCode;

    public static EnumC19894912sl valueOf(String str) {
        return (EnumC19894912sl) C08FF.LIZ(EnumC19894912sl.class, str);
    }

    EnumC19894912sl(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }
}
