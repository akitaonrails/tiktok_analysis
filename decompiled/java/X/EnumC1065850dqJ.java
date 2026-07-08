package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1065850dqJ {
    public static final /* synthetic */ EnumC1065850dqJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1065850dqJ LONG_PRESS;
    public static final EnumC1065850dqJ TAP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1065850dqJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1065850dqJ enumC1065850dqJ = new EnumC1065850dqJ("LONG_PRESS", 0, "long_press");
        LONG_PRESS = enumC1065850dqJ;
        EnumC1065850dqJ enumC1065850dqJ2 = new EnumC1065850dqJ("TAP", 1, "tap");
        TAP = enumC1065850dqJ2;
        EnumC1065850dqJ[] enumC1065850dqJArr = {enumC1065850dqJ, enumC1065850dqJ2};
        LLILLJJLI = enumC1065850dqJArr;
        LLILLL = new C2254308sP(enumC1065850dqJArr);
    }

    public static EnumC1065850dqJ[] values() {
        return (EnumC1065850dqJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1065850dqJ valueOf(String str) {
        return (EnumC1065850dqJ) C08FF.LIZ(EnumC1065850dqJ.class, str);
    }

    public EnumC1065850dqJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
