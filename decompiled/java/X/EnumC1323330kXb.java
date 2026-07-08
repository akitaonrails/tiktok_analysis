package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1323330kXb {
    public static final EnumC1323330kXb INIT;
    public static final /* synthetic */ EnumC1323330kXb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1323330kXb NETWORK;
    public static final EnumC1323330kXb RAW_SRC;
    public static final EnumC1323330kXb SRC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1323330kXb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1323330kXb enumC1323330kXb = new EnumC1323330kXb("INIT", 0, 0);
        INIT = enumC1323330kXb;
        EnumC1323330kXb enumC1323330kXb2 = new EnumC1323330kXb("RAW_SRC", 1, 1);
        RAW_SRC = enumC1323330kXb2;
        EnumC1323330kXb enumC1323330kXb3 = new EnumC1323330kXb("NETWORK", 2, 2);
        NETWORK = enumC1323330kXb3;
        EnumC1323330kXb enumC1323330kXb4 = new EnumC1323330kXb("SRC", 3, 3);
        SRC = enumC1323330kXb4;
        EnumC1323330kXb[] enumC1323330kXbArr = {enumC1323330kXb, enumC1323330kXb2, enumC1323330kXb3, enumC1323330kXb4};
        LLILLJJLI = enumC1323330kXbArr;
        LLILLL = new C2254308sP(enumC1323330kXbArr);
    }

    public static EnumC1323330kXb[] values() {
        return (EnumC1323330kXb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1323330kXb valueOf(String str) {
        return (EnumC1323330kXb) C08FF.LIZ(EnumC1323330kXb.class, str);
    }

    public EnumC1323330kXb(String str, int i, int i2) {
        this.LL = i2;
    }
}
