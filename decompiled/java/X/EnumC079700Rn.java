package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC079700Rn {
    public static final EnumC079700Rn INITIAL_DECISION;
    public static final /* synthetic */ EnumC079700Rn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC079700Rn SERVER_DECISION;

    public static InterfaceC2044707zh<EnumC079700Rn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC079700Rn enumC079700Rn = new EnumC079700Rn("INITIAL_DECISION", 0);
        INITIAL_DECISION = enumC079700Rn;
        EnumC079700Rn enumC079700Rn2 = new EnumC079700Rn("SERVER_DECISION", 1);
        SERVER_DECISION = enumC079700Rn2;
        EnumC079700Rn[] enumC079700RnArr = {enumC079700Rn, enumC079700Rn2};
        LL = enumC079700RnArr;
        LLILLJJLI = new C2254308sP(enumC079700RnArr);
    }

    public static EnumC079700Rn[] values() {
        return (EnumC079700Rn[]) LL.clone();
    }

    public static EnumC079700Rn valueOf(String str) {
        return (EnumC079700Rn) C08FF.LIZ(EnumC079700Rn.class, str);
    }

    public EnumC079700Rn(String str, int i) {
    }
}
