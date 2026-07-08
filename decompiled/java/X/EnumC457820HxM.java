package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC457820HxM {
    public static final /* synthetic */ EnumC457820HxM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC457820HxM SLOT_INPUT_AREA;
    public static final EnumC457820HxM SLOT_INPUT_FIELD;
    public static final EnumC457820HxM SLOT_INPUT_LEFT_AREA;
    public static final EnumC457820HxM SLOT_INPUT_RIGHT_AREA;
    public static final EnumC457820HxM SLOT_LEFT_AREA;
    public static final EnumC457820HxM SLOT_PANEL;
    public static final EnumC457820HxM SLOT_REPLY_LAYOUT;
    public static final EnumC457820HxM SLOT_RIGHT_AREA;
    public static final EnumC457820HxM SLOT_TOP_AREA;

    public static InterfaceC2044707zh<EnumC457820HxM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC457820HxM enumC457820HxM = new EnumC457820HxM("SLOT_RIGHT_AREA", 0);
        SLOT_RIGHT_AREA = enumC457820HxM;
        EnumC457820HxM enumC457820HxM2 = new EnumC457820HxM("SLOT_LEFT_AREA", 1);
        SLOT_LEFT_AREA = enumC457820HxM2;
        EnumC457820HxM enumC457820HxM3 = new EnumC457820HxM("SLOT_TOP_AREA", 2);
        SLOT_TOP_AREA = enumC457820HxM3;
        EnumC457820HxM enumC457820HxM4 = new EnumC457820HxM("SLOT_INPUT_LEFT_AREA", 3);
        SLOT_INPUT_LEFT_AREA = enumC457820HxM4;
        EnumC457820HxM enumC457820HxM5 = new EnumC457820HxM("SLOT_INPUT_RIGHT_AREA", 4);
        SLOT_INPUT_RIGHT_AREA = enumC457820HxM5;
        EnumC457820HxM enumC457820HxM6 = new EnumC457820HxM("SLOT_INPUT_FIELD", 5);
        SLOT_INPUT_FIELD = enumC457820HxM6;
        EnumC457820HxM enumC457820HxM7 = new EnumC457820HxM("SLOT_REPLY_LAYOUT", 6);
        SLOT_REPLY_LAYOUT = enumC457820HxM7;
        EnumC457820HxM enumC457820HxM8 = new EnumC457820HxM("SLOT_PANEL", 7);
        SLOT_PANEL = enumC457820HxM8;
        EnumC457820HxM enumC457820HxM9 = new EnumC457820HxM("SLOT_INPUT_AREA", 8);
        SLOT_INPUT_AREA = enumC457820HxM9;
        EnumC457820HxM[] enumC457820HxMArr = {enumC457820HxM, enumC457820HxM2, enumC457820HxM3, enumC457820HxM4, enumC457820HxM5, enumC457820HxM6, enumC457820HxM7, enumC457820HxM8, enumC457820HxM9};
        LL = enumC457820HxMArr;
        LLILLJJLI = new C2254308sP(enumC457820HxMArr);
    }

    public static EnumC457820HxM[] values() {
        return (EnumC457820HxM[]) LL.clone();
    }

    public static EnumC457820HxM valueOf(String str) {
        return (EnumC457820HxM) C08FF.LIZ(EnumC457820HxM.class, str);
    }

    public EnumC457820HxM(String str, int i) {
    }
}
