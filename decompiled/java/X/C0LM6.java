package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LM6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LM6 {
    public static final C0LM6 CHECK_CAMEO_PERMISSION;
    public static final C0LM6 COMPOSITION;
    public static final C0LM6 DM_FAKE_MESSAGE;
    public static final C0LM6 DOWNLOAD;
    public static final C0LM6 DRAFT_QUERY;
    public static final C0LM6 FRAME_UPLOAD;
    public static final C0LM6 IMAGE_PREPROCESS;
    public static final C0LM6 IMAGE_UPLOAD;
    public static final /* synthetic */ C0LM6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LM6 NLE_MERGE;
    public static final C0LM6 NLE_RESTORE;
    public static final C0LM6 POST_PROCESS;
    public static final C0LM6 PROGRESS;
    public static final C0LM6 QUOTA;
    public static final C0LM6 REFRESH_FRAME;
    public static final C0LM6 SAVE_DRAFT;
    public static final C0LM6 SERVER;
    public static final C0LM6 STEP_DEFAULT;
    public static final C0LM6 UPDATE_DRAFT;
    public static final C0LM6 VIDEO_UPLOAD;
    public static final C0LM6 WAIT_FRAME_UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<C0LM6> getEntries() {
        return LLILLL;
    }

    static {
        C0LM6 c0lm6 = new C0LM6("STEP_DEFAULT", 0, LivePreviewCTASmartDisplayManager.DEFAULT);
        STEP_DEFAULT = c0lm6;
        C0LM6 c0lm62 = new C0LM6("COMPOSITION", 1, "COMPOSITION");
        COMPOSITION = c0lm62;
        C0LM6 c0lm63 = new C0LM6("REFRESH_FRAME", 2, "REFRESH_FRAME");
        REFRESH_FRAME = c0lm63;
        C0LM6 c0lm64 = new C0LM6("CHECK_CAMEO_PERMISSION", 3, "CHECK_CAMEO_PERMISSION");
        CHECK_CAMEO_PERMISSION = c0lm64;
        C0LM6 c0lm65 = new C0LM6("IMAGE_UPLOAD", 4, "IMAGE_UPLOAD");
        IMAGE_UPLOAD = c0lm65;
        C0LM6 c0lm66 = new C0LM6("VIDEO_UPLOAD", 5, "VIDEO_UPLOAD");
        VIDEO_UPLOAD = c0lm66;
        C0LM6 c0lm67 = new C0LM6("DRAFT_QUERY", 6, "DRAFT_QUERY");
        DRAFT_QUERY = c0lm67;
        C0LM6 c0lm68 = new C0LM6("FRAME_UPLOAD", 7, "FRAME_UPLOAD");
        FRAME_UPLOAD = c0lm68;
        C0LM6 c0lm69 = new C0LM6("WAIT_FRAME_UPLOAD", 8, "WAIT_FRAME_UPLOAD");
        WAIT_FRAME_UPLOAD = c0lm69;
        C0LM6 c0lm610 = new C0LM6("SERVER", 9, "SERVER");
        SERVER = c0lm610;
        C0LM6 c0lm611 = new C0LM6("DOWNLOAD", 10, "DOWNLOAD");
        DOWNLOAD = c0lm611;
        C0LM6 c0lm612 = new C0LM6("NLE_MERGE", 11, "NLE_MERGE");
        NLE_MERGE = c0lm612;
        C0LM6 c0lm613 = new C0LM6("NLE_RESTORE", 12, "NLE_RESTORE");
        NLE_RESTORE = c0lm613;
        C0LM6 c0lm614 = new C0LM6("QUOTA", 13, "QUOTA");
        QUOTA = c0lm614;
        C0LM6 c0lm615 = new C0LM6("IMAGE_PREPROCESS", 14, "IMAGE_PREPROCESS");
        IMAGE_PREPROCESS = c0lm615;
        C0LM6 c0lm616 = new C0LM6("PROGRESS", 15, "PROGRESS");
        PROGRESS = c0lm616;
        C0LM6 c0lm617 = new C0LM6("POST_PROCESS", 16, "POST_PROCESSING");
        POST_PROCESS = c0lm617;
        C0LM6 c0lm618 = new C0LM6("DM_FAKE_MESSAGE", 17, "DM_FAKE_MESSAGE");
        DM_FAKE_MESSAGE = c0lm618;
        C0LM6 c0lm619 = new C0LM6("UPDATE_DRAFT", 18, "UPDATE_DRAFT");
        UPDATE_DRAFT = c0lm619;
        C0LM6 c0lm620 = new C0LM6("SAVE_DRAFT", 19, "SAVE_DRAFT");
        SAVE_DRAFT = c0lm620;
        C0LM6[] c0lm6Arr = {c0lm6, c0lm62, c0lm63, c0lm64, c0lm65, c0lm66, c0lm67, c0lm68, c0lm69, c0lm610, c0lm611, c0lm612, c0lm613, c0lm614, c0lm615, c0lm616, c0lm617, c0lm618, c0lm619, c0lm620};
        LLILLJJLI = c0lm6Arr;
        LLILLL = new C2254308sP(c0lm6Arr);
    }

    public static C0LM6[] values() {
        return (C0LM6[]) LLILLJJLI.clone();
    }

    public final String getStepName() {
        return this.LL;
    }

    public static C0LM6 valueOf(String str) {
        return (C0LM6) C08FF.LIZ(C0LM6.class, str);
    }

    public C0LM6(String str, int i, String str2) {
        this.LL = str2;
    }
}
