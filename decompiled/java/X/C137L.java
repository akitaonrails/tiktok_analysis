package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.137L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C137L {
    public static final C137K LL;
    public static final C137M LLILLJJLI;
    public static final /* synthetic */ C137L[] LLILLL;

    public C137L() {
        throw null;
    }

    public abstract C137H<Object> LIZJ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.137M] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.137K] */
    static {
        ?? r3 = new C137L() { // from class: X.137K
            @Override // X.C137L
            public final C137H<Object> LIZJ() {
                return C137I.LL;
            }
        };
        LL = r3;
        ?? r2 = new C137L() { // from class: X.137M
            @Override // X.C137L
            public final C137H<Object> LIZJ() {
                return C137J.LL;
            }
        };
        LLILLJJLI = r2;
        LLILLL = new C137L[]{r3, r2};
    }

    public static C137L[] values() {
        return (C137L[]) LLILLL.clone();
    }

    public static C137L valueOf(String str) {
        return (C137L) C08FF.LIZ(C137L.class, str);
    }

    public C137L(String str, int i) {
    }
}
