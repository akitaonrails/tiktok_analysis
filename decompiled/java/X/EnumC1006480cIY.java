package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006480cIY {
    public static final EnumC1006480cIY FAILED;
    public static final EnumC1006480cIY FP_READY;
    public static final EnumC1006480cIY IDLE;
    public static final /* synthetic */ EnumC1006480cIY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1006480cIY LOADING;
    public static final EnumC1006480cIY LOAD_COMPLETE;
    public static final EnumC1006480cIY RELEASED;

    public static InterfaceC2044707zh<EnumC1006480cIY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1006480cIY enumC1006480cIY = new EnumC1006480cIY("IDLE", 0);
        IDLE = enumC1006480cIY;
        EnumC1006480cIY enumC1006480cIY2 = new EnumC1006480cIY("LOADING", 1);
        LOADING = enumC1006480cIY2;
        EnumC1006480cIY enumC1006480cIY3 = new EnumC1006480cIY("LOAD_COMPLETE", 2);
        LOAD_COMPLETE = enumC1006480cIY3;
        EnumC1006480cIY enumC1006480cIY4 = new EnumC1006480cIY("FP_READY", 3);
        FP_READY = enumC1006480cIY4;
        EnumC1006480cIY enumC1006480cIY5 = new EnumC1006480cIY("FAILED", 4);
        FAILED = enumC1006480cIY5;
        EnumC1006480cIY enumC1006480cIY6 = new EnumC1006480cIY("RELEASED", 5);
        RELEASED = enumC1006480cIY6;
        EnumC1006480cIY[] enumC1006480cIYArr = {enumC1006480cIY, enumC1006480cIY2, enumC1006480cIY3, enumC1006480cIY4, enumC1006480cIY5, enumC1006480cIY6};
        LL = enumC1006480cIYArr;
        LLILLJJLI = new C2254308sP(enumC1006480cIYArr);
    }

    public static EnumC1006480cIY[] values() {
        return (EnumC1006480cIY[]) LL.clone();
    }

    public static EnumC1006480cIY valueOf(String str) {
        return (EnumC1006480cIY) C08FF.LIZ(EnumC1006480cIY.class, str);
    }

    public EnumC1006480cIY(String str, int i) {
    }
}
