package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4E {
    public static final C0N4E ACTUALLY_USED;
    public static final C0N4E AWEME_EXPIRED_IN_USED;
    public static final C0N4E DEFAULT;
    public static final /* synthetic */ C0N4E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4E PAGE_SELECTED;
    public static final C0N4E VIDEO_INVALID_IN_USED;
    public static final C0N4E VIDEO_INVALID_PRE_CHECK;
    public final int LL;

    public static InterfaceC2044707zh<C0N4E> getEntries() {
        return LLILLL;
    }

    static {
        C0N4E c0n4e = new C0N4E(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n4e;
        C0N4E c0n4e2 = new C0N4E("ACTUALLY_USED", 1, 200);
        ACTUALLY_USED = c0n4e2;
        C0N4E c0n4e3 = new C0N4E("PAGE_SELECTED", 2, 201);
        PAGE_SELECTED = c0n4e3;
        C0N4E c0n4e4 = new C0N4E("VIDEO_INVALID_PRE_CHECK", 3, 401);
        VIDEO_INVALID_PRE_CHECK = c0n4e4;
        C0N4E c0n4e5 = new C0N4E("VIDEO_INVALID_IN_USED", 4, 402);
        VIDEO_INVALID_IN_USED = c0n4e5;
        C0N4E c0n4e6 = new C0N4E("AWEME_EXPIRED_IN_USED", 5, 403);
        AWEME_EXPIRED_IN_USED = c0n4e6;
        C0N4E[] c0n4eArr = {c0n4e, c0n4e2, c0n4e3, c0n4e4, c0n4e5, c0n4e6};
        LLILLJJLI = c0n4eArr;
        LLILLL = new C2254308sP(c0n4eArr);
    }

    public static C0N4E[] values() {
        return (C0N4E[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0N4E valueOf(String str) {
        return (C0N4E) C08FF.LIZ(C0N4E.class, str);
    }

    public C0N4E(String str, int i, int i2) {
        this.LL = i2;
    }
}
