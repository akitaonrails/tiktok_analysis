package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y98, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y98 {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0Y98[] $VALUES;
    public static final C0Y98 ALL = new C0Y98("ALL", 0);
    public static final C0Y98 DELETED = new C0Y98("DELETED", 1);
    public static final C0Y98 NOT_DELETED = new C0Y98("NOT_DELETED", 2);

    public static final /* synthetic */ C0Y98[] $values() {
        return new C0Y98[]{ALL, DELETED, NOT_DELETED};
    }

    public static InterfaceC2044707zh<C0Y98> getEntries() {
        return $ENTRIES;
    }

    static {
        C0Y98[] c0y98Arr$values = $values();
        $VALUES = c0y98Arr$values;
        $ENTRIES = new C2254308sP(c0y98Arr$values);
    }

    public static C0Y98[] values() {
        return (C0Y98[]) $VALUES.clone();
    }

    public static C0Y98 valueOf(String str) {
        return (C0Y98) C08FF.LIZ(C0Y98.class, str);
    }

    public C0Y98(String str, int i) {
    }
}
