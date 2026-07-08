package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2176021AEe {
    public static final EnumC2176021AEe APP_BACKGROUND;
    public static final EnumC2176021AEe ENTER_INNER_LIVE;
    public static final EnumC2176021AEe EXPLICIT_STOP;
    public static final /* synthetic */ EnumC2176021AEe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2176021AEe NO_PLAYABLE;
    public static final EnumC2176021AEe PLAY_SELECTION;
    public static final EnumC2176021AEe RELEASE;
    public static final EnumC2176021AEe TAB_UNSELECTED;
    public static final EnumC2176021AEe TYPE_SWITCH;
    public static final EnumC2176021AEe VIEW_DESTROY;
    public static final EnumC2176021AEe VIEW_DETACH;

    public static InterfaceC2044707zh<EnumC2176021AEe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2176021AEe enumC2176021AEe = new EnumC2176021AEe("PLAY_SELECTION", 0);
        PLAY_SELECTION = enumC2176021AEe;
        EnumC2176021AEe enumC2176021AEe2 = new EnumC2176021AEe("NO_PLAYABLE", 1);
        NO_PLAYABLE = enumC2176021AEe2;
        EnumC2176021AEe enumC2176021AEe3 = new EnumC2176021AEe("TYPE_SWITCH", 2);
        TYPE_SWITCH = enumC2176021AEe3;
        EnumC2176021AEe enumC2176021AEe4 = new EnumC2176021AEe("APP_BACKGROUND", 3);
        APP_BACKGROUND = enumC2176021AEe4;
        EnumC2176021AEe enumC2176021AEe5 = new EnumC2176021AEe("TAB_UNSELECTED", 4);
        TAB_UNSELECTED = enumC2176021AEe5;
        EnumC2176021AEe enumC2176021AEe6 = new EnumC2176021AEe("ENTER_INNER_LIVE", 5);
        ENTER_INNER_LIVE = enumC2176021AEe6;
        EnumC2176021AEe enumC2176021AEe7 = new EnumC2176021AEe("VIEW_DETACH", 6);
        VIEW_DETACH = enumC2176021AEe7;
        EnumC2176021AEe enumC2176021AEe8 = new EnumC2176021AEe("VIEW_DESTROY", 7);
        VIEW_DESTROY = enumC2176021AEe8;
        EnumC2176021AEe enumC2176021AEe9 = new EnumC2176021AEe("EXPLICIT_STOP", 8);
        EXPLICIT_STOP = enumC2176021AEe9;
        EnumC2176021AEe enumC2176021AEe10 = new EnumC2176021AEe("RELEASE", 9);
        RELEASE = enumC2176021AEe10;
        EnumC2176021AEe[] enumC2176021AEeArr = {enumC2176021AEe, enumC2176021AEe2, enumC2176021AEe3, enumC2176021AEe4, enumC2176021AEe5, enumC2176021AEe6, enumC2176021AEe7, enumC2176021AEe8, enumC2176021AEe9, enumC2176021AEe10};
        LL = enumC2176021AEeArr;
        LLILLJJLI = new C2254308sP(enumC2176021AEeArr);
    }

    public static EnumC2176021AEe[] values() {
        return (EnumC2176021AEe[]) LL.clone();
    }

    public static EnumC2176021AEe valueOf(String str) {
        return (EnumC2176021AEe) C08FF.LIZ(EnumC2176021AEe.class, str);
    }

    public EnumC2176021AEe(String str, int i) {
    }
}
