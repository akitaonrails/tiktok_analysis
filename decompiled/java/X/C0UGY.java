package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UGY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UGY {
    public static final C0UGY CAMERA_DISCONNECTED;
    public static final C0UGY END_FRAGMENT;
    public static final C0UGY ENTER_FOREGROUND;
    public static final C0UGY EXIT_DIRECTLY;
    public static final /* synthetic */ C0UGY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0UGY PLAYING_NO_OVER_LAY_PERMISSION;
    public static final C0UGY SCREEN_OFF;

    public static InterfaceC2044707zh<C0UGY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UGY c0ugy = new C0UGY("ENTER_FOREGROUND", 0);
        ENTER_FOREGROUND = c0ugy;
        C0UGY c0ugy2 = new C0UGY("CAMERA_DISCONNECTED", 1);
        CAMERA_DISCONNECTED = c0ugy2;
        C0UGY c0ugy3 = new C0UGY("END_FRAGMENT", 2);
        END_FRAGMENT = c0ugy3;
        C0UGY c0ugy4 = new C0UGY("SCREEN_OFF", 3);
        SCREEN_OFF = c0ugy4;
        C0UGY c0ugy5 = new C0UGY("EXIT_DIRECTLY", 4);
        EXIT_DIRECTLY = c0ugy5;
        C0UGY c0ugy6 = new C0UGY("PLAYING_NO_OVER_LAY_PERMISSION", 5);
        PLAYING_NO_OVER_LAY_PERMISSION = c0ugy6;
        C0UGY[] c0ugyArr = {c0ugy, c0ugy2, c0ugy3, c0ugy4, c0ugy5, c0ugy6};
        LL = c0ugyArr;
        LLILLJJLI = new C2254308sP(c0ugyArr);
    }

    public static C0UGY[] values() {
        return (C0UGY[]) LL.clone();
    }

    public static C0UGY valueOf(String str) {
        return (C0UGY) C08FF.LIZ(C0UGY.class, str);
    }

    public C0UGY(String str, int i) {
    }
}
