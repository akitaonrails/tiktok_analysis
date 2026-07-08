package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGK {
    public static final C0CGK Control;
    public static final /* synthetic */ C0CGK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CGK Normal;

    public static InterfaceC2044707zh<C0CGK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CGK c0cgk = new C0CGK("Normal", 0);
        Normal = c0cgk;
        C0CGK c0cgk2 = new C0CGK("Control", 1);
        Control = c0cgk2;
        C0CGK[] c0cgkArr = {c0cgk, c0cgk2};
        LL = c0cgkArr;
        LLILLJJLI = new C2254308sP(c0cgkArr);
    }

    public static C0CGK[] values() {
        return (C0CGK[]) LL.clone();
    }

    public static C0CGK valueOf(String str) {
        return (C0CGK) C08FF.LIZ(C0CGK.class, str);
    }

    public C0CGK(String str, int i) {
    }
}
