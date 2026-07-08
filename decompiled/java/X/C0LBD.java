package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LBD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LBD {
    public static final C0LBD DEFAULT;
    public static final /* synthetic */ C0LBD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LBD ON_FAIL;
    public static final C0LBD ON_PROGRESS;
    public static final C0LBD ON_START;
    public static final C0LBD ON_SUCCESS;

    public static InterfaceC2044707zh<C0LBD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LBD c0lbd = new C0LBD(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0lbd;
        C0LBD c0lbd2 = new C0LBD("ON_START", 1);
        ON_START = c0lbd2;
        C0LBD c0lbd3 = new C0LBD("ON_PROGRESS", 2);
        ON_PROGRESS = c0lbd3;
        C0LBD c0lbd4 = new C0LBD("ON_SUCCESS", 3);
        ON_SUCCESS = c0lbd4;
        C0LBD c0lbd5 = new C0LBD("ON_FAIL", 4);
        ON_FAIL = c0lbd5;
        C0LBD[] c0lbdArr = {c0lbd, c0lbd2, c0lbd3, c0lbd4, c0lbd5};
        LL = c0lbdArr;
        LLILLJJLI = new C2254308sP(c0lbdArr);
    }

    public static C0LBD[] values() {
        return (C0LBD[]) LL.clone();
    }

    public static C0LBD valueOf(String str) {
        return (C0LBD) C08FF.LIZ(C0LBD.class, str);
    }

    public C0LBD(String str, int i) {
    }
}
