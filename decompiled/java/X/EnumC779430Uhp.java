package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC779430Uhp {
    public static final EnumC779430Uhp ADSORBED;
    public static final EnumC779430Uhp FOLDED;
    public static final EnumC779430Uhp HIDDEN;
    public static final /* synthetic */ EnumC779430Uhp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC779430Uhp UNFOLDED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC779430Uhp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC779430Uhp enumC779430Uhp = new EnumC779430Uhp("FOLDED", 0, "folded");
        FOLDED = enumC779430Uhp;
        EnumC779430Uhp enumC779430Uhp2 = new EnumC779430Uhp("UNFOLDED", 1, "unfolded");
        UNFOLDED = enumC779430Uhp2;
        EnumC779430Uhp enumC779430Uhp3 = new EnumC779430Uhp("ADSORBED", 2, "adsorbed");
        ADSORBED = enumC779430Uhp3;
        EnumC779430Uhp enumC779430Uhp4 = new EnumC779430Uhp("HIDDEN", 3, "hidden");
        HIDDEN = enumC779430Uhp4;
        EnumC779430Uhp[] enumC779430UhpArr = {enumC779430Uhp, enumC779430Uhp2, enumC779430Uhp3, enumC779430Uhp4};
        LLILLJJLI = enumC779430UhpArr;
        LLILLL = new C2254308sP(enumC779430UhpArr);
    }

    public static EnumC779430Uhp[] values() {
        return (EnumC779430Uhp[]) LLILLJJLI.clone();
    }

    public final String getDescribe() {
        return this.LL;
    }

    public static EnumC779430Uhp valueOf(String str) {
        return (EnumC779430Uhp) C08FF.LIZ(EnumC779430Uhp.class, str);
    }

    public EnumC779430Uhp(String str, int i, String str2) {
        this.LL = str2;
    }
}
