package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982990bgf {
    public static final EnumC982990bgf FAIL_REASON_HIT_FINISH_CACHE;
    public static final EnumC982990bgf FAIL_REASON_ID_INVALID;
    public static final EnumC982990bgf FAIL_REASON_INFO_INVALID;
    public static final EnumC982990bgf FAIL_REASON_SEI_INVALID;
    public static final EnumC982990bgf FAIL_REASON_STATUS_INVALID;
    public static final /* synthetic */ EnumC982990bgf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC982990bgf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC982990bgf enumC982990bgf = new EnumC982990bgf("FAIL_REASON_HIT_FINISH_CACHE", 0);
        FAIL_REASON_HIT_FINISH_CACHE = enumC982990bgf;
        EnumC982990bgf enumC982990bgf2 = new EnumC982990bgf("FAIL_REASON_INFO_INVALID", 1);
        FAIL_REASON_INFO_INVALID = enumC982990bgf2;
        EnumC982990bgf enumC982990bgf3 = new EnumC982990bgf("FAIL_REASON_SEI_INVALID", 2);
        FAIL_REASON_SEI_INVALID = enumC982990bgf3;
        EnumC982990bgf enumC982990bgf4 = new EnumC982990bgf("FAIL_REASON_ID_INVALID", 3);
        FAIL_REASON_ID_INVALID = enumC982990bgf4;
        EnumC982990bgf enumC982990bgf5 = new EnumC982990bgf("FAIL_REASON_STATUS_INVALID", 4);
        FAIL_REASON_STATUS_INVALID = enumC982990bgf5;
        EnumC982990bgf[] enumC982990bgfArr = {enumC982990bgf, enumC982990bgf2, enumC982990bgf3, enumC982990bgf4, enumC982990bgf5};
        LL = enumC982990bgfArr;
        LLILLJJLI = new C2254308sP(enumC982990bgfArr);
    }

    public static EnumC982990bgf[] values() {
        return (EnumC982990bgf[]) LL.clone();
    }

    public static EnumC982990bgf valueOf(String str) {
        return (EnumC982990bgf) C08FF.LIZ(EnumC982990bgf.class, str);
    }

    public EnumC982990bgf(String str, int i) {
    }
}
