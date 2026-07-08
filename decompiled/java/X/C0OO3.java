package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OO3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO3 {
    public static final C0OO3 AUTO_SHARE_POST_GUIDE;
    public static final C0OO3 BUBBLE_EXPIRE_CARD;
    public static final C0OO3 DEFAULT;
    public static final /* synthetic */ C0OO3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OO3 POSTSCRIPT_GUIDE;
    public static final C0OO3 QUOTA_LIMIT;
    public final int LL;

    public static InterfaceC2044707zh<C0OO3> getEntries() {
        return LLILLL;
    }

    static {
        C0OO3 c0oo3 = new C0OO3(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0oo3;
        C0OO3 c0oo32 = new C0OO3("AUTO_SHARE_POST_GUIDE", 1, 1);
        AUTO_SHARE_POST_GUIDE = c0oo32;
        C0OO3 c0oo33 = new C0OO3("QUOTA_LIMIT", 2, 2);
        QUOTA_LIMIT = c0oo33;
        C0OO3 c0oo34 = new C0OO3("POSTSCRIPT_GUIDE", 3, 3);
        POSTSCRIPT_GUIDE = c0oo34;
        C0OO3 c0oo35 = new C0OO3("BUBBLE_EXPIRE_CARD", 4, 4);
        BUBBLE_EXPIRE_CARD = c0oo35;
        C0OO3[] c0oo3Arr = {c0oo3, c0oo32, c0oo33, c0oo34, c0oo35};
        LLILLJJLI = c0oo3Arr;
        LLILLL = new C2254308sP(c0oo3Arr);
    }

    public static C0OO3[] values() {
        return (C0OO3[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0OO3 valueOf(String str) {
        return (C0OO3) C08FF.LIZ(C0OO3.class, str);
    }

    public C0OO3(String str, int i, int i2) {
        this.LL = i2;
    }
}
