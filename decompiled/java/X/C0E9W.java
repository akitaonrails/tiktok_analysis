package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E9W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9W {
    public static final C0E9W AI_CREATE;
    public static final C0E9W AI_EXTEND;
    public static final C0E9W DEFAULT;
    public static final /* synthetic */ C0E9W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0E9W> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E9W c0e9w = new C0E9W(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0e9w;
        C0E9W c0e9w2 = new C0E9W("AI_CREATE", 1);
        AI_CREATE = c0e9w2;
        C0E9W c0e9w3 = new C0E9W("AI_EXTEND", 2);
        AI_EXTEND = c0e9w3;
        C0E9W[] c0e9wArr = {c0e9w, c0e9w2, c0e9w3};
        LL = c0e9wArr;
        LLILLJJLI = new C2254308sP(c0e9wArr);
    }

    public static C0E9W[] values() {
        return (C0E9W[]) LL.clone();
    }

    public static C0E9W valueOf(String str) {
        return (C0E9W) C08FF.LIZ(C0E9W.class, str);
    }

    public C0E9W(String str, int i) {
    }
}
