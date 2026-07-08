package X;

import com.ss.ttlivestreamer.core.mixer.VideoMixer;

/* JADX INFO: renamed from: X.0j7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268860j7k {
    public final InterfaceC1269020j80 LIZ;
    public final InterfaceC1272980jEO LIZIZ;

    public final void LIZ(boolean z) {
        InterfaceC1268960j7u interfaceC1268960j7uLIZJ = ((ViewOnTouchListenerC1268840j7i) this.LIZIZ).LIZJ("single_view_background");
        if (((C1268630j7N) this.LIZ).LLLI && (interfaceC1268960j7uLIZJ instanceof C1268850j7j) && z && interfaceC1268960j7uLIZJ.LIZIZ().isVisible()) {
            VideoMixer.VideoMixerDescription videoMixerDescriptionFILL = VideoMixer.VideoMixerDescription.FILL();
            videoMixerDescriptionFILL.zOrder = -1;
            interfaceC1268960j7uLIZJ.LIZJ(videoMixerDescriptionFILL);
            ((C1268850j7j) interfaceC1268960j7uLIZJ).LJFF(null);
        }
    }

    public C1268860j7k(InterfaceC1268980j7w interfaceC1268980j7w, InterfaceC1269020j80 interfaceC1269020j80) {
        this.LIZIZ = interfaceC1268980j7w;
        this.LIZ = interfaceC1269020j80;
    }
}
