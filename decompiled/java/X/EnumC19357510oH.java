package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19357510oH {
    public static final EnumC19357510oH DID;
    public static final /* synthetic */ EnumC19357510oH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19357510oH LOCAL;
    public static final EnumC19357510oH NONE;
    public static final EnumC19357510oH UID;

    public static InterfaceC2044707zh<EnumC19357510oH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19357510oH enumC19357510oH = new EnumC19357510oH("UID", 0);
        UID = enumC19357510oH;
        EnumC19357510oH enumC19357510oH2 = new EnumC19357510oH("DID", 1);
        DID = enumC19357510oH2;
        EnumC19357510oH enumC19357510oH3 = new EnumC19357510oH("LOCAL", 2);
        LOCAL = enumC19357510oH3;
        EnumC19357510oH enumC19357510oH4 = new EnumC19357510oH("NONE", 3);
        NONE = enumC19357510oH4;
        EnumC19357510oH[] enumC19357510oHArr = {enumC19357510oH, enumC19357510oH2, enumC19357510oH3, enumC19357510oH4};
        LL = enumC19357510oHArr;
        LLILLJJLI = new C2254308sP(enumC19357510oHArr);
    }

    public static EnumC19357510oH[] values() {
        return (EnumC19357510oH[]) LL.clone();
    }

    public static EnumC19357510oH valueOf(String str) {
        return (EnumC19357510oH) C08FF.LIZ(EnumC19357510oH.class, str);
    }

    public EnumC19357510oH(String str, int i) {
    }
}
