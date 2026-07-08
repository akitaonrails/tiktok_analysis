package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1384370m83 {
    public static final /* synthetic */ EnumC1384370m83[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1384370m83 NONE;
    public static final EnumC1384370m83 PAUSE;
    public static final EnumC1384370m83 PLAY_COMPLETE;
    public static final EnumC1384370m83 PLAY_PROGRESS_UPDATE;
    public static final EnumC1384370m83 PLAY_STOP;
    public static final EnumC1384370m83 SEEK;
    public static final EnumC1384370m83 SPEED_CHANGE;
    public static final EnumC1384370m83 START;

    public static InterfaceC2044707zh<EnumC1384370m83> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1384370m83 enumC1384370m83 = new EnumC1384370m83("NONE", 0);
        NONE = enumC1384370m83;
        EnumC1384370m83 enumC1384370m832 = new EnumC1384370m83("START", 1);
        START = enumC1384370m832;
        EnumC1384370m83 enumC1384370m833 = new EnumC1384370m83("PAUSE", 2);
        PAUSE = enumC1384370m833;
        EnumC1384370m83 enumC1384370m834 = new EnumC1384370m83("PLAY_COMPLETE", 3);
        PLAY_COMPLETE = enumC1384370m834;
        EnumC1384370m83 enumC1384370m835 = new EnumC1384370m83("PLAY_STOP", 4);
        PLAY_STOP = enumC1384370m835;
        EnumC1384370m83 enumC1384370m836 = new EnumC1384370m83("PLAY_PROGRESS_UPDATE", 5);
        PLAY_PROGRESS_UPDATE = enumC1384370m836;
        EnumC1384370m83 enumC1384370m837 = new EnumC1384370m83("SEEK", 6);
        SEEK = enumC1384370m837;
        EnumC1384370m83 enumC1384370m838 = new EnumC1384370m83("SPEED_CHANGE", 7);
        SPEED_CHANGE = enumC1384370m838;
        EnumC1384370m83[] enumC1384370m83Arr = {enumC1384370m83, enumC1384370m832, enumC1384370m833, enumC1384370m834, enumC1384370m835, enumC1384370m836, enumC1384370m837, enumC1384370m838};
        LL = enumC1384370m83Arr;
        LLILLJJLI = new C2254308sP(enumC1384370m83Arr);
    }

    public static EnumC1384370m83[] values() {
        return (EnumC1384370m83[]) LL.clone();
    }

    public static EnumC1384370m83 valueOf(String str) {
        return (EnumC1384370m83) C08FF.LIZ(EnumC1384370m83.class, str);
    }

    public EnumC1384370m83(String str, int i) {
    }
}
