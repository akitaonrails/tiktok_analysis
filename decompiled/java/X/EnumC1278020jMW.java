package X;

/* JADX INFO: renamed from: X.0jMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278020jMW {
    H264Baseline(1, "base"),
    H264Main(2, "main"),
    H264High(3, "high"),
    ByteVC1Main(4, "main");

    public static final C1278500jNI Companion = new Object() { // from class: X.0jNI
    };
    public final int LL;
    public final String LLILLJJLI;

    public static EnumC1278020jMW valueOf(String str) {
        return (EnumC1278020jMW) C08FF.LIZ(EnumC1278020jMW.class, str);
    }

    public final int getProfile() {
        return this.LL;
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    EnumC1278020jMW(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
