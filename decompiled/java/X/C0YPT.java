package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YPT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPT {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0YPT[] $VALUES;
    public static final C0YPT NEW = new C0YPT("NEW", 0);
    public static final C0YPT EXISTING = new C0YPT("EXISTING", 1);
    public static final C0YPT RETRY_BY_UUID = new C0YPT("RETRY_BY_UUID", 2);

    public static final /* synthetic */ C0YPT[] $values() {
        return new C0YPT[]{NEW, EXISTING, RETRY_BY_UUID};
    }

    public static InterfaceC2044707zh<C0YPT> getEntries() {
        return $ENTRIES;
    }

    static {
        C0YPT[] c0yptArr$values = $values();
        $VALUES = c0yptArr$values;
        $ENTRIES = new C2254308sP(c0yptArr$values);
    }

    public static C0YPT[] values() {
        return (C0YPT[]) $VALUES.clone();
    }

    public static C0YPT valueOf(String str) {
        return (C0YPT) C08FF.LIZ(C0YPT.class, str);
    }

    public C0YPT(String str, int i) {
    }
}
