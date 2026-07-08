package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC636920OyY {
    public static final EnumC636920OyY EXIT;
    public static final EnumC636920OyY FREQUENCY;
    public static final /* synthetic */ EnumC636920OyY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC636920OyY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC636920OyY enumC636920OyY = new EnumC636920OyY("FREQUENCY", 0, "outreach_frequency_control");
        FREQUENCY = enumC636920OyY;
        EnumC636920OyY enumC636920OyY2 = new EnumC636920OyY("EXIT", 1, "outreach_exit");
        EXIT = enumC636920OyY2;
        EnumC636920OyY[] enumC636920OyYArr = {enumC636920OyY, enumC636920OyY2};
        LLILLJJLI = enumC636920OyYArr;
        LLILLL = new C2254308sP(enumC636920OyYArr);
    }

    public static EnumC636920OyY[] values() {
        return (EnumC636920OyY[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC636920OyY valueOf(String str) {
        return (EnumC636920OyY) C08FF.LIZ(EnumC636920OyY.class, str);
    }

    public EnumC636920OyY(String str, int i, String str2) {
        this.LL = str2;
    }
}
