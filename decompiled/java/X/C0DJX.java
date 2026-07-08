package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DJX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJX {
    public static final C0DJX DEFAULT;
    public static final /* synthetic */ C0DJX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DJX NEW_BIND;
    public static final C0DJX SESSION_EXPIRED;

    public static InterfaceC2044707zh<C0DJX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DJX c0djx = new C0DJX(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0djx;
        C0DJX c0djx2 = new C0DJX("SESSION_EXPIRED", 1);
        SESSION_EXPIRED = c0djx2;
        C0DJX c0djx3 = new C0DJX("NEW_BIND", 2);
        NEW_BIND = c0djx3;
        C0DJX[] c0djxArr = {c0djx, c0djx2, c0djx3};
        LL = c0djxArr;
        LLILLJJLI = new C2254308sP(c0djxArr);
    }

    public static C0DJX[] values() {
        return (C0DJX[]) LL.clone();
    }

    public static C0DJX valueOf(String str) {
        return (C0DJX) C08FF.LIZ(C0DJX.class, str);
    }

    public C0DJX(String str, int i) {
    }
}
