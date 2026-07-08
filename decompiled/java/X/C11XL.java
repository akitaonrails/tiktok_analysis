package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11XL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XL {
    public static final C11XL BLUE;
    public static final C11XL DEFAULT;
    public static final /* synthetic */ C11XL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11XL RED;

    public static InterfaceC2044707zh<C11XL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C11XL c11xl = new C11XL(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c11xl;
        C11XL c11xl2 = new C11XL("RED", 1);
        RED = c11xl2;
        C11XL c11xl3 = new C11XL("BLUE", 2);
        BLUE = c11xl3;
        C11XL[] c11xlArr = {c11xl, c11xl2, c11xl3};
        LL = c11xlArr;
        LLILLJJLI = new C2254308sP(c11xlArr);
    }

    public static C11XL[] values() {
        return (C11XL[]) LL.clone();
    }

    public static C11XL valueOf(String str) {
        return (C11XL) C08FF.LIZ(C11XL.class, str);
    }

    public C11XL(String str, int i) {
    }
}
