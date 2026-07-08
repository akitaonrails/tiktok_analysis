package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1522530pit {
    public static final EnumC1522530pit Contains;
    public static final EnumC1522530pit Equal;
    public static final EnumC1522530pit GreatEqualThan;
    public static final EnumC1522530pit GreatThan;
    public static final EnumC1522530pit In;
    public static final /* synthetic */ EnumC1522530pit[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1522530pit LessEqualThan;
    public static final EnumC1522530pit LessThan;

    public static InterfaceC2044707zh<EnumC1522530pit> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1522530pit enumC1522530pit = new EnumC1522530pit("In", 0);
        In = enumC1522530pit;
        EnumC1522530pit enumC1522530pit2 = new EnumC1522530pit("Contains", 1);
        Contains = enumC1522530pit2;
        EnumC1522530pit enumC1522530pit3 = new EnumC1522530pit("GreatEqualThan", 2);
        GreatEqualThan = enumC1522530pit3;
        EnumC1522530pit enumC1522530pit4 = new EnumC1522530pit("GreatThan", 3);
        GreatThan = enumC1522530pit4;
        EnumC1522530pit enumC1522530pit5 = new EnumC1522530pit("Equal", 4);
        Equal = enumC1522530pit5;
        EnumC1522530pit enumC1522530pit6 = new EnumC1522530pit("LessEqualThan", 5);
        LessEqualThan = enumC1522530pit6;
        EnumC1522530pit enumC1522530pit7 = new EnumC1522530pit("LessThan", 6);
        LessThan = enumC1522530pit7;
        EnumC1522530pit[] enumC1522530pitArr = {enumC1522530pit, enumC1522530pit2, enumC1522530pit3, enumC1522530pit4, enumC1522530pit5, enumC1522530pit6, enumC1522530pit7};
        LL = enumC1522530pitArr;
        LLILLJJLI = new C2254308sP(enumC1522530pitArr);
    }

    public static EnumC1522530pit[] values() {
        return (EnumC1522530pit[]) LL.clone();
    }

    public static EnumC1522530pit valueOf(String str) {
        return (EnumC1522530pit) C08FF.LIZ(EnumC1522530pit.class, str);
    }

    public EnumC1522530pit(String str, int i) {
    }
}
