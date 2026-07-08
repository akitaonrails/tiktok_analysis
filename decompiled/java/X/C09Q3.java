package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Q3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Q3 {
    public static final C09Q3 EXTREME;
    public static final C09Q3 HIGH;
    public static final /* synthetic */ C09Q3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09Q3 LOW;
    public static final C09Q3 MEDIUM;
    public static final C09Q3 UNKNOWN;

    public static InterfaceC2044707zh<C09Q3> getEntries() {
        return LLILLJJLI;
    }

    public static C09Q3 valueOf(String str) {
        return (C09Q3) C08FF.LIZ(C09Q3.class, str);
    }

    public static C09Q3[] values() {
        return (C09Q3[]) LL.clone();
    }

    static {
        C09Q3 c09q3 = new C09Q3("UNKNOWN", 0);
        UNKNOWN = c09q3;
        C09Q3 c09q32 = new C09Q3("LOW", 1);
        LOW = c09q32;
        C09Q3 c09q33 = new C09Q3("MEDIUM", 2);
        MEDIUM = c09q33;
        C09Q3 c09q34 = new C09Q3("HIGH", 3);
        HIGH = c09q34;
        C09Q3 c09q35 = new C09Q3("EXTREME", 4);
        EXTREME = c09q35;
        C09Q3[] c09q3Arr = {c09q3, c09q32, c09q33, c09q34, c09q35};
        LL = c09q3Arr;
        LLILLJJLI = new C2254308sP(c09q3Arr);
    }

    public C09Q3(String str, int i) {
    }
}
