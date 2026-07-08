package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PRX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRX {
    public static final C0PRX DEFAULT;
    public static final C0PRX EMPTY;
    public static final C0PRX ERROR;
    public static final C0PRX EXPIRED;
    public static final C0PRX HIT_CORE_TABLE;
    public static final C0PRX LIMIT;
    public static final /* synthetic */ C0PRX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PRX NEED_LOGIN;
    public static final C0PRX RESTRICTED;
    public static final C0PRX SENSITIVE;

    public static InterfaceC2044707zh<C0PRX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PRX c0prx = new C0PRX(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0prx;
        C0PRX c0prx2 = new C0PRX("ERROR", 1);
        ERROR = c0prx2;
        C0PRX c0prx3 = new C0PRX("EMPTY", 2);
        EMPTY = c0prx3;
        C0PRX c0prx4 = new C0PRX("NEED_LOGIN", 3);
        NEED_LOGIN = c0prx4;
        C0PRX c0prx5 = new C0PRX("LIMIT", 4);
        LIMIT = c0prx5;
        C0PRX c0prx6 = new C0PRX("SENSITIVE", 5);
        SENSITIVE = c0prx6;
        C0PRX c0prx7 = new C0PRX("HIT_CORE_TABLE", 6);
        HIT_CORE_TABLE = c0prx7;
        C0PRX c0prx8 = new C0PRX("EXPIRED", 7);
        EXPIRED = c0prx8;
        C0PRX c0prx9 = new C0PRX("RESTRICTED", 8);
        RESTRICTED = c0prx9;
        C0PRX[] c0prxArr = {c0prx, c0prx2, c0prx3, c0prx4, c0prx5, c0prx6, c0prx7, c0prx8, c0prx9};
        LL = c0prxArr;
        LLILLJJLI = new C2254308sP(c0prxArr);
    }

    public static C0PRX[] values() {
        return (C0PRX[]) LL.clone();
    }

    public static C0PRX valueOf(String str) {
        return (C0PRX) C08FF.LIZ(C0PRX.class, str);
    }

    public C0PRX(String str, int i) {
    }
}
