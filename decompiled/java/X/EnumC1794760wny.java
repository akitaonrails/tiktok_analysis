package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1794760wny {
    public static final EnumC1794760wny CASHIER_DESTROY;
    public static final EnumC1794760wny CASHIER_RESUME;
    public static final EnumC1794760wny LAUNCH_CASHIER_API;
    public static final /* synthetic */ EnumC1794760wny[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1794760wny NONE;
    public static final EnumC1794760wny PURCHASE_COMPLETED;
    public static final EnumC1794760wny START_CASHIER;

    public static InterfaceC2044707zh<EnumC1794760wny> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1794760wny enumC1794760wny = new EnumC1794760wny("NONE", 0);
        NONE = enumC1794760wny;
        EnumC1794760wny enumC1794760wny2 = new EnumC1794760wny("START_CASHIER", 1);
        START_CASHIER = enumC1794760wny2;
        EnumC1794760wny enumC1794760wny3 = new EnumC1794760wny("LAUNCH_CASHIER_API", 2);
        LAUNCH_CASHIER_API = enumC1794760wny3;
        EnumC1794760wny enumC1794760wny4 = new EnumC1794760wny("CASHIER_RESUME", 3);
        CASHIER_RESUME = enumC1794760wny4;
        EnumC1794760wny enumC1794760wny5 = new EnumC1794760wny("CASHIER_DESTROY", 4);
        CASHIER_DESTROY = enumC1794760wny5;
        EnumC1794760wny enumC1794760wny6 = new EnumC1794760wny("PURCHASE_COMPLETED", 5);
        PURCHASE_COMPLETED = enumC1794760wny6;
        EnumC1794760wny[] enumC1794760wnyArr = {enumC1794760wny, enumC1794760wny2, enumC1794760wny3, enumC1794760wny4, enumC1794760wny5, enumC1794760wny6};
        LL = enumC1794760wnyArr;
        LLILLJJLI = new C2254308sP(enumC1794760wnyArr);
    }

    public static EnumC1794760wny[] values() {
        return (EnumC1794760wny[]) LL.clone();
    }

    public static EnumC1794760wny valueOf(String str) {
        return (EnumC1794760wny) C08FF.LIZ(EnumC1794760wny.class, str);
    }

    public EnumC1794760wny(String str, int i) {
    }
}
