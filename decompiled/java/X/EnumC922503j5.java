package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03j5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC922503j5 {
    public static final EnumC922503j5 CHECKOUT_PAY_LATER;
    public static final EnumC922503j5 CHECKOUT_WITH_VAULT;
    public static final /* synthetic */ EnumC922503j5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC922503j5 VAULTED;

    public static InterfaceC2044707zh<EnumC922503j5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC922503j5 enumC922503j5 = new EnumC922503j5("CHECKOUT_WITH_VAULT", 0);
        CHECKOUT_WITH_VAULT = enumC922503j5;
        EnumC922503j5 enumC922503j52 = new EnumC922503j5("VAULTED", 1);
        VAULTED = enumC922503j52;
        EnumC922503j5 enumC922503j53 = new EnumC922503j5("CHECKOUT_PAY_LATER", 2);
        CHECKOUT_PAY_LATER = enumC922503j53;
        EnumC922503j5[] enumC922503j5Arr = {enumC922503j5, enumC922503j52, enumC922503j53};
        LL = enumC922503j5Arr;
        LLILLJJLI = new C2254308sP(enumC922503j5Arr);
    }

    public static EnumC922503j5[] values() {
        return (EnumC922503j5[]) LL.clone();
    }

    public static EnumC922503j5 valueOf(String str) {
        return (EnumC922503j5) C08FF.LIZ(EnumC922503j5.class, str);
    }

    public EnumC922503j5(String str, int i) {
    }
}
