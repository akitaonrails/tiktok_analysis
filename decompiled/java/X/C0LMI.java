package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LMI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LMI {
    public static final C0LMI CAMEO_PERMISSION;
    public static final C0LMI DOWNLOAD;
    public static final C0LMI FACE_DETECT;
    public static final C0LMI FAKE_DM_MESSAGE;
    public static final C0LMI FLOW;
    public static final C0LMI IMAGE_PREPROCESS;
    public static final /* synthetic */ C0LMI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LMI NLE_RESTORE;
    public static final C0LMI POLLING;
    public static final C0LMI POST_PROCESS;
    public static final C0LMI QUOTA;
    public static final C0LMI SAVE_DRAFT;
    public static final C0LMI SERVER;
    public static final C0LMI UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<C0LMI> getEntries() {
        return LLILLL;
    }

    static {
        C0LMI c0lmi = new C0LMI("FLOW", 0, "flow");
        FLOW = c0lmi;
        C0LMI c0lmi2 = new C0LMI("CAMEO_PERMISSION", 1, "cameo_permission");
        CAMEO_PERMISSION = c0lmi2;
        C0LMI c0lmi3 = new C0LMI("QUOTA", 2, "quota");
        QUOTA = c0lmi3;
        C0LMI c0lmi4 = new C0LMI("IMAGE_PREPROCESS", 3, "image_preprocess");
        IMAGE_PREPROCESS = c0lmi4;
        C0LMI c0lmi5 = new C0LMI("UPLOAD", 4, "upload");
        UPLOAD = c0lmi5;
        C0LMI c0lmi6 = new C0LMI("SERVER", 5, "server");
        SERVER = c0lmi6;
        C0LMI c0lmi7 = new C0LMI("POLLING", 6, "polling");
        POLLING = c0lmi7;
        C0LMI c0lmi8 = new C0LMI("DOWNLOAD", 7, "download");
        DOWNLOAD = c0lmi8;
        C0LMI c0lmi9 = new C0LMI("POST_PROCESS", 8, "postprocess");
        POST_PROCESS = c0lmi9;
        C0LMI c0lmi10 = new C0LMI("FACE_DETECT", 9, "face_detect");
        FACE_DETECT = c0lmi10;
        C0LMI c0lmi11 = new C0LMI("FAKE_DM_MESSAGE", 10, "dm_message");
        FAKE_DM_MESSAGE = c0lmi11;
        C0LMI c0lmi12 = new C0LMI("NLE_RESTORE", 11, "nle_restore");
        NLE_RESTORE = c0lmi12;
        C0LMI c0lmi13 = new C0LMI("SAVE_DRAFT", 12, "save_draft");
        SAVE_DRAFT = c0lmi13;
        C0LMI[] c0lmiArr = {c0lmi, c0lmi2, c0lmi3, c0lmi4, c0lmi5, c0lmi6, c0lmi7, c0lmi8, c0lmi9, c0lmi10, c0lmi11, c0lmi12, c0lmi13};
        LLILLJJLI = c0lmiArr;
        LLILLL = new C2254308sP(c0lmiArr);
    }

    public static C0LMI[] values() {
        return (C0LMI[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0LMI valueOf(String str) {
        return (C0LMI) C08FF.LIZ(C0LMI.class, str);
    }

    public C0LMI(String str, int i, String str2) {
        this.LL = str2;
    }
}
