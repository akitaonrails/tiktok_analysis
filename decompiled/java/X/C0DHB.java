package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DHB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DHB {
    public static final C0DHB IN_FLOW;
    public static final /* synthetic */ C0DHB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DHB OUT_FLOW;

    public static InterfaceC2044707zh<C0DHB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DHB c0dhb = new C0DHB("OUT_FLOW", 0);
        OUT_FLOW = c0dhb;
        C0DHB c0dhb2 = new C0DHB("IN_FLOW", 1);
        IN_FLOW = c0dhb2;
        C0DHB[] c0dhbArr = {c0dhb, c0dhb2};
        LL = c0dhbArr;
        LLILLJJLI = new C2254308sP(c0dhbArr);
    }

    public static C0DHB[] values() {
        return (C0DHB[]) LL.clone();
    }

    public static C0DHB valueOf(String str) {
        return (C0DHB) C08FF.LIZ(C0DHB.class, str);
    }

    public C0DHB(String str, int i) {
    }
}
