package X;

/* JADX INFO: renamed from: X.0cJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1007150cJd {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_SCREEN(1);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        return this == STREAM_INDEX_MAIN ? "kStreamIndexMain" : "kStreamIndexScreen";
    }

    public int value() {
        return this.LL;
    }

    public static EnumC1007150cJd valueOf(String str) {
        return (EnumC1007150cJd) C08FF.LIZ(EnumC1007150cJd.class, str);
    }

    EnumC1007150cJd(int i) {
        this.LL = i;
    }
}
