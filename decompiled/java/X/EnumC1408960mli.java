package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1408960mli {
    public static final EnumC1408960mli INVALID_POLICY_URL;
    public static final /* synthetic */ EnumC1408960mli[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1408960mli POLICY_ENTRANCE_CLICK;
    public static final EnumC1408960mli POLICY_URL_REQUEST;
    public static final EnumC1408960mli POLICY_URL_RETRIEVE_RESULT;
    public static final EnumC1408960mli POLICY_VIEW_SHOW;
    public static final EnumC1408960mli REQUEST_POLICY_SERVICE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1408960mli> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1408960mli enumC1408960mli = new EnumC1408960mli("POLICY_ENTRANCE_CLICK", 0, "policy_entrance_click");
        POLICY_ENTRANCE_CLICK = enumC1408960mli;
        EnumC1408960mli enumC1408960mli2 = new EnumC1408960mli("POLICY_VIEW_SHOW", 1, "policy_view_show");
        POLICY_VIEW_SHOW = enumC1408960mli2;
        EnumC1408960mli enumC1408960mli3 = new EnumC1408960mli("REQUEST_POLICY_SERVICE", 2, "receive_policy_request");
        REQUEST_POLICY_SERVICE = enumC1408960mli3;
        EnumC1408960mli enumC1408960mli4 = new EnumC1408960mli("POLICY_URL_RETRIEVE_RESULT", 3, "policy_url_retrieve_result");
        POLICY_URL_RETRIEVE_RESULT = enumC1408960mli4;
        EnumC1408960mli enumC1408960mli5 = new EnumC1408960mli("INVALID_POLICY_URL", 4, "invalid_policy_url_result");
        INVALID_POLICY_URL = enumC1408960mli5;
        EnumC1408960mli enumC1408960mli6 = new EnumC1408960mli("POLICY_URL_REQUEST", 5, "policy_url_request");
        POLICY_URL_REQUEST = enumC1408960mli6;
        EnumC1408960mli[] enumC1408960mliArr = {enumC1408960mli, enumC1408960mli2, enumC1408960mli3, enumC1408960mli4, enumC1408960mli5, enumC1408960mli6};
        LLILLJJLI = enumC1408960mliArr;
        LLILLL = new C2254308sP(enumC1408960mliArr);
    }

    public static EnumC1408960mli[] values() {
        return (EnumC1408960mli[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1408960mli valueOf(String str) {
        return (EnumC1408960mli) C08FF.LIZ(EnumC1408960mli.class, str);
    }

    public EnumC1408960mli(String str, int i, String str2) {
        this.LL = str2;
    }
}
