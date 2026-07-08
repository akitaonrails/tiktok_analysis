package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1907220zjM {
    public static final EnumC1907220zjM LEFT;
    public static final /* synthetic */ EnumC1907220zjM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1907220zjM MIDDLE;
    public static final EnumC1907220zjM RIGHT;
    public static final EnumC1907220zjM ROOT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1907220zjM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1907220zjM enumC1907220zjM = new EnumC1907220zjM("LEFT", 0, 0);
        LEFT = enumC1907220zjM;
        EnumC1907220zjM enumC1907220zjM2 = new EnumC1907220zjM("MIDDLE", 1, 1);
        MIDDLE = enumC1907220zjM2;
        EnumC1907220zjM enumC1907220zjM3 = new EnumC1907220zjM("RIGHT", 2, 2);
        RIGHT = enumC1907220zjM3;
        EnumC1907220zjM enumC1907220zjM4 = new EnumC1907220zjM("ROOT", 3, 3);
        ROOT = enumC1907220zjM4;
        EnumC1907220zjM[] enumC1907220zjMArr = {enumC1907220zjM, enumC1907220zjM2, enumC1907220zjM3, enumC1907220zjM4};
        LLILLJJLI = enumC1907220zjMArr;
        LLILLL = new C2254308sP(enumC1907220zjMArr);
    }

    public static EnumC1907220zjM[] values() {
        return (EnumC1907220zjM[]) LLILLJJLI.clone();
    }

    public final int getPosition() {
        return this.LL;
    }

    public static EnumC1907220zjM valueOf(String str) {
        return (EnumC1907220zjM) C08FF.LIZ(EnumC1907220zjM.class, str);
    }

    public EnumC1907220zjM(String str, int i, int i2) {
        this.LL = i2;
    }
}
