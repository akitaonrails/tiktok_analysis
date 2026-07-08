package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1426980nEm {
    public static final EnumC1426980nEm EMPTY_ERROR;
    public static final EnumC1426980nEm HIDE;
    public static final /* synthetic */ EnumC1426980nEm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1426980nEm LOADING;
    public static final EnumC1426980nEm NET_ERROR;

    public static InterfaceC2044707zh<EnumC1426980nEm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1426980nEm enumC1426980nEm = new EnumC1426980nEm("LOADING", 0);
        LOADING = enumC1426980nEm;
        EnumC1426980nEm enumC1426980nEm2 = new EnumC1426980nEm("NET_ERROR", 1);
        NET_ERROR = enumC1426980nEm2;
        EnumC1426980nEm enumC1426980nEm3 = new EnumC1426980nEm("EMPTY_ERROR", 2);
        EMPTY_ERROR = enumC1426980nEm3;
        EnumC1426980nEm enumC1426980nEm4 = new EnumC1426980nEm("HIDE", 3);
        HIDE = enumC1426980nEm4;
        EnumC1426980nEm[] enumC1426980nEmArr = {enumC1426980nEm, enumC1426980nEm2, enumC1426980nEm3, enumC1426980nEm4};
        LL = enumC1426980nEmArr;
        LLILLJJLI = new C2254308sP(enumC1426980nEmArr);
    }

    public static EnumC1426980nEm[] values() {
        return (EnumC1426980nEm[]) LL.clone();
    }

    public static EnumC1426980nEm valueOf(String str) {
        return (EnumC1426980nEm) C08FF.LIZ(EnumC1426980nEm.class, str);
    }

    public EnumC1426980nEm(String str, int i) {
    }
}
