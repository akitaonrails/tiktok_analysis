package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC384820F6y {
    public static final EnumC384820F6y LINEAR_DIAGONAL;
    public static final EnumC384820F6y LINEAR_HORIZONTAL;
    public static final EnumC384820F6y LINEAR_VERTICAL;
    public static final /* synthetic */ EnumC384820F6y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC384820F6y SWEEP;

    public static InterfaceC2044707zh<EnumC384820F6y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC384820F6y enumC384820F6y = new EnumC384820F6y("SWEEP", 0);
        SWEEP = enumC384820F6y;
        EnumC384820F6y enumC384820F6y2 = new EnumC384820F6y("LINEAR_HORIZONTAL", 1);
        LINEAR_HORIZONTAL = enumC384820F6y2;
        EnumC384820F6y enumC384820F6y3 = new EnumC384820F6y("LINEAR_VERTICAL", 2);
        LINEAR_VERTICAL = enumC384820F6y3;
        EnumC384820F6y enumC384820F6y4 = new EnumC384820F6y("LINEAR_DIAGONAL", 3);
        LINEAR_DIAGONAL = enumC384820F6y4;
        EnumC384820F6y[] enumC384820F6yArr = {enumC384820F6y, enumC384820F6y2, enumC384820F6y3, enumC384820F6y4};
        LL = enumC384820F6yArr;
        LLILLJJLI = new C2254308sP(enumC384820F6yArr);
    }

    public static EnumC384820F6y[] values() {
        return (EnumC384820F6y[]) LL.clone();
    }

    public static EnumC384820F6y valueOf(String str) {
        return (EnumC384820F6y) C08FF.LIZ(EnumC384820F6y.class, str);
    }

    public EnumC384820F6y(String str, int i) {
    }
}
