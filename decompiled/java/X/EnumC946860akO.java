package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0akO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC946860akO {
    public static final EnumC946860akO APPLY;
    public static final EnumC946860akO CANCEL;
    public static final /* synthetic */ EnumC946860akO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC946860akO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC946860akO enumC946860akO = new EnumC946860akO("APPLY", 0, "apply");
        APPLY = enumC946860akO;
        EnumC946860akO enumC946860akO2 = new EnumC946860akO("CANCEL", 1, "cancel");
        CANCEL = enumC946860akO2;
        EnumC946860akO[] enumC946860akOArr = {enumC946860akO, enumC946860akO2};
        LLILLJJLI = enumC946860akOArr;
        LLILLL = new C2254308sP(enumC946860akOArr);
    }

    public static EnumC946860akO[] values() {
        return (EnumC946860akO[]) LLILLJJLI.clone();
    }

    public final String getBtnName() {
        return this.LL;
    }

    public static EnumC946860akO valueOf(String str) {
        return (EnumC946860akO) C08FF.LIZ(EnumC946860akO.class, str);
    }

    public EnumC946860akO(String str, int i, String str2) {
        this.LL = str2;
    }
}
