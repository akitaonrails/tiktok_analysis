package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19357910oL {
    public static final EnumC19357910oL DOWNLOAD_TYPE;
    public static final /* synthetic */ EnumC19357910oL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19357910oL WATER_TYPE;
    public final int LL = 50;

    public static InterfaceC2044707zh<EnumC19357910oL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19357910oL enumC19357910oL = new EnumC19357910oL("DOWNLOAD_TYPE", 0);
        DOWNLOAD_TYPE = enumC19357910oL;
        EnumC19357910oL enumC19357910oL2 = new EnumC19357910oL("WATER_TYPE", 1);
        WATER_TYPE = enumC19357910oL2;
        EnumC19357910oL[] enumC19357910oLArr = {enumC19357910oL, enumC19357910oL2};
        LLILLJJLI = enumC19357910oLArr;
        LLILLL = new C2254308sP(enumC19357910oLArr);
    }

    public static EnumC19357910oL[] values() {
        return (EnumC19357910oL[]) LLILLJJLI.clone();
    }

    public final int getWeight() {
        return this.LL;
    }

    public static EnumC19357910oL valueOf(String str) {
        return (EnumC19357910oL) C08FF.LIZ(EnumC19357910oL.class, str);
    }

    public EnumC19357910oL(String str, int i) {
    }
}
