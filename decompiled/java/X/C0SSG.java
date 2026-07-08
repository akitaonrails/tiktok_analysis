package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SSG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSG {
    public static final C0SSG FLING;
    public static final /* synthetic */ C0SSG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SSG PROGRAMMATIC;
    public static final C0SSG SNAP;
    public static final C0SSG TOUCH;

    public static InterfaceC2044707zh<C0SSG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SSG c0ssg = new C0SSG("TOUCH", 0);
        TOUCH = c0ssg;
        C0SSG c0ssg2 = new C0SSG("FLING", 1);
        FLING = c0ssg2;
        C0SSG c0ssg3 = new C0SSG("SNAP", 2);
        SNAP = c0ssg3;
        C0SSG c0ssg4 = new C0SSG("PROGRAMMATIC", 3);
        PROGRAMMATIC = c0ssg4;
        C0SSG[] c0ssgArr = {c0ssg, c0ssg2, c0ssg3, c0ssg4};
        LL = c0ssgArr;
        LLILLJJLI = new C2254308sP(c0ssgArr);
    }

    public static C0SSG[] values() {
        return (C0SSG[]) LL.clone();
    }

    public static C0SSG valueOf(String str) {
        return (C0SSG) C08FF.LIZ(C0SSG.class, str);
    }

    public C0SSG(String str, int i) {
    }
}
