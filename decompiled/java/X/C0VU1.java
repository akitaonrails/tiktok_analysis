package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VU1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VU1 {
    public static final C0VU1 CPU;
    public static final C0VU1 IO;
    public static final /* synthetic */ C0VU1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0VU1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VU1 c0vu1 = new C0VU1("CPU", 0);
        CPU = c0vu1;
        C0VU1 c0vu12 = new C0VU1("IO", 1);
        IO = c0vu12;
        C0VU1[] c0vu1Arr = {c0vu1, c0vu12};
        LL = c0vu1Arr;
        LLILLJJLI = new C2254308sP(c0vu1Arr);
    }

    public static C0VU1[] values() {
        return (C0VU1[]) LL.clone();
    }

    public static C0VU1 valueOf(String str) {
        return (C0VU1) C08FF.LIZ(C0VU1.class, str);
    }

    public C0VU1(String str, int i) {
    }
}
