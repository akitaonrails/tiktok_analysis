package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K6G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6G {
    public static final C0K6G EVENT_TYPE_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6G EVENT_TYPE_SLARDAR_LOG;
    public static final C0K6G EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6G EVENT_TYPE_TEA_AND_SLARDAR_LOG;
    public static final C0K6G EVENT_TYPE_TEA_LOG;
    public static final /* synthetic */ C0K6G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0K6G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K6G c0k6g = new C0K6G("EVENT_TYPE_TEA_LOG", 0);
        EVENT_TYPE_TEA_LOG = c0k6g;
        C0K6G c0k6g2 = new C0K6G("EVENT_TYPE_SLARDAR_LOG", 1);
        EVENT_TYPE_SLARDAR_LOG = c0k6g2;
        C0K6G c0k6g3 = new C0K6G("EVENT_TYPE_TEA_AND_SLARDAR_LOG", 2);
        EVENT_TYPE_TEA_AND_SLARDAR_LOG = c0k6g3;
        C0K6G c0k6g4 = new C0K6G("EVENT_TYPE_LIVE_SDK_SLARDAR_LOG", 3);
        EVENT_TYPE_LIVE_SDK_SLARDAR_LOG = c0k6g4;
        C0K6G c0k6g5 = new C0K6G("EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG", 4);
        EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG = c0k6g5;
        C0K6G[] c0k6gArr = {c0k6g, c0k6g2, c0k6g3, c0k6g4, c0k6g5};
        LL = c0k6gArr;
        LLILLJJLI = new C2254308sP(c0k6gArr);
    }

    public static C0K6G[] values() {
        return (C0K6G[]) LL.clone();
    }

    public static C0K6G valueOf(String str) {
        return (C0K6G) C08FF.LIZ(C0K6G.class, str);
    }

    public C0K6G(String str, int i) {
    }
}
