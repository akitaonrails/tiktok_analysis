package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ulj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC781850Ulj {
    public static final EnumC781850Ulj LL;
    public static final EnumC781850Ulj LLILLJJLI;
    public static final EnumC781850Ulj LLILLL;
    public static final /* synthetic */ EnumC781850Ulj[] LLILZ;

    static {
        EnumC781850Ulj enumC781850Ulj = new EnumC781850Ulj("ANY_VISIBLE", 0);
        LL = enumC781850Ulj;
        EnumC781850Ulj enumC781850Ulj2 = new EnumC781850Ulj("ALL_GONE", 1);
        LLILLJJLI = enumC781850Ulj2;
        EnumC781850Ulj enumC781850Ulj3 = new EnumC781850Ulj("MIXED", 2);
        LLILLL = enumC781850Ulj3;
        EnumC781850Ulj[] enumC781850UljArr = {enumC781850Ulj, enumC781850Ulj2, enumC781850Ulj3};
        LLILZ = enumC781850UljArr;
        new C2254308sP(enumC781850UljArr);
    }

    public static EnumC781850Ulj[] values() {
        return (EnumC781850Ulj[]) LLILZ.clone();
    }

    public static EnumC781850Ulj valueOf(String str) {
        return (EnumC781850Ulj) C08FF.LIZ(EnumC781850Ulj.class, str);
    }

    public EnumC781850Ulj(String str, int i) {
    }
}
