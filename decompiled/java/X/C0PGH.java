package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGH {
    public static final C0PGH DEFAULT;
    public static final C0PGH IMAGE_REFINE_TYPE;
    public static final /* synthetic */ C0PGH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0PGH> getEntries() {
        return LLILLL;
    }

    static {
        C0PGH c0pgh = new C0PGH(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0pgh;
        C0PGH c0pgh2 = new C0PGH("IMAGE_REFINE_TYPE", 1, 1);
        IMAGE_REFINE_TYPE = c0pgh2;
        C0PGH[] c0pghArr = {c0pgh, c0pgh2};
        LLILLJJLI = c0pghArr;
        LLILLL = new C2254308sP(c0pghArr);
    }

    public static C0PGH[] values() {
        return (C0PGH[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0PGH valueOf(String str) {
        return (C0PGH) C08FF.LIZ(C0PGH.class, str);
    }

    public C0PGH(String str, int i, int i2) {
        this.LL = i2;
    }
}
