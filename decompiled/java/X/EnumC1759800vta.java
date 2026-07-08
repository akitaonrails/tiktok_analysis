package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759800vta {
    public static final EnumC1759800vta LEFT;
    public static final /* synthetic */ EnumC1759800vta[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1759800vta MIDDLE;
    public static final EnumC1759800vta RIGHT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759800vta> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759800vta enumC1759800vta = new EnumC1759800vta("LEFT", 0, 1);
        LEFT = enumC1759800vta;
        EnumC1759800vta enumC1759800vta2 = new EnumC1759800vta("MIDDLE", 1, 2);
        MIDDLE = enumC1759800vta2;
        EnumC1759800vta enumC1759800vta3 = new EnumC1759800vta("RIGHT", 2, 3);
        RIGHT = enumC1759800vta3;
        EnumC1759800vta[] enumC1759800vtaArr = {enumC1759800vta, enumC1759800vta2, enumC1759800vta3};
        LLILLJJLI = enumC1759800vtaArr;
        LLILLL = new C2254308sP(enumC1759800vtaArr);
    }

    public static EnumC1759800vta[] values() {
        return (EnumC1759800vta[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759800vta valueOf(String str) {
        return (EnumC1759800vta) C08FF.LIZ(EnumC1759800vta.class, str);
    }

    public EnumC1759800vta(String str, int i, int i2) {
        this.LL = i2;
    }
}
