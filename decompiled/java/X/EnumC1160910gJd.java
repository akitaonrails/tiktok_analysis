package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160910gJd {
    public static final EnumC1160910gJd DISABLED;
    public static final /* synthetic */ EnumC1160910gJd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1160910gJd NO_CONFIG;
    public static final EnumC1160910gJd NO_MATCHED_NAME;
    public static final EnumC1160910gJd SUCCESS;

    public static InterfaceC2044707zh<EnumC1160910gJd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1160910gJd enumC1160910gJd = new EnumC1160910gJd("SUCCESS", 0);
        SUCCESS = enumC1160910gJd;
        EnumC1160910gJd enumC1160910gJd2 = new EnumC1160910gJd("DISABLED", 1);
        DISABLED = enumC1160910gJd2;
        EnumC1160910gJd enumC1160910gJd3 = new EnumC1160910gJd("NO_MATCHED_NAME", 2);
        NO_MATCHED_NAME = enumC1160910gJd3;
        EnumC1160910gJd enumC1160910gJd4 = new EnumC1160910gJd("NO_CONFIG", 3);
        NO_CONFIG = enumC1160910gJd4;
        EnumC1160910gJd[] enumC1160910gJdArr = {enumC1160910gJd, enumC1160910gJd2, enumC1160910gJd3, enumC1160910gJd4};
        LL = enumC1160910gJdArr;
        LLILLJJLI = new C2254308sP(enumC1160910gJdArr);
    }

    public static EnumC1160910gJd[] values() {
        return (EnumC1160910gJd[]) LL.clone();
    }

    public static EnumC1160910gJd valueOf(String str) {
        return (EnumC1160910gJd) C08FF.LIZ(EnumC1160910gJd.class, str);
    }

    public EnumC1160910gJd(String str, int i) {
    }
}
