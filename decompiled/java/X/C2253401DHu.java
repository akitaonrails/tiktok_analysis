package X;

import X.InterfaceC1650230t2r;
import Y.AObjectS130S0000000_35;
import Y.ARunnableS135S0100000_35;
import Y.ARunnableS46S0101000_35;
import android.os.Build;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import bnj.a;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.absetting.PostFrameAudioCaptureInitAB;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import pyl.q;
import zmj.j;

/* JADX INFO: renamed from: X.1DHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2253401DHu<T extends InterfaceC1650230t2r> extends C2254071DKj<T> implements InterfaceC1650230t2r {
    public boolean LLZLL;
    public boolean LLZLLIL;
    public boolean LLZLLLL;
    public boolean LLZZ;
    public boolean LLZZJLIL;
    public boolean LLZZLLIL;
    public final C560530Lyd<Boolean> LLZZZIL;
    public C2253011DGh LLZZZZ;
    public boolean a;
    public boolean b;
    public boolean c;

    public static /* synthetic */ Unit ld(Integer num) {
        return null;
    }

    public static /* synthetic */ Unit pd(Integer num) {
        return null;
    }

    @Override // X.InterfaceC1650230t2r
    public void Bg1() {
        this.LLZZLLIL = false;
    }

    public boolean Mc() {
        return false;
    }

    @Override // X.InterfaceC1650230t2r
    public void sC2() {
        this.LLZZLLIL = true;
    }

    private C2253091DGp Yc() {
        return this.LLZZZZ.LIZIZ;
    }

    @Override // X.C2254071DKj
    public void I7() {
        this.LLZZZZ = new C2253011DGh(new C2253061DGm(this), new C2253181DGy(this));
    }

    @Override // X.InterfaceC1650230t2r
    public C2253081DGo IU1() {
        return this.LLZZZZ.LIZJ;
    }

    public a Nc() {
        return this.LLZZZZ.LIZ;
    }

    @Override // X.C2254071DKj
    public void P6() {
        this.LLLLIIL.LIZ();
        C1DI4 c1di4 = C1DI4.LIZ;
        Cert certLJI = C1DI4.LJI();
        if (!this.LLZZLLIL) {
            Yc().LIZIZ(certLJI, this.LLLLJ);
        }
        this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
        C2219091BtD.LIZLLL().d("CameraLogicComponent => surfaceDestroyed, stopPreviewAsync called()");
        if (!this.LLZZLLIL) {
            St2().F4(new AObjectS130S0000000_35(5), this.LLLLJ);
        }
        dc();
    }

    @Override // X.InterfaceC1650230t2r
    public InterfaceC2208871Bcj Tl() {
        return this.LLLLLL.LJJII;
    }

    @Override // X.InterfaceC1650230t2r
    public C2253191DGz Zd1() {
        return this.LLZZZZ.LIZLLL;
    }

    public void cd() {
        this.LLLLIIL.LIZ();
        C1DI4 c1di4 = C1DI4.LIZ;
        Yc().LIZIZ(C1DI4.LJFF(), this.LLLLJ);
        this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
        C2219091BtD.LIZLLL().i("CameraLogicComponent => surfaceDestroyed");
        C2219091BtD.LIZLLL().LIZ("stopPreviewAsync called()");
        St2().F4(new AObjectS130S0000000_35(4), this.LLLLJ);
        dc();
    }

    @Override // X.C2254071DKj
    public void dc() {
        this.LLLLIIL.LIZ();
        C1DI4 c1di4 = C1DI4.LIZ;
        Cert certLJ = C1DI4.LJ();
        if (!this.LLZZLLIL) {
            C2253091DGp c2253091DGpYc = Yc();
            boolean z = this.LLLLJ;
            c2253091DGpYc.getClass();
            c2253091DGpYc.LIZ(new C2253021DGi(c2253091DGpYc.LIZJ, new C1660750tJp(0, 0), new C2253031DGj(c2253091DGpYc.LIZIZ.LIZ(new C2253111DGr(z), "action_name_close_camera"), certLJ)));
        }
        St2().jh();
        St2().N0(this.LLLZLL);
        this.LLLLII = false;
        this.LLILZ.LJII(Boolean.FALSE);
    }

    private void Rd() {
        if (PostFrameAudioCaptureInitAB.isEnabled()) {
            this.LLLIZZ.post(new ARunnableS135S0100000_35(this, 15));
        }
    }

    @Override // X.C2254071DKj
    public void Ka() {
        boolean zLJI = MethodIDManager.LJI(196715);
        d7();
        hc();
        St2().L0(new InterfaceC1631630sYr() { // from class: X.1DHv
            @Override // X.InterfaceC1631630sYr
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C2253401DHu.zd(this.LL, (Integer) obj, (Integer) obj2, (String) obj3, (VERecorder) obj4);
            }
        });
        this.LLLLLL.getClass();
        L7();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C2254071DKj
    public void S6() {
        C2219091BtD.LIZLLL().d("CameraLogicComponent => surfaceCreated");
        St2().K0(this.LLLZLL);
        u7();
        s7();
        St2().Ah(this.LLLIIIL, Build.DEVICE, new AObjectS130S0000000_35(1));
        if (this.LLZLLIL) {
            this.LLZLLIL = false;
            if (this.LLZZ) {
                Oa();
                return;
            }
            return;
        }
        C2253091DGp c2253091DGpYc = Yc();
        this.LLLLIIL.LIZ();
        C1DI4 c1di4 = C1DI4.LIZ;
        Cert certLJIIIIZZ = C1DI4.LJIIIIZZ();
        c2253091DGpYc.getClass();
        c2253091DGpYc.LIZ(new C2253021DGi(c2253091DGpYc.LIZJ, new C1660750tJp(0, 0), new C2253031DGj(c2253091DGpYc.LIZIZ.LIZ(null, "action_name_init_camera"), certLJIIIIZZ)));
    }

    @Override // X.C2254071DKj, X.InterfaceC1650230t2r
    public boolean Uq() {
        return super.Uq();
    }

    @Override // X.C2254071DKj, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (this.LLZZLLIL) {
            return;
        }
        a aVarNc = Nc();
        boolean z = this.LLLLJ;
        C1DI4 c1di4 = C1DI4.LIZ;
        aVarNc.LIZJ(C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_COMPONENT_ON_DESTROY, EnumC1641610sox.PAGE_INVISIBLE), z);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (this.LLLLLL.LJJIJIIJI) {
            this.a = true;
        }
        if (!this.LLZZLLIL) {
            boolean z = this.LLLLJ;
            C1DI6 c1di6 = C1DI6.LIZ;
            C1DI5 c1di5 = C1DI5.CLOSE_CAMERA_ON_PAUSE;
            EnumC1641610sox enumC1641610sox = EnumC1641610sox.PAGE_INVISIBLE;
            tb(z, c1di6.LIZIZ(c1di5, enumC1641610sox), false);
            a aVarNc = Nc();
            Cert certLIZIZ = c1di6.LIZIZ(c1di5, enumC1641610sox);
            aVarNc.getClass();
            aVarNc.LIZ(new C2253021DGi(aVarNc.LIZJ, new C1660750tJp(2, 2), new C2253031DGj(aVarNc.LIZIZ.LIZ(new C2253101DGq(true), "action_name_stop_preview"), certLIZIZ)));
        }
        a aVarNc2 = Nc();
        Cert certLIZIZ2 = C1DI6.LIZ.LIZIZ(C1DI5.STOP_AUDIO_CAMERA_LOGIC_PAUSE, EnumC1641610sox.PAGE_INVISIBLE);
        aVarNc2.getClass();
        aVarNc2.LIZ(new C2253021DGi(aVarNc2.LIZJ, new C1660750tJp(0, 2), new C2253031DGj(aVarNc2.LIZIZ.LIZ(null, "action_name_release_audio_capture"), certLIZIZ2)));
    }

    @Override // X.C2254071DKj, X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (this.LLLLLL.LJJIJIIJI) {
            if (this.a) {
                a aVarNc = Nc();
                this.LLLLIIL.LIZ();
                C1DI4 c1di4 = C1DI4.LIZ;
                aVarNc.LIZLLL(C1DI4.LJII());
            } else {
                a aVarNc2 = Nc();
                this.LLLLIIL.LIZ();
                C1DI4 c1di42 = C1DI4.LIZ;
                aVarNc2.LIZIZ(C1DI4.LJII());
            }
            this.a = false;
        } else {
            a aVarNc3 = Nc();
            this.LLLLIIL.LIZ();
            C1DI4 c1di43 = C1DI4.LIZ;
            aVarNc3.LIZLLL(C1DI4.LJII());
        }
        if (this.LLLLLL.LJJIJIIJIL) {
            return;
        }
        a aVarNc4 = Nc();
        aVarNc4.getClass();
        aVarNc4.LIZ(new C2253021DGi(aVarNc4.LIZJ, new C1660750tJp(0, 1), new C2253031DGj(aVarNc4.LIZIZ.LIZ(new C1662180tM8(), "action_name_init_audio_capture"), null)));
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        St2().LIZ(0);
        if (this.LLLLJI && !this.LLZZLLIL) {
            C2219091BtD.LIZLLL().d("CameraLogicComponent => release camera in onStop");
            this.LLLLIIL.LIZ();
            C1DI4 c1di4 = C1DI4.LIZ;
            Cert certLIZJ = C1DI4.LIZJ();
            a aVarNc = Nc();
            boolean z = this.LLLLJ;
            aVarNc.getClass();
            aVarNc.LIZ(new C2253021DGi(aVarNc.LIZJ, new C1660750tJp(2, 2), new C2253031DGj(aVarNc.LIZIZ.LIZ(new C2253121DGs(z), "action_name_release_camera"), certLIZJ)));
        }
        if (this.LLZLLIL) {
            this.LLLLIIL.LIZ();
            C1DI4 c1di42 = C1DI4.LIZ;
            Nc().LIZJ(C1DI4.LIZLLL(), this.LLLLJ);
            this.LLZLLIL = false;
        }
        if (fF2() == null || !this.LLLLLL.LJJI || isReuseSurfaceView()) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, fF2());
    }

    @Override // X.InterfaceC1650230t2r
    public void Lo() {
        xb();
    }

    @Override // X.InterfaceC1650230t2r
    public LiveEvent<Boolean> tR1() {
        return this.LLZZZIL;
    }

    public static /* synthetic */ void Gd(C2253401DHu c2253401DHu) {
        C1C7U.LIZ("CameraLogicComponent@6fc1.tryInitAudioCaptureAfterFirstFrame$1L");
        if (!c2253401DHu.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C1C7U.LIZIZ("CameraLogicComponent@6fc1.tryInitAudioCaptureAfterFirstFrame$1L");
            return;
        }
        if (!c2253401DHu.St2().getAudioController().LJFF()) {
            c2253401DHu.Zd1().LIZJ();
        }
        C1C7U.LIZIZ("CameraLogicComponent@6fc1.tryInitAudioCaptureAfterFirstFrame$1L");
    }

    public static /* synthetic */ Unit nd(Integer num) {
        if (num.intValue() != 0) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopPreviewAsync ret = ");
            sbLIZ.append(num);
            interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* synthetic */ Unit xd(Integer num) {
        if (num.intValue() != 0) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopPreviewAsync ret = ");
            sbLIZ.append(num);
            interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    @Override // X.C2254071DKj
    public void N5(int i) {
        Ld(Integer.valueOf(i), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // X.C2254071DKj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N6(android.view.Surface r6) {
        /*
            r5 = this;
            super.N6(r6)
            X.0oCT r1 = X.C2219091BtD.LIZLLL()
            java.lang.String r0 = "CameraLogicComponent => surfaceCreated"
            r1.d(r0)
            boolean r0 = r5.LLZLLIL
            if (r0 == 0) goto L16
            X.1DKl r0 = r5.LLLLLL
            boolean r0 = r0.LJII
            if (r0 != 0) goto L1f
        L16:
            X.1DKk r1 = r5.St2()
            X.1DJn r0 = r5.LLLZLL
            r1.K0(r0)
        L1f:
            r5.u7()
            r5.s7()
            r5.LLLIIIL = r6
            boolean r0 = r5.LLZLLIL
            if (r0 == 0) goto L51
            X.1DKl r0 = r5.LLLLLL
            boolean r0 = r0.LJII
            if (r0 == 0) goto L4b
            X.1DKk r1 = r5.St2()
            android.view.Surface r0 = r5.n5()
            r1.LJLJLLL(r0)
        L3c:
            boolean r0 = r5.LLZLLIL
            if (r0 == 0) goto L4a
            r0 = 0
            r5.LLZLLIL = r0
            boolean r0 = r5.LLZZ
            if (r0 == 0) goto L4a
            r5.Oa()
        L4a:
            return
        L4b:
            X.1DKl r0 = r5.LLLLLL
            boolean r0 = r0.LJJIJIL
            if (r0 != 0) goto L3c
        L51:
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            int r1 = r0.ordinal()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            int r0 = r0.ordinal()
            if (r1 < r0) goto L3c
            X.1DKk r4 = r5.St2()
            android.view.Surface r3 = r5.n5()
            java.lang.String r2 = android.os.Build.DEVICE
            Y.AObjectS130S0000000_35 r1 = new Y.AObjectS130S0000000_35
            r0 = 3
            r1.<init>(r0)
            r4.Ah(r3, r2, r1)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2253401DHu.N6(android.view.Surface):void");
    }

    @Override // X.InterfaceC1650230t2r
    public void Ot1(List<String> list) {
        j jVar = this.LLZZZZ.LJ;
        jVar.getClass();
        String string = list.toString();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: reset SensitiveApiContext: contextTypes: ");
        sbLIZ.append(string);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        for (String str : list) {
            if (((LinkedHashMap) jVar.LJ).keySet().contains(str)) {
                Object obj = ((LinkedHashMap) jVar.LIZLLL).get(str);
                if (obj != null) {
                    jVar.LJ.put(str, (C1997407s4) obj);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1650230t2r
    public void PB(InterfaceC1659000tH0 interfaceC1659000tH0) {
        C2253011DGh c2253011DGh = this.LLZZZZ;
        if (c2253011DGh != null) {
            c2253011DGh.LJ.LJFF = interfaceC1659000tH0;
            St2().setSensitiveApiCallback(this.LLZZZZ.LJ);
        }
    }

    @Override // X.InterfaceC1650230t2r
    public void QK(boolean z) {
        u92().getCameraController().w4(z);
        this.LLZZZIL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C2254071DKj
    public void S5(int i) {
        if (fF2().getVisibility() == 8) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C805320ViU.LIZJ(new ARunnableS46S0101000_35(this, i, 1));
            return;
        }
        da();
        this.LLZZ = true;
        if (this.LLLIIIL != null) {
            Oa();
        }
        St2().kh(this.LLLLLLZ);
        Ld(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // X.C2254071DKj, X.InterfaceC1650230t2r
    public UUID Th(int[] iArr) {
        return super.Th(iArr);
    }

    @Override // X.InterfaceC1650230t2r
    public void YM2(boolean z) {
        this.LLZLL = z;
    }

    public void ed(Cert cert) {
        gb(cert);
    }

    @Override // X.InterfaceC1650230t2r
    public void openCamera(Cert cert) {
        boolean zLJI = MethodIDManager.LJI(196715);
        Al2(false, cert);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1650230t2r
    public void vQ1(boolean z) {
        VERecorder vERecorder = this.LLLIILIL;
        if (vERecorder != null) {
            VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(vERecorder.LJIIIZ());
            builder.enableReducePerFrameCallbackOptimization(z);
            vERecorder.LJJI(builder.build());
        }
    }

    @Override // X.C2254071DKj, X.InterfaceC1650230t2r
    public C2185991Agv wr(int[] iArr) {
        return super.wr(iArr);
    }

    private /* synthetic */ void Fd(final int i, final float f) {
        this.LLLIZZ.post(new Runnable() { // from class: X.1DHw
            @Override // java.lang.Runnable
            public final void run() {
                C2253401DHu.Dd(this.LL, i, f);
            }
        });
    }

    private void Ld(Integer num, Boolean bool) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLLII.LJIIJ(new Pair<>(num, bool));
        } else {
            this.LLLII.LJIIIZ(new Pair<>(num, bool));
        }
    }

    public static /* synthetic */ void fd(C2253401DHu c2253401DHu, int i) {
        C1C7U.LIZ("CameraLogicComponent@6fc1.handleCameraOpen$1L");
        c2253401DHu.S5(i);
        C1C7U.LIZIZ("CameraLogicComponent@6fc1.handleCameraOpen$1L");
    }

    @Override // X.InterfaceC1650230t2r
    public void Al2(boolean z, Cert cert) {
        vw2(z, cert, false, false);
    }

    @Override // X.InterfaceC1650230t2r
    public void DS0(Cert cert, boolean z) {
        this.LLZZJLIL = true;
        Zd1().LJFF(cert);
    }

    @Override // X.InterfaceC1650230t2r
    public void Kr1(Cert cert, String str) {
        int iLJLJJLL = LJLJJLL();
        if (iLJLJJLL == 0) {
            q qVarLIZ = q.LIZ();
            qVarLIZ.LIZIZ = false;
            Zd1().LJII(qVarLIZ, cert, str);
        } else {
            if (iLJLJJLL != 1) {
                return;
            }
            q qVarLIZIZ = q.LIZIZ();
            qVarLIZIZ.LIZIZ = false;
            Zd1().LJII(qVarLIZIZ, cert, str);
        }
    }

    @Override // X.InterfaceC1650230t2r
    public void PR(Cert cert, boolean z) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: handle SensitiveApiEvent: ");
        sbLIZ.append("firstOpenCamera");
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        ow1(false, cert, z);
    }

    @Override // X.InterfaceC1650230t2r
    public void aJ0(boolean z, Cert cert) {
        sd0(false, cert);
    }

    @Override // X.InterfaceC1650230t2r
    public void bc1(boolean z, Cert cert) {
        int i;
        C1DHU c1dhuEp = ep();
        c1dhuEp.getClass();
        C1DHU.LJFF = z;
        C2206691BYd c2206691BYdLIZ = C2206701BYe.LIZ(c1dhuEp.LIZIZ);
        int i2 = 2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c2206691BYdLIZ.LIZIZ(i);
        Zd1().LJIIIIZZ(z ? 1 : 0, cert);
        if (fh()) {
            this.LLJJJIL.LJIIJ(Integer.valueOf(!z ? 1 : 0));
        }
        if (getFlashMode() != 0) {
            qh(0);
        }
        C560530Lyd<Integer> c560530Lyd = this.LLJJJ;
        if (z) {
            i2 = 3;
        }
        c560530Lyd.LJIIJ(Integer.valueOf(i2));
    }

    @Override // X.InterfaceC1650230t2r
    public void openCamera(Cert cert, boolean z) {
        boolean zLJI = MethodIDManager.LJI(196715);
        vw2(false, cert, false, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1650230t2r
    public void sd0(boolean z, Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromLifecycle: ");
        sbLIZ.append(z);
        sbLIZ.append(", isStoppedFromLifecycle: ");
        sbLIZ.append(this.LLZLL);
        sbLIZ.append(", policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_STOP_PREVIEW", C2188811AlT.LIZIZ(sbLIZ));
        C2219091BtD.LIZLLL().i(C786410Ut5.j4("%s stopPreview fromLifecycle: %b isStoppedFromLifecycle: %b", new Object[]{"CameraLogicComponent", Boolean.valueOf(z), Boolean.valueOf(this.LLZLL)}));
        if (!this.LLZLL) {
            return;
        }
        tb(this.LLLLJ, cert, true);
        if (fF2() != null && !this.LLLLLL.LJJI && !isReuseSurfaceView()) {
            C786410Ut5.LJLLLLLL(8, fF2());
        }
        this.LLZLL = z;
        C560530Lyd<Boolean> c560530Lyd = this.LLL;
        Boolean bool = Boolean.FALSE;
        c560530Lyd.LJIIIZ(bool);
        this.LLLF.LJFF(bool);
        this.c = false;
    }

    public static /* synthetic */ void Dd(C2253401DHu c2253401DHu, int i, float f) {
        C1C7U.LIZ("CameraLogicComponent@6fc1.lambda$openCamera$2$1L");
        c2253401DHu.LLJJIJI.LJIIJ(new Pair<>(Integer.valueOf(i), Float.valueOf(f)));
        C1C7U.LIZIZ("CameraLogicComponent@6fc1.lambda$openCamera$2$1L");
    }

    @Override // X.InterfaceC1650230t2r
    public int Cd(boolean z, Cert cert, String str) {
        q qVarLIZ;
        if (LJLJJLL() == 1) {
            qVarLIZ = q.LIZIZ();
        } else {
            qVarLIZ = q.LIZ();
        }
        qVarLIZ.LIZIZ = z;
        Zd1().LJII(qVarLIZ, cert, str);
        return 0;
    }

    public void Id(boolean z, Cert cert, boolean z2) {
        tb(z, cert, z2);
    }

    @Override // X.C2254071DKj
    public void M5(int i, int i2, String str) {
        Ld(Integer.valueOf(i), Boolean.FALSE);
    }

    @Override // X.C2254071DKj
    public void U5(int i, int i2, String str) {
        Ld(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public void aJ1(boolean z, C1AIY c1aiy, Cert cert) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable: ");
        sbLIZ.append(z);
        sbLIZ.append(", arConfig: ");
        if (c1aiy == null) {
            string = "null";
        } else {
            string = c1aiy.toString();
        }
        sbLIZ.append(string);
        sbLIZ.append(", policyPlaceHolder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_SWITCH_AR_MODE", C2188811AlT.LIZIZ(sbLIZ));
        super.aJ1(z, c1aiy, cert);
    }

    @Override // X.InterfaceC1650230t2r
    public void ow1(boolean z, Cert cert, boolean z2) {
        vw2(z, cert, false, false);
    }

    @Override // X.C2254071DKj, X.InterfaceC1650190t2n
    public int A91(q qVar, Cert cert, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ev: ");
        sbLIZ.append(qVar);
        sbLIZ.append(", policyPlaceholder: ");
        sbLIZ.append(cert);
        sbLIZ.append(", enterMethod: ");
        sbLIZ.append(str);
        sbLIZ.append(", withBlur: ");
        sbLIZ.append(z);
        C1AL1.LIZ("ACTION_NAME_SWITCH_CAMERA", C2188811AlT.LIZIZ(sbLIZ));
        return super.A91(qVar, cert, str, z);
    }

    @Override // X.InterfaceC1650230t2r
    public void vw2(boolean z, Cert cert, boolean z2, boolean z3) {
        InterfaceC2253441DHy interfaceC2253441DHy;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromLifecycle: ");
        sbLIZ.append(z);
        sbLIZ.append(", isStoppedFromLifecycle: ");
        sbLIZ.append(this.LLZLL);
        sbLIZ.append(", isCameraInit: ");
        sbLIZ.append(this.LLZLLLL);
        sbLIZ.append(", policyPlaceholder: ");
        sbLIZ.append(cert);
        sbLIZ.append(", ignoreIsAppBackground: ");
        sbLIZ.append(z2);
        C1AL1.LIZ("ACTION_NAME_START_PREVIEW", C2188811AlT.LIZIZ(sbLIZ));
        if (!z2 && (interfaceC2253441DHy = this.LLLLLLIL) != null && interfaceC2253441DHy.isAppBackground()) {
            C2219091BtD.LIZLLL().i(C786410Ut5.j4("%s startPreview forbid in background", new Object[]{"CameraLogicComponent"}));
            return;
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        Object[] objArr = new Object[5];
        objArr[0] = "CameraLogicComponent";
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Boolean.valueOf(this.LLZLLLL);
        objArr[3] = Boolean.valueOf(this.LLZLL);
        StringBuilder sb = new StringBuilder();
        C089E c089e = new C089E(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
        while (c089e.hasNext()) {
            sb.append(((StackTraceElement) c089e.next()).toString());
            sb.append("\n");
        }
        objArr[4] = sb.toString();
        interfaceC1463990oCTLIZLLL.i(C786410Ut5.j4("%s startPreview fromLifecycle: %b isCameraInit: %b isStoppedFromLifecycle: %b StackTrace: %s", objArr));
        if (z) {
            if ((!this.LLZZJLIL && !this.LLZLLLL) || !this.LLZLL) {
                return;
            }
            if (Mc() && this.b && this.c) {
                this.b = false;
                return;
            } else if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED && C0BTN.LIZ()) {
                return;
            }
        }
        this.c = true;
        this.LLZLLLL = true;
        gb(cert);
        if (fF2() != null && !z3) {
            C786410Ut5.LJLLLLLL(0, fF2());
        }
        this.LLZLL = true;
        CK2(getFlashMode());
    }

    public static /* synthetic */ Unit zd(C2253401DHu c2253401DHu, Integer num, Integer num2, String str, VERecorder vERecorder) {
        if (num.intValue() == 1050) {
            InterfaceC2253451DHz interfaceC2253451DHz = c2253401DHu.LLLLLLJ;
            if (interfaceC2253451DHz != null) {
                interfaceC2253451DHz.LIZ("first_frame_captured_to_effect_first_frame");
                c2253401DHu.LLLLLLJ.end();
            }
            c2253401DHu.cb();
        } else if (num.intValue() == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            c2253401DHu.Ya(num2.intValue(), str);
            c2253401DHu.Rd();
            InterfaceC2253451DHz interfaceC2253451DHz2 = c2253401DHu.LLLLLLJ;
            if (interfaceC2253451DHz2 != null) {
                interfaceC2253451DHz2.LIZ("surface_set_to_first_frame_render", "first_frame_captured_to_first_frame_render");
            }
        }
        c2253401DHu.LLJLLIL.LJIIIZ(new C1634100scq<>(num, num2, str));
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1650230t2r
    public void qf0(int i, int i2, boolean z, boolean z2, InterfaceC2173471A4j interfaceC2173471A4j, boolean z3) {
        VERecorder vERecorder = this.LLLIILIL;
        if (vERecorder != null) {
            vERecorder.LJJIJIIJI(i, i2, z, z2, interfaceC2173471A4j, z3);
        }
    }

    public C2253401DHu(C1DRG c1drg, CameraComponentModel cameraComponentModel, InterfaceC2187111Aij interfaceC2187111Aij, C1DI3 c1di3, C1A75 c1a75, C092O<C2254091DKl> c092o, InterfaceC2253441DHy interfaceC2253441DHy) {
        this(c1drg, cameraComponentModel, interfaceC2187111Aij, c1di3, c1a75, c092o, interfaceC2253441DHy, null, null);
    }

    public C2253401DHu(C1DRG c1drg, CameraComponentModel cameraComponentModel, InterfaceC2187111Aij interfaceC2187111Aij, C1DI3 c1di3, C1A75 c1a75, C092O<C2254091DKl> c092o, InterfaceC2253441DHy interfaceC2253441DHy, InterfaceC2253451DHz interfaceC2253451DHz, Effect effect) {
        super(c1drg, cameraComponentModel, interfaceC2187111Aij, c1di3, c1a75, c092o, interfaceC2253441DHy, interfaceC2253451DHz, effect);
        this.LLZLL = true;
        this.LLZLLIL = true;
        this.LLZZZIL = new C560530Lyd<>();
        this.a = false;
        this.b = true;
        this.c = false;
    }
}
