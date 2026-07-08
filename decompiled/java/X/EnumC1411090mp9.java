package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1411090mp9 {
    public static final /* synthetic */ EnumC1411090mp9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1411090mp9 NETWORK_ERROR;
    public static final EnumC1411090mp9 NO_RESULT_RETURN;
    public static final EnumC1411090mp9 TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1411090mp9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1411090mp9 enumC1411090mp9 = new EnumC1411090mp9("NO_RESULT_RETURN", 0, 2131830571);
        NO_RESULT_RETURN = enumC1411090mp9;
        EnumC1411090mp9 enumC1411090mp92 = new EnumC1411090mp9("TIMEOUT", 1, 2131830572);
        TIMEOUT = enumC1411090mp92;
        EnumC1411090mp9 enumC1411090mp93 = new EnumC1411090mp9("NETWORK_ERROR", 2, 2131857685);
        NETWORK_ERROR = enumC1411090mp93;
        EnumC1411090mp9[] enumC1411090mp9Arr = {enumC1411090mp9, enumC1411090mp92, enumC1411090mp93};
        LLILLJJLI = enumC1411090mp9Arr;
        LLILLL = new C2254308sP(enumC1411090mp9Arr);
    }

    public static EnumC1411090mp9[] values() {
        return (EnumC1411090mp9[]) LLILLJJLI.clone();
    }

    public final int getMessage() {
        return this.LL;
    }

    public static EnumC1411090mp9 valueOf(String str) {
        return (EnumC1411090mp9) C08FF.LIZ(EnumC1411090mp9.class, str);
    }

    public EnumC1411090mp9(String str, int i, int i2) {
        this.LL = i2;
    }
}
