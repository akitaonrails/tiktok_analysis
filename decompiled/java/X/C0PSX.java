package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PSX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSX {
    public static final C0PSX CLICK_TAB;
    public static final C0PSX DEFAULT;
    public static final /* synthetic */ C0PSX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PSX SWIPE;
    public final String LL;

    public static InterfaceC2044707zh<C0PSX> getEntries() {
        return LLILLL;
    }

    static {
        C0PSX c0psx = new C0PSX(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "");
        DEFAULT = c0psx;
        C0PSX c0psx2 = new C0PSX("SWIPE", 1, "swipe");
        SWIPE = c0psx2;
        C0PSX c0psx3 = new C0PSX("CLICK_TAB", 2, "click");
        CLICK_TAB = c0psx3;
        C0PSX[] c0psxArr = {c0psx, c0psx2, c0psx3};
        LLILLJJLI = c0psxArr;
        LLILLL = new C2254308sP(c0psxArr);
    }

    public static C0PSX[] values() {
        return (C0PSX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0PSX valueOf(String str) {
        return (C0PSX) C08FF.LIZ(C0PSX.class, str);
    }

    public C0PSX(String str, int i, String str2) {
        this.LL = str2;
    }
}
