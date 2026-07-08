package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UWY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWY {
    public static final C0UWY BAD_CONNECTION;
    public static final C0UWY DEFAULT;
    public static final C0UWY GOOD_CONNECTION;
    public static final /* synthetic */ C0UWY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0UWY TESTING;

    public static InterfaceC2044707zh<C0UWY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UWY c0uwy = new C0UWY(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0uwy;
        C0UWY c0uwy2 = new C0UWY("TESTING", 1);
        TESTING = c0uwy2;
        C0UWY c0uwy3 = new C0UWY("GOOD_CONNECTION", 2);
        GOOD_CONNECTION = c0uwy3;
        C0UWY c0uwy4 = new C0UWY("BAD_CONNECTION", 3);
        BAD_CONNECTION = c0uwy4;
        C0UWY[] c0uwyArr = {c0uwy, c0uwy2, c0uwy3, c0uwy4};
        LL = c0uwyArr;
        LLILLJJLI = new C2254308sP(c0uwyArr);
    }

    public static C0UWY[] values() {
        return (C0UWY[]) LL.clone();
    }

    public static C0UWY valueOf(String str) {
        return (C0UWY) C08FF.LIZ(C0UWY.class, str);
    }

    public C0UWY(String str, int i) {
    }
}
