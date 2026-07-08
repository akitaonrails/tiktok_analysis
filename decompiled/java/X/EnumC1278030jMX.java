package X;

/* JADX INFO: renamed from: X.0jMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278030jMX {
    VeLiveVideoCodecH264("h264"),
    VeLiveVideoCodecByteVC1("bytevc1");

    public static final C1279170jON Companion = new Object() { // from class: X.0jON
    };
    public final String LL;

    public static EnumC1278030jMX valueOf(String str) {
        return (EnumC1278030jMX) C08FF.LIZ(EnumC1278030jMX.class, str);
    }

    public final String getTag() {
        return this.LL;
    }

    EnumC1278030jMX(String str) {
        this.LL = str;
    }
}
