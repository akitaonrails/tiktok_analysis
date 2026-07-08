package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ByC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2222181ByC {
    public static final EnumC2222181ByC HTTP;
    public static final /* synthetic */ EnumC2222181ByC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2222181ByC WS_CONNECTED;
    public static final EnumC2222181ByC WS_CONNECTED_AND_ENTER_ROOM_RESP;
    public static final EnumC2222181ByC WS_CONNECTING;

    public static InterfaceC2044707zh<EnumC2222181ByC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2222181ByC enumC2222181ByC = new EnumC2222181ByC("HTTP", 0);
        HTTP = enumC2222181ByC;
        EnumC2222181ByC enumC2222181ByC2 = new EnumC2222181ByC("WS_CONNECTING", 1);
        WS_CONNECTING = enumC2222181ByC2;
        EnumC2222181ByC enumC2222181ByC3 = new EnumC2222181ByC("WS_CONNECTED", 2);
        WS_CONNECTED = enumC2222181ByC3;
        EnumC2222181ByC enumC2222181ByC4 = new EnumC2222181ByC("WS_CONNECTED_AND_ENTER_ROOM_RESP", 3);
        WS_CONNECTED_AND_ENTER_ROOM_RESP = enumC2222181ByC4;
        EnumC2222181ByC[] enumC2222181ByCArr = {enumC2222181ByC, enumC2222181ByC2, enumC2222181ByC3, enumC2222181ByC4};
        LL = enumC2222181ByCArr;
        LLILLJJLI = new C2254308sP(enumC2222181ByCArr);
    }

    public static EnumC2222181ByC[] values() {
        return (EnumC2222181ByC[]) LL.clone();
    }

    public static EnumC2222181ByC valueOf(String str) {
        return (EnumC2222181ByC) C08FF.LIZ(EnumC2222181ByC.class, str);
    }

    public EnumC2222181ByC(String str, int i) {
    }
}
