package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782730wUZ {
    public static final /* synthetic */ EnumC1782730wUZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782730wUZ NO_CHANGE;
    public static final EnumC1782730wUZ XY_MOVE_TO_CENTER;
    public static final EnumC1782730wUZ XY_SCALE_TO_CENTER;
    public static final EnumC1782730wUZ XY_SCALE_TO_TOP;

    public static InterfaceC2044707zh<EnumC1782730wUZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782730wUZ enumC1782730wUZ = new EnumC1782730wUZ("XY_SCALE_TO_TOP", 0);
        XY_SCALE_TO_TOP = enumC1782730wUZ;
        EnumC1782730wUZ enumC1782730wUZ2 = new EnumC1782730wUZ("XY_SCALE_TO_CENTER", 1);
        XY_SCALE_TO_CENTER = enumC1782730wUZ2;
        EnumC1782730wUZ enumC1782730wUZ3 = new EnumC1782730wUZ("XY_MOVE_TO_CENTER", 2);
        XY_MOVE_TO_CENTER = enumC1782730wUZ3;
        EnumC1782730wUZ enumC1782730wUZ4 = new EnumC1782730wUZ("NO_CHANGE", 3);
        NO_CHANGE = enumC1782730wUZ4;
        EnumC1782730wUZ[] enumC1782730wUZArr = {enumC1782730wUZ, enumC1782730wUZ2, enumC1782730wUZ3, enumC1782730wUZ4};
        LL = enumC1782730wUZArr;
        LLILLJJLI = new C2254308sP(enumC1782730wUZArr);
    }

    public static EnumC1782730wUZ[] values() {
        return (EnumC1782730wUZ[]) LL.clone();
    }

    public static EnumC1782730wUZ valueOf(String str) {
        return (EnumC1782730wUZ) C08FF.LIZ(EnumC1782730wUZ.class, str);
    }

    public EnumC1782730wUZ(String str, int i) {
    }
}
