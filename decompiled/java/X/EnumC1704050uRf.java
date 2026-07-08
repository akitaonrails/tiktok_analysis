package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1704050uRf {
    public static final /* synthetic */ EnumC1704050uRf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1704050uRf V1;
    public static final EnumC1704050uRf V2;

    public static InterfaceC2044707zh<EnumC1704050uRf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1704050uRf enumC1704050uRf = new EnumC1704050uRf("V1", 0);
        V1 = enumC1704050uRf;
        EnumC1704050uRf enumC1704050uRf2 = new EnumC1704050uRf("V2", 1);
        V2 = enumC1704050uRf2;
        EnumC1704050uRf[] enumC1704050uRfArr = {enumC1704050uRf, enumC1704050uRf2};
        LL = enumC1704050uRfArr;
        LLILLJJLI = new C2254308sP(enumC1704050uRfArr);
    }

    public static EnumC1704050uRf[] values() {
        return (EnumC1704050uRf[]) LL.clone();
    }

    public static EnumC1704050uRf valueOf(String str) {
        return (EnumC1704050uRf) C08FF.LIZ(EnumC1704050uRf.class, str);
    }

    public EnumC1704050uRf(String str, int i) {
    }
}
