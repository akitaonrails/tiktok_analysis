package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1377810lxT {
    public static final EnumC1377810lxT CHECK_VIDEO_PERMISSION_FAIL;
    public static final EnumC1377810lxT GET_LOCAL_VIDEO_URL_FAIL;
    public static final /* synthetic */ EnumC1377810lxT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1377810lxT NETWORK_NOT_CONNECT;
    public static final EnumC1377810lxT SUCCESS;
    public static final EnumC1377810lxT VIDEO_REQUEST_FAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1377810lxT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1377810lxT enumC1377810lxT = new EnumC1377810lxT("SUCCESS", 0, 0);
        SUCCESS = enumC1377810lxT;
        EnumC1377810lxT enumC1377810lxT2 = new EnumC1377810lxT("NETWORK_NOT_CONNECT", 1, 2);
        NETWORK_NOT_CONNECT = enumC1377810lxT2;
        EnumC1377810lxT enumC1377810lxT3 = new EnumC1377810lxT("VIDEO_REQUEST_FAIL", 2, 3);
        VIDEO_REQUEST_FAIL = enumC1377810lxT3;
        EnumC1377810lxT enumC1377810lxT4 = new EnumC1377810lxT("CHECK_VIDEO_PERMISSION_FAIL", 3, 4);
        CHECK_VIDEO_PERMISSION_FAIL = enumC1377810lxT4;
        EnumC1377810lxT enumC1377810lxT5 = new EnumC1377810lxT("GET_LOCAL_VIDEO_URL_FAIL", 4, 5);
        GET_LOCAL_VIDEO_URL_FAIL = enumC1377810lxT5;
        EnumC1377810lxT[] enumC1377810lxTArr = {enumC1377810lxT, enumC1377810lxT2, enumC1377810lxT3, enumC1377810lxT4, enumC1377810lxT5};
        LLILLJJLI = enumC1377810lxTArr;
        LLILLL = new C2254308sP(enumC1377810lxTArr);
    }

    public static EnumC1377810lxT[] values() {
        return (EnumC1377810lxT[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1377810lxT valueOf(String str) {
        return (EnumC1377810lxT) C08FF.LIZ(EnumC1377810lxT.class, str);
    }

    public EnumC1377810lxT(String str, int i, int i2) {
        this.LL = i2;
    }
}
