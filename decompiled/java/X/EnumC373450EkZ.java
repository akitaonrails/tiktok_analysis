package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373450EkZ {
    public static final EnumC373450EkZ FULL_SCREEN;
    public static final EnumC373450EkZ KEY_FRAME;
    public static final /* synthetic */ EnumC373450EkZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373450EkZ PLAY_PAUSE;
    public static final EnumC373450EkZ REDO;
    public static final EnumC373450EkZ TIME_PROGRESS;
    public static final EnumC373450EkZ UNDO;

    public static InterfaceC2044707zh<EnumC373450EkZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373450EkZ enumC373450EkZ = new EnumC373450EkZ("TIME_PROGRESS", 0);
        TIME_PROGRESS = enumC373450EkZ;
        EnumC373450EkZ enumC373450EkZ2 = new EnumC373450EkZ("PLAY_PAUSE", 1);
        PLAY_PAUSE = enumC373450EkZ2;
        EnumC373450EkZ enumC373450EkZ3 = new EnumC373450EkZ("KEY_FRAME", 2);
        KEY_FRAME = enumC373450EkZ3;
        EnumC373450EkZ enumC373450EkZ4 = new EnumC373450EkZ("UNDO", 3);
        UNDO = enumC373450EkZ4;
        EnumC373450EkZ enumC373450EkZ5 = new EnumC373450EkZ("REDO", 4);
        REDO = enumC373450EkZ5;
        EnumC373450EkZ enumC373450EkZ6 = new EnumC373450EkZ("FULL_SCREEN", 5);
        FULL_SCREEN = enumC373450EkZ6;
        EnumC373450EkZ[] enumC373450EkZArr = {enumC373450EkZ, enumC373450EkZ2, enumC373450EkZ3, enumC373450EkZ4, enumC373450EkZ5, enumC373450EkZ6};
        LL = enumC373450EkZArr;
        LLILLJJLI = new C2254308sP(enumC373450EkZArr);
    }

    public static EnumC373450EkZ[] values() {
        return (EnumC373450EkZ[]) LL.clone();
    }

    public static EnumC373450EkZ valueOf(String str) {
        return (EnumC373450EkZ) C08FF.LIZ(EnumC373450EkZ.class, str);
    }

    public EnumC373450EkZ(String str, int i) {
    }
}
