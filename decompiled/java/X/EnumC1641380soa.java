package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641380soa {
    public static final EnumC1641380soa FAILED;
    public static final /* synthetic */ EnumC1641380soa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641380soa PENDING;
    public static final EnumC1641380soa START;
    public static final EnumC1641380soa SUCCESS;

    public static InterfaceC2044707zh<EnumC1641380soa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641380soa enumC1641380soa = new EnumC1641380soa("PENDING", 0);
        PENDING = enumC1641380soa;
        EnumC1641380soa enumC1641380soa2 = new EnumC1641380soa("START", 1);
        START = enumC1641380soa2;
        EnumC1641380soa enumC1641380soa3 = new EnumC1641380soa("SUCCESS", 2);
        SUCCESS = enumC1641380soa3;
        EnumC1641380soa enumC1641380soa4 = new EnumC1641380soa("FAILED", 3);
        FAILED = enumC1641380soa4;
        EnumC1641380soa[] enumC1641380soaArr = {enumC1641380soa, enumC1641380soa2, enumC1641380soa3, enumC1641380soa4};
        LL = enumC1641380soaArr;
        LLILLJJLI = new C2254308sP(enumC1641380soaArr);
    }

    public static EnumC1641380soa[] values() {
        return (EnumC1641380soa[]) LL.clone();
    }

    public static EnumC1641380soa valueOf(String str) {
        return (EnumC1641380soa) C08FF.LIZ(EnumC1641380soa.class, str);
    }

    public EnumC1641380soa(String str, int i) {
    }
}
