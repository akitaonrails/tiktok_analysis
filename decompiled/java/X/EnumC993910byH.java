package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993910byH {
    public static final EnumC993910byH ALL;
    public static final EnumC993910byH BTM;
    public static final EnumC993910byH CUSTOM;
    public static final EnumC993910byH GECKONG;
    public static final /* synthetic */ EnumC993910byH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993910byH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993910byH enumC993910byH = new EnumC993910byH("ALL", 0);
        ALL = enumC993910byH;
        EnumC993910byH enumC993910byH2 = new EnumC993910byH("BTM", 1);
        BTM = enumC993910byH2;
        EnumC993910byH enumC993910byH3 = new EnumC993910byH("GECKONG", 2);
        GECKONG = enumC993910byH3;
        EnumC993910byH enumC993910byH4 = new EnumC993910byH("CUSTOM", 3);
        CUSTOM = enumC993910byH4;
        EnumC993910byH[] enumC993910byHArr = {enumC993910byH, enumC993910byH2, enumC993910byH3, enumC993910byH4};
        LL = enumC993910byHArr;
        LLILLJJLI = new C2254308sP(enumC993910byHArr);
    }

    public static EnumC993910byH[] values() {
        return (EnumC993910byH[]) LL.clone();
    }

    public static EnumC993910byH valueOf(String str) {
        return (EnumC993910byH) C08FF.LIZ(EnumC993910byH.class, str);
    }

    public EnumC993910byH(String str, int i) {
    }
}
