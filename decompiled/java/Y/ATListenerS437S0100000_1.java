package Y;

import X.AnonymousClass0317;
import X.AnonymousClass0434;
import X.AnonymousClass0445;
import X.C034S;
import X.C03QN;
import X.C044Z;
import X.C045N;
import X.C04E4;
import X.C1019103yf;
import X.C10503048v;
import X.C1120604Zw;
import X.C1AQS;
import X.C300330Bpv;
import X.C786410Ut5;
import X.C908703gr;
import X.EnumC1014603xw;
import X.InterfaceC1631620sYq;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV4;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS89S0110000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ATListenerS437S0100000_1 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS437S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) ((View) aTListenerS437S0100000_1.l0).findViewById(R.id.q46);
        if (viewGroup2 == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null || viewGroup.getChildCount() <= 1) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            int iIndexOfChild = viewGroup.indexOfChild(view);
            if (iIndexOfChild == 0) {
                C786410Ut5.LJLLLLLL(4, viewGroup2.getChildAt(0));
            } else {
                if (iIndexOfChild == viewGroup.getChildCount() - 1) {
                    C786410Ut5.LJLLLLLL(4, viewGroup2.getChildAt(viewGroup2.getChildCount() - 1));
                    return false;
                }
                C786410Ut5.LJLLLLLL(4, viewGroup2.getChildAt(iIndexOfChild - 1));
                C786410Ut5.LJLLLLLL(4, viewGroup2.getChildAt(iIndexOfChild));
                return false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            if (iIndexOfChild2 == 0) {
                C786410Ut5.LJLLLLLL(0, viewGroup2.getChildAt(0));
                return false;
            }
            if (iIndexOfChild2 == viewGroup.getChildCount() - 1) {
                C786410Ut5.LJLLLLLL(0, viewGroup2.getChildAt(viewGroup2.getChildCount() - 1));
                return false;
            }
            C786410Ut5.LJLLLLLL(0, viewGroup2.getChildAt(iIndexOfChild2 - 1));
            C786410Ut5.LJLLLLLL(0, viewGroup2.getChildAt(iIndexOfChild2));
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        C045N c045n;
        boolean zBooleanValue;
        Boolean bool;
        boolean z;
        String name;
        C10503048v c10503048v;
        if (motionEvent.getAction() == 0) {
            SkuPanelBottomWidgetNew skuPanelBottomWidgetNew = (SkuPanelBottomWidgetNew) aTListenerS437S0100000_1.l0;
            skuPanelBottomWidgetNew.getClass();
            SkuPanelState skuPanelStateLIZIZ = null;
            if ((!C300330Bpv.LIZ() || ((c10503048v = skuPanelBottomWidgetNew.LLJILJILJ) != null && c10503048v.isEnabled())) && skuPanelBottomWidgetNew.LJII().hR2() == null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IAccountDependencyService.class.getName();
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                if (((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).isLogin()) {
                    SeaSkuPanelViewModel seaSkuPanelViewModelLJII = ((SkuPanelBottomWidgetNew) aTListenerS437S0100000_1.l0).LJII();
                    seaSkuPanelViewModelLJII.getClass();
                    if (ECOspOptimizedV4.LIZ()) {
                        SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelViewModelLJII.LLJILJIL;
                        if (skuEnterParams != null && skuEnterParams.needRequest) {
                            ProductPackStruct productPackStruct = seaSkuPanelViewModelLJII.LLJILJILJ;
                            if (productPackStruct != null) {
                                SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
                                String strLJI = seaSkuPanelViewModelLJII.LLJLLL.LJI("c1771.d3669", null);
                                skuPanelStarter.getClass();
                                IPdpStarter.PdpEnterParam pdpEnterParamLIZIZ = SkuPanelStarter.LIZIZ(skuEnterParams, strLJI);
                                SkuPanelStarter.SkuEnterParams skuEnterParams2 = seaSkuPanelViewModelLJII.LLJILJIL;
                                if (skuEnterParams2 != null && (bool = skuEnterParams2.pdpFullScreen) != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                c045n = new C045N(productPackStruct, null, pdpEnterParamLIZIZ, zBooleanValue);
                            }
                        } else {
                            c045n = seaSkuPanelViewModelLJII.LLJLLIL;
                            if (c045n == null) {
                                C1019103yf.LIZ(EnumC1014603xw.ERR71, null, null);
                                return false;
                            }
                        }
                        SkuPanelState skuPanelState = seaSkuPanelViewModelLJII.LLJI;
                        if (skuPanelState != null) {
                            skuPanelStateLIZIZ = SkuPanelState.LIZIZ(skuPanelState, null, null, null, null, null, null, null, null, false, 0, null, null, null, C03QN.LIZ.LJ(c045n.LIZ, c045n.LIZIZ, skuPanelState, c045n.LIZJ, c045n.LIZLLL), null, null, 66846719);
                        }
                        seaSkuPanelViewModelLJII.LLJI = skuPanelStateLIZIZ;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aTListenerS437S0100000_1.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(view, 3, motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        C908703gr c908703gr;
        EditText editText = ((SeaSkuCounterCell) aTListenerS437S0100000_1.l0).LLJILJIL;
        if (editText == null) {
            return false;
        }
        if (motionEvent.getAction() == 0 && (c908703gr = ((SeaSkuCounterCell) aTListenerS437S0100000_1.l0).N5().LLJILJILJ) != null && c908703gr.LIZ.cS()) {
            return true;
        }
        if (!((SeaSkuCounterCell) aTListenerS437S0100000_1.l0).LLJJIJI || motionEvent.getAction() != 0 || editText.isFocused()) {
            return false;
        }
        C908703gr c908703gr2 = ((SeaSkuCounterCell) aTListenerS437S0100000_1.l0).N5().LLJILJILJ;
        if (c908703gr2 != null) {
            c908703gr2.LIZ.hS(((SeaSkuCounterCell) aTListenerS437S0100000_1.l0).getBindingAdapterPosition());
        }
        HandlerHook.viewPost(editText, new ARunnableS70S0200000_1(editText, (SeaSkuCounterCell) aTListenerS437S0100000_1.l0, 8));
        return true;
    }

    public static final boolean onTouch$3(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || !((SeaSkuBaseCell) aTListenerS437S0100000_1.l0).R5().LLJILJIL) {
            return false;
        }
        ((SeaSkuBaseCell) aTListenerS437S0100000_1.l0).R5().EQ2(false);
        return true;
    }

    public static final boolean onTouch$4(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        View view2;
        C10503048v c10503048v;
        if (motionEvent.getAction() == 0 && (view2 = ((SeaPdpBottomNavBarWidgetNew) aTListenerS437S0100000_1.l0).LLJ.getView()) != null && view2.getContext() != null) {
            SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew = (SeaPdpBottomNavBarWidgetNew) aTListenerS437S0100000_1.l0;
            if (!seaPdpBottomNavBarWidgetNew.LJIIIIZZ().LLLFFI && seaPdpBottomNavBarWidgetNew.LJIIJ() && ((!C300330Bpv.LIZ() || ((c10503048v = seaPdpBottomNavBarWidgetNew.LLJJIJIIJIL) != null && c10503048v.isEnabled())) && seaPdpBottomNavBarWidgetNew.LJIIIIZZ().IR2() != null)) {
                seaPdpBottomNavBarWidgetNew.LJIIIIZZ().getClass();
                if (SeaPdpViewModel.pR2()) {
                    ((SeaPdpBottomNavBarWidgetNew) aTListenerS437S0100000_1.l0).LJIIIIZZ().DS2();
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment2;
        Fragment fragment = ((SeaBonusCell) aTListenerS437S0100000_1.l0).getFragment();
        if (fragment instanceof SeaOneStepOrderSubmitFragment) {
            seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) fragment;
        } else {
            seaOneStepOrderSubmitFragment = null;
        }
        if (seaOneStepOrderSubmitFragment == null || !seaOneStepOrderSubmitFragment.LLLF) {
            return false;
        }
        Fragment fragment2 = ((SeaBonusCell) aTListenerS437S0100000_1.l0).getFragment();
        if ((fragment2 instanceof SeaOneStepOrderSubmitFragment) && (seaOneStepOrderSubmitFragment2 = (SeaOneStepOrderSubmitFragment) fragment2) != null) {
            seaOneStepOrderSubmitFragment2.cS();
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        AnonymousClass0445 anonymousClass0445;
        if (motionEvent.getAction() == 0 && (anonymousClass0445 = ((AnonymousClass0434) aTListenerS437S0100000_1.l0).LLILLJJLI) != null) {
            anonymousClass0445.LIZJ();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            SeaSkuPanelViewModel seaSkuPanelViewModelDS = ((SeaSkuPanelFragment) aTListenerS437S0100000_1.l0).dS();
            seaSkuPanelViewModelDS.getClass();
            seaSkuPanelViewModelDS.Cn(new AwS89S0110000_1((C044Z) seaSkuPanelViewModelDS, false, 11));
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        return ((SeaOneStepOrderSubmitFragment) aTListenerS437S0100000_1.l0).LLLF;
    }

    public static final boolean onTouch$9(ATListenerS437S0100000_1 aTListenerS437S0100000_1, View view, MotionEvent motionEvent) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aTListenerS437S0100000_1.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(view, 3, motionEvent);
            return false;
        }
        return false;
    }

    public ATListenerS437S0100000_1(AnonymousClass0434 anonymousClass0434, C04E4 c04e4, PdpButton pdpButton, int i, int i2) {
        this.$t = i2;
        this.l0 = anonymousClass0434;
    }
}
