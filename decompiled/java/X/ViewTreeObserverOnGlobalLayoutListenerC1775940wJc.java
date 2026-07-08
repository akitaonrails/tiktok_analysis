package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS59S0300000_26;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.pipo.ttpay.landing.WelcomePageAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView;
import com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierViewShadowNode;
import com.ss.android.ugc.aweme.pipo.cashier.refund.lynx.LynxRefundCashierShadowNode;
import com.ss.android.ugc.aweme.pipo.cashier.refund.lynx.LynxRefundCashierView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1775940wJc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        LynxTtlsPdpCashierViewShadowNode lynxTtlsPdpCashierViewShadowNode;
        LynxTtlsPdpCashierView lynxTtlsPdpCashierView = (LynxTtlsPdpCashierView) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        ShadowNode shadowNodeLJFF = lynxTtlsPdpCashierView.mContext.LJFF(lynxTtlsPdpCashierView.getSign());
        if ((shadowNodeLJFF instanceof LynxTtlsPdpCashierViewShadowNode) && (lynxTtlsPdpCashierViewShadowNode = (LynxTtlsPdpCashierViewShadowNode) shadowNodeLJFF) != null) {
            LynxTtlsPdpCashierView lynxTtlsPdpCashierView2 = (LynxTtlsPdpCashierView) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
            lynxTtlsPdpCashierViewShadowNode.LJIJJLI = lynxTtlsPdpCashierView2.LLILLL;
            if (lynxTtlsPdpCashierView2.LLIZ) {
                lynxTtlsPdpCashierViewShadowNode.LJIILLIIL();
                lynxTtlsPdpCashierView2.LLIZ = false;
                lynxTtlsPdpCashierView2.LJJIJ("markDirty");
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) throws JSONException {
        String string;
        ViewTreeObserver viewTreeObserver = ((WelcomePageAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).Ho().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map mapVQ2 = ((WelcomePageAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).So().vQ2();
        if (mapVQ2 != null) {
            mapVQ2.put("monitor_type", "layout");
            mapVQ2.put("event_type", "show");
            mapVQ2.put("first_render", "1");
            mapVQ2.put("render_cost", String.valueOf(jCurrentTimeMillis - ((WelcomePageAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLJJIII));
        }
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b32145", PageFinder.via(C724240Sb0.LJI((WelcomePageAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0)), null, 4, null).entrySet()) {
            if (mapVQ2 != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                mapVQ2.put(key, string);
            }
        }
        if (mapVQ2 == null) {
            mapVQ2 = C2097608Jq.LJ();
        }
        C1713870uhV.LIZ("pipo_page_show", C2097608Jq.LJIIL(mapVQ2, C2097908Jt.LIZJ(new Pair("busi_line", "tiktokpay"))));
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        ViewGroup viewGroup;
        C1338430kvx c1338430kvx;
        Map<String, Object> mapLJ;
        String str;
        String str2;
        int iIntValue;
        Integer numLJIIJJI;
        C1338430kvx c1338430kvx2;
        String str3;
        String str4;
        View view = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLILZ;
        String str5 = null;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.t0h)) != null && viewGroup.getChildCount() > 0 && !((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLLFF) {
            SeaPdpBodyWidget seaPdpBodyWidget = (SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
            if (seaPdpBodyWidget.LLJJJJLIIL) {
                String str6 = "";
                if (seaPdpBodyWidget.LJIIIZ().LLLII) {
                    if (((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLLFFI) {
                        C1054104Ah c1054104Ah = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJLIL;
                        if (c1054104Ah != null) {
                            c1054104Ah.LJJJI(((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ(), false, true);
                        }
                    } else {
                        SeaPdpViewModel seaPdpViewModelLJIIIZ = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ();
                        SeaPdpBodyWidget seaPdpBodyWidget2 = (SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
                        seaPdpBodyWidget2.getClass();
                        C19EG c19egLIZ = C1745060vVo.LIZ(seaPdpBodyWidget2);
                        View view2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLILZ;
                        if (view2 != null) {
                            c1338430kvx2 = (C1338430kvx) view2.findViewById(R.id.t0h);
                        } else {
                            c1338430kvx2 = null;
                        }
                        seaPdpViewModelLJIIIZ.oS2(c19egLIZ, c1338430kvx2);
                        C1054104Ah c1054104Ah2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJLIL;
                        if (c1054104Ah2 != null) {
                            c1054104Ah2.LJJJ(((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ());
                        }
                        ProductPackStruct productPackStruct = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJIJIL;
                        if (productPackStruct != null && (str4 = productPackStruct.productId) != null) {
                            str6 = str4;
                        }
                        boolean z = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZLLLIL;
                        IPdpStarter.PdpEnterParam pdpEnterParam = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZ;
                        if (pdpEnterParam != null) {
                            str3 = pdpEnterParam.awemeId;
                        } else {
                            str3 = null;
                        }
                        IPdpStarter.PdpEnterParam pdpEnterParam2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZ;
                        if (pdpEnterParam2 != null) {
                            str5 = pdpEnterParam2.clickFrom;
                        }
                        C1440005kM.LIZ(C1034990d2X.LIZ(str6, str3, str5, z));
                        ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIILIIL();
                    }
                } else {
                    SeaPdpViewModel seaPdpViewModelLJIIIZ2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ();
                    SeaPdpBodyWidget seaPdpBodyWidget3 = (SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
                    seaPdpBodyWidget3.getClass();
                    C19EG c19egLIZ2 = C1745060vVo.LIZ(seaPdpBodyWidget3);
                    View view3 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLILZ;
                    if (view3 != null) {
                        c1338430kvx = (C1338430kvx) view3.findViewById(R.id.t0h);
                    } else {
                        c1338430kvx = null;
                    }
                    seaPdpViewModelLJIIIZ2.oS2(c19egLIZ2, c1338430kvx);
                    C1054104Ah c1054104Ah3 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJLIL;
                    if (c1054104Ah3 != null) {
                        c1054104Ah3.LJJJI(((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ(), ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLLIIII, false);
                    }
                    C1054104Ah c1054104Ah4 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJLIL;
                    if (c1054104Ah4 != null) {
                        c1054104Ah4.LJJJ(((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ());
                    }
                    IPdpStarter.PdpEnterParam pdpEnterParam3 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZ;
                    if (pdpEnterParam3 == null || (mapLJ = pdpEnterParam3.trackParams) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    HashMap map = new HashMap(mapLJ);
                    ProductPackStruct productPackStruct2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLJIJIL;
                    if (productPackStruct2 != null && (str2 = productPackStruct2.productId) != null) {
                        str6 = str2;
                    }
                    boolean z2 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZLLLIL;
                    IPdpStarter.PdpEnterParam pdpEnterParam4 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZ;
                    if (pdpEnterParam4 != null) {
                        str = pdpEnterParam4.awemeId;
                    } else {
                        str = null;
                    }
                    IPdpStarter.PdpEnterParam pdpEnterParam5 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIIIZ().LLIZ;
                    if (pdpEnterParam5 != null) {
                        str5 = pdpEnterParam5.clickFrom;
                    }
                    C1440005kM.LIZ(C1034990d2X.LIZ(str6, str, str5, z2));
                    C672920QaQ.LIZ("pdp real", map);
                    ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJIILIIL();
                }
                View view4 = ((SeaPdpBodyWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLILZ;
                if (view4 != null) {
                    C1766860w4y.LIZ.getClass();
                    String strLIZIZ = C1766860w4y.LIZIZ("ec_has_search_container");
                    if (Intrinsics.LJFF(strLIZIZ, "1") && strLIZIZ != null) {
                        try {
                            String strLIZIZ2 = C1766860w4y.LIZIZ("search_jump_in_num");
                            if (strLIZIZ2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ2)) != null) {
                                iIntValue = numLJIIJJI.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C1766860w4y.LJIILIIL(view4, C2097608Jq.LJIIJ(new Pair("search_jump_in_num", String.valueOf(iIntValue + 1))), true);
                        } catch (CancellationException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw e;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        PdpViewModel pdpViewModelLp;
        C19EG c19egLIZ;
        int iIntValue;
        Integer numLJIIJJI;
        String str;
        String str2;
        if (((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).kp().getChildCount() == 0 || (pdpViewModelLp = ((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).lp()) == null || (c19egLIZ = C724240Sb0.LIZ((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0)) == null) {
            return;
        }
        PdpFragment pdpFragment = (PdpFragment) C724240Sb0.LJI((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0);
        if (!pdpViewModelLp.LLLF) {
            PdpBodyAssem pdpBodyAssem = (PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
            if (pdpBodyAssem.LLLF) {
                String str3 = null;
                if (pdpViewModelLp.LLLII) {
                    if (pdpViewModelLp.LLLFF) {
                        LifecycleOwnerExtensionsKt.LIZ(pdpBodyAssem, new ARunnableS126S0100000_26(pdpViewModelLp, 36));
                    } else {
                        pdpBodyAssem.kp();
                        pdpViewModelLp.cS2(c19egLIZ);
                        C1054004Ag c1054004Ag = pdpViewModelLp.LLJLILLLLZIIL;
                        if (c1054004Ag != null) {
                            c1054004Ag.LJJIL(pdpViewModelLp);
                        }
                        ProductPackStruct productPackStruct = pdpViewModelLp.LLJILLL;
                        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
                            str = "";
                        }
                        boolean z = pdpViewModelLp.LLJIJIL;
                        IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModelLp.LLJI;
                        if (pdpEnterParam != null) {
                            str3 = pdpEnterParam.awemeId;
                            str2 = pdpEnterParam.clickFrom;
                        } else {
                            str2 = null;
                        }
                        C1440005kM.LIZ(C1034990d2X.LIZ(str, str3, str2, z));
                        ((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).Ap();
                    }
                } else {
                    LifecycleOwnerExtensionsKt.LIZ(pdpBodyAssem, new ARunnableS59S0300000_26(pdpViewModelLp, c19egLIZ, pdpFragment, pdpBodyAssem, 1));
                    ((PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).Ap();
                }
                C1766860w4y.LIZ.getClass();
                String strLIZIZ = C1766860w4y.LIZIZ("ec_has_search_container");
                if (Intrinsics.LJFF(strLIZIZ, "1") && strLIZIZ != null) {
                    PdpBodyAssem pdpBodyAssem2 = (PdpBodyAssem) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
                    try {
                        String strLIZIZ2 = C1766860w4y.LIZIZ("search_jump_in_num");
                        if (strLIZIZ2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ2)) != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C1766860w4y.LJIILIIL(pdpBodyAssem2.getContentView(), C2097608Jq.LJIIJ(new Pair("search_jump_in_num", String.valueOf(iIntValue + 1))), true);
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        RecyclerView recyclerView;
        if (((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).getUserVisibleHint() && ((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).isResumed()) {
            ((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).eT();
            View viewLJJLIIIJILLIZJL = ((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LJJLIIIJILLIZJL();
            if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
                recyclerView.removeOnScrollListener(((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLJLL);
                recyclerView.addOnScrollListener(((TabStoreFragment) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0).LLJLL);
            }
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        int iLIZIZ;
        View viewFindViewById;
        View viewFindViewById2;
        int iLIZIZ2;
        SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = (SeaPdpCreatorSheetWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        View view = seaPdpCreatorSheetWidget.LLJI;
        if (view != null) {
            int iMax = Math.max(view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
            if (seaPdpCreatorSheetWidget.LLJJL != null) {
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = seaPdpCreatorSheetWidget.LLJJIJIL;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = seaPdpCreatorSheetWidget.LLJJIJIIJIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    iLIZIZ2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight();
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                }
                bottomSheetBehavior.setPeekHeight(iLIZIZ2 + iMax + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            } else {
                RadiusLayout radiusLayout = seaPdpCreatorSheetWidget.LLJJIII;
                if (radiusLayout == null || (viewFindViewById2 = radiusLayout.findViewById(R.id.f86)) == null || viewFindViewById2.getHeight() != 0) {
                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = seaPdpCreatorSheetWidget.LLJJIJIL;
                    RadiusLayout radiusLayout2 = seaPdpCreatorSheetWidget.LLJJIII;
                    if (radiusLayout2 != null && (viewFindViewById = radiusLayout2.findViewById(R.id.f86)) != null) {
                        iLIZIZ = viewFindViewById.getHeight();
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    }
                    bottomSheetBehavior2.setPeekHeight(iLIZIZ + iMax + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
                }
            }
            seaPdpCreatorSheetWidget.LLJLILLLLZIIL = Integer.valueOf(seaPdpCreatorSheetWidget.LLJJIJIL.getPeekHeight() - iMax);
        }
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        int height;
        ViewGroup viewGroup;
        int height2;
        int iIntValue;
        ViewGroup viewGroup2;
        LynxRefundCashierView lynxRefundCashierView = (LynxRefundCashierView) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        View childAt = ((ViewGroup) lynxRefundCashierView.mView).getChildAt(0);
        View childAt2 = null;
        if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
            childAt2 = viewGroup2.getChildAt(0);
        }
        if ((childAt2 instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt2) != null) {
            if (lynxRefundCashierView.LLILZIL) {
                Integer numValueOf = Integer.valueOf(viewGroup.getWidth());
                if (numValueOf.intValue() > 0) {
                    iIntValue = numValueOf.intValue();
                } else {
                    Integer numValueOf2 = Integer.valueOf(lynxRefundCashierView.mView.getWidth());
                    if (numValueOf2.intValue() > 0) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        height = viewGroup.getHeight();
                    }
                }
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                height = viewGroup.getMeasuredHeight();
                height2 = viewGroup.getHeight();
                if (height < height2) {
                }
            } else {
                Iterator it2 = C09RB.LJJII(new C09RD(viewGroup)).iterator();
                height2 = 0;
                while (it2.hasNext()) {
                    height2 += ((View) it2.next()).getHeight();
                }
            }
            height = height2;
        } else {
            height = 0;
        }
        LynxRefundCashierView lynxRefundCashierView2 = (LynxRefundCashierView) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        ShadowNode shadowNodeLJFF = lynxRefundCashierView2.mContext.LJFF(lynxRefundCashierView2.getSign());
        if (shadowNodeLJFF != null && (shadowNodeLJFF instanceof LynxRefundCashierShadowNode)) {
            LynxRefundCashierShadowNode lynxRefundCashierShadowNode = (LynxRefundCashierShadowNode) shadowNodeLJFF;
            float f = height;
            if (f != lynxRefundCashierShadowNode.LJIJJLI) {
                lynxRefundCashierShadowNode.LJIJJLI = f;
                lynxRefundCashierShadowNode.LJIILLIIL();
            }
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        int iLIZIZ;
        View viewFindViewById;
        View viewFindViewById2;
        int iLIZIZ2;
        PdpCreatorSheetWidget pdpCreatorSheetWidget = (PdpCreatorSheetWidget) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        View view = pdpCreatorSheetWidget.LLJI;
        if (view != null) {
            int iMax = Math.max(view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
            if (pdpCreatorSheetWidget.LLJJL != null) {
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = pdpCreatorSheetWidget.LLJJIJIL;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = pdpCreatorSheetWidget.LLJJIJIIJIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    iLIZIZ2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight();
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                }
                bottomSheetBehavior.setPeekHeight(iMax + iLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            } else {
                RadiusLayout radiusLayout = pdpCreatorSheetWidget.LLJJIII;
                if (radiusLayout == null || (viewFindViewById2 = radiusLayout.findViewById(R.id.f86)) == null || viewFindViewById2.getHeight() != 0) {
                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = pdpCreatorSheetWidget.LLJJIJIL;
                    RadiusLayout radiusLayout2 = pdpCreatorSheetWidget.LLJJIII;
                    if (radiusLayout2 != null && (viewFindViewById = radiusLayout2.findViewById(R.id.f86)) != null) {
                        iLIZIZ = viewFindViewById.getHeight();
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    }
                    bottomSheetBehavior2.setPeekHeight(iMax + iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
                }
            }
            pdpCreatorSheetWidget.LLJJIJIL.getPeekHeight();
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc) {
        int height;
        View view;
        C1773450wFb c1773450wFb = (C1773450wFb) viewTreeObserverOnGlobalLayoutListenerC1775940wJc.l0;
        C18Z6 bodyList = c1773450wFb.LL.LIZLLL().LJ.getBodyList();
        Object objLIZLLL = c1773450wFb.LL.LIZ().LIZLLL("bff_page_tab", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        if (!(objLIZLLL instanceof Boolean)) {
            objLIZLLL = null;
        }
        if (Intrinsics.LJFF(objLIZLLL, Boolean.TRUE)) {
            height = bodyList.getHeight();
        } else {
            int i = C1773640wFu.LLILZIL;
            int height2 = 0;
            if (Integer.MAX_VALUE > bodyList.LLILLL && (view = bodyList.LLILZ) != null) {
                height2 = 0 + view.getHeight();
            }
            height = bodyList.getHeight() - height2;
        }
        if (height != c1773450wFb.LLJJIJIIJIL.getHeight()) {
            c1773450wFb.LLJJIJIIJIL.getLayoutParams().height = height;
            c1773450wFb.LLJJIJIIJIL.requestLayout();
            c1773450wFb.D6((C1773710wG1) c1773450wFb.LLILLL);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
