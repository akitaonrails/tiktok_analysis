package X;

import Y.ARunnableS39S0300000_6;
import Y.ARunnableS70S0200000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastPosition;
import com.ss.android.ugc.aweme.ecommerce.base.osp.body.OspPageListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentAgreementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.SeaPdpBottomNavBarWidgetBff;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skunew.SeaPdpSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS14S1110000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS36S0301000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077704Jj extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3, obj4);
            case 14:
                return invoke$14(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(C04EM c04em, int i) {
        super(4);
        this.$t = i;
        this.l0 = c04em;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1077704Jj(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> interfaceC1631620sYq2) {
        super(4);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(OspPageListAssem ospPageListAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = ospPageListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = combinedSkuOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(PaymentFragment paymentFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = paymentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(CCDCAddCardAssem cCDCAddCardAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = cCDCAddCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(CCDCFillCVVAssem cCDCFillCVVAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = cCDCFillCVVAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(PaymentAgreementViewHolder paymentAgreementViewHolder, int i) {
        super(4);
        this.$t = i;
        this.l0 = paymentAgreementViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(SeaPdpBottomNavBarWidgetBff seaPdpBottomNavBarWidgetBff, int i) {
        super(4);
        this.$t = i;
        this.l0 = seaPdpBottomNavBarWidgetBff;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(SeaPdpSkcVH seaPdpSkcVH, int i) {
        super(4);
        this.$t = i;
        this.l0 = seaPdpSkcVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(SeaPdpSkuVH seaPdpSkuVH, int i) {
        super(4);
        this.$t = i;
        this.l0 = seaPdpSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew, int i) {
        super(4);
        this.$t = i;
        this.l0 = seaPdpBottomNavBarWidgetNew;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(UsSkuVH usSkuVH, int i) {
        super(4);
        this.$t = i;
        this.l0 = usSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077704Jj(SkuPanelBottomWidgetNew skuPanelBottomWidgetNew, int i) {
        super(4);
        this.$t = i;
        this.l0 = skuPanelBottomWidgetNew;
    }

    public static final Object invoke$0(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        Fragment fragment = (Fragment) obj4;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c1077704Jj.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(obj, obj2, obj3);
        }
        if (C03XU.LIZIZ().enableCloseCombinePage && fragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        InterfaceC921603iw interfaceC921603iw;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C887503dR c887503dR;
        EnumC880203cG enumC880203cG = (EnumC880203cG) obj2;
        String string = (String) obj3;
        C948003nC c948003nC = (C948003nC) obj4;
        if (enumC880203cG != null) {
            switch (C880103cF.LIZ[enumC880203cG.ordinal()]) {
                case 1:
                    EnterParams enterParams = ((PaymentFragment) c1077704Jj.l0).LLJJJJLIIL;
                    if (enterParams != null) {
                        c887503dR = enterParams.LJJIJL;
                    } else {
                        c887503dR = null;
                    }
                    C897503f3.LJIIIIZZ(c887503dR, new C893103eL(EnumC887103dN.CANCEL, EnumC888403da.MIT), null);
                    ((PaymentFragment) c1077704Jj.l0).LLJJLIIIJLLLLLLLZ.invoke();
                    break;
                case 2:
                    Context context = ((PaymentFragment) c1077704Jj.l0).getContext();
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        PaymentFragment paymentFragment = (PaymentFragment) c1077704Jj.l0;
                        PaymentViewModel paymentViewModelYS = paymentFragment.yS();
                        int iIntValue = ((Number) paymentFragment.LLLILZ.getValue()).intValue();
                        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(paymentFragment, 1196);
                        paymentViewModelYS.getClass();
                        paymentViewModelYS.withState(new AwS36S0301000_1(paymentViewModelYS, iIntValue, supportFragmentManager, awS545S0100000_1, 3));
                    }
                    break;
                case 3:
                    C897503f3.LJIIIIZZ(((PaymentFragment) c1077704Jj.l0).LLJJJJLIIL.LJJIJL, new C893103eL(EnumC887103dN.SUCCESS, EnumC888403da.MIT), null);
                    ((PaymentFragment) c1077704Jj.l0).LLJJLIIIJLLLLLLLZ.invoke();
                    break;
                case 4:
                    if (c948003nC != null) {
                        str = (String) c948003nC.LIZ;
                    } else {
                        str = null;
                    }
                    if (C911703hL.LIZ(str)) {
                        C921103ir c921103ir = C921103ir.LIZ;
                        PaymentFragment paymentFragment2 = (PaymentFragment) c1077704Jj.l0;
                        if (c948003nC == null || (str2 = (String) c948003nC.LIZ) == null) {
                            str2 = "";
                        }
                        c921103ir.getClass();
                        C1710940ucm c1710940ucmLIZ = C921703ix.LIZ(paymentFragment2);
                        C921103ir.LIZIZ();
                        if (c1710940ucmLIZ != null && (interfaceC921603iw = C921103ir.LIZIZ) != null) {
                            interfaceC921603iw.LIZLLL(c1710940ucmLIZ, str2, new C887203dO(null));
                        }
                    } else {
                        if (string == null) {
                            string = ((PaymentFragment) c1077704Jj.l0).getString(2131832931);
                        }
                        C1389880mGw c1389880mGw = new C1389880mGw((PaymentFragment) c1077704Jj.l0);
                        c1389880mGw.LJIIIZ(string);
                        c1389880mGw.LJIIJ();
                    }
                    break;
                case 5:
                    Context context2 = ((PaymentFragment) c1077704Jj.l0).getContext();
                    if (context2 != null) {
                        ((PaymentFragment) c1077704Jj.l0).yS().CR2(context2);
                    }
                    break;
                case 6:
                    PaymentFragment paymentFragment3 = (PaymentFragment) c1077704Jj.l0;
                    C1713520ugw c1713520ugwLIZIZ = C897503f3.LIZIZ(paymentFragment3.LLJJJJLIIL.LJJIJL, paymentFragment3.yS().LLJL);
                    IPipoVerifyCenterService iPipoVerifyCenterService = (IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class);
                    C19EG c19egRequireActivity = ((PaymentFragment) c1077704Jj.l0).requireActivity();
                    final PaymentFragment paymentFragment4 = (PaymentFragment) c1077704Jj.l0;
                    iPipoVerifyCenterService.LIZ(c19egRequireActivity, c1713520ugwLIZIZ, new InterfaceC1713650uh9() { // from class: X.03cD
                        @Override // X.InterfaceC1713650uh9
                        public final void LIZ(C1713690uhD c1713690uhD) {
                            if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                                Context context3 = paymentFragment4.getContext();
                                if (context3 != null) {
                                    PaymentViewModel paymentViewModelYS2 = paymentFragment4.yS();
                                    paymentViewModelYS2.getClass();
                                    paymentViewModelYS2.withState(new AwS367S0200000_1(paymentViewModelYS2, context3, 94));
                                    return;
                                }
                                return;
                            }
                            PaymentViewModel paymentViewModelYS3 = paymentFragment4.yS();
                            paymentViewModelYS3.LLJLIL = null;
                            paymentViewModelYS3.LLJLL = null;
                            paymentViewModelYS3.setState(AFwS228S0000000_1.get$arr$(240));
                        }
                    });
                    break;
                case 7:
                    PaymentViewModel paymentViewModelYS2 = ((PaymentFragment) c1077704Jj.l0).yS();
                    paymentViewModelYS2.LLJLIL = null;
                    paymentViewModelYS2.LLJLL = null;
                    paymentViewModelYS2.setState(AFwS228S0000000_1.get$arr$(240));
                    break;
            }
        }
        PaymentViewModel paymentViewModelYS3 = ((PaymentFragment) c1077704Jj.l0).yS();
        paymentViewModelYS3.getClass();
        paymentViewModelYS3.setState(AFwS228S0000000_1.get$arr$(178));
        return Unit.LIZ;
    }

    public static final Object invoke$10(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C887503dR c887503dR;
        C887503dR c887503dR2;
        C19EG c19egRequireActivity;
        C887503dR c887503dR3;
        Context context;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        EnumC880203cG enumC880203cG = (EnumC880203cG) obj2;
        String string = (String) obj3;
        String str = (String) obj4;
        if (enumC880203cG == null) {
            i = -1;
        } else {
            i = C880403cI.LIZ[enumC880203cG.ordinal()];
        }
        String str2 = null;
        switch (i) {
            case 1:
                CCDCFillCVVHalfFragment cCDCFillCVVHalfFragmentJo = ((CCDCFillCVVAssem) c1077704Jj.l0).Jo();
                if (cCDCFillCVVHalfFragmentJo != null) {
                    cCDCFillCVVHalfFragmentJo.LLJILJIL = true;
                    cCDCFillCVVHalfFragmentJo.LLJILLL = string;
                    cCDCFillCVVHalfFragmentJo.LLJJ = str;
                }
                if (C911703hL.LIZ(str)) {
                    Context context2 = abstractC738140SxQ.getContext();
                    if (context2 != null) {
                        C921103ir c921103ir = C921103ir.LIZ;
                        if (str == null) {
                            str = "";
                        }
                        c921103ir.getClass();
                        C921103ir.LJFF(context2, str, null);
                    }
                } else {
                    CCDCFillCVVHalfFragment cCDCFillCVVHalfFragmentJo2 = ((CCDCFillCVVAssem) c1077704Jj.l0).Jo();
                    if (cCDCFillCVVHalfFragmentJo2 != null) {
                        if (string == null) {
                            string = cCDCFillCVVHalfFragmentJo2.getString(2131832931);
                        }
                        C1389880mGw c1389880mGw = new C1389880mGw(cCDCFillCVVHalfFragmentJo2);
                        c1389880mGw.LJIIIZ(string);
                        c1389880mGw.LJIIJ();
                    }
                }
                break;
            case 2:
                CCDCFillCVVViewModel cCDCFillCVVViewModelLo = ((CCDCFillCVVAssem) c1077704Jj.l0).Lo();
                cCDCFillCVVViewModelLo.setState(AFwS228S0000000_1.get$arr$(626));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cCDCFillCVVViewModelLo), null, null, new C887703dT(cCDCFillCVVViewModelLo, null), 3);
                break;
            case 3:
                final CCDCFillCVVAssem cCDCFillCVVAssem = (CCDCFillCVVAssem) c1077704Jj.l0;
                cCDCFillCVVAssem.getClass();
                EnterParams enterParams = ((C887403dQ) cCDCFillCVVAssem.LLJILLL.getValue()).LLILLJJLI;
                if (enterParams != null) {
                    c887503dR = enterParams.LJJIJL;
                } else {
                    c887503dR = null;
                }
                C1713520ugw c1713520ugwLIZIZ = C897503f3.LIZIZ(c887503dR, cCDCFillCVVAssem.Lo().LLILZ);
                C888603dc c888603dc = C888603dc.LIZ;
                EnterParams enterParams2 = ((C887403dQ) cCDCFillCVVAssem.LLJILLL.getValue()).LLILLJJLI;
                if (enterParams2 != null) {
                    c887503dR2 = enterParams2.LJJIJL;
                } else {
                    c887503dR2 = null;
                }
                c888603dc.getClass();
                C888603dc.LJII(c887503dR2, "", null);
                CCDCFillCVVHalfFragment cCDCFillCVVHalfFragmentJo3 = cCDCFillCVVAssem.Jo();
                if (cCDCFillCVVHalfFragmentJo3 != null && (c19egRequireActivity = cCDCFillCVVHalfFragmentJo3.requireActivity()) != null) {
                    ((IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class)).LIZ(c19egRequireActivity, c1713520ugwLIZIZ, new InterfaceC1713650uh9() { // from class: X.03dW
                        @Override // X.InterfaceC1713650uh9
                        public final void LIZ(C1713690uhD c1713690uhD) {
                            C887503dR c887503dR4;
                            C888603dc c888603dc2 = C888603dc.LIZ;
                            EnterParams enterParams3 = ((C887403dQ) cCDCFillCVVAssem.LLJILLL.getValue()).LLILLJJLI;
                            if (enterParams3 != null) {
                                c887503dR4 = enterParams3.LJJIJL;
                            } else {
                                c887503dR4 = null;
                            }
                            String str3 = c1713690uhD.LIZIZ;
                            c888603dc2.getClass();
                            C888603dc.LJII(c887503dR4, str3, null);
                            if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                                CCDCFillCVVViewModel cCDCFillCVVViewModelLo2 = cCDCFillCVVAssem.Lo();
                                cCDCFillCVVViewModelLo2.setState(AFwS228S0000000_1.get$arr$(626));
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cCDCFillCVVViewModelLo2), null, null, new C887703dT(cCDCFillCVVViewModelLo2, null), 3);
                                return;
                            }
                            cCDCFillCVVAssem.Lo().setState(AFwS228S0000000_1.get$arr$(602));
                        }
                    });
                }
                break;
            case 4:
                EnterParams enterParams3 = ((C887403dQ) ((CCDCFillCVVAssem) c1077704Jj.l0).LLJILLL.getValue()).LLILLJJLI;
                if (enterParams3 != null) {
                    c887503dR3 = enterParams3.LJJIJL;
                } else {
                    c887503dR3 = null;
                }
                EnumC887103dN enumC887103dN = EnumC887103dN.SUCCESS;
                C897503f3.LJIIIIZZ(c887503dR3, new C893103eL(enumC887103dN, EnumC888403da.NOT_MIT), null);
                CCDCFillCVVHalfFragment cCDCFillCVVHalfFragmentJo4 = ((CCDCFillCVVAssem) c1077704Jj.l0).Jo();
                if (cCDCFillCVVHalfFragmentJo4 != null) {
                    cCDCFillCVVHalfFragmentJo4.SR(enumC887103dN);
                    String str3 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(cCDCFillCVVHalfFragmentJo4, C343970De7.LIZ);
                    Function0<Unit> function0 = cCDCFillCVVHalfFragmentJo4.LLJI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                break;
            case 5:
                RedirectDetails redirectDetails = ((CCDCFillCVVAssem) c1077704Jj.l0).Lo().LLILLJJLI;
                if (redirectDetails != null && redirectDetails.url != null && (context = abstractC738140SxQ.getContext()) != null) {
                    CCDCFillCVVAssem cCDCFillCVVAssem2 = (CCDCFillCVVAssem) c1077704Jj.l0;
                    String str4 = redirectDetails.url;
                    Map mapLJ = C2097608Jq.LJ();
                    PaymentMethod paymentMethod = ((C887403dQ) cCDCFillCVVAssem2.LLJILLL.getValue()).LL;
                    if (paymentMethod != null) {
                        str2 = paymentMethod.id;
                    }
                    C897503f3.LJFF(context, str4, mapLJ, str2, redirectDetails);
                }
                break;
            case 6:
                ((CCDCFillCVVAssem) c1077704Jj.l0).Lo().setState(AFwS228S0000000_1.get$arr$(602));
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C042Y c042y = (C042Y) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C04EP c04ep = ((C04EM) c1077704Jj.l0).LLJJIII;
        if (c04ep != null) {
            c04ep.LIZJ(iIntValue, iIntValue2, c042y, zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        SeaPdpBottomNavBarWidgetBff seaPdpBottomNavBarWidgetBff = (SeaPdpBottomNavBarWidgetBff) c1077704Jj.l0;
        LinearLayout linearLayout = seaPdpBottomNavBarWidgetBff.LLJIJIL;
        if (linearLayout != null) {
            C1764390w0z c1764390w0z = seaPdpBottomNavBarWidgetBff.LJI().LLLLLLLZIL;
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(seaPdpBottomNavBarWidgetBff, 1725);
            c1764390w0z.getClass();
            HandlerHook.viewPost(linearLayout, new ARunnableS39S0300000_6(linearLayout, c1764390w0z, awS545S0100000_1, 21));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        ExceptionUX exceptionUX = (ExceptionUX) obj4;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = ((UsSkuVH) c1077704Jj.l0).itemView;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            ((UsSkuVH) c1077704Jj.l0).e6().tR2(((UsSkuVH) c1077704Jj.l0).itemView.getContext(), ((UsSkuVH) c1077704Jj.l0).LLJJIJIL.getView(), str, obj3, LifecycleOwnerKt.getLifecycleScope((UsSkuVH) c1077704Jj.l0), exceptionUX);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        ConstraintLayout constraintLayout;
        C948003nC c948003nC = (C948003nC) obj2;
        String str = (String) obj3;
        Integer num = (Integer) obj4;
        if (c948003nC != null && (viewOnAttachStateChangeListenerC20604515jv = (combinedSkuOrderSubmitFragment = (CombinedSkuOrderSubmitFragment) c1077704Jj.l0).LLJJJJ) != null) {
            C03NI c03ni = new C03NI(viewOnAttachStateChangeListenerC20604515jv.getContext(), false, false, null, 14);
            c03ni.LIZ = ((Number) c948003nC.LIZ).intValue();
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                layoutManager.startSmoothScroll(c03ni);
            }
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS70S0200000_1(viewOnAttachStateChangeListenerC20604515jv, combinedSkuOrderSubmitFragment, 34), 350L);
            if (C123100dR.LIZ(str)) {
                int value = ToastPosition.CENTER.getValue();
                if (num != null && num.intValue() == value && (constraintLayout = combinedSkuOrderSubmitFragment.LLJJJIL) != null) {
                    C1361790lXd c1361790lXd = new C1361790lXd(new C1389920mH0(str, null, null, 8189));
                    C1389880mGw c1389880mGw = new C1389880mGw(constraintLayout);
                    c1389880mGw.LIZ = c1361790lXd;
                    c1389880mGw.LJIIJ();
                } else {
                    combinedSkuOrderSubmitFragment.bu(str);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        ExtraFeeStatement extraFeeStatement;
        List listLJIJI = C13LQ.LJIJI(new PaymentMethod[]{obj2, obj3});
        PaymentAgreementViewHolder paymentAgreementViewHolder = (PaymentAgreementViewHolder) c1077704Jj.l0;
        for (PaymentMethod paymentMethod : (ArrayList) listLJIJI) {
            if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d")) {
                InstallmentPlan installmentPlanRR2 = ((PaymentViewModel) paymentAgreementViewHolder.LLJILJIL.getValue()).rR2(paymentMethod, "Get installment plan of BNPL for accessing agreement");
                if ((installmentPlanRR2 == null || (extraFeeStatement = installmentPlanRR2.displayStatement) == null) && (extraFeeStatement = paymentMethod.extraFeeStatement) == null) {
                    ((View) paymentAgreementViewHolder.LLJILLL.getValue()).getLayoutParams().height = 0;
                    C0H1U.LIZIZ((View) paymentAgreementViewHolder.LLJILLL.getValue());
                    C0H1U.LIZIZ((View) paymentAgreementViewHolder.LLJJ.getValue());
                } else {
                    ((View) paymentAgreementViewHolder.LLJILLL.getValue()).getLayoutParams().height = -2;
                    C12ES.LJIILL(0, (View) paymentAgreementViewHolder.LLJILLL.getValue());
                    C12ES.LJIILL(0, (View) paymentAgreementViewHolder.LLJJ.getValue());
                }
                paymentAgreementViewHolder.rr(new C03YN(extraFeeStatement));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        String str = (String) obj2;
        ExceptionUX exceptionUX = (ExceptionUX) obj4;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = ((SeaPdpSkcVH) c1077704Jj.l0).itemView;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            SeaPdpViewModel seaPdpViewModelC6 = ((SeaPdpSkcVH) c1077704Jj.l0).c6();
            Context context = ((SeaPdpSkcVH) c1077704Jj.l0).itemView.getContext();
            C1058404By c1058404By = ((SeaPdpSkcVH) c1077704Jj.l0).c6().LLZZ;
            if (c1058404By != null) {
                viewLIZ = c1058404By.LIZ();
            } else {
                viewLIZ = null;
            }
            seaPdpViewModelC6.xR2(context, viewLIZ, str, obj3, LifecycleOwnerKt.getLifecycleScope((SeaPdpSkcVH) c1077704Jj.l0), exceptionUX);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        BuyButton buyButton = (BuyButton) obj2;
        String str2 = (String) obj3;
        Map map = (Map) obj4;
        C10503048v c10503048v = ((SkuPanelBottomWidgetNew) c1077704Jj.l0).LLJILJILJ;
        if (c10503048v != null && c10503048v.getVisibility() == 0) {
            SkuPanelBottomWidgetNew skuPanelBottomWidgetNew = (SkuPanelBottomWidgetNew) c1077704Jj.l0;
            skuPanelBottomWidgetNew.withState(skuPanelBottomWidgetNew.LJII(), new AwS43S1300000_1(skuPanelBottomWidgetNew, (SkuPanelBottomWidgetNew) buyButton, (BuyButton) str2, (String) map, (Map<String, String>) 17));
            C10495048n.LIZLLL(skuPanelBottomWidgetNew.LJII().er0(), map);
            if (!skuPanelBottomWidgetNew.LLJILLL && (skuPanelBottomWidgetNew.LJII().LLLIIII == EnumC10382044e.NORMAL || skuPanelBottomWidgetNew.LJII().LLLIIII == EnumC10382044e.CACHE)) {
                skuPanelBottomWidgetNew.LLJILLL = true;
                C10503048v c10503048v2 = skuPanelBottomWidgetNew.LLJILJILJ;
                if (c10503048v2 != null && c10503048v2.isEnabled()) {
                    str = "able_to_buy";
                } else {
                    str = "unable_to_buy";
                }
                skuPanelBottomWidgetNew.LJIILJJIL("buy_now", str, null, skuPanelBottomWidgetNew.LJII().LLJLLL.LJ("c1771.d3669"));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew = (SeaPdpBottomNavBarWidgetNew) c1077704Jj.l0;
        LinearLayout linearLayout = seaPdpBottomNavBarWidgetNew.LLJIJIL;
        if (linearLayout != null) {
            C1764390w0z c1764390w0z = seaPdpBottomNavBarWidgetNew.LJIIIIZZ().LLLLLLLZIL;
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(seaPdpBottomNavBarWidgetNew, 1506);
            c1764390w0z.getClass();
            HandlerHook.viewPost(linearLayout, new ARunnableS39S0300000_6(linearLayout, c1764390w0z, awS545S0100000_1, 21));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        String str = (String) obj2;
        ExceptionUX exceptionUX = (ExceptionUX) obj4;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = ((SeaPdpSkuVH) c1077704Jj.l0).itemView;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ((SeaPdpSkuVH) c1077704Jj.l0).LLJJJJ.getValue();
            Context context = ((SeaPdpSkuVH) c1077704Jj.l0).itemView.getContext();
            C1058404By c1058404By = ((SeaPdpViewModel) ((SeaPdpSkuVH) c1077704Jj.l0).LLJJJJ.getValue()).LLZZ;
            if (c1058404By != null) {
                viewLIZ = c1058404By.LIZ();
            } else {
                viewLIZ = null;
            }
            seaPdpViewModel.xR2(context, viewLIZ, str, obj3, LifecycleOwnerKt.getLifecycleScope((SeaPdpSkuVH) c1077704Jj.l0), exceptionUX);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Fragment fragment = (Fragment) obj4;
        if (C03XU.LIZIZ().enableCloseCombinePage) {
            if (fragment != null) {
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
            }
            C03O0.LIZ.getClass();
            C03O0.LJZ();
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) c1077704Jj.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected combine payment method: anchor method - ");
        PaymentMethod paymentMethod = paymentInfo.LIZIZ;
        String str3 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", other method: ");
        PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
        if (paymentMethod2 != null) {
            str3 = paymentMethod2.id;
        }
        sbLIZ.append(str3);
        sbLIZ.append(" in new container");
        orderSubmitAssemViewModel.kT2(paymentInfo, true, false, C2188811AlT.LIZIZ(sbLIZ), false, false, false);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) c1077704Jj.l0;
        C03LU c03lu = orderSubmitAssemViewModel2.LLLL;
        if (c03lu != null) {
            orderSubmitAssemViewModel2.withState(new AwS580S0100000_1(c03lu, 418));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        List<InterfaceC1891350zJl> listLJII;
        String str;
        C031E c031e;
        String str2;
        C031F c031f;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        UIAssem uIAssem = (UIAssem) obj;
        ((Boolean) obj2).booleanValue();
        C031E c031e2 = (C031E) obj3;
        C031F c031f2 = (C031F) obj4;
        View viewLJJIJL = uIAssem.LJJIJL();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewLJJIJL != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.rn0)) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            listLJII = state.LJII();
        } else {
            listLJII = null;
        }
        if (C19719512Dh.LJI(listLJII) && listLJII != null) {
            OspPageListAssem ospPageListAssem = (OspPageListAssem) c1077704Jj.l0;
            if (AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(ospPageListAssem.Ho().m), "order_submit", null, null, 12) == EnumC969503qf.US_OSP_V1.getTemplate()) {
                Iterator<InterfaceC1891350zJl> it2 = listLJII.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1891350zJl next = it2.next();
                    if (next instanceof C031F) {
                        String str3 = ((C031F) next).LLILLJJLI;
                        if (c031f2 != null) {
                            str2 = c031f2.LLILLJJLI;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str3, str2)) {
                            if (i > 0) {
                                Object obj5 = ListProtector.get(listLJII, i);
                                if ((obj5 instanceof C031F) && (c031f = (C031F) obj5) != null && c031f2 != null && c031f.LL != c031f2.LL) {
                                    ArrayList arrayList = new ArrayList();
                                    List list = (List) ((LinkedHashMap) ospPageListAssem.Ho().s0).get(c031f2.LLILLJJLI);
                                    if (list == null) {
                                        list = C13BV.INSTANCE;
                                    }
                                    C19719612Di.LJJI(list, arrayList);
                                    arrayList.add(c031f2);
                                    if (c031f2.LL) {
                                        View viewLJJIJL2 = uIAssem.LJJIJL();
                                        if (viewLJJIJL2 != null) {
                                            viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL2.findViewById(R.id.rn0);
                                        }
                                        C20600815jK.LJIILLIIL(viewOnAttachStateChangeListenerC20604515jv2.getState(), i, 1, arrayList);
                                    } else {
                                        ListProtector.set(listLJII, i, c031f2);
                                        int size = i - list.size();
                                        List<InterfaceC1891350zJl> listSubList = listLJII.subList(i, listLJII.size());
                                        View viewLJJIJL3 = uIAssem.LJJIJL();
                                        if (viewLJJIJL3 != null) {
                                            viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL3.findViewById(R.id.rn0);
                                        }
                                        C20600815jK.LJIILLIIL(viewOnAttachStateChangeListenerC20604515jv2.getState(), size, listLJII.size(), listSubList);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                }
            } else {
                Iterator<InterfaceC1891350zJl> it3 = listLJII.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    InterfaceC1891350zJl next2 = it3.next();
                    if (next2 instanceof C031E) {
                        String str4 = ((C031E) next2).LLILLJJLI;
                        if (c031e2 != null) {
                            str = c031e2.LLILLJJLI;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str4, str)) {
                            if (i2 > 0) {
                                Object obj6 = ListProtector.get(listLJII, i2);
                                if ((obj6 instanceof C031E) && (c031e = (C031E) obj6) != null && c031e2 != null && c031e.LL != c031e2.LL) {
                                    ArrayList arrayList2 = new ArrayList();
                                    List list2 = (List) ((LinkedHashMap) ospPageListAssem.Ho().r0).get(c031e2.LLILLJJLI);
                                    if (list2 == null) {
                                        list2 = C13BV.INSTANCE;
                                    }
                                    C19719612Di.LJJI(list2, arrayList2);
                                    arrayList2.add(c031e2);
                                    if (c031e2.LL) {
                                        View viewLJJIJL4 = uIAssem.LJJIJL();
                                        if (viewLJJIJL4 != null) {
                                            viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL4.findViewById(R.id.rn0);
                                        }
                                        C20600815jK.LJIILLIIL(viewOnAttachStateChangeListenerC20604515jv2.getState(), i2, 1, arrayList2);
                                    } else {
                                        ListProtector.set(listLJII, i2, c031e2);
                                        int size2 = i2 - list2.size();
                                        List<InterfaceC1891350zJl> listSubList2 = listLJII.subList(i2, listLJII.size());
                                        View viewLJJIJL5 = uIAssem.LJJIJL();
                                        if (viewLJJIJL5 != null) {
                                            viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL5.findViewById(R.id.rn0);
                                        }
                                        C20600815jK.LJIILLIIL(viewOnAttachStateChangeListenerC20604515jv2.getState(), size2, listLJII.size(), listSubList2);
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(C1077704Jj c1077704Jj, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        InterfaceC921603iw interfaceC921603iw;
        String str2;
        C887503dR c887503dR;
        C887503dR c887503dR2;
        C19EG c19egRequireActivity;
        C887503dR c887503dR3;
        PaymentMethod paymentMethod;
        EnumC837803Pc enumC837803Pc;
        C887503dR c887503dR4;
        PaymentMethod paymentMethod2;
        Context context;
        String string;
        InterfaceC921603iw interfaceC921603iw2;
        String str3;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        EnumC880203cG enumC880203cG = (EnumC880203cG) obj2;
        String string2 = (String) obj3;
        C948003nC c948003nC = (C948003nC) obj4;
        if (enumC880203cG == null) {
            i = -1;
        } else {
            i = C880303cH.LIZ[enumC880203cG.ordinal()];
        }
        String str4 = "";
        String str5 = null;
        switch (i) {
            case 1:
                if (c948003nC != null) {
                    str = (String) c948003nC.LIZ;
                } else {
                    str = null;
                }
                if (C911703hL.LIZ(str)) {
                    CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo = ((CCDCAddCardAssem) c1077704Jj.l0).Oo();
                    if (cCDCAddCardHalfFragmentOo != null) {
                        C921103ir c921103ir = C921103ir.LIZ;
                        if (c948003nC != null && (str2 = (String) c948003nC.LIZ) != null) {
                            str4 = str2;
                        }
                        c921103ir.getClass();
                        C1710940ucm c1710940ucmLIZ = C921703ix.LIZ(cCDCAddCardHalfFragmentOo);
                        C921103ir.LIZIZ();
                        if (c1710940ucmLIZ != null && (interfaceC921603iw = C921103ir.LIZIZ) != null) {
                            interfaceC921603iw.LIZLLL(c1710940ucmLIZ, str4, new C887203dO(null));
                        }
                    }
                } else {
                    CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo2 = ((CCDCAddCardAssem) c1077704Jj.l0).Oo();
                    if (cCDCAddCardHalfFragmentOo2 != null) {
                        if (string2 == null) {
                            string2 = cCDCAddCardHalfFragmentOo2.getString(2131832931);
                        }
                        C1389880mGw c1389880mGw = new C1389880mGw(cCDCAddCardHalfFragmentOo2);
                        c1389880mGw.LJIIIZ(string2);
                        c1389880mGw.LJIIJ();
                    }
                }
                break;
            case 2:
                CCDCAddCardViewModel cCDCAddCardViewModelZo = ((CCDCAddCardAssem) c1077704Jj.l0).Zo();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cCDCAddCardViewModelZo), null, null, new C887903dV(cCDCAddCardViewModelZo, null), 3);
                break;
            case 3:
                final CCDCAddCardAssem cCDCAddCardAssem = (CCDCAddCardAssem) c1077704Jj.l0;
                cCDCAddCardAssem.getClass();
                EnterParams enterParams = cCDCAddCardAssem.So().LLILLJJLI;
                if (enterParams != null) {
                    c887503dR = enterParams.LJJIJL;
                } else {
                    c887503dR = null;
                }
                C1713520ugw c1713520ugwLIZIZ = C897503f3.LIZIZ(c887503dR, cCDCAddCardAssem.Zo().LLJJJIL);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C888603dc c888603dc = C888603dc.LIZ;
                EnterParams enterParams2 = cCDCAddCardAssem.So().LLILLJJLI;
                if (enterParams2 != null) {
                    c887503dR2 = enterParams2.LJJIJL;
                } else {
                    c887503dR2 = null;
                }
                c888603dc.getClass();
                C888603dc.LJII(c887503dR2, "", null);
                CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo3 = cCDCAddCardAssem.Oo();
                if (cCDCAddCardHalfFragmentOo3 != null && (c19egRequireActivity = cCDCAddCardHalfFragmentOo3.requireActivity()) != null) {
                    ((IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class)).LIZ(c19egRequireActivity, c1713520ugwLIZIZ, new InterfaceC1713650uh9() { // from class: X.03dX
                        @Override // X.InterfaceC1713650uh9
                        public final void LIZ(C1713690uhD c1713690uhD) {
                            C887503dR c887503dR5;
                            C888603dc c888603dc2 = C888603dc.LIZ;
                            EnterParams enterParams3 = cCDCAddCardAssem.So().LLILLJJLI;
                            if (enterParams3 != null) {
                                c887503dR5 = enterParams3.LJJIJL;
                            } else {
                                c887503dR5 = null;
                            }
                            String str6 = c1713690uhD.LIZIZ;
                            Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                            c888603dc2.getClass();
                            C888603dc.LJII(c887503dR5, str6, lValueOf);
                            if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                                CCDCAddCardViewModel cCDCAddCardViewModelZo2 = cCDCAddCardAssem.Zo();
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cCDCAddCardViewModelZo2), null, null, new C887903dV(cCDCAddCardViewModelZo2, null), 3);
                            } else {
                                cCDCAddCardAssem.Zo().setState(AFwS228S0000000_1.get$arr$(611));
                            }
                        }
                    });
                }
                break;
            case 4:
                if (C897503f3.LJI(((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI)) {
                    EnterParams enterParams3 = ((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI;
                    if (enterParams3 != null) {
                        enumC837803Pc = enterParams3.LJJIJIIJI;
                    } else {
                        enumC837803Pc = null;
                    }
                    if (enumC837803Pc == EnumC837803Pc.MEMBERSHIP) {
                        C886203dE.LIZ.getClass();
                        C886203dE.LJIIIIZZ(null, true);
                    } else {
                        EnterParams enterParams4 = ((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI;
                        if (enterParams4 != null) {
                            c887503dR4 = enterParams4.LJJIJL;
                        } else {
                            c887503dR4 = null;
                        }
                        C893103eL c893103eL = new C893103eL(EnumC887103dN.SUCCESS, EnumC888403da.NEW_ADD);
                        PaymentInfo paymentInfo = ((CCDCAddCardAssem) c1077704Jj.l0).Zo().LLJJJJJIL;
                        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
                            str5 = paymentMethod2.id;
                        }
                        C897503f3.LJIIIIZZ(c887503dR4, c893103eL, str5);
                    }
                } else {
                    if (Intrinsics.LJFF(PipoCcdcAddCardRefreshConfigSettings.LIZ().enableRefresh, Boolean.TRUE)) {
                        if (((CCDCAddCardAssem) c1077704Jj.l0).Zo().RQ2()) {
                            n nVar = new n();
                            nVar.LJJIII(Integer.valueOf(C03DI.CCDC_REAL_BIND_SECOND_PAY.getValue()), "payment_change_reason");
                            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_page_refresh_data", nVar.toString());
                        } else {
                            n nVar2 = new n();
                            nVar2.LJJIII(Integer.valueOf(C03DI.CCDC_REAL_BIND_OSP.getValue()), "payment_change_reason");
                            EnterParams enterParams5 = ((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI;
                            if (enterParams5 != null && enterParams5.LJJIIJ) {
                                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_change_mini_osp", nVar2.toString());
                            } else {
                                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_change", nVar2.toString());
                            }
                        }
                    } else {
                        n nVar3 = new n();
                        nVar3.LJJIII(Integer.valueOf(C03DI.CCDC_REAL_BIND_DEFAULT.getValue()), "payment_change_reason");
                        EnterParams enterParams6 = ((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI;
                        if (enterParams6 != null && enterParams6.LJJIIJ) {
                            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_change_mini_osp", nVar3.toString());
                        } else {
                            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_change", nVar3.toString());
                        }
                    }
                    C888603dc c888603dc2 = C888603dc.LIZ;
                    EnterParams enterParams7 = ((CCDCAddCardAssem) c1077704Jj.l0).So().LLILLJJLI;
                    if (enterParams7 != null) {
                        c887503dR3 = enterParams7.LJJIJL;
                    } else {
                        c887503dR3 = null;
                    }
                    C893103eL c893103eL2 = new C893103eL(EnumC887103dN.SUCCESS, EnumC888403da.NEW_ADD);
                    PaymentInfo paymentInfo2 = ((CCDCAddCardAssem) c1077704Jj.l0).Zo().LLJJJJJIL;
                    if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
                        str5 = paymentMethod.id;
                    }
                    c888603dc2.getClass();
                    C888603dc.LIZ(c887503dR3, c893103eL2, str5);
                }
                CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo4 = ((CCDCAddCardAssem) c1077704Jj.l0).Oo();
                if (cCDCAddCardHalfFragmentOo4 != null) {
                    cCDCAddCardHalfFragmentOo4.cS();
                }
                break;
            case 5:
                RedirectDetails redirectDetails = ((CCDCAddCardAssem) c1077704Jj.l0).Zo().LLJJIJIL;
                PaymentMethod paymentMethodHo = ((CCDCAddCardAssem) c1077704Jj.l0).Ho();
                if (paymentMethodHo != null) {
                    str5 = paymentMethodHo.id;
                }
                if (redirectDetails != null && redirectDetails.url != null && (context = abstractC738140SxQ.getContext()) != null) {
                    C897503f3.LJFF(context, redirectDetails.url, C2097608Jq.LJ(), str5, redirectDetails);
                }
                break;
            case 6:
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("ErrorCode bind error");
                if (c948003nC != null) {
                    str5 = (String) c948003nC.LIZ;
                }
                if (C911703hL.LIZ(str5)) {
                    CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo5 = ((CCDCAddCardAssem) c1077704Jj.l0).Oo();
                    if (cCDCAddCardHalfFragmentOo5 != null) {
                        CCDCAddCardAssem cCDCAddCardAssem2 = (CCDCAddCardAssem) c1077704Jj.l0;
                        C921103ir c921103ir2 = C921103ir.LIZ;
                        if (c948003nC != null && (str3 = (String) c948003nC.LIZ) != null) {
                            str4 = str3;
                        }
                        C887803dU c887803dU = new C887803dU(cCDCAddCardAssem2, c948003nC, string2);
                        c921103ir2.getClass();
                        C1710940ucm c1710940ucmLIZ2 = C921703ix.LIZ(cCDCAddCardHalfFragmentOo5);
                        C921103ir.LIZIZ();
                        if (c1710940ucmLIZ2 != null && (interfaceC921603iw2 = C921103ir.LIZIZ) != null) {
                            interfaceC921603iw2.LIZLLL(c1710940ucmLIZ2, str4, new C887203dO(c887803dU));
                        }
                    }
                } else {
                    boolean zContainsKey = C890303dt.LIZ().containsKey(string2);
                    Context context2 = abstractC738140SxQ.getContext();
                    if (context2 != null) {
                        CCDCAddCardAssem cCDCAddCardAssem3 = (CCDCAddCardAssem) c1077704Jj.l0;
                        if (zContainsKey) {
                            string = C890303dt.LIZ().get(string2);
                        } else {
                            string = string2;
                        }
                        if (string == null) {
                            string = context2.getString(2131832931);
                        }
                        C897503f3.LJIIJ(context2, string, new AwS14S1110000_1(zContainsKey, string2, cCDCAddCardAssem3, 2));
                    }
                }
                break;
            case 7:
                ((CCDCAddCardAssem) c1077704Jj.l0).Zo().setState(AFwS228S0000000_1.get$arr$(611));
                break;
        }
        return Unit.LIZ;
    }
}
