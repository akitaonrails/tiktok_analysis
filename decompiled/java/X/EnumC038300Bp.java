package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038300Bp {
    public static final EnumC038300Bp ADDED;
    public static final EnumC038300Bp ADDING;
    public static final /* synthetic */ EnumC038300Bp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC038300Bp UN_ADD;

    public static InterfaceC2044707zh<EnumC038300Bp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC038300Bp enumC038300Bp = new EnumC038300Bp("UN_ADD", 0);
        UN_ADD = enumC038300Bp;
        EnumC038300Bp enumC038300Bp2 = new EnumC038300Bp("ADDED", 1);
        ADDED = enumC038300Bp2;
        EnumC038300Bp enumC038300Bp3 = new EnumC038300Bp("ADDING", 2);
        ADDING = enumC038300Bp3;
        EnumC038300Bp[] enumC038300BpArr = {enumC038300Bp, enumC038300Bp2, enumC038300Bp3};
        LL = enumC038300BpArr;
        LLILLJJLI = new C2254308sP(enumC038300BpArr);
    }

    public static EnumC038300Bp[] values() {
        return (EnumC038300Bp[]) LL.clone();
    }

    public static EnumC038300Bp valueOf(String str) {
        return (EnumC038300Bp) C08FF.LIZ(EnumC038300Bp.class, str);
    }

    public EnumC038300Bp(String str, int i) {
    }
}
