package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC600280NgY {
    public static final EnumC600280NgY CLICK;
    public static final EnumC600280NgY ILLEGAL_CONTEXT;
    public static final EnumC600280NgY ILLEGAL_SCHEMA;
    public static final /* synthetic */ EnumC600280NgY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC600280NgY ON_EXPOSURE;

    public static InterfaceC2044707zh<EnumC600280NgY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC600280NgY enumC600280NgY = new EnumC600280NgY("ON_EXPOSURE", 0);
        ON_EXPOSURE = enumC600280NgY;
        EnumC600280NgY enumC600280NgY2 = new EnumC600280NgY("CLICK", 1);
        CLICK = enumC600280NgY2;
        EnumC600280NgY enumC600280NgY3 = new EnumC600280NgY("ILLEGAL_SCHEMA", 2);
        ILLEGAL_SCHEMA = enumC600280NgY3;
        EnumC600280NgY enumC600280NgY4 = new EnumC600280NgY("ILLEGAL_CONTEXT", 3);
        ILLEGAL_CONTEXT = enumC600280NgY4;
        EnumC600280NgY[] enumC600280NgYArr = {enumC600280NgY, enumC600280NgY2, enumC600280NgY3, enumC600280NgY4};
        LL = enumC600280NgYArr;
        LLILLJJLI = new C2254308sP(enumC600280NgYArr);
    }

    public static EnumC600280NgY[] values() {
        return (EnumC600280NgY[]) LL.clone();
    }

    public static EnumC600280NgY valueOf(String str) {
        return (EnumC600280NgY) C08FF.LIZ(EnumC600280NgY.class, str);
    }

    public EnumC600280NgY(String str, int i) {
    }
}
