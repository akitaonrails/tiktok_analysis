package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1787060wbY {
    public static final EnumC1787060wbY CANCELLED;
    public static final EnumC1787060wbY CONSUMED;
    public static final EnumC1787060wbY CREATED;
    public static final /* synthetic */ EnumC1787060wbY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1787060wbY PENDING;
    public static final EnumC1787060wbY PURCHASED;
    public static final EnumC1787060wbY UPLOADED;
    public static final EnumC1787060wbY VERIFIED;

    public static InterfaceC2044707zh<EnumC1787060wbY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1787060wbY enumC1787060wbY = new EnumC1787060wbY("CREATED", 0);
        CREATED = enumC1787060wbY;
        EnumC1787060wbY enumC1787060wbY2 = new EnumC1787060wbY("PENDING", 1);
        PENDING = enumC1787060wbY2;
        EnumC1787060wbY enumC1787060wbY3 = new EnumC1787060wbY("PURCHASED", 2);
        PURCHASED = enumC1787060wbY3;
        EnumC1787060wbY enumC1787060wbY4 = new EnumC1787060wbY("CANCELLED", 3);
        CANCELLED = enumC1787060wbY4;
        EnumC1787060wbY enumC1787060wbY5 = new EnumC1787060wbY("UPLOADED", 4);
        UPLOADED = enumC1787060wbY5;
        EnumC1787060wbY enumC1787060wbY6 = new EnumC1787060wbY("VERIFIED", 5);
        VERIFIED = enumC1787060wbY6;
        EnumC1787060wbY enumC1787060wbY7 = new EnumC1787060wbY("CONSUMED", 6);
        CONSUMED = enumC1787060wbY7;
        EnumC1787060wbY[] enumC1787060wbYArr = {enumC1787060wbY, enumC1787060wbY2, enumC1787060wbY3, enumC1787060wbY4, enumC1787060wbY5, enumC1787060wbY6, enumC1787060wbY7};
        LL = enumC1787060wbYArr;
        LLILLJJLI = new C2254308sP(enumC1787060wbYArr);
    }

    public static EnumC1787060wbY[] values() {
        return (EnumC1787060wbY[]) LL.clone();
    }

    public static EnumC1787060wbY valueOf(String str) {
        return (EnumC1787060wbY) C08FF.LIZ(EnumC1787060wbY.class, str);
    }

    public EnumC1787060wbY(String str, int i) {
    }
}
