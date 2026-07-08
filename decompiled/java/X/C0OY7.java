package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OY7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OY7 {
    public static final C0OY7 COMMENT_CLOSE;
    public static final C0OY7 COMMENT_EMPTY;
    public static final C0OY7 COMMENT_EMPTY_CREATOR;
    public static final C0OY7 DEFAULT;
    public static final C0OY7 FOLD;
    public static final /* synthetic */ C0OY7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OY7 LOADING;
    public static final C0OY7 LOAD_MORE_ERR;
    public static final C0OY7 REFRESH_ERR;

    public static InterfaceC2044707zh<C0OY7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OY7 c0oy7 = new C0OY7(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0oy7;
        C0OY7 c0oy72 = new C0OY7("COMMENT_EMPTY", 1);
        COMMENT_EMPTY = c0oy72;
        C0OY7 c0oy73 = new C0OY7("COMMENT_EMPTY_CREATOR", 2);
        COMMENT_EMPTY_CREATOR = c0oy73;
        C0OY7 c0oy74 = new C0OY7("COMMENT_CLOSE", 3);
        COMMENT_CLOSE = c0oy74;
        C0OY7 c0oy75 = new C0OY7("LOADING", 4);
        LOADING = c0oy75;
        C0OY7 c0oy76 = new C0OY7("REFRESH_ERR", 5);
        REFRESH_ERR = c0oy76;
        C0OY7 c0oy77 = new C0OY7("LOAD_MORE_ERR", 6);
        LOAD_MORE_ERR = c0oy77;
        C0OY7 c0oy78 = new C0OY7("FOLD", 7);
        FOLD = c0oy78;
        C0OY7[] c0oy7Arr = {c0oy7, c0oy72, c0oy73, c0oy74, c0oy75, c0oy76, c0oy77, c0oy78};
        LL = c0oy7Arr;
        LLILLJJLI = new C2254308sP(c0oy7Arr);
    }

    public static C0OY7[] values() {
        return (C0OY7[]) LL.clone();
    }

    public static C0OY7 valueOf(String str) {
        return (C0OY7) C08FF.LIZ(C0OY7.class, str);
    }

    public C0OY7(String str, int i) {
    }
}
