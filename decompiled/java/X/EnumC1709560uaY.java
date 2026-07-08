package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709560uaY {
    public static final EnumC1709560uaY CCDC;
    public static final EnumC1709560uaY CCI;
    public static final /* synthetic */ EnumC1709560uaY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1709560uaY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709560uaY enumC1709560uaY = new EnumC1709560uaY("CCDC", 0);
        CCDC = enumC1709560uaY;
        EnumC1709560uaY enumC1709560uaY2 = new EnumC1709560uaY("CCI", 1);
        CCI = enumC1709560uaY2;
        EnumC1709560uaY[] enumC1709560uaYArr = {enumC1709560uaY, enumC1709560uaY2};
        LL = enumC1709560uaYArr;
        LLILLJJLI = new C2254308sP(enumC1709560uaYArr);
    }

    public static EnumC1709560uaY[] values() {
        return (EnumC1709560uaY[]) LL.clone();
    }

    public static EnumC1709560uaY valueOf(String str) {
        return (EnumC1709560uaY) C08FF.LIZ(EnumC1709560uaY.class, str);
    }

    public EnumC1709560uaY(String str, int i) {
    }
}
