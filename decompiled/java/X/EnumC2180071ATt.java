package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ATt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2180071ATt {
    public static final EnumC2180071ATt END;
    public static final EnumC2180071ATt EXITING_SHOOT_PAGE;
    public static final EnumC2180071ATt GO_NEXT_PAGE;
    public static final EnumC2180071ATt LIVE_PHOTO_INIT;
    public static final EnumC2180071ATt LIVE_PHOTO_RECORDING;
    public static final EnumC2180071ATt LIVE_PHOTO_SWITCHING;
    public static final EnumC2180071ATt LIVE_PHOTO_TAKING;
    public static final /* synthetic */ EnumC2180071ATt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2180071ATt NORMAL_SHOOT;
    public static final EnumC2180071ATt START;
    public static final EnumC2180071ATt TAKING_PHOTO;

    public static InterfaceC2044707zh<EnumC2180071ATt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2180071ATt enumC2180071ATt = new EnumC2180071ATt("START", 0);
        START = enumC2180071ATt;
        EnumC2180071ATt enumC2180071ATt2 = new EnumC2180071ATt("LIVE_PHOTO_INIT", 1);
        LIVE_PHOTO_INIT = enumC2180071ATt2;
        EnumC2180071ATt enumC2180071ATt3 = new EnumC2180071ATt("NORMAL_SHOOT", 2);
        NORMAL_SHOOT = enumC2180071ATt3;
        EnumC2180071ATt enumC2180071ATt4 = new EnumC2180071ATt("LIVE_PHOTO_SWITCHING", 3);
        LIVE_PHOTO_SWITCHING = enumC2180071ATt4;
        EnumC2180071ATt enumC2180071ATt5 = new EnumC2180071ATt("LIVE_PHOTO_RECORDING", 4);
        LIVE_PHOTO_RECORDING = enumC2180071ATt5;
        EnumC2180071ATt enumC2180071ATt6 = new EnumC2180071ATt("LIVE_PHOTO_TAKING", 5);
        LIVE_PHOTO_TAKING = enumC2180071ATt6;
        EnumC2180071ATt enumC2180071ATt7 = new EnumC2180071ATt("TAKING_PHOTO", 6);
        TAKING_PHOTO = enumC2180071ATt7;
        EnumC2180071ATt enumC2180071ATt8 = new EnumC2180071ATt("GO_NEXT_PAGE", 7);
        GO_NEXT_PAGE = enumC2180071ATt8;
        EnumC2180071ATt enumC2180071ATt9 = new EnumC2180071ATt("EXITING_SHOOT_PAGE", 8);
        EXITING_SHOOT_PAGE = enumC2180071ATt9;
        EnumC2180071ATt enumC2180071ATt10 = new EnumC2180071ATt("END", 9);
        END = enumC2180071ATt10;
        EnumC2180071ATt[] enumC2180071ATtArr = {enumC2180071ATt, enumC2180071ATt2, enumC2180071ATt3, enumC2180071ATt4, enumC2180071ATt5, enumC2180071ATt6, enumC2180071ATt7, enumC2180071ATt8, enumC2180071ATt9, enumC2180071ATt10};
        LL = enumC2180071ATtArr;
        LLILLJJLI = new C2254308sP(enumC2180071ATtArr);
    }

    public static EnumC2180071ATt[] values() {
        return (EnumC2180071ATt[]) LL.clone();
    }

    public static EnumC2180071ATt valueOf(String str) {
        return (EnumC2180071ATt) C08FF.LIZ(EnumC2180071ATt.class, str);
    }

    public EnumC2180071ATt(String str, int i) {
    }
}
