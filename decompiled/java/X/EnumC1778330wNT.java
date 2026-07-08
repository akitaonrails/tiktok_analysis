package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778330wNT {
    public static final EnumC1778330wNT CAMERA_FIRST_FRAME;
    public static final EnumC1778330wNT CLOSE_CAMERA;
    public static final EnumC1778330wNT EFFECT_FIRST_FRAME;
    public static final EnumC1778330wNT ENTER_GAME_BATTLE;
    public static final EnumC1778330wNT ENTER_RECORD;
    public static final /* synthetic */ EnumC1778330wNT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778330wNT OPEN_CAMERA;
    public static final EnumC1778330wNT RECORD_PAGE_EXIT_CLICKED;
    public static final EnumC1778330wNT RECORD_VIDEO;
    public static final EnumC1778330wNT START_PREVIEW;
    public static final EnumC1778330wNT STOP_PREVIEW;

    public static InterfaceC2044707zh<EnumC1778330wNT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778330wNT enumC1778330wNT = new EnumC1778330wNT("ENTER_RECORD", 0);
        ENTER_RECORD = enumC1778330wNT;
        EnumC1778330wNT enumC1778330wNT2 = new EnumC1778330wNT("CAMERA_FIRST_FRAME", 1);
        CAMERA_FIRST_FRAME = enumC1778330wNT2;
        EnumC1778330wNT enumC1778330wNT3 = new EnumC1778330wNT("EFFECT_FIRST_FRAME", 2);
        EFFECT_FIRST_FRAME = enumC1778330wNT3;
        EnumC1778330wNT enumC1778330wNT4 = new EnumC1778330wNT("RECORD_VIDEO", 3);
        RECORD_VIDEO = enumC1778330wNT4;
        EnumC1778330wNT enumC1778330wNT5 = new EnumC1778330wNT("OPEN_CAMERA", 4);
        OPEN_CAMERA = enumC1778330wNT5;
        EnumC1778330wNT enumC1778330wNT6 = new EnumC1778330wNT("CLOSE_CAMERA", 5);
        CLOSE_CAMERA = enumC1778330wNT6;
        EnumC1778330wNT enumC1778330wNT7 = new EnumC1778330wNT("START_PREVIEW", 6);
        START_PREVIEW = enumC1778330wNT7;
        EnumC1778330wNT enumC1778330wNT8 = new EnumC1778330wNT("STOP_PREVIEW", 7);
        STOP_PREVIEW = enumC1778330wNT8;
        EnumC1778330wNT enumC1778330wNT9 = new EnumC1778330wNT("RECORD_PAGE_EXIT_CLICKED", 8);
        RECORD_PAGE_EXIT_CLICKED = enumC1778330wNT9;
        EnumC1778330wNT enumC1778330wNT10 = new EnumC1778330wNT("ENTER_GAME_BATTLE", 9);
        ENTER_GAME_BATTLE = enumC1778330wNT10;
        EnumC1778330wNT[] enumC1778330wNTArr = {enumC1778330wNT, enumC1778330wNT2, enumC1778330wNT3, enumC1778330wNT4, enumC1778330wNT5, enumC1778330wNT6, enumC1778330wNT7, enumC1778330wNT8, enumC1778330wNT9, enumC1778330wNT10};
        LL = enumC1778330wNTArr;
        LLILLJJLI = new C2254308sP(enumC1778330wNTArr);
    }

    public static EnumC1778330wNT[] values() {
        return (EnumC1778330wNT[]) LL.clone();
    }

    public static EnumC1778330wNT valueOf(String str) {
        return (EnumC1778330wNT) C08FF.LIZ(EnumC1778330wNT.class, str);
    }

    public EnumC1778330wNT(String str, int i) {
    }
}
