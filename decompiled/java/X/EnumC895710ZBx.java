package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895710ZBx {
    public static final EnumC895710ZBx AUDIO_END;
    public static final EnumC895710ZBx AUDIO_START;
    public static final EnumC895710ZBx FINGER_END;
    public static final EnumC895710ZBx FINGER_ERROR;
    public static final EnumC895710ZBx FINGER_START;
    public static final /* synthetic */ EnumC895710ZBx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC895710ZBx PROCESS_CANCEL;

    public static InterfaceC2044707zh<EnumC895710ZBx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC895710ZBx enumC895710ZBx = new EnumC895710ZBx("AUDIO_START", 0);
        AUDIO_START = enumC895710ZBx;
        EnumC895710ZBx enumC895710ZBx2 = new EnumC895710ZBx("AUDIO_END", 1);
        AUDIO_END = enumC895710ZBx2;
        EnumC895710ZBx enumC895710ZBx3 = new EnumC895710ZBx("FINGER_START", 2);
        FINGER_START = enumC895710ZBx3;
        EnumC895710ZBx enumC895710ZBx4 = new EnumC895710ZBx("FINGER_END", 3);
        FINGER_END = enumC895710ZBx4;
        EnumC895710ZBx enumC895710ZBx5 = new EnumC895710ZBx("FINGER_ERROR", 4);
        FINGER_ERROR = enumC895710ZBx5;
        EnumC895710ZBx enumC895710ZBx6 = new EnumC895710ZBx("PROCESS_CANCEL", 5);
        PROCESS_CANCEL = enumC895710ZBx6;
        EnumC895710ZBx[] enumC895710ZBxArr = {enumC895710ZBx, enumC895710ZBx2, enumC895710ZBx3, enumC895710ZBx4, enumC895710ZBx5, enumC895710ZBx6};
        LL = enumC895710ZBxArr;
        LLILLJJLI = new C2254308sP(enumC895710ZBxArr);
    }

    public static EnumC895710ZBx[] values() {
        return (EnumC895710ZBx[]) LL.clone();
    }

    public static EnumC895710ZBx valueOf(String str) {
        return (EnumC895710ZBx) C08FF.LIZ(EnumC895710ZBx.class, str);
    }

    public EnumC895710ZBx(String str, int i) {
    }
}
