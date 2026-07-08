package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUV {
    public static final /* synthetic */ C0QUV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QUV RESULT;
    public static final C0QUV SUG;
    public static final C0QUV SUGGEST;

    public static InterfaceC2044707zh<C0QUV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QUV c0quv = new C0QUV("SUGGEST", 0);
        SUGGEST = c0quv;
        C0QUV c0quv2 = new C0QUV("SUG", 1);
        SUG = c0quv2;
        C0QUV c0quv3 = new C0QUV("RESULT", 2);
        RESULT = c0quv3;
        C0QUV[] c0quvArr = {c0quv, c0quv2, c0quv3};
        LL = c0quvArr;
        LLILLJJLI = new C2254308sP(c0quvArr);
    }

    public static C0QUV[] values() {
        return (C0QUV[]) LL.clone();
    }

    public static C0QUV valueOf(String str) {
        return (C0QUV) C08FF.LIZ(C0QUV.class, str);
    }

    public C0QUV(String str, int i) {
    }
}
