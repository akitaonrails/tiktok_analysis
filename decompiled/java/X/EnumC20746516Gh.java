package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.16Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20746516Gh {
    public static final EnumC20746516Gh COLLAPSED;
    public static final EnumC20746516Gh EXPANDED;
    public static final EnumC20746516Gh HIDDEN;
    public static final /* synthetic */ EnumC20746516Gh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20746516Gh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20746516Gh enumC20746516Gh = new EnumC20746516Gh("COLLAPSED", 0, "collapsed");
        COLLAPSED = enumC20746516Gh;
        EnumC20746516Gh enumC20746516Gh2 = new EnumC20746516Gh("EXPANDED", 1, "expanded");
        EXPANDED = enumC20746516Gh2;
        EnumC20746516Gh enumC20746516Gh3 = new EnumC20746516Gh("HIDDEN", 2, "hidden");
        HIDDEN = enumC20746516Gh3;
        EnumC20746516Gh[] enumC20746516GhArr = {enumC20746516Gh, enumC20746516Gh2, enumC20746516Gh3};
        LLILLJJLI = enumC20746516GhArr;
        LLILLL = new C2254308sP(enumC20746516GhArr);
    }

    public static EnumC20746516Gh[] values() {
        return (EnumC20746516Gh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20746516Gh valueOf(String str) {
        return (EnumC20746516Gh) C08FF.LIZ(EnumC20746516Gh.class, str);
    }

    public EnumC20746516Gh(String str, int i, String str2) {
        this.LL = str2;
    }
}
