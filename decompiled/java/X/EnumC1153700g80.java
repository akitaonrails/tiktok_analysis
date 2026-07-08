package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153700g80 {
    public static final EnumC1153700g80 CENTER_PIN_STYLE;
    public static final EnumC1153700g80 HOTEL_STYLE;
    public static final /* synthetic */ EnumC1153700g80[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153700g80 POPUP_STYLE;
    public static final EnumC1153700g80 TRANSPORT_STYLE;

    public static InterfaceC2044707zh<EnumC1153700g80> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153700g80 enumC1153700g80 = new EnumC1153700g80("POPUP_STYLE", 0);
        POPUP_STYLE = enumC1153700g80;
        EnumC1153700g80 enumC1153700g802 = new EnumC1153700g80("HOTEL_STYLE", 1);
        HOTEL_STYLE = enumC1153700g802;
        EnumC1153700g80 enumC1153700g803 = new EnumC1153700g80("CENTER_PIN_STYLE", 2);
        CENTER_PIN_STYLE = enumC1153700g803;
        EnumC1153700g80 enumC1153700g804 = new EnumC1153700g80("TRANSPORT_STYLE", 3);
        TRANSPORT_STYLE = enumC1153700g804;
        EnumC1153700g80[] enumC1153700g80Arr = {enumC1153700g80, enumC1153700g802, enumC1153700g803, enumC1153700g804};
        LL = enumC1153700g80Arr;
        LLILLJJLI = new C2254308sP(enumC1153700g80Arr);
    }

    public static EnumC1153700g80[] values() {
        return (EnumC1153700g80[]) LL.clone();
    }

    public static EnumC1153700g80 valueOf(String str) {
        return (EnumC1153700g80) C08FF.LIZ(EnumC1153700g80.class, str);
    }

    public EnumC1153700g80(String str, int i) {
    }
}
