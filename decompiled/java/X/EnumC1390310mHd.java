package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1390310mHd {
    public static final EnumC1390310mHd ACTIVITY;
    public static final EnumC1390310mHd IN_APP_PUSH;
    public static final /* synthetic */ EnumC1390310mHd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1390310mHd PERMISSION;
    public static final EnumC1390310mHd POPUP;
    public static final EnumC1390310mHd SMART_ROUTER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1390310mHd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1390310mHd enumC1390310mHd = new EnumC1390310mHd("ACTIVITY", 0, "activity");
        ACTIVITY = enumC1390310mHd;
        EnumC1390310mHd enumC1390310mHd2 = new EnumC1390310mHd("SMART_ROUTER", 1, "smart_router");
        SMART_ROUTER = enumC1390310mHd2;
        EnumC1390310mHd enumC1390310mHd3 = new EnumC1390310mHd("IN_APP_PUSH", 2, "in_app_push");
        IN_APP_PUSH = enumC1390310mHd3;
        EnumC1390310mHd enumC1390310mHd4 = new EnumC1390310mHd("POPUP", 3, "popup");
        POPUP = enumC1390310mHd4;
        EnumC1390310mHd enumC1390310mHd5 = new EnumC1390310mHd("PERMISSION", 4, "permission");
        PERMISSION = enumC1390310mHd5;
        EnumC1390310mHd[] enumC1390310mHdArr = {enumC1390310mHd, enumC1390310mHd2, enumC1390310mHd3, enumC1390310mHd4, enumC1390310mHd5};
        LLILLJJLI = enumC1390310mHdArr;
        LLILLL = new C2254308sP(enumC1390310mHdArr);
    }

    public static EnumC1390310mHd[] values() {
        return (EnumC1390310mHd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1390310mHd valueOf(String str) {
        return (EnumC1390310mHd) C08FF.LIZ(EnumC1390310mHd.class, str);
    }

    public EnumC1390310mHd(String str, int i, String str2) {
        this.LL = str2;
    }
}
