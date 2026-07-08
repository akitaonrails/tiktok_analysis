package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC727930Sgx {
    public static final /* synthetic */ EnumC727930Sgx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC727930Sgx LOTTIE_ANIMATION;
    public static final EnumC727930Sgx PROGRESS_BAR;

    public static InterfaceC2044707zh<EnumC727930Sgx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC727930Sgx enumC727930Sgx = new EnumC727930Sgx("PROGRESS_BAR", 0);
        PROGRESS_BAR = enumC727930Sgx;
        EnumC727930Sgx enumC727930Sgx2 = new EnumC727930Sgx("LOTTIE_ANIMATION", 1);
        LOTTIE_ANIMATION = enumC727930Sgx2;
        EnumC727930Sgx[] enumC727930SgxArr = {enumC727930Sgx, enumC727930Sgx2};
        LL = enumC727930SgxArr;
        LLILLJJLI = new C2254308sP(enumC727930SgxArr);
    }

    public static EnumC727930Sgx[] values() {
        return (EnumC727930Sgx[]) LL.clone();
    }

    public static EnumC727930Sgx valueOf(String str) {
        return (EnumC727930Sgx) C08FF.LIZ(EnumC727930Sgx.class, str);
    }

    public EnumC727930Sgx(String str, int i) {
    }
}
