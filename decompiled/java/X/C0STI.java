package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0STI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STI {
    public static final C0STI LL;
    public static final C0STI LLILLJJLI;
    public static final C0STI LLILLL;
    public static final /* synthetic */ C0STI[] LLILZ;

    static {
        C0STI c0sti = new C0STI("UNDETERMINED", 0);
        LL = c0sti;
        C0STI c0sti2 = new C0STI("VERTICAL", 1);
        LLILLJJLI = c0sti2;
        C0STI c0sti3 = new C0STI("HORIZONTAL", 2);
        LLILLL = c0sti3;
        C0STI[] c0stiArr = {c0sti, c0sti2, c0sti3};
        LLILZ = c0stiArr;
        new C2254308sP(c0stiArr);
    }

    public static C0STI[] values() {
        return (C0STI[]) LLILZ.clone();
    }

    public static C0STI valueOf(String str) {
        return (C0STI) C08FF.LIZ(C0STI.class, str);
    }

    public C0STI(String str, int i) {
    }
}
