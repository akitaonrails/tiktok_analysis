package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RRV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRV {
    public static final C0RRV BUTTON_2;
    public static final C0RRV BUTTON_2_NO_TEXT;
    public static final C0RRV DEFAULT;
    public static final C0RRV DISABLED;
    public static final /* synthetic */ C0RRV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0RRV SWITCH;

    public static InterfaceC2044707zh<C0RRV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RRV c0rrv = new C0RRV("DISABLED", 0);
        DISABLED = c0rrv;
        C0RRV c0rrv2 = new C0RRV(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = c0rrv2;
        C0RRV c0rrv3 = new C0RRV("SWITCH", 2);
        SWITCH = c0rrv3;
        C0RRV c0rrv4 = new C0RRV("BUTTON_2", 3);
        BUTTON_2 = c0rrv4;
        C0RRV c0rrv5 = new C0RRV("BUTTON_2_NO_TEXT", 4);
        BUTTON_2_NO_TEXT = c0rrv5;
        C0RRV[] c0rrvArr = {c0rrv, c0rrv2, c0rrv3, c0rrv4, c0rrv5};
        LL = c0rrvArr;
        LLILLJJLI = new C2254308sP(c0rrvArr);
    }

    public static C0RRV[] values() {
        return (C0RRV[]) LL.clone();
    }

    public static C0RRV valueOf(String str) {
        return (C0RRV) C08FF.LIZ(C0RRV.class, str);
    }

    public C0RRV(String str, int i) {
    }
}
