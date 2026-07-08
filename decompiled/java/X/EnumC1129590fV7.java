package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129590fV7 {
    public static final EnumC1129590fV7 ERROR;
    public static final EnumC1129590fV7 IDLE;
    public static final /* synthetic */ EnumC1129590fV7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1129590fV7 LOADING;
    public static final EnumC1129590fV7 READY;

    public static InterfaceC2044707zh<EnumC1129590fV7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1129590fV7 enumC1129590fV7 = new EnumC1129590fV7("IDLE", 0);
        IDLE = enumC1129590fV7;
        EnumC1129590fV7 enumC1129590fV72 = new EnumC1129590fV7("LOADING", 1);
        LOADING = enumC1129590fV72;
        EnumC1129590fV7 enumC1129590fV73 = new EnumC1129590fV7("READY", 2);
        READY = enumC1129590fV73;
        EnumC1129590fV7 enumC1129590fV74 = new EnumC1129590fV7("ERROR", 3);
        ERROR = enumC1129590fV74;
        EnumC1129590fV7[] enumC1129590fV7Arr = {enumC1129590fV7, enumC1129590fV72, enumC1129590fV73, enumC1129590fV74};
        LL = enumC1129590fV7Arr;
        LLILLJJLI = new C2254308sP(enumC1129590fV7Arr);
    }

    public static EnumC1129590fV7[] values() {
        return (EnumC1129590fV7[]) LL.clone();
    }

    public static EnumC1129590fV7 valueOf(String str) {
        return (EnumC1129590fV7) C08FF.LIZ(EnumC1129590fV7.class, str);
    }

    public EnumC1129590fV7(String str, int i) {
    }
}
