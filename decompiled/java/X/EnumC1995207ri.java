package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995207ri {
    public static final /* synthetic */ EnumC1995207ri[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1995207ri PPF;
    public static final EnumC1995207ri PUMBAA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1995207ri> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1995207ri enumC1995207ri = new EnumC1995207ri("PUMBAA", 0, "pumbaa");
        PUMBAA = enumC1995207ri;
        EnumC1995207ri enumC1995207ri2 = new EnumC1995207ri("PPF", 1, "ppf");
        PPF = enumC1995207ri2;
        EnumC1995207ri[] enumC1995207riArr = {enumC1995207ri, enumC1995207ri2};
        LLILLJJLI = enumC1995207riArr;
        LLILLL = new C2254308sP(enumC1995207riArr);
    }

    public static EnumC1995207ri[] values() {
        return (EnumC1995207ri[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1995207ri valueOf(String str) {
        return (EnumC1995207ri) C08FF.LIZ(EnumC1995207ri.class, str);
    }

    public EnumC1995207ri(String str, int i, String str2) {
        this.LL = str2;
    }
}
