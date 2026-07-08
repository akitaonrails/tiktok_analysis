package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K6J, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6J {
    public static final C0K6J EVENT_TYPE_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6J EVENT_TYPE_SLARDAR_LOG;
    public static final C0K6J EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG;
    public static final C0K6J EVENT_TYPE_TEA_AND_SLARDAR_LOG;
    public static final C0K6J EVENT_TYPE_TEA_LOG;
    public static final /* synthetic */ C0K6J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0K6J> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K6J c0k6j = new C0K6J("EVENT_TYPE_TEA_LOG", 0);
        EVENT_TYPE_TEA_LOG = c0k6j;
        C0K6J c0k6j2 = new C0K6J("EVENT_TYPE_SLARDAR_LOG", 1);
        EVENT_TYPE_SLARDAR_LOG = c0k6j2;
        C0K6J c0k6j3 = new C0K6J("EVENT_TYPE_TEA_AND_SLARDAR_LOG", 2);
        EVENT_TYPE_TEA_AND_SLARDAR_LOG = c0k6j3;
        C0K6J c0k6j4 = new C0K6J("EVENT_TYPE_LIVE_SDK_SLARDAR_LOG", 3);
        EVENT_TYPE_LIVE_SDK_SLARDAR_LOG = c0k6j4;
        C0K6J c0k6j5 = new C0K6J("EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG", 4);
        EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG = c0k6j5;
        C0K6J[] c0k6jArr = {c0k6j, c0k6j2, c0k6j3, c0k6j4, c0k6j5};
        LL = c0k6jArr;
        LLILLJJLI = new C2254308sP(c0k6jArr);
    }

    public static C0K6J[] values() {
        return (C0K6J[]) LL.clone();
    }

    public static C0K6J valueOf(String str) {
        return (C0K6J) C08FF.LIZ(C0K6J.class, str);
    }

    public C0K6J(String str, int i) {
    }
}
