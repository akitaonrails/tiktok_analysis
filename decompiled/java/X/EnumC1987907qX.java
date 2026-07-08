package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987907qX {
    public static final /* synthetic */ EnumC1987907qX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1987907qX NET_ERROR;
    public static final EnumC1987907qX NO_RESULT;
    public static final EnumC1987907qX SMART_SEARCH_NET_ERROR;
    public static final EnumC1987907qX SMART_SEARCH_NO_RESULT;

    public static InterfaceC2044707zh<EnumC1987907qX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987907qX enumC1987907qX = new EnumC1987907qX("NET_ERROR", 0);
        NET_ERROR = enumC1987907qX;
        EnumC1987907qX enumC1987907qX2 = new EnumC1987907qX("NO_RESULT", 1);
        NO_RESULT = enumC1987907qX2;
        EnumC1987907qX enumC1987907qX3 = new EnumC1987907qX("SMART_SEARCH_NO_RESULT", 2);
        SMART_SEARCH_NO_RESULT = enumC1987907qX3;
        EnumC1987907qX enumC1987907qX4 = new EnumC1987907qX("SMART_SEARCH_NET_ERROR", 3);
        SMART_SEARCH_NET_ERROR = enumC1987907qX4;
        EnumC1987907qX[] enumC1987907qXArr = {enumC1987907qX, enumC1987907qX2, enumC1987907qX3, enumC1987907qX4};
        LL = enumC1987907qXArr;
        LLILLJJLI = new C2254308sP(enumC1987907qXArr);
    }

    public static EnumC1987907qX[] values() {
        return (EnumC1987907qX[]) LL.clone();
    }

    public static EnumC1987907qX valueOf(String str) {
        return (EnumC1987907qX) C08FF.LIZ(EnumC1987907qX.class, str);
    }

    public EnumC1987907qX(String str, int i) {
    }
}
