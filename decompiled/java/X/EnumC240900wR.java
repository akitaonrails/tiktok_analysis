package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC240900wR {
    public static final EnumC240900wR CLICK;
    public static final /* synthetic */ EnumC240900wR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC240900wR LONG_PRESS;

    public static InterfaceC2044707zh<EnumC240900wR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC240900wR enumC240900wR = new EnumC240900wR("CLICK", 0);
        CLICK = enumC240900wR;
        EnumC240900wR enumC240900wR2 = new EnumC240900wR("LONG_PRESS", 1);
        LONG_PRESS = enumC240900wR2;
        EnumC240900wR[] enumC240900wRArr = {enumC240900wR, enumC240900wR2};
        LL = enumC240900wRArr;
        LLILLJJLI = new C2254308sP(enumC240900wRArr);
    }

    public static EnumC240900wR[] values() {
        return (EnumC240900wR[]) LL.clone();
    }

    public static EnumC240900wR valueOf(String str) {
        return (EnumC240900wR) C08FF.LIZ(EnumC240900wR.class, str);
    }

    public EnumC240900wR(String str, int i) {
    }
}
