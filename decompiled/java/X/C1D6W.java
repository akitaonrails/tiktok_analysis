package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D6W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6W implements C1D61 {
    public static final /* synthetic */ C1D6W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1D6W ON_DATA_UPDATE;
    public static final C1D6W ON_DYNAMIC_COMPONENT_PERF_READY;
    public static final C1D6W ON_FIRST_LOAD_PERF_READY;
    public static final C1D6W ON_FIRST_SCREEN;
    public static final C1D6W ON_LOAD_FAILED;
    public static final C1D6W ON_LOAD_SUCCESS;
    public static final C1D6W ON_PAGE_START;
    public static final C1D6W ON_PAGE_UPDATE;
    public static final C1D6W ON_RECEIVED_ERROR;
    public static final C1D6W ON_RECEIVED_JAVA_ERROR;
    public static final C1D6W ON_RECEIVED_JS_ERROR;
    public static final C1D6W ON_RECEIVED_NATIVE_ERROR;
    public static final C1D6W ON_RUNTIME_READY;
    public static final C1D6W ON_TEMP_BUNDLE_READY;
    public static final C1D6W ON_TIMING_SETUP;
    public static final C1D6W ON_TIMING_UPDATE;
    public static final C1D6W ON_UPDATE_PERF_READY;
    public final String LL = name();

    public static InterfaceC2044707zh<C1D6W> getEntries() {
        return LLILLL;
    }

    static {
        C1D6W c1d6w = new C1D6W("ON_PAGE_START", 0);
        ON_PAGE_START = c1d6w;
        C1D6W c1d6w2 = new C1D6W("ON_PAGE_UPDATE", 1);
        ON_PAGE_UPDATE = c1d6w2;
        C1D6W c1d6w3 = new C1D6W("ON_DATA_UPDATE", 2);
        ON_DATA_UPDATE = c1d6w3;
        C1D6W c1d6w4 = new C1D6W("ON_LOAD_SUCCESS", 3);
        ON_LOAD_SUCCESS = c1d6w4;
        C1D6W c1d6w5 = new C1D6W("ON_LOAD_FAILED", 4);
        ON_LOAD_FAILED = c1d6w5;
        C1D6W c1d6w6 = new C1D6W("ON_RUNTIME_READY", 5);
        ON_RUNTIME_READY = c1d6w6;
        C1D6W c1d6w7 = new C1D6W("ON_FIRST_SCREEN", 6);
        ON_FIRST_SCREEN = c1d6w7;
        C1D6W c1d6w8 = new C1D6W("ON_RECEIVED_ERROR", 7);
        ON_RECEIVED_ERROR = c1d6w8;
        C1D6W c1d6w9 = new C1D6W("ON_TEMP_BUNDLE_READY", 8);
        ON_TEMP_BUNDLE_READY = c1d6w9;
        C1D6W c1d6w10 = new C1D6W("ON_FIRST_LOAD_PERF_READY", 9);
        ON_FIRST_LOAD_PERF_READY = c1d6w10;
        C1D6W c1d6w11 = new C1D6W("ON_UPDATE_PERF_READY", 10);
        ON_UPDATE_PERF_READY = c1d6w11;
        C1D6W c1d6w12 = new C1D6W("ON_DYNAMIC_COMPONENT_PERF_READY", 11);
        ON_DYNAMIC_COMPONENT_PERF_READY = c1d6w12;
        C1D6W c1d6w13 = new C1D6W("ON_TIMING_SETUP", 12);
        ON_TIMING_SETUP = c1d6w13;
        C1D6W c1d6w14 = new C1D6W("ON_TIMING_UPDATE", 13);
        ON_TIMING_UPDATE = c1d6w14;
        C1D6W c1d6w15 = new C1D6W("ON_RECEIVED_JAVA_ERROR", 14);
        ON_RECEIVED_JAVA_ERROR = c1d6w15;
        C1D6W c1d6w16 = new C1D6W("ON_RECEIVED_JS_ERROR", 15);
        ON_RECEIVED_JS_ERROR = c1d6w16;
        C1D6W c1d6w17 = new C1D6W("ON_RECEIVED_NATIVE_ERROR", 16);
        ON_RECEIVED_NATIVE_ERROR = c1d6w17;
        C1D6W[] c1d6wArr = {c1d6w, c1d6w2, c1d6w3, c1d6w4, c1d6w5, c1d6w6, c1d6w7, c1d6w8, c1d6w9, c1d6w10, c1d6w11, c1d6w12, c1d6w13, c1d6w14, c1d6w15, c1d6w16, c1d6w17};
        LLILLJJLI = c1d6wArr;
        LLILLL = new C2254308sP(c1d6wArr);
    }

    public static C1D6W[] values() {
        return (C1D6W[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static C1D6W valueOf(String str) {
        return (C1D6W) C08FF.LIZ(C1D6W.class, str);
    }

    public C1D6W(String str, int i) {
    }
}
