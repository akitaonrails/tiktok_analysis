package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008807tu {
    public static final /* synthetic */ EnumC2008807tu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2008807tu RATIO_SWITCH;
    public static final EnumC2008807tu TAB_CHANGED;

    public static InterfaceC2044707zh<EnumC2008807tu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2008807tu enumC2008807tu = new EnumC2008807tu("TAB_CHANGED", 0);
        TAB_CHANGED = enumC2008807tu;
        EnumC2008807tu enumC2008807tu2 = new EnumC2008807tu("RATIO_SWITCH", 1);
        RATIO_SWITCH = enumC2008807tu2;
        EnumC2008807tu[] enumC2008807tuArr = {enumC2008807tu, enumC2008807tu2};
        LL = enumC2008807tuArr;
        LLILLJJLI = new C2254308sP(enumC2008807tuArr);
    }

    public static EnumC2008807tu[] values() {
        return (EnumC2008807tu[]) LL.clone();
    }

    public static EnumC2008807tu valueOf(String str) {
        return (EnumC2008807tu) C08FF.LIZ(EnumC2008807tu.class, str);
    }

    public EnumC2008807tu(String str, int i) {
    }
}
