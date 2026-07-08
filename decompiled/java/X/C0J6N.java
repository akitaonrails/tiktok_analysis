package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J6N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J6N {
    public static final C0J6N DARK;
    public static final C0J6N DEFAULT;
    public static final /* synthetic */ C0J6N[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public static InterfaceC2044707zh<C0J6N> getEntries() {
        return LLILZIL;
    }

    static {
        C0J6N c0j6n = new C0J6N(0, R.attr.ee, -1, LivePreviewCTASmartDisplayManager.DEFAULT, true);
        DEFAULT = c0j6n;
        C0J6N c0j6n2 = new C0J6N(1, R.attr.e1, -16777216, "DARK", false);
        DARK = c0j6n2;
        C0J6N[] c0j6nArr = {c0j6n, c0j6n2};
        LLILZ = c0j6nArr;
        LLILZIL = new C2254308sP(c0j6nArr);
    }

    public static C0J6N[] values() {
        return (C0J6N[]) LLILZ.clone();
    }

    public final int getColorResId() {
        return this.LL;
    }

    public final int getDefaultColor() {
        return this.LLILLJJLI;
    }

    public final boolean getHasShadow() {
        return this.LLILLL;
    }

    public static C0J6N valueOf(String str) {
        return (C0J6N) C08FF.LIZ(C0J6N.class, str);
    }

    public C0J6N(int i, int i2, int i3, String str, boolean z) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = z;
    }
}
