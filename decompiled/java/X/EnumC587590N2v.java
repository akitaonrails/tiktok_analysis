package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587590N2v {
    public static final EnumC587590N2v COUNT_LIMIT;
    public static final EnumC587590N2v DAY_LIMIT;
    public static final /* synthetic */ EnumC587590N2v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC587590N2v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587590N2v enumC587590N2v = new EnumC587590N2v("COUNT_LIMIT", 0);
        COUNT_LIMIT = enumC587590N2v;
        EnumC587590N2v enumC587590N2v2 = new EnumC587590N2v("DAY_LIMIT", 1);
        DAY_LIMIT = enumC587590N2v2;
        EnumC587590N2v[] enumC587590N2vArr = {enumC587590N2v, enumC587590N2v2};
        LL = enumC587590N2vArr;
        LLILLJJLI = new C2254308sP(enumC587590N2vArr);
    }

    public static EnumC587590N2v[] values() {
        return (EnumC587590N2v[]) LL.clone();
    }

    public static EnumC587590N2v valueOf(String str) {
        return (EnumC587590N2v) C08FF.LIZ(EnumC587590N2v.class, str);
    }

    public EnumC587590N2v(String str, int i) {
    }
}
