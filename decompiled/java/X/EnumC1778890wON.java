package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778890wON {
    public static final EnumC1778890wON ACTIVE_FALLBACK;
    public static final EnumC1778890wON ACTIVE_SUCCESS;
    public static final /* synthetic */ EnumC1778890wON[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778890wON PASSIVE;

    public static InterfaceC2044707zh<EnumC1778890wON> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778890wON enumC1778890wON = new EnumC1778890wON("PASSIVE", 0);
        PASSIVE = enumC1778890wON;
        EnumC1778890wON enumC1778890wON2 = new EnumC1778890wON("ACTIVE_FALLBACK", 1);
        ACTIVE_FALLBACK = enumC1778890wON2;
        EnumC1778890wON enumC1778890wON3 = new EnumC1778890wON("ACTIVE_SUCCESS", 2);
        ACTIVE_SUCCESS = enumC1778890wON3;
        EnumC1778890wON[] enumC1778890wONArr = {enumC1778890wON, enumC1778890wON2, enumC1778890wON3};
        LL = enumC1778890wONArr;
        LLILLJJLI = new C2254308sP(enumC1778890wONArr);
    }

    public static EnumC1778890wON[] values() {
        return (EnumC1778890wON[]) LL.clone();
    }

    public static EnumC1778890wON valueOf(String str) {
        return (EnumC1778890wON) C08FF.LIZ(EnumC1778890wON.class, str);
    }

    public EnumC1778890wON(String str, int i) {
    }
}
