package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009W {
    public static final /* synthetic */ C009W[] LL;

    static {
        C009W[] c009wArr = {new C009W(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0), new C009W("SHOP_PARTNER", 1, 1), new C009W("SHE", 2, 2)};
        LL = c009wArr;
        new C2254308sP(c009wArr);
    }

    public static C009W[] values() {
        return (C009W[]) LL.clone();
    }

    public static C009W valueOf(String str) {
        return (C009W) C08FF.LIZ(C009W.class, str);
    }

    public C009W(String str, int i, int i2) {
    }
}
