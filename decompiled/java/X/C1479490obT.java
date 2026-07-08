package X;

import Y.ARunnableS0S0300200_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS9S1300000_9;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0obT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1479490obT implements InterfaceC1479560oba {
    public static final AtomicInteger LJJL = new AtomicInteger(0);
    public static int LJJLI = 0;
    public static boolean LJJLIIIIJ = false;
    public static final int LJJLIIIJ = 20001;
    public static int LJJLIIIJILLIZJL = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final C1479950ocD LIZJ;
    public C1472250oPn LIZLLL;
    public final AtomicReference<InterfaceC1479610obf> LJ;
    public EnumC1479760obu LJFF;
    public C1479510obV LJI;
    public volatile Surface LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public final AtomicBoolean LJJ;
    public InterfaceC1472490oQB LJJI;
    public InterfaceC1472880oQo LJJIFFI;
    public InterfaceC1284280jWc LJJII;
    public final C1479710obp LJJIII;
    public OnUIPlayListener LJJIIJ;
    public OnPreRenderListener LJJIIJZLJL;
    public OnPlayerPreparedListener LJJIIZ;
    public InterfaceC1480330ocp LJJIIZI;
    public InterfaceC1480060ocO LJJIJ;
    public InterfaceC1479910oc9 LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public long LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public final C1479960ocE LJJJ;
    public final C1479850oc3 LJJJI;
    public final ARunnableS123S0100000_23 LJJJIL;
    public final C1479600obe LJJJJ;
    public final C1479480obS LJJJJI;
    public final C1480230ocf LJJJJIZL;
    public final C1480140ocW LJJJJJ;
    public final C1480150ocX LJJJJJL;
    public final C1480170ocZ LJJJJL;
    public final C1480160ocY LJJJJLI;
    public final C1480190ocb LJJJJLL;
    public final C1480180oca LJJJJZ;
    public final C1480200occ LJJJJZI;
    public final C1480210ocd LJJJLIIL;
    public final C1480220oce LJJJLL;
    public final List<C1479870oc5> LJJJLZIJ;
    public boolean LJJJZ;

    public C1479490obT() {
        throw null;
    }

    public void LJIL(int i) {
    }

    public void LJJ(boolean z) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJLZIJ() {
        this.LJIJI = 0;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearStatus, mStatus:");
            sbLIZ.append(this.LJIJI);
            sbLIZ.append(", prepareOnly:");
            sbLIZ.append(this.LJJIL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZ(int i, Bundle bundle) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLI(InterfaceC1480320oco interfaceC1480320oco) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJI(C00UI c00ui) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJLL(int i, int i2) {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJL(Bundle bundle, boolean z) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLL() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLL(C1479510obV c1479510obV) {
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJ() {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL;
        if (!C1480850odf.LIZJ.optSpecialAppAnr() && (interfaceC1479610obfLJIILJJIL = LJIILJJIL()) != null) {
            interfaceC1479610obfLJIILJJIL.LJ();
        }
        return false;
    }

    public final void LJIIJ() {
        if (this.LJJIIJ == null || ((ArrayList) this.LJJJLZIJ).isEmpty()) {
            return;
        }
        ArrayList<C1479870oc5> arrayList = new ArrayList(this.LJJJLZIJ);
        ((ArrayList) this.LJJJLZIJ).clear();
        for (C1479870oc5 c1479870oc5 : arrayList) {
            this.LJJIIJ.onBrightnessChanged(c1479870oc5.LIZ, c1479870oc5.LIZIZ);
        }
    }

    public final C1480430ocz LJIIJJI() {
        String str = this.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        C1472250oPn c1472250oPn = this.LIZLLL;
        long jLJJJJLI = c1472250oPn != null ? c1472250oPn.LJJJJLI() : -1L;
        C1479510obV c1479510obV = this.LJI;
        C1480430ocz c1480430ocz = new C1480430ocz(this.LJIIJ, jLJJJJLI, str, c1479510obV != null && c1479510obV.LLIIL);
        c1480430ocz.LJII = isMute();
        C1479510obV c1479510obV2 = this.LJI;
        if (c1479510obV2 != null) {
            c1480430ocz.LJIILLIIL = c1479510obV2.LJJJJLL;
            C1477160oXi c1477160oXiLJ = c1479510obV2.LJ();
            if (c1477160oXiLJ != null) {
                Object obj = c1477160oXiLJ.LIZ;
                if (obj instanceof String) {
                    c1480430ocz.LJIIIZ = Math.max(C1472090oPX.LIZ((String) obj), -1);
                }
            }
            C1473210oRL c1473210oRL = this.LJI.LJIJJLI;
            if (c1473210oRL != null) {
                c1480430ocz.LIZ(c1473210oRL.getStrategyTokens());
            }
        }
        return c1480430ocz;
    }

    public final float LJIILIIL() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LLJJIJI;
        }
        return -1.0f;
    }

    public final InterfaceC1479610obf LJIILJJIL() {
        return (!((Boolean) C1474810oTv.LLJLLL.getValue()).booleanValue() || C1474930oU7.LJFF) ? this.LJ.get() : this.LIZLLL;
    }

    public final void LJIJI() {
        InterfaceC1480330ocp interfaceC1480330ocp = this.LJJIIZI;
        if (interfaceC1480330ocp != null) {
            C1480980ods playerConfig = C607330Nrv.LIZ.LIZ().getPlayerConfig(this.LJFF, false, ((AbstractC1480110ocT) interfaceC1480330ocp).LIZ);
            boolean z = playerConfig.LIZJ;
            if (playerConfig.LIZIZ == EnumC1479760obu.TT_HARDWARE) {
                z = true;
            }
            this.LIZLLL = new C1472250oPn(playerConfig.LIZ, z, playerConfig.LJFF, playerConfig.LJI, playerConfig);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initPlayer, create mPlayer = ");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", mSurface = ");
                sbLIZ.append(this.LJII);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJ.set(this.LIZLLL);
        }
        this.LIZLLL.LJJZZI(this.LJJI);
        this.LIZLLL.LJLIL(this.LJJIFFI);
        this.LIZLLL.LJLIIL(this.LJJII);
        this.LIZLLL.LLJJJJ.LLILZ = new C1479660obk(this) { // from class: X.0ocB
            {
                super(this);
            }
        };
        this.LIZLLL.LLJJIII = new C1479500obU(this);
    }

    public final boolean LJIJJLI() {
        C1479510obV c1479510obV = this.LJI;
        if (c1479510obV == null) {
            return true;
        }
        if (c1479510obV.LJJJLZIJ != null) {
            return false;
        }
        C1477160oXi c1477160oXi = c1479510obV.LJJIJIIJIL;
        if (c1477160oXi != null) {
            Object obj = c1477160oXi.LIZ;
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJIJIIJIL() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJLI();
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJIJIL() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJJLIIL();
        }
        return -1;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJ() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sleep() ");
            sbLIZ.append(LJIIL());
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJJJZ = false;
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            String str = this.LJIIIIZZ;
            long jLJJJJL = c1472250oPn.LJJJJL();
            if (str != null) {
                C1479780obw.LIZIZ.put(str, Long.valueOf(jLJJJJL));
            }
            pause();
            C1472250oPn c1472250oPn2 = this.LIZLLL;
            if (C1481110oe5.LIZ) {
                c1472250oPn2.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sleep  mPlayer = ");
                sbLIZ2.append(c1472250oPn2.LLILZIL);
                sbLIZ2.append(", surface = ");
                sbLIZ2.append(c1472250oPn2.LLJILJILJ ? c1472250oPn2.LLJILJIL : c1472250oPn2.LLJIJIL);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C1472150oPd c1472150oPd = c1472250oPn2.LLILZIL;
            if (c1472150oPd != null) {
                c1472150oPd.LIZJ(27, 1);
                c1472250oPn2.LJLLL();
            }
            this.LJIJI = 6;
            this.LJJIIJZLJL = null;
            C1479510obV c1479510obV = this.LJI;
            if (c1479510obV != null) {
                c1479510obV.LIZIZ = null;
            }
        }
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLI() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJJJLL();
        }
        return 0;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLJLI() {
        int i;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("render(), mSurface = ");
            sbLIZ.append(this.LJII);
            sbLIZ.append(", mPlayer = ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" mStatus = ");
            sbLIZ.append(this.LJIJI);
            sbLIZ.append(", mPrepareOnly:");
            sbLIZ.append(this.LJJIL);
            sbLIZ.append("isRenderPrepareEnabled:");
            C1472250oPn c1472250oPn = this.LIZLLL;
            sbLIZ.append(c1472250oPn != null && c1472250oPn.LLILZ.LJJIJL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJJIL) {
            return;
        }
        this.LJIILIIL = true;
        C1472250oPn c1472250oPn2 = this.LIZLLL;
        if (c1472250oPn2 != null && c1472250oPn2.LLILZ.LJJIJL && (i = this.LJIJI) != 1 && i != 2 && i != 5 && i != 6 && i != 3) {
            LJJI(this.LJI, this.LJIIIIZZ, true);
        } else if (this.LJIJI == 2) {
            start();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final String LJLJLJ() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJLLL() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJLLLL();
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLI() {
        if (((Boolean) C1474810oTv.X0.getValue()).booleanValue()) {
            this.LJJIII.LIZ(this.LJJJIL);
            return;
        }
        final long currentPosition = getCurrentPosition();
        final long duration = getDuration();
        final float f = duration == 0 ? 0.0f : (currentPosition * 100.0f) / duration;
        final String str = this.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = this.LJJIIJ;
        this.LJJIII.LIZ(new Runnable() { // from class: X.0obo
            public final void LIZ() {
                OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                if (onUIPlayListener2 != null) {
                    onUIPlayListener2.onPlayProgressChange(f);
                    onUIPlayListener.onPlayProgressChange(str, currentPosition, duration);
                }
                C0NBW.LIZIZ().LIZ(new C1480280ock(str, currentPosition), "PlayerCallback_PROGRESS_CHANGE");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.updatePlayProgress$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.updatePlayProgress$1");
            }
        });
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLILLLL() {
        if (this.LIZLLL != null) {
            SimRadar.keyScan("SimplifyPlayerImpl", "initDecoder", this);
            this.LIZLLL.LJJJJ();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final long getCurrentPosition() {
        C1472250oPn c1472250oPn;
        if (this.LJIJ || (c1472250oPn = this.LIZLLL) == null) {
            return -1L;
        }
        return c1472250oPn.LJJJJL();
    }

    @Override // X.InterfaceC1479560oba
    public final long getDuration() {
        C1472250oPn c1472250oPn;
        if (this.LJIJ || (c1472250oPn = this.LIZLLL) == null) {
            return -1L;
        }
        return c1472250oPn.LJJJJLI();
    }

    @Override // X.InterfaceC1479560oba
    public final void init() {
        C0X35.LIZ("player_precreate_duration", true);
        C01GW c01gw = C2187891Ajz.LJIIL;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C2187811Ajr.LIZIZ();
        }
        if (this.LIZLLL == null) {
            LJIJI();
            C1472250oPn c1472250oPn = this.LIZLLL;
            if (c1472250oPn != null) {
                c1472250oPn.LJJJLL();
            }
            this.LJJIJLIJ = true;
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C2187811Ajr.LIZ();
        }
        C0X35.LJIIJJI("player_precreate_duration", true);
        C0X35.LJIIJJI("player_precreate_real_duration", true);
        C0X35.LJIIJJI("cold_boot_start_to_precreate_end", true);
        C0X35.LIZ("player_precreate_end_to_prerender_start", true);
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isLoading() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJJLZIJ();
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPaused() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJJZ();
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPlaying() {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            return c1472250oPn.LJJL();
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void pause() {
        int i;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause() ");
            sbLIZ.append(LJIIL());
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJJJZ = false;
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn == null || (i = this.LJIJI) > 5 || i == 0) {
            return;
        }
        EnumC1479760obu enumC1479760obu = this.LJFF;
        if ((enumC1479760obu != EnumC1479760obu.Ijk && enumC1479760obu != EnumC1479760obu.IjkHardware) || c1472250oPn.LJJL()) {
            this.LIZLLL.LJJLIIIJ();
            final OnUIPlayListener onUIPlayListener = this.LJJIIJ;
            if (onUIPlayListener != null && this.LJIJI <= 5) {
                final String str = this.LJIIIIZZ;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final C1480430ocz c1480430oczLJIIJJI = LJIIJJI();
                this.LJJIII.LIZ(new Runnable() { // from class: X.0MyB
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SimplifyPlayerImpl@37de.pause$1");
                        try {
                            OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                            if (onUIPlayListener2 != null) {
                                C1480430ocz c1480430ocz = c1480430oczLJIIJJI;
                                long j = jCurrentTimeMillis;
                                c1480430ocz.LIZLLL = j;
                                c1480430ocz.LJFF = j;
                                c1480430ocz.LJ = jElapsedRealtime;
                                onUIPlayListener2.onPausePlay(str, c1480430ocz);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.pause$1");
                    }
                });
            }
        }
        if (this.LJIJI == 1 && !this.LJJIJLIJ) {
            this.LJIIL = true;
        }
        this.LJIJI = 5;
    }

    @Override // X.InterfaceC1479560oba
    public final void release() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release() ");
            sbLIZ.append(LJIIL());
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        stop();
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", "transfer signal, release 1");
        }
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            this.LJIJ = true;
            c1472250oPn.LJJLIIIJLLLLLLLZ();
            this.LJIJ = false;
            LJJJIL(false);
            this.LIZLLL = null;
            this.LJ.set(null);
            this.LJIJI = 7;
            this.LJJIZ = false;
            this.LJJIIJZLJL = null;
            C1479510obV c1479510obV = this.LJI;
            if (c1479510obV != null) {
                c1479510obV.LIZIZ = null;
            }
            AtomicInteger atomicInteger = LJJL;
            atomicInteger.decrementAndGet();
            C1477400oY6.LJJJJI.LJJJJ = atomicInteger.get();
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release, sessionId=");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", mLocalManagerSessionId=");
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append(", SimplifyPlayerImplCnt=");
            sbLIZ2.append(LJJL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", "transfer signal, release 2");
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void resume() {
        C1472250oPn c1472250oPn;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume() ");
            sbLIZ.append(LJIIL());
            sbLIZ.append(", isPrepare2Pause =");
            sbLIZ.append(this.LJIIL);
            sbLIZ.append(" mSurfaceChanged = ");
            sbLIZ.append(this.LJIIZILJ);
            sbLIZ.append(", mPrepareOnly:");
            sbLIZ.append(this.LJJIL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean z = false;
        if (this.LJJIL) {
            SimRadar.keyScan("SimplifyPlayerImpl", "resume-prepareOnly", this.LJIIIIZZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("status:");
        sbLIZ2.append(C1484550ojd.LIZ(this.LJIJI));
        SimRadar.keyScan("SimplifyPlayerImpl", "resume", C2188811AlT.LIZIZ(sbLIZ2), this.LJIIIIZZ);
        int i = this.LJIJI;
        if (i < 2 || i > 5 || this.LJIIL) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("resume: calling prepareWhenResume, mSourceId=");
                sbLIZ3.append(this.LJIIIIZZ);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
            }
            C1479510obV c1479510obV = this.LJI;
            String str = this.LJIIIIZZ;
            if (C1480850odf.LIZJ.isCallbackCompletionFix() && c1479510obV != null) {
                if (!TextUtils.isEmpty(c1479510obV.LJIIIZ)) {
                    Iterator it2 = C989270bqn.LIZJ.LIZ.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC989230bqj) it2.next()).accept(c1479510obV);
                    }
                    CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) C989270bqn.LIZJ.LIZIZ.get(c1479510obV.LJIIIZ);
                    if (copyOnWriteArraySet != null) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC989230bqj) it3.next()).accept(c1479510obV);
                        }
                    }
                }
                if (c1479510obV.LJJIJIIJI && this.LJJIIJ != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1480430ocz c1480430ocz = new C1480430ocz(c1479510obV.LJIIIZ);
                    C1473210oRL c1473210oRL = c1479510obV.LJIJJLI;
                    if (c1473210oRL != null) {
                        c1480430ocz.LIZ(c1473210oRL.getStrategyTokens());
                    }
                    c1480430ocz.LJII = isMute();
                    this.LJJIII.LIZ(new ARunnableS0S0300200_23(c1479510obV, this, c1480430ocz, jCurrentTimeMillis, jElapsedRealtime, 1));
                }
            }
            LJJIFFI(c1479510obV, str, true, 0L, false);
            this.LJIIL = false;
        } else {
            C1479510obV c1479510obV2 = this.LJI;
            if (c1479510obV2 != null && c1479510obV2.LJJJJJ) {
                z = true;
            }
            if (!this.LJIIZILJ || (c1472250oPn = this.LIZLLL) == null || !c1472250oPn.LJLLILLLL() || z) {
                this.LJIJI = 2;
                C1480850odf.LIZJ.getVideoEffectInfo(this.LJIIIIZZ);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("resume: calling start, mSourceId=");
                    sbLIZ4.append(this.LJIIIIZZ);
                    C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ4));
                }
                start();
            } else {
                this.LJI.LJJJJJL = true;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("resume: calling prepare, mSourceId=");
                    sbLIZ5.append(this.LJIIIIZZ);
                    C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ5));
                }
                LJJIFFI(this.LJI, this.LJIIIIZZ, true, this.LIZLLL.LJJJJL(), true);
            }
        }
        final String str2 = this.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = this.LJJIIJ;
        final C1480430ocz c1480430oczLJIIJJI = LJIIJJI();
        this.LJJIII.LIZ(new Runnable() { // from class: X.0My3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.resume$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onResumePlay(str2, c1480430oczLJIIJJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.resume$1");
            }
        });
    }

    @Override // X.InterfaceC1479560oba
    public final void start() {
        C1479510obV c1479510obV;
        C1472250oPn c1472250oPn;
        JSONObject jSONObject;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start()");
            sbLIZ.append(LJIIL());
            sbLIZ.append(", mPrepareOnly:");
            sbLIZ.append(this.LJJIL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJJIL || this.LIZLLL == null || this.LJIJI != 2) {
            return;
        }
        if ((this.LJII == null || !this.LJII.isValid()) && ((c1479510obV = this.LJI) == null || (c1479510obV.LJIILLIIL && !c1479510obV.LJIILJJIL))) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "call start later when surface is available");
            }
            SimRadar.warnScan("SimplifyPlayerImpl", "start", "Surface-Invalid");
            this.LJJJZ = true;
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start surface = ");
            sbLIZ2.append(this.LJII);
            sbLIZ2.append(", mSimplifyPlayer = ");
            sbLIZ2.append(this.LIZLLL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1479950ocD c1479950ocD = this.LIZJ;
        Surface surface = this.LJII;
        if (surface != null) {
            c1479950ocD.getClass();
            c1479950ocD.LIZIZ = surface.hashCode();
        }
        if (c1479950ocD.LIZ != c1479950ocD.LIZIZ && !C1474810oTv.LJJIIJZLJL() && C1479980ocG.LIZ.LIZ != null) {
            C1479830oc1 c1479830oc1 = new C1479830oc1();
            c1479830oc1.LIZ.put("prepare_hash", Integer.valueOf(c1479950ocD.LIZ));
            c1479830oc1.LIZ.put("start_hash", Integer.valueOf(c1479950ocD.LIZIZ));
            synchronized (c1479830oc1) {
                try {
                    jSONObject = new JSONObject(c1479830oc1.LIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
            }
            C1479980ocG.LIZ.LIZ.LIZ(jSONObject);
        }
        if ((!((Boolean) C1474810oTv.v.getValue()).booleanValue() || (c1472250oPn = this.LIZLLL) == null || c1472250oPn.LJJJJZ() == null || !this.LIZLLL.LJJJJZ().isValid() || this.LIZLLL.LJJJJZ() != this.LJII) && LJJIIJZLJL(this.LJI)) {
            this.LIZLLL.LJLL(this.LJII);
        }
        this.LIZLLL.LJLLJ();
        this.LJIJI = 3;
        this.LJJJZ = false;
    }

    @Override // X.InterfaceC1479560oba
    public final C1472440oQ6 LJIIIIZZ() {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            return interfaceC1479610obfLJIILJJIL.LJIIIIZZ();
        }
        return null;
    }

    public final String LJIIL() {
        String name = C786410Ut5.u3().getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        Object obj = this.LIZLLL;
        if (obj == null) {
            obj = "mPlayer = null";
        }
        sbLIZ.append(obj);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJII == null ? "mSurface = null" : this.LJII);
        sbLIZ.append(", ");
        sbLIZ.append(C1484550ojd.LIZ(this.LJIJI));
        sbLIZ.append(", ");
        String str = this.LJIIIIZZ;
        if (str == null) {
            str = "mSourceId = null";
        }
        sbLIZ.append(str);
        sbLIZ.append(", mUrlKey=");
        sbLIZ.append(this.LJJIJIIJIL);
        sbLIZ.append(", mThreadName = ");
        sbLIZ.append(name);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJIII() {
        long j;
        if (C1474810oTv.LJJIIZ() || this.LJJIIZI == null) {
            return;
        }
        String str = "aweme_movie_play";
        if (this.LJIJJ != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIJJ;
            if (jCurrentTimeMillis > 0) {
                InterfaceC1480330ocp interfaceC1480330ocp = this.LJJIIZI;
                String prepareKey = this.LJJIJIIJI.getPrepareKey();
                EnumC1479760obu enumC1479760obu = this.LJFF;
                boolean zLJFF = this.LJI.LJFF();
                int i = this.LJIIJ;
                interfaceC1480330ocp.getClass();
                boolean zLJI = MethodIDManager.LJI(72017);
                int i2 = C1479750obt.LIZ[enumC1479760obu.ordinal()];
                String str2 = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "aweme_movie_play" : "aweme_movie_tt_ijk_engine" : "aweme_movie_ijk_hardware" : "aweme_movie_play_tt" : "aweme_movie_play_exo";
                C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
                c1478040oZ8.LIZ().onRecordPrepareTime(prepareKey, jCurrentTimeMillis, str2, zLJFF, i);
                c1478040oZ8.LIZ().onRecordPrepareTime(prepareKey, jCurrentTimeMillis, str2, zLJFF, 1 == i);
                if (!C1474810oTv.LJJIIJZLJL()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", prepareKey);
                        jSONObject.put("player_type", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("duration", jCurrentTimeMillis);
                            C1475000oUE.LJIIIIZZ().monitorEvent("ttmp_play_info_prepare", jSONObject, jSONObject2, null);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            C1475000oUE.LJIIIIZZ().ensureNotReachHere(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
            j = -1;
            this.LJIJJ = -1L;
        } else {
            j = -1;
        }
        if (this.LJIJJLI != j) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LJIJJLI;
            if (jCurrentTimeMillis2 > 0) {
                InterfaceC1480330ocp interfaceC1480330ocp2 = this.LJJIIZI;
                String firstFrameKey = this.LJJIJIIJI.getFirstFrameKey();
                EnumC1479760obu enumC1479760obu2 = this.LJFF;
                boolean zLJFF2 = this.LJI.LJFF();
                int i3 = this.LJIIJ;
                interfaceC1480330ocp2.getClass();
                int i4 = C1479750obt.LIZ[enumC1479760obu2.ordinal()];
                if (i4 == 2) {
                    str = "aweme_movie_play_exo";
                } else if (i4 == 3) {
                    str = "aweme_movie_play_tt";
                } else if (i4 == 4) {
                    str = "aweme_movie_ijk_hardware";
                } else if (i4 == 5) {
                    str = "aweme_movie_tt_ijk_engine";
                } else if (i4 == 6) {
                    str = "aweme_movie_tt_hardware";
                }
                C1478040oZ8 c1478040oZ82 = C607330Nrv.LIZ;
                c1478040oZ82.LIZ().onRecordFirstFrameTime(firstFrameKey, jCurrentTimeMillis2, str, zLJFF2, i3);
                c1478040oZ82.LIZ().onRecordFirstFrameTime(firstFrameKey, jCurrentTimeMillis2, str, zLJFF2, 1 == i3);
                if (!C1474810oTv.LJJIIJZLJL()) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("key", firstFrameKey);
                        jSONObject3.put("player_type", str);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("duration", jCurrentTimeMillis2);
                        C1475000oUE.LJIIIIZZ().monitorEvent("ttmp_play_info_ff", jSONObject3, jSONObject4, null);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C1475000oUE.LJIIIIZZ().ensureNotReachHere(th3);
                    }
                }
            }
            this.LJIJJLI = -1L;
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJL() {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.LJIJJ();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final C1471500oOa getVideoInfo() {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            return interfaceC1479610obfLJIILJJIL.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isMute() {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            return interfaceC1479610obfLJIILJJIL.isMute() || interfaceC1479610obfLJIILJJIL.LJIIJ() <= 0.0f;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void stop() {
        if (C2187821Ajs.LIZIZ()) {
            C2187811Ajr.LIZIZ();
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", "transfer signal, stop 1");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop() ");
            sbLIZ.append(LJIIL());
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJJJZ = false;
        if (this.LJIJI != 6) {
            if (this.LIZLLL != null) {
                pause();
                this.LIZLLL.LJLLL();
                this.LJIJI = 6;
                this.LJJIIJZLJL = null;
                C1479510obV c1479510obV = this.LJI;
                if (c1479510obV != null) {
                    c1479510obV.LIZIZ = null;
                }
            }
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "transfer signal, stop 2");
            }
        }
        if (C2187821Ajs.LIZIZ()) {
            C2187811Ajr.LIZ();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimplifyPlayerImpl{");
        sbLIZ.append(LJIIL());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLIIJ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1479560oba
    public final EnumC1479760obu getPlayerType() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1479560oba
    public final int getState() {
        return this.LJIJI;
    }

    public static boolean LJJIIJZLJL(C1479510obV c1479510obV) {
        if (!((Boolean) C1474810oTv.s5.getValue()).booleanValue() || c1479510obV == null) {
            return true;
        }
        return c1479510obV.LJIILLIIL;
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZ(boolean z) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.LIZ(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (!this.LJIJ && interfaceC1479610obfLJIILJJIL != null) {
            return (T) interfaceC1479610obfLJIILJJIL.LIZIZ(abstractC586270Mz3);
        }
        return (T) abstractC586270Mz3.LIZ();
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZJ(String str) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.LIZJ(str);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final float LJFF(int i) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (!this.LJIJ && interfaceC1479610obfLJIILJJIL != null) {
            return interfaceC1479610obfLJIILJJIL.LJFF(i);
        }
        return -1.0f;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJI(float f) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPlaySpeed mPlayer = ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", playSpeed = ");
            sbLIZ.append(f);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.LJI(f);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILL(float f) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJLIL(f);
        }
    }

    public final String LJIIZILJ(C1479510obV c1479510obV) {
        C1478290oZX c1478290oZX;
        C1472990oQz c1472990oQz = c1479510obV.LJJJLZIJ;
        if (c1472990oQz != null) {
            C1474600oTa c1474600oTa = c1472990oQz.LIZIZ;
            if (c1474600oTa != null && c1474600oTa.getVideoId() != null) {
                return c1479510obV.LJJJLZIJ.LIZIZ.getVideoId();
            }
            return c1479510obV.LJJJLZIJ.LJ;
        }
        if (c1479510obV.LJ() != null && (c1478290oZX = c1479510obV.LJ().LIZLLL) != null && !TextUtils.isEmpty(c1478290oZX.LJ)) {
            return c1478290oZX.LJ;
        }
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LJJIIJ = onUIPlayListener;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJZL(interfaceC1472010oPP);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJLIJ(boolean z) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJLJJI(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIL(Surface surface) {
        if (C2187821Ajs.LIZIZ()) {
            C2187811Ajr.LIZIZ();
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurfaceDirectly(), surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", ");
            sbLIZ.append(LJIIL());
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZLLL != null && LJJIIJZLJL(this.LJI)) {
            this.LIZLLL.LJLL(surface);
        }
        if (C2187821Ajs.LIZIZ()) {
            C2187811Ajr.LIZ();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIZ(String str) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJLLLLLL(str);
        }
    }

    public final void LJJJIL(boolean z) {
        this.LJJ.getAndSet(z);
    }

    public final void LJJJJ(boolean z) {
        C1479510obV c1479510obV;
        JSONObject jSONObject;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSubtitlesConfig; force: ");
            sbLIZ.append(z);
            sbLIZ.append("; sId: ");
            sbLIZ.append(this.LJI.LJIIIZ);
            sbLIZ.append("; subtitleEnable: ");
            sbLIZ.append(this.LJI.LJLLILLLL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZLLL != null && (c1479510obV = this.LJI) != null) {
            if (z || c1479510obV.LJLLILLLL) {
                if (c1479510obV.LIZLLL() != null && !this.LJI.LIZLLL().isEmpty()) {
                    C1479510obV c1479510obV2 = this.LJI;
                    List<C1477880oYs> listLIZLLL = c1479510obV2.LIZLLL();
                    if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (C1477880oYs c1477880oYs : listLIZLLL) {
                            if (c1477880oYs != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, c1477880oYs.LIZ);
                                    jSONObject2.put("language", c1477880oYs.LIZIZ);
                                    jSONObject2.put("language_id", c1477880oYs.LIZJ);
                                    jSONObject2.put("url", c1477880oYs.LIZLLL);
                                    jSONObject2.put("expire", c1477880oYs.LJ);
                                    jSONObject2.put("format", c1477880oYs.LJFF);
                                    jSONObject2.put("sub_id", c1477880oYs.LJI);
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                jSONArray.put(jSONObject2);
                            }
                        }
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("list", jSONArray);
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        jSONObject = null;
                    }
                    c1479510obV2.LJLLLLLL = jSONObject;
                    C1472250oPn c1472250oPn = this.LIZLLL;
                    C1479510obV c1479510obV3 = this.LJI;
                    c1472250oPn.LJLJL(c1479510obV3.LJLLL, c1479510obV3.LJLLLLLL);
                }
                if (this.LJI.LJLLI) {
                    this.LIZLLL.LJLJLLL();
                } else {
                    this.LIZLLL.LJLJJI(true);
                }
            }
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJL(SurfaceHolder surfaceHolder) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJZ(surfaceHolder);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIIJ(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.LJIIIIZZ)) {
            resume();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJZI(interfaceC1471920oPG);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJJI(int i) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJLZ(i);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLIIIJLLLLLLLZ(String str) {
        C1479850oc3 c1479850oc3 = this.LJJJI;
        if (c1479850oc3.LIZ(str)) {
            return c1479850oc3.LIZLLL;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLIL(String str) {
        C1479850oc3 c1479850oc3 = this.LJJJI;
        if (c1479850oc3.LIZ(str)) {
            return c1479850oc3.LIZIZ;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLJ(String str) {
        C1479850oc3 c1479850oc3 = this.LJJJI;
        if (c1479850oc3.LIZ(str)) {
            return c1479850oc3.LIZJ;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLL(InterfaceC1480060ocO interfaceC1480060ocO) {
        this.LJJIJ = interfaceC1480060ocO;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc) {
        this.LJJII = interfaceC1284280jWc;
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJLIIL(interfaceC1284280jWc);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJL(Bundle bundle) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null && C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("configGaussianParams sourceId ");
            sbLIZ.append(c1472250oPn.LLJ);
            sbLIZ.append(" state ");
            sbLIZ.append(c1472250oPn.LLJLLIL.LLJ);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LJJIFFI = interfaceC1472880oQo;
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJLIL(interfaceC1472880oQo);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIL(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LJJIIZI = interfaceC1480330ocp;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIL(C1479510obV c1479510obV) {
        String name;
        C0X35.LJIIJJI("player_prerender_msg_duration", true);
        C0X35.LIZ("player_prerender_duration", true);
        C0X35.LIZ("player_prerender_dataprocesss_duration", true);
        if (((Boolean) C305060BxY.LJIIJ.getValue()).booleanValue() && (name = C786410Ut5.u3().getName()) != null && !C1845907Kv.LIZ.containsKey(name)) {
            Iterator<String> it2 = C1845907Kv.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(name, it2.next(), false)) {
                    C1845907Kv.LIZ.put(name, Integer.valueOf(Process.myTid()));
                }
            }
        }
        C01GW c01gw = C2187891Ajz.LJ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C2187811Ajr.LIZIZ();
        }
        if (c1479510obV == null) {
            SimRadar.errorScan("SimplifyPlayerImpl", "prepare", new C1473290oRT("PrepareData-NULL"), new Object[0]);
            SimRadar.analyzer().getClass();
            C1472910oQr.LIZIZ("SF-DataNull1");
        } else {
            this.LJJIJIIJI = c1479510obV.LJIIJJI;
            this.LJIIIZ = c1479510obV.LJJIIJZLJL;
            this.LJIILLIIL = 0;
            LJJI(c1479510obV, c1479510obV.LJIIIZ, c1479510obV.LJIIJ);
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C2187811Ajr.LIZ();
        }
        C0X35.LJIIJJI("player_prerender_play_duration", true);
        C0X35.LJIIJJI("player_prerender_duration", true);
        C0X35.LIZ("player_prerender_to_onprepared", true);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJLJLI(interfaceC1499700p84);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJI(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.LJJIIJ;
        if (onUIPlayListener2 != null && onUIPlayListener2.equals(onUIPlayListener)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJL(InterfaceC1472490oQB interfaceC1472490oQB) {
        this.LJJI = interfaceC1472490oQB;
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJZZI(interfaceC1472490oQB);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLJ(C1479900oc8 c1479900oc8) {
        C1479980ocG.LIZ.LIZ = c1479900oc8;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLLL(EnumC1473260oRQ enumC1473260oRQ) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJJIL(enumC1473260oRQ);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLLLLL(int i) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJJI(i);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void setLoop(boolean z) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.setLooping(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void setSurface(Surface surface) {
        boolean z = false;
        if (this.LJJIJLIJ && surface != null) {
            this.LJIIZILJ = false;
            this.LJJIJLIJ = false;
        } else {
            if (this.LJII != surface) {
                z = true;
            }
            this.LJIIZILJ = z;
        }
        this.LJII = surface;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurface surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", ");
            sbLIZ.append(LJIIL());
            sbLIZ.append(", callStartAfterSetSurface = ");
            sbLIZ.append(this.LJJJZ);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJJJZ && ((Boolean) C1474810oTv.LLLLLLZZ.getValue()).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "call start when surface is available");
            }
            start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0ocX] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ocZ] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0ocY] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0ocb] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0oca] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0occ] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0ocd] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0oce] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0ocf] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0ocW] */
    public C1479490obT(EnumC1479760obu enumC1479760obu, int i) {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = new C1479950ocD();
        this.LJIIIIZZ = "";
        this.LJIJJLI = -1L;
        this.LJIL = -1L;
        this.LJJ = new AtomicBoolean(false);
        this.LJJJI = new C1479850oc3();
        this.LJJJJ = new C1479600obe();
        this.LJJJJI = new C1479480obS();
        this.LJJJJIZL = new Object() { // from class: X.0ocf
        };
        this.LJJJJJ = new Object() { // from class: X.0ocW
        };
        this.LJJJJJL = new Object() { // from class: X.0ocX
        };
        this.LJJJJL = new Object() { // from class: X.0ocZ
        };
        this.LJJJJLI = new Object() { // from class: X.0ocY
        };
        this.LJJJJLL = new Object() { // from class: X.0ocb
        };
        this.LJJJJZ = new Object() { // from class: X.0oca
        };
        this.LJJJJZI = new Object() { // from class: X.0occ
        };
        this.LJJJLIIL = new Object() { // from class: X.0ocd
        };
        this.LJJJLL = new Object() { // from class: X.0oce
        };
        this.LJJJLZIJ = new ArrayList();
        this.LJJJZ = false;
        this.LJJIII = new C1479710obp(Looper.getMainLooper());
        this.LJFF = enumC1479760obu;
        this.LJ = new AtomicReference<>(null);
        this.LJJJ = new C1479960ocE();
        AtomicInteger atomicInteger = LJJL;
        atomicInteger.incrementAndGet();
        int i2 = LJJLI + 1;
        LJJLI = i2;
        this.LIZ = i2;
        this.LIZIZ = i;
        this.LJJJIL = new ARunnableS123S0100000_23(this, 88);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create,  sessionId=");
            sbLIZ.append(i2);
            sbLIZ.append(", mLocalManagerSessionId=");
            sbLIZ.append(i);
            sbLIZ.append(", SimplifyPlayerImplCnt=");
            sbLIZ.append(atomicInteger);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static C1471500oOa LJIJ(InterfaceC1479610obf interfaceC1479610obf, C1471500oOa c1471500oOa) {
        if (((Boolean) C1474810oTv.LLLLLLLLL.getValue()).booleanValue()) {
            return c1471500oOa;
        }
        return interfaceC1479610obf.getVideoInfo();
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZLLL(String str, String str2) {
        InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = LJIILJJIL();
        if (interfaceC1479610obfLJIILJJIL != null) {
            interfaceC1479610obfLJIILJJIL.LIZLLL(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    public final void LJIIIZ(C1479510obV c1479510obV, boolean z) {
        boolean z2;
        InterfaceC1480080ocQ<Long, Long> interfaceC1480080ocQ;
        boolean z3;
        if (C1474810oTv.LLJJJJLIIL()) {
            this.LJJJJ.getClass();
            C1479960ocE c1479960ocE = this.LJJJ;
            c1479960ocE.LIZ = 0;
            c1479960ocE.LIZIZ = 0;
            this.LJJIJL = C786410Ut5.u3().getId();
            this.LJIIJ = 0;
            this.LJIIL = false;
            this.LJIILIIL = false;
            this.LJIILJJIL = false;
            this.LJIILL = 0;
            this.LJIIZILJ = false;
            this.LJIJ = false;
            this.LJJIZ = false;
            this.LJJJZ = false;
            LJJJIL(false);
            this.LJI = c1479510obV;
            this.LJIJJ = System.currentTimeMillis();
            if (c1479510obV.LJJJLZIJ != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.LJIIJJI = z3;
            if (this.LIZLLL == null) {
                LJIJI();
                return;
            }
            if (c1479510obV.LJJJJIZL && (!((Boolean) C1474810oTv.d3.getValue()).booleanValue() || this.LIZLLL.LLIZ <= 0)) {
                return;
            }
            if (c1479510obV.LJJJIL) {
                this.LIZLLL.LJJLIIIJ();
                this.LIZLLL.LJLLL();
                this.LIZLLL.LJJLIIIJLLLLLLLZ();
                this.LIZLLL = null;
                this.LJ.set(null);
                LJIJI();
                return;
            }
            C1479600obe.LIZ(c1479510obV.LJJJJJL, this);
            if (!z) {
                return;
            }
            this.LIZLLL.LJJLIIIIJ();
            return;
        }
        C1479960ocE c1479960ocE2 = this.LJJJ;
        c1479960ocE2.LIZ = 0;
        c1479960ocE2.LIZIZ = 0;
        this.LJJIJL = C786410Ut5.u3().getId();
        this.LJIIJ = 0;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = 0;
        this.LJIIZILJ = false;
        this.LJIJ = false;
        this.LJJIZ = false;
        this.LJJJZ = false;
        LJJJIL(false);
        this.LJI = c1479510obV;
        this.LJIJJ = System.currentTimeMillis();
        if (c1479510obV.LJJJLZIJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIJJI = z2;
        if (this.LIZLLL == null) {
            LJIJI();
            return;
        }
        if (c1479510obV.LJJJJIZL && (!((Boolean) C1474810oTv.d3.getValue()).booleanValue() || this.LIZLLL.LLIZ <= 0)) {
            return;
        }
        if (c1479510obV.LJJJIL) {
            this.LIZLLL.LJJLIIIJ();
            this.LIZLLL.LJLLL();
            this.LIZLLL.LJJLIIIJLLLLLLLZ();
            this.LIZLLL = null;
            this.LJ.set(null);
            LJIJI();
            return;
        }
        boolean z4 = c1479510obV.LJJJJJL;
        if (C1474810oTv.LLJJJJLIIL()) {
            this.LJJJJ.getClass();
            C1479600obe.LIZ(z4, this);
        } else {
            this.LJIJ = true;
            C1472250oPn c1472250oPn = this.LIZLLL;
            if (c1472250oPn != null) {
                c1472250oPn.LJJLIIJ(z4);
            }
            this.LJIJ = false;
            LJJJIL(false);
            this.LJIJI = 0;
            this.LJJIZ = false;
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "resetPlayer()");
            }
            if (this.LJI != null && ((Boolean) C1474810oTv.LLLLIIL.getValue()).booleanValue()) {
                C1479510obV c1479510obV2 = this.LJI;
                if (c1479510obV2.LJLIIIL && (interfaceC1480080ocQ = c1479510obV2.LLJL) != null) {
                    c1479510obV2.LJLIIL = interfaceC1480080ocQ.apply(c1479510obV2.LJLIIL);
                }
            }
        }
        if (!z) {
            return;
        }
        this.LIZLLL.LJJLIIIIJ();
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILLIIL(float f, float f2) {
        if (this.LIZLLL != null) {
            float adjustedVolume = C1480850odf.LIZJ.getAdjustedVolume();
            if (f == 1.0f && f2 == 1.0f && adjustedVolume > 0.0f) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AdjustedVolume set value : 1 -> ");
                    sbLIZ.append(adjustedVolume);
                    C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZLLL.LJLLI(adjustedVolume, adjustedVolume);
                return;
            }
            this.LIZLLL.LJLLI(f, f2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJZ(int i, JSONObject jSONObject) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJJ(i, jSONObject);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJILLIZJL(String str, String str2) {
        C1472250oPn c1472250oPn = this.LIZLLL;
        if (c1472250oPn != null) {
            c1472250oPn.LJJLL(str2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJJIZ(String str, boolean z) {
        if (this.LJI != null && !TextUtils.isEmpty(str) && str.equals(this.LJI.LJIIIZ)) {
            this.LJI.LJIILJJIL = z;
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLZ(String str, String str2) {
        String str3;
        String str4 = this.LJIIIIZZ;
        if (str4 != null && str4.equals(str) && (str3 = this.LJJIJIIJIL) != null && str3.equals(str2)) {
            return true;
        }
        return false;
    }

    public final void LJII(C1479510obV c1479510obV, Map<String, Object> map, boolean z) {
        int i;
        int i2;
        if (!z) {
            if (map != null) {
                HashMap map2 = (HashMap) map;
                map2.put("is_play_loop", Boolean.valueOf(c1479510obV.LJIIJJI.isPlayLoop()));
                int i3 = c1479510obV.LJJIZ;
                if (i3 > 0) {
                    map2.put("loop_start_time_ms", Integer.valueOf(i3));
                }
                int i4 = c1479510obV.LJJJ;
                if (i4 > 0) {
                    map2.put("loop_end_time_ms", Integer.valueOf(i4));
                }
                int i5 = c1479510obV.LLIIJI;
                if (i5 >= 0 && (i2 = c1479510obV.LLIIJLIL) >= 0 && i2 >= i5) {
                    map2.put("play_loop_start_time", Integer.valueOf(i5));
                    map2.put("play_loop_end_time", Integer.valueOf(c1479510obV.LLIIJLIL));
                    return;
                }
                return;
            }
            return;
        }
        int i6 = c1479510obV.LLIIJI;
        if (i6 < 0 || (i = c1479510obV.LLIIJLIL) < 0 || i < i6) {
            return;
        }
        this.LIZLLL.LJLI(i6, i);
    }

    public final void LJJI(C1479510obV c1479510obV, String str, boolean z) {
        LJJIFFI(c1479510obV, str, z, 0L, false);
    }

    public static void LJJJI(InterfaceC1480060ocO interfaceC1480060ocO, String str, int i, long j) {
        if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && j > 0) {
            interfaceC1480060ocO.LIZIZ(i, j, str);
        }
    }

    public final void LJIJJ(C1479510obV c1479510obV, Map<String, Object> map, long j, boolean z) {
        int iLongValue;
        Long l;
        int i = c1479510obV.LJJIL;
        if (i > 0) {
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf(i));
        }
        String str = this.LJIIIIZZ;
        if (str != null && (l = C1479780obw.LIZIZ.get(str)) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        C1479780obw.LIZIZ.clear();
        if (iLongValue > 0) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resume position : ");
                sbLIZ.append(iLongValue);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf(iLongValue));
        }
        if (z && j > 0) {
            ((HashMap) map).put("init_start_time_ms", Integer.valueOf((int) j));
        }
    }

    public final void LJJIIJ(String str, int i, C1477160oXi c1477160oXi, C1472990oQz c1472990oQz) {
        boolean z = true;
        SimRadar.errorScan("SimplifyPlayerImpl", "reportEmptyUrlPlayFailed", new C1473310oRV("EmptyUrl"), str);
        SimRadar.analyzer().getClass();
        C1472910oQr.LIZIZ("PF-1");
        if (this.LJJIIJ != null && ((Boolean) C1474810oTv.LJLJLJ.getValue()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("processUrlData", c1477160oXi.toString());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C1481290oeN c1481290oeN = new C1481290oeN(i, -203, -203, jSONObject, str);
            if (c1472990oQz == null) {
                z = false;
            }
            c1481290oeN.LIZLLL = z;
            c1481290oeN.LJIIIIZZ = LJIJJLI() ? 1 : 0;
            this.LJJIII.LIZ(new ARunnableS9S1300000_9(this.LJJIIJ, c1481290oeN, LJIIJJI(), str, 4));
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video_play_failed ");
                sbLIZ.append(c1481290oeN);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

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
    public final void LJJIFFI(C1479510obV c1479510obV, String str, boolean z, long j, boolean z2) {
        C1479510obV c1479510obV2;
        C1472250oPn c1472250oPn;
        C1479890oc7 c1479890oc7;
        if (c1479510obV == null) {
            SimRadar.errorScan("SimplifyPlayerImpl", "prepare", new C1473290oRT("PrepareData-NULL"), new Object[0]);
            SimRadar.analyzer().getClass();
            C1472910oQr.LIZIZ("SF-DataNull2");
            return;
        }
        boolean z3 = c1479510obV.LJJI;
        if (z3) {
            c1479510obV.LJIJJ = 4;
        }
        if (!z3) {
            LJJJI(this.LJJIJ, str, 6, System.currentTimeMillis());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepare, mStatus:");
            sbLIZ.append(this.LJIJI);
            sbLIZ.append(", prepareOnly:");
            sbLIZ.append(c1479510obV.LJJI);
            sbLIZ.append(" sourceId ");
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1479850oc3 c1479850oc3 = this.LJJJI;
        String str2 = c1479850oc3.LIZ;
        if (str2 == null || !str2.equals(str)) {
            c1479850oc3.LIZIZ = false;
            c1479850oc3.LIZJ = false;
            c1479850oc3.LIZLLL = false;
        }
        c1479850oc3.LIZ = str;
        this.LJJJZ = false;
        LJJJIL(false);
        this.LJJIIJZLJL = c1479510obV.LIZIZ;
        this.LJJIIZ = c1479510obV.LIZJ;
        int i = this.LJIJI;
        if (i >= 1 && i < 6 && (c1479510obV2 = this.LJI) != null && c1479510obV2.LJJI && TextUtils.equals(c1479510obV.LJIIIZ, c1479510obV2.LJIIIZ)) {
            C1479890oc7 c1479890oc72 = this.LJI.LJLZ;
            if (c1479890oc72 != null && (c1479890oc7 = c1479510obV.LJLZ) != null) {
                String str3 = c1479890oc72.LJ;
                String str4 = c1479890oc7.LJ;
                if (TextUtils.equals(str3, str4)) {
                    C1479890oc7 c1479890oc73 = c1479510obV.LJLZ;
                    boolean z4 = c1479890oc73.LIZJ;
                    C1479890oc7 c1479890oc74 = this.LJI.LJLZ;
                    if ((z4 != c1479890oc74.LIZJ && c1479890oc73.LIZ == EnumC1154900g9w.CLA_AUTO_DUBBING) || (c1479890oc73.LIZLLL != c1479890oc74.LIZLLL && c1479890oc73.LIZ == EnumC1154900g9w.CLA_ECOM_DUBBING)) {
                    }
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("refresh prerender dubbing, old=");
                    sbLIZ2.append(str3);
                    sbLIZ2.append(", new=");
                    sbLIZ2.append(str4);
                    sbLIZ2.append(", type=");
                    sbLIZ2.append(c1479510obV.LJLZ.LIZ);
                    sbLIZ2.append(", sourceId=");
                    sbLIZ2.append(str);
                    C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1479890oc7 c1479890oc75 = c1479510obV.LJLZ;
                EnumC1154900g9w enumC1154900g9w = c1479890oc75.LIZ;
                if (enumC1154900g9w == EnumC1154900g9w.CLA_AUTO_DUBBING) {
                    this.LIZLLL.LJLLLLLL(str4);
                } else if (enumC1154900g9w == EnumC1154900g9w.CLA_ECOM_DUBBING && c1479890oc75.LIZLLL != this.LJI.LJLZ.LIZLLL && !C1474810oTv.LJJIIJ()) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("refresh prerender dubbing by player reset, sourceId=");
                        sbLIZ3.append(str);
                        C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    this.LIZLLL.LJJLIIJ(false);
                }
            }
            C1479510obV c1479510obV3 = this.LJI;
            C1477160oXi c1477160oXi = c1479510obV3.LJJIJIIJIL;
            if (c1477160oXi != null) {
                c1479510obV.LJJIJIIJIL = c1477160oXi;
            }
            if (c1479510obV3.LJJJLZIJ != null && ((Boolean) C1474810oTv.W0.getValue()).booleanValue()) {
                c1479510obV.LJJJLZIJ = this.LJI.LJJJLZIJ;
            }
            C1479510obV c1479510obV4 = this.LJI;
            c1479510obV.LLJJI = c1479510obV4.LLJJI;
            c1479510obV.LLJJIJIL = c1479510obV4.LLJJIJIL;
            c1479510obV.LJJJJJ = c1479510obV4.LJJJJJ;
            int i2 = c1479510obV4.LLIIII;
            if (i2 != 0) {
                c1479510obV.LLIIII = i2;
            }
            this.LJJJ.LIZIZ = C786410Ut5.u3().getPriority();
            if (!C1474810oTv.LLJJLIIIJLLLLLLLZ()) {
                int i3 = this.LJI.LJLLL;
                int i4 = c1479510obV.LJLLL;
                if (i3 != i4) {
                    this.LIZLLL.LJLZ(i4);
                }
                if (((Boolean) C1474810oTv.W.getValue()).booleanValue() && this.LJI.LJLLI != c1479510obV.LJLLI) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("refresh prerender subtitles states, old: ");
                        sbLIZ4.append(this.LJI.LJLLI);
                        sbLIZ4.append("new: ");
                        sbLIZ4.append(c1479510obV.LJLLI);
                        sbLIZ4.append(", sourceId=");
                        sbLIZ4.append(str);
                        C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (c1479510obV.LJLLI) {
                        this.LIZLLL.LJLJLLL();
                    } else {
                        this.LIZLLL.LJLJJI(true);
                    }
                }
            }
            this.LJI = c1479510obV;
            this.LJJIL = c1479510obV.LJJI;
            if (C1474810oTv.LLJJLIIIJLLLLLLLZ()) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("prepare subtitle, mPrepareOnly=");
                    sbLIZ5.append(this.LJJIL);
                    sbLIZ5.append(", mStatus=");
                    sbLIZ5.append(this.LJIJI);
                    sbLIZ5.append(", sourceId=");
                    sbLIZ5.append(c1479510obV.LJIIIZ);
                    sbLIZ5.append(", subtitleEnable=");
                    sbLIZ5.append(c1479510obV.LJLLILLLL);
                    sbLIZ5.append(", sourceId=");
                    sbLIZ5.append(str);
                    C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ5));
                }
                int i5 = c1479510obV.LJLLL;
                if (i5 != 0) {
                    this.LIZLLL.LJJZZIII(i5, "header_play_init_subid");
                    this.LIZLLL.LJJZZIII(c1479510obV.LJLLJ ? 1 : 0, "subtitle_is_realtime_translated");
                }
                LJJJJ(true);
                this.LIZLLL.LJLJLJ(c1479510obV.LJLLILLLL);
                if (c1479510obV.LJLLILLLL) {
                    this.LIZLLL.LJLJJL();
                }
            }
            if (!TextUtils.isEmpty(c1479510obV.LLFFF) && (c1472250oPn = this.LIZLLL) != null) {
                c1472250oPn.LJLJI(c1479510obV.LLFFF);
            }
            C1480850odf c1480850odf = C1480850odf.LIZJ;
            if (c1480850odf.isPrerenderSurfaceSlowSetFix() || c1479510obV.LJJJJI) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "fix prerender surface slow : setSurface before start");
                Surface surface = this.LJI.LJJIFFI;
                if (surface != null) {
                    setSurface(surface);
                }
            }
            LJII(c1479510obV, null, true);
            if (this.LJIJI > 1 && !this.LJJIL) {
                this.LJIJI = 2;
                c1480850odf.getVideoEffectInfo(this.LJIIIIZZ);
                start();
                LJJJI(this.LJJIJ, str, 7, System.currentTimeMillis());
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("before real start ");
                sbLIZ6.append(SystemClock.elapsedRealtime());
                sbLIZ6.append(" sourceId ");
                sbLIZ6.append(str);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ6));
                return;
            }
            return;
        }
        if (((Number) C1474810oTv.i.getValue()).intValue() > 0) {
            try {
                Thread.sleep(((Number) r1.getValue()).intValue());
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        System.currentTimeMillis();
        c1479510obV.LLIIII = 0;
        this.LJJIL = c1479510obV.LJJI;
        LJJII(c1479510obV, str, z, j, z2);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
        InterfaceC1480060ocO interfaceC1480060ocO = this.LJJIJ;
        if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && iElapsedRealtime >= 0) {
            interfaceC1480060ocO.LIZ(4, iElapsedRealtime, str);
        }
        if (!c1479510obV.LJJI) {
            LJJJI(this.LJJIJ, str, 7, System.currentTimeMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x032b A[Catch: Exception -> 0x0964, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0334 A[Catch: Exception -> 0x0964, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06c0 A[Catch: Exception -> 0x0d18, TRY_ENTER, TryCatch #2 {Exception -> 0x0d18, blocks: (B:91:0x01ea, B:107:0x022a, B:110:0x02a5, B:131:0x033e, B:134:0x034d, B:137:0x035b, B:140:0x0375, B:143:0x0380, B:172:0x0463, B:175:0x0481, B:178:0x0493, B:194:0x04f3, B:199:0x0535, B:206:0x0557, B:211:0x05b6, B:214:0x061e, B:222:0x063e, B:229:0x0654, B:235:0x06c2, B:243:0x06e1, B:250:0x0797, B:253:0x080c, B:259:0x0840, B:267:0x087c, B:275:0x0894, B:282:0x08c5, B:285:0x08d0, B:288:0x08db, B:293:0x0915, B:296:0x091e, B:299:0x093e, B:302:0x094e, B:309:0x0967, B:281:0x08c0, B:242:0x06df, B:234:0x06c0, B:210:0x058f, B:205:0x0552, B:162:0x0408, B:171:0x045c, B:106:0x0227, B:92:0x01ef, B:94:0x01f3, B:96:0x01fb, B:98:0x0204, B:99:0x020a, B:101:0x0210, B:102:0x0218, B:104:0x021e), top: B:511:0x01ea, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06df A[Catch: Exception -> 0x0d18, TRY_ENTER, TryCatch #2 {Exception -> 0x0d18, blocks: (B:91:0x01ea, B:107:0x022a, B:110:0x02a5, B:131:0x033e, B:134:0x034d, B:137:0x035b, B:140:0x0375, B:143:0x0380, B:172:0x0463, B:175:0x0481, B:178:0x0493, B:194:0x04f3, B:199:0x0535, B:206:0x0557, B:211:0x05b6, B:214:0x061e, B:222:0x063e, B:229:0x0654, B:235:0x06c2, B:243:0x06e1, B:250:0x0797, B:253:0x080c, B:259:0x0840, B:267:0x087c, B:275:0x0894, B:282:0x08c5, B:285:0x08d0, B:288:0x08db, B:293:0x0915, B:296:0x091e, B:299:0x093e, B:302:0x094e, B:309:0x0967, B:281:0x08c0, B:242:0x06df, B:234:0x06c0, B:210:0x058f, B:205:0x0552, B:162:0x0408, B:171:0x045c, B:106:0x0227, B:92:0x01ef, B:94:0x01f3, B:96:0x01fb, B:98:0x0204, B:99:0x020a, B:101:0x0210, B:102:0x0218, B:104:0x021e), top: B:511:0x01ea, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0801 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0810 A[Catch: Exception -> 0x0964, TRY_ENTER, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0864 A[Catch: Exception -> 0x0964, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x088a A[Catch: Exception -> 0x0964, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08c0 A[Catch: Exception -> 0x0d18, TRY_ENTER, TryCatch #2 {Exception -> 0x0d18, blocks: (B:91:0x01ea, B:107:0x022a, B:110:0x02a5, B:131:0x033e, B:134:0x034d, B:137:0x035b, B:140:0x0375, B:143:0x0380, B:172:0x0463, B:175:0x0481, B:178:0x0493, B:194:0x04f3, B:199:0x0535, B:206:0x0557, B:211:0x05b6, B:214:0x061e, B:222:0x063e, B:229:0x0654, B:235:0x06c2, B:243:0x06e1, B:250:0x0797, B:253:0x080c, B:259:0x0840, B:267:0x087c, B:275:0x0894, B:282:0x08c5, B:285:0x08d0, B:288:0x08db, B:293:0x0915, B:296:0x091e, B:299:0x093e, B:302:0x094e, B:309:0x0967, B:281:0x08c0, B:242:0x06df, B:234:0x06c0, B:210:0x058f, B:205:0x0552, B:162:0x0408, B:171:0x045c, B:106:0x0227, B:92:0x01ef, B:94:0x01f3, B:96:0x01fb, B:98:0x0204, B:99:0x020a, B:101:0x0210, B:102:0x0218, B:104:0x021e), top: B:511:0x01ea, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08c9 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08d4 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0919 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0929 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0949 A[Catch: Exception -> 0x0964, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0964, blocks: (B:109:0x02a0, B:113:0x030e, B:115:0x0316, B:117:0x0319, B:118:0x031c, B:120:0x0320, B:121:0x0325, B:123:0x032b, B:124:0x032e, B:126:0x0334, B:133:0x0346, B:136:0x0352, B:139:0x036c, B:142:0x0379, B:146:0x038a, B:148:0x038e, B:150:0x0394, B:152:0x039a, B:154:0x03a4, B:155:0x03b2, B:157:0x03da, B:159:0x03e6, B:174:0x047a, B:177:0x048c, B:180:0x0497, B:182:0x049d, B:184:0x04a7, B:185:0x04af, B:190:0x04c1, B:191:0x04c5, B:193:0x04cb, B:188:0x04b9, B:196:0x0526, B:198:0x052e, B:202:0x0544, B:204:0x054c, B:209:0x055f, B:213:0x05e2, B:217:0x0631, B:219:0x0635, B:221:0x0639, B:252:0x0801, B:255:0x0810, B:257:0x0814, B:258:0x082a, B:261:0x0856, B:263:0x0860, B:265:0x0864, B:266:0x0877, B:269:0x0882, B:271:0x0886, B:273:0x088a, B:274:0x088f, B:278:0x089a, B:280:0x08a4, B:284:0x08c9, B:287:0x08d4, B:290:0x0900, B:292:0x0906, B:295:0x0919, B:298:0x0929, B:301:0x0949, B:304:0x0954, B:306:0x095e, B:160:0x03f0, B:161:0x03f8, B:164:0x040e, B:166:0x0430, B:168:0x043c, B:169:0x0446, B:170:0x044e), top: B:535:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a5d A[Catch: Exception -> 0x0b91, TRY_ENTER, TryCatch #7 {Exception -> 0x0b91, blocks: (B:322:0x09c6, B:324:0x09d5, B:325:0x09e5, B:327:0x09f4, B:328:0x09fe, B:330:0x0a04, B:334:0x0a0f, B:336:0x0a36, B:338:0x0a44, B:344:0x0a5d, B:346:0x0a61, B:348:0x0a67), top: B:521:0x09c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0bbf A[Catch: Exception -> 0x0c61, TryCatch #15 {Exception -> 0x0c61, blocks: (B:349:0x0a69, B:351:0x0a79, B:353:0x0a7f, B:354:0x0a8d, B:356:0x0a91, B:358:0x0a97, B:360:0x0a9d, B:362:0x0aaa, B:363:0x0aad, B:365:0x0ab4, B:367:0x0ac2, B:368:0x0ac5, B:370:0x0acb, B:372:0x0ad7, B:373:0x0ada, B:381:0x0afa, B:383:0x0b00, B:384:0x0b0b, B:386:0x0b29, B:387:0x0b32, B:397:0x0b49, B:407:0x0b63, B:417:0x0b81, B:374:0x0ae6, B:376:0x0aea, B:378:0x0aee, B:380:0x0af2, B:422:0x0b9a, B:424:0x0ba2, B:426:0x0baa, B:428:0x0bad, B:429:0x0bb0, B:431:0x0bb4, B:432:0x0bb9, B:434:0x0bbf, B:435:0x0bc2, B:437:0x0bc8, B:438:0x0bcb, B:440:0x0bdd, B:441:0x0bf5, B:443:0x0c01, B:444:0x0c04, B:446:0x0c25, B:454:0x0c4b, B:458:0x0c5e), top: B:537:0x0a5b }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0bc8 A[Catch: Exception -> 0x0c61, TryCatch #15 {Exception -> 0x0c61, blocks: (B:349:0x0a69, B:351:0x0a79, B:353:0x0a7f, B:354:0x0a8d, B:356:0x0a91, B:358:0x0a97, B:360:0x0a9d, B:362:0x0aaa, B:363:0x0aad, B:365:0x0ab4, B:367:0x0ac2, B:368:0x0ac5, B:370:0x0acb, B:372:0x0ad7, B:373:0x0ada, B:381:0x0afa, B:383:0x0b00, B:384:0x0b0b, B:386:0x0b29, B:387:0x0b32, B:397:0x0b49, B:407:0x0b63, B:417:0x0b81, B:374:0x0ae6, B:376:0x0aea, B:378:0x0aee, B:380:0x0af2, B:422:0x0b9a, B:424:0x0ba2, B:426:0x0baa, B:428:0x0bad, B:429:0x0bb0, B:431:0x0bb4, B:432:0x0bb9, B:434:0x0bbf, B:435:0x0bc2, B:437:0x0bc8, B:438:0x0bcb, B:440:0x0bdd, B:441:0x0bf5, B:443:0x0c01, B:444:0x0c04, B:446:0x0c25, B:454:0x0c4b, B:458:0x0c5e), top: B:537:0x0a5b }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0bdd A[Catch: Exception -> 0x0c61, TryCatch #15 {Exception -> 0x0c61, blocks: (B:349:0x0a69, B:351:0x0a79, B:353:0x0a7f, B:354:0x0a8d, B:356:0x0a91, B:358:0x0a97, B:360:0x0a9d, B:362:0x0aaa, B:363:0x0aad, B:365:0x0ab4, B:367:0x0ac2, B:368:0x0ac5, B:370:0x0acb, B:372:0x0ad7, B:373:0x0ada, B:381:0x0afa, B:383:0x0b00, B:384:0x0b0b, B:386:0x0b29, B:387:0x0b32, B:397:0x0b49, B:407:0x0b63, B:417:0x0b81, B:374:0x0ae6, B:376:0x0aea, B:378:0x0aee, B:380:0x0af2, B:422:0x0b9a, B:424:0x0ba2, B:426:0x0baa, B:428:0x0bad, B:429:0x0bb0, B:431:0x0bb4, B:432:0x0bb9, B:434:0x0bbf, B:435:0x0bc2, B:437:0x0bc8, B:438:0x0bcb, B:440:0x0bdd, B:441:0x0bf5, B:443:0x0c01, B:444:0x0c04, B:446:0x0c25, B:454:0x0c4b, B:458:0x0c5e), top: B:537:0x0a5b }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c01 A[Catch: Exception -> 0x0c61, TryCatch #15 {Exception -> 0x0c61, blocks: (B:349:0x0a69, B:351:0x0a79, B:353:0x0a7f, B:354:0x0a8d, B:356:0x0a91, B:358:0x0a97, B:360:0x0a9d, B:362:0x0aaa, B:363:0x0aad, B:365:0x0ab4, B:367:0x0ac2, B:368:0x0ac5, B:370:0x0acb, B:372:0x0ad7, B:373:0x0ada, B:381:0x0afa, B:383:0x0b00, B:384:0x0b0b, B:386:0x0b29, B:387:0x0b32, B:397:0x0b49, B:407:0x0b63, B:417:0x0b81, B:374:0x0ae6, B:376:0x0aea, B:378:0x0aee, B:380:0x0af2, B:422:0x0b9a, B:424:0x0ba2, B:426:0x0baa, B:428:0x0bad, B:429:0x0bb0, B:431:0x0bb4, B:432:0x0bb9, B:434:0x0bbf, B:435:0x0bc2, B:437:0x0bc8, B:438:0x0bcb, B:440:0x0bdd, B:441:0x0bf5, B:443:0x0c01, B:444:0x0c04, B:446:0x0c25, B:454:0x0c4b, B:458:0x0c5e), top: B:537:0x0a5b }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c25 A[Catch: Exception -> 0x0c61, TryCatch #15 {Exception -> 0x0c61, blocks: (B:349:0x0a69, B:351:0x0a79, B:353:0x0a7f, B:354:0x0a8d, B:356:0x0a91, B:358:0x0a97, B:360:0x0a9d, B:362:0x0aaa, B:363:0x0aad, B:365:0x0ab4, B:367:0x0ac2, B:368:0x0ac5, B:370:0x0acb, B:372:0x0ad7, B:373:0x0ada, B:381:0x0afa, B:383:0x0b00, B:384:0x0b0b, B:386:0x0b29, B:387:0x0b32, B:397:0x0b49, B:407:0x0b63, B:417:0x0b81, B:374:0x0ae6, B:376:0x0aea, B:378:0x0aee, B:380:0x0af2, B:422:0x0b9a, B:424:0x0ba2, B:426:0x0baa, B:428:0x0bad, B:429:0x0bb0, B:431:0x0bb4, B:432:0x0bb9, B:434:0x0bbf, B:435:0x0bc2, B:437:0x0bc8, B:438:0x0bcb, B:440:0x0bdd, B:441:0x0bf5, B:443:0x0c01, B:444:0x0c04, B:446:0x0c25, B:454:0x0c4b, B:458:0x0c5e), top: B:537:0x0a5b }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cdd A[Catch: Exception -> 0x0d12, TryCatch #6 {Exception -> 0x0d12, blocks: (B:467:0x0cd9, B:469:0x0cdd, B:470:0x0ce9, B:472:0x0cf4, B:477:0x0d0a, B:478:0x0d0e, B:475:0x0cfb, B:465:0x0cbb, B:466:0x0cca), top: B:519:0x0cbb }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0cf4 A[Catch: Exception -> 0x0d12, TryCatch #6 {Exception -> 0x0d12, blocks: (B:467:0x0cd9, B:469:0x0cdd, B:470:0x0ce9, B:472:0x0cf4, B:477:0x0d0a, B:478:0x0d0e, B:475:0x0cfb, B:465:0x0cbb, B:466:0x0cca), top: B:519:0x0cbb }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0cfb A[Catch: Exception -> 0x0d12, TryCatch #6 {Exception -> 0x0d12, blocks: (B:467:0x0cd9, B:469:0x0cdd, B:470:0x0ce9, B:472:0x0cf4, B:477:0x0d0a, B:478:0x0d0e, B:475:0x0cfb, B:465:0x0cbb, B:466:0x0cca), top: B:519:0x0cbb }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0971 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a4f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0b94 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0b50 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0b6e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x06b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C1479510obV r28, java.lang.String r29, boolean r30, long r31, boolean r33) {
        /*
            Method dump skipped, instruction units count: 3537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479490obT.LJJII(X.0obV, java.lang.String, boolean, long, boolean):void");
    }
}
