package X;

/* JADX INFO: renamed from: X.1AqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2191921AqU {
    V3(0, "event_v3"),
    V1(1, "event_v1"),
    LogData(2, "log_data"),
    Launch(3, "launch"),
    Terminate(4, "terminate"),
    Impression(5, "item_impression"),
    ForwardV3(6, "forward_v3"),
    Unknown(99, "unknown");

    public static final C2191891AqR Companion = new C2191891AqR();
    public final int LL;
    public final String LLILLJJLI;

    public static EnumC2191921AqU valueOf(String str) {
        return (EnumC2191921AqU) C08FF.LIZ(EnumC2191921AqU.class, str);
    }

    public final String getAlias() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    EnumC2191921AqU(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
