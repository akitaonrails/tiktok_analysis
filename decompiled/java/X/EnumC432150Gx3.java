package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC432150Gx3 {
    public static final EnumC432150Gx3 LEFT_BOTTOM;
    public static final EnumC432150Gx3 LEFT_TOP;
    public static final /* synthetic */ EnumC432150Gx3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC432150Gx3 RIGHT_BOTTOM;
    public static final EnumC432150Gx3 RIGHT_TOP;

    public static InterfaceC2044707zh<EnumC432150Gx3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC432150Gx3 enumC432150Gx3 = new EnumC432150Gx3("LEFT_TOP", 0);
        LEFT_TOP = enumC432150Gx3;
        EnumC432150Gx3 enumC432150Gx32 = new EnumC432150Gx3("LEFT_BOTTOM", 1);
        LEFT_BOTTOM = enumC432150Gx32;
        EnumC432150Gx3 enumC432150Gx33 = new EnumC432150Gx3("RIGHT_TOP", 2);
        RIGHT_TOP = enumC432150Gx33;
        EnumC432150Gx3 enumC432150Gx34 = new EnumC432150Gx3("RIGHT_BOTTOM", 3);
        RIGHT_BOTTOM = enumC432150Gx34;
        EnumC432150Gx3[] enumC432150Gx3Arr = {enumC432150Gx3, enumC432150Gx32, enumC432150Gx33, enumC432150Gx34};
        LL = enumC432150Gx3Arr;
        LLILLJJLI = new C2254308sP(enumC432150Gx3Arr);
    }

    public static EnumC432150Gx3[] values() {
        return (EnumC432150Gx3[]) LL.clone();
    }

    public static EnumC432150Gx3 valueOf(String str) {
        return (EnumC432150Gx3) C08FF.LIZ(EnumC432150Gx3.class, str);
    }

    public EnumC432150Gx3(String str, int i) {
    }
}
