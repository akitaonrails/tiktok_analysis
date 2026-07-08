package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1614900s7s {
    public static final EnumC1614900s7s CANCEL_AUTO_RENEW;
    public static final EnumC1614900s7s CHANGE_PLAN;
    public static final EnumC1614900s7s CONTINUE;
    public static final /* synthetic */ EnumC1614900s7s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1614900s7s REACTIVATE;

    public static InterfaceC2044707zh<EnumC1614900s7s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1614900s7s enumC1614900s7s = new EnumC1614900s7s("CONTINUE", 0);
        CONTINUE = enumC1614900s7s;
        EnumC1614900s7s enumC1614900s7s2 = new EnumC1614900s7s("CHANGE_PLAN", 1);
        CHANGE_PLAN = enumC1614900s7s2;
        EnumC1614900s7s enumC1614900s7s3 = new EnumC1614900s7s("CANCEL_AUTO_RENEW", 2);
        CANCEL_AUTO_RENEW = enumC1614900s7s3;
        EnumC1614900s7s enumC1614900s7s4 = new EnumC1614900s7s("REACTIVATE", 3);
        REACTIVATE = enumC1614900s7s4;
        EnumC1614900s7s[] enumC1614900s7sArr = {enumC1614900s7s, enumC1614900s7s2, enumC1614900s7s3, enumC1614900s7s4};
        LL = enumC1614900s7sArr;
        LLILLJJLI = new C2254308sP(enumC1614900s7sArr);
    }

    public static EnumC1614900s7s[] values() {
        return (EnumC1614900s7s[]) LL.clone();
    }

    public static EnumC1614900s7s valueOf(String str) {
        return (EnumC1614900s7s) C08FF.LIZ(EnumC1614900s7s.class, str);
    }

    public EnumC1614900s7s(String str, int i) {
    }
}
