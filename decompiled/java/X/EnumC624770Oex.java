package X;

import java.util.Collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624770Oex {
    public static final C624890Of9 Companion;
    public static final EnumC624770Oex DOWNLOADED;
    public static final EnumC624770Oex DOWNLOADING;
    public static final /* synthetic */ EnumC624770Oex[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624770Oex PAUSE_NOT_WIFI;
    public static final EnumC624770Oex PAUSE_NO_NETWORK;
    public static final EnumC624770Oex PAUSE_STORAGE;
    public static final EnumC624770Oex UNINITIALIZED;
    public static final EnumC624770Oex USER_PAUSE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC624770Oex> getEntries() {
        return LLILLL;
    }

    public final boolean canResume() {
        return C1697810uHb.LJIIJJI(USER_PAUSE, PAUSE_NOT_WIFI, PAUSE_NO_NETWORK).contains(this);
    }

    public final boolean isPauseByNet() {
        return C1697810uHb.LJIIJJI(PAUSE_NOT_WIFI, PAUSE_NO_NETWORK).contains(this);
    }

    static {
        EnumC624770Oex enumC624770Oex = new EnumC624770Oex("UNINITIALIZED", 0, -1);
        UNINITIALIZED = enumC624770Oex;
        EnumC624770Oex enumC624770Oex2 = new EnumC624770Oex("USER_PAUSE", 1, 0);
        USER_PAUSE = enumC624770Oex2;
        EnumC624770Oex enumC624770Oex3 = new EnumC624770Oex("DOWNLOADING", 2, 1);
        DOWNLOADING = enumC624770Oex3;
        EnumC624770Oex enumC624770Oex4 = new EnumC624770Oex("PAUSE_NO_NETWORK", 3, 2);
        PAUSE_NO_NETWORK = enumC624770Oex4;
        EnumC624770Oex enumC624770Oex5 = new EnumC624770Oex("PAUSE_NOT_WIFI", 4, 3);
        PAUSE_NOT_WIFI = enumC624770Oex5;
        EnumC624770Oex enumC624770Oex6 = new EnumC624770Oex("PAUSE_STORAGE", 5, 4);
        PAUSE_STORAGE = enumC624770Oex6;
        EnumC624770Oex enumC624770Oex7 = new EnumC624770Oex("DOWNLOADED", 6, 5);
        DOWNLOADED = enumC624770Oex7;
        EnumC624770Oex[] enumC624770OexArr = {enumC624770Oex, enumC624770Oex2, enumC624770Oex3, enumC624770Oex4, enumC624770Oex5, enumC624770Oex6, enumC624770Oex7};
        LLILLJJLI = enumC624770OexArr;
        LLILLL = new C2254308sP(enumC624770OexArr);
        Companion = new C624890Of9();
    }

    public static EnumC624770Oex[] values() {
        return (EnumC624770Oex[]) LLILLJJLI.clone();
    }

    public final boolean isDownloaded() {
        return this == DOWNLOADED;
    }

    public final boolean isDownloading() {
        return this == DOWNLOADING;
    }

    public final boolean isPauseByError() {
        return Collections.singletonList(PAUSE_STORAGE).contains(this);
    }

    public final boolean isUninitialized() {
        return this == UNINITIALIZED;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC624770Oex valueOf(String str) {
        return (EnumC624770Oex) C08FF.LIZ(EnumC624770Oex.class, str);
    }

    public final String toOfflineModePanelStatus(boolean z) {
        switch (C624860Of6.LIZ[ordinal()]) {
            case 1:
                return "not_enabled";
            case 2:
                return "downloading";
            case 3:
                return "download_paused";
            case 4:
            case 5:
                if (!z) {
                    return "download_paused";
                }
                return "download_pending";
            case 6:
                return "download_exceptional_states";
            case 7:
                return "download_completed";
            default:
                throw new C1954807lC();
        }
    }

    public EnumC624770Oex(String str, int i, int i2) {
        this.LL = i2;
    }
}
