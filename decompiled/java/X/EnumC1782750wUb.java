package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782750wUb {
    public static final /* synthetic */ EnumC1782750wUb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782750wUb NO_CHANGE;
    public static final EnumC1782750wUb XY_MOVE_TO_CENTER;
    public static final EnumC1782750wUb XY_SCALE_TO_CENTER;

    public static InterfaceC2044707zh<EnumC1782750wUb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782750wUb enumC1782750wUb = new EnumC1782750wUb("XY_SCALE_TO_CENTER", 0);
        XY_SCALE_TO_CENTER = enumC1782750wUb;
        EnumC1782750wUb enumC1782750wUb2 = new EnumC1782750wUb("XY_MOVE_TO_CENTER", 1);
        XY_MOVE_TO_CENTER = enumC1782750wUb2;
        EnumC1782750wUb enumC1782750wUb3 = new EnumC1782750wUb("NO_CHANGE", 2);
        NO_CHANGE = enumC1782750wUb3;
        EnumC1782750wUb[] enumC1782750wUbArr = {enumC1782750wUb, enumC1782750wUb2, enumC1782750wUb3};
        LL = enumC1782750wUbArr;
        LLILLJJLI = new C2254308sP(enumC1782750wUbArr);
    }

    public static EnumC1782750wUb[] values() {
        return (EnumC1782750wUb[]) LL.clone();
    }

    public static EnumC1782750wUb valueOf(String str) {
        return (EnumC1782750wUb) C08FF.LIZ(EnumC1782750wUb.class, str);
    }

    public EnumC1782750wUb(String str, int i) {
    }
}
