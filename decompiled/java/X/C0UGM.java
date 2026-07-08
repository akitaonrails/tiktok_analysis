package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectInitSuccessChannel;

/* JADX INFO: renamed from: X.0UGM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UGM implements C0UGO {
    public final /* synthetic */ VideoWidget LIZ;

    public C0UGM(VideoWidget videoWidget) {
        this.LIZ = videoWidget;
    }

    @Override // X.C0UGO
    public final void onError(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraState onError status: ");
        sbLIZ.append(i);
        sbLIZ.append(", ret: ");
        sbLIZ.append(i2);
        sbLIZ.append(", msg: ");
        sbLIZ.append((String) null);
        C20441214yg.LJ("VideoWidget", C2188811AlT.LIZIZ(sbLIZ));
        C0UGO c0ugo = this.LIZ.LLIZLLLIL;
        if (c0ugo != null) {
            c0ugo.onError(i, i2);
        }
    }

    @Override // X.C0UGO
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1 && !this.LIZ.LLJL) {
            C20441214yg.LIZIZ("VideoWidget", "VideoWidget onInfo EFFECT_INIT_SUCCESS");
            this.LIZ.dataChannel.zW(MultiLetsDanceEffectInitSuccessChannel.class, Boolean.TRUE);
            VideoWidget videoWidget = this.LIZ;
            videoWidget.LLJL = true;
            videoWidget.LLJJIJIL.post(new ARunnableS112S0100000_12(this, 377));
        }
        C0UGO c0ugo = this.LIZ.LLIZLLLIL;
        if (c0ugo != null) {
            c0ugo.onInfo(i, i2, i3, str);
        }
    }
}
