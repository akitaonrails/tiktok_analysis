package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZPT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPT {
    public static final C0ZPT DEFAULT;
    public static final /* synthetic */ C0ZPT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZPT NAME_GROUP_GUIDE;
    public static final C0ZPT PUBLIC_GROUP_TAG;
    public static final C0ZPT STREAK;

    public static InterfaceC2044707zh<C0ZPT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZPT c0zpt = new C0ZPT(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0zpt;
        C0ZPT c0zpt2 = new C0ZPT("NAME_GROUP_GUIDE", 1);
        NAME_GROUP_GUIDE = c0zpt2;
        C0ZPT c0zpt3 = new C0ZPT("STREAK", 2);
        STREAK = c0zpt3;
        C0ZPT c0zpt4 = new C0ZPT("PUBLIC_GROUP_TAG", 3);
        PUBLIC_GROUP_TAG = c0zpt4;
        C0ZPT[] c0zptArr = {c0zpt, c0zpt2, c0zpt3, c0zpt4};
        LL = c0zptArr;
        LLILLJJLI = new C2254308sP(c0zptArr);
    }

    public static C0ZPT[] values() {
        return (C0ZPT[]) LL.clone();
    }

    public static C0ZPT valueOf(String str) {
        return (C0ZPT) C08FF.LIZ(C0ZPT.class, str);
    }

    public C0ZPT(String str, int i) {
    }
}
