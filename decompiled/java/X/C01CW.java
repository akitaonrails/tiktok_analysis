package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01CW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CW {
    public static final C01CW ATTACH;
    public static final /* synthetic */ C01CW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C01CW PRE_CRASH;

    public static InterfaceC2044707zh<C01CW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01CW c01cw = new C01CW("PRE_CRASH", 0);
        PRE_CRASH = c01cw;
        C01CW c01cw2 = new C01CW("ATTACH", 1);
        ATTACH = c01cw2;
        C01CW[] c01cwArr = {c01cw, c01cw2};
        LL = c01cwArr;
        LLILLJJLI = new C2254308sP(c01cwArr);
    }

    public static C01CW[] values() {
        return (C01CW[]) LL.clone();
    }

    public static C01CW valueOf(String str) {
        return (C01CW) C08FF.LIZ(C01CW.class, str);
    }

    public C01CW(String str, int i) {
    }
}
