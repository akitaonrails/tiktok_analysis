package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1687690u1H {
    public static final EnumC1687690u1H BLE;
    public static final EnumC1687690u1H BLE_REVERSE;
    public static final C1687710u1J Companion;
    public static final /* synthetic */ EnumC1687690u1H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1687690u1H> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1687690u1H enumC1687690u1H = new EnumC1687690u1H("BLE", 0, 0);
        BLE = enumC1687690u1H;
        EnumC1687690u1H enumC1687690u1H2 = new EnumC1687690u1H("BLE_REVERSE", 1, 1);
        BLE_REVERSE = enumC1687690u1H2;
        EnumC1687690u1H[] enumC1687690u1HArr = {enumC1687690u1H, enumC1687690u1H2};
        LLILLJJLI = enumC1687690u1HArr;
        LLILLL = new C2254308sP(enumC1687690u1HArr);
        Companion = new C1687710u1J();
    }

    public static EnumC1687690u1H[] values() {
        return (EnumC1687690u1H[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1687690u1H valueOf(String str) {
        return (EnumC1687690u1H) C08FF.LIZ(EnumC1687690u1H.class, str);
    }

    public EnumC1687690u1H(String str, int i, int i2) {
        this.LL = i2;
    }
}
