package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216680hla {
    public static final EnumC1216680hla CREATOR;
    public static final /* synthetic */ EnumC1216680hla[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216680hla SHOP;

    public static InterfaceC2044707zh<EnumC1216680hla> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216680hla enumC1216680hla = new EnumC1216680hla("CREATOR", 0);
        CREATOR = enumC1216680hla;
        EnumC1216680hla enumC1216680hla2 = new EnumC1216680hla("SHOP", 1);
        SHOP = enumC1216680hla2;
        EnumC1216680hla[] enumC1216680hlaArr = {enumC1216680hla, enumC1216680hla2};
        LL = enumC1216680hlaArr;
        LLILLJJLI = new C2254308sP(enumC1216680hlaArr);
    }

    public static EnumC1216680hla[] values() {
        return (EnumC1216680hla[]) LL.clone();
    }

    public static EnumC1216680hla valueOf(String str) {
        return (EnumC1216680hla) C08FF.LIZ(EnumC1216680hla.class, str);
    }

    public EnumC1216680hla(String str, int i) {
    }
}
