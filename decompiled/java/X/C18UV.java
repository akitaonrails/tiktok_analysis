package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18UV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UV {
    public static final /* synthetic */ C18UV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C18UV PARAMS2MESSAGE;
    public static final C18UV SAVE_DB;
    public static final C18UV SEND_TO_SERVER;
    public static final C18UV UPLOAD_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<C18UV> getEntries() {
        return LLILLL;
    }

    static {
        C18UV c18uv = new C18UV("PARAMS2MESSAGE", 0, "params2message");
        PARAMS2MESSAGE = c18uv;
        C18UV c18uv2 = new C18UV("SAVE_DB", 1, "save_db");
        SAVE_DB = c18uv2;
        C18UV c18uv3 = new C18UV("UPLOAD_PHOTO", 2, "image_upload");
        UPLOAD_PHOTO = c18uv3;
        C18UV c18uv4 = new C18UV("SEND_TO_SERVER", 3, "sdk_send");
        SEND_TO_SERVER = c18uv4;
        C18UV[] c18uvArr = {c18uv, c18uv2, c18uv3, c18uv4};
        LLILLJJLI = c18uvArr;
        LLILLL = new C2254308sP(c18uvArr);
    }

    public static C18UV[] values() {
        return (C18UV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C18UV valueOf(String str) {
        return (C18UV) C08FF.LIZ(C18UV.class, str);
    }

    public C18UV(String str, int i, String str2) {
        this.LL = str2;
    }
}
