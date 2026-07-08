package X;

import com.ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl;

/* JADX INFO: renamed from: X.1BXS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BXS implements IFrescoLegoTaskApi {
    public static final C1BXS LIZIZ = new C1BXS();
    public final /* synthetic */ IFrescoLegoTaskApi LIZ;

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final C0CCZ LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1BXS() {
        IFrescoLegoTaskApi iFrescoLegoTaskApi;
        Object objLIZ = C04TD.LIZ(IFrescoLegoTaskApi.class, false);
        if (objLIZ != null) {
            iFrescoLegoTaskApi = (IFrescoLegoTaskApi) objLIZ;
        } else {
            if (C04TD.W1 == null) {
                synchronized (IFrescoLegoTaskApi.class) {
                    if (C04TD.W1 == null) {
                        C04TD.W1 = new FrescoLegoTaskImpl();
                    }
                }
            }
            iFrescoLegoTaskApi = C04TD.W1;
        }
        this.LIZ = iFrescoLegoTaskApi;
    }
}
