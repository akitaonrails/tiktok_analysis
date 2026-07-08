package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.102o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC191820102o {
    public static final EnumC191820102o LLILLL;
    public static final EnumC191820102o LLILZ;
    public static final EnumC191820102o LLILZIL;
    public static final /* synthetic */ EnumC191820102o[] LLILZLL;
    public final boolean LL;
    public final boolean LLILLJJLI;

    static {
        EnumC191820102o enumC191820102o = new EnumC191820102o("GTE18", 0, true, true);
        LLILLL = enumC191820102o;
        EnumC191820102o enumC191820102o2 = new EnumC191820102o("GTE16LT18", 1, true, false);
        LLILZ = enumC191820102o2;
        EnumC191820102o enumC191820102o3 = new EnumC191820102o("LT16", 2, false, false);
        LLILZIL = enumC191820102o3;
        EnumC191820102o[] enumC191820102oArr = {enumC191820102o, enumC191820102o2, enumC191820102o3};
        LLILZLL = enumC191820102oArr;
        new C2254308sP(enumC191820102oArr);
    }

    public static EnumC191820102o[] values() {
        return (EnumC191820102o[]) LLILZLL.clone();
    }

    public static EnumC191820102o valueOf(String str) {
        return (EnumC191820102o) C08FF.LIZ(EnumC191820102o.class, str);
    }

    public EnumC191820102o(String str, int i, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
