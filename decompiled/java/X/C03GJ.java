package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GJ {
    public static final C03GJ AVATAR;
    public static final C03GJ CELL;
    public static final /* synthetic */ C03GJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03GJ USERNAME;

    public static InterfaceC2044707zh<C03GJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03GJ c03gj = new C03GJ("CELL", 0);
        CELL = c03gj;
        C03GJ c03gj2 = new C03GJ("AVATAR", 1);
        AVATAR = c03gj2;
        C03GJ c03gj3 = new C03GJ("USERNAME", 2);
        USERNAME = c03gj3;
        C03GJ[] c03gjArr = {c03gj, c03gj2, c03gj3};
        LL = c03gjArr;
        LLILLJJLI = new C2254308sP(c03gjArr);
    }

    public static C03GJ[] values() {
        return (C03GJ[]) LL.clone();
    }

    public static C03GJ valueOf(String str) {
        return (C03GJ) C08FF.LIZ(C03GJ.class, str);
    }

    public C03GJ(String str, int i) {
    }
}
