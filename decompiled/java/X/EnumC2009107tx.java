package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009107tx {
    public static final EnumC2009107tx CLICK_DISAPPEAR;
    public static final EnumC2009107tx CLICK_NOT_DISAPPEAR;
    public static final /* synthetic */ EnumC2009107tx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2009107tx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2009107tx enumC2009107tx = new EnumC2009107tx("CLICK_DISAPPEAR", 0);
        CLICK_DISAPPEAR = enumC2009107tx;
        EnumC2009107tx enumC2009107tx2 = new EnumC2009107tx("CLICK_NOT_DISAPPEAR", 1);
        CLICK_NOT_DISAPPEAR = enumC2009107tx2;
        EnumC2009107tx[] enumC2009107txArr = {enumC2009107tx, enumC2009107tx2};
        LL = enumC2009107txArr;
        LLILLJJLI = new C2254308sP(enumC2009107txArr);
    }

    public static EnumC2009107tx[] values() {
        return (EnumC2009107tx[]) LL.clone();
    }

    public static EnumC2009107tx valueOf(String str) {
        return (EnumC2009107tx) C08FF.LIZ(EnumC2009107tx.class, str);
    }

    public EnumC2009107tx(String str, int i) {
    }
}
