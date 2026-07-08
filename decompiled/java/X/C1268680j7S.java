package X;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;

/* JADX INFO: renamed from: X.0j7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1268680j7S extends C1268850j7j {
    public final /* synthetic */ ViewOnTouchListenerC1268840j7i LLJ;

    @Override // X.C1268850j7j
    public final void LJ() {
        C1267590j5h c1267590j5h = this.LLJ.LL;
        if (c1267590j5h != null) {
            c1267590j5h.LL = false;
            c1267590j5h.setEnable(true);
        }
    }

    @Override // X.C1268850j7j, X.InterfaceC1268960j7u
    public final void LIZ(VideoFrame videoFrame) {
        C1272880jEE c1272880jEE;
        VideoMixer.VideoMixerDescription videoMixerDescription = this.LLILZIL;
        if (videoMixerDescription != null && (videoMixerDescription.flags & 8) == 0 && this.LLJ.LIZLLL(videoFrame.getTimestampNs() / 1000)) {
            ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJ;
            if (viewOnTouchListenerC1268840j7i.LLJIJIL.LIZIZ.LJJJJL) {
                C1272880jEE c1272880jEE2 = viewOnTouchListenerC1268840j7i.LLILLJJLI;
                if (c1272880jEE2 != null) {
                    c1272880jEE2.onFrame(videoFrame);
                    return;
                }
                return;
            }
            C1267590j5h c1267590j5h = viewOnTouchListenerC1268840j7i.LL;
            if (c1267590j5h == null || !c1267590j5h.LL || (c1272880jEE = c1267590j5h.LLILLL.get()) == null) {
                return;
            }
            c1272880jEE.onFrame(videoFrame);
        }
    }

    @Override // X.C1268850j7j, X.InterfaceC1268870j7l
    public final void LIZJ(VideoMixer.VideoMixerDescription videoMixerDescription) {
        VideoMixer.VideoMixerDescription videoMixerDescription2 = this.LLILZIL;
        if (videoMixerDescription != null && videoMixerDescription2 != null) {
            videoMixerDescription2.copy(videoMixerDescription);
        }
    }

    @Override // X.C1268850j7j
    public final void LIZLLL(String str) {
        this.LLILLJJLI = -1;
        this.LLILZIL = VideoMixer.VideoMixerDescription.FILL();
        setEnable(false);
    }

    @Override // X.C1268850j7j
    public final void LJFF(VideoMixer.VideoMixerTexture videoMixerTexture) {
        throw new AndroidRuntimeException("later support");
    }

    @Override // X.C1268850j7j, X.InterfaceC1268870j7l, X.InterfaceC1274490jGp
    public final void setEnable(boolean z) {
        VideoMixer.VideoMixerDescription videoMixerDescription = this.LLILZIL;
        if (videoMixerDescription != null) {
            if (z) {
                videoMixerDescription.flags &= -9;
            } else {
                videoMixerDescription.flags |= 8;
            }
        }
        C1267590j5h c1267590j5h = this.LLJ.LL;
        if (c1267590j5h != null) {
            c1267590j5h.LL = z;
            c1267590j5h.setEnable(!z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268680j7S(ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i, String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
        super(viewOnTouchListenerC1268840j7i, str, i, i2, videoMixerDescription);
        this.LLJ = viewOnTouchListenerC1268840j7i;
    }
}
