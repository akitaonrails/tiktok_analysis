package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1405140mfY {
    public static final EnumC1405140mfY CALLBACK_TIMEOUT;
    public static final EnumC1405140mfY CANCEL_EXTERNAL;
    public static final EnumC1405140mfY CANCEL_INTERNAL;
    public static final EnumC1405140mfY FAILED;
    public static final /* synthetic */ EnumC1405140mfY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1405140mfY PAUSED;
    public static final EnumC1405140mfY START;
    public static final EnumC1405140mfY SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1405140mfY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1405140mfY enumC1405140mfY = new EnumC1405140mfY("START", 0, "start");
        START = enumC1405140mfY;
        EnumC1405140mfY enumC1405140mfY2 = new EnumC1405140mfY("SUCCESS", 1, "success");
        SUCCESS = enumC1405140mfY2;
        EnumC1405140mfY enumC1405140mfY3 = new EnumC1405140mfY("FAILED", 2, "failed");
        FAILED = enumC1405140mfY3;
        EnumC1405140mfY enumC1405140mfY4 = new EnumC1405140mfY("CANCEL_EXTERNAL", 3, "cancel_external");
        CANCEL_EXTERNAL = enumC1405140mfY4;
        EnumC1405140mfY enumC1405140mfY5 = new EnumC1405140mfY("CANCEL_INTERNAL", 4, "cancel_internal");
        CANCEL_INTERNAL = enumC1405140mfY5;
        EnumC1405140mfY enumC1405140mfY6 = new EnumC1405140mfY("PAUSED", 5, "paused");
        PAUSED = enumC1405140mfY6;
        EnumC1405140mfY enumC1405140mfY7 = new EnumC1405140mfY("CALLBACK_TIMEOUT", 6, "callback_timeout");
        CALLBACK_TIMEOUT = enumC1405140mfY7;
        EnumC1405140mfY[] enumC1405140mfYArr = {enumC1405140mfY, enumC1405140mfY2, enumC1405140mfY3, enumC1405140mfY4, enumC1405140mfY5, enumC1405140mfY6, enumC1405140mfY7};
        LLILLJJLI = enumC1405140mfYArr;
        LLILLL = new C2254308sP(enumC1405140mfYArr);
    }

    public static EnumC1405140mfY[] values() {
        return (EnumC1405140mfY[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1405140mfY valueOf(String str) {
        return (EnumC1405140mfY) C08FF.LIZ(EnumC1405140mfY.class, str);
    }

    public EnumC1405140mfY(String str, int i, String str2) {
        this.LL = str2;
    }
}
