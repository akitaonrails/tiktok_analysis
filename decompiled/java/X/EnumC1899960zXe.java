package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1899960zXe {
    public static final EnumC1899960zXe DISMISSED;
    public static final EnumC1899960zXe DUPLICATE_REQUEST;
    public static final EnumC1899960zXe INVALID_PARAMS;
    public static final /* synthetic */ EnumC1899960zXe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1899960zXe PAGE_MISMATCH_BEFORE_SHOW;
    public static final EnumC1899960zXe PAGE_MISMATCH_ON_CREATE;
    public static final EnumC1899960zXe RESOURCE_LOAD_FAILED;
    public static final EnumC1899960zXe ROUTE_NOT_MATCHED;
    public static final EnumC1899960zXe ROUTE_OPEN_FAILED;
    public static final EnumC1899960zXe SUCCESS;
    public static final EnumC1899960zXe TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1899960zXe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1899960zXe enumC1899960zXe = new EnumC1899960zXe("INVALID_PARAMS", 0, "invalid_params");
        INVALID_PARAMS = enumC1899960zXe;
        EnumC1899960zXe enumC1899960zXe2 = new EnumC1899960zXe("ROUTE_NOT_MATCHED", 1, "route_not_matched");
        ROUTE_NOT_MATCHED = enumC1899960zXe2;
        EnumC1899960zXe enumC1899960zXe3 = new EnumC1899960zXe("DUPLICATE_REQUEST", 2, "duplicate_request");
        DUPLICATE_REQUEST = enumC1899960zXe3;
        EnumC1899960zXe enumC1899960zXe4 = new EnumC1899960zXe("PAGE_MISMATCH_ON_CREATE", 3, "page_mismatch_on_create");
        PAGE_MISMATCH_ON_CREATE = enumC1899960zXe4;
        EnumC1899960zXe enumC1899960zXe5 = new EnumC1899960zXe("PAGE_MISMATCH_BEFORE_SHOW", 4, "page_mismatch_before_show");
        PAGE_MISMATCH_BEFORE_SHOW = enumC1899960zXe5;
        EnumC1899960zXe enumC1899960zXe6 = new EnumC1899960zXe("ROUTE_OPEN_FAILED", 5, "route_open_failed");
        ROUTE_OPEN_FAILED = enumC1899960zXe6;
        EnumC1899960zXe enumC1899960zXe7 = new EnumC1899960zXe("RESOURCE_LOAD_FAILED", 6, "resource_load_failed");
        RESOURCE_LOAD_FAILED = enumC1899960zXe7;
        EnumC1899960zXe enumC1899960zXe8 = new EnumC1899960zXe("TIMEOUT", 7, "timeout");
        TIMEOUT = enumC1899960zXe8;
        EnumC1899960zXe enumC1899960zXe9 = new EnumC1899960zXe("DISMISSED", 8, "dismissed");
        DISMISSED = enumC1899960zXe9;
        EnumC1899960zXe enumC1899960zXe10 = new EnumC1899960zXe("SUCCESS", 9, "success");
        SUCCESS = enumC1899960zXe10;
        EnumC1899960zXe[] enumC1899960zXeArr = {enumC1899960zXe, enumC1899960zXe2, enumC1899960zXe3, enumC1899960zXe4, enumC1899960zXe5, enumC1899960zXe6, enumC1899960zXe7, enumC1899960zXe8, enumC1899960zXe9, enumC1899960zXe10};
        LLILLJJLI = enumC1899960zXeArr;
        LLILLL = new C2254308sP(enumC1899960zXeArr);
    }

    public static EnumC1899960zXe[] values() {
        return (EnumC1899960zXe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1899960zXe valueOf(String str) {
        return (EnumC1899960zXe) C08FF.LIZ(EnumC1899960zXe.class, str);
    }

    public EnumC1899960zXe(String str, int i, String str2) {
        this.LL = str2;
    }
}
