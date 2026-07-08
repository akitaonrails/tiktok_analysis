package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2P {
    public static final /* synthetic */ C0N2P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N2P REQUEST_END;
    public static final C0N2P REQUEST_START;

    public static InterfaceC2044707zh<C0N2P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N2P c0n2p = new C0N2P("REQUEST_START", 0);
        REQUEST_START = c0n2p;
        C0N2P c0n2p2 = new C0N2P("REQUEST_END", 1);
        REQUEST_END = c0n2p2;
        C0N2P[] c0n2pArr = {c0n2p, c0n2p2};
        LL = c0n2pArr;
        LLILLJJLI = new C2254308sP(c0n2pArr);
    }

    public static C0N2P[] values() {
        return (C0N2P[]) LL.clone();
    }

    public static C0N2P valueOf(String str) {
        return (C0N2P) C08FF.LIZ(C0N2P.class, str);
    }

    public C0N2P(String str, int i) {
    }
}
