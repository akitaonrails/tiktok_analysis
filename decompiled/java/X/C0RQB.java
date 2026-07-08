package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQB {
    public static final C0RQB AUTO_PLAY_NEXT;
    public static final C0RQB DANMAKU_FOCUSABLE;
    public static final /* synthetic */ C0RQB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0RQB PROFILE_LIST;
    public static final C0RQB SHOW_INTRO;
    public final int LL;

    public static InterfaceC2044707zh<C0RQB> getEntries() {
        return LLILLL;
    }

    static {
        C0RQB c0rqb = new C0RQB("AUTO_PLAY_NEXT", 0, 1);
        AUTO_PLAY_NEXT = c0rqb;
        C0RQB c0rqb2 = new C0RQB("SHOW_INTRO", 1, 2);
        SHOW_INTRO = c0rqb2;
        C0RQB c0rqb3 = new C0RQB("DANMAKU_FOCUSABLE", 2, 4);
        DANMAKU_FOCUSABLE = c0rqb3;
        C0RQB c0rqb4 = new C0RQB("PROFILE_LIST", 3, 8);
        PROFILE_LIST = c0rqb4;
        C0RQB[] c0rqbArr = {c0rqb, c0rqb2, c0rqb3, c0rqb4};
        LLILLJJLI = c0rqbArr;
        LLILLL = new C2254308sP(c0rqbArr);
    }

    public static C0RQB[] values() {
        return (C0RQB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0RQB valueOf(String str) {
        return (C0RQB) C08FF.LIZ(C0RQB.class, str);
    }

    public C0RQB(String str, int i, int i2) {
        this.LL = i2;
    }
}
