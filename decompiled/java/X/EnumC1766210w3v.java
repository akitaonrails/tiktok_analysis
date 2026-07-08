package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1766210w3v {
    public static final /* synthetic */ EnumC1766210w3v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1766210w3v SKC;
    public static final EnumC1766210w3v SKU;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1766210w3v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1766210w3v enumC1766210w3v = new EnumC1766210w3v("SKU", 0, 0);
        SKU = enumC1766210w3v;
        EnumC1766210w3v enumC1766210w3v2 = new EnumC1766210w3v("SKC", 1, 1);
        SKC = enumC1766210w3v2;
        EnumC1766210w3v[] enumC1766210w3vArr = {enumC1766210w3v, enumC1766210w3v2};
        LLILLJJLI = enumC1766210w3vArr;
        LLILLL = new C2254308sP(enumC1766210w3vArr);
    }

    public static EnumC1766210w3v[] values() {
        return (EnumC1766210w3v[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1766210w3v valueOf(String str) {
        return (EnumC1766210w3v) C08FF.LIZ(EnumC1766210w3v.class, str);
    }

    public EnumC1766210w3v(String str, int i, int i2) {
        this.LL = i2;
    }
}
