package Y;

import X.C09JN;
import X.C112C;
import X.C117U;
import X.C11JF;
import X.C1632480saE;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19413310xH;
import X.C19555011f2;
import X.C1C7U;
import X.C201955140j;
import X.C786410Ut5;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.MatchDonationText;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultResponse;
import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AfS60S0110000_29 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        List<AVChallenge> list;
        C117U c117u = (C117U) afS60S0110000_29.l0;
        boolean z = afS60S0110000_29.z1;
        SearchRecommendChallengeList searchRecommendChallengeList = (SearchRecommendChallengeList) obj;
        c117u.getClass();
        if (searchRecommendChallengeList != null && (list = searchRecommendChallengeList.items) != null && list.size() > 0) {
            C112C.LJIIJ = searchRecommendChallengeList;
            c117u.LIZ(C112C.LJFF(searchRecommendChallengeList));
            C11JF c11jf = c117u.LLJLLL;
            if (c11jf != null && !c11jf.isDisposed()) {
                c117u.LLJLLL.dispose();
                return;
            }
            return;
        }
        C112C.LJIIL = null;
        if (z) {
            c117u.LJFF(true);
            return;
        }
        c117u.LJII(0);
        C1749280vcc c1749280vcc = c117u.LLILZLL;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c117u.LLILZLL.getContext();
        c1722300uv6.LJIIIIZZ = "  ";
        c1749280vcc.setStatus(c1722300uv6);
        C786410Ut5.LLIZLLLIL(c117u.LLILLJJLI, 8);
        C11JF c11jf2 = c117u.LLJLLL;
        if (c11jf2 == null || c11jf2.isDisposed()) {
            return;
        }
        c117u.LLJLLL.dispose();
    }

    public static final void accept$1(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("OrganizationListViewModel@f8d0.getOrganizationList$1");
        OrganizationResponse organizationResponse = (OrganizationResponse) obj;
        if (organizationResponse.error_code == 0) {
            OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS60S0110000_29.l0;
            organizationListViewModel.LLILLL = organizationResponse.cursor;
            organizationListViewModel.LLILZ = organizationResponse.hasMore;
            List<OrganizationModel> list = organizationResponse.orgList;
            if (list != null) {
                ((ArrayList) organizationListViewModel.LLILZIL).addAll(list);
            }
            OrganizationListViewModel organizationListViewModel2 = (OrganizationListViewModel) afS60S0110000_29.l0;
            MutableLiveData<C19413310xH> mutableLiveData = organizationListViewModel2.LL;
            List<OrganizationModel> list2 = organizationListViewModel2.LLILZIL;
            String str = organizationResponse.poweredBy;
            MatchDonationText matchDonationText = organizationResponse.matchDonationText;
            if (organizationListViewModel2.LLILZ == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableLiveData.setValue(new C19413310xH(null, false, null, list2, str, matchDonationText, false, true, afS60S0110000_29.z1, z2, 4));
        } else {
            OrganizationListViewModel organizationListViewModel3 = (OrganizationListViewModel) afS60S0110000_29.l0;
            MutableLiveData<C19413310xH> mutableLiveData2 = organizationListViewModel3.LL;
            List<OrganizationModel> list3 = organizationListViewModel3.LLILZIL;
            if (organizationListViewModel3.LLILZ == 1) {
                z = true;
            } else {
                z = false;
            }
            mutableLiveData2.setValue(new C19413310xH(null, false, null, list3, null, null, false, false, afS60S0110000_29.z1, z, 180));
        }
        C1C7U.LIZIZ("OrganizationListViewModel@f8d0.getOrganizationList$1");
    }

    public static final void accept$2(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        boolean z;
        C1C7U.LIZ("OrganizationListViewModel@f8d0.getOrganizationList$2");
        C201955140j.LJIIJ(C1632480saE.LIZIZ, "getOrganizationList fail", (Throwable) obj);
        OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS60S0110000_29.l0;
        MutableLiveData<C19413310xH> mutableLiveData = organizationListViewModel.LL;
        List<OrganizationModel> list = organizationListViewModel.LLILZIL;
        if (organizationListViewModel.LLILZ == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C19413310xH(null, false, null, list, null, null, false, false, afS60S0110000_29.z1, z, 180));
        C1C7U.LIZIZ("OrganizationListViewModel@f8d0.getOrganizationList$2");
    }

    public static final void accept$3(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        boolean z;
        int iIntValue;
        int i;
        boolean z2;
        C1C7U.LIZ("OrganizationListViewModel@f8d0.getOrganizationSearchResultList$1");
        OrganizationSearchResultResponse organizationSearchResultResponse = (OrganizationSearchResultResponse) obj;
        if (organizationSearchResultResponse.error_code == 0) {
            OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS60S0110000_29.l0;
            Integer num = organizationSearchResultResponse.cursor;
            if (num == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            organizationListViewModel.LLILLL = iIntValue;
            OrganizationListViewModel organizationListViewModel2 = (OrganizationListViewModel) afS60S0110000_29.l0;
            Boolean bool = organizationSearchResultResponse.hasMore;
            if (bool != null && !Intrinsics.LJFF(bool, Boolean.FALSE)) {
                i = 1;
            } else {
                i = 0;
            }
            organizationListViewModel2.LLILZ = i;
            List<OrganizationSearchResultModel> list = organizationSearchResultResponse.orgList;
            if (list != null) {
                ((ArrayList) ((OrganizationListViewModel) afS60S0110000_29.l0).LLIZ).addAll(list);
            }
            OrganizationListViewModel organizationListViewModel3 = (OrganizationListViewModel) afS60S0110000_29.l0;
            MutableLiveData<C19413310xH> mutableLiveData = organizationListViewModel3.LL;
            List<OrganizationSearchResultModel> list2 = organizationListViewModel3.LLIZ;
            String str = organizationListViewModel3.LLILZLL;
            if (organizationListViewModel3.LLILZ == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableLiveData.setValue(new C19413310xH(str, true, list2, null, null, null, false, true, afS60S0110000_29.z1, z2, 56));
        } else {
            OrganizationListViewModel organizationListViewModel4 = (OrganizationListViewModel) afS60S0110000_29.l0;
            MutableLiveData<C19413310xH> mutableLiveData2 = organizationListViewModel4.LL;
            List<OrganizationSearchResultModel> list3 = organizationListViewModel4.LLIZ;
            String str2 = organizationListViewModel4.LLILZLL;
            if (organizationListViewModel4.LLILZ == 1) {
                z = true;
            } else {
                z = false;
            }
            mutableLiveData2.setValue(new C19413310xH(str2, true, list3, null, null, null, false, false, afS60S0110000_29.z1, z, 184));
        }
        C1C7U.LIZIZ("OrganizationListViewModel@f8d0.getOrganizationSearchResultList$1");
    }

    public static final void accept$4(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        boolean z;
        C1C7U.LIZ("OrganizationListViewModel@f8d0.getOrganizationSearchResultList$2");
        C201955140j.LJIIJ(C1632480saE.LIZIZ, "getOrganizationSearchResultList fail", (Throwable) obj);
        OrganizationListViewModel organizationListViewModel = (OrganizationListViewModel) afS60S0110000_29.l0;
        MutableLiveData<C19413310xH> mutableLiveData = organizationListViewModel.LL;
        List<OrganizationSearchResultModel> list = organizationListViewModel.LLIZ;
        String str = organizationListViewModel.LLILZLL;
        if (organizationListViewModel.LLILZ == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C19413310xH(str, true, list, null, null, null, false, false, afS60S0110000_29.z1, z, 184));
        C1C7U.LIZIZ("OrganizationListViewModel@f8d0.getOrganizationSearchResultList$2");
    }

    public static final void accept$5(AfS60S0110000_29 afS60S0110000_29, Object obj) {
        C1C7U.LIZ("SoundEffectPanelComponent$SoundEffectActionImpl@979.addItemToFavorite$dp$1");
        if (afS60S0110000_29.z1) {
            ((C19555011f2) afS60S0110000_29.l0).LIZ.i3(new AwS41S0001000_29(2131833423, 27));
        } else {
            ((C19555011f2) afS60S0110000_29.l0).LIZ.i3(new AwS41S0001000_29(2131833425, 27));
        }
        C1C7U.LIZIZ("SoundEffectPanelComponent$SoundEffectActionImpl@979.addItemToFavorite$dp$1");
    }

    public AfS60S0110000_29(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
