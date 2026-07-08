package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0icd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249570icd {
    public static final EnumC1249570icd FIRST_GROUP;
    public static final EnumC1249570icd GROUP;
    public static final EnumC1249570icd ITEM;
    public static final /* synthetic */ EnumC1249570icd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1249570icd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1249570icd enumC1249570icd = new EnumC1249570icd("ITEM", 0);
        ITEM = enumC1249570icd;
        EnumC1249570icd enumC1249570icd2 = new EnumC1249570icd("GROUP", 1);
        GROUP = enumC1249570icd2;
        EnumC1249570icd enumC1249570icd3 = new EnumC1249570icd("FIRST_GROUP", 2);
        FIRST_GROUP = enumC1249570icd3;
        EnumC1249570icd[] enumC1249570icdArr = {enumC1249570icd, enumC1249570icd2, enumC1249570icd3};
        LL = enumC1249570icdArr;
        LLILLJJLI = new C2254308sP(enumC1249570icdArr);
    }

    public static EnumC1249570icd[] values() {
        return (EnumC1249570icd[]) LL.clone();
    }

    public static EnumC1249570icd valueOf(String str) {
        return (EnumC1249570icd) C08FF.LIZ(EnumC1249570icd.class, str);
    }

    public EnumC1249570icd(String str, int i) {
    }
}
