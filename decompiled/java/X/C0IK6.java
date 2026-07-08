package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IK6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK6 {
    public static final C0IK6 DEFAULT;
    public static final C0IK6 DISLIKE;
    public static final /* synthetic */ C0IK6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0IK6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IK6 c0ik6 = new C0IK6(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0ik6;
        C0IK6 c0ik62 = new C0IK6("DISLIKE", 1);
        DISLIKE = c0ik62;
        C0IK6[] c0ik6Arr = {c0ik6, c0ik62};
        LL = c0ik6Arr;
        LLILLJJLI = new C2254308sP(c0ik6Arr);
    }

    public static C0IK6[] values() {
        return (C0IK6[]) LL.clone();
    }

    public static C0IK6 valueOf(String str) {
        return (C0IK6) C08FF.LIZ(C0IK6.class, str);
    }

    public C0IK6(String str, int i) {
    }
}
