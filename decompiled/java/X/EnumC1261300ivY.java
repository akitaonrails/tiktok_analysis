package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ivY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261300ivY {
    public static final EnumC1261300ivY CANCEL;
    public static final EnumC1261300ivY CANCEL_REQUEST;
    public static final /* synthetic */ EnumC1261300ivY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1261300ivY MESSAGE;
    public static final EnumC1261300ivY SHARE_PROFILE;
    public static final EnumC1261300ivY SHOW;
    public static final EnumC1261300ivY UNFOLLOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1261300ivY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1261300ivY enumC1261300ivY = new EnumC1261300ivY("SHOW", 0, "show");
        SHOW = enumC1261300ivY;
        EnumC1261300ivY enumC1261300ivY2 = new EnumC1261300ivY("SHARE_PROFILE", 1, "share_profile");
        SHARE_PROFILE = enumC1261300ivY2;
        EnumC1261300ivY enumC1261300ivY3 = new EnumC1261300ivY("MESSAGE", 2, "message");
        MESSAGE = enumC1261300ivY3;
        EnumC1261300ivY enumC1261300ivY4 = new EnumC1261300ivY("UNFOLLOW", 3, "unfollow");
        UNFOLLOW = enumC1261300ivY4;
        EnumC1261300ivY enumC1261300ivY5 = new EnumC1261300ivY("CANCEL", 4, "cancel");
        CANCEL = enumC1261300ivY5;
        EnumC1261300ivY enumC1261300ivY6 = new EnumC1261300ivY("CANCEL_REQUEST", 5, "cancel_request");
        CANCEL_REQUEST = enumC1261300ivY6;
        EnumC1261300ivY[] enumC1261300ivYArr = {enumC1261300ivY, enumC1261300ivY2, enumC1261300ivY3, enumC1261300ivY4, enumC1261300ivY5, enumC1261300ivY6};
        LLILLJJLI = enumC1261300ivYArr;
        LLILLL = new C2254308sP(enumC1261300ivYArr);
    }

    public static EnumC1261300ivY[] values() {
        return (EnumC1261300ivY[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1261300ivY valueOf(String str) {
        return (EnumC1261300ivY) C08FF.LIZ(EnumC1261300ivY.class, str);
    }

    public EnumC1261300ivY(String str, int i, String str2) {
        this.LL = str2;
    }
}
