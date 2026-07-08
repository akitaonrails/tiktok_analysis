package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGG {
    public static final C0PGG EMPTY_DATA;
    public static final C0PGG FINAL_FULL_DATA;
    public static final C0PGG FINAL_RAW_DATA;
    public static final /* synthetic */ C0PGG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PGG LOCAL_CACHE_DATA;
    public static final C0PGG PREDICT_DATA;
    public static final C0PGG SSR_DATA;

    public static InterfaceC2044707zh<C0PGG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PGG c0pgg = new C0PGG("EMPTY_DATA", 0);
        EMPTY_DATA = c0pgg;
        C0PGG c0pgg2 = new C0PGG("FINAL_RAW_DATA", 1);
        FINAL_RAW_DATA = c0pgg2;
        C0PGG c0pgg3 = new C0PGG("FINAL_FULL_DATA", 2);
        FINAL_FULL_DATA = c0pgg3;
        C0PGG c0pgg4 = new C0PGG("LOCAL_CACHE_DATA", 3);
        LOCAL_CACHE_DATA = c0pgg4;
        C0PGG c0pgg5 = new C0PGG("PREDICT_DATA", 4);
        PREDICT_DATA = c0pgg5;
        C0PGG c0pgg6 = new C0PGG("SSR_DATA", 5);
        SSR_DATA = c0pgg6;
        C0PGG[] c0pggArr = {c0pgg, c0pgg2, c0pgg3, c0pgg4, c0pgg5, c0pgg6};
        LL = c0pggArr;
        LLILLJJLI = new C2254308sP(c0pggArr);
    }

    public static C0PGG[] values() {
        return (C0PGG[]) LL.clone();
    }

    public static C0PGG valueOf(String str) {
        return (C0PGG) C08FF.LIZ(C0PGG.class, str);
    }

    public C0PGG(String str, int i) {
    }
}
