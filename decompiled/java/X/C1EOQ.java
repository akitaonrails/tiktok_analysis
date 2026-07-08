package X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1EOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1EOQ implements InterfaceC1484830ok5, InterfaceC1279680jPC {
    public final String LIZ;
    public C1EOS LIZIZ;
    public int LIZJ = -1;
    public C1698870uJJ LIZLLL;
    public CopyOnWriteArrayList<InterfaceC1482530ogN> LJ;

    @Override // X.InterfaceC1484830ok5
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJFF(C1484040oio c1484040oio) {
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483420oho LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final InterfaceC1483670oiD LJIILL() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final void LJIILLIIL(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final void LJJII(String str) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJI(InterfaceC1483670oiD interfaceC1483670oiD) {
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJJJLL() {
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJLIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJLJ() {
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final InterfaceC650720Pfi getLegacy() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final void resume() {
    }

    @Override // X.InterfaceC1484830ok5
    public final void seek(float f) {
    }

    @Override // X.InterfaceC1484830ok5
    public final void setLoop(boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final void setSpeed(float f) {
    }

    @Override // X.InterfaceC1279680jPC
    public void LJI() {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(this.LIZ, false, null);
            }
        }
    }

    @Override // X.InterfaceC1279680jPC
    public void LJIIJ() {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(this.LIZ, true, null);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public InterfaceC1488100opM LJIILIIL() {
        return new InterfaceC1488100opM() { // from class: X.1EOV
            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LIZJ(String str) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJIJI(String str) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJIL(C587000N0o c587000N0o) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJJ(int i) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJJI(C587000N0o c587000N0o) {
            }

            @Override // X.InterfaceC1488100opM
            public final void LIZLLL() {
                this.LIZ.LIZIZ.LJJJJZI(true);
            }

            @Override // X.InterfaceC1488100opM
            public final void mute() {
                this.LIZ.LIZIZ.mute();
            }

            @Override // X.InterfaceC1488100opM
            public final void unmute() {
                this.LIZ.LIZIZ.LJIIIIZZ();
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIIJ(int i) {
                C1EOQ c1eoq = this.LIZ;
                c1eoq.LIZJ = i;
                c1eoq.LIZIZ.LJJIIJZLJL(i);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIIZILJ(boolean z) {
                this.LIZ.LIZIZ.LJJJI(z);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJ(int i) {
                this.LIZ.LIZIZ.LJIJ(i);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJJ(String str) {
                this.LIZ.LIZIZ.LJJIJIIJI(str);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJJIFFI(C1491030ou5 c1491030ou5) {
                this.LIZ.LIZIZ.LJJJ(c1491030ou5);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIILLIIL(float f, float f2) {
                this.LIZ.LIZIZ.LJIILLIIL(f, f2);
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJJLI(boolean z, boolean z2) {
                this.LIZ.LIZIZ.LJJIL(z, z2);
            }
        };
    }

    @Override // X.InterfaceC1484830ok5
    public List<String> LJIJJ() {
        return this.LIZIZ.LJIJJ();
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJ() {
        this.LIZIZ.LJJ();
    }

    @Override // X.InterfaceC1484830ok5
    public int LJJI() {
        return this.LIZIZ.LJJI();
    }

    @Override // X.InterfaceC1484830ok5
    public boolean LJJIFFI() {
        return this.LIZIZ.LJJIFFI();
    }

    @Override // X.InterfaceC1279680jPC
    public void LJJJJ() {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().VK();
            }
        }
    }

    @Override // X.InterfaceC1483520ohy
    public InterfaceC1483510ohx LJJJJZI() {
        return new InterfaceC1483510ohx() { // from class: X.1EOL
            @Override // X.InterfaceC1483510ohx
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1483510ohx
            public final Map<String, Object> LIZ() {
                C1698870uJJ c1698870uJJ = this.LIZ.LIZLLL;
                if (c1698870uJJ == null) {
                    return null;
                }
                HashMap map = new HashMap();
                String str = c1698870uJJ.LJIIL;
                if (str == null) {
                    str = "unknown";
                }
                map.put("create_enter_method", str);
                String str2 = c1698870uJJ.LJIILIIL;
                if (str2 == null) {
                    str2 = "unknown";
                }
                map.put("enter_method", str2);
                String str3 = c1698870uJJ.LJIILJJIL;
                map.put("enter_action", str3 != null ? str3 : "unknown");
                map.put("pre_play_type", Integer.valueOf(c1698870uJJ.LJIILL));
                map.put("unique_id", this.LIZ.LIZ);
                map.put("bg_player_mode", Integer.valueOf(this.LIZ.LIZJ));
                map.put("is_mute", this.LIZ.LIZIZ.LJIIIZ(319));
                return map;
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LJJIJIIJIL() {
                return this.LIZ.LIZIZ.LIZJ() == EnumC1279670jPB.STOPPED;
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean isPlaying() {
                return this.LIZ.LIZIZ.LIZJ() == EnumC1279670jPB.PLAYED;
            }

            @Override // X.InterfaceC1483510ohx
            public final void pause() {
                this.LIZ.LIZIZ.pause();
            }

            @Override // X.InterfaceC1483510ohx
            public final void release() {
                this.LIZ.LIZIZ.release();
            }
        };
    }

    @Override // X.InterfaceC1484830ok5
    public InterfaceC1699280uJy LJJLIIJ() {
        return new InterfaceC1699280uJy() { // from class: X.1EOP
            @Override // X.InterfaceC1699280uJy
            public final EnumC1279670jPB LIZJ() {
                EnumC1279670jPB enumC1279670jPBLIZJ = this.LIZ.LIZIZ.LIZJ();
                return enumC1279670jPBLIZJ == null ? EnumC1279670jPB.IDLE : enumC1279670jPBLIZJ;
            }

            @Override // X.InterfaceC1699280uJy
            public final boolean LJFF() {
                return this.LIZ.LIZIZ.LJFF();
            }

            @Override // X.InterfaceC1699280uJy
            public final Surface LJIIJJI() {
                return this.LIZ.LIZIZ.LJIIJJI();
            }

            @Override // X.InterfaceC1699280uJy
            public final JSONObject LJIIZILJ() {
                return this.LIZ.LIZIZ.LJIIZILJ();
            }

            @Override // X.InterfaceC1699280uJy
            public final long LJIJJLI() {
                return this.LIZ.LIZIZ.LJIJJLI();
            }

            @Override // X.InterfaceC1699280uJy
            public final Bitmap LJIL() {
                return this.LIZ.LIZIZ.LJIL();
            }

            @Override // X.InterfaceC1699280uJy
            public final long getBitrate() {
                return this.LIZ.LIZIZ.getBitrate();
            }

            @Override // X.InterfaceC1699280uJy
            public final String getCurrentResolution() {
                String currentResolution = this.LIZ.LIZIZ.getCurrentResolution();
                return currentResolution == null ? "" : currentResolution;
            }

            @Override // X.InterfaceC1699280uJy
            public final JSONObject getFirstFrameBlockInfo() {
                return this.LIZ.LIZIZ.getFirstFrameBlockInfo();
            }

            @Override // X.InterfaceC1699280uJy
            public final int getHeight() {
                return this.LIZ.LIZIZ.getHeight();
            }

            @Override // X.InterfaceC1699280uJy
            public final C1281010jRL getNetworkState() {
                return this.LIZ.LIZIZ.getNetworkState();
            }

            @Override // X.InterfaceC1699280uJy
            public final int getWidth() {
                return this.LIZ.LIZIZ.getWidth();
            }

            @Override // X.InterfaceC1699280uJy
            public final String LJIIIZ(int i) {
                String strLJIIIZ = this.LIZ.LIZIZ.LJIIIZ(i);
                if (strLJIIIZ == null) {
                    return "";
                }
                return strLJIIIZ;
            }
        };
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483850oiV getPlayState() {
        return new InterfaceC1483850oiV() { // from class: X.1EON
            @Override // X.InterfaceC1483850oiV
            public final boolean LJJIJIIJIL() {
                return this.LIZ.LJJLIIJ().LIZJ() == EnumC1279670jPB.STOPPED;
            }

            @Override // X.InterfaceC1483850oiV
            public final int getState() {
                throw new IllegalStateException("not support");
            }

            @Override // X.InterfaceC1483850oiV
            public final boolean isPaused() {
                throw new IllegalStateException("not support");
            }

            @Override // X.InterfaceC1483850oiV
            public final boolean isPlaying() {
                return this.LIZ.LJJLIIJ().LIZJ() == EnumC1279670jPB.PLAYED;
            }
        };
    }

    @Override // X.InterfaceC1279680jPC
    public final void onCompletion() {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onPlayCompleted(this.LIZ, 0);
            }
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void onPrepared() {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onPlayPrepared(this.LIZ);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public void pause() {
        this.LIZIZ.pause();
    }

    @Override // X.InterfaceC1484830ok5
    public final void release() {
        throw new IllegalStateException("not support, use releaseForLive() instead");
    }

    @Override // X.InterfaceC1484830ok5
    public void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC1484830ok5
    public void reset() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset ");
        sbLIZ.append(this.LIZ);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.reset();
    }

    public C1EOQ(String str) {
        this.LIZ = str;
        InterfaceC1699170uJn interfaceC1699170uJn = (InterfaceC1699170uJn) C1126604au.LIZ("com.ss.videoarch.liveplayer.player.LivePlayerServiceImpl");
        if (interfaceC1699170uJn != null) {
            C1698860uJI c1698860uJILIZ = interfaceC1699170uJn.LIZ();
            this.LIZIZ = c1698860uJILIZ;
            c1698860uJILIZ.LLJILJIL = this;
            C1479580obc c1479580obc = C1479990ocH.LIZ;
            c1479580obc.getClass();
            if (C1474810oTv.LJJLL().booleanValue()) {
                C2032207xg c2032207xg = new C2032207xg(this);
                if (!((CopyOnWriteArrayList) c1479580obc.LIZIZ).contains(c2032207xg)) {
                    ((CopyOnWriteArrayList) c1479580obc.LIZIZ).add(c2032207xg);
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addLivePlayer: ");
                    sbLIZ.append(((CopyOnWriteArrayList) c1479580obc.LIZIZ).size());
                    C1481110oe5.LIZIZ("PlayerInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot find match live player service, please check your code !");
    }

    @Override // X.InterfaceC1279680jPC
    public final void Au(Surface surface) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().Au(surface);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public void LIZ(boolean z) {
        this.LIZIZ.LIZ(z);
    }

    @Override // X.InterfaceC1484830ok5
    public final Object LIZIZ(AbstractC586270Mz3 abstractC586270Mz3) {
        return abstractC586270Mz3.LIZ();
    }

    @Override // X.InterfaceC1484830ok5
    public void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        C1698870uJJ c1698870uJJLJIIIZ;
        if (interfaceC1479620obg != null && (c1698870uJJLJIIIZ = interfaceC1479620obg.LJIIIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play ");
            sbLIZ.append(c1698870uJJLJIIIZ.LIZLLL);
            LJJLL(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL = c1698870uJJLJIIIZ;
            this.LIZIZ.LJJIIZI(c1698870uJJLJIIIZ);
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void LJIILJJIL(String str) {
        C1700490uLv c1700490uLv = new C1700490uLv(2, str);
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().Qe2(c1700490uLv);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
        if (interfaceC1482530ogN == null) {
            return;
        }
        if (this.LJ == null) {
            this.LJ = new CopyOnWriteArrayList<>();
        }
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(interfaceC1482530ogN);
        }
    }

    @Override // X.InterfaceC1279680jPC
    public void LJIJI(boolean z) {
        C1480420ocy c1480420ocy = new C1480420ocy(this.LIZ);
        c1480420ocy.setFirstFrame(z);
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onRenderFirstFrame(this.LIZ, c1480420ocy);
            }
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void LJJIII(String str) {
        C1700490uLv c1700490uLv = new C1700490uLv(1, str);
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().Qe2(c1700490uLv);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJIIJ(EnumC1490990ou1 enumC1490990ou1) {
        this.LIZIZ.LJJIJL(enumC1490990ou1);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJIL(String str) {
        this.LIZIZ.switchResolution(str);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        C1698870uJJ c1698870uJJLJIIIZ;
        if (interfaceC1479620obg != null && (c1698870uJJLJIIIZ = interfaceC1479620obg.LJIIIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareNext ");
            sbLIZ.append(c1698870uJJLJIIIZ.LIZLLL);
            LJJLL(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL = c1698870uJJLJIIIZ;
            this.LIZIZ.LJJJJZ(c1698870uJJLJIIIZ);
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void LJJJJI(String str) {
        C1700490uLv c1700490uLv = new C1700490uLv(3, str);
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().Qe2(c1700490uLv);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public int LJJJJIZL(int i) {
        return this.LIZIZ.stopAuxAudioDucking(i);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJJJL(boolean z) {
        this.LIZIZ.LJIILIIL(z);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJL(C1699080uJe c1699080uJe) {
        this.LIZIZ.LJJIZ(c1699080uJe);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJLIIIJLLLLLLLZ(Surface surface) {
        this.LIZIZ.setSurface(surface);
    }

    @Override // X.InterfaceC1279680jPC
    public void LJJLIL(C1284720jXK c1284720jXK) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().Gk1(c1284720jXK);
            }
        }
    }

    public void LJJLL(String str) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" <===> ttk hash:");
            sbLIZ.append(this.LIZIZ.hashCode());
            C1481110oe5.LIZIZ("TTKLivePlayer_PlayerImplLive", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void LLZZLLIL(C1281010jRL c1281010jRL) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LLZZLLIL(c1281010jRL);
            }
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void W1(String str) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().W1(str);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public int getAudioDuckingDurationForLive(int i) {
        return this.LIZIZ.LJJJJL(i);
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop(String str) {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC1279680jPC
    public final void uv(JSONObject jSONObject) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().uv(jSONObject);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJIJIL(String str, String str2) {
        this.LIZIZ.LJIIL(str, str2);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJJJLI(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sync: ");
        sbLIZ.append(z);
        sbLIZ.append(", playerTag: ");
        sbLIZ.append(str);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LIZIZ.release();
        } else {
            this.LIZIZ.LJIILL();
        }
        C1479990ocH.LIZ.LIZIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0uK8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1484830ok5
    public int LJJJJZ(C1699290uJz c1699290uJz, final C1699370uK7 c1699370uK7) {
        C1698900uJM c1698900uJM = new C1698900uJM();
        c1698900uJM.LIZ = c1699290uJz.LIZ;
        c1698900uJM.LIZIZ = c1699290uJz.LIZIZ;
        c1698900uJM.LIZJ = c1699290uJz.LIZJ;
        c1698900uJM.LIZLLL = c1699290uJz.LIZLLL;
        c1698900uJM.LJ = c1699290uJz.LJ;
        c1698900uJM.LJFF = c1699290uJz.LJFF;
        c1698900uJM.LJI = c1699290uJz.LJI;
        c1698900uJM.LJII = c1699290uJz.LJII;
        c1698900uJM.LJIIIIZZ = c1699290uJz.LJIIIIZZ;
        c1698900uJM.LJIIIZ = c1699290uJz.LJIIIZ;
        return this.LIZIZ.LJJIIZ(c1698900uJM, new InterfaceC1699000uJW() { // from class: X.0uK8
            @Override // X.InterfaceC1699000uJW
            public final void LIZIZ(int i) {
                InterfaceC1699390uK9 interfaceC1699390uK9 = ((C1699370uK7) c1699370uK7).LIZ;
                if (interfaceC1699390uK9 != null) {
                    interfaceC1699390uK9.LIZIZ(i);
                }
            }

            @Override // X.InterfaceC1699000uJW
            public final void LIZLLL(int i) {
                InterfaceC1699390uK9 interfaceC1699390uK9 = ((C1699370uK7) c1699370uK7).LIZ;
                if (interfaceC1699390uK9 != null) {
                    interfaceC1699390uK9.LIZLLL(i);
                }
            }

            @Override // X.InterfaceC1699000uJW
            public final void LJ(int i) {
                InterfaceC1699390uK9 interfaceC1699390uK9 = ((C1699370uK7) c1699370uK7).LIZ;
                if (interfaceC1699390uK9 != null) {
                    interfaceC1699390uK9.LJ(i);
                }
            }
        });
    }

    @Override // X.InterfaceC1484830ok5
    public int LJJLIIIIJ(int i, byte[] bArr) {
        if (bArr != null && i > 0) {
            return this.LIZIZ.writeAuxAudioDuckingPCM(bArr, i);
        }
        return 0;
    }

    @Override // X.InterfaceC1279680jPC
    public void onVideoSizeChanged(int i, int i2) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onVideoSizeChanged(this.LIZ, i, i2);
            }
        }
    }

    @Override // X.InterfaceC1279680jPC
    public final void tc(String str, JSONObject jSONObject) {
        CopyOnWriteArrayList<InterfaceC1482530ogN> copyOnWriteArrayList = this.LJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1482530ogN> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().tc(str, jSONObject);
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public void LJII(SurfaceControl surfaceControl, int i, int i2) {
        this.LIZIZ.LJII(surfaceControl, i, i2);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJIIJZLJL(long j, Surface surface, boolean z) {
        this.LIZIZ.LJJIJIIJIL(j, surface, z);
    }

    @Override // X.InterfaceC1484830ok5
    public void LJJJLL(long j, C1699310uK1 c1699310uK1, ExecutorService executorService, boolean z) {
        this.LIZIZ.LJJJLZIJ(j, c1699310uK1, executorService, z);
    }
}
