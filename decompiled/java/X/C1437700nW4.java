package X;

import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437700nW4 {
    public final C1437060nV2 LIZ;

    public final int[] LIZ() {
        C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0LIZIZ = C1440630nan.LIZIZ();
        c1440760nb0LIZIZ.LIZ(C1437140nVA.LIZ, new AwS601S0100000_22(this, 782));
        c1440760nb0LIZIZ.LIZ(C1437120nV8.LIZ, new AwS601S0100000_22(this, 783));
        c1440760nb0LIZIZ.LIZ(C1437160nVC.LIZ, new AwS601S0100000_22(this, 784));
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) c1440760nb0LIZIZ.execute();
        return new int[]{vEVideoEncodeConfigParams.getOutputSize().width, vEVideoEncodeConfigParams.getOutputSize().height};
    }

    public C1437700nW4(C1437060nV2 c1437060nV2) {
        this.LIZ = c1437060nV2;
    }
}
