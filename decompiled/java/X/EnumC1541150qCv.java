package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1541150qCv {
    public static final EnumC1541150qCv CANCELLED_CONSUMER_GONE;
    public static final EnumC1541150qCv CANCELLED_RECORDED;
    public static final EnumC1541150qCv CANCELLED_REUSE_FAILED;
    public static final EnumC1541150qCv CANCELLED_TIMEOUT;
    public static final EnumC1541150qCv CONSUMED;
    public static final EnumC1541150qCv EXPIRED;
    public static final EnumC1541150qCv EXPLICIT_RELEASE;
    public static final EnumC1541150qCv GROUP_DESTROYED;
    public static final /* synthetic */ EnumC1541150qCv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1541150qCv MEMORY_PRESSURE;
    public static final EnumC1541150qCv REPLACED;
    public static final EnumC1541150qCv TASK_FAILED;

    public static InterfaceC2044707zh<EnumC1541150qCv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1541150qCv enumC1541150qCv = new EnumC1541150qCv("CONSUMED", 0);
        CONSUMED = enumC1541150qCv;
        EnumC1541150qCv enumC1541150qCv2 = new EnumC1541150qCv("EXPIRED", 1);
        EXPIRED = enumC1541150qCv2;
        EnumC1541150qCv enumC1541150qCv3 = new EnumC1541150qCv("REPLACED", 2);
        REPLACED = enumC1541150qCv3;
        EnumC1541150qCv enumC1541150qCv4 = new EnumC1541150qCv("EXPLICIT_RELEASE", 3);
        EXPLICIT_RELEASE = enumC1541150qCv4;
        EnumC1541150qCv enumC1541150qCv5 = new EnumC1541150qCv("GROUP_DESTROYED", 4);
        GROUP_DESTROYED = enumC1541150qCv5;
        EnumC1541150qCv enumC1541150qCv6 = new EnumC1541150qCv("MEMORY_PRESSURE", 5);
        MEMORY_PRESSURE = enumC1541150qCv6;
        EnumC1541150qCv enumC1541150qCv7 = new EnumC1541150qCv("CANCELLED_RECORDED", 6);
        CANCELLED_RECORDED = enumC1541150qCv7;
        EnumC1541150qCv enumC1541150qCv8 = new EnumC1541150qCv("CANCELLED_TIMEOUT", 7);
        CANCELLED_TIMEOUT = enumC1541150qCv8;
        EnumC1541150qCv enumC1541150qCv9 = new EnumC1541150qCv("CANCELLED_REUSE_FAILED", 8);
        CANCELLED_REUSE_FAILED = enumC1541150qCv9;
        EnumC1541150qCv enumC1541150qCv10 = new EnumC1541150qCv("CANCELLED_CONSUMER_GONE", 9);
        CANCELLED_CONSUMER_GONE = enumC1541150qCv10;
        EnumC1541150qCv enumC1541150qCv11 = new EnumC1541150qCv("TASK_FAILED", 10);
        TASK_FAILED = enumC1541150qCv11;
        EnumC1541150qCv[] enumC1541150qCvArr = {enumC1541150qCv, enumC1541150qCv2, enumC1541150qCv3, enumC1541150qCv4, enumC1541150qCv5, enumC1541150qCv6, enumC1541150qCv7, enumC1541150qCv8, enumC1541150qCv9, enumC1541150qCv10, enumC1541150qCv11};
        LL = enumC1541150qCvArr;
        LLILLJJLI = new C2254308sP(enumC1541150qCvArr);
    }

    public static EnumC1541150qCv[] values() {
        return (EnumC1541150qCv[]) LL.clone();
    }

    public static EnumC1541150qCv valueOf(String str) {
        return (EnumC1541150qCv) C08FF.LIZ(EnumC1541150qCv.class, str);
    }

    public EnumC1541150qCv(String str, int i) {
    }
}
