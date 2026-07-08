package X;

/* JADX INFO: renamed from: X.14AX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14AX {
    CLOSE_REASON_MASK("mask_click_close"),
    CLOSE_REASON_BACK("back_close"),
    CLOSE_REASON_APP("app_close"),
    CLOSE_FB_MASK("close_fb_mask"),
    CLOSE_FB_CLOSE("close_fb_close"),
    CLOSE_FB_FEEDBACK("close_fb_feedback"),
    CLOSE_FB_SYSTEM("close_fb_system");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static C14AX valueOf(String str) {
        return (C14AX) C08FF.LIZ(C14AX.class, str);
    }

    C14AX(String str) {
        this.LL = str;
    }
}
