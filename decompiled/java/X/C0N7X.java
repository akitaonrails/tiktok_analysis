package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7X {
    public static final C0N7X DEFAULT;
    public static final /* synthetic */ C0N7X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N7X PRELOAD_CONTAINER;
    public static final C0N7X PRELOAD_CONTAINER_WITH_STRATEGY;
    public static final C0N7X PRERENDER;
    public static final C0N7X PRERENDER_AND_STRATEGY;

    public static InterfaceC2044707zh<C0N7X> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N7X c0n7x = new C0N7X(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0n7x;
        C0N7X c0n7x2 = new C0N7X("PRELOAD_CONTAINER", 1);
        PRELOAD_CONTAINER = c0n7x2;
        C0N7X c0n7x3 = new C0N7X("PRELOAD_CONTAINER_WITH_STRATEGY", 2);
        PRELOAD_CONTAINER_WITH_STRATEGY = c0n7x3;
        C0N7X c0n7x4 = new C0N7X("PRERENDER", 3);
        PRERENDER = c0n7x4;
        C0N7X c0n7x5 = new C0N7X("PRERENDER_AND_STRATEGY", 4);
        PRERENDER_AND_STRATEGY = c0n7x5;
        C0N7X[] c0n7xArr = {c0n7x, c0n7x2, c0n7x3, c0n7x4, c0n7x5};
        LL = c0n7xArr;
        LLILLJJLI = new C2254308sP(c0n7xArr);
    }

    public static C0N7X[] values() {
        return (C0N7X[]) LL.clone();
    }

    public static C0N7X valueOf(String str) {
        return (C0N7X) C08FF.LIZ(C0N7X.class, str);
    }

    public C0N7X(String str, int i) {
    }
}
