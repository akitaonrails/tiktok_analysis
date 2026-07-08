package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC332220D0q {
    public static final /* synthetic */ EnumC332220D0q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC332220D0q ORDER_DETAILS;
    public static final EnumC332220D0q OTHER;
    public static final EnumC332220D0q THANK_YOU;

    public static InterfaceC2044707zh<EnumC332220D0q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC332220D0q enumC332220D0q = new EnumC332220D0q("THANK_YOU", 0);
        THANK_YOU = enumC332220D0q;
        EnumC332220D0q enumC332220D0q2 = new EnumC332220D0q("ORDER_DETAILS", 1);
        ORDER_DETAILS = enumC332220D0q2;
        EnumC332220D0q enumC332220D0q3 = new EnumC332220D0q("OTHER", 2);
        OTHER = enumC332220D0q3;
        EnumC332220D0q[] enumC332220D0qArr = {enumC332220D0q, enumC332220D0q2, enumC332220D0q3};
        LL = enumC332220D0qArr;
        LLILLJJLI = new C2254308sP(enumC332220D0qArr);
    }

    public static EnumC332220D0q[] values() {
        return (EnumC332220D0q[]) LL.clone();
    }

    public static EnumC332220D0q valueOf(String str) {
        return (EnumC332220D0q) C08FF.LIZ(EnumC332220D0q.class, str);
    }

    public EnumC332220D0q(String str, int i) {
    }
}
