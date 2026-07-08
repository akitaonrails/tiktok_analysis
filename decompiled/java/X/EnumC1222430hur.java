package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222430hur {
    public static final EnumC1222430hur BOTTOM;
    public static final /* synthetic */ EnumC1222430hur[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1222430hur NONE;
    public static final EnumC1222430hur TOP;

    public static InterfaceC2044707zh<EnumC1222430hur> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1222430hur enumC1222430hur = new EnumC1222430hur("TOP", 0);
        TOP = enumC1222430hur;
        EnumC1222430hur enumC1222430hur2 = new EnumC1222430hur("BOTTOM", 1);
        BOTTOM = enumC1222430hur2;
        EnumC1222430hur enumC1222430hur3 = new EnumC1222430hur("NONE", 2);
        NONE = enumC1222430hur3;
        EnumC1222430hur[] enumC1222430hurArr = {enumC1222430hur, enumC1222430hur2, enumC1222430hur3};
        LL = enumC1222430hurArr;
        LLILLJJLI = new C2254308sP(enumC1222430hurArr);
    }

    public static EnumC1222430hur[] values() {
        return (EnumC1222430hur[]) LL.clone();
    }

    public static EnumC1222430hur valueOf(String str) {
        return (EnumC1222430hur) C08FF.LIZ(EnumC1222430hur.class, str);
    }

    public EnumC1222430hur(String str, int i) {
    }
}
