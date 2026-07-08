package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS152S0201000_35;
import kotlin.jvm.internal.AwS6S1102000_35;

/* JADX INFO: renamed from: X.1DIE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DIE implements InterfaceC2186091Ah5 {
    public int LIZ = -9999;
    public String LIZIZ = "";
    public final /* synthetic */ VECameraController LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.InterfaceC2186111Ah7
    public final void LIZIZ() {
        if (this.LIZJ.LLILZLL.invoke().booleanValue() || this.LIZJ.LLILZ.LJII()) {
            return;
        }
        LIZJ();
    }

    public final void LIZJ() {
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append("/ VECameraController.cameraOpenSuccess");
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2240011Clr interfaceC2240011Clr = this.LIZJ.LLJJ;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LJ();
        }
        if (this.LIZLLL) {
            return;
        }
        VECameraController vECameraController = this.LIZJ;
        C1DIF c1dif = vECameraController.LLJILLL;
        if (c1dif != null) {
            c1dif.LIZ(vECameraController.LLJJIII, vECameraController.LLJJIJI);
        }
        synchronized (vECameraController.LLJJJ) {
            try {
                vECameraController.LLJJJJJIL = true;
                if (vECameraController.LLLIIL || vECameraController.LLJJJIL) {
                    vECameraController.LJI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2186111Ah7
    public final void LIZ(int i) {
        if (!this.LIZJ.LLILZLL.invoke().booleanValue()) {
            C0CNO.LIZLLL(0L, new AwS152S0201000_35(this.LIZJ, this, i, 4));
        }
    }

    public C1DIE(VECameraController vECameraController, boolean z) {
        this.LIZJ = vECameraController;
        this.LIZLLL = z;
    }

    @Override // X.InterfaceC2186091Ah5
    public final void onError(int i, String str) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        if (this.LIZJ.LLILZLL.invoke().booleanValue()) {
            return;
        }
        this.LIZ = i;
        if (str != null) {
            this.LIZIZ = str;
        }
        if ((i != -417 && i != -416) || (interfaceC2240011Clr = this.LIZJ.LLJJ) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        interfaceC2240011Clr.LJIJJ(i, str);
    }

    @Override // X.InterfaceC2186091Ah5
    public final void onInfo(int i, int i2, String str) {
        Function0<Unit> function0;
        if (this.LIZJ.LLILZLL.invoke().booleanValue()) {
            return;
        }
        if (i == 2) {
            if (this.LIZJ.LLILZ.LJII()) {
                LIZJ();
            }
            VECameraController vECameraController = this.LIZJ;
            vECameraController.LLJJIJIL = i2;
            C2253341DHo.LIZ = i2;
            vECameraController.LLJJIJIIJIL = true;
            vECameraController.LLL = 0.0f;
            vECameraController.LLLF = 0.0f;
            vECameraController.LLLFF = 1.0f;
            Iterator<InterfaceC2253331DHn> it2 = vECameraController.LLJILJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(vECameraController.LLJJIJIL);
            }
        } else if (i == 3) {
            InterfaceC2253451DHz interfaceC2253451DHz = this.LIZJ.LLIZ;
            if (interfaceC2253451DHz != null) {
                interfaceC2253451DHz.LIZIZ("first_frame_captured_to_surface_created", "first_frame_captured_to_effect_first_frame", "first_frame_captured_to_first_frame_render");
            }
            VECameraController vECameraController2 = this.LIZJ;
            vECameraController2.LJIIJJI();
            Iterator<InterfaceC2253251DHf> it3 = vECameraController2.LLJIJIL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZJ();
            }
        } else if (i == 5 && (function0 = this.LIZJ.LLJILJILJ) != null) {
            function0.invoke();
        }
        C0CNO.LIZLLL(0L, new AwS6S1102000_35(this.LIZJ, i, i2, str, 2));
        VECameraController vECameraController3 = this.LIZJ;
        vECameraController3.getClass();
        try {
            Iterator<T> it4 = vECameraController3.LLLILZLLLI.iterator();
            while (it4.hasNext()) {
                ((InterfaceC2253351DHp) it4.next()).LIZ(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(new Throwable(e), "VECameraController");
        }
    }
}
