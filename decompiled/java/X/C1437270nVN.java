package X;

import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;

/* JADX INFO: renamed from: X.0nVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437270nVN extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
    public final C1437060nV2 LIZIZ;
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

    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    @Override // X.AbstractC1440790nb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams r15) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1437270nVN.LIZ(com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437270nVN(InterfaceC1440780nb2 interfaceC1440780nb2, C1437060nV2 c1437060nV2) {
        super(interfaceC1440780nb2);
        C1437130nV9 c1437130nV9 = C1437130nV9.LIZ;
        String str = c1437130nV9.key;
        int i = c1437130nV9.priority;
        this.LIZIZ = c1437060nV2;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
