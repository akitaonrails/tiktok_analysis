package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BV {
    public static final C00BV DEFAULT;
    public static final /* synthetic */ C00BV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BV NONE;

    public static InterfaceC2044707zh<C00BV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BV c00bv = new C00BV(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c00bv;
        C00BV c00bv2 = new C00BV("NONE", 1);
        NONE = c00bv2;
        C00BV[] c00bvArr = {c00bv, c00bv2};
        LL = c00bvArr;
        LLILLJJLI = new C2254308sP(c00bvArr);
    }

    public static C00BV[] values() {
        return (C00BV[]) LL.clone();
    }

    public static C00BV valueOf(String str) {
        return (C00BV) C08FF.LIZ(C00BV.class, str);
    }

    public C00BV(String str, int i) {
    }
}
