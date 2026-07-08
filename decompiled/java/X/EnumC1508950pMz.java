package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1508950pMz {
    public static final /* synthetic */ EnumC1508950pMz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1508950pMz PLAYER_BUFFERING;
    public static final EnumC1508950pMz PLAYER_IDLE;
    public static final EnumC1508950pMz PLAYER_PAUSE;
    public static final EnumC1508950pMz PLAYER_PREPARE;
    public static final EnumC1508950pMz PLAYER_START;

    public static InterfaceC2044707zh<EnumC1508950pMz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1508950pMz enumC1508950pMz = new EnumC1508950pMz("PLAYER_BUFFERING", 0);
        PLAYER_BUFFERING = enumC1508950pMz;
        EnumC1508950pMz enumC1508950pMz2 = new EnumC1508950pMz("PLAYER_IDLE", 1);
        PLAYER_IDLE = enumC1508950pMz2;
        EnumC1508950pMz enumC1508950pMz3 = new EnumC1508950pMz("PLAYER_PREPARE", 2);
        PLAYER_PREPARE = enumC1508950pMz3;
        EnumC1508950pMz enumC1508950pMz4 = new EnumC1508950pMz("PLAYER_START", 3);
        PLAYER_START = enumC1508950pMz4;
        EnumC1508950pMz enumC1508950pMz5 = new EnumC1508950pMz("PLAYER_PAUSE", 4);
        PLAYER_PAUSE = enumC1508950pMz5;
        EnumC1508950pMz[] enumC1508950pMzArr = {enumC1508950pMz, enumC1508950pMz2, enumC1508950pMz3, enumC1508950pMz4, enumC1508950pMz5};
        LL = enumC1508950pMzArr;
        LLILLJJLI = new C2254308sP(enumC1508950pMzArr);
    }

    public static EnumC1508950pMz[] values() {
        return (EnumC1508950pMz[]) LL.clone();
    }

    public static EnumC1508950pMz valueOf(String str) {
        return (EnumC1508950pMz) C08FF.LIZ(EnumC1508950pMz.class, str);
    }

    public EnumC1508950pMz(String str, int i) {
    }
}
