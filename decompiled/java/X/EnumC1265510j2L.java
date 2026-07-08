package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0j2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1265510j2L {
    public static final /* synthetic */ EnumC1265510j2L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_ALGO_OLD_VERSION;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_CREATE_TIME;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_LIVE_NOTIFICATION;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_LOW_FAN;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_MAF_FAN_NOTICE;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_MAF_TOP;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_POST_FRIENDS_NOTIFICATION;
    public static final EnumC1265510j2L SOURCE_TYPE_BY_POST_NOTIFICATION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1265510j2L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1265510j2L enumC1265510j2L = new EnumC1265510j2L("SOURCE_TYPE_BY_CREATE_TIME", 0, 1);
        SOURCE_TYPE_BY_CREATE_TIME = enumC1265510j2L;
        EnumC1265510j2L enumC1265510j2L2 = new EnumC1265510j2L("SOURCE_TYPE_BY_ALGO_OLD_VERSION", 1, 2);
        SOURCE_TYPE_BY_ALGO_OLD_VERSION = enumC1265510j2L2;
        EnumC1265510j2L enumC1265510j2L3 = new EnumC1265510j2L("SOURCE_TYPE_BY_LIVE_NOTIFICATION", 2, 3);
        SOURCE_TYPE_BY_LIVE_NOTIFICATION = enumC1265510j2L3;
        EnumC1265510j2L enumC1265510j2L4 = new EnumC1265510j2L("SOURCE_TYPE_BY_MAF_TOP", 3, 4);
        SOURCE_TYPE_BY_MAF_TOP = enumC1265510j2L4;
        EnumC1265510j2L enumC1265510j2L5 = new EnumC1265510j2L("SOURCE_TYPE_BY_MAF_FAN_NOTICE", 4, 5);
        SOURCE_TYPE_BY_MAF_FAN_NOTICE = enumC1265510j2L5;
        EnumC1265510j2L enumC1265510j2L6 = new EnumC1265510j2L("SOURCE_TYPE_BY_LOW_FAN", 5, 6);
        SOURCE_TYPE_BY_LOW_FAN = enumC1265510j2L6;
        EnumC1265510j2L enumC1265510j2L7 = new EnumC1265510j2L("SOURCE_TYPE_BY_POST_NOTIFICATION", 6, 7);
        SOURCE_TYPE_BY_POST_NOTIFICATION = enumC1265510j2L7;
        EnumC1265510j2L enumC1265510j2L8 = new EnumC1265510j2L("SOURCE_TYPE_BY_POST_FRIENDS_NOTIFICATION", 7, 8);
        SOURCE_TYPE_BY_POST_FRIENDS_NOTIFICATION = enumC1265510j2L8;
        EnumC1265510j2L[] enumC1265510j2LArr = {enumC1265510j2L, enumC1265510j2L2, enumC1265510j2L3, enumC1265510j2L4, enumC1265510j2L5, enumC1265510j2L6, enumC1265510j2L7, enumC1265510j2L8};
        LLILLJJLI = enumC1265510j2LArr;
        LLILLL = new C2254308sP(enumC1265510j2LArr);
    }

    public static EnumC1265510j2L[] values() {
        return (EnumC1265510j2L[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1265510j2L valueOf(String str) {
        return (EnumC1265510j2L) C08FF.LIZ(EnumC1265510j2L.class, str);
    }

    public EnumC1265510j2L(String str, int i, int i2) {
        this.LL = i2;
    }
}
