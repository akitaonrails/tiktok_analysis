package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ekq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373620Ekq {
    public static final EnumC373620Ekq COMPARE;
    public static final EnumC373620Ekq DISCARD;
    public static final /* synthetic */ EnumC373620Ekq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC373620Ekq SAVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC373620Ekq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC373620Ekq enumC373620Ekq = new EnumC373620Ekq("COMPARE", 0, "compare");
        COMPARE = enumC373620Ekq;
        EnumC373620Ekq enumC373620Ekq2 = new EnumC373620Ekq("SAVE", 1, "save");
        SAVE = enumC373620Ekq2;
        EnumC373620Ekq enumC373620Ekq3 = new EnumC373620Ekq("DISCARD", 2, "discard");
        DISCARD = enumC373620Ekq3;
        EnumC373620Ekq[] enumC373620EkqArr = {enumC373620Ekq, enumC373620Ekq2, enumC373620Ekq3};
        LLILLJJLI = enumC373620EkqArr;
        LLILLL = new C2254308sP(enumC373620EkqArr);
    }

    public static EnumC373620Ekq[] values() {
        return (EnumC373620Ekq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC373620Ekq valueOf(String str) {
        return (EnumC373620Ekq) C08FF.LIZ(EnumC373620Ekq.class, str);
    }

    public EnumC373620Ekq(String str, int i, String str2) {
        this.LL = str2;
    }
}
