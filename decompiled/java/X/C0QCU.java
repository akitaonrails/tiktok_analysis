package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QCU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QCU {
    public static final /* synthetic */ C0QCU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QCU UNUSED;
    public static final C0QCU USED;

    public static InterfaceC2044707zh<C0QCU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QCU c0qcu = new C0QCU("USED", 0);
        USED = c0qcu;
        C0QCU c0qcu2 = new C0QCU("UNUSED", 1);
        UNUSED = c0qcu2;
        C0QCU[] c0qcuArr = {c0qcu, c0qcu2};
        LL = c0qcuArr;
        LLILLJJLI = new C2254308sP(c0qcuArr);
    }

    public static C0QCU[] values() {
        return (C0QCU[]) LL.clone();
    }

    public static C0QCU valueOf(String str) {
        return (C0QCU) C08FF.LIZ(C0QCU.class, str);
    }

    public C0QCU(String str, int i) {
    }
}
