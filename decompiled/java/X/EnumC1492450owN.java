package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0owN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1492450owN {
    public static final /* synthetic */ EnumC1492450owN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1492450owN SHOW_BAR;
    public static final EnumC1492450owN SHOW_NO_NET_SCREEN;
    public static final EnumC1492450owN SHOW_TOAST;

    public static InterfaceC2044707zh<EnumC1492450owN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1492450owN enumC1492450owN = new EnumC1492450owN("SHOW_TOAST", 0);
        SHOW_TOAST = enumC1492450owN;
        EnumC1492450owN enumC1492450owN2 = new EnumC1492450owN("SHOW_BAR", 1);
        SHOW_BAR = enumC1492450owN2;
        EnumC1492450owN enumC1492450owN3 = new EnumC1492450owN("SHOW_NO_NET_SCREEN", 2);
        SHOW_NO_NET_SCREEN = enumC1492450owN3;
        EnumC1492450owN[] enumC1492450owNArr = {enumC1492450owN, enumC1492450owN2, enumC1492450owN3};
        LL = enumC1492450owNArr;
        LLILLJJLI = new C2254308sP(enumC1492450owNArr);
    }

    public static EnumC1492450owN[] values() {
        return (EnumC1492450owN[]) LL.clone();
    }

    public static EnumC1492450owN valueOf(String str) {
        return (EnumC1492450owN) C08FF.LIZ(EnumC1492450owN.class, str);
    }

    public EnumC1492450owN(String str, int i) {
    }
}
