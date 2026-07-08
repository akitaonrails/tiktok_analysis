package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11XV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XV {
    public static final C11XV CLAIM;
    public static final C11XV CLAIMED;
    public static final C11XV FOLLOW;
    public static final /* synthetic */ C11XV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11XV USE;

    public static InterfaceC2044707zh<C11XV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C11XV c11xv = new C11XV("CLAIM", 0);
        CLAIM = c11xv;
        C11XV c11xv2 = new C11XV("FOLLOW", 1);
        FOLLOW = c11xv2;
        C11XV c11xv3 = new C11XV("USE", 2);
        USE = c11xv3;
        C11XV c11xv4 = new C11XV("CLAIMED", 3);
        CLAIMED = c11xv4;
        C11XV[] c11xvArr = {c11xv, c11xv2, c11xv3, c11xv4};
        LL = c11xvArr;
        LLILLJJLI = new C2254308sP(c11xvArr);
    }

    public static C11XV[] values() {
        return (C11XV[]) LL.clone();
    }

    public static C11XV valueOf(String str) {
        return (C11XV) C08FF.LIZ(C11XV.class, str);
    }

    public C11XV(String str, int i) {
    }
}
