package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q9S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q9S {
    public static final C0Q9S DEFAULT;
    public static final C0Q9S EMPTY;
    public static final C0Q9S HIT_CORE_TABLE;
    public static final C0Q9S LIMIT;
    public static final /* synthetic */ C0Q9S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Q9S LOADING;
    public static final C0Q9S NEED_LOGIN;
    public static final C0Q9S NETWORK_ERROR;
    public static final C0Q9S SENSITIVE;

    public static InterfaceC2044707zh<C0Q9S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Q9S c0q9s = new C0Q9S(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0q9s;
        C0Q9S c0q9s2 = new C0Q9S("LOADING", 1);
        LOADING = c0q9s2;
        C0Q9S c0q9s3 = new C0Q9S("EMPTY", 2);
        EMPTY = c0q9s3;
        C0Q9S c0q9s4 = new C0Q9S("NETWORK_ERROR", 3);
        NETWORK_ERROR = c0q9s4;
        C0Q9S c0q9s5 = new C0Q9S("NEED_LOGIN", 4);
        NEED_LOGIN = c0q9s5;
        C0Q9S c0q9s6 = new C0Q9S("LIMIT", 5);
        LIMIT = c0q9s6;
        C0Q9S c0q9s7 = new C0Q9S("SENSITIVE", 6);
        SENSITIVE = c0q9s7;
        C0Q9S c0q9s8 = new C0Q9S("HIT_CORE_TABLE", 7);
        HIT_CORE_TABLE = c0q9s8;
        C0Q9S[] c0q9sArr = {c0q9s, c0q9s2, c0q9s3, c0q9s4, c0q9s5, c0q9s6, c0q9s7, c0q9s8};
        LL = c0q9sArr;
        LLILLJJLI = new C2254308sP(c0q9sArr);
    }

    public static C0Q9S[] values() {
        return (C0Q9S[]) LL.clone();
    }

    public static C0Q9S valueOf(String str) {
        return (C0Q9S) C08FF.LIZ(C0Q9S.class, str);
    }

    public C0Q9S(String str, int i) {
    }
}
