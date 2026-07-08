package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740940vPA implements InterfaceC1741330vPn {
    public final ShopMallMixFragment LIZ;
    public DiversionTargetResCfg LIZIZ;
    public InterfaceC1740740vOq LIZJ;
    public final AwS570S0100000_26 LIZLLL = new AwS570S0100000_26(this, 1617);

    @Override // X.InterfaceC1741330vPn
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZJ() {
    }

    public C1740940vPA(ShopMallMixFragment shopMallMixFragment) {
        this.LIZ = shopMallMixFragment;
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZ(C1741260vPg c1741260vPg) {
        boolean z;
        AnonymousClass0957<n> anonymousClass0957LIZIZ;
        C1741090vPP c1741090vPP;
        DiversionTargetResCfg diversionTargetResCfg;
        EnumC1741180vPY enumC1741180vPY = c1741260vPg.LIZIZ;
        EnumC1741180vPY enumC1741180vPY2 = EnumC1741180vPY.IN_MALL_HOMEPAGE;
        if ((enumC1741180vPY == enumC1741180vPY2 && c1741260vPg.LIZ == EnumC1741180vPY.OUT_OF_MALL) || (enumC1741180vPY == EnumC1741180vPY.IN_MALL_NOT_LOGIN && c1741260vPg.LIZ == EnumC1741180vPY.OUT_OF_MALL)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
            if (iEcUgBackButtonServiceOfficial != null) {
                iEcUgBackButtonServiceOfficial.LJ(this.LIZLLL);
            }
        } else if (enumC1741180vPY == EnumC1741180vPY.OUT_OF_MALL) {
            InterfaceC1740740vOq interfaceC1740740vOq = this.LIZJ;
            if (interfaceC1740740vOq != null) {
                interfaceC1740740vOq.hide();
            }
            this.LIZJ = null;
            IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial2 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
            if (iEcUgBackButtonServiceOfficial2 != null) {
                iEcUgBackButtonServiceOfficial2.LJI(this.LIZLLL);
            }
        }
        if (c1741260vPg.LJ()) {
            this.LIZ.LLJJJ.getClass();
            C1767790w6T c1767790w6T = C1767980w6m.LJII;
            if (c1741260vPg.LIZJ.LIZIZ && c1767790w6T != null && (c1741090vPP = c1767790w6T.LIZIZ) != null && (diversionTargetResCfg = c1741090vPP.LJ) != null) {
                if (!c1767790w6T.LIZ()) {
                    LIZLLL(diversionTargetResCfg, c1767790w6T);
                } else {
                    this.LIZIZ = diversionTargetResCfg;
                }
            }
            if (c1741260vPg.LIZIZ == enumC1741180vPY2) {
                EnumC1741200vPa enumC1741200vPa = c1741260vPg.LIZJ.LIZ;
                if (enumC1741200vPa == EnumC1741200vPa.CLOSE_LANDING_PAGE_FULL_SCREEN || enumC1741200vPa == EnumC1741200vPa.CLOSE_LANDING_PAGE_HALF_SCREEN) {
                    IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
                    if (iEcUgPayToMallService != null && (anonymousClass0957LIZIZ = iEcUgPayToMallService.LIZIZ()) != null && !anonymousClass0957LIZIZ.isCancelled()) {
                        C948503nH.LJIIIIZZ(this.LIZ, new C1734030vE1(anonymousClass0957LIZIZ, this, c1767790w6T, null));
                        return;
                    }
                    DiversionTargetResCfg diversionTargetResCfg2 = this.LIZIZ;
                    if (diversionTargetResCfg2 == null) {
                        return;
                    }
                    this.LIZIZ = null;
                    LIZLLL(diversionTargetResCfg2, c1767790w6T);
                }
            }
        }
    }

    public final void LIZLLL(DiversionTargetResCfg diversionTargetResCfg, C1767790w6T c1767790w6T) {
        C1740600vOc c1740600vOc;
        String str;
        String str2;
        Map<String, Object> mapLJ;
        C1767860w6a c1767860w6a = C1767860w6a.LIZ;
        ShopMallMixFragment shopMallMixFragment = this.LIZ;
        c1767860w6a.getClass();
        C1740720vOo c1740720vOoLJFF = null;
        String str3 = null;
        if (C7879035x.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1741460vQ0.DIVERSION_BACK_BUTTON.getCCode());
            sbLIZ.append('.');
            sbLIZ.append(EnumC1741490vQ3.DIVERSION_BACK_BUTTON.getDCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = strLIZIZ;
            c21244318Bt.LIZIZ = PageFinder.via((Fragment) shopMallMixFragment);
            c1740600vOc = new C1740600vOc(c21244318Bt, null);
        } else {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC1741460vQ0.DIVERSION_BACK_BUTTON.getCCode());
                sbLIZ2.append('.');
                sbLIZ2.append(EnumC1741490vQ3.DIVERSION_BACK_BUTTON.getDCode());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                C21244318Bt c21244318Bt2 = new C21244318Bt();
                c21244318Bt2.LIZ = strLIZIZ2;
                c21244318Bt2.LIZIZ = PageFinder.via((Fragment) shopMallMixFragment);
                c1740600vOc = new C1740600vOc(c21244318Bt2, null);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                c1740600vOc = null;
            }
        }
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null) {
            ShopMallMixFragment shopMallMixFragment2 = this.LIZ;
            View viewFindViewById = shopMallMixFragment2.LLILZLL;
            if (viewFindViewById == null) {
                View view = shopMallMixFragment2.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.i37);
                } else {
                    viewFindViewById = null;
                }
                shopMallMixFragment2.LLILZLL = (FrameLayout) viewFindViewById;
            }
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            HashMap map = new HashMap();
            C0CXF.LIZ.getClass();
            if (!C0CXF.LIZJ()) {
                str = "mall";
            } else {
                str = "homepage_mall";
            }
            map.put("enter_from", str);
            Pair[] pairArr = new Pair[1];
            if (c1767790w6T != null) {
                str2 = c1767790w6T.LJI;
            } else {
                str2 = null;
            }
            pairArr[0] = new Pair("mall_extra_info", str2);
            C1008603wy.LIZ(map, pairArr);
            Pair[] pairArr2 = new Pair[1];
            if (c1767790w6T != null) {
                str3 = c1767790w6T.LJIIIZ;
            }
            pairArr2[0] = new Pair("previous_page", str3);
            C1008603wy.LIZ(map, pairArr2);
            map.put("page_name", "mall");
            IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
            if (iEcUgBtmService != null && (mapLJ = iEcUgBtmService.LJ(c1740600vOc)) != null) {
                map.putAll(mapLJ);
            }
            c1740720vOoLJFF = iEcUgBackButtonServiceOfficial.LJFF(shopMallMixFragment2, viewGroup, diversionTargetResCfg, map, new AwS570S0100000_26(this, 1618));
        }
        this.LIZJ = c1740720vOoLJFF;
    }
}
