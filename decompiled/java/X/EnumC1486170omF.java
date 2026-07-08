package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0omF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486170omF {
    public static final /* synthetic */ EnumC1486170omF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1486170omF PAUSE;
    public static final EnumC1486170omF PLAY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1486170omF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1486170omF enumC1486170omF = new EnumC1486170omF("PAUSE", 0, 0);
        PAUSE = enumC1486170omF;
        EnumC1486170omF enumC1486170omF2 = new EnumC1486170omF("PLAY", 1, 1);
        PLAY = enumC1486170omF2;
        EnumC1486170omF[] enumC1486170omFArr = {enumC1486170omF, enumC1486170omF2};
        LLILLJJLI = enumC1486170omFArr;
        LLILLL = new C2254308sP(enumC1486170omFArr);
    }

    public static EnumC1486170omF[] values() {
        return (EnumC1486170omF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1486170omF valueOf(String str) {
        return (EnumC1486170omF) C08FF.LIZ(EnumC1486170omF.class, str);
    }

    public EnumC1486170omF(String str, int i, int i2) {
        this.LL = i2;
    }
}
