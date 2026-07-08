package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1508940pMy {
    public static final /* synthetic */ EnumC1508940pMy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1508940pMy PLAYER_BUFFERING;
    public static final EnumC1508940pMy PLAYER_IDLE;
    public static final EnumC1508940pMy PLAYER_PAUSE;
    public static final EnumC1508940pMy PLAYER_PREPARE;
    public static final EnumC1508940pMy PLAYER_START;

    public static InterfaceC2044707zh<EnumC1508940pMy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1508940pMy enumC1508940pMy = new EnumC1508940pMy("PLAYER_BUFFERING", 0);
        PLAYER_BUFFERING = enumC1508940pMy;
        EnumC1508940pMy enumC1508940pMy2 = new EnumC1508940pMy("PLAYER_IDLE", 1);
        PLAYER_IDLE = enumC1508940pMy2;
        EnumC1508940pMy enumC1508940pMy3 = new EnumC1508940pMy("PLAYER_PREPARE", 2);
        PLAYER_PREPARE = enumC1508940pMy3;
        EnumC1508940pMy enumC1508940pMy4 = new EnumC1508940pMy("PLAYER_START", 3);
        PLAYER_START = enumC1508940pMy4;
        EnumC1508940pMy enumC1508940pMy5 = new EnumC1508940pMy("PLAYER_PAUSE", 4);
        PLAYER_PAUSE = enumC1508940pMy5;
        EnumC1508940pMy[] enumC1508940pMyArr = {enumC1508940pMy, enumC1508940pMy2, enumC1508940pMy3, enumC1508940pMy4, enumC1508940pMy5};
        LL = enumC1508940pMyArr;
        LLILLJJLI = new C2254308sP(enumC1508940pMyArr);
    }

    public static EnumC1508940pMy[] values() {
        return (EnumC1508940pMy[]) LL.clone();
    }

    public static EnumC1508940pMy valueOf(String str) {
        return (EnumC1508940pMy) C08FF.LIZ(EnumC1508940pMy.class, str);
    }

    public EnumC1508940pMy(String str, int i) {
    }
}
