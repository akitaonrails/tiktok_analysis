package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757300vpY {
    public static final /* synthetic */ EnumC1757300vpY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1757300vpY MICRO;
    public static final EnumC1757300vpY MINI;

    public static InterfaceC2044707zh<EnumC1757300vpY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1757300vpY enumC1757300vpY = new EnumC1757300vpY("MICRO", 0);
        MICRO = enumC1757300vpY;
        EnumC1757300vpY enumC1757300vpY2 = new EnumC1757300vpY("MINI", 1);
        MINI = enumC1757300vpY2;
        EnumC1757300vpY[] enumC1757300vpYArr = {enumC1757300vpY, enumC1757300vpY2};
        LL = enumC1757300vpYArr;
        LLILLJJLI = new C2254308sP(enumC1757300vpYArr);
    }

    public static EnumC1757300vpY[] values() {
        return (EnumC1757300vpY[]) LL.clone();
    }

    public static EnumC1757300vpY valueOf(String str) {
        return (EnumC1757300vpY) C08FF.LIZ(EnumC1757300vpY.class, str);
    }

    public EnumC1757300vpY(String str, int i) {
    }
}
