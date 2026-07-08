package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1712310uez {
    public static final EnumC1712310uez ENABLED;
    public static final /* synthetic */ EnumC1712310uez[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1712310uez NOT_ENABLED;
    public static final EnumC1712310uez NOT_SUPPORT;
    public static final EnumC1712310uez SCANNING;

    public static InterfaceC2044707zh<EnumC1712310uez> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1712310uez enumC1712310uez = new EnumC1712310uez("NOT_SUPPORT", 0);
        NOT_SUPPORT = enumC1712310uez;
        EnumC1712310uez enumC1712310uez2 = new EnumC1712310uez("NOT_ENABLED", 1);
        NOT_ENABLED = enumC1712310uez2;
        EnumC1712310uez enumC1712310uez3 = new EnumC1712310uez("ENABLED", 2);
        ENABLED = enumC1712310uez3;
        EnumC1712310uez enumC1712310uez4 = new EnumC1712310uez("SCANNING", 3);
        SCANNING = enumC1712310uez4;
        EnumC1712310uez[] enumC1712310uezArr = {enumC1712310uez, enumC1712310uez2, enumC1712310uez3, enumC1712310uez4};
        LL = enumC1712310uezArr;
        LLILLJJLI = new C2254308sP(enumC1712310uezArr);
    }

    public static EnumC1712310uez[] values() {
        return (EnumC1712310uez[]) LL.clone();
    }

    public static EnumC1712310uez valueOf(String str) {
        return (EnumC1712310uez) C08FF.LIZ(EnumC1712310uez.class, str);
    }

    public EnumC1712310uez(String str, int i) {
    }
}
