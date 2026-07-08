package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06TT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TT {
    public static final C06TT EXIT_HANDLED;
    public static final /* synthetic */ C06TT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06TT NEED_EXIT_IMMERSIVE_FEED;

    public static InterfaceC2044707zh<C06TT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06TT c06tt = new C06TT("NEED_EXIT_IMMERSIVE_FEED", 0);
        NEED_EXIT_IMMERSIVE_FEED = c06tt;
        C06TT c06tt2 = new C06TT("EXIT_HANDLED", 1);
        EXIT_HANDLED = c06tt2;
        C06TT[] c06ttArr = {c06tt, c06tt2};
        LL = c06ttArr;
        LLILLJJLI = new C2254308sP(c06ttArr);
    }

    public static C06TT[] values() {
        return (C06TT[]) LL.clone();
    }

    public static C06TT valueOf(String str) {
        return (C06TT) C08FF.LIZ(C06TT.class, str);
    }

    public C06TT(String str, int i) {
    }
}
