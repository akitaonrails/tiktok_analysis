package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IZB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZB {
    public static final C0IZB FIRST_ENTER;
    public static final /* synthetic */ C0IZB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IZB LOAD_MORE;
    public static final C0IZB REFRESH;

    public static InterfaceC2044707zh<C0IZB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IZB c0izb = new C0IZB("FIRST_ENTER", 0);
        FIRST_ENTER = c0izb;
        C0IZB c0izb2 = new C0IZB("REFRESH", 1);
        REFRESH = c0izb2;
        C0IZB c0izb3 = new C0IZB("LOAD_MORE", 2);
        LOAD_MORE = c0izb3;
        C0IZB[] c0izbArr = {c0izb, c0izb2, c0izb3};
        LL = c0izbArr;
        LLILLJJLI = new C2254308sP(c0izbArr);
    }

    public static C0IZB[] values() {
        return (C0IZB[]) LL.clone();
    }

    public static C0IZB valueOf(String str) {
        return (C0IZB) C08FF.LIZ(C0IZB.class, str);
    }

    public C0IZB(String str, int i) {
    }
}
