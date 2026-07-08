package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1300180jwG {
    public static final EnumC1300180jwG BUTTON_JOIN;
    public static final EnumC1300180jwG IMAGE;
    public static final /* synthetic */ EnumC1300180jwG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1300180jwG TEXT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1300180jwG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1300180jwG enumC1300180jwG = new EnumC1300180jwG("BUTTON_JOIN", 0, "button_join");
        BUTTON_JOIN = enumC1300180jwG;
        EnumC1300180jwG enumC1300180jwG2 = new EnumC1300180jwG("IMAGE", 1, "image");
        IMAGE = enumC1300180jwG2;
        EnumC1300180jwG enumC1300180jwG3 = new EnumC1300180jwG("TEXT", 2, "text");
        TEXT = enumC1300180jwG3;
        EnumC1300180jwG[] enumC1300180jwGArr = {enumC1300180jwG, enumC1300180jwG2, enumC1300180jwG3};
        LLILLJJLI = enumC1300180jwGArr;
        LLILLL = new C2254308sP(enumC1300180jwGArr);
    }

    public static EnumC1300180jwG[] values() {
        return (EnumC1300180jwG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1300180jwG valueOf(String str) {
        return (EnumC1300180jwG) C08FF.LIZ(EnumC1300180jwG.class, str);
    }

    public EnumC1300180jwG(String str, int i, String str2) {
        this.LL = str2;
    }
}
