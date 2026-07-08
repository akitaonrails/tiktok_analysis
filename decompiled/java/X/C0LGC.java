package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LGC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGC {
    public static final C0LGC AIGC;
    public static final C0LGC ECOMMERCE_COMMENT;
    public static final /* synthetic */ C0LGC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LGC PHOTO_SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<C0LGC> getEntries() {
        return LLILLL;
    }

    static {
        C0LGC c0lgc = new C0LGC("ECOMMERCE_COMMENT", 0, 0);
        ECOMMERCE_COMMENT = c0lgc;
        C0LGC c0lgc2 = new C0LGC("PHOTO_SEARCH", 1, 1);
        PHOTO_SEARCH = c0lgc2;
        C0LGC c0lgc3 = new C0LGC("AIGC", 2, 2);
        AIGC = c0lgc3;
        C0LGC[] c0lgcArr = {c0lgc, c0lgc2, c0lgc3};
        LLILLJJLI = c0lgcArr;
        LLILLL = new C2254308sP(c0lgcArr);
    }

    public static C0LGC[] values() {
        return (C0LGC[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0LGC valueOf(String str) {
        return (C0LGC) C08FF.LIZ(C0LGC.class, str);
    }

    public C0LGC(String str, int i, int i2) {
        this.LL = i2;
    }
}
