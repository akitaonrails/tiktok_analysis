package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1005903wX {
    public static final EnumC1005903wX LEFT;
    public static final /* synthetic */ EnumC1005903wX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1005903wX RIGHT;

    public static InterfaceC2044707zh<EnumC1005903wX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1005903wX enumC1005903wX = new EnumC1005903wX("LEFT", 0);
        LEFT = enumC1005903wX;
        EnumC1005903wX enumC1005903wX2 = new EnumC1005903wX("RIGHT", 1);
        RIGHT = enumC1005903wX2;
        EnumC1005903wX[] enumC1005903wXArr = {enumC1005903wX, enumC1005903wX2};
        LL = enumC1005903wXArr;
        LLILLJJLI = new C2254308sP(enumC1005903wXArr);
    }

    public static EnumC1005903wX[] values() {
        return (EnumC1005903wX[]) LL.clone();
    }

    public static EnumC1005903wX valueOf(String str) {
        return (EnumC1005903wX) C08FF.LIZ(EnumC1005903wX.class, str);
    }

    public EnumC1005903wX(String str, int i) {
    }
}
