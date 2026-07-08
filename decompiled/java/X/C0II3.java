package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II3 {
    public static final C0II3 BLOCKED_BY_ANCHOR;
    public static final C0II3 BLOCK_ANCHOR;
    public static final C0II3 DEFAULT;
    public static final C0II3 DISLIKE;
    public static final /* synthetic */ C0II3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0II3 REPORT;

    public static InterfaceC2044707zh<C0II3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II3 c0ii3 = new C0II3(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0ii3;
        C0II3 c0ii32 = new C0II3("REPORT", 1);
        REPORT = c0ii32;
        C0II3 c0ii33 = new C0II3("DISLIKE", 2);
        DISLIKE = c0ii33;
        C0II3 c0ii34 = new C0II3("BLOCK_ANCHOR", 3);
        BLOCK_ANCHOR = c0ii34;
        C0II3 c0ii35 = new C0II3("BLOCKED_BY_ANCHOR", 4);
        BLOCKED_BY_ANCHOR = c0ii35;
        C0II3[] c0ii3Arr = {c0ii3, c0ii32, c0ii33, c0ii34, c0ii35};
        LL = c0ii3Arr;
        LLILLJJLI = new C2254308sP(c0ii3Arr);
    }

    public static C0II3[] values() {
        return (C0II3[]) LL.clone();
    }

    public static C0II3 valueOf(String str) {
        return (C0II3) C08FF.LIZ(C0II3.class, str);
    }

    public C0II3(String str, int i) {
    }
}
