package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780060wQG {
    public static final EnumC1780060wQG LL;
    public static final EnumC1780060wQG LLILLJJLI;
    public static final EnumC1780060wQG LLILLL;
    public static final /* synthetic */ EnumC1780060wQG[] LLILZ;

    static {
        EnumC1780060wQG enumC1780060wQG = new EnumC1780060wQG("NONE", 0);
        LL = enumC1780060wQG;
        EnumC1780060wQG enumC1780060wQG2 = new EnumC1780060wQG("FAN", 1);
        LLILLJJLI = enumC1780060wQG2;
        EnumC1780060wQG enumC1780060wQG3 = new EnumC1780060wQG("REGULAR", 2);
        LLILLL = enumC1780060wQG3;
        EnumC1780060wQG[] enumC1780060wQGArr = {enumC1780060wQG, enumC1780060wQG2, enumC1780060wQG3};
        LLILZ = enumC1780060wQGArr;
        new C2254308sP(enumC1780060wQGArr);
    }

    public static EnumC1780060wQG[] values() {
        return (EnumC1780060wQG[]) LLILZ.clone();
    }

    public static EnumC1780060wQG valueOf(String str) {
        return (EnumC1780060wQG) C08FF.LIZ(EnumC1780060wQG.class, str);
    }

    public EnumC1780060wQG(String str, int i) {
    }
}
