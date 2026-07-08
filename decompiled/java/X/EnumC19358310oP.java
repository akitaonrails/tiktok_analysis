package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19358310oP {
    public static final EnumC19358310oP END_BOTTOM;
    public static final EnumC19358310oP END_TOP;
    public static final /* synthetic */ EnumC19358310oP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19358310oP NONE;
    public static final EnumC19358310oP START_BOTTOM;
    public static final EnumC19358310oP START_TOP;

    public static InterfaceC2044707zh<EnumC19358310oP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19358310oP enumC19358310oP = new EnumC19358310oP("NONE", 0);
        NONE = enumC19358310oP;
        EnumC19358310oP enumC19358310oP2 = new EnumC19358310oP("START_TOP", 1);
        START_TOP = enumC19358310oP2;
        EnumC19358310oP enumC19358310oP3 = new EnumC19358310oP("START_BOTTOM", 2);
        START_BOTTOM = enumC19358310oP3;
        EnumC19358310oP enumC19358310oP4 = new EnumC19358310oP("END_TOP", 3);
        END_TOP = enumC19358310oP4;
        EnumC19358310oP enumC19358310oP5 = new EnumC19358310oP("END_BOTTOM", 4);
        END_BOTTOM = enumC19358310oP5;
        EnumC19358310oP[] enumC19358310oPArr = {enumC19358310oP, enumC19358310oP2, enumC19358310oP3, enumC19358310oP4, enumC19358310oP5};
        LL = enumC19358310oPArr;
        LLILLJJLI = new C2254308sP(enumC19358310oPArr);
    }

    public static EnumC19358310oP[] values() {
        return (EnumC19358310oP[]) LL.clone();
    }

    public static EnumC19358310oP valueOf(String str) {
        return (EnumC19358310oP) C08FF.LIZ(EnumC19358310oP.class, str);
    }

    public EnumC19358310oP(String str, int i) {
    }
}
