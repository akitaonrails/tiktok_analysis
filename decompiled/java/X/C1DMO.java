package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.algorithm.VEBachAlgorithmParam;

/* JADX INFO: renamed from: X.1DMO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DMO extends VEBachAlgorithmParam {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C1DMO() {
        this(0);
    }

    public C1DMO(int i) {
        super(12, "ObjectScan", false);
        this.LIZ = 2;
        this.LIZIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LIZJ = 3;
        this.LIZLLL = 3;
    }
}
