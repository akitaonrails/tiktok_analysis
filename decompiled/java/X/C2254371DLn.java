package X;

import android.os.Message;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.proxy.TEDuetProxy;

/* JADX INFO: renamed from: X.1DLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254371DLn extends TEDuetProxy {
    public final VESize LJIIL;

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJIIIZ() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.0f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LJJIZ.updateTrackFilterParam(i, vEVideoTransformFilterParam);
        } else {
            this.LJIIIZ = this.LIZIZ.LJJIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
        }
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy, X.C1DMH
    public final synchronized void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LIZ(Message message) {
        super.LIZ(message);
        int i = message.what;
        int i2 = message.arg2;
        if (i == VEInfo.TE_INFO_DUET_DST_SIZE) {
            VESize vESize = this.LJIIL;
            int i3 = (i2 >> 15) & 65535;
            vESize.width = i3;
            int i4 = i2 & 65535;
            vESize.height = i4;
            if (i3 > 0 && i4 > 0) {
                k kVar = this.LIZIZ;
                if (kVar == null) {
                    C2484209oO.LIZJ("TEDuetV2Proxy", "TERecorder is null.");
                    return;
                }
                kVar.LJIIJJI(i3, i4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeVideoOutputSize ");
                sbLIZ.append(this.LJIIL.width);
                sbLIZ.append(", ");
                sbLIZ.append(this.LJIIL.height);
                C2484209oO.LJI("TEDuetV2Proxy", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJIIJ(int i) {
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LJJIZ.removeTrackFilter(i2);
            this.LJIIJ = -1;
        }
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 1;
        this.LIZIZ.LJJIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
    }

    @Override // com.ss.android.vesdk.proxy.TEDuetProxy
    public final void LJIILIIL(EnumC12975055x enumC12975055x) {
        C1DMH c1dmh;
        k kVar = this.LIZIZ;
        if (kVar == null) {
            C2484209oO.LIZJ("TEDuetV2Proxy", "TERecorder is null.");
            return;
        }
        TERecorderInterface tERecorderInterface = kVar.LJJJ;
        if (tERecorderInterface != null && (c1dmh = kVar.LJJZZIII) != null && (c1dmh instanceof TEDuetProxy)) {
            tERecorderInterface.LJJIII("DuetLayout", enumC12975055x.ordinal());
            kVar.LJIIJ.setDuetLayout(enumC12975055x);
        } else {
            kVar.LJIIJ.setDuetLayout(enumC12975055x);
        }
    }

    public C2254371DLn(k kVar, VEDuetSettings vEDuetSettings, VESize vESize) {
        super(kVar, vEDuetSettings, vESize);
        this.LJIIL = new VESize(0, 0);
    }
}
