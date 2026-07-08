package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0cqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027380cqG {
    public Context LIZ;
    public final List<AbstractC1027370cqF> LIZIZ;
    public C1027480cqQ LIZJ;

    public final boolean LIZ() {
        C1027460cqO.LIZIZ.LJI("ad_lynx_download_AdRouterTask_execute", "begin", String.valueOf(this.LIZJ.LIZ.LIZJ));
        for (AbstractC1027370cqF abstractC1027370cqF : this.LIZIZ) {
            abstractC1027370cqF.LIZ = this.LIZ;
            abstractC1027370cqF.LIZIZ = this.LIZJ;
            if (abstractC1027370cqF.LIZ()) {
                boolean zLIZIZ = abstractC1027370cqF.LIZIZ();
                abstractC1027370cqF.LJFF(zLIZIZ, this.LIZJ);
                if (zLIZIZ) {
                    C1027460cqO.LIZIZ.LJI("ad_lynx_download_AdRouterTask_execute", "success", String.valueOf(this.LIZJ.LIZ.LIZJ));
                    return true;
                }
            }
        }
        C1027460cqO.LIZIZ.LJI("ad_lynx_download_AdRouterTask_execute", "fail", String.valueOf(this.LIZJ.LIZ.LIZJ));
        return false;
    }

    public C1027380cqG(int i) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ArrayList arrayList = new ArrayList();
        C1027480cqQ c1027480cqQ = new C1027580cqa().LIZ;
        this.LIZ = contextLIZ;
        this.LIZIZ = arrayList;
        this.LIZJ = c1027480cqQ;
    }
}
