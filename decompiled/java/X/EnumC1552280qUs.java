package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1552280qUs {
    public static final EnumC1552280qUs CHECK_UPDATE_EXCEPTION;
    public static final EnumC1552280qUs CHECK_UPDATE_THREAD_EXCEPTION;
    public static final EnumC1552280qUs DOWNLOAD_FAILED;
    public static final /* synthetic */ EnumC1552280qUs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1552280qUs NET_WORK_ERROR;
    public static final EnumC1552280qUs REQUEST_FAIL_INTERCEPT;
    public static final EnumC1552280qUs REQUEST_INVALID;
    public static final EnumC1552280qUs REQUEST_REPEAT;
    public static final EnumC1552280qUs RESPONSE_PARSE;
    public static final EnumC1552280qUs SUCCEED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1552280qUs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1552280qUs enumC1552280qUs = new EnumC1552280qUs("SUCCEED", 0, 0);
        SUCCEED = enumC1552280qUs;
        EnumC1552280qUs enumC1552280qUs2 = new EnumC1552280qUs("REQUEST_INVALID", 1, 1);
        REQUEST_INVALID = enumC1552280qUs2;
        EnumC1552280qUs enumC1552280qUs3 = new EnumC1552280qUs("NET_WORK_ERROR", 2, 2);
        NET_WORK_ERROR = enumC1552280qUs3;
        EnumC1552280qUs enumC1552280qUs4 = new EnumC1552280qUs("RESPONSE_PARSE", 3, 3);
        RESPONSE_PARSE = enumC1552280qUs4;
        EnumC1552280qUs enumC1552280qUs5 = new EnumC1552280qUs("DOWNLOAD_FAILED", 4, 4);
        DOWNLOAD_FAILED = enumC1552280qUs5;
        EnumC1552280qUs enumC1552280qUs6 = new EnumC1552280qUs("CHECK_UPDATE_EXCEPTION", 5, 5);
        CHECK_UPDATE_EXCEPTION = enumC1552280qUs6;
        EnumC1552280qUs enumC1552280qUs7 = new EnumC1552280qUs("CHECK_UPDATE_THREAD_EXCEPTION", 6, 6);
        CHECK_UPDATE_THREAD_EXCEPTION = enumC1552280qUs7;
        EnumC1552280qUs enumC1552280qUs8 = new EnumC1552280qUs("REQUEST_REPEAT", 7, 600);
        REQUEST_REPEAT = enumC1552280qUs8;
        EnumC1552280qUs enumC1552280qUs9 = new EnumC1552280qUs("REQUEST_FAIL_INTERCEPT", 8, 601);
        REQUEST_FAIL_INTERCEPT = enumC1552280qUs9;
        EnumC1552280qUs[] enumC1552280qUsArr = {enumC1552280qUs, enumC1552280qUs2, enumC1552280qUs3, enumC1552280qUs4, enumC1552280qUs5, enumC1552280qUs6, enumC1552280qUs7, enumC1552280qUs8, enumC1552280qUs9};
        LLILLJJLI = enumC1552280qUsArr;
        LLILLL = new C2254308sP(enumC1552280qUsArr);
    }

    public static EnumC1552280qUs[] values() {
        return (EnumC1552280qUs[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC1552280qUs valueOf(String str) {
        return (EnumC1552280qUs) C08FF.LIZ(EnumC1552280qUs.class, str);
    }

    public EnumC1552280qUs(String str, int i, int i2) {
        this.LL = i2;
    }
}
