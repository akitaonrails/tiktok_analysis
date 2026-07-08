package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC338610DPf {
    public static final EnumC338610DPf GROUP;
    public static final /* synthetic */ EnumC338610DPf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC338610DPf POST;
    public static final EnumC338610DPf USER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC338610DPf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC338610DPf enumC338610DPf = new EnumC338610DPf("POST", 0, "posts");
        POST = enumC338610DPf;
        EnumC338610DPf enumC338610DPf2 = new EnumC338610DPf("USER", 1, "members");
        USER = enumC338610DPf2;
        EnumC338610DPf enumC338610DPf3 = new EnumC338610DPf("GROUP", 2, "school_groups");
        GROUP = enumC338610DPf3;
        EnumC338610DPf[] enumC338610DPfArr = {enumC338610DPf, enumC338610DPf2, enumC338610DPf3};
        LLILLJJLI = enumC338610DPfArr;
        LLILLL = new C2254308sP(enumC338610DPfArr);
    }

    public static EnumC338610DPf[] values() {
        return (EnumC338610DPf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC338610DPf valueOf(String str) {
        return (EnumC338610DPf) C08FF.LIZ(EnumC338610DPf.class, str);
    }

    public EnumC338610DPf(String str, int i, String str2) {
        this.LL = str2;
    }
}
