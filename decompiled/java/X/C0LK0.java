package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LK0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LK0 {
    public static final C0LK0 LLILLJJLI;
    public static final C0LK0 LLILLL;
    public static final C0LK0 LLILZ;
    public static final C0LK0 LLILZIL;
    public static final C0LK0 LLILZLL;
    public static final C0LK0 LLIZ;
    public static final /* synthetic */ C0LK0[] LLIZLLLIL;
    public final String LL;

    static {
        C0LK0 c0lk0 = new C0LK0("COMPOSITION", 0, LivePreviewCTASmartDisplayManager.DEFAULT);
        LLILLJJLI = c0lk0;
        C0LK0 c0lk02 = new C0LK0("VIDEO_UPLOAD", 1, "COMPOSITION");
        LLILLL = c0lk02;
        C0LK0 c0lk03 = new C0LK0("DRAFT_QUERY", 2, "VIDEO_UPLOAD");
        LLILZ = c0lk03;
        C0LK0 c0lk04 = new C0LK0("SERVER", 3, C0LM6.SERVER.getStepName());
        LLILZIL = c0lk04;
        C0LK0 c0lk05 = new C0LK0("NLE_RESTORE", 4, C0LM6.NLE_RESTORE.getStepName());
        LLILZLL = c0lk05;
        C0LK0 c0lk06 = new C0LK0("UPDATE_DRAFT", 5, C0LM6.UPDATE_DRAFT.getStepName());
        LLIZ = c0lk06;
        C0LK0[] c0lk0Arr = {c0lk0, c0lk02, c0lk03, c0lk04, c0lk05, c0lk06};
        LLIZLLLIL = c0lk0Arr;
        new C2254308sP(c0lk0Arr);
    }

    public static C0LK0[] values() {
        return (C0LK0[]) LLIZLLLIL.clone();
    }

    public static C0LK0 valueOf(String str) {
        return (C0LK0) C08FF.LIZ(C0LK0.class, str);
    }

    public C0LK0(String str, int i, String str2) {
        this.LL = str2;
    }
}
