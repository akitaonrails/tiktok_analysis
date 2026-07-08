package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9D {
    public static final C0L9D HANDLE_ALBUM;
    public static final C0L9D HANDLE_DEEP_LINK;
    public static final C0L9D HANDLE_TEMPLATE;
    public static final /* synthetic */ C0L9D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9D SAVE_VIDEO;
    public static final C0L9D SEND_RESULT;
    public static final C0L9D UPLOAD_VIDEO;
    public String LL;

    public static InterfaceC2044707zh<C0L9D> getEntries() {
        return LLILLL;
    }

    static {
        C0L9D c0l9d = new C0L9D("HANDLE_DEEP_LINK", 0, "handle_deep_link");
        HANDLE_DEEP_LINK = c0l9d;
        C0L9D c0l9d2 = new C0L9D("HANDLE_ALBUM", 1, "handle_album");
        HANDLE_ALBUM = c0l9d2;
        C0L9D c0l9d3 = new C0L9D("SAVE_VIDEO", 2, "save_video");
        SAVE_VIDEO = c0l9d3;
        C0L9D c0l9d4 = new C0L9D("UPLOAD_VIDEO", 3, "upload_video");
        UPLOAD_VIDEO = c0l9d4;
        C0L9D c0l9d5 = new C0L9D("SEND_RESULT", 4, "send_result");
        SEND_RESULT = c0l9d5;
        C0L9D c0l9d6 = new C0L9D("HANDLE_TEMPLATE", 5, "handle_template");
        HANDLE_TEMPLATE = c0l9d6;
        C0L9D[] c0l9dArr = {c0l9d, c0l9d2, c0l9d3, c0l9d4, c0l9d5, c0l9d6};
        LLILLJJLI = c0l9dArr;
        LLILLL = new C2254308sP(c0l9dArr);
    }

    public static C0L9D[] values() {
        return (C0L9D[]) LLILLJJLI.clone();
    }

    public final String getStep() {
        return this.LL;
    }

    public static C0L9D valueOf(String str) {
        return (C0L9D) C08FF.LIZ(C0L9D.class, str);
    }

    public final void setStep(String str) {
        this.LL = str;
    }

    public C0L9D(String str, int i, String str2) {
        this.LL = str2;
    }
}
