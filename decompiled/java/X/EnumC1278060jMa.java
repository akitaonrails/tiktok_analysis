package X;

/* JADX INFO: renamed from: X.0jMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278060jMa {
    Mono(1),
    Stereo(2);

    public static final C1278220jMq Companion = new C1278220jMq();
    public final int LL;

    public static final EnumC1278060jMa fromInt(int i) {
        Companion.getClass();
        return C1278220jMq.LIZ(i);
    }

    public static EnumC1278060jMa valueOf(String str) {
        return (EnumC1278060jMa) C08FF.LIZ(EnumC1278060jMa.class, str);
    }

    public final int getChannel() {
        return this.LL;
    }

    EnumC1278060jMa(int i) {
        this.LL = i;
    }
}
