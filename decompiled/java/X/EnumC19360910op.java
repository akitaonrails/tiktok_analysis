package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19360910op {
    public static final EnumC19360910op ASCENDING;
    public static final EnumC19360910op DESCENDING;
    public static final /* synthetic */ EnumC19360910op[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19360910op> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19360910op enumC19360910op = new EnumC19360910op("ASCENDING", 0);
        ASCENDING = enumC19360910op;
        EnumC19360910op enumC19360910op2 = new EnumC19360910op("DESCENDING", 1);
        DESCENDING = enumC19360910op2;
        EnumC19360910op[] enumC19360910opArr = {enumC19360910op, enumC19360910op2};
        LL = enumC19360910opArr;
        LLILLJJLI = new C2254308sP(enumC19360910opArr);
    }

    public static EnumC19360910op[] values() {
        return (EnumC19360910op[]) LL.clone();
    }

    public final boolean isAscending() {
        return this == ASCENDING;
    }

    public final boolean isDescending() {
        return this == DESCENDING;
    }

    public static EnumC19360910op valueOf(String str) {
        return (EnumC19360910op) C08FF.LIZ(EnumC19360910op.class, str);
    }

    public EnumC19360910op(String str, int i) {
    }
}
