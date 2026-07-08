package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wC9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771310wC9 {
    public static final /* synthetic */ EnumC1771310wC9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771310wC9 NETWORK_UNAVAILABLE;
    public static final EnumC1771310wC9 PARAMS_NOT_MATCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1771310wC9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771310wC9 enumC1771310wC9 = new EnumC1771310wC9("NETWORK_UNAVAILABLE", 0, "network unavailable");
        NETWORK_UNAVAILABLE = enumC1771310wC9;
        EnumC1771310wC9 enumC1771310wC92 = new EnumC1771310wC9("PARAMS_NOT_MATCH", 1, "params_not_match");
        PARAMS_NOT_MATCH = enumC1771310wC92;
        EnumC1771310wC9[] enumC1771310wC9Arr = {enumC1771310wC9, enumC1771310wC92};
        LLILLJJLI = enumC1771310wC9Arr;
        LLILLL = new C2254308sP(enumC1771310wC9Arr);
    }

    public static EnumC1771310wC9[] values() {
        return (EnumC1771310wC9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1771310wC9 valueOf(String str) {
        return (EnumC1771310wC9) C08FF.LIZ(EnumC1771310wC9.class, str);
    }

    public EnumC1771310wC9(String str, int i, String str2) {
        this.LL = str2;
    }
}
