package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ESS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ESS {
    public static final C0ESS DEFAULT;
    public static final C0ESS LARGE;
    public static final /* synthetic */ C0ESS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ESS MEDIUM;
    public static final C0ESS SMALL;
    public static final C0ESS XLARGE;

    public static InterfaceC2044707zh<C0ESS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ESS c0ess = new C0ESS("SMALL", 0);
        SMALL = c0ess;
        C0ESS c0ess2 = new C0ESS("MEDIUM", 1);
        MEDIUM = c0ess2;
        C0ESS c0ess3 = new C0ESS("LARGE", 2);
        LARGE = c0ess3;
        C0ESS c0ess4 = new C0ESS("XLARGE", 3);
        XLARGE = c0ess4;
        C0ESS c0ess5 = new C0ESS(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = c0ess5;
        C0ESS[] c0essArr = {c0ess, c0ess2, c0ess3, c0ess4, c0ess5};
        LL = c0essArr;
        LLILLJJLI = new C2254308sP(c0essArr);
    }

    public static C0ESS[] values() {
        return (C0ESS[]) LL.clone();
    }

    public static C0ESS valueOf(String str) {
        return (C0ESS) C08FF.LIZ(C0ESS.class, str);
    }

    public C0ESS(String str, int i) {
    }
}
