package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRJ {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0VRJ[] $VALUES;
    public static final C0VRJ ASC = new C0VRJ("ASC", 0, "asc");
    public static final C0VRJ DESC = new C0VRJ("DESC", 1, "desc");
    public final String value;

    public static final /* synthetic */ C0VRJ[] $values() {
        return new C0VRJ[]{ASC, DESC};
    }

    public static InterfaceC2044707zh<C0VRJ> getEntries() {
        return $ENTRIES;
    }

    static {
        C0VRJ[] c0vrjArr$values = $values();
        $VALUES = c0vrjArr$values;
        $ENTRIES = new C2254308sP(c0vrjArr$values);
    }

    public static C0VRJ[] values() {
        return (C0VRJ[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static C0VRJ valueOf(String str) {
        return (C0VRJ) C08FF.LIZ(C0VRJ.class, str);
    }

    public C0VRJ(String str, int i, String str2) {
        this.value = str2;
    }
}
