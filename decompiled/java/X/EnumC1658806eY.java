package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1658806eY {
    public static final /* synthetic */ EnumC1658806eY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1658806eY SMART_REPLY;
    public static final EnumC1658806eY UNKNOWN;

    public static InterfaceC2044707zh<EnumC1658806eY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1658806eY enumC1658806eY = new EnumC1658806eY("UNKNOWN", 0);
        UNKNOWN = enumC1658806eY;
        EnumC1658806eY enumC1658806eY2 = new EnumC1658806eY("SMART_REPLY", 1);
        SMART_REPLY = enumC1658806eY2;
        EnumC1658806eY[] enumC1658806eYArr = {enumC1658806eY, enumC1658806eY2};
        LL = enumC1658806eYArr;
        LLILLJJLI = new C2254308sP(enumC1658806eYArr);
    }

    public static EnumC1658806eY[] values() {
        return (EnumC1658806eY[]) LL.clone();
    }

    public static EnumC1658806eY valueOf(String str) {
        return (EnumC1658806eY) C08FF.LIZ(EnumC1658806eY.class, str);
    }

    public EnumC1658806eY(String str, int i) {
    }
}
