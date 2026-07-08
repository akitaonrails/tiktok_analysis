package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Q5 {
    public static final C09Q5 EXTREME;
    public static final C09Q5 HIGH;
    public static final /* synthetic */ C09Q5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09Q5 LOW;
    public static final C09Q5 MEDIUM;
    public static final C09Q5 UNKNOWN;

    public static InterfaceC2044707zh<C09Q5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09Q5 c09q5 = new C09Q5("UNKNOWN", 0);
        UNKNOWN = c09q5;
        C09Q5 c09q52 = new C09Q5("LOW", 1);
        LOW = c09q52;
        C09Q5 c09q53 = new C09Q5("MEDIUM", 2);
        MEDIUM = c09q53;
        C09Q5 c09q54 = new C09Q5("HIGH", 3);
        HIGH = c09q54;
        C09Q5 c09q55 = new C09Q5("EXTREME", 4);
        EXTREME = c09q55;
        C09Q5[] c09q5Arr = {c09q5, c09q52, c09q53, c09q54, c09q55};
        LL = c09q5Arr;
        LLILLJJLI = new C2254308sP(c09q5Arr);
    }

    public static C09Q5[] values() {
        return (C09Q5[]) LL.clone();
    }

    public static C09Q5 valueOf(String str) {
        return (C09Q5) C08FF.LIZ(C09Q5.class, str);
    }

    public C09Q5(String str, int i) {
    }
}
