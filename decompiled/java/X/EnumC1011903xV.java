package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1011903xV {
    public static final /* synthetic */ EnumC1011903xV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1011903xV LOG_VIEW;
    public static final EnumC1011903xV LOG_WHEN_SHOW;
    public static final EnumC1011903xV SEND_LOG;

    public static InterfaceC2044707zh<EnumC1011903xV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1011903xV enumC1011903xV = new EnumC1011903xV("LOG_WHEN_SHOW", 0);
        LOG_WHEN_SHOW = enumC1011903xV;
        EnumC1011903xV enumC1011903xV2 = new EnumC1011903xV("LOG_VIEW", 1);
        LOG_VIEW = enumC1011903xV2;
        EnumC1011903xV enumC1011903xV3 = new EnumC1011903xV("SEND_LOG", 2);
        SEND_LOG = enumC1011903xV3;
        EnumC1011903xV[] enumC1011903xVArr = {enumC1011903xV, enumC1011903xV2, enumC1011903xV3};
        LL = enumC1011903xVArr;
        LLILLJJLI = new C2254308sP(enumC1011903xVArr);
    }

    public static EnumC1011903xV[] values() {
        return (EnumC1011903xV[]) LL.clone();
    }

    public static EnumC1011903xV valueOf(String str) {
        return (EnumC1011903xV) C08FF.LIZ(EnumC1011903xV.class, str);
    }

    public EnumC1011903xV(String str, int i) {
    }
}
