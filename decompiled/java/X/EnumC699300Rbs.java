package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699300Rbs {
    public static final /* synthetic */ EnumC699300Rbs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC699300Rbs WITH;
    public static final EnumC699300Rbs WITHOUT;

    public static InterfaceC2044707zh<EnumC699300Rbs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC699300Rbs enumC699300Rbs = new EnumC699300Rbs("WITH", 0);
        WITH = enumC699300Rbs;
        EnumC699300Rbs enumC699300Rbs2 = new EnumC699300Rbs("WITHOUT", 1);
        WITHOUT = enumC699300Rbs2;
        EnumC699300Rbs[] enumC699300RbsArr = {enumC699300Rbs, enumC699300Rbs2};
        LL = enumC699300RbsArr;
        LLILLJJLI = new C2254308sP(enumC699300RbsArr);
    }

    public static EnumC699300Rbs[] values() {
        return (EnumC699300Rbs[]) LL.clone();
    }

    public static EnumC699300Rbs valueOf(String str) {
        return (EnumC699300Rbs) C08FF.LIZ(EnumC699300Rbs.class, str);
    }

    public EnumC699300Rbs(String str, int i) {
    }
}
