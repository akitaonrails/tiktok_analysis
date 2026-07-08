package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.045l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10415045l {
    public static final /* synthetic */ EnumC10415045l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC10415045l ONE_TIME_PURCHASE;
    public static final EnumC10415045l SUBSCRIBE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC10415045l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC10415045l enumC10415045l = new EnumC10415045l("ONE_TIME_PURCHASE", 0, 0);
        ONE_TIME_PURCHASE = enumC10415045l;
        EnumC10415045l enumC10415045l2 = new EnumC10415045l("SUBSCRIBE", 1, 1);
        SUBSCRIBE = enumC10415045l2;
        EnumC10415045l[] enumC10415045lArr = {enumC10415045l, enumC10415045l2};
        LLILLJJLI = enumC10415045lArr;
        LLILLL = new C2254308sP(enumC10415045lArr);
    }

    public static EnumC10415045l[] values() {
        return (EnumC10415045l[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC10415045l valueOf(String str) {
        return (EnumC10415045l) C08FF.LIZ(EnumC10415045l.class, str);
    }

    public EnumC10415045l(String str, int i, int i2) {
        this.LL = i2;
    }
}
