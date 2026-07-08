package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440070nZt extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
    public final C1437050nV1 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC1440780nb2
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1440780nb2
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.InterfaceC1440780nb2
    public final String getStage() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1440790nb3
    public final void LIZ(BaseCompileConfigParams baseCompileConfigParams) {
        C0CA4.LIZ(this.LIZIZ.LIZ, new AwS601S0100000_22((VEVideoEncodeConfigParams) baseCompileConfigParams, 856));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440070nZt(InterfaceC1440780nb2 interfaceC1440780nb2, C1437050nV1 c1437050nV1) {
        super(interfaceC1440780nb2);
        C1440150na1 c1440150na1 = C1440150na1.LIZ;
        String str = c1440150na1.key;
        int i = c1440150na1.priority;
        this.LIZIZ = c1437050nV1;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
