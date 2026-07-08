package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0NAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAZ {
    public final WeakReference<SimVideoUrlModel> LIZ;
    public InterfaceC589470NAb LIZIZ;
    public final Executor LIZJ;
    public int LIZLLL;
    public AbstractC1321260kUG LJ;

    public final void LIZ() {
        C589480NAc simCover;
        List<String> coverUrlList;
        int i = this.LIZLLL;
        if (i == 1) {
            return;
        }
        if (i == 2) {
            InterfaceC589470NAb interfaceC589470NAb = this.LIZIZ;
            if (interfaceC589470NAb != null) {
                SimVideoUrlModel simVideoUrlModel = this.LIZ.get();
                if (simVideoUrlModel != null) {
                    simVideoUrlModel.getSourceId();
                }
                interfaceC589470NAb.LIZLLL();
                return;
            }
            return;
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LIZ.get();
        String str = (simVideoUrlModel2 == null || (simCover = simVideoUrlModel2.getSimCover()) == null || (coverUrlList = simCover.getCoverUrlList()) == null || coverUrlList.isEmpty()) ? "" : (String) ListProtector.get(coverUrlList, 0);
        if (!TextUtils.isEmpty(str)) {
            AbstractC1321260kUG abstractC1321260kUGLJIJ = C1322200kVm.LIZ().LJIJ(C1325710kbR.LIZIZ(str), null);
            this.LJ = abstractC1321260kUGLJIJ;
            this.LIZLLL = 1;
            abstractC1321260kUGLJIJ.LIZJ(new InterfaceC589510NAf<Void>() { // from class: X.0NAa
                @Override // X.InterfaceC589510NAf
                public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    String sourceId;
                    if (interfaceC1320200kSY != null && interfaceC1320200kSY.LIZ()) {
                        SimVideoUrlModel simVideoUrlModel3 = this.LIZ.LIZ.get();
                        if (simVideoUrlModel3 != null) {
                            sourceId = simVideoUrlModel3.getSourceId();
                        } else {
                            sourceId = null;
                        }
                        C0NAZ c0naz = this.LIZ;
                        InterfaceC589470NAb interfaceC589470NAb2 = c0naz.LIZIZ;
                        if (interfaceC589470NAb2 != null) {
                            SimVideoUrlModel simVideoUrlModel4 = c0naz.LIZ.get();
                            if (simVideoUrlModel4 != null) {
                                simVideoUrlModel4.getSourceId();
                            }
                            interfaceC589470NAb2.LIZLLL();
                        }
                        if (sourceId != null) {
                            C0NAP.LJIIL.LIZLLL(sourceId, Boolean.TRUE);
                        }
                        this.LIZ.LIZLLL = 2;
                    }
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZIZ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    C0NAZ c0naz = this.LIZ;
                    InterfaceC589470NAb interfaceC589470NAb2 = c0naz.LIZIZ;
                    if (interfaceC589470NAb2 != null) {
                        SimVideoUrlModel simVideoUrlModel3 = c0naz.LIZ.get();
                        if (simVideoUrlModel3 != null) {
                            simVideoUrlModel3.getSourceId();
                        }
                        interfaceC589470NAb2.onFailure();
                    }
                    this.LIZ.LIZLLL = 3;
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                    this.LIZ.LIZLLL = 4;
                }
            }, this.LIZJ);
            return;
        }
        InterfaceC589470NAb interfaceC589470NAb2 = this.LIZIZ;
        if (interfaceC589470NAb2 != null) {
            SimVideoUrlModel simVideoUrlModel3 = this.LIZ.get();
            if (simVideoUrlModel3 != null) {
                simVideoUrlModel3.getSourceId();
            }
            interfaceC589470NAb2.LIZLLL();
        }
    }

    public C0NAZ(WeakReference weakReference, C0NAS c0nas, Executor executor) {
        this.LIZ = weakReference;
        this.LIZIZ = c0nas;
        this.LIZJ = executor;
    }
}
