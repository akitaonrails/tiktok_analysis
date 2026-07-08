package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QPT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPT {
    public static final C0QPT EC_DOUBLE_ISOLATE;
    public static final C0QPT EC_SINGLE_ISOLATE;
    public static final C0QPT ENTRANCE_ISOLATE;
    public static final /* synthetic */ C0QPT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QPT NO_ISOLATE;
    public final String LL;

    public static InterfaceC2044707zh<C0QPT> getEntries() {
        return LLILLL;
    }

    static {
        C0QPT c0qpt = new C0QPT("NO_ISOLATE", 0, "no_isolate");
        NO_ISOLATE = c0qpt;
        C0QPT c0qpt2 = new C0QPT("EC_SINGLE_ISOLATE", 1, "ec_single_isolate");
        EC_SINGLE_ISOLATE = c0qpt2;
        C0QPT c0qpt3 = new C0QPT("EC_DOUBLE_ISOLATE", 2, "ec_double_isolate");
        EC_DOUBLE_ISOLATE = c0qpt3;
        C0QPT c0qpt4 = new C0QPT("ENTRANCE_ISOLATE", 3, "entrance_isolate");
        ENTRANCE_ISOLATE = c0qpt4;
        C0QPT[] c0qptArr = {c0qpt, c0qpt2, c0qpt3, c0qpt4};
        LLILLJJLI = c0qptArr;
        LLILLL = new C2254308sP(c0qptArr);
    }

    public static C0QPT[] values() {
        return (C0QPT[]) LLILLJJLI.clone();
    }

    public final String getStrategy() {
        return this.LL;
    }

    public static C0QPT valueOf(String str) {
        return (C0QPT) C08FF.LIZ(C0QPT.class, str);
    }

    public C0QPT(String str, int i, String str2) {
        this.LL = str2;
    }
}
