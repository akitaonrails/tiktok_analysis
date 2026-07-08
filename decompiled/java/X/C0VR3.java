package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VR3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VR3 {
    public static final C0VR3 ASC;
    public static final C0VR3 DESC;
    public static final /* synthetic */ C0VR3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0VR3 UNEXPECTED;
    public final int LL;

    public static InterfaceC2044707zh<C0VR3> getEntries() {
        return LLILLL;
    }

    static {
        C0VR3 c0vr3 = new C0VR3("UNEXPECTED", 0, 0);
        UNEXPECTED = c0vr3;
        C0VR3 c0vr32 = new C0VR3("DESC", 1, 1);
        DESC = c0vr32;
        C0VR3 c0vr33 = new C0VR3("ASC", 2, 2);
        ASC = c0vr33;
        C0VR3[] c0vr3Arr = {c0vr3, c0vr32, c0vr33};
        LLILLJJLI = c0vr3Arr;
        LLILLL = new C2254308sP(c0vr3Arr);
    }

    public static C0VR3[] values() {
        return (C0VR3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0VR3 valueOf(String str) {
        return (C0VR3) C08FF.LIZ(C0VR3.class, str);
    }

    public C0VR3(String str, int i, int i2) {
        this.LL = i2;
    }
}
