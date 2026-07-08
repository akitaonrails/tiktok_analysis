package X;

import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KL6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KL6 extends C0KLK<PGCTemplateListData> {
    public final /* synthetic */ C0KL2 LIZ;

    public final C11O8 LIZJ() {
        C0KLA c0kla = this.LIZ.LIZ;
        boolean z = c0kla.LJIILIIL || c0kla.LJIILJJIL;
        C0KAX c0kaxLIZ = C0KLQ.LIZ();
        C0KLA c0kla2 = this.LIZ.LIZ;
        String str = c0kla2.LIZ;
        int i = c0kla2.LIZJ;
        String strLIZ = C0KL8.LIZ(c0kla2.LJI);
        C0KLA c0kla3 = this.LIZ.LIZ;
        C11NZ<DataResponse<PGCTemplateListData>> c11nzLIZIZ = c0kaxLIZ.LIZIZ(str, i, strLIZ, c0kla3.LJIIJJI, c0kla3.LJ, c0kla3.LJFF, z, C515950KLh.LJFF(), this.LIZ.LIZ.LJIILLIIL);
        if (c11nzLIZIZ != null) {
            return C0JCK.LIZ(c11nzLIZIZ, EnumC499440JiI.GENERAL, "source", "sub/contract/tpl_list", null, 8).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        return null;
    }

    public C0KL6(C0KL2 c0kl2) {
        this.LIZ = c0kl2;
    }
}
