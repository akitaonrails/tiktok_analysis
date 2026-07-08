package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1790230wgf {
    public static final EnumC1790230wgf ABANDONED;
    public static final EnumC1790230wgf ACTIVE;
    public static final EnumC1790230wgf CANCELLED;
    public static final EnumC1790230wgf CLOSED;
    public static final C1790220wge Companion;
    public static final EnumC1790230wgf EXPIRED;
    public static final EnumC1790230wgf FAILED;
    public static final EnumC1790230wgf INIT;
    public static final /* synthetic */ EnumC1790230wgf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1790230wgf PENDING;
    public static final EnumC1790230wgf PREORDER;
    public static final EnumC1790230wgf PROCESSING;
    public static final EnumC1790230wgf SUCCEED;
    public static final EnumC1790230wgf SUSPENDED;
    public static final EnumC1790230wgf UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1790230wgf> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0wge] */
    static {
        EnumC1790230wgf enumC1790230wgf = new EnumC1790230wgf("INIT", 0, "INIT");
        INIT = enumC1790230wgf;
        EnumC1790230wgf enumC1790230wgf2 = new EnumC1790230wgf("PENDING", 1, "PENDING");
        PENDING = enumC1790230wgf2;
        EnumC1790230wgf enumC1790230wgf3 = new EnumC1790230wgf("SUCCEED", 2, "SUCCEED");
        SUCCEED = enumC1790230wgf3;
        EnumC1790230wgf enumC1790230wgf4 = new EnumC1790230wgf("FAILED", 3, "FAILED");
        FAILED = enumC1790230wgf4;
        EnumC1790230wgf enumC1790230wgf5 = new EnumC1790230wgf("CLOSED", 4, "CLOSED");
        CLOSED = enumC1790230wgf5;
        EnumC1790230wgf enumC1790230wgf6 = new EnumC1790230wgf("EXPIRED", 5, "EXPIRED");
        EXPIRED = enumC1790230wgf6;
        EnumC1790230wgf enumC1790230wgf7 = new EnumC1790230wgf("PROCESSING", 6, "PROCESSING");
        PROCESSING = enumC1790230wgf7;
        EnumC1790230wgf enumC1790230wgf8 = new EnumC1790230wgf("ACTIVE", 7, "ACTIVE");
        ACTIVE = enumC1790230wgf8;
        EnumC1790230wgf enumC1790230wgf9 = new EnumC1790230wgf("ABANDONED", 8, "ABANDONED");
        ABANDONED = enumC1790230wgf9;
        EnumC1790230wgf enumC1790230wgf10 = new EnumC1790230wgf("CANCELLED", 9, "CANCELLED");
        CANCELLED = enumC1790230wgf10;
        EnumC1790230wgf enumC1790230wgf11 = new EnumC1790230wgf("PREORDER", 10, "PREORDER");
        PREORDER = enumC1790230wgf11;
        EnumC1790230wgf enumC1790230wgf12 = new EnumC1790230wgf("SUSPENDED", 11, "SUSPENDED");
        SUSPENDED = enumC1790230wgf12;
        EnumC1790230wgf enumC1790230wgf13 = new EnumC1790230wgf("UNKNOWN", 12, "UNKNOWN");
        UNKNOWN = enumC1790230wgf13;
        EnumC1790230wgf[] enumC1790230wgfArr = {enumC1790230wgf, enumC1790230wgf2, enumC1790230wgf3, enumC1790230wgf4, enumC1790230wgf5, enumC1790230wgf6, enumC1790230wgf7, enumC1790230wgf8, enumC1790230wgf9, enumC1790230wgf10, enumC1790230wgf11, enumC1790230wgf12, enumC1790230wgf13};
        LLILLJJLI = enumC1790230wgfArr;
        LLILLL = new C2254308sP(enumC1790230wgfArr);
        Companion = new Object() { // from class: X.0wge
        };
    }

    public static EnumC1790230wgf[] values() {
        return (EnumC1790230wgf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1790230wgf valueOf(String str) {
        return (EnumC1790230wgf) C08FF.LIZ(EnumC1790230wgf.class, str);
    }

    public EnumC1790230wgf(String str, int i, String str2) {
        this.LL = str2;
    }
}
