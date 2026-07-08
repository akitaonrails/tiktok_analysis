package X;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ic1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470070Ic1 {
    public InterfaceC465210IMd LIZ;
    public InterfaceC470090Ic3 LIZIZ;
    public InterfaceC470090Ic3 LIZJ;
    public boolean LIZLLL;

    public final void LIZJ() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC470090Ic3 interfaceC470090Ic32;
        InterfaceC465210IMd interfaceC465210IMd;
        if (!this.LIZLLL) {
            C20441214yg.LIZIZ("PromoteCardPlayerHelper", "resumeAll called before first shown, ignoring");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeAll: audio=");
        InterfaceC465210IMd interfaceC465210IMd2 = this.LIZ;
        sbLIZ.append(interfaceC465210IMd2 != null ? Boolean.valueOf(interfaceC465210IMd2.isPlaying()) : null);
        sbLIZ.append(", video=");
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LIZIZ;
        sbLIZ.append(interfaceC470090Ic33 != null ? Boolean.valueOf(interfaceC470090Ic33.isPlaying()) : null);
        sbLIZ.append(", bg=");
        InterfaceC470090Ic3 interfaceC470090Ic34 = this.LIZJ;
        sbLIZ.append(interfaceC470090Ic34 != null ? Boolean.valueOf(interfaceC470090Ic34.isPlaying()) : null);
        C20441214yg.LIZIZ("PromoteCardPlayerHelper", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC465210IMd interfaceC465210IMd3 = this.LIZ;
        if (interfaceC465210IMd3 != null && !interfaceC465210IMd3.isPlaying() && (interfaceC465210IMd = this.LIZ) != null) {
            interfaceC465210IMd.resume();
        }
        InterfaceC470090Ic3 interfaceC470090Ic35 = this.LIZIZ;
        if (interfaceC470090Ic35 != null && !interfaceC470090Ic35.isPlaying() && (interfaceC470090Ic32 = this.LIZIZ) != null) {
            interfaceC470090Ic32.resume();
        }
        InterfaceC470090Ic3 interfaceC470090Ic36 = this.LIZJ;
        if (interfaceC470090Ic36 == null || interfaceC470090Ic36.isPlaying() || (interfaceC470090Ic3 = this.LIZJ) == null) {
            return;
        }
        interfaceC470090Ic3.resume();
    }

    public final void LIZIZ() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC470090Ic3 interfaceC470090Ic32;
        InterfaceC465210IMd interfaceC465210IMd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pauseAll: audio=");
        InterfaceC465210IMd interfaceC465210IMd2 = this.LIZ;
        sbLIZ.append(interfaceC465210IMd2 != null ? Boolean.valueOf(interfaceC465210IMd2.isPlaying()) : null);
        sbLIZ.append(", video=");
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LIZIZ;
        sbLIZ.append(interfaceC470090Ic33 != null ? Boolean.valueOf(interfaceC470090Ic33.isPlaying()) : null);
        sbLIZ.append(", bg=");
        InterfaceC470090Ic3 interfaceC470090Ic34 = this.LIZJ;
        sbLIZ.append(interfaceC470090Ic34 != null ? Boolean.valueOf(interfaceC470090Ic34.isPlaying()) : null);
        C20441214yg.LIZIZ("PromoteCardPlayerHelper", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC465210IMd interfaceC465210IMd3 = this.LIZ;
        if (interfaceC465210IMd3 != null && interfaceC465210IMd3.isPlaying() && (interfaceC465210IMd = this.LIZ) != null) {
            interfaceC465210IMd.stop();
        }
        InterfaceC470090Ic3 interfaceC470090Ic35 = this.LIZIZ;
        if (interfaceC470090Ic35 != null && interfaceC470090Ic35.isPlaying() && (interfaceC470090Ic32 = this.LIZIZ) != null) {
            interfaceC470090Ic32.pause();
        }
        InterfaceC470090Ic3 interfaceC470090Ic36 = this.LIZJ;
        if (interfaceC470090Ic36 == null || !interfaceC470090Ic36.isPlaying() || (interfaceC470090Ic3 = this.LIZJ) == null) {
            return;
        }
        interfaceC470090Ic3.pause();
    }

    public final InterfaceC470090Ic3 LIZ(TextureView textureView, long j, String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Background video URL empty, skipping player creation");
            return null;
        }
        try {
            InterfaceC470090Ic3 videoCleanPlayerController = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getVideoCleanPlayerController(textureView, str, (int) j, null, "extra card", null);
            this.LIZJ = videoCleanPlayerController;
            C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Background video player created successfully");
            return videoCleanPlayerController;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("PromoteCardPlayerHelper", "Failed to create background video player", e);
            return null;
        }
    }
}
