package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779310wP3 {
    public static final EnumC1779310wP3 ANCHOR_FCP_FILTER_LIST;
    public static final EnumC1779310wP3 ANCHOR_MAKER_LIST;
    public static final EnumC1779310wP3 ANCHOR_REQUEST;
    public static final EnumC1779310wP3 ANCHOR_SERVER_LIST;
    public static final /* synthetic */ EnumC1779310wP3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1779310wP3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779310wP3 enumC1779310wP3 = new EnumC1779310wP3("ANCHOR_REQUEST", 0, "anchor_request_id");
        ANCHOR_REQUEST = enumC1779310wP3;
        EnumC1779310wP3 enumC1779310wP32 = new EnumC1779310wP3("ANCHOR_SERVER_LIST", 1, "anchor_server_list");
        ANCHOR_SERVER_LIST = enumC1779310wP32;
        EnumC1779310wP3 enumC1779310wP33 = new EnumC1779310wP3("ANCHOR_FCP_FILTER_LIST", 2, "anchor_fcp_invalid_list");
        ANCHOR_FCP_FILTER_LIST = enumC1779310wP33;
        EnumC1779310wP3 enumC1779310wP34 = new EnumC1779310wP3("ANCHOR_MAKER_LIST", 3, "anchor_maker_list");
        ANCHOR_MAKER_LIST = enumC1779310wP34;
        EnumC1779310wP3[] enumC1779310wP3Arr = {enumC1779310wP3, enumC1779310wP32, enumC1779310wP33, enumC1779310wP34};
        LLILLJJLI = enumC1779310wP3Arr;
        LLILLL = new C2254308sP(enumC1779310wP3Arr);
    }

    public static EnumC1779310wP3[] values() {
        return (EnumC1779310wP3[]) LLILLJJLI.clone();
    }

    public final String getExtraName() {
        return this.LL;
    }

    public static EnumC1779310wP3 valueOf(String str) {
        return (EnumC1779310wP3) C08FF.LIZ(EnumC1779310wP3.class, str);
    }

    public EnumC1779310wP3(String str, int i, String str2) {
        this.LL = str2;
    }
}
