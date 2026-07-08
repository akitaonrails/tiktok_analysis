package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLB {
    public static final C0HLB CANCEL;
    public static final C0HLB CONFIRM;
    public static final /* synthetic */ C0HLB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HLB RETAKE;
    public static final C0HLB SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0HLB> getEntries() {
        return LLILLL;
    }

    static {
        C0HLB c0hlb = new C0HLB("SHOW", 0, "show");
        SHOW = c0hlb;
        C0HLB c0hlb2 = new C0HLB("CONFIRM", 1, "confirm");
        CONFIRM = c0hlb2;
        C0HLB c0hlb3 = new C0HLB("RETAKE", 2, "re-take");
        RETAKE = c0hlb3;
        C0HLB c0hlb4 = new C0HLB("CANCEL", 3, "cancel");
        CANCEL = c0hlb4;
        C0HLB[] c0hlbArr = {c0hlb, c0hlb2, c0hlb3, c0hlb4};
        LLILLJJLI = c0hlbArr;
        LLILLL = new C2254308sP(c0hlbArr);
    }

    public static C0HLB[] values() {
        return (C0HLB[]) LLILLJJLI.clone();
    }

    public final String getReportValue() {
        return this.LL;
    }

    public static C0HLB valueOf(String str) {
        return (C0HLB) C08FF.LIZ(C0HLB.class, str);
    }

    public C0HLB(String str, int i, String str2) {
        this.LL = str2;
    }
}
