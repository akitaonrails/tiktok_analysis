package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC754620Tiu {
    public static final EnumC754620Tiu GAME;
    public static final EnumC754620Tiu LIVE_PREVIEW;
    public static final /* synthetic */ EnumC754620Tiu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC754620Tiu OBS;
    public static final EnumC754620Tiu VIDEO;
    public static final EnumC754620Tiu VOICE;

    public static InterfaceC2044707zh<EnumC754620Tiu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC754620Tiu enumC754620Tiu = new EnumC754620Tiu("LIVE_PREVIEW", 0);
        LIVE_PREVIEW = enumC754620Tiu;
        EnumC754620Tiu enumC754620Tiu2 = new EnumC754620Tiu("VIDEO", 1);
        VIDEO = enumC754620Tiu2;
        EnumC754620Tiu enumC754620Tiu3 = new EnumC754620Tiu("GAME", 2);
        GAME = enumC754620Tiu3;
        EnumC754620Tiu enumC754620Tiu4 = new EnumC754620Tiu("VOICE", 3);
        VOICE = enumC754620Tiu4;
        EnumC754620Tiu enumC754620Tiu5 = new EnumC754620Tiu("OBS", 4);
        OBS = enumC754620Tiu5;
        EnumC754620Tiu[] enumC754620TiuArr = {enumC754620Tiu, enumC754620Tiu2, enumC754620Tiu3, enumC754620Tiu4, enumC754620Tiu5};
        LL = enumC754620TiuArr;
        LLILLJJLI = new C2254308sP(enumC754620TiuArr);
    }

    public static EnumC754620Tiu[] values() {
        return (EnumC754620Tiu[]) LL.clone();
    }

    public static EnumC754620Tiu valueOf(String str) {
        return (EnumC754620Tiu) C08FF.LIZ(EnumC754620Tiu.class, str);
    }

    public EnumC754620Tiu(String str, int i) {
    }
}
