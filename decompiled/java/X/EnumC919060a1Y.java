package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919060a1Y {
    public static final EnumC919060a1Y E_C_DEFAULT;
    public static final EnumC919060a1Y E_C_GUEST_REJECT_ZOOM;
    public static final EnumC919060a1Y E_C_HTTP_ERROR;
    public static final EnumC919060a1Y E_C_LAYOUT_EMPTY;
    public static final EnumC919060a1Y E_C_ROOM_EMPTY;
    public static final /* synthetic */ EnumC919060a1Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC919060a1Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919060a1Y enumC919060a1Y = new EnumC919060a1Y("E_C_DEFAULT", 0);
        E_C_DEFAULT = enumC919060a1Y;
        EnumC919060a1Y enumC919060a1Y2 = new EnumC919060a1Y("E_C_GUEST_REJECT_ZOOM", 1);
        E_C_GUEST_REJECT_ZOOM = enumC919060a1Y2;
        EnumC919060a1Y enumC919060a1Y3 = new EnumC919060a1Y("E_C_LAYOUT_EMPTY", 2);
        E_C_LAYOUT_EMPTY = enumC919060a1Y3;
        EnumC919060a1Y enumC919060a1Y4 = new EnumC919060a1Y("E_C_ROOM_EMPTY", 3);
        E_C_ROOM_EMPTY = enumC919060a1Y4;
        EnumC919060a1Y enumC919060a1Y5 = new EnumC919060a1Y("E_C_HTTP_ERROR", 4);
        E_C_HTTP_ERROR = enumC919060a1Y5;
        EnumC919060a1Y[] enumC919060a1YArr = {enumC919060a1Y, enumC919060a1Y2, enumC919060a1Y3, enumC919060a1Y4, enumC919060a1Y5};
        LL = enumC919060a1YArr;
        LLILLJJLI = new C2254308sP(enumC919060a1YArr);
    }

    public static EnumC919060a1Y[] values() {
        return (EnumC919060a1Y[]) LL.clone();
    }

    public static EnumC919060a1Y valueOf(String str) {
        return (EnumC919060a1Y) C08FF.LIZ(EnumC919060a1Y.class, str);
    }

    public EnumC919060a1Y(String str, int i) {
    }
}
