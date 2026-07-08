package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.ECMixMallLifecycleAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.ability.EcMixMallDiversionAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardModelV2;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadSceneConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoLynxDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallBlockRunnableOptModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallJatoConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772240wDe extends AbstractC1772270wDh implements InterfaceC1581920rGg {
    public C18Z6 LLILLJJLI;
    public C1773630wFt LLILLL;
    public C21609119hZ LLILZ;
    public final C21609119hZ LLILZIL;
    public CopyOnWriteArrayList<InterfaceC1772480wE2> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public AbstractC1768210w79 LLJI;

    @Override // X.AbstractC1772270wDh
    public int getLayoutId() {
        return R.layout.aye;
    }

    @Override // X.InterfaceC1581920rGg
    public final void LJFF() {
        LJIIIIZZ("fetch", "pull", null, Boolean.TRUE, Boolean.FALSE, null, false);
    }

    public final void LJIILIIL() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        AbstractC1768210w79 abstractC1768210w79 = this.LLJI;
        if (abstractC1768210w79 != null) {
            abstractC1768210w79.LIZIZ();
        }
    }

    public final C18Z6 getHybridListViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtj);
            this.LLILLJJLI = (C18Z6) callbackFindViewById;
        }
        return (C18Z6) callbackFindViewById;
    }

    public final C1773630wFt getHybridListViewHeaderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtk);
            this.LLILLL = (C1773630wFt) callbackFindViewById;
        }
        return (C1773630wFt) callbackFindViewById;
    }

    public final C21609119hZ getHybridListViewRefreshFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jtl);
            this.LLILZ = (C21609119hZ) callbackFindViewById;
        }
        return (C21609119hZ) callbackFindViewById;
    }

    public final void LJIIJ() {
        EcMixMallDiversionAbility ecMixMallDiversionAbility;
        String str;
        Map<String, Object> mapLJIJ;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        ECMixMallItemInfoLynxDTO eCMixMallItemInfoLynxDTO;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ;
        C1772630wEH c1772630wEHC82;
        InterfaceC1773310wFN controller = getController();
        String str2 = null;
        C1773330wFP c1773330wFP = (controller == null || (interfaceC1772680wEMLJIIIZ = controller.LJIIIZ()) == null || (c1772630wEHC82 = interfaceC1772680wEMLJIIIZ.c82()) == null) ? null : c1772630wEHC82.LJ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ == null || (ecMixMallDiversionAbility = (EcMixMallDiversionAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), EcMixMallDiversionAbility.class, null)) == null) {
            return;
        }
        if (c1773330wFP == null || (eCMixMallItemInfoDTO = c1773330wFP.LJIIIZ) == null || (eCMixMallItemInfoLynxDTO = eCMixMallItemInfoDTO.lynx) == null) {
            str = null;
            if (c1773330wFP == null) {
                mapLJIJ = null;
            }
            ecMixMallDiversionAbility.Vu1(this, str, str2, mapLJIJ);
        }
        str = eCMixMallItemInfoLynxDTO.schema;
        mapLJIJ = c1773330wFP.LJIJ();
        str2 = c1773330wFP.LIZJ;
        ecMixMallDiversionAbility.Vu1(this, str, str2, mapLJIJ);
    }

    public final void LJIIJJI() {
        InterfaceC1772360wDq interfaceC1772360wDqLJIILIIL;
        AssemViewModel assemViewModel;
        C1772650wEJ c1772650wEJLIZLLL;
        Map<String, Object> map;
        InterfaceC1773770wG7 interfaceC1773770wG7LJ;
        String strLJI;
        ECMixMallStyleDTO eCMixMallStyleDTO;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ;
        C1772650wEJ c1772650wEJLIZLLL2;
        InterfaceC1773310wFN controller = getController();
        Object objLIZ = null;
        LJIILL((controller == null || (c1772650wEJLIZLLL2 = controller.LIZLLL()) == null) ? null : c1772650wEJLIZLLL2.LJIIL);
        InterfaceC1773310wFN controller2 = getController();
        C1772630wEH c1772630wEHC82 = (controller2 == null || (interfaceC1772680wEMLJIIIZ = controller2.LJIIIZ()) == null) ? null : interfaceC1772680wEMLJIIIZ.c82();
        String strLIZ = C1772370wDr.LIZ((c1772630wEHC82 == null || (eCMixMallStyleDTO = c1772630wEHC82.LIZIZ) == null) ? null : Integer.valueOf(eCMixMallStyleDTO.statusBarStyle));
        InterfaceC1773310wFN controller3 = getController();
        if (controller3 != null && (interfaceC1773770wG7LJ = controller3.LJ()) != null && (strLJI = interfaceC1773770wG7LJ.LJI()) != null) {
            strLIZ = strLJI;
        }
        InterfaceC1773310wFN controller4 = getController();
        if (controller4 != null && (c1772650wEJLIZLLL = controller4.LIZLLL()) != null && (map = c1772650wEJLIZLLL.LJIIIZ) != null) {
            objLIZ = C7726030a.LIZ("shop_mix_mall_vm", map);
        }
        if ((objLIZ instanceof ShopMallMixViewModel) && (assemViewModel = (AssemViewModel) objLIZ) != null) {
            assemViewModel.setState(new AwS74S1000000_24(strLIZ, 10));
        }
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        InterfaceC1773310wFN controller5 = getController();
        if (controller5 != null && (interfaceC1772360wDqLJIILIIL = controller5.LJIILIIL()) != null) {
            interfaceC1772360wDqLJIILIIL.Sm0();
        }
        AbstractC1768210w79 abstractC1768210w79 = this.LLJI;
        if (abstractC1768210w79 != null) {
            abstractC1768210w79.LIZ();
        }
    }

    @Override // X.AbstractC1772270wDh
    public View getBodyImage() {
        return findViewById(R.id.c8a);
    }

    @Override // X.AbstractC1772270wDh
    public C18Z6 getBodyList() {
        return getHybridListViewFromXml();
    }

    @Override // X.AbstractC1772270wDh
    public ViewGroup getBodyView() {
        return getHybridListViewRefreshFromXml();
    }

    @Override // X.AbstractC1772270wDh
    public View getContainerImage() {
        return findViewById(R.id.es4);
    }

    @Override // X.AbstractC1772270wDh
    public View getHeaderImage() {
        return findViewById(R.id.jjh);
    }

    @Override // X.AbstractC1772270wDh
    public C1773630wFt getHeaderView() {
        return getHybridListViewHeaderFromXml();
    }

    @Override // X.AbstractC1772270wDh
    public final void LIZIZ(AbstractC1772340wDo abstractC1772340wDo) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadMoreStateChanged: ");
            sbLIZ.append(abstractC1772340wDo.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MixMall", strLIZIZ);
        }
        if (!(abstractC1772340wDo instanceof C1772420wDw)) {
            if (abstractC1772340wDo instanceof C1772350wDp) {
                LJIILJJIL(true, "", ((C1772350wDp) abstractC1772340wDo).LIZIZ, getController());
            } else {
                if (!(abstractC1772340wDo instanceof C1772330wDn)) {
                    return;
                }
                LJII(false);
                C1772330wDn c1772330wDn = (C1772330wDn) abstractC1772340wDo;
                LJIILJJIL(false, c1772330wDn.LIZJ, c1772330wDn.LIZIZ, getController());
            }
        }
    }

    @Override // X.AbstractC1772270wDh
    public final void LIZJ(AbstractC1772290wDj abstractC1772290wDj) {
        IECommerceHostService iECommerceHostService;
        Object objLIZ;
        AssemViewModel assemViewModel;
        C1772650wEJ c1772650wEJLIZLLL;
        Map<String, Object> map;
        ShopMallMixViewModel shopMallMixViewModel;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model;
        List<ECMixMallCardModelV2> list;
        C1772650wEJ c1772650wEJLIZLLL2;
        Map<String, Object> map2;
        AssemViewModel assemViewModel2;
        C1772650wEJ c1772650wEJLIZLLL3;
        Map<String, Object> map3;
        C1772650wEJ c1772650wEJLIZLLL4;
        InterfaceC599750Nfh interfaceC599750Nfh;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        InterfaceC1772410wDv interfaceC1772410wDvLIZ;
        AssemViewModel assemViewModel3;
        C1772650wEJ c1772650wEJLIZLLL5;
        Map<String, Object> map4;
        IECommerceHostService iECommerceHostService2;
        ShopMallMixViewModel shopMallMixViewModel2;
        C1772650wEJ c1772650wEJLIZLLL6;
        Map<String, Object> map5;
        ShopMallMixViewModel shopMallMixViewModel3;
        C1772650wEJ c1772650wEJLIZLLL7;
        Map<String, Object> map6;
        boolean z;
        String name;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ2;
        InterfaceC1772410wDv interfaceC1772410wDvLIZ2;
        AssemViewModel assemViewModel4;
        C1772650wEJ c1772650wEJLIZLLL8;
        Map<String, Object> map7;
        boolean z2;
        String name2;
        Object objLIZ2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageStateChanged: ");
            sbLIZ.append(abstractC1772290wDj.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("mmk_vc", strLIZIZ);
        }
        if (abstractC1772290wDj instanceof C1772400wDu) {
            C0CNO.LIZLLL(0L, new AwS570S0100000_26(this, 633));
            LJIIJ();
            LJIIL(true);
            this.LLILZIL.setRefreshing(false);
            LJII(true);
            InterfaceC1773310wFN controller = getController();
            if (controller != null && (c1772650wEJLIZLLL8 = controller.LIZLLL()) != null && (map7 = c1772650wEJLIZLLL8.LJIIIZ) != null) {
                objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map7);
            }
            if ((objLIZ2 instanceof ShopMallMixViewModel) && (assemViewModel4 = (AssemViewModel) objLIZ2) != null) {
                assemViewModel4.setState(AFwS264S0000000_24.get$arr$(569));
            }
            InterfaceC1773310wFN controller2 = getController();
            if (controller2 != null && (interfaceC1773890wGJLIZJ2 = controller2.LIZJ()) != null && (interfaceC1772410wDvLIZ2 = C1774010wGV.LIZ(interfaceC1773890wGJLIZJ2)) != null) {
                interfaceC1772410wDvLIZ2.LIZ("refreshEnd");
                return;
            }
            return;
        }
        if (abstractC1772290wDj instanceof C1772300wDk) {
            C1326580kcq.LIZIZ(EnumC1326570kcp.IDLE);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService2).isDebug()) {
                C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("error type: ");
                sbLIZ2.append(((C1772300wDk) abstractC1772290wDj).LIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo2.getClass();
                C599820Nfo.LIZ("MixMall", strLIZIZ2);
            }
            this.LLILZIL.setRefreshing(false);
            LJII(false);
            int i = C863090XtT.LIZ[((C1772300wDk) abstractC1772290wDj).LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                InterfaceC1773310wFN controller3 = getController();
                if (controller3 != null && (c1772650wEJLIZLLL7 = controller3.LIZLLL()) != null && (map6 = c1772650wEJLIZLLL7.LJIIIZ) != null) {
                    objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map6);
                }
                if ((objLIZ2 instanceof ShopMallMixViewModel) && (shopMallMixViewModel3 = (ShopMallMixViewModel) objLIZ2) != null) {
                    shopMallMixViewModel3.xQ2(this);
                }
                LJIILIIL();
                return;
            }
            InterfaceC1773310wFN controller4 = getController();
            if (controller4 != null && (c1772650wEJLIZLLL6 = controller4.LIZLLL()) != null && (map5 = c1772650wEJLIZLLL6.LJIIIZ) != null) {
                objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map5);
            }
            if ((objLIZ2 instanceof ShopMallMixViewModel) && (shopMallMixViewModel2 = (ShopMallMixViewModel) objLIZ2) != null) {
                shopMallMixViewModel2.xQ2(this);
            }
            LJIILIIL();
            return;
        }
        if (abstractC1772290wDj instanceof C1772390wDt) {
            InterfaceC1773310wFN controller5 = getController();
            if (controller5 != null && (c1772650wEJLIZLLL5 = controller5.LIZLLL()) != null && (map4 = c1772650wEJLIZLLL5.LJIIIZ) != null) {
                objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map4);
            }
            if ((objLIZ2 instanceof ShopMallMixViewModel) && (assemViewModel3 = (AssemViewModel) objLIZ2) != null && !(((C1571460qzo) assemViewModel3.getState()).LL instanceof C1623606Xi)) {
                assemViewModel3.setState(AFwS264S0000000_24.get$arr$(568));
            }
            InterfaceC1773310wFN controller6 = getController();
            if (controller6 == null || (interfaceC1773890wGJLIZJ = controller6.LIZJ()) == null || (interfaceC1772410wDvLIZ = C1774010wGV.LIZ(interfaceC1773890wGJLIZJ)) == null) {
                return;
            }
            interfaceC1772410wDvLIZ.LJIILLIIL("refreshStart", false);
            return;
        }
        if (abstractC1772290wDj instanceof C1772450wDz) {
            this.LLILZIL.setRefreshing(false);
            LJII(true);
            InterfaceC1773310wFN controller7 = getController();
            if (controller7 != null && (c1772650wEJLIZLLL4 = controller7.LIZLLL()) != null && (interfaceC599750Nfh = c1772650wEJLIZLLL4.LJIIJJI) != null) {
                interfaceC599750Nfh.LJ("is_use_cache", CardStruct.IStatusCode.DEFAULT, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
            C0CNO.LIZLLL(0L, new AwS570S0100000_26(this, 634));
            return;
        }
        if (abstractC1772290wDj instanceof C1772430wDx) {
            C0CNO.LIZLLL(0L, new AwS570S0100000_26(this, 635));
            LJIIL(false);
            InterfaceC1773310wFN controller8 = getController();
            if (controller8 != null && (c1772650wEJLIZLLL3 = controller8.LIZLLL()) != null && (map3 = c1772650wEJLIZLLL3.LJIIIZ) != null) {
                objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map3);
            }
            if ((objLIZ2 instanceof ShopMallMixViewModel) && (assemViewModel2 = (AssemViewModel) objLIZ2) != null) {
                assemViewModel2.setState(AFwS264S0000000_24.get$arr$(569));
            }
            C0VWW.LIZIZ("ec_mix_mall_open");
            C2184271Ae9.LIZ.getClass();
            if (((ECMixMallBlockRunnableOptModel) C2184271Ae9.LIZJ.getValue()).enable) {
                C1BCA.LJJIIZI((C2184901AfA) C2184271Ae9.LIZLLL.getValue());
            }
            C1772310wDl.LIZ.getClass();
            C2183971Adf.LIZ((ECMixMallJatoConfigModel) C1772310wDl.LIZJ.getValue());
            return;
        }
        if (!(abstractC1772290wDj instanceof C1772440wDy)) {
            return;
        }
        InterfaceC1773310wFN controller9 = getController();
        if (controller9 != null && (c1772650wEJLIZLLL2 = controller9.LIZLLL()) != null && (map2 = c1772650wEJLIZLLL2.LJIIIZ) != null) {
            objLIZ = C7726030a.LIZ("shop_mix_mall_vm", map2);
        } else {
            objLIZ = null;
        }
        if ((objLIZ instanceof ShopMallMixViewModel) && (shopMallMixViewModel = (ShopMallMixViewModel) objLIZ) != null) {
            C1770900wBU c1770900wBU = C1770900wBU.LIZ;
            InterfaceC599750Nfh interfaceC599750Nfh2 = shopMallMixViewModel.globalContext;
            C1772750wET c1772750wET = shopMallMixViewModel.LLILLL;
            c1770900wBU.getClass();
            C08L6.LIZ.getClass();
            C08L6.LIZ("mall", "preload");
            if (C1770900wBU.LJII()) {
                C1768440w7W.LIZ.getClass();
                EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ = C1768440w7W.LIZ();
                if (ecMixMallPreloadConfigV2ModelLIZ != null && (ecMixMallPreloadSceneConfigV2Model = ecMixMallPreloadConfigV2ModelLIZ.preloadScene) != null && (list = ecMixMallPreloadSceneConfigV2Model.afterCacheRender) != null) {
                    C1770900wBU.LIZLLL(EnumC1768470w7Z.AFTER_CACHE, list, interfaceC599750Nfh2, c1772750wET);
                }
            } else {
                C1770900wBU.LJIILIIL(interfaceC599750Nfh2);
                C1770900wBU.LJIIL();
                if (((Boolean) C1770900wBU.LJIIZILJ.getValue()).booleanValue()) {
                    C1770900wBU.LJIILL(C1770900wBU.LJFF(), EnumC1768470w7Z.AFTER_CACHE, c1772750wET, interfaceC599750Nfh2);
                }
                if (((Boolean) C1770900wBU.LJIJ.getValue()).booleanValue()) {
                    C1770900wBU.LJIILLIIL(C1770900wBU.LJFF(), EnumC1768470w7Z.AFTER_CACHE, c1772750wET);
                }
            }
        }
        this.LLILZIL.setRefreshing(false);
        C0CNO.LIZLLL(0L, new AwS570S0100000_26(this, 636));
        InterfaceC1773310wFN controller10 = getController();
        if (controller10 != null && (c1772650wEJLIZLLL = controller10.LIZLLL()) != null && (map = c1772650wEJLIZLLL.LJIIIZ) != null) {
            objLIZ2 = C7726030a.LIZ("shop_mix_mall_vm", map);
        }
        if (!(objLIZ2 instanceof ShopMallMixViewModel) || (assemViewModel = (AssemViewModel) objLIZ2) == null) {
            return;
        }
        assemViewModel.setState(AFwS264S0000000_24.get$arr$(569));
    }

    public final void LJII(boolean z) {
        CopyOnWriteArrayList<InterfaceC1772480wE2> copyOnWriteArrayList = this.LLILZLL;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1772480wE2> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(z);
            }
        }
        CopyOnWriteArrayList<InterfaceC1772480wE2> copyOnWriteArrayList2 = this.LLILZLL;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.LLJ = false;
    }

    public final void LJIIL(boolean z) {
        C19EG c19egLIZIZ;
        ECMixMallLifecycleAbility eCMixMallLifecycleAbility;
        EcMixMallDiversionAbility ecMixMallDiversionAbility;
        C1326580kcq.LIZIZ(EnumC1326570kcp.IDLE);
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ2 != null && (ecMixMallDiversionAbility = (EcMixMallDiversionAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ2, null), EcMixMallDiversionAbility.class, null)) != null) {
            ecMixMallDiversionAbility.gz2(z);
        }
        if (!z && (c19egLIZIZ = C1388190mED.LIZIZ(getContext())) != null && (eCMixMallLifecycleAbility = (ECMixMallLifecycleAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), ECMixMallLifecycleAbility.class, null)) != null) {
            eCMixMallLifecycleAbility.ZI1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C1772750wET r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772240wDe.LJIILL(X.0wET):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC1773310wFN controller;
        InterfaceC606320NqI eventCenter;
        if (motionEvent != null && motionEvent.getAction() == 0 && (controller = getController()) != null && (eventCenter = controller.getEventCenter()) != null) {
            eventCenter.LIZLLL("ec_mix_mall_motion_event_action_down", null, null, false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setHybridListViewFromXml(C18Z6 c18z6) {
        this.LLILLJJLI = c18z6;
    }

    public final void setHybridListViewHeaderFromXml(C1773630wFt c1773630wFt) {
        this.LLILLL = c1773630wFt;
    }

    public final void setHybridListViewRefreshFromXml(C21609119hZ c21609119hZ) {
        this.LLILZ = c21609119hZ;
    }

    public final void setLoadCallback(AbstractC1768210w79 abstractC1768210w79) {
        this.LLJI = abstractC1768210w79;
    }

    public C1772240wDe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C21609119hZ c21609119hZ = (C21609119hZ) findViewById(R.id.jtl);
        this.LLILZIL = c21609119hZ;
        c21609119hZ.setOnRefreshListener(this);
    }

    public static C1774640wHW LJIIIZ(RecyclerView recyclerView, String str, String str2) {
        String strLJIIIZ;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            Object childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder instanceof AbstractC1773460wFc) {
                D d = ((AbstractC1773460wFc) childViewHolder).LLILLL;
                if (d != 0) {
                    strLJIIIZ = d.LJIIIZ();
                } else {
                    strLJIIIZ = null;
                }
                if (Intrinsics.LJFF(strLJIIIZ, str) && (childViewHolder instanceof InterfaceC1772610wEF)) {
                    if (str2 != null && str2.length() != 0) {
                        View viewU5 = ((InterfaceC1772610wEF) childViewHolder).u5(str2);
                        return new C1774640wHW(recyclerView, childAt, viewU5, viewU5);
                    }
                    return new C1774640wHW(recyclerView, childAt, null, childAt);
                }
            }
        }
        return new C1774640wHW(recyclerView, null, null, null);
    }

    @Override // X.AbstractC1772270wDh
    public final C1774640wHW LIZ(String str, String str2, String str3) {
        String str4;
        RecyclerView recyclerView;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ;
        C1772630wEH c1772630wEHC82;
        C1773710wG1 c1773710wG1LIZIZ;
        C18Z6 bodyList = getBodyList();
        if (C703302op.LIZ(str3)) {
            InterfaceC1773310wFN controller = getController();
            if (controller != null && (interfaceC1772680wEMLJIIIZ = controller.LJIIIZ()) != null && (c1772630wEHC82 = interfaceC1772680wEMLJIIIZ.c82()) != null && (c1773710wG1LIZIZ = c1772630wEHC82.LIZIZ()) != null) {
                str4 = ((C1772690wEN) ListProtector.get(c1773710wG1LIZIZ.LJJIII, c1773710wG1LIZIZ.LJJIFFI)).LIZLLL;
            } else {
                str4 = null;
            }
            if (!Intrinsics.LJFF(str3, str4)) {
                return new C1774640wHW(null, null, null, null);
            }
            WeakReference<RecyclerView> weakReference = bodyList.getChildRecyclerViews().get(str3);
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                return LJIIIZ(recyclerView, str, str2);
            }
            return new C1774640wHW(null, null, null, null);
        }
        C1774640wHW c1774640wHWLJIIIZ = LJIIIZ(getHeaderView(), str, str2);
        if (c1774640wHWLJIIIZ.LIZLLL != null) {
            return c1774640wHWLJIIIZ;
        }
        return LJIIIZ(bodyList, str, str2);
    }

    public static void LJIILJJIL(boolean z, String str, C1771590wCb c1771590wCb, InterfaceC1773310wFN interfaceC1773310wFN) {
        long jLongValue;
        Long l = c1771590wCb.LJIIJJI;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1771700wCm(interfaceC1773310wFN, jLongValue, System.currentTimeMillis(), C1771590wCb.LJIILLIIL ? 1 : 0, c1771590wCb, z, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // X.AbstractC1772270wDh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r20, java.lang.String r21, java.util.Map r22, X.C1772490wE3 r23) {
        /*
            r19 = this;
            r5 = r20
            r2 = r19
            java.util.concurrent.CopyOnWriteArrayList<X.0wE2> r0 = r2.LLILZLL
            if (r0 != 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.LLILZLL = r0
        Lf:
            java.util.concurrent.CopyOnWriteArrayList<X.0wE2> r0 = r2.LLILZLL
            if (r0 == 0) goto L18
            r1 = r23
            r0.addIfAbsent(r1)
        L18:
            X.0wFN r0 = r2.getController()
            r4 = 0
            if (r0 == 0) goto Lc3
            X.0wEM r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lc3
            X.0wEH r0 = r0.c82()
            if (r0 == 0) goto Lc3
            X.0wG1 r6 = r0.LIZIZ()
            if (r6 == 0) goto Lc4
            java.util.List<X.0wEN> r1 = r6.LJJIII
            int r0 = r6.LJJIFFI
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
        L39:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r7 = "0"
            if (r0 == 0) goto L4b
            r0 = r1
            X.0wEN r0 = (X.C1772690wEN) r0
            if (r0 == 0) goto L4a
            java.lang.String r5 = r0.LIZLLL
            if (r5 != 0) goto L4b
        L4a:
            r5 = r7
        L4b:
            X.0wEN r1 = (X.C1772690wEN) r1
            r3 = -1
            if (r1 == 0) goto Lc1
            int r8 = r1.LJFF
            java.lang.String r9 = r1.LJIIIIZZ
            if (r9 != 0) goto L58
        L56:
            java.lang.String r9 = ""
        L58:
            X.0wFN r0 = r2.getController()
            if (r0 == 0) goto Lbf
            X.0wGJ r1 = r0.LIZJ()
            if (r1 == 0) goto Lbf
            java.lang.Class<X.0wHD> r0 = X.C1774450wHD.class
            X.0w73 r0 = r1.getService(r0)
            X.0wHD r0 = (X.C1774450wHD) r0
            if (r0 == 0) goto Lbf
            if (r6 == 0) goto L72
            int r3 = r6.LJJIFFI
        L72:
            java.util.Map r13 = r0.LIZ(r3)
        L76:
            if (r6 == 0) goto L7e
            int r0 = r6.LJJIFFI
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L7e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "feed_tab_index"
            r1.<init>(r0, r4)
            java.util.Map r14 = X.C2097908Jt.LIZJ(r1)
            X.0wFN r0 = r2.getController()
            if (r0 == 0) goto Lbe
            X.0wEM r4 = r0.LJIIIZ()
            if (r4 == 0) goto Lbe
            X.0wDY r3 = new X.0wDY
            android.content.Context r2 = r2.getContext()
            X.0wCb r6 = new X.0wCb
            if (r5 == 0) goto La0
            r7 = r5
        La0:
            java.lang.String r10 = "fetch"
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r16 = 0
            r17 = 0
            r18 = 61720(0xf118, float:8.6488E-41)
            r12 = r22
            r11 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.<init>(r2, r6)
            r4.tW(r3)
        Lbe:
            return
        Lbf:
            r13 = r4
            goto L76
        Lc1:
            r8 = -1
            goto L56
        Lc3:
            r6 = r4
        Lc4:
            r1 = r4
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772240wDe.LIZLLL(java.lang.String, java.lang.String, java.util.Map, X.0wE3):void");
    }

    @Override // X.AbstractC1772270wDh
    public final void LJ(int i, String str, String str2, Map<String, ? extends Object> map, String str3, boolean z, InterfaceC1772480wE2 interfaceC1772480wE2) {
        InterfaceC1772360wDq interfaceC1772360wDqLJIILIIL;
        C05YD<AbstractC1772290wDj> c05ydLJJIJ;
        AbstractC1772290wDj value;
        if (interfaceC1772480wE2 != null) {
            if (this.LLILZLL == null) {
                this.LLILZLL = new CopyOnWriteArrayList<>();
            }
            CopyOnWriteArrayList<InterfaceC1772480wE2> copyOnWriteArrayList = this.LLILZLL;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.addIfAbsent(interfaceC1772480wE2);
            }
        }
        InterfaceC1773310wFN controller = getController();
        if (controller != null && (interfaceC1772360wDqLJIILIIL = controller.LJIILIIL()) != null && (c05ydLJJIJ = interfaceC1772360wDqLJIILIIL.LJJIJ()) != null && (value = c05ydLJJIJ.getValue()) != null && (Intrinsics.LJFF(value, C1772450wDz.LIZIZ) || Intrinsics.LJFF(value, C1772430wDx.LIZIZ) || Intrinsics.LJFF(value, C1772400wDu.LIZIZ) || (value instanceof C1772300wDk))) {
            if (this.LLJ) {
                C599820Nfo.LIZ.getClass();
                C599820Nfo.LIZIZ();
                return;
            }
            this.LLJ = true;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.LLILZIL.setRefreshing(true);
                        Boolean bool = Boolean.TRUE;
                        LJIIIIZZ(str, str2, map, bool, bool, str3, z);
                        return;
                    }
                    return;
                }
                this.LLILZIL.setRefreshing(true);
                LJIIIIZZ(str, str2, map, Boolean.TRUE, Boolean.FALSE, str3, z);
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            LJIIIIZZ(str, str2, map, bool2, bool2, str3, z);
            return;
        }
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZIZ();
    }

    public final void LJIIIIZZ(String str, String str2, Map<String, ? extends Object> map, Boolean bool, Boolean bool2, String str3, boolean z) {
        C1773710wG1 c1773710wG1LIZIZ;
        Map<String, Object> mapLIZ;
        int i;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ;
        String str4;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        C1774450wHD c1774450wHD;
        int i2;
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        InterfaceC1772680wEM interfaceC1772680wEMLJIIIZ2;
        C1772630wEH c1772630wEHC82;
        InterfaceC1773310wFN controller;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ2;
        InterfaceC1771900wD6 interfaceC1771900wD6;
        String str5 = str3;
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3) && (controller = getController()) != null && (interfaceC1773890wGJLIZJ2 = controller.LIZJ()) != null && (interfaceC1771900wD6 = (InterfaceC1771900wD6) interfaceC1773890wGJLIZJ2.getService(InterfaceC1771900wD6.class)) != null) {
            interfaceC1771900wD6.LJIILJJIL(Intrinsics.LJFF(bool2, bool3) ? 1 : 0, "top");
        }
        InterfaceC1773310wFN controller2 = getController();
        if (controller2 != null && (interfaceC1772680wEMLJIIIZ2 = controller2.LJIIIZ()) != null && (c1772630wEHC82 = interfaceC1772680wEMLJIIIZ2.c82()) != null) {
            c1773710wG1LIZIZ = c1772630wEHC82.LIZIZ();
        } else {
            c1773710wG1LIZIZ = null;
        }
        if (str5 == null && (c1773710wG1LIZIZ == null || (list = c1773710wG1LIZIZ.LJJIII) == null || (c1772690wEN = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ.LJJIFFI, list)) == null || (str5 = c1772690wEN.LIZLLL) == null)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC1773310wFN controller3 = getController();
        if (controller3 != null && (interfaceC1773890wGJLIZJ = controller3.LIZJ()) != null && (c1774450wHD = (C1774450wHD) interfaceC1773890wGJLIZJ.getService(C1774450wHD.class)) != null) {
            if (c1773710wG1LIZIZ != null) {
                i2 = c1773710wG1LIZIZ.LJJIFFI;
            } else {
                i2 = -1;
            }
            mapLIZ = c1774450wHD.LIZ(i2);
        } else {
            mapLIZ = null;
        }
        if (c1773710wG1LIZIZ != null) {
            i = c1773710wG1LIZIZ.LJJIFFI;
        } else {
            i = 0;
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("feed_tab_index", Integer.valueOf(i)));
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            C1767790w6T c1767790w6T = C1767980w6m.LJII;
            if (c1767790w6T != null) {
                str4 = c1767790w6T.LJFF;
            } else {
                str4 = null;
            }
            iMallLandingPerfTracker.LIZ(null, str4);
        }
        InterfaceC1773310wFN controller4 = getController();
        if (controller4 != null && (interfaceC1772680wEMLJIIIZ = controller4.LJIIIZ()) != null) {
            interfaceC1772680wEMLJIIIZ.tW(new C1772160wDW(getContext(), new C1771590wCb(str5, 0, null, str, str2, map, mapLIZ, mapLIZJ, null, null, z, 55578)));
        }
    }
}
