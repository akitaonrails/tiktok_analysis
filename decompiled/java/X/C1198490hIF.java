package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198490hIF {
    public final Context LIZ;
    public final ILocationBaseServiceForMT LIZIZ;

    public final void LIZ() {
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = this.LIZ;
        c1200940hMC.getClass();
        if (C1200940hMC.LIZIZ(context)) {
            this.LIZIZ.LJ(this.LIZ);
            this.LIZIZ.LJIIJ();
            this.LIZIZ.LJJIJ();
        }
    }

    public C1198490hIF() {
        C844470XAv.LIZ.getClass();
        this.LIZ = C844470XAv.LIZ();
        this.LIZIZ = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        LIZ();
    }
}
