package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.0oTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1474440oTK {
    PLAY(101),
    PAUSE(102),
    RELEASE(103),
    SEEK(104),
    UPDATE_PROGRESS(201),
    VIDEO_SIZE_CHANGED(202),
    INIT_PLAY(203),
    PLAY_START(204),
    FETCH_VIDEO_MODEL(205),
    PREPARE(206),
    PREPARED(207),
    RENDER_START(208),
    VIDEO_PLAY(209),
    VIDEO_PAUSE(210),
    PLAYBACK_STATE_CHANGED(211),
    LOAD_STATE_CHANGED(212),
    BUFFER_START(213),
    BUFFER_COUNT(214),
    BUFFERING_UPDATE(215),
    BUFFER_END(216),
    STREAM_CHANGED(217),
    VIDEO_PRE_COMPLETED(218),
    VIDEO_COMPLETED(219),
    VIDEO_PRE_RELEASE(220),
    VIDEO_RELEASED(221),
    ERROR(222),
    RESOLUTION_CHANGED(223),
    PRE_FULLSCREEN(224),
    FULLSCREEN(225),
    INTERCEPT_FULLSCREEN(226),
    EXEC_COMMAND(227),
    VIDEO_STATUS_EXCEPTION(228),
    PRE_VIDEO_SEEK(229),
    SEEK_START(230),
    SEEK_COMPLETE(231),
    RENDER_SEEK_COMPLETE(232),
    REPLAY(233),
    RETRY(234),
    STREAM_BITRATE_CHANGED(235),
    UPDATE_VIDEO_SIZE(301),
    VIDEO_THREAD_QUIT(302);

    public static final SparseArray<EnumC1474440oTK> LLILLJJLI = new SparseArray<>();
    public final int LL;

    public static void LIZJ() {
        if (LLILLJJLI.size() <= 0) {
            for (EnumC1474440oTK enumC1474440oTK : values()) {
                LLILLJJLI.put(enumC1474440oTK.LL, enumC1474440oTK);
            }
        }
    }

    public int getWhat() {
        LIZJ();
        return this.LL;
    }

    public static EnumC1474440oTK getMsg(int i) {
        LIZJ();
        return LLILLJJLI.get(i);
    }

    public static EnumC1474440oTK valueOf(String str) {
        return (EnumC1474440oTK) C08FF.LIZ(EnumC1474440oTK.class, str);
    }

    EnumC1474440oTK(int i) {
        this.LL = i;
    }
}
