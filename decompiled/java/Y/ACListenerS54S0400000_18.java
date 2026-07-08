package Y;

import X.C04UD;
import X.C1188060h1Q;
import X.C1189060h32;
import X.C1189680h42;
import X.C1191140h6O;
import X.C1194160hBG;
import X.C123100dR;
import X.C1361900lXo;
import X.C1361910lXp;
import X.C1367960lha;
import X.C1558360qeg;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1188920h2o;
import X.InterfaceC1197120hG2;
import X.InterfaceC1197130hG3;
import X.InterfaceC1392640mLO;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemBannerCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsNpsItemCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS54S0400000_18 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        String str;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorMaker poiAnchorMaker = (PoiAnchorMaker) aCListenerS54S0400000_18.l0;
        InterfaceC1197120hG2 interfaceC1197120hG2 = poiAnchorMaker.LLJI;
        InterfaceC1392640mLO interfaceC1392640mLO = poiAnchorMaker.LL;
        InterfaceC1197130hG3 interfaceC1197130hG3 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        View view2 = (View) aCListenerS54S0400000_18.l1;
        Aweme awemeLJIIZILJ = ((PoiAnchorMaker) aCListenerS54S0400000_18.l0).LJIIZILJ();
        PoiAnchorMaker poiAnchorMaker2 = (PoiAnchorMaker) aCListenerS54S0400000_18.l0;
        String str2 = poiAnchorMaker2.LLJIJIL;
        String strLJIJJLI = poiAnchorMaker2.LJIJJLI();
        C2344009Gk c2344009Gk = (C2344009Gk) aCListenerS54S0400000_18.l2;
        PoiDataStruct poiDataStruct = ((PoiAnchorMaker) aCListenerS54S0400000_18.l0).LJIIZILJ().getPoiDataStruct();
        if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.commentAnchor) == null || (str = poiAnchorInfo.trackInfo) == null) {
            str = "";
        }
        interfaceC1197120hG2.LLLLIIL(activityLIZIZ, view2, awemeLJIIZILJ, str2, strLJIJJLI, c2344009Gk, true, null, str, null, false, EnumC1188920h2o.DEFAULT, null, new AwS597S0100000_18((PoiAnchorMaker) aCListenerS54S0400000_18.l0, 735));
        if (((PoiAnchorMaker) aCListenerS54S0400000_18.l0).LJIJI()) {
            C786410Ut5.LIZIZ((Dialog) aCListenerS54S0400000_18.l3);
        }
        if (C04UD.LIZ()) {
            Object tag = ((View) aCListenerS54S0400000_18.l1).getTag(R.id.b09);
            if (tag instanceof InterfaceC1197130hG3) {
                interfaceC1197130hG3 = (InterfaceC1197130hG3) tag;
            }
            C1361910lXp c1361910lXp = (C1361910lXp) C1361900lXo.LIZ("event_enter_detail");
            if (c1361910lXp != null) {
                PoiAnchorMaker poiAnchorMaker3 = (PoiAnchorMaker) aCListenerS54S0400000_18.l0;
                c1361910lXp.LIZJ = "click_list";
                if (interfaceC1197130hG3 != null) {
                    interfaceC1197130hG3.kF(c1361910lXp, poiAnchorMaker3);
                }
            }
        }
    }

    public static final void onClick$1(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        List<PoiReviewsApi.NegativeReason> list;
        ((TuxTextView) aCListenerS54S0400000_18.l0).setSelected(!r1.isSelected());
        List<PoiReviewsApi.NegativeReason> list2 = ((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1).getStoreNpsInfo().npsSelectedReason;
        if (list2 != null && list2.contains((PoiReviewsApi.NegativeReason) aCListenerS54S0400000_18.l2)) {
            if (!((TuxTextView) aCListenerS54S0400000_18.l0).isSelected() && (list = ((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1).getStoreNpsInfo().npsSelectedReason) != null) {
                list.remove((PoiReviewsApi.NegativeReason) aCListenerS54S0400000_18.l2);
            }
        } else if (((TuxTextView) aCListenerS54S0400000_18.l0).isSelected()) {
            if (((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1).getStoreNpsInfo().npsSelectedReason == null) {
                ((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1).getStoreNpsInfo().setNpsSelectedReason(new ArrayList());
            }
            List<PoiReviewsApi.NegativeReason> list3 = ((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1).getStoreNpsInfo().npsSelectedReason;
            if (list3 != null) {
                list3.add((PoiReviewsApi.NegativeReason) aCListenerS54S0400000_18.l2);
            }
        }
        ((PoiReviewsNpsItemCell) aCListenerS54S0400000_18.l3).R5((PoiReviewsApi.PoiNpsInfo) aCListenerS54S0400000_18.l1);
    }

    public static final void onClick$2(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        String collectInfo;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        if (C123100dR.LIZ(((PoiActivityApi.PoiBannerInfo) aCListenerS54S0400000_18.l0).clickUrl)) {
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().LJJLIIIJLLLLLLLZ((Context) aCListenerS54S0400000_18.l1, ((PoiActivityApi.PoiBannerInfo) aCListenerS54S0400000_18.l0).clickUrl);
            IPoiVideoListAbility iPoiVideoListAbilityI5 = ((PoiMergedListItemBannerCell) aCListenerS54S0400000_18.l2).I5();
            String str = "";
            if (iPoiVideoListAbilityI5 != null) {
                String str2 = ((PoiActivityApi.PoiBannerInfo) aCListenerS54S0400000_18.l0).activityId;
                if (str2 == null) {
                    str2 = "";
                }
                iPoiVideoListAbilityI5.sd1(str2);
            }
            String str3 = ((PoiActivityApi.PoiBannerInfo) aCListenerS54S0400000_18.l0).activityId;
            if (str3 == null) {
                str3 = "";
            }
            C1194160hBG.LJI(str3, "poi_detail");
            C1189680h42 c1189680h42 = C1189680h42.LIZ;
            String str4 = ((PoiActivityApi.PoiBannerInfo) aCListenerS54S0400000_18.l0).activityId;
            if (str4 != null) {
                str = str4;
            }
            String str5 = ((C1188060h1Q) aCListenerS54S0400000_18.l3).LLILLJJLI;
            AssemVMLazy assemVMLazy = ((PoiMergedListItemBannerCell) aCListenerS54S0400000_18.l2).LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiMergedListItemBannerCell.LLILZLL;
            int iBW = 0;
            PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LLILLJJLI;
            if (poiDetailResponse != null) {
                collectInfo = poiDetailResponse.getCollectInfo();
            } else {
                collectInfo = null;
            }
            PoiMergedListItemBannerCell poiMergedListItemBannerCell = (PoiMergedListItemBannerCell) aCListenerS54S0400000_18.l2;
            int bindingAdapterPosition = poiMergedListItemBannerCell.getBindingAdapterPosition();
            IPoiVideoListAbility iPoiVideoListAbilityI52 = poiMergedListItemBannerCell.I5();
            if (iPoiVideoListAbilityI52 != null) {
                iBW = iPoiVideoListAbilityI52.bW();
            }
            Integer numValueOf = Integer.valueOf((bindingAdapterPosition - iBW) + 1);
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiMergedListItemBannerCell) aCListenerS54S0400000_18.l2);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            C1189680h42.LIZ(c1189680h42, false, "poi_detail", str, 1, str5, collectInfo, numValueOf, interfaceC665370Q7zLJFF, null, PageFinder.via(C1189060h32.LJIIJ((PoiMergedListItemBannerCell) aCListenerS54S0400000_18.l2)), 256);
        }
    }

    public static final void onClick$3(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        String str;
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) aCListenerS54S0400000_18.l0;
        if (poiReviewModel == null) {
            return;
        }
        C1191140h6O c1191140h6O = (C1191140h6O) aCListenerS54S0400000_18.l1;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        c1191140h6O.e0("click_review_head", str, view.getContext(), poiReviewModel.getReviewId(), (Integer) aCListenerS54S0400000_18.l2, (View) aCListenerS54S0400000_18.l3);
    }

    public static final void onClick$4(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        String str;
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) aCListenerS54S0400000_18.l0;
        if (poiReviewModel == null) {
            return;
        }
        C1191140h6O c1191140h6O = (C1191140h6O) aCListenerS54S0400000_18.l1;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        c1191140h6O.e0("click_review_name", str, view.getContext(), poiReviewModel.getReviewId(), (Integer) aCListenerS54S0400000_18.l2, (View) aCListenerS54S0400000_18.l3);
    }

    public static final void onClick$5(ACListenerS54S0400000_18 aCListenerS54S0400000_18, View view) {
        String str;
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) aCListenerS54S0400000_18.l0;
        if (poiReviewModel == null) {
            return;
        }
        C1191140h6O c1191140h6O = (C1191140h6O) aCListenerS54S0400000_18.l1;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        c1191140h6O.e0("click_review_rating", str, view.getContext(), poiReviewModel.getReviewId(), (Integer) aCListenerS54S0400000_18.l2, (View) aCListenerS54S0400000_18.l3);
    }

    public ACListenerS54S0400000_18(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
