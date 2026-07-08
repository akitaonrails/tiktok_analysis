package X;

/* JADX INFO: renamed from: X.0bPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972600bPu {
    Normal,
    Obs,
    Media,
    Audio,
    Screen,
    LiveStudio,
    LiveVoice;

    public static final C972610bPv Companion = new Object() { // from class: X.0bPv
    };

    public static EnumC972600bPu valueOf(String str) {
        return (EnumC972600bPu) C08FF.LIZ(EnumC972600bPu.class, str);
    }

    public final EnumC972770bQB into() {
        switch (C972590bPt.LIZ[ordinal()]) {
            case 1:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_NORMAL;
            case 2:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_OBS;
            case 3:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_MEDIA;
            case 4:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_AUDIO;
            case 5:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_SCREEN;
            case 6:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_STUDIO;
            case 7:
                return EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_VOICE;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C972590bPt.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new C1954807lC();
        }
    }
}
