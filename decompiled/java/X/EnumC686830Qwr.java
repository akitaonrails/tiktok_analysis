package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC686830Qwr {
    public static final EnumC686830Qwr FAKE;
    public static final /* synthetic */ EnumC686830Qwr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC686830Qwr NOT_AVAILABLE;
    public static final EnumC686830Qwr STRONG;
    public static final EnumC686830Qwr WEAK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC686830Qwr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC686830Qwr enumC686830Qwr = new EnumC686830Qwr("NOT_AVAILABLE", 0, 0);
        NOT_AVAILABLE = enumC686830Qwr;
        EnumC686830Qwr enumC686830Qwr2 = new EnumC686830Qwr("FAKE", 1, 1);
        FAKE = enumC686830Qwr2;
        EnumC686830Qwr enumC686830Qwr3 = new EnumC686830Qwr("WEAK", 2, 2);
        WEAK = enumC686830Qwr3;
        EnumC686830Qwr enumC686830Qwr4 = new EnumC686830Qwr("STRONG", 3, 3);
        STRONG = enumC686830Qwr4;
        EnumC686830Qwr[] enumC686830QwrArr = {enumC686830Qwr, enumC686830Qwr2, enumC686830Qwr3, enumC686830Qwr4};
        LLILLJJLI = enumC686830QwrArr;
        LLILLL = new C2254308sP(enumC686830QwrArr);
    }

    public static EnumC686830Qwr[] values() {
        return (EnumC686830Qwr[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC686830Qwr valueOf(String str) {
        return (EnumC686830Qwr) C08FF.LIZ(EnumC686830Qwr.class, str);
    }

    public EnumC686830Qwr(String str, int i, int i2) {
        this.LL = i2;
    }
}
