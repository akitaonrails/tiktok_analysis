package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1552690qVX {
    public static final EnumC1552690qVX BLOCKED_BY_THROTTLE;
    public static final EnumC1552690qVX CHECK_UPDATE_FAILED;
    public static final EnumC1552690qVX CHECK_UPDATE_SUCCEED;
    public static final EnumC1552690qVX INVALID_CHANNEL;
    public static final /* synthetic */ EnumC1552690qVX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1552690qVX LOCAL_NEWEST_VERSION;
    public static final EnumC1552690qVX NOT_TRIGGERED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1552690qVX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1552690qVX enumC1552690qVX = new EnumC1552690qVX("NOT_TRIGGERED", 0, 0);
        NOT_TRIGGERED = enumC1552690qVX;
        EnumC1552690qVX enumC1552690qVX2 = new EnumC1552690qVX("CHECK_UPDATE_SUCCEED", 1, 1);
        CHECK_UPDATE_SUCCEED = enumC1552690qVX2;
        EnumC1552690qVX enumC1552690qVX3 = new EnumC1552690qVX("BLOCKED_BY_THROTTLE", 2, 2);
        BLOCKED_BY_THROTTLE = enumC1552690qVX3;
        EnumC1552690qVX enumC1552690qVX4 = new EnumC1552690qVX("INVALID_CHANNEL", 3, 3);
        INVALID_CHANNEL = enumC1552690qVX4;
        EnumC1552690qVX enumC1552690qVX5 = new EnumC1552690qVX("CHECK_UPDATE_FAILED", 4, 4);
        CHECK_UPDATE_FAILED = enumC1552690qVX5;
        EnumC1552690qVX enumC1552690qVX6 = new EnumC1552690qVX("LOCAL_NEWEST_VERSION", 5, 5);
        LOCAL_NEWEST_VERSION = enumC1552690qVX6;
        EnumC1552690qVX[] enumC1552690qVXArr = {enumC1552690qVX, enumC1552690qVX2, enumC1552690qVX3, enumC1552690qVX4, enumC1552690qVX5, enumC1552690qVX6};
        LLILLJJLI = enumC1552690qVXArr;
        LLILLL = new C2254308sP(enumC1552690qVXArr);
    }

    public static EnumC1552690qVX[] values() {
        return (EnumC1552690qVX[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1552690qVX valueOf(String str) {
        return (EnumC1552690qVX) C08FF.LIZ(EnumC1552690qVX.class, str);
    }

    public EnumC1552690qVX(String str, int i, int i2) {
        this.LL = i2;
    }
}
