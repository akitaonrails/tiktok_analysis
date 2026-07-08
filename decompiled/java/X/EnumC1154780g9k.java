package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154780g9k {
    public static final EnumC1154780g9k BATCH;
    public static final EnumC1154780g9k INDIVIDUAL;
    public static final /* synthetic */ EnumC1154780g9k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154780g9k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154780g9k enumC1154780g9k = new EnumC1154780g9k("BATCH", 0);
        BATCH = enumC1154780g9k;
        EnumC1154780g9k enumC1154780g9k2 = new EnumC1154780g9k("INDIVIDUAL", 1);
        INDIVIDUAL = enumC1154780g9k2;
        EnumC1154780g9k[] enumC1154780g9kArr = {enumC1154780g9k, enumC1154780g9k2};
        LL = enumC1154780g9kArr;
        LLILLJJLI = new C2254308sP(enumC1154780g9kArr);
    }

    public static EnumC1154780g9k[] values() {
        return (EnumC1154780g9k[]) LL.clone();
    }

    public static EnumC1154780g9k valueOf(String str) {
        return (EnumC1154780g9k) C08FF.LIZ(EnumC1154780g9k.class, str);
    }

    public EnumC1154780g9k(String str, int i) {
    }
}
