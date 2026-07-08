package X;

import android.media.session.MediaController;

/* JADX INFO: renamed from: X.1AT3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AT3 extends C1AT4 {
    public C1AT3(final MediaController.TransportControls transportControls) {
        new C1AT5(transportControls) { // from class: X.1AT4
            public final MediaController.TransportControls LIZ;

            @Override // X.C1AT5
            public final void LIZ() {
                this.LIZ.pause();
            }

            @Override // X.C1AT5
            public final void LIZIZ() {
                this.LIZ.play();
            }

            @Override // X.C1AT5
            public final void LIZJ() {
                this.LIZ.stop();
            }

            {
                this.LIZ = transportControls;
            }
        };
    }
}
