package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994550bzJ {
    public static final EnumC994550bzJ LEAGUE_MATCH;
    public static final /* synthetic */ EnumC994550bzJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994550bzJ NORMAL;

    public static InterfaceC2044707zh<EnumC994550bzJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994550bzJ enumC994550bzJ = new EnumC994550bzJ("NORMAL", 0);
        NORMAL = enumC994550bzJ;
        EnumC994550bzJ enumC994550bzJ2 = new EnumC994550bzJ("LEAGUE_MATCH", 1);
        LEAGUE_MATCH = enumC994550bzJ2;
        EnumC994550bzJ[] enumC994550bzJArr = {enumC994550bzJ, enumC994550bzJ2};
        LL = enumC994550bzJArr;
        LLILLJJLI = new C2254308sP(enumC994550bzJArr);
    }

    public static EnumC994550bzJ[] values() {
        return (EnumC994550bzJ[]) LL.clone();
    }

    public static EnumC994550bzJ valueOf(String str) {
        return (EnumC994550bzJ) C08FF.LIZ(EnumC994550bzJ.class, str);
    }

    public EnumC994550bzJ(String str, int i) {
    }
}
