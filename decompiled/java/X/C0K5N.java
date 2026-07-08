package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.widget.PgcNextLiveData;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import java.util.List;
import java.util.Map;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0K5N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5N implements C0KLD {
    public final /* synthetic */ PrivilegeDetailViewModel LIZ;

    @Override // X.C0KLD
    public final void LIZIZ() {
    }

    @Override // X.C0KLD
    public final void LIZJ(String str) {
    }

    @Override // X.C0KLD
    public final void LJ(int i, int i2, String str, C0KCK c0kck) {
    }

    public C0K5N(PrivilegeDetailViewModel privilegeDetailViewModel) {
        this.LIZ = privilegeDetailViewModel;
    }

    @Override // X.C0KLD
    public final void LIZ(int i, String str) {
        if (this.LIZ.LLJILJILJ.getValue() == null) {
            this.LIZ.LLJJJJJIL = System.currentTimeMillis();
            PgcNextLiveData<AbstractC511880K5q> pgcNextLiveData = this.LIZ.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("code: ");
            sbLIZ.append(i);
            sbLIZ.append(" msg: ");
            sbLIZ.append(str);
            new Throwable(C2188811AlT.LIZIZ(sbLIZ));
            pgcNextLiveData.setValue(new AbstractC511880K5q() { // from class: X.0K5s
            });
        }
    }

    @Override // X.C0KLD
    public final void LIZLLL(long j, PGCTemplateListData pGCTemplateListData) {
        PrivilegeDetailViewModel privilegeDetailViewModel = this.LIZ;
        privilegeDetailViewModel.LLJJJJJIL = j;
        if (privilegeDetailViewModel.LLJILJILJ.getValue() == null || this.LIZ.LLJL) {
            this.LIZ.LLJILJILJ.setValue(new C511860K5o(pGCTemplateListData));
        }
    }

    @Override // X.C0KLD
    public final void LJFF(Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C0KCK c0kck) {
        PgcNextLiveData<Map<String, List<PGCSubscriptionProductDetailWithTemplateInfo>>> pgcNextLiveData = this.LIZ.LLJJJIL;
        if (pgcNextLiveData != null) {
            pgcNextLiveData.setValue(map);
        }
        if (C515950KLh.LJFF().length() == 0) {
            this.LIZ.LLJJJJ.postValue(C0K0K.class);
        }
    }
}
