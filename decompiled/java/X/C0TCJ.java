package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCJ {
    public static final C0TCJ CoLinkMicSession;
    public static final /* synthetic */ C0TCJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TCJ LiveLinkMicSession;
    public static final C0TCJ RustLinkMicSession;

    public static InterfaceC2044707zh<C0TCJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TCJ c0tcj = new C0TCJ("CoLinkMicSession", 0);
        CoLinkMicSession = c0tcj;
        C0TCJ c0tcj2 = new C0TCJ("LiveLinkMicSession", 1);
        LiveLinkMicSession = c0tcj2;
        C0TCJ c0tcj3 = new C0TCJ("RustLinkMicSession", 2);
        RustLinkMicSession = c0tcj3;
        C0TCJ[] c0tcjArr = {c0tcj, c0tcj2, c0tcj3};
        LL = c0tcjArr;
        LLILLJJLI = new C2254308sP(c0tcjArr);
    }

    public static C0TCJ[] values() {
        return (C0TCJ[]) LL.clone();
    }

    public static C0TCJ valueOf(String str) {
        return (C0TCJ) C08FF.LIZ(C0TCJ.class, str);
    }

    public C0TCJ(String str, int i) {
    }
}
