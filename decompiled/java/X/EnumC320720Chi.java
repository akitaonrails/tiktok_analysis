package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Chi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC320720Chi {
    public static final EnumC320720Chi DELETE;
    public static final EnumC320720Chi FAILED;
    public static final EnumC320720Chi FULL;
    public static final EnumC320720Chi HISTORY;
    public static final /* synthetic */ EnumC320720Chi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC320720Chi NEW;
    public static final EnumC320720Chi UPDATE;

    public static InterfaceC2044707zh<EnumC320720Chi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC320720Chi enumC320720Chi = new EnumC320720Chi("FAILED", 0);
        FAILED = enumC320720Chi;
        EnumC320720Chi enumC320720Chi2 = new EnumC320720Chi("FULL", 1);
        FULL = enumC320720Chi2;
        EnumC320720Chi enumC320720Chi3 = new EnumC320720Chi("HISTORY", 2);
        HISTORY = enumC320720Chi3;
        EnumC320720Chi enumC320720Chi4 = new EnumC320720Chi("NEW", 3);
        NEW = enumC320720Chi4;
        EnumC320720Chi enumC320720Chi5 = new EnumC320720Chi("DELETE", 4);
        DELETE = enumC320720Chi5;
        EnumC320720Chi enumC320720Chi6 = new EnumC320720Chi("UPDATE", 5);
        UPDATE = enumC320720Chi6;
        EnumC320720Chi[] enumC320720ChiArr = {enumC320720Chi, enumC320720Chi2, enumC320720Chi3, enumC320720Chi4, enumC320720Chi5, enumC320720Chi6};
        LL = enumC320720ChiArr;
        LLILLJJLI = new C2254308sP(enumC320720ChiArr);
    }

    public static EnumC320720Chi[] values() {
        return (EnumC320720Chi[]) LL.clone();
    }

    public static EnumC320720Chi valueOf(String str) {
        return (EnumC320720Chi) C08FF.LIZ(EnumC320720Chi.class, str);
    }

    public EnumC320720Chi(String str, int i) {
    }
}
