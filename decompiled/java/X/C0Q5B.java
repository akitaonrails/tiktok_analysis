package X;

import Y.AUListenerS218S0200000_10;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q5B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5B implements InterfaceC661540PxA {
    public final View LIZIZ;
    public final InterfaceC662180PyC LIZJ;
    public final C661490Px5 LIZLLL;
    public final boolean LJ;
    public C664340Q4a LJFF;
    public C662170PyB LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public HashMap<String, Object> LJIIJJI;
    public int LJIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final C1482640ogY LJIJJ;
    public SurfaceControl LJIJJLI;
    public Surface LJIL;
    public int LJJ;
    public InterfaceC1472010oPP LJJIFFI;
    public C0Q5F LJJII;
    public InterfaceC1010470cOz LJJIII;
    public InterfaceC660150Puv LJJIIJ;
    public InterfaceC659840PuQ LJJIIJZLJL;
    public boolean LJJIIZ;
    public C0Q5C LJJIIZI;
    public C0Q5K LJJIJ;
    public final C0R45 LJJIJIIJI;
    public String LJIIJ = "";
    public int LJIILIIL = -1;
    public boolean LJJI = true;

    @Override // X.InterfaceC661540PxA
    public final void LJJIIZI() {
        this.LJIILLIIL = false;
        this.LJIIZILJ = 0;
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null) {
            c0n0y.LJJIIZI();
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJJLIIIJLLLLLLLZ() {
        C664340Q4a c664340Q4a;
        this.LJIILJJIL = 0;
        this.LJIILL = false;
        this.LJIIIIZZ = false;
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null) {
            this.LJIIL = C2536109wl.LIZ() ? (int) c0n0y.getCurrentPosition() : 0;
            C664340Q4a c664340Q4a2 = this.LJFF;
            if (c664340Q4a2 != null) {
                c664340Q4a2.LJIJJLI();
            }
            c0n0y.release();
            C650700Pfg.LIZ(c0n0y);
            C661490Px5 c661490Px5 = this.LIZLLL;
            c661490Px5.LJIILIIL = null;
            C661550PxB c661550PxBLJ = c661490Px5.LJ();
            if (c661550PxBLJ != null) {
                c661550PxBLJ.LJFF = null;
            }
            InterfaceC662180PyC interfaceC662180PyC = this.LIZJ;
            if (interfaceC662180PyC != null) {
                interfaceC662180PyC.LIZ();
            }
            C664340Q4a c664340Q4a3 = this.LJFF;
            if (c664340Q4a3 != null) {
                c664340Q4a3.LJIILL();
            }
            if (!C256030A1p.LIZ() && (c664340Q4a = this.LJFF) != null) {
                Aweme aweme = this.LIZLLL.LIZJ;
                c664340Q4a.LJIL(aweme != null ? aweme.getAid() : null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release media box's player. ");
            sbLIZ.append(LJIIZILJ());
            sbLIZ.append(", aid:");
            Aweme aweme2 = this.LIZLLL.LIZJ;
            sbLIZ.append(aweme2 != null ? aweme2.getAid() : null);
            sbLIZ.append(", progress:");
            sbLIZ.append(this.LJIIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LIZ() {
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null) {
            c0n0y.seek(0.0f);
        }
    }

    @Override // X.InterfaceC661540PxA
    public final boolean LIZIZ() {
        return this.LJIJJ.Da();
    }

    @Override // X.InterfaceC661540PxA
    public final void LJ() {
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        CaptionItemModel captionItemModelLJIIIIZZ;
        Aweme aweme = this.LIZLLL.LIZJ;
        int i = (aweme == null || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) ? 0 : captionItemModelLJIIIIZZ.subId;
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y == null || (interfaceC1483670oiDLJIILL = c0n0y.LJIILL()) == null) {
            return;
        }
        interfaceC1483670oiDLJIILL.LJJLIIIJJI(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0N0Y LJIILIIL() {
        /*
            r5 = this;
            X.0Px5 r1 = r5.LIZLLL
            X.0N0Y r0 = r1.LJIILIIL
            if (r0 == 0) goto L7
            return r0
        L7:
            X.0PxB r1 = r1.LJ()
            if (r1 == 0) goto L5a
            X.0N0Y r3 = r1.LJFF
            if (r3 == 0) goto L55
            java.lang.String r4 = "shareInfo's player"
        L13:
            X.0Px5 r0 = r5.LIZLLL
            r0.LJIILIIL = r3
            X.0oiD r2 = r3.LJIILL()
            if (r2 == 0) goto L35
            X.0oiR r1 = r2.LJIILIIL()
            X.0oeE r0 = new X.0oeE
            r0.<init>()
            r1.LIZIZ(r0)
            X.0oiR r1 = r2.LJIILIIL()
            X.0N0n r0 = new X.0N0n
            r0.<init>()
            r1.LIZ(r0)
        L35:
            boolean r0 = X.C650560PfS.LIZ
            if (r0 == 0) goto L54
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "create player, "
            r1.append(r0)
            java.lang.String r0 = r5.LJIIZILJ()
            r1.append(r0)
            java.lang.String r0 = ", source:"
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
        L54:
            return r3
        L55:
            if (r1 == 0) goto L5a
            r0 = -1
            r1.LJ = r0
        L5a:
            X.0Pfh r0 = X.C640060P8q.LIZ
            X.0N0Y r3 = r0.LIZ()
            if (r1 == 0) goto L64
            r1.LJFF = r3
        L64:
            int r0 = r3.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = X.C650700Pfg.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r2, r0)
            r1.size()
            java.lang.String r4 = "player pool allocate"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q5B.LJIILIIL():X.0N0Y");
    }

    public final String LJIIZILJ() {
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Player{");
            sbLIZ.append(Integer.toHexString(hashCode()));
            sbLIZ.append(" player=null}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Player{");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        sbLIZ2.append(" player=");
        sbLIZ2.append(Integer.toHexString(c0n0y.hashCode()));
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJIJJLI() {
        SurfaceControl surfaceControl = this.LJIJJLI;
        if (surfaceControl != null && Build.VERSION.SDK_INT >= 29) {
            new SurfaceControl.Transaction().reparent(surfaceControl, null).setVisibility(surfaceControl, false).apply();
            surfaceControl.release();
        }
        this.LJIJJLI = null;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJJI = true;
    }

    @Override // X.InterfaceC661540PxA
    public final long getCurrentPosition() {
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y == null) {
            return 0L;
        }
        return c0n0y.getCurrentPosition();
    }

    @Override // X.InterfaceC661540PxA
    public final boolean isMute() {
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y == null) {
            return false;
        }
        return c0n0y.isMute();
    }

    @Override // X.InterfaceC661540PxA
    public final boolean isPlaying() {
        C0N0Y c0n0y;
        int i = this.LJIILJJIL;
        if (i == 4 || i == 1) {
            return true;
        }
        return (i == 2 || (c0n0y = this.LIZLLL.LJIILIIL) == null || !c0n0y.isPlaying()) ? false : true;
    }

    @Override // X.InterfaceC661540PxA
    public final boolean pause() {
        C0N0Y c0n0y;
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        InterfaceC1010450cOx interfaceC1010450cOxNe2;
        if (this.LJIILJJIL == 4) {
            this.LJIILJJIL = 0;
        }
        Pair pair = this.LIZLLL.LJIILIIL == null ? new Pair(Boolean.FALSE, "player = null") : this.LJIILJJIL == 2 ? new Pair(Boolean.FALSE, "current is execute pausing") : new Pair(Boolean.TRUE, "success");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check pause conditions failed, ");
            sbLIZ.append(LJIIZILJ());
            sbLIZ.append(", reason: ");
            sbLIZ.append((String) pair.getSecond());
            C2188811AlT.LIZIZ(sbLIZ);
            C664340Q4a c664340Q4a = this.LJFF;
            if (c664340Q4a != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pause failed reason:");
                sbLIZ2.append((String) pair.getSecond());
                c664340Q4a.LLJILLL.put(Long.valueOf(jCurrentTimeMillis), C2188811AlT.LIZIZ(sbLIZ2));
            }
            return false;
        }
        this.LJIILJJIL = 2;
        if (C0Q6P.LIZJ() != null) {
            C0Q6P.LIZLLL(null);
            C0Q6P.LIZJ = true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("pauseVideo, aid: ");
        Aweme aweme = this.LIZLLL.LIZJ;
        sbLIZ3.append(aweme != null ? aweme.getAid() : null);
        sbLIZ3.append(", progress: ");
        sbLIZ3.append(this.LJIIL);
        C2188811AlT.LIZIZ(sbLIZ3);
        IEarphonePlayerControlService iEarphonePlayerControlService = (IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class);
        if (iEarphonePlayerControlService.LJ()) {
            iEarphonePlayerControlService.LIZJ("search_video_card", false);
        }
        C0N0Y c0n0y2 = this.LIZLLL.LJIILIIL;
        if (c0n0y2 != null) {
            c0n0y2.LIZ();
        }
        InterfaceC662180PyC interfaceC662180PyC = this.LIZJ;
        if (interfaceC662180PyC != null) {
            interfaceC662180PyC.LIZIZ();
        }
        C664340Q4a c664340Q4a2 = this.LJFF;
        if (c664340Q4a2 != null) {
            c664340Q4a2.LLJJJ();
        }
        if (!C0C1D.LIZ()) {
            InterfaceC660150Puv interfaceC660150Puv = this.LJJIIJ;
            if (interfaceC660150Puv != null && (interfaceC1010450cOxNe2 = interfaceC660150Puv.ne()) != null) {
                interfaceC1010450cOxNe2.LLLLLLJ();
            }
            InterfaceC1010470cOz interfaceC1010470cOz = this.LJJIII;
            if (interfaceC1010470cOz != null && (interfaceC1010450cOxNe = interfaceC1010470cOz.ne()) != null) {
                interfaceC1010450cOxNe.LLLLLLJ();
            }
        }
        if (((Number) C0BDB.LIZ.getValue()).intValue() != 1) {
            C1478160oZK.LIZ().LIZ();
        }
        if (this.LJIILLIIL && (c0n0y = this.LIZLLL.LJIILIIL) != null) {
            c0n0y.LJJIIZI();
        }
        return true;
    }

    @Override // X.InterfaceC661540PxA
    public final void play() {
        C664340Q4a c664340Q4a;
        if (this.LJIJJ.Da()) {
            LJIJJ("play");
        } else {
            this.LJIILJJIL = 4;
        }
        if (!C291320BbO.LIZ() || (c664340Q4a = this.LJFF) == null) {
            return;
        }
        c664340Q4a.LLJILJIL = new Exception();
        c664340Q4a.LLJILJILJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC661540PxA
    public final void LIZJ() {
        Pair pair;
        Aweme aweme;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        if (!C07H8.LIZIZ() || (aweme = this.LIZLLL.LIZJ) == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null || list.isEmpty()) {
            Aweme aweme2 = this.LIZLLL.LIZJ;
            if (aweme2 == null) {
                pair = new Pair(Boolean.FALSE, "aweme is null.");
            } else {
                Video video2 = aweme2.getVideo();
                pair = (video2 == null || video2.getProperPlayAddr() == null) ? new Pair(Boolean.FALSE, "video's playAddress struct is null.") : isPlaying() ? new Pair(Boolean.FALSE, "current is playing.") : this.LJIILL ? new Pair(Boolean.FALSE, "current has play first frame.") : this.LJIIIIZZ ? new Pair(Boolean.FALSE, "current perform prepare next finished.") : new Pair(Boolean.TRUE, "success");
            }
        } else {
            pair = new Pair(Boolean.FALSE, "subtitle need disable.");
        }
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check prepare conditions failed, reason: ");
            sbLIZ.append((String) pair.getSecond());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        C0N0Y c0n0yLJIILIIL = LJIILIIL();
        c0n0yLJIILIIL.LJJIJ(this.LJI);
        c0n0yLJIILIIL.setSurface(this.LJIL);
        Aweme aweme3 = this.LIZLLL.LIZJ;
        if (aweme3 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C1479890oc7 c1479890oc7LIZ = C1483430ohp.LIZ(aweme3, "prepareNext");
        if (c1479890oc7LIZ != null && c1479890oc7LIZ.LIZIZ && C1474810oTv.LJJIIJ()) {
            return;
        }
        Video video3 = aweme3.getVideo();
        if (video3 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        video3.setRationAndSourceId(aweme3.getAid());
        C1479720obq c1479720obq = new C1479720obq();
        SimVideo simVideoLIZLLL = C1481240oeI.LIZLLL(video3);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLIZLLL;
        c1479530obX.LJIIJ = true;
        c1479720obq.LIZ.LJIL = video3.isNeedSetCookie();
        String str = this.LJIIJ;
        if (str.length() == 0) {
            str = "search_outer_general";
        }
        c1479720obq.LIZJ(str);
        List<C1476750oX3> listConvertToSimAudio = Audio.Companion.convertToSimAudio(video3, aweme3.getAudio(), "prepareNext", aweme3.getAid());
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJ = listConvertToSimAudio;
        c1479530obX2.LJFF = c1479890oc7LIZ;
        c1479530obX2.LJIIJJI = this.LJIIL;
        if (C256010A1n.LIZ()) {
            c1479720obq.LIZ.LJIIIZ = this.LIZLLL.LJJIFFI == 0;
        }
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("prepareNext, ");
            sbLIZ2.append(LJIIZILJ());
            sbLIZ2.append(", aid:");
            sbLIZ2.append(aweme3.getAid());
            sbLIZ2.append(", progress:");
            sbLIZ2.append(this.LJIIL);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        c0n0yLJIILIIL.LJJJZ(c1479720obq.LIZ());
        this.LJIIIIZZ = true;
    }

    @Override // X.InterfaceC661540PxA
    public final void LJI() {
        C661550PxB c661550PxBLJ;
        String aid;
        String str = "";
        if (!C256030A1p.LIZ()) {
            C664340Q4a c664340Q4a = this.LJFF;
            if (c664340Q4a != null) {
                Aweme aweme = this.LIZLLL.LIZJ;
                c664340Q4a.LJIL(aweme != null ? aweme.getAid() : null);
            }
            C661490Px5 c661490Px5 = this.LIZLLL;
            c661490Px5.LJJIJIIJIL = null;
            c661490Px5.LJJIJLIJ = "";
        }
        if (!C658210Prn.LIZ() || (c661550PxBLJ = this.LIZLLL.LJ()) == null) {
            return;
        }
        C0N0Y c0n0yLIZ = this.LIZLLL.LJIILIIL;
        if (c0n0yLIZ == null) {
            c0n0yLIZ = C640060P8q.LIZ.LIZ();
        }
        if (!this.LJIILL) {
            String strLIZIZ = "operate:";
            if ((C658210Prn.LIZIZ() & 1) == 1) {
                C1483340ohg.LJIL(409600, this.LIZLLL.LIZJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("operate:");
                sbLIZ.append("preload, ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if ((C658210Prn.LIZIZ() & 2) == 2) {
                c0n0yLIZ.LJJJJL(this.LIZLLL.LIZJ, EnumC2281141EQm.Undefine);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("prerender,");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("enter detail, sync playerManger operate:");
                sbLIZ3.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        C661490Px5 c661490Px52 = this.LIZLLL;
        C0N0Y c0n0y = c661490Px52.LJIILIIL;
        Aweme aweme2 = c661490Px52.LIZJ;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str = aid;
        }
        C0Q0N.LIZ(c0n0y, str);
        C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
        c1012040cRWLIZIZ.LIZ = c0n0yLIZ;
        c1012040cRWLIZIZ.LIZJ = c661550PxBLJ.LIZLLL;
        c1012040cRWLIZIZ.LJIIL = c661550PxBLJ.LJ;
        c1012040cRWLIZIZ.LJFF = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C661490Px5 c661490Px53 = this.LIZLLL;
        long j = c661490Px53.LJJIJ;
        if (j != -1) {
            c661490Px53.LJJIJIIJI += jCurrentTimeMillis - j;
        }
        C664430Q4j.LJIIIIZZ = jCurrentTimeMillis;
        C664430Q4j.LJFF = true;
        if (c0n0yLIZ.isPlaying()) {
            C661490Px5 c661490Px54 = this.LIZLLL;
            C664430Q4j.LJIIIZ += c661490Px54.LJJIJIIJI;
            c661490Px54.LJJIJIIJI = 0L;
        }
        Aweme aweme3 = this.LIZLLL.LIZJ;
        if (aweme3 != null) {
            C0P9I.LIZ(aweme3);
        }
        this.LIZLLL.LJIILIIL = null;
        c661550PxBLJ.LJFF = null;
        c661550PxBLJ.LJI = -1;
        c661550PxBLJ.LJII = false;
        c661550PxBLJ.LJ = -1;
    }

    @Override // X.InterfaceC661540PxA
    public final void release() {
        LJJLIIIJLLLLLLLZ();
        LJIJJLI();
    }

    @Override // X.InterfaceC661540PxA
    public final boolean LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC661540PxA
    public final void LIZLLL(int i) {
        if (this.LJJ != i) {
            this.LJJ = i;
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIIIIZZ(InterfaceC659840PuQ interfaceC659840PuQ) {
        if (C0C1D.LIZ()) {
            return;
        }
        this.LJJIIJZLJL = interfaceC659840PuQ;
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIIIZ(C659540Ptw c659540Ptw) {
        if (!this.LJIILL) {
            c659540Ptw.onFailed();
            return;
        }
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null && c0n0y.isPlaying()) {
            LJIJI(c659540Ptw);
            return;
        }
        this.LJJIIZ = true;
        this.LJJIJ = c659540Ptw;
        play();
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIIJJI(C0Q5F c0q5f) throws JSONException {
        this.LJJII = c0q5f;
        LJIILLIIL(c0q5f);
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIIL(InterfaceC2453409jQ<? extends C664340Q4a> interfaceC2453409jQ) {
        if (this.LJFF == null) {
            this.LJFF = interfaceC2453409jQ.get();
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIILJJIL(boolean z) {
        if (z) {
            C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
            if (c0n0y != null) {
                c0n0y.LJFF();
                return;
            }
            return;
        }
        C0N0Y c0n0y2 = this.LIZLLL.LJIILIIL;
        if (c0n0y2 == null) {
            return;
        }
        c0n0y2.LJIJJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147 A[PHI: r15
      0x0147: PHI (r15v1 boolean) = (r15v0 boolean), (r15v3 boolean) binds: [B:68:0x0143, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0PyB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r27) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q5B.LJIILL(int):void");
    }

    public final void LJIILLIIL(C0Q5F c0q5f) throws JSONException {
        C0N0Y c0n0y;
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        if (c0q5f != null && (c0n0y = this.LIZLLL.LJIILIIL) != null && (interfaceC1483670oiDLJIILL = c0n0y.LJIILL()) != null) {
            if (c0q5f.LIZ) {
                C0Q5I c0q5i = c0q5f.LIZJ;
                if (c0q5i != null) {
                    C0Q5T c0q5t = C0Q5T.LIZ;
                    String str = c0q5i.LIZ;
                    CaptionItemModel captionItemModel = c0q5i.LIZJ;
                    c0q5t.getClass();
                    JSONObject jSONObject = new JSONObject();
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str);
                    jSONObject.put("language", captionItemModel.languageCode);
                    jSONObject.put("url", captionItemModel.url);
                    jSONObject.put("sub_id", captionItemModel.subId);
                    jSONObject.put("expire", -1);
                    jSONObject.put("language_id", 1);
                    jSONObject.put("format", "webvtt");
                    jSONObject.put("source", "MU");
                    jSONObject.put("version", "");
                    jSONObject.put("is_realtime_translated", captionItemModel.isRealtimeTranslated());
                    interfaceC1483670oiDLJIILL.LJJJZ(c0q5f.LIZJ.LIZIZ, jSONObject);
                    if (C650560PfS.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("do switch subtitle, add subtitle language, aid: ");
                        sbLIZ.append(c0q5f.LIZJ.LIZ);
                        sbLIZ.append(", captionModel: ");
                        sbLIZ.append(c0q5f.LIZJ.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    return;
                }
                return;
            }
            Integer num = c0q5f.LIZIZ;
            if (num == null) {
                return;
            }
            interfaceC1483670oiDLJIILL.LJJLIIIJJI(num.intValue());
            if (!C650560PfS.LIZ) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("do switch subtitle, switch subtitle language, subtitleId: ");
            sbLIZ2.append(c0q5f.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final SurfaceControl LJIJ(SurfaceView surfaceView) {
        SurfaceControl surfaceControl = this.LJIJJLI;
        if (surfaceControl != null) {
            return surfaceControl;
        }
        SurfaceControl surfaceControl2 = surfaceView.getSurfaceControl();
        SurfaceControl.Builder builder = new SurfaceControl.Builder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_surface_layer_");
        sbLIZ.append(Integer.toHexString(hashCode()));
        SurfaceControl surfaceControlBuild = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setParent(surfaceControl2).build();
        this.LJIJJLI = surfaceControlBuild;
        return surfaceControlBuild;
    }

    public final void LJIJI(C0Q5K c0q5k) {
        int videoWidth;
        int videoHeight;
        int iIndexOfChild;
        int height;
        int i;
        float f;
        ValueAnimator valueAnimatorOfFloat;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (this.LJJIIZI == null) {
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this.LIZIZ);
            if (fragmentLIZLLL != null && (view = fragmentLIZLLL.getView()) != null && (viewGroup = (ViewGroup) view.findViewById(R.id.ue6)) != null) {
                this.LJJIIZI = new C0Q5C(viewGroup);
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("enterFullScreen, search rootView:");
                    sbLIZ.append(viewGroup);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else if (c0q5k != null) {
                c0q5k.onFailed();
            }
        }
        if (this.LJIJ <= 0 || this.LJIJI <= 0) {
            C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
            if (c0n0y != null) {
                videoWidth = c0n0y.getVideoWidth();
            } else {
                videoWidth = 0;
            }
            this.LJIJ = videoWidth;
            C0N0Y c0n0y2 = this.LIZLLL.LJIILIIL;
            if (c0n0y2 != null) {
                videoHeight = c0n0y2.getVideoHeight();
            } else {
                videoHeight = 0;
            }
            this.LJIJI = videoHeight;
        }
        this.LJJIIZ = false;
        C0Q5E c0q5eLIZ = C0Q5G.LIZ(this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), this.LJIJ, this.LJIJI);
        this.LIZIZ.removeOnAttachStateChangeListener(this.LJJIJIIJI);
        C0Q5C c0q5c = this.LJJIIZI;
        if (c0q5c != null) {
            View view2 = this.LIZIZ;
            final AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(this, c0q5k, 136);
            if (!c0q5c.LIZJ) {
                c0q5c.LJII = view2;
                c0q5c.LJIIIIZZ = c0q5eLIZ;
                c0q5c.LIZJ = true;
                ViewParent parent = view2.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                }
                c0q5c.LIZLLL = viewGroup2;
                c0q5c.LJFF = view2.getLayoutParams();
                ViewGroup viewGroup3 = c0q5c.LIZLLL;
                if (viewGroup3 != null) {
                    iIndexOfChild = viewGroup3.indexOfChild(view2);
                } else {
                    iIndexOfChild = -1;
                }
                c0q5c.LJ = iIndexOfChild;
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                Rect rect = c0q5c.LJI;
                int i2 = iArr[0];
                rect.set(i2, iArr[1], view2.getWidth() + i2, iArr[1] + view2.getHeight());
                FrameLayout frameLayout = new FrameLayout(c0q5c.LIZ.getContext());
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(-16777216);
                C786410Ut5.U4(frameLayout, 0.0f);
                frameLayout.setClickable(false);
                frameLayout.setFocusable(true);
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Q5H
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            return true;
                        }
                        return false;
                    }
                });
                c0q5c.LIZIZ = frameLayout;
                ViewGroup viewGroup4 = c0q5c.LIZLLL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJJJLZIJ(view2, viewGroup4);
                }
                c0q5c.LIZ.addView(c0q5c.LIZIZ);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c0q5c.LJI.width(), c0q5c.LJI.height());
                Rect rect2 = c0q5c.LJI;
                layoutParams.leftMargin = rect2.left;
                layoutParams.topMargin = rect2.top;
                C786410Ut5.W5(view2, layoutParams);
                FrameLayout frameLayout2 = c0q5c.LIZIZ;
                if (frameLayout2 != null) {
                    frameLayout2.addView(view2);
                }
                if (view2 instanceof TextureView) {
                    final TextureView textureView = (TextureView) view2;
                    FrameLayout frameLayout3 = c0q5c.LIZIZ;
                    if (frameLayout3 != null) {
                        int iLIZJ = C497820Jfg.LIZJ(textureView.getContext());
                        boolean z = C14LC.LJIIIZ;
                        int i3 = C309690CBz.LIZ.LJ.LIZIZ;
                        int width = c0q5c.LIZ.getWidth();
                        if (C301300BrU.LIZ()) {
                            height = c0q5c.LIZ.getHeight() - iLIZJ;
                        } else {
                            height = c0q5c.LIZ.getHeight();
                        }
                        int i4 = height - i3;
                        float f2 = width;
                        float f3 = i4;
                        float fMin = Math.min(f2 / c0q5eLIZ.LIZJ, f3 / c0q5eLIZ.LIZLLL);
                        final int i5 = (int) (c0q5eLIZ.LIZJ * fMin);
                        final int i6 = (int) (c0q5eLIZ.LIZLLL * fMin);
                        final int i7 = (width - i5) / 2;
                        if (C301300BrU.LIZ()) {
                            i = ((i4 - i6) / 2) + iLIZJ;
                        } else {
                            i = (i4 - i6) / 2;
                        }
                        final C0Q5N c0q5n = new C0Q5N(i7, i, width, i4, i5, i6, c0q5eLIZ.LIZJ, c0q5eLIZ.LIZLLL);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textureView, (Property<TextureView, Float>) View.SCALE_X, 1.0f, i5 / c0q5c.LJI.width());
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textureView, (Property<TextureView, Float>) View.SCALE_Y, 1.0f, i6 / c0q5c.LJI.height());
                        float fCenterX = c0q5c.LJI.centerX();
                        float fCenterY = c0q5c.LJI.centerY();
                        float f4 = (f2 / 2.0f) - fCenterX;
                        if (C301300BrU.LIZ()) {
                            f = iLIZJ + (f3 / 2.0f);
                        } else {
                            f = f3 / 2.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textureView, (Property<TextureView, Float>) View.TRANSLATION_X, 0.0f, f4);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textureView, (Property<TextureView, Float>) View.TRANSLATION_Y, 0.0f, f - fCenterY);
                        float f5 = c0q5eLIZ.LJ;
                        if (f5 > 1.0f) {
                            valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS218S0200000_10(c0q5eLIZ, textureView, 1));
                        } else {
                            valueAnimatorOfFloat = ValueAnimator.ofFloat(c0q5eLIZ.LJFF, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS218S0200000_10(c0q5eLIZ, textureView, 2));
                        }
                        if (C650560PfS.LIZ) {
                            c0q5eLIZ.toString();
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, valueAnimatorOfFloat);
                        final int i8 = i;
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0Q5S
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                TextureView textureView2 = textureView;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView2);
                                textureView2.setScaleX(1.0f);
                                TextureView textureView3 = textureView;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView3);
                                textureView3.setScaleY(1.0f);
                                TextureView textureView4 = textureView;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView4);
                                textureView4.setTranslationX(0.0f);
                                TextureView textureView5 = textureView;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureView5);
                                textureView5.setTranslationY(0.0f);
                                TextureView textureView6 = textureView;
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i6);
                                int i9 = i7;
                                int i10 = i8;
                                layoutParams2.leftMargin = i9;
                                layoutParams2.topMargin = i10;
                                C786410Ut5.V5(textureView6, layoutParams2);
                                Function1<C0Q5N, Unit> function1 = awS376S0200000_10;
                                if (function1 != null) {
                                    function1.invoke(c0q5n);
                                }
                            }
                        });
                        animatorSet.start();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q5B.LJIJJ(java.lang.String):void");
    }

    @Override // X.InterfaceC661540PxA
    public final void LJJIJIIJI(int i) {
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null && c0n0y.isPlaying()) {
            if (i > 0) {
                c0n0y.LJJIJIIJI(i);
                return;
            } else {
                c0n0y.LJJIIZ();
                return;
            }
        }
        this.LJIILLIIL = true;
        this.LJIIZILJ = i;
    }

    @Override // X.InterfaceC661540PxA
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        this.LJJIFFI = interfaceC1472010oPP;
        if (interfaceC1472010oPP == null) {
            this.LJJII = null;
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJJIJLIJ(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        C0N0Y c0n0y = this.LIZLLL.LJIILIIL;
        if (c0n0y != null && (interfaceC1483670oiDLJIILL = c0n0y.LJIILL()) != null) {
            interfaceC1483670oiDLJIILL.LJJIJLIJ(z);
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        C664400Q4g c664400Q4g2 = this.LIZLLL.LJJIJIL;
        if (c664400Q4g2 == null || c664400Q4g2.LJIIIIZZ()) {
            this.LIZLLL.LJJIJIL = c664400Q4g;
        }
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPlayMetrics, old:");
            sbLIZ.append(c664400Q4g2);
            sbLIZ.append(", new:");
            sbLIZ.append(c664400Q4g);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJIIJ(Aweme aweme, String str, String str2) {
        String str3;
        C664340Q4a c664340Q4a = this.LJFF;
        if (c664340Q4a != null) {
            c664340Q4a.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "reset");
        }
        this.LJII = false;
        if (C2536109wl.LIZ()) {
            this.LJIIL = 0;
        }
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        HashMap<String, Object> map = new HashMap<>();
        C653660PkS c653660PkS = this.LIZLLL.LJIL;
        if (c653660PkS == null || (str3 = c653660PkS.LJIIIIZZ) == null) {
            str3 = "";
        }
        map.put("enter_from", str3);
        map.put("is_fullscreen", 0);
        map.put("play_order", Integer.valueOf(this.LIZLLL.LJJIFFI));
        this.LJIIJJI = map;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind aweme data, ");
            sbLIZ.append(LJIIZILJ());
            sbLIZ.append(", aid:");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", rank:");
            sbLIZ.append(this.LIZLLL.LJJIFFI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public C0Q5B(View view, InterfaceC662180PyC interfaceC662180PyC, C661490Px5 c661490Px5, boolean z) {
        String str;
        C1482640ogY c1482640ogY;
        this.LIZIZ = view;
        this.LIZJ = interfaceC662180PyC;
        this.LIZLLL = c661490Px5;
        this.LJ = z;
        this.LJJ = 2;
        C0R45 c0r45 = new C0R45(this, 43);
        this.LJJIJIIJI = c0r45;
        if (view instanceof C1473990oSb) {
            C1473990oSb c1473990oSb = (C1473990oSb) view;
            Object tag = c1473990oSb.getTag();
            if (tag instanceof C1482640ogY) {
                c1482640ogY = (C1482640ogY) tag;
            } else {
                c1482640ogY = new C1482640ogY();
                c1482640ogY.LL = new SurfaceViewWrapper(c1473990oSb);
                c1473990oSb.setTag(c1482640ogY);
            }
            this.LJIJJ = c1482640ogY;
        } else if (view instanceof C1473870oSP) {
            this.LJIJJ = C1482640ogY.LJIIIIZZ((C1473870oSP) view);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoView is unsupported type, it is: ");
            sbLIZ.append(view);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        view.addOnAttachStateChangeListener(c0r45);
        this.LJIJJ.Dn(new InterfaceC1473950oSX() { // from class: X.0Q5D
            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
                C0Q5B c0q5b = this.LL;
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("<onSurfaceDestroyed>, ");
                    sbLIZ2.append(c0q5b.LJIIZILJ());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                this.LL.LJIJJLI();
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                C0Q5B c0q5b = this.LL;
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("<onSurfaceAvailable>, ");
                    sbLIZ2.append(c0q5b.LJIIZILJ());
                    sbLIZ2.append(", w:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", h:");
                    sbLIZ2.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                C0Q5B c0q5b2 = this.LL;
                View view2 = c0q5b2.LIZIZ;
                if (view2 instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c0q5b2.LJIL = new Surface(c0q5b2.LJIJ(surfaceView));
                    } else {
                        c0q5b2.LJIL = c0q5b2.LJIJJ.getSurface();
                    }
                } else if (view2 instanceof TextureView) {
                    c0q5b2.LJIL = c0q5b2.LJIJJ.getSurface();
                }
                C0Q5B c0q5b3 = this.LL;
                if (c0q5b3.LJIILJJIL == 4) {
                    c0q5b3.LJIJJ("surfaceAvailable");
                    return;
                }
                if (!C643410PLn.LIZ()) {
                    return;
                }
                C0Q5B c0q5b4 = this.LL;
                C0N0Y c0n0y = c0q5b4.LIZLLL.LJIILIIL;
                if (c0n0y == null) {
                    return;
                }
                c0n0y.LJJIL(c0q5b4.LJIL);
            }
        });
        if (InterfaceC661540PxA.LIZ) {
            if (C0Q5U.LIZ < 0) {
                C0Q5U.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 2, "search_player_resize_mode_for_test", true);
            }
            this.LJJ = C0Q5U.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init, ");
            sbLIZ2.append(LJIIZILJ());
            sbLIZ2.append(", videoView: ");
            if (view instanceof SurfaceView) {
                str = "surfaceView";
            } else {
                str = "textureView";
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.InterfaceC661540PxA
    public final void LJII(InterfaceC1010470cOz interfaceC1010470cOz, InterfaceC660150Puv interfaceC660150Puv, boolean z, final Aweme aweme) {
        if (C0C1D.LIZ()) {
            return;
        }
        this.LJJIII = null;
        this.LJJIIJ = null;
        if (z) {
            return;
        }
        InterfaceC1010860cPc interfaceC1010860cPc = new InterfaceC1010860cPc() { // from class: X.0PyL
            @Override // X.InterfaceC1010860cPc
            public final Context LIZ() {
                return this.LIZ.LIZIZ.getContext();
            }

            @Override // X.InterfaceC1010860cPc
            public final Aweme getAweme() {
                Aweme aweme2 = aweme;
                return aweme2 == null ? this.LIZ.LIZLLL.LIZJ : aweme2;
            }

            @Override // X.InterfaceC1010860cPc
            public final long getCurrentPosition() {
                return this.LIZ.getCurrentPosition();
            }

            @Override // X.InterfaceC1010860cPc
            public final View getView() {
                return this.LIZ.LIZIZ;
            }

            @Override // X.InterfaceC1010860cPc
            public final boolean isPlaying() {
                return this.LIZ.isPlaying();
            }

            @Override // X.InterfaceC1010860cPc
            public final boolean isMute() {
                return C659080PtC.LIZIZ();
            }
        };
        if (interfaceC1010470cOz != null) {
            interfaceC1010470cOz.ik(interfaceC1010860cPc);
        } else {
            interfaceC1010470cOz = null;
        }
        this.LJJIII = interfaceC1010470cOz;
        if (interfaceC660150Puv != null) {
            interfaceC660150Puv.ik(interfaceC1010860cPc);
        } else {
            interfaceC660150Puv = null;
        }
        this.LJJIIJ = interfaceC660150Puv;
    }

    public final void LJIL(int i, int i2, SurfaceView surfaceView, String str) {
        int width;
        int height;
        View view;
        View view2;
        if (!this.LJJI) {
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore to update surface size. ");
                sbLIZ.append(LJIIZILJ());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            return;
        }
        Object parent = this.LIZIZ.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            width = view2.getWidth();
        } else {
            width = 0;
        }
        Object parent2 = this.LIZIZ.getParent();
        if ((parent2 instanceof ViewGroup) && (view = (View) parent2) != null) {
            height = view.getHeight();
        } else {
            height = 0;
        }
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            int i3 = this.LJJ;
            if (i3 == 2) {
                float f = width;
                float f2 = i;
                float f3 = height;
                float f4 = i2;
                float fMax = Math.max(f / f2, f3 / f4);
                float f5 = f2 * fMax;
                float f6 = f4 * fMax;
                float f7 = (f - f5) / 2.0f;
                float f8 = (f3 - f6) / 2.0f;
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("scale surface center, source:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", video w*h:");
                    sbLIZ2.append(i);
                    sbLIZ2.append('*');
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", view w*h:");
                    sbLIZ2.append(width);
                    sbLIZ2.append('*');
                    sbLIZ2.append(height);
                    sbLIZ2.append(", resize w*h:");
                    sbLIZ2.append(f5);
                    sbLIZ2.append('*');
                    sbLIZ2.append(f6);
                    sbLIZ2.append(", scale:");
                    sbLIZ2.append(fMax);
                    sbLIZ2.append(", x:");
                    sbLIZ2.append(f7);
                    sbLIZ2.append(", y:");
                    sbLIZ2.append(f8);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    SurfaceControl surfaceControlLJIJ = LJIJ(surfaceView);
                    new SurfaceControl.Transaction().setScale(surfaceControlLJIJ, fMax, fMax).setPosition(surfaceControlLJIJ, f7, f8).setVisibility(surfaceControlLJIJ, true).apply();
                }
            } else if (i3 == 1) {
                float f9 = i;
                float f10 = i2;
                float fMin = Math.min(width / f9, height / f10);
                int i4 = (int) (f9 * fMin);
                int i5 = (int) (f10 * fMin);
                float f11 = (width - i4) / 2.0f;
                float f12 = (height - i5) / 2.0f;
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("scale surface fill, source:");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", video w*h:");
                    sbLIZ3.append(i);
                    sbLIZ3.append('*');
                    sbLIZ3.append(i2);
                    sbLIZ3.append(", view w*h:");
                    sbLIZ3.append(width);
                    sbLIZ3.append('*');
                    sbLIZ3.append(height);
                    sbLIZ3.append(", resize w*h:");
                    sbLIZ3.append(i4);
                    sbLIZ3.append('*');
                    sbLIZ3.append(i5);
                    sbLIZ3.append(", scale:");
                    sbLIZ3.append(fMin);
                    sbLIZ3.append(", x:");
                    sbLIZ3.append(f11);
                    sbLIZ3.append(", y:");
                    sbLIZ3.append(f12);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    SurfaceControl surfaceControlLJIJ2 = LJIJ(surfaceView);
                    new SurfaceControl.Transaction().setScale(surfaceControlLJIJ2, fMin, fMin).setPosition(surfaceControlLJIJ2, f11, f12).setVisibility(surfaceControlLJIJ2, true).apply();
                }
            } else if (i3 == 3) {
                float f13 = width / i;
                int i6 = (int) (i2 * f13);
                float f14 = (height - i6) / 2.0f;
                if (C650560PfS.LIZ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("scale surface fix width, source:");
                    sbLIZ4.append(str);
                    sbLIZ4.append(", video w*h:");
                    sbLIZ4.append(i);
                    sbLIZ4.append('*');
                    sbLIZ4.append(i2);
                    sbLIZ4.append(", view w*h:");
                    sbLIZ4.append(width);
                    sbLIZ4.append('*');
                    sbLIZ4.append(height);
                    sbLIZ4.append(", resize w*h:");
                    sbLIZ4.append(width);
                    sbLIZ4.append('*');
                    sbLIZ4.append(i6);
                    sbLIZ4.append(", scale:");
                    sbLIZ4.append(f13);
                    sbLIZ4.append(", x:");
                    sbLIZ4.append(0.0f);
                    sbLIZ4.append(", y:");
                    sbLIZ4.append(f14);
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    SurfaceControl surfaceControlLJIJ3 = LJIJ(surfaceView);
                    new SurfaceControl.Transaction().setScale(surfaceControlLJIJ3, f13, f13).setPosition(surfaceControlLJIJ3, 0.0f, f14).setVisibility(surfaceControlLJIJ3, true).apply();
                }
            }
            this.LJJI = false;
            return;
        }
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("ignore to update surface size, view w*h:");
            sbLIZ5.append(width);
            sbLIZ5.append('*');
            sbLIZ5.append(height);
            sbLIZ5.append(", video w*h:");
            sbLIZ5.append(i);
            sbLIZ5.append('*');
            sbLIZ5.append(i2);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
    }

    public final void LJJ(TextureView textureView, int i, int i2, String str) {
        int width;
        int height;
        View view;
        View view2;
        int i3;
        int i4;
        float f;
        C0Q5E c0q5e;
        String str2;
        if (!this.LJJI) {
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore to update texture size. ");
                sbLIZ.append(LJIIZILJ());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            return;
        }
        if (C643410PLn.LIZ()) {
            width = this.LIZIZ.getWidth();
            height = this.LIZIZ.getHeight();
        } else {
            Object parent = this.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                width = view2.getWidth();
            } else {
                width = 0;
            }
            Object parent2 = this.LIZIZ.getParent();
            if ((parent2 instanceof ViewGroup) && (view = (View) parent2) != null) {
                height = view.getHeight();
            } else {
                height = 0;
            }
        }
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            int i5 = this.LJJ;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i3 = 1;
                        i4 = 2;
                        c0q5e = new C0Q5E(width, height, i, i2, 1.0f, 1.0f, 0.0f, 0.0f);
                    } else {
                        i3 = 1;
                        i4 = 2;
                        float f2 = height;
                        float f3 = width;
                        c0q5e = new C0Q5E(width, height, i, i2, 1.0f, ((i2 * 1.0f) / i) / ((1.0f * f2) / f3), f3 / 2.0f, f2 / 2.0f);
                    }
                } else {
                    i3 = 1;
                    i4 = 2;
                    c0q5e = C0Q5G.LIZ(width, height, i, i2);
                }
            } else {
                i3 = 1;
                i4 = 2;
                float f4 = (i2 * 1.0f) / i;
                float f5 = height;
                float f6 = width;
                float f7 = (1.0f * f5) / f6;
                float f8 = f4 / f7;
                if (f7 > f4) {
                    f = 1.0f;
                } else {
                    f = f8;
                    f8 = 1.0f;
                }
                c0q5e = new C0Q5E(width, height, i, i2, f, f8, f6 / 2.0f, f5 / 2.0f);
            }
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scale texture ");
                int i6 = this.LJJ;
                if (i6 != i3) {
                    if (i6 != i4) {
                        if (i6 != 3) {
                            str2 = "";
                        } else {
                            str2 = "fix width";
                        }
                    } else {
                        str2 = "center crop";
                    }
                } else {
                    str2 = "fill";
                }
                sbLIZ2.append(str2);
                sbLIZ2.append(", source:");
                sbLIZ2.append(str);
                sbLIZ2.append(", video w*h:");
                sbLIZ2.append(i);
                sbLIZ2.append('*');
                sbLIZ2.append(i2);
                sbLIZ2.append(", view w*h:");
                sbLIZ2.append(width);
                sbLIZ2.append('*');
                sbLIZ2.append(height);
                sbLIZ2.append(", sX:");
                sbLIZ2.append(c0q5e.LJ);
                sbLIZ2.append(", sY:");
                sbLIZ2.append(c0q5e.LJFF);
                sbLIZ2.append(", x:");
                sbLIZ2.append(c0q5e.LJI);
                sbLIZ2.append(", y:");
                sbLIZ2.append(c0q5e.LJII);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            Matrix matrix = new Matrix();
            matrix.setScale(c0q5e.LJ, c0q5e.LJFF, c0q5e.LJI, c0q5e.LJII);
            textureView.setTransform(matrix);
            this.LJJI = false;
            return;
        }
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ignore to update texture size, view w*h:");
            sbLIZ3.append(width);
            sbLIZ3.append('*');
            sbLIZ3.append(height);
            sbLIZ3.append(", video w*h:");
            sbLIZ3.append(i);
            sbLIZ3.append('*');
            sbLIZ3.append(i2);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }
}
