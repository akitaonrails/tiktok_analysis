package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HVB {
    public static final C0HVB DEBUGGING;
    public static final /* synthetic */ C0HVB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HVB LOCK_AND_CLICK_SEND;
    public static final C0HVB LONG_PRESS_AND_RELEASE;
    public final String LL;

    public static InterfaceC2044707zh<C0HVB> getEntries() {
        return LLILLL;
    }

    static {
        C0HVB c0hvb = new C0HVB("LONG_PRESS_AND_RELEASE", 0, "release_micro");
        LONG_PRESS_AND_RELEASE = c0hvb;
        C0HVB c0hvb2 = new C0HVB("LOCK_AND_CLICK_SEND", 1, "click_send");
        LOCK_AND_CLICK_SEND = c0hvb2;
        C0HVB c0hvb3 = new C0HVB("DEBUGGING", 2, "");
        DEBUGGING = c0hvb3;
        C0HVB[] c0hvbArr = {c0hvb, c0hvb2, c0hvb3};
        LLILLJJLI = c0hvbArr;
        LLILLL = new C2254308sP(c0hvbArr);
    }

    public static C0HVB[] values() {
        return (C0HVB[]) LLILLJJLI.clone();
    }

    public final String getEventString() {
        return this.LL;
    }

    public static C0HVB valueOf(String str) {
        return (C0HVB) C08FF.LIZ(C0HVB.class, str);
    }

    public C0HVB(String str, int i, String str2) {
        this.LL = str2;
    }
}
