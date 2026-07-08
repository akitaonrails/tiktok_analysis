package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992920bwg {
    public static final /* synthetic */ EnumC992920bwg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992920bwg LONGEST_FIRST;
    public static final EnumC992920bwg TAIL_FIRST;

    public static InterfaceC2044707zh<EnumC992920bwg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992920bwg enumC992920bwg = new EnumC992920bwg("TAIL_FIRST", 0);
        TAIL_FIRST = enumC992920bwg;
        EnumC992920bwg enumC992920bwg2 = new EnumC992920bwg("LONGEST_FIRST", 1);
        LONGEST_FIRST = enumC992920bwg2;
        EnumC992920bwg[] enumC992920bwgArr = {enumC992920bwg, enumC992920bwg2};
        LL = enumC992920bwgArr;
        LLILLJJLI = new C2254308sP(enumC992920bwgArr);
    }

    public static EnumC992920bwg[] values() {
        return (EnumC992920bwg[]) LL.clone();
    }

    public static EnumC992920bwg valueOf(String str) {
        return (EnumC992920bwg) C08FF.LIZ(EnumC992920bwg.class, str);
    }

    public EnumC992920bwg(String str, int i) {
    }
}
