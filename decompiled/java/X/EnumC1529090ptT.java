package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ptT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1529090ptT {
    public static final /* synthetic */ EnumC1529090ptT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1529090ptT OID;
    public static final EnumC1529090ptT SCHEMA;
    public static final EnumC1529090ptT URL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1529090ptT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1529090ptT enumC1529090ptT = new EnumC1529090ptT("URL", 0, 0);
        URL = enumC1529090ptT;
        EnumC1529090ptT enumC1529090ptT2 = new EnumC1529090ptT("SCHEMA", 1, 1);
        SCHEMA = enumC1529090ptT2;
        EnumC1529090ptT enumC1529090ptT3 = new EnumC1529090ptT("OID", 2, 2);
        OID = enumC1529090ptT3;
        EnumC1529090ptT[] enumC1529090ptTArr = {enumC1529090ptT, enumC1529090ptT2, enumC1529090ptT3};
        LLILLJJLI = enumC1529090ptTArr;
        LLILLL = new C2254308sP(enumC1529090ptTArr);
    }

    public static EnumC1529090ptT[] values() {
        return (EnumC1529090ptT[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1529090ptT valueOf(String str) {
        return (EnumC1529090ptT) C08FF.LIZ(EnumC1529090ptT.class, str);
    }

    public EnumC1529090ptT(String str, int i, int i2) {
        this.LL = i2;
    }
}
