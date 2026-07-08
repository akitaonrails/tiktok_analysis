package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998407sE {
    public static final /* synthetic */ EnumC1998407sE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1998407sE NORMAL;
    public static final EnumC1998407sE SHEET_SLIDE;

    public static InterfaceC2044707zh<EnumC1998407sE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1998407sE enumC1998407sE = new EnumC1998407sE("NORMAL", 0);
        NORMAL = enumC1998407sE;
        EnumC1998407sE enumC1998407sE2 = new EnumC1998407sE("SHEET_SLIDE", 1);
        SHEET_SLIDE = enumC1998407sE2;
        EnumC1998407sE[] enumC1998407sEArr = {enumC1998407sE, enumC1998407sE2};
        LL = enumC1998407sEArr;
        LLILLJJLI = new C2254308sP(enumC1998407sEArr);
    }

    public static EnumC1998407sE[] values() {
        return (EnumC1998407sE[]) LL.clone();
    }

    public static EnumC1998407sE valueOf(String str) {
        return (EnumC1998407sE) C08FF.LIZ(EnumC1998407sE.class, str);
    }

    public EnumC1998407sE(String str, int i) {
    }
}
