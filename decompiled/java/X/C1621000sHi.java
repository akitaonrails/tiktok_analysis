package X;

import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionFooterAssem;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionOptionsPanelFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1621000sHi extends C09AY implements InterfaceC1685430txd {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685430txd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5, obj6);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621000sHi(SeriesVipSubscriptionFooterAssem seriesVipSubscriptionFooterAssem, int i) {
        super(6);
        this.$t = i;
        this.l0 = seriesVipSubscriptionFooterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621000sHi(SeriesVipSubscriptionOptionsPanelFragment seriesVipSubscriptionOptionsPanelFragment, int i) {
        super(6);
        this.$t = i;
        this.l0 = seriesVipSubscriptionOptionsPanelFragment;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1621000sHi c1621000sHi, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        UIAssem uIAssem = (UIAssem) obj;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) obj2;
        EnumC1614730s7b enumC1614730s7b = (EnumC1614730s7b) obj3;
        String str = (String) obj4;
        Map map = (Map) obj5;
        List list = (List) obj6;
        if (vipSubscriptionDetailResponse == null) {
            ((SeriesVipSubscriptionFooterAssem) c1621000sHi.l0).LLJILJIL = null;
            C786410Ut5.LJLLLLLL(8, uIAssem.LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
            C1614790s7h c1614790s7hLIZ = C1614760s7e.LIZ(vipSubscriptionDetailResponse, enumC1614730s7b, str, list, map);
            SeriesVipSubscriptionFooterAssem seriesVipSubscriptionFooterAssem = (SeriesVipSubscriptionFooterAssem) c1621000sHi.l0;
            seriesVipSubscriptionFooterAssem.LLJILJIL = c1614790s7hLIZ;
            C1614710s7Z c1614710s7Z = (C1614710s7Z) ((AssemViewModel) seriesVipSubscriptionFooterAssem.LLJ.getValue()).getState();
            ((SeriesVipSubscriptionFooterAssem) c1621000sHi.l0).Jo(c1614790s7hLIZ, c1614710s7Z.LLILZIL, c1614710s7Z.LLILZLL, c1614710s7Z.LLIZLLLIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1621000sHi c1621000sHi, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str;
        VipSubscriptionPurchaseOption next;
        String str2;
        String str3;
        EnumC1614900s7s enumC1614900s7s;
        boolean z;
        String string;
        String str4;
        String str5;
        boolean z2;
        String str6;
        VipSubscriptionPrice vipSubscriptionPrice;
        String str7;
        String str8;
        VipSubscriptionPrice vipSubscriptionPrice2;
        String str9;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) obj2;
        String str10 = (String) obj3;
        Map map = (Map) obj4;
        List<C1612820s4W> list = (List) obj5;
        if (vipSubscriptionDetailResponse != null) {
            VipSubscriptionDetail vipSubscriptionDetail = vipSubscriptionDetailResponse.detail;
            if (vipSubscriptionDetail != null) {
                str = vipSubscriptionDetail.skuId;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Iterator<VipSubscriptionPurchaseOption> it2 = vipSubscriptionDetailResponse.subsOptions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    VipSubscriptionPrice vipSubscriptionPrice3 = next.price;
                    if (vipSubscriptionPrice3 != null) {
                        str9 = vipSubscriptionPrice3.skuId;
                    } else {
                        str9 = null;
                    }
                    if (Intrinsics.LJFF(str9, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption = next;
            if (vipSubscriptionPurchaseOption == null || (vipSubscriptionPrice2 = vipSubscriptionPurchaseOption.price) == null || (str2 = vipSubscriptionPrice2.basePlanId) == null) {
                str2 = "";
            }
            List<VipSubscriptionPurchaseOption> list2 = vipSubscriptionDetailResponse.subsOptions;
            ArrayList arrayList = new ArrayList();
            for (VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption2 : list2) {
                VipSubscriptionPrice vipSubscriptionPrice4 = vipSubscriptionPurchaseOption2.price;
                if (vipSubscriptionPrice4 == null || (str8 = vipSubscriptionPrice4.basePlanId) == null) {
                    str8 = "";
                }
                if (str8.length() > 0) {
                    arrayList.add(vipSubscriptionPurchaseOption2);
                }
            }
            if (obj6 != EnumC1614730s7b.AUTO_RENEW_CANCELED) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : arrayList) {
                    VipSubscriptionPrice vipSubscriptionPrice5 = ((VipSubscriptionPurchaseOption) obj7).price;
                    if (vipSubscriptionPrice5 != null) {
                        str7 = vipSubscriptionPrice5.basePlanId;
                    } else {
                        str7 = null;
                    }
                    if (!Intrinsics.LJFF(str7, str2)) {
                        arrayList2.add(obj7);
                    }
                }
                arrayList = arrayList2;
            }
            if (!arrayList.isEmpty()) {
                VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption3 = (VipSubscriptionPurchaseOption) C13LP.LJJJLL(arrayList);
                if (vipSubscriptionPurchaseOption3 == null || (vipSubscriptionPrice = vipSubscriptionPurchaseOption3.price) == null || (str3 = vipSubscriptionPrice.basePlanId) == null) {
                    str3 = "";
                }
                if (str10.length() > 0 && !arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        VipSubscriptionPrice vipSubscriptionPrice6 = ((VipSubscriptionPurchaseOption) it3.next()).price;
                        if (vipSubscriptionPrice6 != null) {
                            str6 = vipSubscriptionPrice6.basePlanId;
                        } else {
                            str6 = null;
                        }
                        if (Intrinsics.LJFF(str6, str10)) {
                            str3 = str10;
                            break;
                        }
                    }
                }
                if (str3.length() > 0 && !Intrinsics.LJFF(str10, str3)) {
                    ((SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0).SR().GQ2(str3);
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                int i = 16;
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C1612820s4W c1612820s4W : list) {
                    VipSubscriptionPrice vipSubscriptionPrice7 = c1612820s4W.LIZJ;
                    if (vipSubscriptionPrice7 == null || (str5 = vipSubscriptionPrice7.basePlanId) == null) {
                        str5 = "";
                    }
                    String str11 = c1612820s4W.LJ;
                    if (str11 != null && str11.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if ((!Boolean.valueOf(!z2).booleanValue() || str11 == null) && (str11 = c1612820s4W.LIZLLL) == null) {
                        str11 = "";
                    }
                    Pair pair = new Pair(str5, str11);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ2 >= 16) {
                    i = iLIZIZ2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (C1612820s4W c1612820s4W2 : list) {
                    VipSubscriptionPrice vipSubscriptionPrice8 = c1612820s4W2.LIZJ;
                    if (vipSubscriptionPrice8 == null || (str4 = vipSubscriptionPrice8.basePlanId) == null) {
                        str4 = "";
                    }
                    String str12 = c1612820s4W2.LIZLLL;
                    if (str12 == null) {
                        str12 = "";
                    }
                    Pair pair2 = new Pair(str4, str12);
                    linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                }
                SeriesVipSubscriptionOptionsPanelFragment seriesVipSubscriptionOptionsPanelFragment = (SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0;
                LinearLayout linearLayout = seriesVipSubscriptionOptionsPanelFragment.LLJI;
                if (linearLayout != null) {
                    seriesVipSubscriptionOptionsPanelFragment.LLIZ.LIZ(linearLayout, arrayList, str3, vipSubscriptionDetailResponse.purchaseOptionBackgroundImg, linkedHashMap, linkedHashMap2, seriesVipSubscriptionOptionsPanelFragment.SR().DQ2(), new AwS603S0100000_24(seriesVipSubscriptionOptionsPanelFragment, 276));
                }
                String strLIZIZ = C1614760s7e.LIZIZ(vipSubscriptionDetailResponse, str3, list, map);
                if (obj6 == EnumC1614730s7b.AUTO_RENEW_CANCELED) {
                    enumC1614900s7s = EnumC1614900s7s.REACTIVATE;
                } else {
                    enumC1614900s7s = EnumC1614900s7s.CONTINUE;
                }
                C197039127h c197039127h = ((SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0).LLJIJIL;
                if (c197039127h != null) {
                    if (strLIZIZ.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        string = ((SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0).getString(2131848167, strLIZIZ, "");
                    } else if (C1614940s7w.LIZ[enumC1614900s7s.ordinal()] == 1) {
                        string = ((SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0).getString(2131848179);
                    } else {
                        string = ((SeriesVipSubscriptionOptionsPanelFragment) c1621000sHi.l0).getString(2131848167, "", "");
                    }
                    c197039127h.setText(string);
                }
            }
        }
        return Unit.LIZ;
    }
}
