package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993110bwz {
    public static final EnumC993110bwz LAYOUT_ON;
    public static final /* synthetic */ EnumC993110bwz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993110bwz NONE;
    public static final EnumC993110bwz PROP_ON;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993110bwz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993110bwz enumC993110bwz = new EnumC993110bwz("NONE", 0, -1);
        NONE = enumC993110bwz;
        EnumC993110bwz enumC993110bwz2 = new EnumC993110bwz("PROP_ON", 1, 2131828254);
        PROP_ON = enumC993110bwz2;
        EnumC993110bwz enumC993110bwz3 = new EnumC993110bwz("LAYOUT_ON", 2, 2131828271);
        LAYOUT_ON = enumC993110bwz3;
        EnumC993110bwz[] enumC993110bwzArr = {enumC993110bwz, enumC993110bwz2, enumC993110bwz3};
        LLILLJJLI = enumC993110bwzArr;
        LLILLL = new C2254308sP(enumC993110bwzArr);
    }

    public static EnumC993110bwz[] values() {
        return (EnumC993110bwz[]) LLILLJJLI.clone();
    }

    public final int getHintTextRes() {
        return this.LL;
    }

    public static EnumC993110bwz valueOf(String str) {
        return (EnumC993110bwz) C08FF.LIZ(EnumC993110bwz.class, str);
    }

    public EnumC993110bwz(String str, int i, int i2) {
        this.LL = i2;
    }
}
