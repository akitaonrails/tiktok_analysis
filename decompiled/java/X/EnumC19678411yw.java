package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19678411yw {
    public static final EnumC19678411yw CHANGE_COLOR;
    public static final EnumC19678411yw ERASER;
    public static final EnumC19678411yw HIGHLIGHT_BRUSH;
    public static final /* synthetic */ EnumC19678411yw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19678411yw NORMAL_BRUSH;
    public static final EnumC19678411yw NULL;

    public static InterfaceC2044707zh<EnumC19678411yw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19678411yw enumC19678411yw = new EnumC19678411yw("NULL", 0);
        NULL = enumC19678411yw;
        EnumC19678411yw enumC19678411yw2 = new EnumC19678411yw("NORMAL_BRUSH", 1);
        NORMAL_BRUSH = enumC19678411yw2;
        EnumC19678411yw enumC19678411yw3 = new EnumC19678411yw("HIGHLIGHT_BRUSH", 2);
        HIGHLIGHT_BRUSH = enumC19678411yw3;
        EnumC19678411yw enumC19678411yw4 = new EnumC19678411yw("ERASER", 3);
        ERASER = enumC19678411yw4;
        EnumC19678411yw enumC19678411yw5 = new EnumC19678411yw("CHANGE_COLOR", 4);
        CHANGE_COLOR = enumC19678411yw5;
        EnumC19678411yw[] enumC19678411ywArr = {enumC19678411yw, enumC19678411yw2, enumC19678411yw3, enumC19678411yw4, enumC19678411yw5};
        LL = enumC19678411ywArr;
        LLILLJJLI = new C2254308sP(enumC19678411ywArr);
    }

    public static EnumC19678411yw[] values() {
        return (EnumC19678411yw[]) LL.clone();
    }

    public static EnumC19678411yw valueOf(String str) {
        return (EnumC19678411yw) C08FF.LIZ(EnumC19678411yw.class, str);
    }

    public EnumC19678411yw(String str, int i) {
    }
}
