package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987607qU {
    public static final /* synthetic */ EnumC1987607qU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1987607qU TEXT_TYPE_OTHER;
    public static final EnumC1987607qU TEXT_TYPE_TITLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1987607qU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1987607qU enumC1987607qU = new EnumC1987607qU("TEXT_TYPE_TITLE", 0, 1);
        TEXT_TYPE_TITLE = enumC1987607qU;
        EnumC1987607qU enumC1987607qU2 = new EnumC1987607qU("TEXT_TYPE_OTHER", 1, 2);
        TEXT_TYPE_OTHER = enumC1987607qU2;
        EnumC1987607qU[] enumC1987607qUArr = {enumC1987607qU, enumC1987607qU2};
        LLILLJJLI = enumC1987607qUArr;
        LLILLL = new C2254308sP(enumC1987607qUArr);
    }

    public static EnumC1987607qU[] values() {
        return (EnumC1987607qU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1987607qU valueOf(String str) {
        return (EnumC1987607qU) C08FF.LIZ(EnumC1987607qU.class, str);
    }

    public EnumC1987607qU(String str, int i, int i2) {
        this.LL = i2;
    }
}
