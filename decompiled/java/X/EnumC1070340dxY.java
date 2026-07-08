package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070340dxY {
    public static final EnumC1070340dxY CONTACT;
    public static final EnumC1070340dxY EMAIL;
    public static final EnumC1070340dxY FACEBOOK;
    public static final /* synthetic */ EnumC1070340dxY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1070340dxY MLBB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1070340dxY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1070340dxY enumC1070340dxY = new EnumC1070340dxY("CONTACT", 0, "contact");
        CONTACT = enumC1070340dxY;
        EnumC1070340dxY enumC1070340dxY2 = new EnumC1070340dxY("FACEBOOK", 1, "facebook");
        FACEBOOK = enumC1070340dxY2;
        EnumC1070340dxY enumC1070340dxY3 = new EnumC1070340dxY("MLBB", 2, "mlbb");
        MLBB = enumC1070340dxY3;
        EnumC1070340dxY enumC1070340dxY4 = new EnumC1070340dxY("EMAIL", 3, "email");
        EMAIL = enumC1070340dxY4;
        EnumC1070340dxY[] enumC1070340dxYArr = {enumC1070340dxY, enumC1070340dxY2, enumC1070340dxY3, enumC1070340dxY4};
        LLILLJJLI = enumC1070340dxYArr;
        LLILLL = new C2254308sP(enumC1070340dxYArr);
    }

    public static EnumC1070340dxY[] values() {
        return (EnumC1070340dxY[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC1070340dxY valueOf(String str) {
        return (EnumC1070340dxY) C08FF.LIZ(EnumC1070340dxY.class, str);
    }

    public EnumC1070340dxY(String str, int i, String str2) {
        this.LL = str2;
    }
}
