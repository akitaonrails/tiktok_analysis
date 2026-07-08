package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC648690PcR {
    public static final EnumC648690PcR CONSUME_FROM_BOTTOM_TO_TOP;
    public static final EnumC648690PcR CONSUME_FROM_TOP_TO_BOTTOM;
    public static final EnumC648690PcR HIT_TOP;
    public static final /* synthetic */ EnumC648690PcR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC648690PcR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC648690PcR enumC648690PcR = new EnumC648690PcR("HIT_TOP", 0);
        HIT_TOP = enumC648690PcR;
        EnumC648690PcR enumC648690PcR2 = new EnumC648690PcR("CONSUME_FROM_TOP_TO_BOTTOM", 1);
        CONSUME_FROM_TOP_TO_BOTTOM = enumC648690PcR2;
        EnumC648690PcR enumC648690PcR3 = new EnumC648690PcR("CONSUME_FROM_BOTTOM_TO_TOP", 2);
        CONSUME_FROM_BOTTOM_TO_TOP = enumC648690PcR3;
        EnumC648690PcR[] enumC648690PcRArr = {enumC648690PcR, enumC648690PcR2, enumC648690PcR3};
        LL = enumC648690PcRArr;
        LLILLJJLI = new C2254308sP(enumC648690PcRArr);
    }

    public static EnumC648690PcR[] values() {
        return (EnumC648690PcR[]) LL.clone();
    }

    public static EnumC648690PcR valueOf(String str) {
        return (EnumC648690PcR) C08FF.LIZ(EnumC648690PcR.class, str);
    }

    public EnumC648690PcR(String str, int i) {
    }
}
