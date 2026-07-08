package X;

import com.ss.android.ugc.aweme.boot.milo.IStartStateApiImpl;
import com.ss.android.ugc.aweme.performanceopt.api.IStartStateApi;

/* JADX INFO: renamed from: X.04TY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TY implements IStartStateApi {
    public static final C04TY LIZIZ = new C04TY();
    public final /* synthetic */ IStartStateApi LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartStateApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C04TY() {
        IStartStateApi iStartStateApi;
        Object objLIZ = C04TD.LIZ(IStartStateApi.class, false);
        if (objLIZ != null) {
            iStartStateApi = (IStartStateApi) objLIZ;
        } else {
            if (C04TD.LLILLJJLI == null) {
                synchronized (IStartStateApi.class) {
                    if (C04TD.LLILLJJLI == null) {
                        C04TD.LLILLJJLI = new IStartStateApiImpl();
                    }
                }
            }
            iStartStateApi = C04TD.LLILLJJLI;
        }
        this.LIZ = iStartStateApi;
    }
}
