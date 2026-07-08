package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1120990fHF {
    public static final EnumC1120990fHF DAILY;
    public static final EnumC1120990fHF EVENT;
    public static final /* synthetic */ EnumC1120990fHF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1120990fHF MATCH_ITEM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1120990fHF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1120990fHF enumC1120990fHF = new EnumC1120990fHF("DAILY", 0, "daily");
        DAILY = enumC1120990fHF;
        EnumC1120990fHF enumC1120990fHF2 = new EnumC1120990fHF("EVENT", 1, "event");
        EVENT = enumC1120990fHF2;
        EnumC1120990fHF enumC1120990fHF3 = new EnumC1120990fHF("MATCH_ITEM", 2, "match_item");
        MATCH_ITEM = enumC1120990fHF3;
        EnumC1120990fHF[] enumC1120990fHFArr = {enumC1120990fHF, enumC1120990fHF2, enumC1120990fHF3};
        LLILLJJLI = enumC1120990fHFArr;
        LLILLL = new C2254308sP(enumC1120990fHFArr);
    }

    public static EnumC1120990fHF[] values() {
        return (EnumC1120990fHF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1120990fHF valueOf(String str) {
        return (EnumC1120990fHF) C08FF.LIZ(EnumC1120990fHF.class, str);
    }

    public EnumC1120990fHF(String str, int i, String str2) {
        this.LL = str2;
    }
}
