package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1614730s7b {
    public static final EnumC1614730s7b ACTIVE_SUBSCRIBER;
    public static final EnumC1614730s7b AUTO_RENEW_CANCELED;
    public static final C1614740s7c Companion;
    public static final EnumC1614730s7b EXPIRED;
    public static final /* synthetic */ EnumC1614730s7b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1614730s7b NEW_USER;

    public static InterfaceC2044707zh<EnumC1614730s7b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1614730s7b enumC1614730s7b = new EnumC1614730s7b("NEW_USER", 0);
        NEW_USER = enumC1614730s7b;
        EnumC1614730s7b enumC1614730s7b2 = new EnumC1614730s7b("ACTIVE_SUBSCRIBER", 1);
        ACTIVE_SUBSCRIBER = enumC1614730s7b2;
        EnumC1614730s7b enumC1614730s7b3 = new EnumC1614730s7b("AUTO_RENEW_CANCELED", 2);
        AUTO_RENEW_CANCELED = enumC1614730s7b3;
        EnumC1614730s7b enumC1614730s7b4 = new EnumC1614730s7b("EXPIRED", 3);
        EXPIRED = enumC1614730s7b4;
        EnumC1614730s7b[] enumC1614730s7bArr = {enumC1614730s7b, enumC1614730s7b2, enumC1614730s7b3, enumC1614730s7b4};
        LL = enumC1614730s7bArr;
        LLILLJJLI = new C2254308sP(enumC1614730s7bArr);
        Companion = new C1614740s7c();
    }

    public static EnumC1614730s7b[] values() {
        return (EnumC1614730s7b[]) LL.clone();
    }

    public static EnumC1614730s7b valueOf(String str) {
        return (EnumC1614730s7b) C08FF.LIZ(EnumC1614730s7b.class, str);
    }

    public EnumC1614730s7b(String str, int i) {
    }
}
