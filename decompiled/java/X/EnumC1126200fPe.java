package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1126200fPe {
    public static final EnumC1126200fPe COIN_INSUFFICIENT;
    public static final /* synthetic */ EnumC1126200fPe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1126200fPe NO_INTERRUPT;
    public static final EnumC1126200fPe OTHERS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1126200fPe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1126200fPe enumC1126200fPe = new EnumC1126200fPe("COIN_INSUFFICIENT", 0, "coin_insufficient");
        COIN_INSUFFICIENT = enumC1126200fPe;
        EnumC1126200fPe enumC1126200fPe2 = new EnumC1126200fPe("NO_INTERRUPT", 1, "no_interrupt");
        NO_INTERRUPT = enumC1126200fPe2;
        EnumC1126200fPe enumC1126200fPe3 = new EnumC1126200fPe("OTHERS", 2, "others");
        OTHERS = enumC1126200fPe3;
        EnumC1126200fPe[] enumC1126200fPeArr = {enumC1126200fPe, enumC1126200fPe2, enumC1126200fPe3};
        LLILLJJLI = enumC1126200fPeArr;
        LLILLL = new C2254308sP(enumC1126200fPeArr);
    }

    public static EnumC1126200fPe[] values() {
        return (EnumC1126200fPe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1126200fPe valueOf(String str) {
        return (EnumC1126200fPe) C08FF.LIZ(EnumC1126200fPe.class, str);
    }

    public EnumC1126200fPe(String str, int i, String str2) {
        this.LL = str2;
    }
}
