package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1684470tw5 {
    public static final EnumC1684470tw5 DONE;
    public static final EnumC1684470tw5 FRONT;
    public static final EnumC1684470tw5 FRONT_CAPTURE;
    public static final EnumC1684470tw5 FRONT_COUNTDOWN;
    public static final EnumC1684470tw5 INIT;
    public static final /* synthetic */ EnumC1684470tw5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1684470tw5 NO_CAMERA_PERMISSION;
    public static final EnumC1684470tw5 TAP_TO_START;

    public static InterfaceC2044707zh<EnumC1684470tw5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1684470tw5 enumC1684470tw5 = new EnumC1684470tw5("INIT", 0);
        INIT = enumC1684470tw5;
        EnumC1684470tw5 enumC1684470tw52 = new EnumC1684470tw5("NO_CAMERA_PERMISSION", 1);
        NO_CAMERA_PERMISSION = enumC1684470tw52;
        EnumC1684470tw5 enumC1684470tw53 = new EnumC1684470tw5("TAP_TO_START", 2);
        TAP_TO_START = enumC1684470tw53;
        EnumC1684470tw5 enumC1684470tw54 = new EnumC1684470tw5("FRONT", 3);
        FRONT = enumC1684470tw54;
        EnumC1684470tw5 enumC1684470tw55 = new EnumC1684470tw5("FRONT_COUNTDOWN", 4);
        FRONT_COUNTDOWN = enumC1684470tw55;
        EnumC1684470tw5 enumC1684470tw56 = new EnumC1684470tw5("FRONT_CAPTURE", 5);
        FRONT_CAPTURE = enumC1684470tw56;
        EnumC1684470tw5 enumC1684470tw57 = new EnumC1684470tw5("DONE", 6);
        DONE = enumC1684470tw57;
        EnumC1684470tw5[] enumC1684470tw5Arr = {enumC1684470tw5, enumC1684470tw52, enumC1684470tw53, enumC1684470tw54, enumC1684470tw55, enumC1684470tw56, enumC1684470tw57};
        LL = enumC1684470tw5Arr;
        LLILLJJLI = new C2254308sP(enumC1684470tw5Arr);
    }

    public static EnumC1684470tw5[] values() {
        return (EnumC1684470tw5[]) LL.clone();
    }

    public static EnumC1684470tw5 valueOf(String str) {
        return (EnumC1684470tw5) C08FF.LIZ(EnumC1684470tw5.class, str);
    }

    public EnumC1684470tw5(String str, int i) {
    }
}
