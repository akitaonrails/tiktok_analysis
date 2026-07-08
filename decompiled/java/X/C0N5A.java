package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5A {
    public static final C0N5A BONUS_TIME;
    public static final C0N5A DEFAULT;
    public static final /* synthetic */ C0N5A[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5A MUSIC_SPOTLIGHT_FIRST_LAUNCH;
    public final int LL;

    public static InterfaceC2044707zh<C0N5A> getEntries() {
        return LLILLL;
    }

    static {
        C0N5A c0n5a = new C0N5A(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n5a;
        C0N5A c0n5a2 = new C0N5A("BONUS_TIME", 1, 1);
        BONUS_TIME = c0n5a2;
        C0N5A c0n5a3 = new C0N5A("MUSIC_SPOTLIGHT_FIRST_LAUNCH", 2, 2);
        MUSIC_SPOTLIGHT_FIRST_LAUNCH = c0n5a3;
        C0N5A[] c0n5aArr = {c0n5a, c0n5a2, c0n5a3};
        LLILLJJLI = c0n5aArr;
        LLILLL = new C2254308sP(c0n5aArr);
    }

    public static C0N5A[] values() {
        return (C0N5A[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0N5A valueOf(String str) {
        return (C0N5A) C08FF.LIZ(C0N5A.class, str);
    }

    public C0N5A(String str, int i, int i2) {
        this.LL = i2;
    }
}
