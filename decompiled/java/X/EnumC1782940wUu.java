package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782940wUu {
    public static final EnumC1782940wUu DATA_ERROR;
    public static final EnumC1782940wUu LIVE_CARD_DESTROY;
    public static final EnumC1782940wUu LIVE_CARD_DETACH;
    public static final EnumC1782940wUu LIVE_CARD_PAUSE;
    public static final EnumC1782940wUu LIVE_CARD_STOP;
    public static final /* synthetic */ EnumC1782940wUu[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1782940wUu SUCCESS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1782940wUu> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1782940wUu enumC1782940wUu = new EnumC1782940wUu("SUCCESS", 0, 0, "success");
        SUCCESS = enumC1782940wUu;
        EnumC1782940wUu enumC1782940wUu2 = new EnumC1782940wUu("DATA_ERROR", 1, 10000, "data error");
        DATA_ERROR = enumC1782940wUu2;
        EnumC1782940wUu enumC1782940wUu3 = new EnumC1782940wUu("LIVE_CARD_PAUSE", 2, 10001, "live card pause");
        LIVE_CARD_PAUSE = enumC1782940wUu3;
        EnumC1782940wUu enumC1782940wUu4 = new EnumC1782940wUu("LIVE_CARD_STOP", 3, 10002, "live card stop");
        LIVE_CARD_STOP = enumC1782940wUu4;
        EnumC1782940wUu enumC1782940wUu5 = new EnumC1782940wUu("LIVE_CARD_DETACH", 4, 10003, "live card detach");
        LIVE_CARD_DETACH = enumC1782940wUu5;
        EnumC1782940wUu enumC1782940wUu6 = new EnumC1782940wUu("LIVE_CARD_DESTROY", 5, 10004, "live card destroy");
        LIVE_CARD_DESTROY = enumC1782940wUu6;
        EnumC1782940wUu[] enumC1782940wUuArr = {enumC1782940wUu, enumC1782940wUu2, enumC1782940wUu3, enumC1782940wUu4, enumC1782940wUu5, enumC1782940wUu6};
        LLILLL = enumC1782940wUuArr;
        LLILZ = new C2254308sP(enumC1782940wUuArr);
    }

    public static EnumC1782940wUu[] values() {
        return (EnumC1782940wUu[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC1782940wUu valueOf(String str) {
        return (EnumC1782940wUu) C08FF.LIZ(EnumC1782940wUu.class, str);
    }

    public EnumC1782940wUu(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
