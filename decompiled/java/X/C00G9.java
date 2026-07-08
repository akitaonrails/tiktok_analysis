package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00G9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00G9 {
    public static final C00G9 DEFAULT;
    public static final C00G9 EIGHT_SPLIT;
    public static final /* synthetic */ C00G9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00G9 SEVEN_SPLIT;
    public final int LL;

    public static InterfaceC2044707zh<C00G9> getEntries() {
        return LLILLL;
    }

    static {
        C00G9 c00g9 = new C00G9(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c00g9;
        C00G9 c00g92 = new C00G9("SEVEN_SPLIT", 1, 1);
        SEVEN_SPLIT = c00g92;
        C00G9 c00g93 = new C00G9("EIGHT_SPLIT", 2, 2);
        EIGHT_SPLIT = c00g93;
        C00G9[] c00g9Arr = {c00g9, c00g92, c00g93};
        LLILLJJLI = c00g9Arr;
        LLILLL = new C2254308sP(c00g9Arr);
    }

    public static C00G9[] values() {
        return (C00G9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00G9 valueOf(String str) {
        return (C00G9) C08FF.LIZ(C00G9.class, str);
    }

    public C00G9(String str, int i, int i2) {
        this.LL = i2;
    }
}
