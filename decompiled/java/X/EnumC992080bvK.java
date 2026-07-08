package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992080bvK {
    public static final EnumC992080bvK ENTER_MINIS;
    public static final EnumC992080bvK LEAVE_ADS;
    public static final /* synthetic */ EnumC992080bvK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992080bvK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992080bvK enumC992080bvK = new EnumC992080bvK("LEAVE_ADS", 0);
        LEAVE_ADS = enumC992080bvK;
        EnumC992080bvK enumC992080bvK2 = new EnumC992080bvK("ENTER_MINIS", 1);
        ENTER_MINIS = enumC992080bvK2;
        EnumC992080bvK[] enumC992080bvKArr = {enumC992080bvK, enumC992080bvK2};
        LL = enumC992080bvKArr;
        LLILLJJLI = new C2254308sP(enumC992080bvKArr);
    }

    public static EnumC992080bvK[] values() {
        return (EnumC992080bvK[]) LL.clone();
    }

    public static EnumC992080bvK valueOf(String str) {
        return (EnumC992080bvK) C08FF.LIZ(EnumC992080bvK.class, str);
    }

    public EnumC992080bvK(String str, int i) {
    }
}
