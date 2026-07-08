package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631330OpX {
    public static final EnumC631330OpX AUTH;
    public static final EnumC631330OpX CLICK;
    public static final /* synthetic */ EnumC631330OpX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC631330OpX PRESAVE_AUTH;
    public static final EnumC631330OpX PRESAVE_CLICK;
    public static final EnumC631330OpX PRESAVE_SAVE;
    public static final EnumC631330OpX PRESAVE_SHOW;
    public static final EnumC631330OpX SAVE;
    public static final EnumC631330OpX SAVE_MY_MUSIC;
    public static final EnumC631330OpX SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC631330OpX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC631330OpX enumC631330OpX = new EnumC631330OpX("SHOW", 0, 1);
        SHOW = enumC631330OpX;
        EnumC631330OpX enumC631330OpX2 = new EnumC631330OpX("CLICK", 1, 2);
        CLICK = enumC631330OpX2;
        EnumC631330OpX enumC631330OpX3 = new EnumC631330OpX("AUTH", 2, 3);
        AUTH = enumC631330OpX3;
        EnumC631330OpX enumC631330OpX4 = new EnumC631330OpX("SAVE", 3, 4);
        SAVE = enumC631330OpX4;
        EnumC631330OpX enumC631330OpX5 = new EnumC631330OpX("SAVE_MY_MUSIC", 4, 5);
        SAVE_MY_MUSIC = enumC631330OpX5;
        EnumC631330OpX enumC631330OpX6 = new EnumC631330OpX("PRESAVE_SHOW", 5, 6);
        PRESAVE_SHOW = enumC631330OpX6;
        EnumC631330OpX enumC631330OpX7 = new EnumC631330OpX("PRESAVE_CLICK", 6, 7);
        PRESAVE_CLICK = enumC631330OpX7;
        EnumC631330OpX enumC631330OpX8 = new EnumC631330OpX("PRESAVE_AUTH", 7, 8);
        PRESAVE_AUTH = enumC631330OpX8;
        EnumC631330OpX enumC631330OpX9 = new EnumC631330OpX("PRESAVE_SAVE", 8, 9);
        PRESAVE_SAVE = enumC631330OpX9;
        EnumC631330OpX[] enumC631330OpXArr = {enumC631330OpX, enumC631330OpX2, enumC631330OpX3, enumC631330OpX4, enumC631330OpX5, enumC631330OpX6, enumC631330OpX7, enumC631330OpX8, enumC631330OpX9};
        LLILLJJLI = enumC631330OpXArr;
        LLILLL = new C2254308sP(enumC631330OpXArr);
    }

    public static EnumC631330OpX[] values() {
        return (EnumC631330OpX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC631330OpX valueOf(String str) {
        return (EnumC631330OpX) C08FF.LIZ(EnumC631330OpX.class, str);
    }

    public EnumC631330OpX(String str, int i, int i2) {
        this.LL = i2;
    }
}
