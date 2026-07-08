package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import com.ss.android.vesdk.VESize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import lnn.q;

/* JADX INFO: renamed from: X.0Mmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578620Mmi {
    public final InterfaceC576780Mjk LIZ;
    public final InterfaceC576770Mjj LIZIZ;
    public final Function0<InterfaceC1650230t2r> LIZJ;
    public final Function0<InterfaceC1648570t0B> LIZLLL;
    public final Function0<q> LJ;
    public final Function0<InterfaceC1628590sTx> LJFF;
    public final C11PQ<LayoutItemMedia> LJI;
    public final C19475711Hn LJII;
    public final C11RK<Unit> LJIIIIZZ;
    public final C19475711Hn LJIIIZ;
    public final C11PQ<LayoutItemMedia> LJIIJ;
    public final C19475711Hn LJIIJJI;
    public final C11RK<Bitmap> LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    public final void LIZ() {
        int iPw = this.LIZIZ.pw();
        if (this.LIZ.gQ().size() > iPw) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cleanupDirtyLayoutSegmentIfNecessary currentItemCount=");
            sbLIZ.append(iPw);
            sbLIZ.append(", layoutSegments.size=");
            sbLIZ.append(this.LIZ.gQ().size());
            C576730Mjf.LJIIJ("CameraLayoutRecordController", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.gQ().remove(this.LIZ.gQ().size() - 1);
        }
    }

    public final InterfaceC1650230t2r LIZIZ() {
        return (InterfaceC1650230t2r) this.LJIILIIL.getValue();
    }

    public final InterfaceC1648570t0B LIZJ() {
        return (InterfaceC1648570t0B) this.LJIILJJIL.getValue();
    }

    public final void LJ() {
        if (!this.LJIIZILJ) {
            C576730Mjf.LJIIJ("CameraLayoutRecordController", "stop recording but isVideoRecording is false");
            return;
        }
        this.LJIIZILJ = false;
        InterfaceC1648570t0B interfaceC1648570t0BLIZJ = LIZJ();
        C1644050sst c1644050sst = new C1644050sst("record end");
        c1644050sst.LJI = true;
        c1644050sst.LIZ = 7;
        c1644050sst.LJII = this.LIZ.gQ();
        interfaceC1648570t0BLIZJ.h81(c1644050sst);
        LIZJ().QK2(true);
    }

    public final void LIZLLL() {
        Effect effectLLILIL;
        VESize renderSize = LIZIZ().u92().LIZIZ().LIZIZ.LJLJL.getRenderSize();
        VESize videoRes = LIZIZ().u92().LIZIZ().LIZIZ.LJIIIIZZ.getVideoRes();
        VESize vESizeLIZIZ = C576730Mjf.LIZIZ(renderSize, videoRes.width, videoRes.height);
        InterfaceC1624480sNK interfaceC1624480sNKC0 = ((q) this.LJIILL.getValue()).C0();
        if (interfaceC1624480sNKC0.LJJLIIIJJIZ().LJIILLIIL && C1402560mbO.LIZ() == 2 && (effectLLILIL = interfaceC1624480sNKC0.LLILIL()) != null) {
            C1411890mqR.LIZ.getClass();
            C1411890mqR.LIZJ(effectLLILIL, "record_video");
        }
        C578870Mn7 c578870Mn7 = new C578870Mn7();
        C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
        C2254411DLr c2254411DLr = c578870Mn7.LIZ;
        c2254411DLr.LIZ = c1ao8;
        c2254411DLr.LJ = EnumC578750Mmv.FULL_EFFECT;
        c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
        c2254411DLr.LIZIZ = vESizeLIZIZ;
        c2254411DLr.LJII = new C1AO7() { // from class: X.0Mmh
            @Override // X.C1AO7
            public final /* synthetic */ void LIZ(int i, int i2, int[] iArr) {
            }

            @Override // X.C1AO7
            public final /* synthetic */ void onResult(int i) {
            }

            @Override // X.C1AO7
            public final void LIZIZ(VEFrame vEFrame, int i) {
                Bitmap bitmap = null;
                if (vEFrame != null) {
                    try {
                        bitmap = vEFrame.toBitmap();
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("toBitmap failed: ");
                        sbLIZ.append(e);
                        C576730Mjf.LJIIIZ("CameraLayoutRecordController", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                if (i == 0 && bitmap != null) {
                    this.LIZ.LJIIL.onNext(bitmap);
                    return;
                }
                C576730Mjf.LJIIIZ("CameraLayoutRecordController", "take photo failed. ret=" + i);
            }
        };
        LIZIZ().u92().LIZIZ().LJIIJJI(c578870Mn7.LIZ);
    }

    public C578620Mmi(InterfaceC576780Mjk interfaceC576780Mjk, InterfaceC576770Mjj interfaceC576770Mjj, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83, AwS552S0100000_8 awS552S0100000_84) {
        this.LIZ = interfaceC576780Mjk;
        this.LIZIZ = interfaceC576770Mjj;
        this.LIZJ = awS552S0100000_8;
        this.LIZLLL = awS552S0100000_82;
        this.LJ = awS552S0100000_83;
        this.LJFF = awS552S0100000_84;
        C11PQ<LayoutItemMedia> c11pq = new C11PQ<>();
        this.LJI = c11pq;
        this.LJII = new C19475711Hn(c11pq);
        C11RK<Unit> c11rk = new C11RK<>();
        this.LJIIIIZZ = c11rk;
        this.LJIIIZ = new C19475711Hn(c11rk);
        C11PQ<LayoutItemMedia> c11pq2 = new C11PQ<>();
        this.LJIIJ = c11pq2;
        this.LJIIJJI = new C19475711Hn(c11pq2);
        this.LJIIL = new C11RK<>();
        this.LJIILIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, StrategyCenter.ENABLE_SMART_SERVICE));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 809));
        this.LJIILL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 810));
    }
}
