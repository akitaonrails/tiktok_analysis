package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782300wTs {
    public static final EnumC1782300wTs AUTOCUT;
    public static final EnumC1782300wTs HIGHLIGHT;
    public static final /* synthetic */ EnumC1782300wTs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782300wTs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782300wTs enumC1782300wTs = new EnumC1782300wTs("HIGHLIGHT", 0, 0);
        HIGHLIGHT = enumC1782300wTs;
        EnumC1782300wTs enumC1782300wTs2 = new EnumC1782300wTs("AUTOCUT", 1, 1);
        AUTOCUT = enumC1782300wTs2;
        EnumC1782300wTs[] enumC1782300wTsArr = {enumC1782300wTs, enumC1782300wTs2};
        LLILLJJLI = enumC1782300wTsArr;
        LLILLL = new C2254308sP(enumC1782300wTsArr);
    }

    public static EnumC1782300wTs[] values() {
        return (EnumC1782300wTs[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782300wTs valueOf(String str) {
        return (EnumC1782300wTs) C08FF.LIZ(EnumC1782300wTs.class, str);
    }

    public EnumC1782300wTs(String str, int i, int i2) {
        this.LL = i2;
    }
}
