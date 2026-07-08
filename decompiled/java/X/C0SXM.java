package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SXM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXM {
    public static final C0SXM COLOR;
    public static final C0SXM IMAGE;
    public static final /* synthetic */ C0SXM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0SXM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SXM c0sxm = new C0SXM("IMAGE", 0);
        IMAGE = c0sxm;
        C0SXM c0sxm2 = new C0SXM("COLOR", 1);
        COLOR = c0sxm2;
        C0SXM[] c0sxmArr = {c0sxm, c0sxm2};
        LL = c0sxmArr;
        LLILLJJLI = new C2254308sP(c0sxmArr);
    }

    public static C0SXM[] values() {
        return (C0SXM[]) LL.clone();
    }

    public static C0SXM valueOf(String str) {
        return (C0SXM) C08FF.LIZ(C0SXM.class, str);
    }

    public C0SXM(String str, int i) {
    }
}
