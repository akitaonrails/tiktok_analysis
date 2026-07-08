package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y9L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9L {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0Y9L[] $VALUES;
    public static final C0Y9X Companion;
    public final int value;
    public static final C0Y9L PENDING = new C0Y9L("PENDING", 0, 0);
    public static final C0Y9L SENDING = new C0Y9L("SENDING", 1, 1);
    public static final C0Y9L SUCCESS = new C0Y9L("SUCCESS", 2, 2);
    public static final C0Y9L FAIL = new C0Y9L("FAIL", 3, 3);
    public static final C0Y9L RECEIVED = new C0Y9L("RECEIVED", 4, 5);
    public static final C0Y9L TEMPORARY_RECEIVED = new C0Y9L("TEMPORARY_RECEIVED", 5, 6);

    public static final /* synthetic */ C0Y9L[] $values() {
        return new C0Y9L[]{PENDING, SENDING, SUCCESS, FAIL, RECEIVED, TEMPORARY_RECEIVED};
    }

    public static InterfaceC2044707zh<C0Y9L> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Y9X] */
    static {
        C0Y9L[] c0y9lArr$values = $values();
        $VALUES = c0y9lArr$values;
        $ENTRIES = new C2254308sP(c0y9lArr$values);
        Companion = new Object() { // from class: X.0Y9X
        };
    }

    public static C0Y9L[] values() {
        return (C0Y9L[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static C0Y9L valueOf(String str) {
        return (C0Y9L) C08FF.LIZ(C0Y9L.class, str);
    }

    public C0Y9L(String str, int i, int i2) {
        this.value = i2;
    }
}
