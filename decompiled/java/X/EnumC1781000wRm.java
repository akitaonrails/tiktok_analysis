package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781000wRm {
    public static final EnumC1781000wRm DESC;
    public static final /* synthetic */ EnumC1781000wRm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1781000wRm NONE;
    public static final EnumC1781000wRm TITLE;
    public static final EnumC1781000wRm TITLE_AND_DESC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1781000wRm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781000wRm enumC1781000wRm = new EnumC1781000wRm("NONE", 0, 0);
        NONE = enumC1781000wRm;
        EnumC1781000wRm enumC1781000wRm2 = new EnumC1781000wRm("TITLE", 1, 1);
        TITLE = enumC1781000wRm2;
        EnumC1781000wRm enumC1781000wRm3 = new EnumC1781000wRm("DESC", 2, 2);
        DESC = enumC1781000wRm3;
        EnumC1781000wRm enumC1781000wRm4 = new EnumC1781000wRm("TITLE_AND_DESC", 3, 3);
        TITLE_AND_DESC = enumC1781000wRm4;
        EnumC1781000wRm[] enumC1781000wRmArr = {enumC1781000wRm, enumC1781000wRm2, enumC1781000wRm3, enumC1781000wRm4};
        LLILLJJLI = enumC1781000wRmArr;
        LLILLL = new C2254308sP(enumC1781000wRmArr);
    }

    public static EnumC1781000wRm[] values() {
        return (EnumC1781000wRm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1781000wRm valueOf(String str) {
        return (EnumC1781000wRm) C08FF.LIZ(EnumC1781000wRm.class, str);
    }

    public EnumC1781000wRm(String str, int i, int i2) {
        this.LL = i2;
    }
}
