package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1088820eRM {
    public static final EnumC1088820eRM HIGH;
    public static final /* synthetic */ EnumC1088820eRM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1088820eRM LOW;

    public static InterfaceC2044707zh<EnumC1088820eRM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1088820eRM enumC1088820eRM = new EnumC1088820eRM("LOW", 0);
        LOW = enumC1088820eRM;
        EnumC1088820eRM enumC1088820eRM2 = new EnumC1088820eRM("HIGH", 1);
        HIGH = enumC1088820eRM2;
        EnumC1088820eRM[] enumC1088820eRMArr = {enumC1088820eRM, enumC1088820eRM2};
        LL = enumC1088820eRMArr;
        LLILLJJLI = new C2254308sP(enumC1088820eRMArr);
    }

    public static EnumC1088820eRM[] values() {
        return (EnumC1088820eRM[]) LL.clone();
    }

    public static EnumC1088820eRM valueOf(String str) {
        return (EnumC1088820eRM) C08FF.LIZ(EnumC1088820eRM.class, str);
    }

    public EnumC1088820eRM(String str, int i) {
    }
}
