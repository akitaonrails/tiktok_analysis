package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDZ {
    public static final /* synthetic */ C0KDZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KDZ PAY_ENDED;
    public static final C0KDZ PAY_INPROGRESS;
    public static final C0KDZ PAY_NOT_STARTED;

    public static InterfaceC2044707zh<C0KDZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KDZ c0kdz = new C0KDZ("PAY_NOT_STARTED", 0);
        PAY_NOT_STARTED = c0kdz;
        C0KDZ c0kdz2 = new C0KDZ("PAY_INPROGRESS", 1);
        PAY_INPROGRESS = c0kdz2;
        C0KDZ c0kdz3 = new C0KDZ("PAY_ENDED", 2);
        PAY_ENDED = c0kdz3;
        C0KDZ[] c0kdzArr = {c0kdz, c0kdz2, c0kdz3};
        LL = c0kdzArr;
        LLILLJJLI = new C2254308sP(c0kdzArr);
    }

    public static C0KDZ[] values() {
        return (C0KDZ[]) LL.clone();
    }

    public static C0KDZ valueOf(String str) {
        return (C0KDZ) C08FF.LIZ(C0KDZ.class, str);
    }

    public C0KDZ(String str, int i) {
    }
}
