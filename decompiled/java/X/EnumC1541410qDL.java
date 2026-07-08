package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1541410qDL {
    public static final EnumC1541410qDL ALL_FRAMES;
    public static final /* synthetic */ EnumC1541410qDL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1541410qDL ONLY_IFRAMES;
    public static final EnumC1541410qDL ONLY_MAINFRAMES;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1541410qDL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1541410qDL enumC1541410qDL = new EnumC1541410qDL("ALL_FRAMES", 0, 0);
        ALL_FRAMES = enumC1541410qDL;
        EnumC1541410qDL enumC1541410qDL2 = new EnumC1541410qDL("ONLY_MAINFRAMES", 1, 1);
        ONLY_MAINFRAMES = enumC1541410qDL2;
        EnumC1541410qDL enumC1541410qDL3 = new EnumC1541410qDL("ONLY_IFRAMES", 2, 2);
        ONLY_IFRAMES = enumC1541410qDL3;
        EnumC1541410qDL[] enumC1541410qDLArr = {enumC1541410qDL, enumC1541410qDL2, enumC1541410qDL3};
        LLILLJJLI = enumC1541410qDLArr;
        LLILLL = new C2254308sP(enumC1541410qDLArr);
    }

    public static EnumC1541410qDL[] values() {
        return (EnumC1541410qDL[]) LLILLJJLI.clone();
    }

    public final int getScope() {
        return this.LL;
    }

    public static EnumC1541410qDL valueOf(String str) {
        return (EnumC1541410qDL) C08FF.LIZ(EnumC1541410qDL.class, str);
    }

    public EnumC1541410qDL(String str, int i, int i2) {
        this.LL = i2;
    }
}
