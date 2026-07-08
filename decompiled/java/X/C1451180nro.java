package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451180nro implements InterfaceC1450310nqP {
    public final /* synthetic */ C1450990nrV LIZ;

    @Override // X.InterfaceC1450310nqP
    public final void LIZIZ() {
    }

    public C1451180nro(C1450990nrV c1450990nrV) {
        this.LIZ = c1450990nrV;
    }

    @Override // X.InterfaceC1450310nqP
    public final void LIZ(C348100Dkm c348100Dkm, String str) {
        C1450990nrV c1450990nrV = this.LIZ;
        INLEPlayer playerApi = c348100Dkm.LIZIZ.getPlayerApi();
        boolean zLJFF = Intrinsics.LJFF(str, "static_model");
        c1450990nrV.getClass();
        C01TT.LIZLLL(new AwS101S0210000_22(c1450990nrV, zLJFF, playerApi, 2));
    }
}
