package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4B {
    public static final C0N4B DEFAULT;
    public static final C0N4B GSON_ERROR;
    public static final /* synthetic */ C0N4B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4B NO_DATA;
    public static final C0N4B REC_SCORE;
    public static final C0N4B SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0N4B> getEntries() {
        return LLILLL;
    }

    static {
        C0N4B c0n4b = new C0N4B(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n4b;
        C0N4B c0n4b2 = new C0N4B("SUCCESS", 1, 200);
        SUCCESS = c0n4b2;
        C0N4B c0n4b3 = new C0N4B("NO_DATA", 2, 401);
        NO_DATA = c0n4b3;
        C0N4B c0n4b4 = new C0N4B("REC_SCORE", 3, 402);
        REC_SCORE = c0n4b4;
        C0N4B c0n4b5 = new C0N4B("GSON_ERROR", 4, 403);
        GSON_ERROR = c0n4b5;
        C0N4B[] c0n4bArr = {c0n4b, c0n4b2, c0n4b3, c0n4b4, c0n4b5};
        LLILLJJLI = c0n4bArr;
        LLILLL = new C2254308sP(c0n4bArr);
    }

    public static C0N4B[] values() {
        return (C0N4B[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0N4B valueOf(String str) {
        return (C0N4B) C08FF.LIZ(C0N4B.class, str);
    }

    public C0N4B(String str, int i, int i2) {
        this.LL = i2;
    }
}
