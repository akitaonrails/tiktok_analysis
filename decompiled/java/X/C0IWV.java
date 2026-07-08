package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IWV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IWV {
    public static final C0IWV DEFAULT;
    public static final C0IWV DISPLAYED_PLAY;
    public static final /* synthetic */ C0IWV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IWV REUSE_PLAYER;
    public static final C0IWV SMOOTH_ENTER;

    public static InterfaceC2044707zh<C0IWV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IWV c0iwv = new C0IWV(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0iwv;
        C0IWV c0iwv2 = new C0IWV("DISPLAYED_PLAY", 1);
        DISPLAYED_PLAY = c0iwv2;
        C0IWV c0iwv3 = new C0IWV("REUSE_PLAYER", 2);
        REUSE_PLAYER = c0iwv3;
        C0IWV c0iwv4 = new C0IWV("SMOOTH_ENTER", 3);
        SMOOTH_ENTER = c0iwv4;
        C0IWV[] c0iwvArr = {c0iwv, c0iwv2, c0iwv3, c0iwv4};
        LL = c0iwvArr;
        LLILLJJLI = new C2254308sP(c0iwvArr);
    }

    public static C0IWV[] values() {
        return (C0IWV[]) LL.clone();
    }

    public static C0IWV valueOf(String str) {
        return (C0IWV) C08FF.LIZ(C0IWV.class, str);
    }

    public C0IWV(String str, int i) {
    }
}
