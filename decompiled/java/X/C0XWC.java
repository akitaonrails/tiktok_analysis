package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XWC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWC {
    public static final C0XWC DEFAULT;
    public static final /* synthetic */ C0XWC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XWC SETTING;
    public static final C0XWC SMART_LOCK;
    public final int LL;

    public static InterfaceC2044707zh<C0XWC> getEntries() {
        return LLILLL;
    }

    static {
        C0XWC c0xwc = new C0XWC(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0xwc;
        C0XWC c0xwc2 = new C0XWC("SETTING", 1, 1);
        SETTING = c0xwc2;
        C0XWC c0xwc3 = new C0XWC("SMART_LOCK", 2, 2);
        SMART_LOCK = c0xwc3;
        C0XWC[] c0xwcArr = {c0xwc, c0xwc2, c0xwc3};
        LLILLJJLI = c0xwcArr;
        LLILLL = new C2254308sP(c0xwcArr);
    }

    public static C0XWC[] values() {
        return (C0XWC[]) LLILLJJLI.clone();
    }

    public final int getServerCode() {
        return this.LL;
    }

    public static C0XWC valueOf(String str) {
        return (C0XWC) C08FF.LIZ(C0XWC.class, str);
    }

    public C0XWC(String str, int i, int i2) {
        this.LL = i2;
    }
}
