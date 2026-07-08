package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1850200yFO {
    public static final EnumC1850200yFO BANNED;
    public static final EnumC1850200yFO DIRECT_TO_MUSIC_LIST_SHEET;
    public static final EnumC1850200yFO DIRECT_TO_MUSIC_VIDEO_SHEET;
    public static final EnumC1850200yFO DIRECT_TO_SHOOT;
    public static final /* synthetic */ EnumC1850200yFO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1850200yFO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1850200yFO enumC1850200yFO = new EnumC1850200yFO("BANNED", 0);
        BANNED = enumC1850200yFO;
        EnumC1850200yFO enumC1850200yFO2 = new EnumC1850200yFO("DIRECT_TO_SHOOT", 1);
        DIRECT_TO_SHOOT = enumC1850200yFO2;
        EnumC1850200yFO enumC1850200yFO3 = new EnumC1850200yFO("DIRECT_TO_MUSIC_VIDEO_SHEET", 2);
        DIRECT_TO_MUSIC_VIDEO_SHEET = enumC1850200yFO3;
        EnumC1850200yFO enumC1850200yFO4 = new EnumC1850200yFO("DIRECT_TO_MUSIC_LIST_SHEET", 3);
        DIRECT_TO_MUSIC_LIST_SHEET = enumC1850200yFO4;
        EnumC1850200yFO[] enumC1850200yFOArr = {enumC1850200yFO, enumC1850200yFO2, enumC1850200yFO3, enumC1850200yFO4};
        LL = enumC1850200yFOArr;
        LLILLJJLI = new C2254308sP(enumC1850200yFOArr);
    }

    public static EnumC1850200yFO[] values() {
        return (EnumC1850200yFO[]) LL.clone();
    }

    public static EnumC1850200yFO valueOf(String str) {
        return (EnumC1850200yFO) C08FF.LIZ(EnumC1850200yFO.class, str);
    }

    public EnumC1850200yFO(String str, int i) {
    }
}
