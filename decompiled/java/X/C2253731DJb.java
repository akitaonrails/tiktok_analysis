package X;

import android.opengl.EGLContext;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.1DJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253731DJb implements InterfaceC2254011DKd {
    public final C1DHA LIZ;
    public final C1DKV LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<InterfaceC2253861DJo> LIZLLL;
    public Function1<? super Integer, Unit> LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(399));
    public final CopyOnWriteArraySet<InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>> LJI = new CopyOnWriteArraySet<>();
    public final C20750516Hv LJII = new C20750516Hv(this, 1);
    public final C2253741DJc LJIIIIZZ;
    public final C1663430tO9 LJIIIZ;
    public final C2186231AhJ LJIIJ;

    @Override // X.InterfaceC2254011DKd
    public final void I0() {
        C2253741DJc c2253741DJc = this.LJIIIIZZ;
        c2253741DJc.LLILZ.clear();
        if (c2253741DJc.LLILLJJLI) {
            c2253741DJc.LL.LJIIZILJ(c2253741DJc);
        } else {
            c2253741DJc.LL.LJIJJLI(null);
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void LIZ() {
        if (this.LIZIZ.LJIJJ()) {
            this.LIZ.LJI().LIZ(new InterfaceC1464200oCo() { // from class: X.1DJd
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    boolean z;
                    int i3 = VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT;
                    if (i == i3) {
                        C2253731DJb c2253731DJb = this.LL;
                        if (i2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2253731DJb.LIZIZ(z);
                    } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                        this.LL.LIZLLL(i2);
                    } else if (i == i3 && i2 != 0) {
                        C2253731DJb c2253731DJb2 = this.LL;
                        if (!c2253731DJb2.LIZJ.invoke().booleanValue()) {
                            Function1<? super Integer, Unit> function1 = c2253731DJb2.LJ;
                            if (function1 == null) {
                                function1 = null;
                            }
                            function1.invoke(Integer.valueOf(i2));
                        }
                    }
                    this.LL.LIZJ(i, i2, str);
                }
            });
            return;
        }
        VERecorder vERecorderLJI = this.LIZ.LJI();
        vERecorderLJI.LIZIZ.LIZ(new InterfaceC2254511DMb() { // from class: X.1DJg
            @Override // X.C1DMY
            public final void LJ(int i) {
                this.LIZ.LIZLLL(i);
            }

            @Override // X.C1DMY
            public final void LJI(boolean z) {
                this.LIZ.LIZIZ(z);
            }

            @Override // X.InterfaceC2254511DMb
            public final void onInfo(int i, int i2, String str) {
                this.LIZ.LIZJ(i, i2, str);
            }
        });
    }

    @Override // X.InterfaceC2254011DKd
    public final void jh() {
        C1663430tO9 c1663430tO9 = this.LJIIIZ;
        c1663430tO9.LLILLL.clear();
        c1663430tO9.LL.LJJIIZ(null);
    }

    @Override // X.InterfaceC2254011DKd
    public final void G0(InterfaceC1437720nW6 interfaceC1437720nW6) {
        C2253741DJc c2253741DJc = this.LJIIIIZZ;
        if (c2253741DJc.LLILZ.isEmpty()) {
            if (c2253741DJc.LLILLJJLI) {
                c2253741DJc.LL.LIZ(c2253741DJc);
            } else {
                c2253741DJc.LL.LJIJJLI(c2253741DJc);
            }
        }
        c2253741DJc.LLILZ.add(interfaceC1437720nW6);
    }

    @Override // X.InterfaceC2254011DKd
    public final void K0(InterfaceC2253851DJn interfaceC2253851DJn) {
        if (!((CopyOnWriteArrayList) this.LJFF.getValue()).contains(interfaceC2253851DJn)) {
            ((CopyOnWriteArrayList) this.LJFF.getValue()).add(interfaceC2253851DJn);
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void L0(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr) {
        if (!this.LJI.contains(interfaceC1631630sYr)) {
            this.LJI.add(interfaceC1631630sYr);
        }
    }

    public final void LIZIZ(boolean z) {
        if (this.LIZJ.invoke().booleanValue()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJFF.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2253851DJn) it2.next()).LIZIZ(!z ? 1 : 0);
        }
    }

    public final void LIZLLL(int i) {
        if (this.LIZJ.invoke().booleanValue()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJFF.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2253851DJn) it2.next()).LIZ(i);
        }
        if (i == 0) {
            this.LIZ.LJI().LJJIJLIJ(new C21620919jT());
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void N0(InterfaceC2253851DJn interfaceC2253851DJn) {
        ((CopyOnWriteArrayList) this.LJFF.getValue()).remove(interfaceC2253851DJn);
    }

    @Override // X.InterfaceC2254011DKd
    public final void gh(AwS604S0100000_25 awS604S0100000_25) {
        this.LJ = awS604S0100000_25;
    }

    @Override // X.InterfaceC2254011DKd
    public final void hh(InterfaceC2186241AhK interfaceC2186241AhK) {
        C2186231AhJ c2186231AhJ = this.LJIIJ;
        synchronized (c2186231AhJ) {
            try {
                if (!c2186231AhJ.LIZLLL.contains(interfaceC2186241AhK)) {
                    return;
                }
                c2186231AhJ.LIZLLL.remove(interfaceC2186241AhK);
                if (c2186231AhJ.LIZLLL.isEmpty()) {
                    if (c2186231AhJ.LIZIZ) {
                        c2186231AhJ.LIZ.getCameraController().v4(c2186231AhJ);
                    } else {
                        c2186231AhJ.LIZ.LJI().LJJIIJZLJL(null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void ih(InterfaceC1652830t73 interfaceC1652830t73) {
        C1663430tO9 c1663430tO9 = this.LJIIIZ;
        c1663430tO9.LLILLL.remove(interfaceC1652830t73);
        if (c1663430tO9.LLILLL.isEmpty()) {
            c1663430tO9.LL.LJJIIZ(null);
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void kh(InterfaceC2186241AhK interfaceC2186241AhK) {
        final C2186231AhJ c2186231AhJ = this.LJIIJ;
        synchronized (c2186231AhJ) {
            try {
                if (c2186231AhJ.LIZLLL.isEmpty()) {
                    if (c2186231AhJ.LIZIZ) {
                        c2186231AhJ.LIZ.getCameraController().J4(c2186231AhJ);
                    } else {
                        final VERecorder vERecorderLJI = c2186231AhJ.LIZ.LJI();
                        vERecorderLJI.getClass();
                        vERecorderLJI.LJJIIJZLJL(new VERecorder.OnFrameAvailableListenerExt() { // from class: X.1AgN
                            /* JADX WARN: Type inference failed for: r1v0, types: [X.00G6] */
                            @Override // com.ss.android.vesdk.VERecorder.OnFrameAvailableListenerExt
                            public final C00G6 config() {
                                ?? r1 = new Object() { // from class: X.00G6
                                };
                                InterfaceC2185661AgO interfaceC2185661AgO = c2186231AhJ;
                                if (interfaceC2185661AgO != null) {
                                    interfaceC2185661AgO.LIZ();
                                }
                                return r1;
                            }

                            @Override // com.ss.android.vesdk.VERecorder.OnFrameAvailableListenerExt
                            public final void OnFrameAvailable(VEFrame vEFrame) {
                                long jLJIIIIZZ;
                                if (c2186231AhJ == null) {
                                    return;
                                }
                                if (vEFrame != null && vEFrame.getFormat() == EnumC2185621AgK.TEPixFmt_OpenGL_RGBA8) {
                                    VEFrame.TextureFrame textureFrame = (VEFrame.TextureFrame) vEFrame.getFrame();
                                    InterfaceC2185661AgO interfaceC2185661AgO = c2186231AhJ;
                                    EGLContext eGLContext = textureFrame.context;
                                    int i = textureFrame.texID;
                                    int width = vEFrame.getWidth();
                                    int height = vEFrame.getHeight();
                                    long timeStamp = vEFrame.getTimeStamp();
                                    k kVar = vERecorderLJI.LIZIZ;
                                    if (kVar != null) {
                                        jLJIIIIZZ = kVar.LJJJ.LJIIIIZZ("SegmentFrameTime");
                                    } else {
                                        jLJIIIIZZ = 0;
                                    }
                                    interfaceC2185661AgO.LIZIZ(eGLContext, i, 10, width, height, timeStamp, jLJIIIIZZ);
                                    return;
                                }
                                c2186231AhJ.LIZIZ(null, 0, 10, 0, 0, 0L, 0L);
                            }
                        });
                    }
                }
                if (!c2186231AhJ.LIZLLL.contains(interfaceC2186241AhK)) {
                    c2186231AhJ.LIZLLL.add(interfaceC2186241AhK);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void lh(InterfaceC1652830t73 interfaceC1652830t73) {
        C1663430tO9 c1663430tO9 = this.LJIIIZ;
        if (c1663430tO9.LLILLL.isEmpty()) {
            c1663430tO9.LL.LJJIIZ(c1663430tO9);
        }
        if (!c1663430tO9.LLILLL.contains(interfaceC1652830t73)) {
            c1663430tO9.LLILLL.add(interfaceC1652830t73);
        }
    }

    @Override // X.InterfaceC2254011DKd
    public final void mh(InterfaceC1437720nW6 interfaceC1437720nW6) {
        C2253741DJc c2253741DJc = this.LJIIIIZZ;
        c2253741DJc.LLILZ.remove(interfaceC1437720nW6);
        if (c2253741DJc.LLILZ.isEmpty()) {
            if (c2253741DJc.LLILLJJLI) {
                c2253741DJc.LL.LJIIZILJ(c2253741DJc);
            } else {
                c2253741DJc.LL.LJIJJLI(null);
            }
        }
    }

    public final void LIZJ(int i, int i2, String str) {
        boolean zBooleanValue = this.LIZJ.invoke().booleanValue();
        if (i != 1000) {
            if (i == 1001) {
                this.LIZLLL.invoke().LJ();
            }
        } else if (zBooleanValue && this.LIZIZ.LJIIL()) {
            return;
        } else {
            this.LIZLLL.invoke().LIZJ();
        }
        if (zBooleanValue) {
            return;
        }
        if (i != 1040) {
            if (i == 1041) {
                C1448320nnC.LIZIZ = Integer.valueOf(i2);
            }
        } else {
            C1448320nnC.LIZ = Integer.valueOf(i2);
        }
        this.LJII.invoke(Integer.valueOf(i), Integer.valueOf(i2), str, this.LIZ.LJI());
    }

    public C2253731DJb(RecorderImpl recorderImpl, C1DKV c1dkv, Function0 function0, AwS579S0100000_35 awS579S0100000_35) {
        this.LIZ = recorderImpl;
        this.LIZIZ = c1dkv;
        this.LIZJ = function0;
        this.LIZLLL = awS579S0100000_35;
        this.LJIIIIZZ = new C2253741DJc(recorderImpl.LJI(), c1dkv.LJIJJ(), function0);
        this.LJIIIZ = new C1663430tO9(recorderImpl.LJI(), function0);
        this.LJIIJ = new C2186231AhJ(recorderImpl, c1dkv.LJIIZILJ().LJIILL(), function0);
    }
}
