package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IIR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIR {
    public static final C0IIR BussinessApiCall;
    public static final /* synthetic */ C0IIR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0IIR MessageReceived;
    public static final C0IIR SdkCallback;
    public static final C0IIR SdkInterfaceCall;
    public static final C0IIR ServerApiCall;
    public final String LL;

    public static InterfaceC2044707zh<C0IIR> getEntries() {
        return LLILLL;
    }

    static {
        C0IIR c0iir = new C0IIR("ServerApiCall", 0, "server_api_call");
        ServerApiCall = c0iir;
        C0IIR c0iir2 = new C0IIR("MessageReceived", 1, "message_received");
        MessageReceived = c0iir2;
        C0IIR c0iir3 = new C0IIR("SdkInterfaceCall", 2, "sdk_interface_call");
        SdkInterfaceCall = c0iir3;
        C0IIR c0iir4 = new C0IIR("SdkCallback", 3, "sdk_callback");
        SdkCallback = c0iir4;
        C0IIR c0iir5 = new C0IIR("BussinessApiCall", 4, "bussiness_api_call");
        BussinessApiCall = c0iir5;
        C0IIR[] c0iirArr = {c0iir, c0iir2, c0iir3, c0iir4, c0iir5};
        LLILLJJLI = c0iirArr;
        LLILLL = new C2254308sP(c0iirArr);
    }

    public static C0IIR[] values() {
        return (C0IIR[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0IIR valueOf(String str) {
        return (C0IIR) C08FF.LIZ(C0IIR.class, str);
    }

    public C0IIR(String str, int i, String str2) {
        this.LL = str2;
    }
}
