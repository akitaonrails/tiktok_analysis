package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1BJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BJ4 {
    AUTOMATIC("automatic", 0),
    DISPLAY_ALWAYS("display_always", 1),
    NEVER_DISPLAY("never_display", 2);

    public static final C1BKJ Companion;
    public static final C1BJ4 DEFAULT;
    public final String LL;
    public final int LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1BKJ] */
    static {
        C1BJ4 c1bj4 = AUTOMATIC;
        Companion = new Object() { // from class: X.1BKJ
        };
        DEFAULT = c1bj4;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1BJ4[] valuesCustom() {
        return (C1BJ4[]) Arrays.copyOf(values(), 3);
    }

    public final int getIntValue() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    C1BJ4(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
