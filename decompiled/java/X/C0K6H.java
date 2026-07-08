package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K6H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6H {
    public static final C0K6H EVENT_TYPE_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6H EVENT_TYPE_SLARDAR_LOG;
    public static final C0K6H EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6H EVENT_TYPE_TEA_AND_SLARDAR_LOG;
    public static final C0K6H EVENT_TYPE_TEA_LOG;
    public static final /* synthetic */ C0K6H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0K6H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K6H c0k6h = new C0K6H("EVENT_TYPE_TEA_LOG", 0);
        EVENT_TYPE_TEA_LOG = c0k6h;
        C0K6H c0k6h2 = new C0K6H("EVENT_TYPE_SLARDAR_LOG", 1);
        EVENT_TYPE_SLARDAR_LOG = c0k6h2;
        C0K6H c0k6h3 = new C0K6H("EVENT_TYPE_TEA_AND_SLARDAR_LOG", 2);
        EVENT_TYPE_TEA_AND_SLARDAR_LOG = c0k6h3;
        C0K6H c0k6h4 = new C0K6H("EVENT_TYPE_LIVE_SDK_SLARDAR_LOG", 3);
        EVENT_TYPE_LIVE_SDK_SLARDAR_LOG = c0k6h4;
        C0K6H c0k6h5 = new C0K6H("EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG", 4);
        EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG = c0k6h5;
        C0K6H[] c0k6hArr = {c0k6h, c0k6h2, c0k6h3, c0k6h4, c0k6h5};
        LL = c0k6hArr;
        LLILLJJLI = new C2254308sP(c0k6hArr);
    }

    public static C0K6H[] values() {
        return (C0K6H[]) LL.clone();
    }

    public static C0K6H valueOf(String str) {
        return (C0K6H) C08FF.LIZ(C0K6H.class, str);
    }

    public C0K6H(String str, int i) {
    }
}
