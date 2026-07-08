package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A5S, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5S {
    public static final C1A5S DEFAULT;
    public static final C1A5S DISLIKE;
    public static final C1A5S LIKE;
    public static final /* synthetic */ C1A5S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C1A5S> getEntries() {
        return LLILLL;
    }

    static {
        C1A5S c1a5s = new C1A5S(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c1a5s;
        C1A5S c1a5s2 = new C1A5S("LIKE", 1, 1);
        LIKE = c1a5s2;
        C1A5S c1a5s3 = new C1A5S("DISLIKE", 2, 2);
        DISLIKE = c1a5s3;
        C1A5S[] c1a5sArr = {c1a5s, c1a5s2, c1a5s3};
        LLILLJJLI = c1a5sArr;
        LLILLL = new C2254308sP(c1a5sArr);
    }

    public static C1A5S[] values() {
        return (C1A5S[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C1A5S valueOf(String str) {
        return (C1A5S) C08FF.LIZ(C1A5S.class, str);
    }

    public C1A5S(String str, int i, int i2) {
        this.LL = i2;
    }
}
