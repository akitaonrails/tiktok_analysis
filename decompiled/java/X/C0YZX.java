package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YZX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZX {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0YZX[] $VALUES;
    public static final C0YZY Companion;
    public static final C0YZX PRIMARY = new C0YZX("PRIMARY", 0, 1);
    public static final C0YZX SECONDARY = new C0YZX("SECONDARY", 1, 2);
    public final int value;

    public static final /* synthetic */ C0YZX[] $values() {
        return new C0YZX[]{PRIMARY, SECONDARY};
    }

    public static InterfaceC2044707zh<C0YZX> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0YZY] */
    static {
        C0YZX[] c0yzxArr$values = $values();
        $VALUES = c0yzxArr$values;
        $ENTRIES = new C2254308sP(c0yzxArr$values);
        Companion = new Object() { // from class: X.0YZY
        };
    }

    public static C0YZX[] values() {
        return (C0YZX[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static C0YZX valueOf(String str) {
        return (C0YZX) C08FF.LIZ(C0YZX.class, str);
    }

    public C0YZX(String str, int i, int i2) {
        this.value = i2;
    }
}
