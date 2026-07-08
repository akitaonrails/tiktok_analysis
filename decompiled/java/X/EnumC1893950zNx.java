package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1893950zNx {
    public static final EnumC1893950zNx FEED_BEFORE;
    public static final EnumC1893950zNx FEED_READY;
    public static final /* synthetic */ EnumC1893950zNx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1893950zNx LOGIN_UPDATE;
    public static final EnumC1893950zNx TOUCH_POINT_WILL_SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1893950zNx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1893950zNx enumC1893950zNx = new EnumC1893950zNx("FEED_BEFORE", 0, "onboarding");
        FEED_BEFORE = enumC1893950zNx;
        EnumC1893950zNx enumC1893950zNx2 = new EnumC1893950zNx("FEED_READY", 1, "after_feed_ready");
        FEED_READY = enumC1893950zNx2;
        EnumC1893950zNx enumC1893950zNx3 = new EnumC1893950zNx("LOGIN_UPDATE", 2, "login_update");
        LOGIN_UPDATE = enumC1893950zNx3;
        EnumC1893950zNx enumC1893950zNx4 = new EnumC1893950zNx("TOUCH_POINT_WILL_SHOW", 3, "touch_point_will_show");
        TOUCH_POINT_WILL_SHOW = enumC1893950zNx4;
        EnumC1893950zNx[] enumC1893950zNxArr = {enumC1893950zNx, enumC1893950zNx2, enumC1893950zNx3, enumC1893950zNx4};
        LLILLJJLI = enumC1893950zNxArr;
        LLILLL = new C2254308sP(enumC1893950zNxArr);
    }

    public static EnumC1893950zNx[] values() {
        return (EnumC1893950zNx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1893950zNx valueOf(String str) {
        return (EnumC1893950zNx) C08FF.LIZ(EnumC1893950zNx.class, str);
    }

    public EnumC1893950zNx(String str, int i, String str2) {
        this.LL = str2;
    }
}
