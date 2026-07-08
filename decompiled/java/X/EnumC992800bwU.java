package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992800bwU {
    public static final /* synthetic */ EnumC992800bwU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992800bwU TYPE_NONE_DATA_EXIT;
    public static final EnumC992800bwU TYPE_OVER_WIDTH_EXIT;
    public static final EnumC992800bwU TYPE_TODAY_EXIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992800bwU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992800bwU enumC992800bwU = new EnumC992800bwU("TYPE_NONE_DATA_EXIT", 0, 301);
        TYPE_NONE_DATA_EXIT = enumC992800bwU;
        EnumC992800bwU enumC992800bwU2 = new EnumC992800bwU("TYPE_TODAY_EXIT", 1, 302);
        TYPE_TODAY_EXIT = enumC992800bwU2;
        EnumC992800bwU enumC992800bwU3 = new EnumC992800bwU("TYPE_OVER_WIDTH_EXIT", 2, 303);
        TYPE_OVER_WIDTH_EXIT = enumC992800bwU3;
        EnumC992800bwU[] enumC992800bwUArr = {enumC992800bwU, enumC992800bwU2, enumC992800bwU3};
        LLILLJJLI = enumC992800bwUArr;
        LLILLL = new C2254308sP(enumC992800bwUArr);
    }

    public static EnumC992800bwU[] values() {
        return (EnumC992800bwU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992800bwU valueOf(String str) {
        return (EnumC992800bwU) C08FF.LIZ(EnumC992800bwU.class, str);
    }

    public EnumC992800bwU(String str, int i, int i2) {
        this.LL = i2;
    }
}
