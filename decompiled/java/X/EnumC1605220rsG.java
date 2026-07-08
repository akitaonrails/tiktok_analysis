package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605220rsG {
    public static final EnumC1605220rsG DESC;
    public static final /* synthetic */ EnumC1605220rsG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1605220rsG NONE;
    public static final EnumC1605220rsG TITLE;
    public static final EnumC1605220rsG TITLE_AND_DESC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1605220rsG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1605220rsG enumC1605220rsG = new EnumC1605220rsG("NONE", 0, 0);
        NONE = enumC1605220rsG;
        EnumC1605220rsG enumC1605220rsG2 = new EnumC1605220rsG("TITLE", 1, 1);
        TITLE = enumC1605220rsG2;
        EnumC1605220rsG enumC1605220rsG3 = new EnumC1605220rsG("DESC", 2, 2);
        DESC = enumC1605220rsG3;
        EnumC1605220rsG enumC1605220rsG4 = new EnumC1605220rsG("TITLE_AND_DESC", 3, 3);
        TITLE_AND_DESC = enumC1605220rsG4;
        EnumC1605220rsG[] enumC1605220rsGArr = {enumC1605220rsG, enumC1605220rsG2, enumC1605220rsG3, enumC1605220rsG4};
        LLILLJJLI = enumC1605220rsGArr;
        LLILLL = new C2254308sP(enumC1605220rsGArr);
    }

    public static EnumC1605220rsG[] values() {
        return (EnumC1605220rsG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1605220rsG valueOf(String str) {
        return (EnumC1605220rsG) C08FF.LIZ(EnumC1605220rsG.class, str);
    }

    public EnumC1605220rsG(String str, int i, int i2) {
        this.LL = i2;
    }
}
