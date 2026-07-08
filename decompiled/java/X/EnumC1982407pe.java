package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1982407pe {
    public static final EnumC1982407pe ID;
    public static final /* synthetic */ EnumC1982407pe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1982407pe VN;

    public static InterfaceC2044707zh<EnumC1982407pe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1982407pe enumC1982407pe = new EnumC1982407pe("ID", 0);
        ID = enumC1982407pe;
        EnumC1982407pe enumC1982407pe2 = new EnumC1982407pe("VN", 1);
        VN = enumC1982407pe2;
        EnumC1982407pe[] enumC1982407peArr = {enumC1982407pe, enumC1982407pe2};
        LL = enumC1982407peArr;
        LLILLJJLI = new C2254308sP(enumC1982407peArr);
    }

    public static EnumC1982407pe[] values() {
        return (EnumC1982407pe[]) LL.clone();
    }

    public static EnumC1982407pe valueOf(String str) {
        return (EnumC1982407pe) C08FF.LIZ(EnumC1982407pe.class, str);
    }

    public EnumC1982407pe(String str, int i) {
    }
}
