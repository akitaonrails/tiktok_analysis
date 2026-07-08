package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1751090vfX {
    public static final EnumC1751090vfX BOTH;
    public static final EnumC1751090vfX EMPTY;
    public static final EnumC1751090vfX ERROR;
    public static final /* synthetic */ EnumC1751090vfX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1751090vfX LOADING;
    public static final EnumC1751090vfX MESSAGE_ONLY;
    public static final EnumC1751090vfX NETWORK_UNAVAILABLE;
    public static final EnumC1751090vfX NOTICE_ONLY;
    public static final EnumC1751090vfX REFRESHING;

    public static InterfaceC2044707zh<EnumC1751090vfX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1751090vfX enumC1751090vfX = new EnumC1751090vfX("LOADING", 0);
        LOADING = enumC1751090vfX;
        EnumC1751090vfX enumC1751090vfX2 = new EnumC1751090vfX("NETWORK_UNAVAILABLE", 1);
        NETWORK_UNAVAILABLE = enumC1751090vfX2;
        EnumC1751090vfX enumC1751090vfX3 = new EnumC1751090vfX("REFRESHING", 2);
        REFRESHING = enumC1751090vfX3;
        EnumC1751090vfX enumC1751090vfX4 = new EnumC1751090vfX("EMPTY", 3);
        EMPTY = enumC1751090vfX4;
        EnumC1751090vfX enumC1751090vfX5 = new EnumC1751090vfX("NOTICE_ONLY", 4);
        NOTICE_ONLY = enumC1751090vfX5;
        EnumC1751090vfX enumC1751090vfX6 = new EnumC1751090vfX("MESSAGE_ONLY", 5);
        MESSAGE_ONLY = enumC1751090vfX6;
        EnumC1751090vfX enumC1751090vfX7 = new EnumC1751090vfX("BOTH", 6);
        BOTH = enumC1751090vfX7;
        EnumC1751090vfX enumC1751090vfX8 = new EnumC1751090vfX("ERROR", 7);
        ERROR = enumC1751090vfX8;
        EnumC1751090vfX[] enumC1751090vfXArr = {enumC1751090vfX, enumC1751090vfX2, enumC1751090vfX3, enumC1751090vfX4, enumC1751090vfX5, enumC1751090vfX6, enumC1751090vfX7, enumC1751090vfX8};
        LL = enumC1751090vfXArr;
        LLILLJJLI = new C2254308sP(enumC1751090vfXArr);
    }

    public static EnumC1751090vfX[] values() {
        return (EnumC1751090vfX[]) LL.clone();
    }

    public static EnumC1751090vfX valueOf(String str) {
        return (EnumC1751090vfX) C08FF.LIZ(EnumC1751090vfX.class, str);
    }

    public EnumC1751090vfX(String str, int i) {
    }
}
