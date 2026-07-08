package X;

import com.ss.android.ugc.aweme.trace.ITraceConfigApi;
import com.ss.android.ugc.aweme.trace.TraceConfigApiImpl;

/* JADX INFO: renamed from: X.0Vl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806950Vl7 implements ITraceConfigApi {
    public static final C806950Vl7 LIZIZ = new C806950Vl7();
    public final /* synthetic */ ITraceConfigApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final C806980VlA LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LJFF(C0VGD c0vgd) {
        this.LIZ.LJFF(c0vgd);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    public C806950Vl7() {
        ITraceConfigApi iTraceConfigApi;
        Object objLIZ = C04TD.LIZ(ITraceConfigApi.class, false);
        if (objLIZ != null) {
            iTraceConfigApi = (ITraceConfigApi) objLIZ;
        } else {
            if (C04TD.P5 == null) {
                synchronized (ITraceConfigApi.class) {
                    if (C04TD.P5 == null) {
                        C04TD.P5 = new TraceConfigApiImpl();
                    }
                }
            }
            iTraceConfigApi = C04TD.P5;
        }
        this.LIZ = iTraceConfigApi;
    }
}
