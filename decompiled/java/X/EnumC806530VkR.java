package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC806530VkR {
    public static final EnumC806530VkR FAILED;
    public static final EnumC806530VkR INIT;
    public static final /* synthetic */ EnumC806530VkR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC806530VkR LOADED;
    public static final EnumC806530VkR LOADING;

    public static InterfaceC2044707zh<EnumC806530VkR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC806530VkR enumC806530VkR = new EnumC806530VkR("INIT", 0);
        INIT = enumC806530VkR;
        EnumC806530VkR enumC806530VkR2 = new EnumC806530VkR("LOADING", 1);
        LOADING = enumC806530VkR2;
        EnumC806530VkR enumC806530VkR3 = new EnumC806530VkR("LOADED", 2);
        LOADED = enumC806530VkR3;
        EnumC806530VkR enumC806530VkR4 = new EnumC806530VkR("FAILED", 3);
        FAILED = enumC806530VkR4;
        EnumC806530VkR[] enumC806530VkRArr = {enumC806530VkR, enumC806530VkR2, enumC806530VkR3, enumC806530VkR4};
        LL = enumC806530VkRArr;
        LLILLJJLI = new C2254308sP(enumC806530VkRArr);
    }

    public static EnumC806530VkR[] values() {
        return (EnumC806530VkR[]) LL.clone();
    }

    public static EnumC806530VkR valueOf(String str) {
        return (EnumC806530VkR) C08FF.LIZ(EnumC806530VkR.class, str);
    }

    public EnumC806530VkR(String str, int i) {
    }
}
