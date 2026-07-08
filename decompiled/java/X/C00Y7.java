package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00Y7 {
    public static final C00Y7 DEFAULT;
    public static final C00Y7 FYP_INNER_DRAW_EXP;
    public static final /* synthetic */ C00Y7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00Y7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00Y7 c00y7 = new C00Y7(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c00y7;
        C00Y7 c00y72 = new C00Y7("FYP_INNER_DRAW_EXP", 1);
        FYP_INNER_DRAW_EXP = c00y72;
        C00Y7[] c00y7Arr = {c00y7, c00y72};
        LL = c00y7Arr;
        LLILLJJLI = new C2254308sP(c00y7Arr);
    }

    public static C00Y7[] values() {
        return (C00Y7[]) LL.clone();
    }

    public static C00Y7 valueOf(String str) {
        return (C00Y7) C08FF.LIZ(C00Y7.class, str);
    }

    public C00Y7(String str, int i) {
    }
}
