package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1417520mzW {
    public static final /* synthetic */ EnumC1417520mzW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1417520mzW TEMPLATE_AIGT;
    public static final EnumC1417520mzW TEMPLATE_CC;
    public static final EnumC1417520mzW TEMPLATE_MUSIC;
    public static final EnumC1417520mzW TEMPLATE_PUGC;
    public static final EnumC1417520mzW TEMPLATE_SGT;
    public static final EnumC1417520mzW TEMPLATE_UGC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1417520mzW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1417520mzW enumC1417520mzW = new EnumC1417520mzW("TEMPLATE_MUSIC", 0, 1);
        TEMPLATE_MUSIC = enumC1417520mzW;
        EnumC1417520mzW enumC1417520mzW2 = new EnumC1417520mzW("TEMPLATE_CC", 1, 2);
        TEMPLATE_CC = enumC1417520mzW2;
        EnumC1417520mzW enumC1417520mzW3 = new EnumC1417520mzW("TEMPLATE_PUGC", 2, 3);
        TEMPLATE_PUGC = enumC1417520mzW3;
        EnumC1417520mzW enumC1417520mzW4 = new EnumC1417520mzW("TEMPLATE_AIGT", 3, 4);
        TEMPLATE_AIGT = enumC1417520mzW4;
        EnumC1417520mzW enumC1417520mzW5 = new EnumC1417520mzW("TEMPLATE_UGC", 4, 5);
        TEMPLATE_UGC = enumC1417520mzW5;
        EnumC1417520mzW enumC1417520mzW6 = new EnumC1417520mzW("TEMPLATE_SGT", 5, 6);
        TEMPLATE_SGT = enumC1417520mzW6;
        EnumC1417520mzW[] enumC1417520mzWArr = {enumC1417520mzW, enumC1417520mzW2, enumC1417520mzW3, enumC1417520mzW4, enumC1417520mzW5, enumC1417520mzW6};
        LLILLJJLI = enumC1417520mzWArr;
        LLILLL = new C2254308sP(enumC1417520mzWArr);
    }

    public static EnumC1417520mzW[] values() {
        return (EnumC1417520mzW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1417520mzW valueOf(String str) {
        return (EnumC1417520mzW) C08FF.LIZ(EnumC1417520mzW.class, str);
    }

    public EnumC1417520mzW(String str, int i, int i2) {
        this.LL = i2;
    }
}
