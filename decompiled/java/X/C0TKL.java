package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0TKL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKL {
    public static final void LIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_page_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_icon_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "btn_name");
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LIZ();
    }
}
