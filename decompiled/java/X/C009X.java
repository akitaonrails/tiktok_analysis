package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009X {
    public static final C009X DEFAULT;
    public static final /* synthetic */ C009X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C009X SHE;
    public static final C009X SHOP_PARTNER;
    public final int LL;

    public static InterfaceC2044707zh<C009X> getEntries() {
        return LLILLL;
    }

    static {
        C009X c009x = new C009X(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c009x;
        C009X c009x2 = new C009X("SHOP_PARTNER", 1, 1);
        SHOP_PARTNER = c009x2;
        C009X c009x3 = new C009X("SHE", 2, 2);
        SHE = c009x3;
        C009X[] c009xArr = {c009x, c009x2, c009x3};
        LLILLJJLI = c009xArr;
        LLILLL = new C2254308sP(c009xArr);
    }

    public static C009X[] values() {
        return (C009X[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C009X valueOf(String str) {
        return (C009X) C08FF.LIZ(C009X.class, str);
    }

    public C009X(String str, int i, int i2) {
        this.LL = i2;
    }
}
