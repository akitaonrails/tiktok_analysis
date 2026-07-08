package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC937180aUm {
    public static final EnumC937180aUm APPLY;
    public static final EnumC937180aUm INVITED;
    public static final /* synthetic */ EnumC937180aUm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC937180aUm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC937180aUm enumC937180aUm = new EnumC937180aUm("APPLY", 0);
        APPLY = enumC937180aUm;
        EnumC937180aUm enumC937180aUm2 = new EnumC937180aUm("INVITED", 1);
        INVITED = enumC937180aUm2;
        EnumC937180aUm[] enumC937180aUmArr = {enumC937180aUm, enumC937180aUm2};
        LL = enumC937180aUmArr;
        LLILLJJLI = new C2254308sP(enumC937180aUmArr);
    }

    public static EnumC937180aUm[] values() {
        return (EnumC937180aUm[]) LL.clone();
    }

    public static EnumC937180aUm valueOf(String str) {
        return (EnumC937180aUm) C08FF.LIZ(EnumC937180aUm.class, str);
    }

    public EnumC937180aUm(String str, int i) {
    }
}
