package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311620CJk {
    public static final EnumC311620CJk DATA_STORE_FAILED;
    public static final EnumC311620CJk HASH_CHECK_FAILED;
    public static final /* synthetic */ EnumC311620CJk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC311620CJk OTHER_FAILED;
    public static final EnumC311620CJk REQUEST_BUILD_FAILED;
    public static final EnumC311620CJk REQUEST_FAIL;
    public static final EnumC311620CJk SUCCESS;

    public static InterfaceC2044707zh<EnumC311620CJk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC311620CJk enumC311620CJk = new EnumC311620CJk("SUCCESS", 0);
        SUCCESS = enumC311620CJk;
        EnumC311620CJk enumC311620CJk2 = new EnumC311620CJk("REQUEST_BUILD_FAILED", 1);
        REQUEST_BUILD_FAILED = enumC311620CJk2;
        EnumC311620CJk enumC311620CJk3 = new EnumC311620CJk("REQUEST_FAIL", 2);
        REQUEST_FAIL = enumC311620CJk3;
        EnumC311620CJk enumC311620CJk4 = new EnumC311620CJk("HASH_CHECK_FAILED", 3);
        HASH_CHECK_FAILED = enumC311620CJk4;
        EnumC311620CJk enumC311620CJk5 = new EnumC311620CJk("DATA_STORE_FAILED", 4);
        DATA_STORE_FAILED = enumC311620CJk5;
        EnumC311620CJk enumC311620CJk6 = new EnumC311620CJk("OTHER_FAILED", 5);
        OTHER_FAILED = enumC311620CJk6;
        EnumC311620CJk[] enumC311620CJkArr = {enumC311620CJk, enumC311620CJk2, enumC311620CJk3, enumC311620CJk4, enumC311620CJk5, enumC311620CJk6};
        LL = enumC311620CJkArr;
        LLILLJJLI = new C2254308sP(enumC311620CJkArr);
    }

    public static EnumC311620CJk[] values() {
        return (EnumC311620CJk[]) LL.clone();
    }

    public static EnumC311620CJk valueOf(String str) {
        return (EnumC311620CJk) C08FF.LIZ(EnumC311620CJk.class, str);
    }

    public EnumC311620CJk(String str, int i) {
    }
}
