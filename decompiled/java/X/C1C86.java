package X;

/* JADX INFO: renamed from: X.1C86, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1C86 {
    ACTION_UNKNOWN(-1),
    ACTION_CREATE_THREAD(0),
    ACTION_START_THREAD(1),
    ACTION_SET_NAME(2),
    ACTION_COMPLETE_THREAD(3),
    ACTION_EXIT_THREAD(4),
    ACTION_DUMP(5);

    public static final C1C8A Companion = new Object() { // from class: X.1C8A
    };
    public final int LL;

    public static C1C86 valueOf(String str) {
        return (C1C86) C08FF.LIZ(C1C86.class, str);
    }

    public final int getAction() {
        return this.LL;
    }

    C1C86(int i) {
        this.LL = i;
    }
}
