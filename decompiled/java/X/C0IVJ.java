package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVJ {
    public static final C0IVJ FOLLOW;
    public static final C0IVJ INBOX;
    public static final /* synthetic */ C0IVJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0IVJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IVJ c0ivj = new C0IVJ("FOLLOW", 0);
        FOLLOW = c0ivj;
        C0IVJ c0ivj2 = new C0IVJ("INBOX", 1);
        INBOX = c0ivj2;
        C0IVJ[] c0ivjArr = {c0ivj, c0ivj2};
        LL = c0ivjArr;
        LLILLJJLI = new C2254308sP(c0ivjArr);
    }

    public static C0IVJ[] values() {
        return (C0IVJ[]) LL.clone();
    }

    public static C0IVJ valueOf(String str) {
        return (C0IVJ) C08FF.LIZ(C0IVJ.class, str);
    }

    public C0IVJ(String str, int i) {
    }
}
