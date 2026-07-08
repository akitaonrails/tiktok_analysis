package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905430zgT implements C1D61 {
    public static final EnumC1905430zgT LAYOUT_FAILED;
    public static final EnumC1905430zgT LAYOUT_FINISH;
    public static final /* synthetic */ EnumC1905430zgT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC1905430zgT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905430zgT enumC1905430zgT = new EnumC1905430zgT("LAYOUT_FINISH", 0);
        LAYOUT_FINISH = enumC1905430zgT;
        EnumC1905430zgT enumC1905430zgT2 = new EnumC1905430zgT("LAYOUT_FAILED", 1);
        LAYOUT_FAILED = enumC1905430zgT2;
        EnumC1905430zgT[] enumC1905430zgTArr = {enumC1905430zgT, enumC1905430zgT2};
        LLILLJJLI = enumC1905430zgTArr;
        LLILLL = new C2254308sP(enumC1905430zgTArr);
    }

    public static EnumC1905430zgT[] values() {
        return (EnumC1905430zgT[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC1905430zgT valueOf(String str) {
        return (EnumC1905430zgT) C08FF.LIZ(EnumC1905430zgT.class, str);
    }

    public EnumC1905430zgT(String str, int i) {
    }
}
