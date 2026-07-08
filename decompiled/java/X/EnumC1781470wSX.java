package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781470wSX {
    public static final EnumC1781470wSX AFTER_RECHARGE;
    public static final EnumC1781470wSX CONTROL;
    public static final EnumC1781470wSX LIVE_ROOM_EXCLUDED;
    public static final /* synthetic */ EnumC1781470wSX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1781470wSX RECHARGE_PANEL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1781470wSX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781470wSX enumC1781470wSX = new EnumC1781470wSX("CONTROL", 0, 0);
        CONTROL = enumC1781470wSX;
        EnumC1781470wSX enumC1781470wSX2 = new EnumC1781470wSX("LIVE_ROOM_EXCLUDED", 1, 1);
        LIVE_ROOM_EXCLUDED = enumC1781470wSX2;
        EnumC1781470wSX enumC1781470wSX3 = new EnumC1781470wSX("RECHARGE_PANEL", 2, 2);
        RECHARGE_PANEL = enumC1781470wSX3;
        EnumC1781470wSX enumC1781470wSX4 = new EnumC1781470wSX("AFTER_RECHARGE", 3, 3);
        AFTER_RECHARGE = enumC1781470wSX4;
        EnumC1781470wSX[] enumC1781470wSXArr = {enumC1781470wSX, enumC1781470wSX2, enumC1781470wSX3, enumC1781470wSX4};
        LLILLJJLI = enumC1781470wSXArr;
        LLILLL = new C2254308sP(enumC1781470wSXArr);
    }

    public static EnumC1781470wSX[] values() {
        return (EnumC1781470wSX[]) LLILLJJLI.clone();
    }

    public final int getGroup() {
        return this.LL;
    }

    public static EnumC1781470wSX valueOf(String str) {
        return (EnumC1781470wSX) C08FF.LIZ(EnumC1781470wSX.class, str);
    }

    public EnumC1781470wSX(String str, int i, int i2) {
        this.LL = i2;
    }
}
