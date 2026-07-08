package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VR1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VR1 {
    public static final C0VR1 INSERT;
    public static final /* synthetic */ C0VR1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0VR1 RETAIN;

    public static InterfaceC2044707zh<C0VR1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VR1 c0vr1 = new C0VR1("RETAIN", 0);
        RETAIN = c0vr1;
        C0VR1 c0vr12 = new C0VR1("INSERT", 1);
        INSERT = c0vr12;
        C0VR1[] c0vr1Arr = {c0vr1, c0vr12};
        LL = c0vr1Arr;
        LLILLJJLI = new C2254308sP(c0vr1Arr);
    }

    public static C0VR1[] values() {
        return (C0VR1[]) LL.clone();
    }

    public static C0VR1 valueOf(String str) {
        return (C0VR1) C08FF.LIZ(C0VR1.class, str);
    }

    public C0VR1(String str, int i) {
    }
}
