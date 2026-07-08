package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216890hlv {
    public static final EnumC1216890hlv LL;
    public static final EnumC1216890hlv LLILLJJLI;
    public static final EnumC1216890hlv LLILLL;
    public static final /* synthetic */ EnumC1216890hlv[] LLILZ;

    static {
        EnumC1216890hlv enumC1216890hlv = new EnumC1216890hlv("NONE", 0);
        LL = enumC1216890hlv;
        EnumC1216890hlv enumC1216890hlv2 = new EnumC1216890hlv("TO_COLLAPSED", 1);
        LLILLJJLI = enumC1216890hlv2;
        EnumC1216890hlv enumC1216890hlv3 = new EnumC1216890hlv("TO_EXPANDED", 2);
        LLILLL = enumC1216890hlv3;
        EnumC1216890hlv[] enumC1216890hlvArr = {enumC1216890hlv, enumC1216890hlv2, enumC1216890hlv3};
        LLILZ = enumC1216890hlvArr;
        new C2254308sP(enumC1216890hlvArr);
    }

    public static EnumC1216890hlv[] values() {
        return (EnumC1216890hlv[]) LLILZ.clone();
    }

    public static EnumC1216890hlv valueOf(String str) {
        return (EnumC1216890hlv) C08FF.LIZ(EnumC1216890hlv.class, str);
    }

    public EnumC1216890hlv(String str, int i) {
    }
}
