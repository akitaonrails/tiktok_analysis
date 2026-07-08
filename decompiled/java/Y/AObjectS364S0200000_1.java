package Y;

import X.AnonymousClass0311;
import X.AnonymousClass0376;
import X.C03DW;
import X.C03JR;
import X.C03O0;
import X.C10516049i;
import X.C13BV;
import X.C1748720vbi;
import X.C724240Sb0;
import X.C7939038f;
import X.C7969039j;
import X.C808003Dq;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.bonus.BonusInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspPudoAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupLayerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.shared.SkuPropTitleAssem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AObjectS364S0200000_1 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS364S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object invoke$0(AObjectS364S0200000_1 aObjectS364S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        Boolean boolValueOf;
        String str2 = (String) obj2;
        String str3 = ((USOspPudoAddressCell) aObjectS364S0200000_1.l0).LLJJIII;
        if (str3 != null) {
            C03O0.LJJJJLL(C03O0.LIZ, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388607);
        }
        if (str2 != null) {
            C03JR c03jrL5 = ((USOspPudoAddressCell) aObjectS364S0200000_1.l0).L5();
            AnonymousClass0376 anonymousClass0376 = ((AnonymousClass0311) aObjectS364S0200000_1.l1).LLILLJJLI;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = ((USOspPudoAddressCell) aObjectS364S0200000_1.l0).N5();
            if (((USOspPudoAddressCell) aObjectS364S0200000_1.l0).L5().getNoPudoAddress()) {
                str = "add";
            } else {
                str = "edit";
            }
            if (!((USOspPudoAddressCell) aObjectS364S0200000_1.l0).L5().getNoPudoAddress()) {
                boolValueOf = Boolean.valueOf(((USOspPudoAddressCell) aObjectS364S0200000_1.l0).L5().LLJJIII);
            } else {
                boolValueOf = null;
            }
            c03jrL5.h0(anonymousClass0376, orderSubmitAssemViewModelN5, str, boolValueOf);
            AssemVMLazy assemVMLazy = ((USOspPudoAddressCell) aObjectS364S0200000_1.l0).LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USOspPudoAddressCell.LLJJIJI;
            assemVMLazy.getValue();
            OspAddressViewModel.yQ2(((USOspPudoAddressCell) aObjectS364S0200000_1.l0).itemView.getContext(), str2, ((USOspPudoAddressCell) aObjectS364S0200000_1.l0).N5());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS364S0200000_1 aObjectS364S0200000_1, Object obj, Object obj2, Object obj3) {
        ECBaseFragment eCBaseFragment;
        Context context;
        String str = (String) obj2;
        Fragment fragmentLJI = C724240Sb0.LJI((SkuPropTitleAssem) aObjectS364S0200000_1.l0);
        Map<String, String> map = null;
        if ((fragmentLJI instanceof ECBaseFragment) && (eCBaseFragment = (ECBaseFragment) fragmentLJI) != null && (context = ((SkuPropTitleAssem) aObjectS364S0200000_1.l0).getContext()) != null) {
            if (str == null) {
                str = ((PropButton) aObjectS364S0200000_1.l1).schema;
            }
            C03DW c03dwSp = ((SkuPropTitleAssem) aObjectS364S0200000_1.l0).sp();
            if (c03dwSp != null) {
                PropButtonExtraInfo propButtonExtraInfo = ((PropButton) aObjectS364S0200000_1.l1).extraInfo;
                if (propButtonExtraInfo != null) {
                    map = propButtonExtraInfo.eventTrackingTriggerKeys;
                }
                c03dwSp.aE2(eCBaseFragment, context, str, map);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS364S0200000_1 aObjectS364S0200000_1, Object obj, Object obj2, Object obj3) {
        FragmentManager fragmentManager;
        String str;
        List<BillItem> listLIZ;
        String str2;
        String str3 = (String) obj2;
        if (str3 != null) {
            BonusInfoCell bonusInfoCell = (BonusInfoCell) aObjectS364S0200000_1.l0;
            BonusInfo bonusInfo = (BonusInfo) aObjectS364S0200000_1.l1;
            Uri uri = UriProtector.parse(str3);
            String scheme = uri.getScheme();
            String str4 = "";
            if (scheme == null) {
                scheme = "";
            }
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            if ((Intrinsics.LJFF(scheme, "ec_action://") || Intrinsics.LJFF(host, "ec")) && Intrinsics.LJFF(path, "/popup") && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "bonus_info_layer")) {
                Fragment fragment = bonusInfoCell.getFragment();
                if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                    Context context = bonusInfoCell.itemView.getContext();
                    C7969039j c7969039j = C7969039j.LIZ;
                    PopupLayerDetailInfo popupLayerDetailInfo = bonusInfo.popupLayerDetailInfo;
                    if (popupLayerDetailInfo != null) {
                        str = popupLayerDetailInfo.desc;
                    } else {
                        str = null;
                    }
                    if (popupLayerDetailInfo == null || (listLIZ = popupLayerDetailInfo.LIZ()) == null) {
                        listLIZ = C13BV.INSTANCE;
                    }
                    C7939038f c7939038fLIZJ = C808003Dq.LIZJ(context, C7969039j.LJFF(c7969039j, str, null, listLIZ, 100, 2));
                    PopupLayerDetailInfo popupLayerDetailInfo2 = bonusInfo.popupLayerDetailInfo;
                    if (popupLayerDetailInfo2 != null && (str2 = popupLayerDetailInfo2.title) != null) {
                        str4 = str2;
                    }
                    C808003Dq.LJFF(C808003Dq.LIZLLL(c7939038fLIZJ, str4, false, null, 60), fragmentManager, null, null, 12);
                }
                C1748720vbi.LIZLLL(bonusInfoCell.itemView, new C10516049i(), new AwS367S0200000_1(bonusInfoCell, bonusInfo, 386));
            }
        }
        return Unit.LIZ;
    }
}
