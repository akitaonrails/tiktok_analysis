package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SY7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SY7 {
    public static final C0SY6 Companion;
    public static final C0SY7 FOLLOWED;
    public static final C0SY7 FOLLOW_MUTUAL;
    public static final C0SY7 FOLLOW_REQUESTED;
    public static final /* synthetic */ C0SY7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SY7 NONE;
    public static final C0SY7 SAME_USER;
    public static final C0SY7 UNFOLLOW;
    public static final C0SY7 UNFOLLOW_BUT_BE_FOLLOWED;
    public final int LL;

    public static final C0SY7 getByValue(int i) {
        Companion.getClass();
        return C0SY6.LIZ(i);
    }

    public static InterfaceC2044707zh<C0SY7> getEntries() {
        return LLILLL;
    }

    static {
        C0SY7 c0sy7 = new C0SY7("NONE", 0, -1);
        NONE = c0sy7;
        C0SY7 c0sy72 = new C0SY7("UNFOLLOW", 1, 0);
        UNFOLLOW = c0sy72;
        C0SY7 c0sy73 = new C0SY7("FOLLOWED", 2, 1);
        FOLLOWED = c0sy73;
        C0SY7 c0sy74 = new C0SY7("FOLLOW_MUTUAL", 3, 2);
        FOLLOW_MUTUAL = c0sy74;
        C0SY7 c0sy75 = new C0SY7("SAME_USER", 4, 3);
        SAME_USER = c0sy75;
        C0SY7 c0sy76 = new C0SY7("FOLLOW_REQUESTED", 5, 4);
        FOLLOW_REQUESTED = c0sy76;
        C0SY7 c0sy77 = new C0SY7("UNFOLLOW_BUT_BE_FOLLOWED", 6, 5);
        UNFOLLOW_BUT_BE_FOLLOWED = c0sy77;
        C0SY7[] c0sy7Arr = {c0sy7, c0sy72, c0sy73, c0sy74, c0sy75, c0sy76, c0sy77};
        LLILLJJLI = c0sy7Arr;
        LLILLL = new C2254308sP(c0sy7Arr);
        Companion = new C0SY6();
    }

    public static C0SY7[] values() {
        return (C0SY7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0SY7 valueOf(String str) {
        return (C0SY7) C08FF.LIZ(C0SY7.class, str);
    }

    public C0SY7(String str, int i, int i2) {
        this.LL = i2;
    }
}
