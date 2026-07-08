package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1758320vrC {
    public static final EnumC1758320vrC COMPLETE;
    public static final EnumC1758320vrC ERROR;
    public static final /* synthetic */ EnumC1758320vrC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1758320vrC START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1758320vrC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1758320vrC enumC1758320vrC = new EnumC1758320vrC("START", 0, 0);
        START = enumC1758320vrC;
        EnumC1758320vrC enumC1758320vrC2 = new EnumC1758320vrC("COMPLETE", 1, 1);
        COMPLETE = enumC1758320vrC2;
        EnumC1758320vrC enumC1758320vrC3 = new EnumC1758320vrC("ERROR", 2, 2);
        ERROR = enumC1758320vrC3;
        EnumC1758320vrC[] enumC1758320vrCArr = {enumC1758320vrC, enumC1758320vrC2, enumC1758320vrC3};
        LLILLJJLI = enumC1758320vrCArr;
        LLILLL = new C2254308sP(enumC1758320vrCArr);
    }

    public static EnumC1758320vrC[] values() {
        return (EnumC1758320vrC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1758320vrC valueOf(String str) {
        return (EnumC1758320vrC) C08FF.LIZ(EnumC1758320vrC.class, str);
    }

    public EnumC1758320vrC(String str, int i, int i2) {
        this.LL = i2;
    }
}
