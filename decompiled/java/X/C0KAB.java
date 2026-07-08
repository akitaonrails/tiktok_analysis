package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KAB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAB {
    public static final C0KAB FAILED;
    public static final /* synthetic */ C0KAB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KAB NOT_UPDATING;
    public static final C0KAB PENDING;
    public static final C0KAB UPDATED;

    public static InterfaceC2044707zh<C0KAB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KAB c0kab = new C0KAB("PENDING", 0);
        PENDING = c0kab;
        C0KAB c0kab2 = new C0KAB("FAILED", 1);
        FAILED = c0kab2;
        C0KAB c0kab3 = new C0KAB("NOT_UPDATING", 2);
        NOT_UPDATING = c0kab3;
        C0KAB c0kab4 = new C0KAB("UPDATED", 3);
        UPDATED = c0kab4;
        C0KAB[] c0kabArr = {c0kab, c0kab2, c0kab3, c0kab4};
        LL = c0kabArr;
        LLILLJJLI = new C2254308sP(c0kabArr);
    }

    public static C0KAB[] values() {
        return (C0KAB[]) LL.clone();
    }

    public static C0KAB valueOf(String str) {
        return (C0KAB) C08FF.LIZ(C0KAB.class, str);
    }

    public C0KAB(String str, int i) {
    }
}
