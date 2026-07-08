package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ByD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2222191ByD {
    public static final EnumC2222191ByD HTTP;
    public static final /* synthetic */ EnumC2222191ByD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2222191ByD WS_CONNECTED;
    public static final EnumC2222191ByD WS_CONNECTING;

    public static InterfaceC2044707zh<EnumC2222191ByD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2222191ByD enumC2222191ByD = new EnumC2222191ByD("HTTP", 0);
        HTTP = enumC2222191ByD;
        EnumC2222191ByD enumC2222191ByD2 = new EnumC2222191ByD("WS_CONNECTING", 1);
        WS_CONNECTING = enumC2222191ByD2;
        EnumC2222191ByD enumC2222191ByD3 = new EnumC2222191ByD("WS_CONNECTED", 2);
        WS_CONNECTED = enumC2222191ByD3;
        EnumC2222191ByD[] enumC2222191ByDArr = {enumC2222191ByD, enumC2222191ByD2, enumC2222191ByD3};
        LL = enumC2222191ByDArr;
        LLILLJJLI = new C2254308sP(enumC2222191ByDArr);
    }

    public static EnumC2222191ByD[] values() {
        return (EnumC2222191ByD[]) LL.clone();
    }

    public static EnumC2222191ByD valueOf(String str) {
        return (EnumC2222191ByD) C08FF.LIZ(EnumC2222191ByD.class, str);
    }

    public EnumC2222191ByD(String str, int i) {
    }
}
