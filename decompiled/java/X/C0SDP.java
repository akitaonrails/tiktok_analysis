package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SDP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDP {
    public static final C0SDP EMPTY_PAGE;
    public static final C0SDP ERROR_PAGE;
    public static final C0SDP FEED_LIST;
    public static final /* synthetic */ C0SDP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SDP SKY_LIGHT;
    public static final C0SDP UNKNOWN;

    public static InterfaceC2044707zh<C0SDP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SDP c0sdp = new C0SDP("UNKNOWN", 0);
        UNKNOWN = c0sdp;
        C0SDP c0sdp2 = new C0SDP("SKY_LIGHT", 1);
        SKY_LIGHT = c0sdp2;
        C0SDP c0sdp3 = new C0SDP("FEED_LIST", 2);
        FEED_LIST = c0sdp3;
        C0SDP c0sdp4 = new C0SDP("ERROR_PAGE", 3);
        ERROR_PAGE = c0sdp4;
        C0SDP c0sdp5 = new C0SDP("EMPTY_PAGE", 4);
        EMPTY_PAGE = c0sdp5;
        C0SDP[] c0sdpArr = {c0sdp, c0sdp2, c0sdp3, c0sdp4, c0sdp5};
        LL = c0sdpArr;
        LLILLJJLI = new C2254308sP(c0sdpArr);
    }

    public static C0SDP[] values() {
        return (C0SDP[]) LL.clone();
    }

    public static C0SDP valueOf(String str) {
        return (C0SDP) C08FF.LIZ(C0SDP.class, str);
    }

    public C0SDP(String str, int i) {
    }
}
