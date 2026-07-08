package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gtr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC430170Gtr {
    public static final EnumC430170Gtr LEFT;
    public static final /* synthetic */ EnumC430170Gtr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC430170Gtr RIGHT;

    public static InterfaceC2044707zh<EnumC430170Gtr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC430170Gtr enumC430170Gtr = new EnumC430170Gtr("LEFT", 0);
        LEFT = enumC430170Gtr;
        EnumC430170Gtr enumC430170Gtr2 = new EnumC430170Gtr("RIGHT", 1);
        RIGHT = enumC430170Gtr2;
        EnumC430170Gtr[] enumC430170GtrArr = {enumC430170Gtr, enumC430170Gtr2};
        LL = enumC430170GtrArr;
        LLILLJJLI = new C2254308sP(enumC430170GtrArr);
    }

    public static EnumC430170Gtr[] values() {
        return (EnumC430170Gtr[]) LL.clone();
    }

    public static EnumC430170Gtr valueOf(String str) {
        return (EnumC430170Gtr) C08FF.LIZ(EnumC430170Gtr.class, str);
    }

    public EnumC430170Gtr(String str, int i) {
    }
}
