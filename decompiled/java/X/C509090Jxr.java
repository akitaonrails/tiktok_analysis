package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.widget.NextLiveData;
import java.util.List;
import java.util.Map;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0Jxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509090Jxr implements C0KKO {
    public final /* synthetic */ PrivilegeDetailViewModel LIZ;

    @Override // X.C0KKO
    public final void LIZIZ() {
    }

    @Override // X.C0KKO
    public final void LIZJ(String str) {
    }

    @Override // X.C0KKO
    public final void LIZLLL(int i, int i2, int i3, String str, C0KH1 c0kh1) {
    }

    public C509090Jxr(PrivilegeDetailViewModel privilegeDetailViewModel) {
        this.LIZ = privilegeDetailViewModel;
    }

    @Override // X.C0KKO
    public final void LIZ(int i, String str) {
        if (this.LIZ.LLJILJIL.getValue() == null) {
            this.LIZ.LLJJJJLIIL = System.currentTimeMillis();
            NextLiveData<AbstractC509180Jy0> nextLiveData = this.LIZ.LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("code: ");
            sbLIZ.append(i);
            sbLIZ.append(" msg: ");
            sbLIZ.append(str);
            new Throwable(C2188811AlT.LIZIZ(sbLIZ));
            nextLiveData.setValue(new AbstractC509180Jy0() { // from class: X.0Jy1
            });
        }
    }

    @Override // X.C0KKO
    public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
        NextLiveData<Map<String, List<SubscriptionProductDetailWithTemplateInfo>>> nextLiveData = this.LIZ.LLJJJIL;
        if (nextLiveData != null) {
            nextLiveData.setValue(map);
        }
        if (C516700KOe.LIZ().length() == 0) {
            this.LIZ.LLJJJJ.postValue(C507720Jve.class);
        }
    }

    @Override // X.C0KKO
    public final void LJFF(long j, TemplateListData templateListData) {
        PrivilegeDetailViewModel privilegeDetailViewModel = this.LIZ;
        privilegeDetailViewModel.LLJJJJLIIL = j;
        if (privilegeDetailViewModel.LLJILJIL.getValue() == null || this.LIZ.LLJLIL) {
            this.LIZ.LLJILJIL.setValue(new C509150Jxx(templateListData));
        }
    }
}
