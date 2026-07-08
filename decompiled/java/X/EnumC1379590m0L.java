package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1379590m0L {
    public static final EnumC1379590m0L ALT_TEXT;
    public static final EnumC1379590m0L COVER;
    public static final C1379480m0A Companion;
    public static final EnumC1379590m0L IMAGE;
    public static final /* synthetic */ EnumC1379590m0L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1379590m0L NEWS;
    public static final EnumC1379590m0L POI;
    public static final EnumC1379590m0L TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1379590m0L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1379590m0L enumC1379590m0L = new EnumC1379590m0L("TEXT", 0, 0);
        TEXT = enumC1379590m0L;
        EnumC1379590m0L enumC1379590m0L2 = new EnumC1379590m0L("COVER", 1, 1);
        COVER = enumC1379590m0L2;
        EnumC1379590m0L enumC1379590m0L3 = new EnumC1379590m0L("POI", 2, 2);
        POI = enumC1379590m0L3;
        EnumC1379590m0L enumC1379590m0L4 = new EnumC1379590m0L("ALT_TEXT", 3, 14);
        ALT_TEXT = enumC1379590m0L4;
        EnumC1379590m0L enumC1379590m0L5 = new EnumC1379590m0L("NEWS", 4, 16);
        NEWS = enumC1379590m0L5;
        EnumC1379590m0L enumC1379590m0L6 = new EnumC1379590m0L("IMAGE", 5, 17);
        IMAGE = enumC1379590m0L6;
        EnumC1379590m0L[] enumC1379590m0LArr = {enumC1379590m0L, enumC1379590m0L2, enumC1379590m0L3, enumC1379590m0L4, enumC1379590m0L5, enumC1379590m0L6};
        LLILLJJLI = enumC1379590m0LArr;
        LLILLL = new C2254308sP(enumC1379590m0LArr);
        Companion = new C1379480m0A();
    }

    public static EnumC1379590m0L[] values() {
        return (EnumC1379590m0L[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1379590m0L valueOf(String str) {
        return (EnumC1379590m0L) C08FF.LIZ(EnumC1379590m0L.class, str);
    }

    public EnumC1379590m0L(String str, int i, int i2) {
        this.LL = i2;
    }
}
