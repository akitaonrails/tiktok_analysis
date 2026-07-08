package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC896490ZEx {
    public static final EnumC896490ZEx ACTIVE_NOW;
    public static final EnumC896490ZEx ACTIVE_ON_WHEE;
    public static final C0ZF1 Companion;
    public static final EnumC896490ZEx DATE_THRESHOLD;
    public static final EnumC896490ZEx HOUR_THRESHOLD;
    public static final /* synthetic */ EnumC896490ZEx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC896490ZEx MIN_THRESHOLD;
    public static final EnumC896490ZEx NO_STATUS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC896490ZEx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC896490ZEx enumC896490ZEx = new EnumC896490ZEx("NO_STATUS", 0, 0);
        NO_STATUS = enumC896490ZEx;
        EnumC896490ZEx enumC896490ZEx2 = new EnumC896490ZEx("ACTIVE_NOW", 1, 1);
        ACTIVE_NOW = enumC896490ZEx2;
        EnumC896490ZEx enumC896490ZEx3 = new EnumC896490ZEx("MIN_THRESHOLD", 2, 2);
        MIN_THRESHOLD = enumC896490ZEx3;
        EnumC896490ZEx enumC896490ZEx4 = new EnumC896490ZEx("HOUR_THRESHOLD", 3, 3);
        HOUR_THRESHOLD = enumC896490ZEx4;
        EnumC896490ZEx enumC896490ZEx5 = new EnumC896490ZEx("DATE_THRESHOLD", 4, 4);
        DATE_THRESHOLD = enumC896490ZEx5;
        EnumC896490ZEx enumC896490ZEx6 = new EnumC896490ZEx("ACTIVE_ON_WHEE", 5, 5);
        ACTIVE_ON_WHEE = enumC896490ZEx6;
        EnumC896490ZEx[] enumC896490ZExArr = {enumC896490ZEx, enumC896490ZEx2, enumC896490ZEx3, enumC896490ZEx4, enumC896490ZEx5, enumC896490ZEx6};
        LLILLJJLI = enumC896490ZExArr;
        LLILLL = new C2254308sP(enumC896490ZExArr);
        Companion = new C0ZF1();
    }

    public static EnumC896490ZEx[] values() {
        return (EnumC896490ZEx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC896490ZEx valueOf(String str) {
        return (EnumC896490ZEx) C08FF.LIZ(EnumC896490ZEx.class, str);
    }

    public EnumC896490ZEx(String str, int i, int i2) {
        this.LL = i2;
    }
}
