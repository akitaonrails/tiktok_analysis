package X;

import com.ss.android.ugc.aweme.trace.ITraceLogWrapApi;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;

/* JADX INFO: renamed from: X.0Vle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807280Vle implements ITraceLogWrapApi {
    public static final C807280Vle LIZIZ = new C807280Vle();
    public final /* synthetic */ ITraceLogWrapApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZ(C807170VlT c807170VlT) {
        this.LIZ.LIZ(c807170VlT);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZJ(EnumC807060VlI enumC807060VlI, C807180VlU c807180VlU) {
        this.LIZ.LIZJ(enumC807060VlI, c807180VlU);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZLLL(EnumC807060VlI enumC807060VlI, C807150VlR c807150VlR) {
        this.LIZ.LIZLLL(enumC807060VlI, c807150VlR);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJII(String str) {
        this.LIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIIZZ(EnumC807060VlI enumC807060VlI, C807140VlQ c807140VlQ) {
        this.LIZ.LJIIIIZZ(enumC807060VlI, c807140VlQ);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIZ(String str, String str2, String str3) {
        this.LIZ.LJIIIZ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJIIJ(String str) {
        return this.LIZ.LJIIJ(str);
    }

    public C807280Vle() {
        ITraceLogWrapApi iTraceLogWrapApi;
        Object objLIZ = C04TD.LIZ(ITraceLogWrapApi.class, false);
        if (objLIZ != null) {
            iTraceLogWrapApi = (ITraceLogWrapApi) objLIZ;
        } else {
            if (C04TD.Q5 == null) {
                synchronized (ITraceLogWrapApi.class) {
                    if (C04TD.Q5 == null) {
                        C04TD.Q5 = new TraceLogWrapApiImpl();
                    }
                }
            }
            iTraceLogWrapApi = C04TD.Q5;
        }
        this.LIZ = iTraceLogWrapApi;
    }
}
