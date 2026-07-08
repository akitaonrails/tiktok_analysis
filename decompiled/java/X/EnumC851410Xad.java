package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851410Xad {
    public static final EnumC851410Xad FAILURE;
    public static final /* synthetic */ EnumC851410Xad[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC851410Xad SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC851410Xad> getEntries() {
        return LLILLL;
    }

    static {
        EnumC851410Xad enumC851410Xad = new EnumC851410Xad("FAILURE", 0, 0);
        FAILURE = enumC851410Xad;
        EnumC851410Xad enumC851410Xad2 = new EnumC851410Xad("SUCCESS", 1, 1);
        SUCCESS = enumC851410Xad2;
        EnumC851410Xad[] enumC851410XadArr = {enumC851410Xad, enumC851410Xad2};
        LLILLJJLI = enumC851410XadArr;
        LLILLL = new C2254308sP(enumC851410XadArr);
    }

    public static EnumC851410Xad[] values() {
        return (EnumC851410Xad[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC851410Xad valueOf(String str) {
        return (EnumC851410Xad) C08FF.LIZ(EnumC851410Xad.class, str);
    }

    public EnumC851410Xad(String str, int i, int i2) {
        this.LL = i2;
    }
}
