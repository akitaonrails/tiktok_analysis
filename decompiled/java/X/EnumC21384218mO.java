package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18mO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21384218mO {
    public static final /* synthetic */ EnumC21384218mO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21384218mO SELECT;
    public static final EnumC21384218mO SWITCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21384218mO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21384218mO enumC21384218mO = new EnumC21384218mO("SWITCH", 0, "switch");
        SWITCH = enumC21384218mO;
        EnumC21384218mO enumC21384218mO2 = new EnumC21384218mO("SELECT", 1, "select");
        SELECT = enumC21384218mO2;
        EnumC21384218mO[] enumC21384218mOArr = {enumC21384218mO, enumC21384218mO2};
        LLILLJJLI = enumC21384218mOArr;
        LLILLL = new C2254308sP(enumC21384218mOArr);
    }

    public static EnumC21384218mO[] values() {
        return (EnumC21384218mO[]) LLILLJJLI.clone();
    }

    public final String getLoggingName() {
        return this.LL;
    }

    public static EnumC21384218mO valueOf(String str) {
        return (EnumC21384218mO) C08FF.LIZ(EnumC21384218mO.class, str);
    }

    public EnumC21384218mO(String str, int i, String str2) {
        this.LL = str2;
    }
}
