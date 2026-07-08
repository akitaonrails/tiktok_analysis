package X;

import com.ss.android.vesdk.VEWatermarkParam;

/* JADX INFO: renamed from: X.0nLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1431200nLa extends AbstractC1434490nQt {
    public final VEWatermarkParam LLILZLL;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.COMPILE;
    }

    public AbstractC1431200nLa(VEWatermarkParam vEWatermarkParam) {
        this.LLILZLL = vEWatermarkParam;
    }

    @Override // X.AbstractC1434490nQt
    public void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has watermark: ");
        if (this.LLILZLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        c1431070nLN.LIZIZ(new C1404990mfJ("WaveCompile", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
    }
}
