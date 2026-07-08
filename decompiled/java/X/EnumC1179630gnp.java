package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1179630gnp {
    public static final /* synthetic */ EnumC1179630gnp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1179630gnp STATUS_MAP_FAIL;
    public static final EnumC1179630gnp STATUS_MAP_READY;
    public static final EnumC1179630gnp STATUS_NONE;
    public static final EnumC1179630gnp STATUS_PAGE_INIT;
    public static final EnumC1179630gnp STATUS_POI_DETAIL_FAIL;
    public static final EnumC1179630gnp STATUS_POI_DETAIL_READY;

    public static InterfaceC2044707zh<EnumC1179630gnp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1179630gnp enumC1179630gnp = new EnumC1179630gnp("STATUS_NONE", 0);
        STATUS_NONE = enumC1179630gnp;
        EnumC1179630gnp enumC1179630gnp2 = new EnumC1179630gnp("STATUS_PAGE_INIT", 1);
        STATUS_PAGE_INIT = enumC1179630gnp2;
        EnumC1179630gnp enumC1179630gnp3 = new EnumC1179630gnp("STATUS_POI_DETAIL_READY", 2);
        STATUS_POI_DETAIL_READY = enumC1179630gnp3;
        EnumC1179630gnp enumC1179630gnp4 = new EnumC1179630gnp("STATUS_POI_DETAIL_FAIL", 3);
        STATUS_POI_DETAIL_FAIL = enumC1179630gnp4;
        EnumC1179630gnp enumC1179630gnp5 = new EnumC1179630gnp("STATUS_MAP_READY", 4);
        STATUS_MAP_READY = enumC1179630gnp5;
        EnumC1179630gnp enumC1179630gnp6 = new EnumC1179630gnp("STATUS_MAP_FAIL", 5);
        STATUS_MAP_FAIL = enumC1179630gnp6;
        EnumC1179630gnp[] enumC1179630gnpArr = {enumC1179630gnp, enumC1179630gnp2, enumC1179630gnp3, enumC1179630gnp4, enumC1179630gnp5, enumC1179630gnp6};
        LL = enumC1179630gnpArr;
        LLILLJJLI = new C2254308sP(enumC1179630gnpArr);
    }

    public static EnumC1179630gnp[] values() {
        return (EnumC1179630gnp[]) LL.clone();
    }

    public static EnumC1179630gnp valueOf(String str) {
        return (EnumC1179630gnp) C08FF.LIZ(EnumC1179630gnp.class, str);
    }

    public EnumC1179630gnp(String str, int i) {
    }
}
