package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GA {
    public static final C00GA DEFAULT;
    public static final /* synthetic */ C00GA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00GA WITH_INPUT;
    public final int LL;

    public static InterfaceC2044707zh<C00GA> getEntries() {
        return LLILLL;
    }

    static {
        C00GA c00ga = new C00GA(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c00ga;
        C00GA c00ga2 = new C00GA("WITH_INPUT", 1, 1);
        WITH_INPUT = c00ga2;
        C00GA[] c00gaArr = {c00ga, c00ga2};
        LLILLJJLI = c00gaArr;
        LLILLL = new C2254308sP(c00gaArr);
    }

    public static C00GA[] values() {
        return (C00GA[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C00GA valueOf(String str) {
        return (C00GA) C08FF.LIZ(C00GA.class, str);
    }

    public C00GA(String str, int i, int i2) {
        this.LL = i2;
    }
}
