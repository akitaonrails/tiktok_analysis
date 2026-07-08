package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240670iOH {
    public static final /* synthetic */ EnumC1240670iOH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1240670iOH STRANGER;
    public static final EnumC1240670iOH TYPE_GROUP;
    public static final EnumC1240670iOH TYPE_PRIVATE;
    public static final EnumC1240670iOH TYPE_TCM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1240670iOH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240670iOH enumC1240670iOH = new EnumC1240670iOH("TYPE_PRIVATE", 0, "private");
        TYPE_PRIVATE = enumC1240670iOH;
        EnumC1240670iOH enumC1240670iOH2 = new EnumC1240670iOH("TYPE_GROUP", 1, "group");
        TYPE_GROUP = enumC1240670iOH2;
        EnumC1240670iOH enumC1240670iOH3 = new EnumC1240670iOH("TYPE_TCM", 2, "tcm");
        TYPE_TCM = enumC1240670iOH3;
        EnumC1240670iOH enumC1240670iOH4 = new EnumC1240670iOH("STRANGER", 3, "stranger");
        STRANGER = enumC1240670iOH4;
        EnumC1240670iOH[] enumC1240670iOHArr = {enumC1240670iOH, enumC1240670iOH2, enumC1240670iOH3, enumC1240670iOH4};
        LLILLJJLI = enumC1240670iOHArr;
        LLILLL = new C2254308sP(enumC1240670iOHArr);
    }

    public static EnumC1240670iOH[] values() {
        return (EnumC1240670iOH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1240670iOH valueOf(String str) {
        return (EnumC1240670iOH) C08FF.LIZ(EnumC1240670iOH.class, str);
    }

    public EnumC1240670iOH(String str, int i, String str2) {
        this.LL = str2;
    }
}
