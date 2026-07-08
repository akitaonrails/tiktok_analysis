package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC456520HvG {
    public static final EnumC456520HvG CAMERA;
    public static final EnumC456520HvG EMOJI;
    public static final /* synthetic */ EnumC456520HvG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC456520HvG PHOTO;
    public static final EnumC456520HvG SEND;
    public static final EnumC456520HvG VOICE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC456520HvG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC456520HvG enumC456520HvG = new EnumC456520HvG("CAMERA", 0, "camera");
        CAMERA = enumC456520HvG;
        EnumC456520HvG enumC456520HvG2 = new EnumC456520HvG("PHOTO", 1, "photo");
        PHOTO = enumC456520HvG2;
        EnumC456520HvG enumC456520HvG3 = new EnumC456520HvG("EMOJI", 2, "emoji");
        EMOJI = enumC456520HvG3;
        EnumC456520HvG enumC456520HvG4 = new EnumC456520HvG("VOICE", 3, "voice");
        VOICE = enumC456520HvG4;
        EnumC456520HvG enumC456520HvG5 = new EnumC456520HvG("SEND", 4, "send");
        SEND = enumC456520HvG5;
        EnumC456520HvG[] enumC456520HvGArr = {enumC456520HvG, enumC456520HvG2, enumC456520HvG3, enumC456520HvG4, enumC456520HvG5};
        LLILLJJLI = enumC456520HvGArr;
        LLILLL = new C2254308sP(enumC456520HvGArr);
    }

    public static EnumC456520HvG[] values() {
        return (EnumC456520HvG[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC456520HvG valueOf(String str) {
        return (EnumC456520HvG) C08FF.LIZ(EnumC456520HvG.class, str);
    }

    public EnumC456520HvG(String str, int i, String str2) {
        this.LL = str2;
    }
}
