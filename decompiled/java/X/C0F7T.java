package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F7T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7T {
    public static final C0F7T DEFAULT;
    public static final /* synthetic */ C0F7T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0F7T ON_THIS_DAY_TIME;
    public static final C0F7T ON_THIS_DAY_TITLE;

    public static InterfaceC2044707zh<C0F7T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0F7T c0f7t = new C0F7T(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0f7t;
        C0F7T c0f7t2 = new C0F7T("ON_THIS_DAY_TITLE", 1);
        ON_THIS_DAY_TITLE = c0f7t2;
        C0F7T c0f7t3 = new C0F7T("ON_THIS_DAY_TIME", 2);
        ON_THIS_DAY_TIME = c0f7t3;
        C0F7T[] c0f7tArr = {c0f7t, c0f7t2, c0f7t3};
        LL = c0f7tArr;
        LLILLJJLI = new C2254308sP(c0f7tArr);
    }

    public static C0F7T[] values() {
        return (C0F7T[]) LL.clone();
    }

    public static C0F7T valueOf(String str) {
        return (C0F7T) C08FF.LIZ(C0F7T.class, str);
    }

    public C0F7T(String str, int i) {
    }
}
