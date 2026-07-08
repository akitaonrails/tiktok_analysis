package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHM {
    public static final C0HHM ERROR;
    public static final C0HHM GENERATING;
    public static final /* synthetic */ C0HHM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HHM SUCCESS;
    public static final C0HHM WAITING;

    public static InterfaceC2044707zh<C0HHM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HHM c0hhm = new C0HHM("WAITING", 0);
        WAITING = c0hhm;
        C0HHM c0hhm2 = new C0HHM("GENERATING", 1);
        GENERATING = c0hhm2;
        C0HHM c0hhm3 = new C0HHM("SUCCESS", 2);
        SUCCESS = c0hhm3;
        C0HHM c0hhm4 = new C0HHM("ERROR", 3);
        ERROR = c0hhm4;
        C0HHM[] c0hhmArr = {c0hhm, c0hhm2, c0hhm3, c0hhm4};
        LL = c0hhmArr;
        LLILLJJLI = new C2254308sP(c0hhmArr);
    }

    public static C0HHM[] values() {
        return (C0HHM[]) LL.clone();
    }

    public static C0HHM valueOf(String str) {
        return (C0HHM) C08FF.LIZ(C0HHM.class, str);
    }

    public C0HHM(String str, int i) {
    }
}
