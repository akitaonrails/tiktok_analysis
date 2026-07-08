package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0R0P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0P {
    public static final C0R0P DEFAULT;
    public static final C0R0P DOUBLE_COLUMN;
    public static final /* synthetic */ C0R0P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0R0P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0R0P c0r0p = new C0R0P(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0r0p;
        C0R0P c0r0p2 = new C0R0P("DOUBLE_COLUMN", 1);
        DOUBLE_COLUMN = c0r0p2;
        C0R0P[] c0r0pArr = {c0r0p, c0r0p2};
        LL = c0r0pArr;
        LLILLJJLI = new C2254308sP(c0r0pArr);
    }

    public static C0R0P[] values() {
        return (C0R0P[]) LL.clone();
    }

    public static C0R0P valueOf(String str) {
        return (C0R0P) C08FF.LIZ(C0R0P.class, str);
    }

    public C0R0P(String str, int i) {
    }
}
