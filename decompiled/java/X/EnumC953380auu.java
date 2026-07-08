package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0auu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC953380auu {
    public static final EnumC953380auu API_CALL;
    public static final EnumC953380auu APPLY;
    public static final EnumC953380auu CHECK_INCREASE_GUEST;
    public static final EnumC953380auu CLICK_SAVE;
    public static final EnumC953380auu CREATE_OR_GET_AUX_STREAM;
    public static final EnumC953380auu FETCH_TOKEN;
    public static final EnumC953380auu GET_BITMAP;
    public static final /* synthetic */ EnumC953380auu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC953380auu NOTICEBOARD_CONTROLLER_RECEIVED;
    public static final EnumC953380auu REVIEW_PASS;
    public static final EnumC953380auu SAVE_FILE;
    public static final EnumC953380auu TURN_ON_ENGINE;
    public static final EnumC953380auu UPLOAD_FILE;

    public static InterfaceC2044707zh<EnumC953380auu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC953380auu enumC953380auu = new EnumC953380auu("CLICK_SAVE", 0);
        CLICK_SAVE = enumC953380auu;
        EnumC953380auu enumC953380auu2 = new EnumC953380auu("SAVE_FILE", 1);
        SAVE_FILE = enumC953380auu2;
        EnumC953380auu enumC953380auu3 = new EnumC953380auu("FETCH_TOKEN", 2);
        FETCH_TOKEN = enumC953380auu3;
        EnumC953380auu enumC953380auu4 = new EnumC953380auu("UPLOAD_FILE", 3);
        UPLOAD_FILE = enumC953380auu4;
        EnumC953380auu enumC953380auu5 = new EnumC953380auu("NOTICEBOARD_CONTROLLER_RECEIVED", 4);
        NOTICEBOARD_CONTROLLER_RECEIVED = enumC953380auu5;
        EnumC953380auu enumC953380auu6 = new EnumC953380auu("GET_BITMAP", 5);
        GET_BITMAP = enumC953380auu6;
        EnumC953380auu enumC953380auu7 = new EnumC953380auu("TURN_ON_ENGINE", 6);
        TURN_ON_ENGINE = enumC953380auu7;
        EnumC953380auu enumC953380auu8 = new EnumC953380auu("CHECK_INCREASE_GUEST", 7);
        CHECK_INCREASE_GUEST = enumC953380auu8;
        EnumC953380auu enumC953380auu9 = new EnumC953380auu("CREATE_OR_GET_AUX_STREAM", 8);
        CREATE_OR_GET_AUX_STREAM = enumC953380auu9;
        EnumC953380auu enumC953380auu10 = new EnumC953380auu("API_CALL", 9);
        API_CALL = enumC953380auu10;
        EnumC953380auu enumC953380auu11 = new EnumC953380auu("REVIEW_PASS", 10);
        REVIEW_PASS = enumC953380auu11;
        EnumC953380auu enumC953380auu12 = new EnumC953380auu("APPLY", 11);
        APPLY = enumC953380auu12;
        EnumC953380auu[] enumC953380auuArr = {enumC953380auu, enumC953380auu2, enumC953380auu3, enumC953380auu4, enumC953380auu5, enumC953380auu6, enumC953380auu7, enumC953380auu8, enumC953380auu9, enumC953380auu10, enumC953380auu11, enumC953380auu12};
        LL = enumC953380auuArr;
        LLILLJJLI = new C2254308sP(enumC953380auuArr);
    }

    public static EnumC953380auu[] values() {
        return (EnumC953380auu[]) LL.clone();
    }

    public static EnumC953380auu valueOf(String str) {
        return (EnumC953380auu) C08FF.LIZ(EnumC953380auu.class, str);
    }

    public EnumC953380auu(String str, int i) {
    }
}
