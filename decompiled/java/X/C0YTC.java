package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YTC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YTC {
    public static final C0YTC ADD;
    public static final /* synthetic */ C0YTC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YTC REMOVE;

    public static InterfaceC2044707zh<C0YTC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YTC c0ytc = new C0YTC("ADD", 0);
        ADD = c0ytc;
        C0YTC c0ytc2 = new C0YTC("REMOVE", 1);
        REMOVE = c0ytc2;
        C0YTC[] c0ytcArr = {c0ytc, c0ytc2};
        LL = c0ytcArr;
        LLILLJJLI = new C2254308sP(c0ytcArr);
    }

    public static C0YTC[] values() {
        return (C0YTC[]) LL.clone();
    }

    public static C0YTC valueOf(String str) {
        return (C0YTC) C08FF.LIZ(C0YTC.class, str);
    }

    public C0YTC(String str, int i) {
    }
}
