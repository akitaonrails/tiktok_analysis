package Y;

import X.C09JN;
import X.C10287040n;
import X.C1756090vnb;
import X.C1756110vnd;
import X.C1758040vqk;
import X.C1758300vrA;
import X.C1758370vrH;
import X.C19EG;
import X.C19EH;
import X.C1C7U;
import X.C786410Ut5;
import X.C960203pA;
import X.ExecutorC10416045m;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComPdpConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppEmptyFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AfS47S1200000_26 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS47S1200000_26 afS47S1200000_26, Object obj) {
        List<AuthorizedStruct> list;
        List<AuthorizedStruct> list2;
        AuthorizedStruct authorizedStruct;
        C1C7U.LIZ("AuthManagementPage@65b0.onViewCreated$1");
        AuthAppInfoListResponse authAppInfoListResponse = (AuthAppInfoListResponse) obj;
        ((AuthManagementPage) afS47S1200000_26.l1).LLJILJIL = authAppInfoListResponse;
        boolean z = true;
        if (authAppInfoListResponse != null && (list = authAppInfoListResponse.authorizationList) != null && list.size() != 0) {
            AuthAppInfoListResponse authAppInfoListResponse2 = ((AuthManagementPage) afS47S1200000_26.l1).LLJILJIL;
            if (authAppInfoListResponse2 != null && (list2 = authAppInfoListResponse2.authorizationList) != null && (authorizedStruct = (AuthorizedStruct) ListProtector.get(list2, 0)) != null) {
                AuthManagementPage authManagementPage = (AuthManagementPage) afS47S1200000_26.l1;
                String str = afS47S1200000_26.s0;
                ((AuthListViewModel) authManagementPage.LLJI.getValue()).iR2(authorizedStruct, null);
                ((AuthListViewModel) authManagementPage.LLJI.getValue()).hR2("", str);
                AuthAppInfoFragment authAppInfoFragment = new AuthAppInfoFragment();
                authAppInfoFragment.LLJJ = true;
                authManagementPage.LLJILJILJ = true;
                authManagementPage.aS(authAppInfoFragment);
            }
        } else {
            AuthManagementPage authManagementPage2 = (AuthManagementPage) afS47S1200000_26.l1;
            AuthAppEmptyFragment authAppEmptyFragment = new AuthAppEmptyFragment();
            C19EH c19ehLJIIJ = authManagementPage2.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.bbp, authAppEmptyFragment, null);
            c19ehLJIIJ.LJIIJ();
            if (Intrinsics.LJFF((Boolean) afS47S1200000_26.l2, Boolean.TRUE)) {
                IMinisApiService iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
                C19EG activity = ((AuthManagementPage) afS47S1200000_26.l1).getActivity();
                if (activity == null || C960203pA.LIZIZ(activity)) {
                    z = false;
                }
                iMinisApiService.LJIJJ(z);
            }
        }
        C1C7U.LIZIZ("AuthManagementPage@65b0.onViewCreated$1");
    }

    public static final void accept$1(AfS47S1200000_26 afS47S1200000_26, Object obj) {
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$5");
        ((C1758370vrH) afS47S1200000_26.l1).LIZLLL = (ProductPackStruct) obj;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EComPdpConfig eComPdpConfig = C1758300vrA.LIZ;
        EComPdpConfig eComPdpConfig2 = (EComPdpConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_pdp_settings_config", EComPdpConfig.class, eComPdpConfig);
        if (eComPdpConfig2 == null) {
            eComPdpConfig2 = eComPdpConfig;
        }
        if (eComPdpConfig2.prefetchTimeout * LSPassThroughRecordSizeConfig.DEFAULT > 0) {
            ExecutorC10416045m executorC10416045m = ExecutorC10416045m.LLILLJJLI;
            ARunnableS30S1100000_26 aRunnableS30S1100000_26 = new ARunnableS30S1100000_26((IPdpStarter.PdpEnterParam) afS47S1200000_26.l2, afS47S1200000_26.s0, 6);
            EComPdpConfig eComPdpConfig3 = (EComPdpConfig) SettingsManager.LIZLLL().LJIIIIZZ("ecom_pdp_settings_config", EComPdpConfig.class, eComPdpConfig);
            if (eComPdpConfig3 != null) {
                eComPdpConfig = eComPdpConfig3;
            }
            C786410Ut5.LJLIIL(eComPdpConfig.prefetchTimeout * LSPassThroughRecordSizeConfig.DEFAULT, executorC10416045m.LL, aRunnableS30S1100000_26);
        }
        String str = ((IPdpStarter.PdpEnterParam) afS47S1200000_26.l2).trackId;
        if (str != null) {
            C1758040vqk c1758040vqkLIZ = C10287040n.LIZ(str);
            if (c1758040vqkLIZ != null) {
                c1758040vqkLIZ.LJFF("t_fetch_data_end", false);
            }
            C1756090vnb c1756090vnbLIZIZ = C1756110vnd.LIZIZ(str);
            if (c1756090vnbLIZIZ != null) {
                c1756090vnbLIZIZ.LJII("t_fetch_data_end", false);
            }
        }
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$5");
    }

    public static final void accept$2(AfS47S1200000_26 afS47S1200000_26, Object obj) {
        C1758040vqk c1758040vqkLIZ;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$3");
        ((C1758370vrH) afS47S1200000_26.l1).LIZLLL = (ProductPackStruct) obj;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EComPdpConfig eComPdpConfig = C1758300vrA.LIZ;
        EComPdpConfig eComPdpConfig2 = (EComPdpConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_pdp_settings_config", EComPdpConfig.class, eComPdpConfig);
        if (eComPdpConfig2 == null) {
            eComPdpConfig2 = eComPdpConfig;
        }
        if (eComPdpConfig2.prefetchTimeout * LSPassThroughRecordSizeConfig.DEFAULT > 0) {
            ExecutorC10416045m executorC10416045m = ExecutorC10416045m.LLILLJJLI;
            ARunnableS30S1100000_26 aRunnableS30S1100000_26 = new ARunnableS30S1100000_26((IPdpStarter.PdpEnterParam) afS47S1200000_26.l2, afS47S1200000_26.s0, 5);
            EComPdpConfig eComPdpConfig3 = (EComPdpConfig) SettingsManager.LIZLLL().LJIIIIZZ("ecom_pdp_settings_config", EComPdpConfig.class, eComPdpConfig);
            if (eComPdpConfig3 != null) {
                eComPdpConfig = eComPdpConfig3;
            }
            C786410Ut5.LJLIIL(eComPdpConfig.prefetchTimeout * LSPassThroughRecordSizeConfig.DEFAULT, executorC10416045m.LL, aRunnableS30S1100000_26);
        }
        String str = ((IPdpStarter.PdpEnterParam) afS47S1200000_26.l2).trackId;
        if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LJFF("t_fetch_data_end", false);
        }
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$3");
    }

    public AfS47S1200000_26(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
