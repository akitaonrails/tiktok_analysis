package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620100OTw {
    public static final /* synthetic */ EnumC620100OTw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC620100OTw LOAD_URL;
    public static final EnumC620100OTw UPDATE_DATA;

    public static InterfaceC2044707zh<EnumC620100OTw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC620100OTw enumC620100OTw = new EnumC620100OTw("LOAD_URL", 0);
        LOAD_URL = enumC620100OTw;
        EnumC620100OTw enumC620100OTw2 = new EnumC620100OTw("UPDATE_DATA", 1);
        UPDATE_DATA = enumC620100OTw2;
        EnumC620100OTw[] enumC620100OTwArr = {enumC620100OTw, enumC620100OTw2};
        LL = enumC620100OTwArr;
        LLILLJJLI = new C2254308sP(enumC620100OTwArr);
    }

    public static EnumC620100OTw[] values() {
        return (EnumC620100OTw[]) LL.clone();
    }

    public static EnumC620100OTw valueOf(String str) {
        return (EnumC620100OTw) C08FF.LIZ(EnumC620100OTw.class, str);
    }

    public EnumC620100OTw(String str, int i) {
    }
}
