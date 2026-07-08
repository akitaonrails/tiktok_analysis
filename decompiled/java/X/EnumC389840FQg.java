package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC389840FQg {
    public static final EnumC389840FQg BOTTOM;
    public static final EnumC389840FQg LEFT;
    public static final /* synthetic */ EnumC389840FQg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC389840FQg RIGHT;
    public static final EnumC389840FQg TOP;

    public static InterfaceC2044707zh<EnumC389840FQg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC389840FQg enumC389840FQg = new EnumC389840FQg("LEFT", 0);
        LEFT = enumC389840FQg;
        EnumC389840FQg enumC389840FQg2 = new EnumC389840FQg("TOP", 1);
        TOP = enumC389840FQg2;
        EnumC389840FQg enumC389840FQg3 = new EnumC389840FQg("RIGHT", 2);
        RIGHT = enumC389840FQg3;
        EnumC389840FQg enumC389840FQg4 = new EnumC389840FQg("BOTTOM", 3);
        BOTTOM = enumC389840FQg4;
        EnumC389840FQg[] enumC389840FQgArr = {enumC389840FQg, enumC389840FQg2, enumC389840FQg3, enumC389840FQg4};
        LL = enumC389840FQgArr;
        LLILLJJLI = new C2254308sP(enumC389840FQgArr);
    }

    public static EnumC389840FQg[] values() {
        return (EnumC389840FQg[]) LL.clone();
    }

    public static EnumC389840FQg valueOf(String str) {
        return (EnumC389840FQg) C08FF.LIZ(EnumC389840FQg.class, str);
    }

    public EnumC389840FQg(String str, int i) {
    }
}
