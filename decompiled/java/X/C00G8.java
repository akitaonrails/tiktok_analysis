package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00G8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00G8 {
    public static final C00G8 DEFAULT;
    public static final /* synthetic */ C00G8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00G8 TOKOPEDIA;
    public final int LL;

    public static InterfaceC2044707zh<C00G8> getEntries() {
        return LLILLL;
    }

    static {
        C00G8 c00g8 = new C00G8(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c00g8;
        C00G8 c00g82 = new C00G8("TOKOPEDIA", 1, 1);
        TOKOPEDIA = c00g82;
        C00G8[] c00g8Arr = {c00g8, c00g82};
        LLILLJJLI = c00g8Arr;
        LLILLL = new C2254308sP(c00g8Arr);
    }

    public static C00G8[] values() {
        return (C00G8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C00G8 valueOf(String str) {
        return (C00G8) C08FF.LIZ(C00G8.class, str);
    }

    public C00G8(String str, int i, int i2) {
        this.LL = i2;
    }
}
