package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004607tE {
    public static final EnumC2004607tE EXTERNAL_BROWSER;
    public static final EnumC2004607tE IAB;
    public static final EnumC2004607tE INTERNAL_PAGE;
    public static final /* synthetic */ EnumC2004607tE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2004607tE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2004607tE enumC2004607tE = new EnumC2004607tE("IAB", 0);
        IAB = enumC2004607tE;
        EnumC2004607tE enumC2004607tE2 = new EnumC2004607tE("INTERNAL_PAGE", 1);
        INTERNAL_PAGE = enumC2004607tE2;
        EnumC2004607tE enumC2004607tE3 = new EnumC2004607tE("EXTERNAL_BROWSER", 2);
        EXTERNAL_BROWSER = enumC2004607tE3;
        EnumC2004607tE[] enumC2004607tEArr = {enumC2004607tE, enumC2004607tE2, enumC2004607tE3};
        LL = enumC2004607tEArr;
        LLILLJJLI = new C2254308sP(enumC2004607tEArr);
    }

    public static EnumC2004607tE[] values() {
        return (EnumC2004607tE[]) LL.clone();
    }

    public static EnumC2004607tE valueOf(String str) {
        return (EnumC2004607tE) C08FF.LIZ(EnumC2004607tE.class, str);
    }

    public EnumC2004607tE(String str, int i) {
    }
}
