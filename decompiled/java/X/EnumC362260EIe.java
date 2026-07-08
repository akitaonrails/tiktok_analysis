package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC362260EIe {
    public static final /* synthetic */ EnumC362260EIe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC362260EIe MAX;
    public static final EnumC362260EIe MIN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC362260EIe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC362260EIe enumC362260EIe = new EnumC362260EIe("MIN", 0, 0);
        MIN = enumC362260EIe;
        EnumC362260EIe enumC362260EIe2 = new EnumC362260EIe("MAX", 1, 1);
        MAX = enumC362260EIe2;
        EnumC362260EIe[] enumC362260EIeArr = {enumC362260EIe, enumC362260EIe2};
        LLILLJJLI = enumC362260EIeArr;
        LLILLL = new C2254308sP(enumC362260EIeArr);
    }

    public static EnumC362260EIe[] values() {
        return (EnumC362260EIe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC362260EIe valueOf(String str) {
        return (EnumC362260EIe) C08FF.LIZ(EnumC362260EIe.class, str);
    }

    public EnumC362260EIe(String str, int i, int i2) {
        this.LL = i2;
    }
}
