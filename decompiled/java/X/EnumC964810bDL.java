package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964810bDL {
    public static final EnumC964810bDL FIRST_REMOTE_AUDIO_FRAME;
    public static final EnumC964810bDL FIRST_REMOTE_VIDEO_FRAME;
    public static final /* synthetic */ EnumC964810bDL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC964810bDL RENDER_MODE_SWITCH;
    public static final EnumC964810bDL USER_JOINED;

    public static InterfaceC2044707zh<EnumC964810bDL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC964810bDL enumC964810bDL = new EnumC964810bDL("USER_JOINED", 0);
        USER_JOINED = enumC964810bDL;
        EnumC964810bDL enumC964810bDL2 = new EnumC964810bDL("FIRST_REMOTE_VIDEO_FRAME", 1);
        FIRST_REMOTE_VIDEO_FRAME = enumC964810bDL2;
        EnumC964810bDL enumC964810bDL3 = new EnumC964810bDL("FIRST_REMOTE_AUDIO_FRAME", 2);
        FIRST_REMOTE_AUDIO_FRAME = enumC964810bDL3;
        EnumC964810bDL enumC964810bDL4 = new EnumC964810bDL("RENDER_MODE_SWITCH", 3);
        RENDER_MODE_SWITCH = enumC964810bDL4;
        EnumC964810bDL[] enumC964810bDLArr = {enumC964810bDL, enumC964810bDL2, enumC964810bDL3, enumC964810bDL4};
        LL = enumC964810bDLArr;
        LLILLJJLI = new C2254308sP(enumC964810bDLArr);
    }

    public static EnumC964810bDL[] values() {
        return (EnumC964810bDL[]) LL.clone();
    }

    public static EnumC964810bDL valueOf(String str) {
        return (EnumC964810bDL) C08FF.LIZ(EnumC964810bDL.class, str);
    }

    public EnumC964810bDL(String str, int i) {
    }
}
