package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483660oiC implements InterfaceC1483670oiD, InterfaceC1023880ckc {
    public final InterfaceC1483670oiD LIZ;
    public OnUIPlayListener LIZIZ;
    public IMonitor LIZJ;
    public InterfaceC1472010oPP LIZLLL;
    public InterfaceC1471920oPG LJ;
    public InterfaceC585470Mxl LJFF;
    public final C1484070oir LJI = new InterfaceC1484080ois() { // from class: X.0oir
        @Override // X.InterfaceC1484080ois
        public final boolean LJJIJIIJIL() {
            return this.LIZ.LIZ.getPlayState().LJJIJIIJIL();
        }

        @Override // X.InterfaceC1484080ois
        public final int getState() {
            return this.LIZ.LIZ.getPlayState().getState();
        }

        @Override // X.InterfaceC1484080ois
        public final boolean isLoading() {
            return this.LIZ.LIZ.getPlayState().isLoading();
        }

        @Override // X.InterfaceC1484080ois
        public final boolean isPaused() {
            return this.LIZ.LIZ.getPlayState().isPaused();
        }

        @Override // X.InterfaceC1484080ois
        public final boolean isPlaying() {
            return this.LIZ.LIZ.getPlayState().isPlaying();
        }

        @Override // X.InterfaceC1484080ois
        public final boolean LJJLIIIJLLLLLLLZ(String str) {
            return this.LIZ.LIZ.getPlayState().LJJLIIIJLLLLLLLZ(str);
        }

        @Override // X.InterfaceC1484080ois
        public final boolean LJJLIL(String str) {
            return this.LIZ.LIZ.getPlayState().LJJLIL(str);
        }

        @Override // X.InterfaceC1484080ois
        public final boolean LJJLJ(String str) {
            return this.LIZ.LIZ.getPlayState().LJJLJ(str);
        }
    };
    public final C1483790oiP LJII = new InterfaceC1483810oiR() { // from class: X.0oiP
        @Override // X.InterfaceC1483810oiR
        public final /* synthetic */ void LJ(InterfaceC585470Mxl interfaceC585470Mxl) {
        }

        @Override // X.InterfaceC1483810oiR
        public final void mute() {
            this.LIZ.LIZ.LJIILIIL().mute();
        }

        @Override // X.InterfaceC1483810oiR
        public final void unmute() {
            this.LIZ.LIZ.LJIILIIL().unmute();
        }

        @Override // X.InterfaceC1483810oiR
        public final void LIZ(InterfaceC585470Mxl interfaceC585470Mxl) {
            C1483660oiC c1483660oiC = this.LIZ;
            c1483660oiC.LJFF = interfaceC585470Mxl;
            c1483660oiC.LIZ.LJIILIIL().LIZ(interfaceC585470Mxl);
        }

        @Override // X.InterfaceC1483810oiR
        public final void LIZIZ(InterfaceC1481780ofA interfaceC1481780ofA) {
            C1483660oiC c1483660oiC = this.LIZ;
            c1483660oiC.getClass();
            c1483660oiC.LIZ.LJIILIIL().LIZIZ(interfaceC1481780ofA);
        }

        @Override // X.InterfaceC1483810oiR
        public final void LIZJ(String str) {
            this.LIZ.LIZ.LJIILIIL().LIZJ(str);
        }

        @Override // X.InterfaceC1483810oiR
        public final void LIZLLL(String str, String str2) {
            this.LIZ.LIZ.LJIILIIL().LIZLLL("pgc", str2);
        }

        @Override // X.InterfaceC1483810oiR
        public final void LJIILLIIL(float f, float f2) {
            this.LIZ.LIZ.LJIILIIL().LJIILLIIL(f, f2);
        }
    };
    public final C1481740of6 LJIIIIZZ = new InterfaceC1481730of5() { // from class: X.0of6
        @Override // X.InterfaceC1481730of5
        public final /* synthetic */ Map LIZ() {
            return null;
        }

        @Override // X.InterfaceC1481730of5
        public final /* synthetic */ float LJFF(int i) {
            return -1.0f;
        }

        @Override // X.InterfaceC1481730of5
        public final /* synthetic */ boolean LJIIIZ() {
            return false;
        }

        @Override // X.InterfaceC1481730of5
        public final String LIZIZ() {
            return this.LIZ.LIZ.LJIIIZ().LIZIZ();
        }

        @Override // X.InterfaceC1481730of5
        public final C1479510obV LIZJ() {
            return this.LIZ.LIZ.LJIIIZ().LIZJ();
        }

        @Override // X.InterfaceC1481730of5
        public final int LIZLLL() {
            return this.LIZ.LIZ.LJIIIZ().LIZLLL();
        }

        @Override // X.InterfaceC1481730of5
        public final boolean LJ() {
            return this.LIZ.LIZ.LJIIIZ().LJ();
        }

        @Override // X.InterfaceC1481730of5
        public final float LJI() {
            return this.LIZ.LIZ.LJIIIZ().LJI();
        }

        @Override // X.InterfaceC1481730of5
        public final float LJII() {
            return this.LIZ.LIZ.LJIIIZ().LJII();
        }

        @Override // X.InterfaceC1481730of5
        public final int LJIIJ() {
            return this.LIZ.LIZ.LJIIIZ().LJIIJ();
        }

        @Override // X.InterfaceC1481730of5
        public final String LJIJJ() {
            return this.LIZ.LIZ.LJIIIZ().LJIJJ();
        }

        @Override // X.InterfaceC1481730of5
        public final int LJIJJLI() {
            return this.LIZ.LIZ.LJIIIZ().LJIJJLI();
        }

        @Override // X.InterfaceC1481730of5
        public final int LJJ() {
            return this.LIZ.LIZ.LJIIIZ().LJJ();
        }

        @Override // X.InterfaceC1481730of5
        public final String LJJI() {
            return this.LIZ.LIZ.LJIIIZ().LJJI();
        }

        @Override // X.InterfaceC1481730of5
        public final SimVideoUrlModel LJJIII() {
            return this.LIZ.LIZ.LJIIIZ().LJJIII();
        }

        @Override // X.InterfaceC1481730of5
        public final void LJJIIZ() {
            this.LIZ.LIZ.LJIIIZ().LJJIIZ();
        }

        @Override // X.InterfaceC1481730of5
        public final void LJJIIZI() {
            this.LIZ.LIZ.LJIIIZ().LJJIIZI();
        }

        @Override // X.InterfaceC1481730of5
        public final int LJJIJIL() {
            return this.LIZ.LIZ.LJIIIZ().LJJIJIL();
        }

        @Override // X.InterfaceC1481730of5
        public final int LJJLIIJ() {
            return this.LIZ.LIZ.LJIIIZ().LJJLIIJ();
        }

        @Override // X.InterfaceC1481730of5
        public final float getBitrate() {
            return this.LIZ.LIZ.LJIIIZ().getBitrate();
        }

        @Override // X.InterfaceC1481730of5
        public final long getCurrentPosition() {
            return this.LIZ.LIZ.LJIIIZ().getCurrentPosition();
        }

        @Override // X.InterfaceC1481730of5
        public final long getDuration() {
            return this.LIZ.LIZ.LJIIIZ().getDuration();
        }

        @Override // X.InterfaceC1481730of5
        public final int getHeight() {
            return this.LIZ.LIZ.LJIIIZ().getHeight();
        }

        @Override // X.InterfaceC1481730of5
        public final EnumC1479760obu getPlayerType() {
            return this.LIZ.LIZ.LJIIIZ().getPlayerType();
        }

        @Override // X.InterfaceC1481730of5
        public final float getSpeed() {
            return this.LIZ.LIZ.LJIIIZ().getSpeed();
        }

        @Override // X.InterfaceC1481730of5
        public final C1471500oOa getVideoInfo() {
            return this.LIZ.LIZ.LJIIIZ().getVideoInfo();
        }

        @Override // X.InterfaceC1481730of5
        public final int getWidth() {
            return this.LIZ.LIZ.LJIIIZ().getWidth();
        }

        @Override // X.InterfaceC1481730of5
        public final boolean isMute() {
            return this.LIZ.LIZ.LJIIIZ().isMute();
        }

        @Override // X.InterfaceC1481730of5
        public final String LJIIIIZZ(String str) {
            return C1477400oY6.LJJJJI.LJIILJJIL(str);
        }

        @Override // X.InterfaceC1481730of5
        public final C1480660odM LJIJ(String str) {
            return this.LIZ.LIZ.LJIIIZ().LJIJ(str);
        }

        @Override // X.InterfaceC1481730of5
        public final Object LJIJI(AbstractC1472270oPp abstractC1472270oPp) {
            return abstractC1472270oPp.LIZIZ;
        }

        @Override // X.InterfaceC1481730of5
        public final C1479860oc4 LJJIFFI(String str) {
            return this.LIZ.LIZ.LJIIIZ().LJJIFFI(str);
        }

        @Override // X.InterfaceC1481730of5
        public final SimVideoUrlModel LJJII(String str) {
            return this.LIZ.LIZ.LJIIIZ().LJJII(str);
        }

        @Override // X.InterfaceC1481730of5
        public final void LJJIJIIJI(int i) {
            this.LIZ.LIZ.LJIIIZ().LJJIJIIJI(i);
        }

        @Override // X.InterfaceC1481730of5
        public final int LJIL(EnumC1479760obu enumC1479760obu, boolean z, boolean z2) {
            return this.LIZ.LIZ.LJIIIZ().LJIL(enumC1479760obu, z, z2);
        }
    };

    @Override // X.InterfaceC1483670oiD
    public final /* synthetic */ Object LJJJJJ(String str, String str2, Map map) {
        return null;
    }

    @Override // X.InterfaceC1483520ohy
    public final /* synthetic */ InterfaceC1483510ohx LJJJJZI() {
        return null;
    }

    @Override // X.InterfaceC1483670oiD
    public final /* synthetic */ int LJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1483670oiD
    public final /* synthetic */ void LJJLIIIJILLIZJL(String str, String str2) {
    }

    @Override // X.InterfaceC1483670oiD
    public final /* synthetic */ void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJJ() {
        this.LIZ.LJJJ();
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC650720Pfi getLegacy() {
        return this.LIZ.getLegacy();
    }

    @Override // X.InterfaceC1483670oiD
    public final void pause() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC1483670oiD
    public final void release() {
        this.LIZ.release();
    }

    @Override // X.InterfaceC1483670oiD
    public final void reset() {
        this.LIZ.reset();
    }

    @Override // X.InterfaceC1483670oiD
    public final void resume() {
        this.LIZ.resume();
    }

    @Override // X.InterfaceC1483670oiD
    public final void stop() {
        this.LIZ.stop();
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC1481730of5 LJIIIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC1483810oiR LJIILIIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC1484080ois getPlayState() {
        return this.LJI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oir] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oiP] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0of6] */
    public C1483660oiC(C1478410oZj c1478410oZj) {
        this.LIZ = C1475650oVH.LIZ().LJIIIIZZ(new C1476570oWl(c1478410oZj.LJFF, false, c1478410oZj.LJ, false));
    }

    @Override // X.InterfaceC1483670oiD
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // X.InterfaceC1483670oiD
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        return (T) this.LIZ.LIZIZ(abstractC586270Mz3);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJIIL(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJIIL(onUIPlayListener);
    }

    @Override // X.InterfaceC1483670oiD
    public final C1480660odM LJIJ(String str) {
        return this.LIZ.LJIJ(str);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJIL(IMonitor iMonitor) {
        this.LIZJ = iMonitor;
        this.LIZ.LJIL(iMonitor);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LIZIZ = onUIPlayListener;
        this.LIZ.LJJIJ(onUIPlayListener);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJIIJI(C2218291Brv c2218291Brv) {
        this.LIZ.LJJIJIIJI(c2218291Brv);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJIIJIL(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJJIJIIJIL(onUIPlayListener);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        this.LIZLLL = interfaceC1472010oPP;
        this.LIZ.LJJIJL(interfaceC1472010oPP);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJLIJ(boolean z) {
        this.LIZ.LJJIJLIJ(z);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIZ(String str) {
        this.LIZ.LJJIZ(str);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJJJJL(C1479530obX c1479530obX) {
        this.LIZ.LJJJJJL(c1479530obX);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJJLZIJ(C1479530obX c1479530obX) {
        this.LIZ.LJJJLZIJ(c1479530obX);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        this.LJ = interfaceC1471920oPG;
        this.LIZ.LJJLIIIJ(interfaceC1471920oPG);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJJI(int i) {
        this.LIZ.LJJLIIIJJI(i);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLJLI(C00UI c00ui) {
        this.LIZ.LJJLJLI(c00ui);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LIZ.LJJZZI(interfaceC1472880oQo);
    }

    @Override // X.InterfaceC1483670oiD
    public final void seek(float f) {
        this.LIZ.seek(f);
    }

    @Override // X.InterfaceC1483670oiD
    public final void setLoop(boolean z) {
        this.LIZ.setLoop(z);
    }

    @Override // X.InterfaceC1483670oiD
    public final void setSpeed(float f) {
        this.LIZ.setSpeed(f);
    }

    @Override // X.InterfaceC1483670oiD
    public final void setSurface(Surface surface) {
        this.LIZ.setSurface(surface);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJIJJLI(Surface surface, boolean z) {
        this.LIZ.LJIJJLI(surface, true);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJJZ(int i, JSONObject jSONObject) {
        this.LIZ.LJJJZ(i, jSONObject);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJJIZ(String str, boolean z) {
        this.LIZ.LJJLIIIJJIZ(str, z);
    }
}
