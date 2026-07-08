package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20657115sP {
    public static final /* synthetic */ EnumC20657115sP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20657115sP POPUP_ASYNC_EXCEPTION;
    public static final EnumC20657115sP POPUP_DEPENDENCY;
    public static final EnumC20657115sP POPUP_DISPERSION;
    public static final EnumC20657115sP POPUP_INTERCEPTOR;
    public static final EnumC20657115sP POPUP_SHOW_EXCEPTION;
    public static final EnumC20657115sP POPUP_STATE_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20657115sP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20657115sP enumC20657115sP = new EnumC20657115sP("POPUP_STATE_ERROR", 0, 1001);
        POPUP_STATE_ERROR = enumC20657115sP;
        EnumC20657115sP enumC20657115sP2 = new EnumC20657115sP("POPUP_DEPENDENCY", 1, 1002);
        POPUP_DEPENDENCY = enumC20657115sP2;
        EnumC20657115sP enumC20657115sP3 = new EnumC20657115sP("POPUP_INTERCEPTOR", 2, 1003);
        POPUP_INTERCEPTOR = enumC20657115sP3;
        EnumC20657115sP enumC20657115sP4 = new EnumC20657115sP("POPUP_ASYNC_EXCEPTION", 3, 1004);
        POPUP_ASYNC_EXCEPTION = enumC20657115sP4;
        EnumC20657115sP enumC20657115sP5 = new EnumC20657115sP("POPUP_SHOW_EXCEPTION", 4, 1005);
        POPUP_SHOW_EXCEPTION = enumC20657115sP5;
        EnumC20657115sP enumC20657115sP6 = new EnumC20657115sP("POPUP_DISPERSION", 5, 1006);
        POPUP_DISPERSION = enumC20657115sP6;
        EnumC20657115sP[] enumC20657115sPArr = {enumC20657115sP, enumC20657115sP2, enumC20657115sP3, enumC20657115sP4, enumC20657115sP5, enumC20657115sP6};
        LLILLJJLI = enumC20657115sPArr;
        LLILLL = new C2254308sP(enumC20657115sPArr);
    }

    public static EnumC20657115sP[] values() {
        return (EnumC20657115sP[]) LLILLJJLI.clone();
    }

    public final int getFailCode() {
        return this.LL;
    }

    public static EnumC20657115sP valueOf(String str) {
        return (EnumC20657115sP) C08FF.LIZ(EnumC20657115sP.class, str);
    }

    public EnumC20657115sP(String str, int i, int i2) {
        this.LL = i2;
    }
}
