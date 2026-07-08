package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1187770h0x {
    public static final EnumC1187770h0x APPEAR;
    public static final EnumC1187770h0x BEFORE_APPEAR;
    public static final EnumC1187770h0x DESTROY;
    public static final EnumC1187770h0x DISAPPEAR;
    public static final /* synthetic */ EnumC1187770h0x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1187770h0x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1187770h0x enumC1187770h0x = new EnumC1187770h0x("BEFORE_APPEAR", 0);
        BEFORE_APPEAR = enumC1187770h0x;
        EnumC1187770h0x enumC1187770h0x2 = new EnumC1187770h0x("APPEAR", 1);
        APPEAR = enumC1187770h0x2;
        EnumC1187770h0x enumC1187770h0x3 = new EnumC1187770h0x("DISAPPEAR", 2);
        DISAPPEAR = enumC1187770h0x3;
        EnumC1187770h0x enumC1187770h0x4 = new EnumC1187770h0x("DESTROY", 3);
        DESTROY = enumC1187770h0x4;
        EnumC1187770h0x[] enumC1187770h0xArr = {enumC1187770h0x, enumC1187770h0x2, enumC1187770h0x3, enumC1187770h0x4};
        LL = enumC1187770h0xArr;
        LLILLJJLI = new C2254308sP(enumC1187770h0xArr);
    }

    public static EnumC1187770h0x[] values() {
        return (EnumC1187770h0x[]) LL.clone();
    }

    public static EnumC1187770h0x valueOf(String str) {
        return (EnumC1187770h0x) C08FF.LIZ(EnumC1187770h0x.class, str);
    }

    public EnumC1187770h0x(String str, int i) {
    }
}
