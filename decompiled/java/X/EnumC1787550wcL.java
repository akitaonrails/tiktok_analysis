package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1787550wcL {
    public static final /* synthetic */ EnumC1787550wcL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1787550wcL NORMAL;
    public static final EnumC1787550wcL RESTORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1787550wcL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1787550wcL enumC1787550wcL = new EnumC1787550wcL("NORMAL", 0, 2);
        NORMAL = enumC1787550wcL;
        EnumC1787550wcL enumC1787550wcL2 = new EnumC1787550wcL("RESTORE", 1, 3);
        RESTORE = enumC1787550wcL2;
        EnumC1787550wcL[] enumC1787550wcLArr = {enumC1787550wcL, enumC1787550wcL2};
        LLILLJJLI = enumC1787550wcLArr;
        LLILLL = new C2254308sP(enumC1787550wcLArr);
    }

    public static EnumC1787550wcL[] values() {
        return (EnumC1787550wcL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1787550wcL valueOf(String str) {
        return (EnumC1787550wcL) C08FF.LIZ(EnumC1787550wcL.class, str);
    }

    public EnumC1787550wcL(String str, int i, int i2) {
        this.LL = i2;
    }
}
