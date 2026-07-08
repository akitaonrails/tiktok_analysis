package X;

/* JADX INFO: renamed from: X.0jMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277890jMJ {
    LiveStreamSession_V1(1),
    LiveStreamSession_V2(2),
    LiveStreamSession_V3(3),
    LiveStreamSession_V4(4);

    public final int LL;

    public static EnumC1277890jMJ valueOf(String str) {
        return (EnumC1277890jMJ) C08FF.LIZ(EnumC1277890jMJ.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1277890jMJ(int i) {
        this.LL = i;
    }
}
