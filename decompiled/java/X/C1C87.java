package X;

/* JADX INFO: renamed from: X.1C87, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1C87 {
    ACTION_UNKNOWN(-1),
    ACTION_START(0),
    ACTION_DUMP_START(1),
    ACTION_DUMP_END(2),
    ACTION_CLOSE(3);

    public static final C1C89 Companion = new Object() { // from class: X.1C89
    };
    public final int LL;

    public static C1C87 valueOf(String str) {
        return (C1C87) C08FF.LIZ(C1C87.class, str);
    }

    public final int getAction() {
        return this.LL;
    }

    C1C87(int i) {
        this.LL = i;
    }
}
