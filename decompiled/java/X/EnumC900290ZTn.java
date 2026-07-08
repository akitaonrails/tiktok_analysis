package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900290ZTn {
    public static final /* synthetic */ EnumC900290ZTn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC900290ZTn ONLINE;
    public static final EnumC900290ZTn REFACTOR;

    public static InterfaceC2044707zh<EnumC900290ZTn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC900290ZTn enumC900290ZTn = new EnumC900290ZTn("ONLINE", 0);
        ONLINE = enumC900290ZTn;
        EnumC900290ZTn enumC900290ZTn2 = new EnumC900290ZTn("REFACTOR", 1);
        REFACTOR = enumC900290ZTn2;
        EnumC900290ZTn[] enumC900290ZTnArr = {enumC900290ZTn, enumC900290ZTn2};
        LL = enumC900290ZTnArr;
        LLILLJJLI = new C2254308sP(enumC900290ZTnArr);
    }

    public static EnumC900290ZTn[] values() {
        return (EnumC900290ZTn[]) LL.clone();
    }

    public static EnumC900290ZTn valueOf(String str) {
        return (EnumC900290ZTn) C08FF.LIZ(EnumC900290ZTn.class, str);
    }

    public EnumC900290ZTn(String str, int i) {
    }
}
