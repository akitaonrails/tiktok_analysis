package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142040fpC {
    public static final EnumC1142040fpC ERROR;
    public static final EnumC1142040fpC IDLE;
    public static final /* synthetic */ EnumC1142040fpC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142040fpC LOADING;
    public static final EnumC1142040fpC READY;

    public static InterfaceC2044707zh<EnumC1142040fpC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142040fpC enumC1142040fpC = new EnumC1142040fpC("IDLE", 0);
        IDLE = enumC1142040fpC;
        EnumC1142040fpC enumC1142040fpC2 = new EnumC1142040fpC("LOADING", 1);
        LOADING = enumC1142040fpC2;
        EnumC1142040fpC enumC1142040fpC3 = new EnumC1142040fpC("READY", 2);
        READY = enumC1142040fpC3;
        EnumC1142040fpC enumC1142040fpC4 = new EnumC1142040fpC("ERROR", 3);
        ERROR = enumC1142040fpC4;
        EnumC1142040fpC[] enumC1142040fpCArr = {enumC1142040fpC, enumC1142040fpC2, enumC1142040fpC3, enumC1142040fpC4};
        LL = enumC1142040fpCArr;
        LLILLJJLI = new C2254308sP(enumC1142040fpCArr);
    }

    public static EnumC1142040fpC[] values() {
        return (EnumC1142040fpC[]) LL.clone();
    }

    public static EnumC1142040fpC valueOf(String str) {
        return (EnumC1142040fpC) C08FF.LIZ(EnumC1142040fpC.class, str);
    }

    public EnumC1142040fpC(String str, int i) {
    }
}
