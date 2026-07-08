package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.159E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C159E {
    public static final C159E ACCELERATE;
    public static final C159E ACCELERATE_DECELERATE;
    public static final C159E CUSTOM_CUBIC;
    public static final C159E DECELERATE;
    public static final C159E LINEAR;
    public static final /* synthetic */ C159E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C159E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C159E c159e = new C159E("LINEAR", 0);
        LINEAR = c159e;
        C159E c159e2 = new C159E("ACCELERATE", 1);
        ACCELERATE = c159e2;
        C159E c159e3 = new C159E("DECELERATE", 2);
        DECELERATE = c159e3;
        C159E c159e4 = new C159E("ACCELERATE_DECELERATE", 3);
        ACCELERATE_DECELERATE = c159e4;
        C159E c159e5 = new C159E("CUSTOM_CUBIC", 4);
        CUSTOM_CUBIC = c159e5;
        C159E[] c159eArr = {c159e, c159e2, c159e3, c159e4, c159e5};
        LL = c159eArr;
        LLILLJJLI = new C2254308sP(c159eArr);
    }

    public static C159E[] values() {
        return (C159E[]) LL.clone();
    }

    public static C159E valueOf(String str) {
        return (C159E) C08FF.LIZ(C159E.class, str);
    }

    public C159E(String str, int i) {
    }
}
