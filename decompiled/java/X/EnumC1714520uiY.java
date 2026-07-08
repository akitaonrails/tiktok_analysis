package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1714520uiY {
    public static final EnumC1714520uiY ERROR;
    public static final /* synthetic */ EnumC1714520uiY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1714520uiY LOADING;
    public static final EnumC1714520uiY SUCCESS;

    public static InterfaceC2044707zh<EnumC1714520uiY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1714520uiY enumC1714520uiY = new EnumC1714520uiY("LOADING", 0);
        LOADING = enumC1714520uiY;
        EnumC1714520uiY enumC1714520uiY2 = new EnumC1714520uiY("ERROR", 1);
        ERROR = enumC1714520uiY2;
        EnumC1714520uiY enumC1714520uiY3 = new EnumC1714520uiY("SUCCESS", 2);
        SUCCESS = enumC1714520uiY3;
        EnumC1714520uiY[] enumC1714520uiYArr = {enumC1714520uiY, enumC1714520uiY2, enumC1714520uiY3};
        LL = enumC1714520uiYArr;
        LLILLJJLI = new C2254308sP(enumC1714520uiYArr);
    }

    public static EnumC1714520uiY[] values() {
        return (EnumC1714520uiY[]) LL.clone();
    }

    public static EnumC1714520uiY valueOf(String str) {
        return (EnumC1714520uiY) C08FF.LIZ(EnumC1714520uiY.class, str);
    }

    public EnumC1714520uiY(String str, int i) {
    }
}
