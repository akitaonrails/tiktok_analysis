package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.AwS280S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077804Jk extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4, obj5);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4, obj5);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4, obj5);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4, obj5);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(LogisticSelectFragment logisticSelectFragment, int i) {
        super(5);
        this.$t = i;
        this.l0 = logisticSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(PaymentInfoCell2 paymentInfoCell2, int i) {
        super(5);
        this.$t = i;
        this.l0 = paymentInfoCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(USAddonOrderCell uSAddonOrderCell, int i) {
        super(5);
        this.$t = i;
        this.l0 = uSAddonOrderCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(5);
        this.$t = i;
        this.l0 = uSPaymentInfoCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(OrderSubmitFragment orderSubmitFragment, int i) {
        super(5);
        this.$t = i;
        this.l0 = orderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(PaymentViewModel paymentViewModel, int i) {
        super(5);
        this.$t = i;
        this.l0 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(CCDCAddCardViewModel cCDCAddCardViewModel, int i) {
        super(5);
        this.$t = i;
        this.l0 = cCDCAddCardViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077804Jk(CCDCFillCVVViewModel cCDCFillCVVViewModel, int i) {
        super(5);
        this.$t = i;
        this.l0 = cCDCFillCVVViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(X.C1077804Jk r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r9 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r9
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r6 = r10.booleanValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r2 = r11.booleanValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            boolean r0 = X.C871103an.LIZ()
            r4 = 0
            if (r0 == 0) goto L73
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            boolean r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L73
            r5 = 1
        L28:
            boolean r0 = X.C871103an.LIZ()
            if (r0 == 0) goto L71
            if (r2 == 0) goto L71
            if (r1 == 0) goto L71
            r3 = 1
        L33:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            android.view.View r1 = r0.itemView
            r0 = 2131390155(0x7f0a6ecb, float:1.8400873E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r5 != 0) goto L44
            if (r3 == 0) goto L6e
        L44:
            if (r9 == 0) goto L50
            java.lang.Boolean r1 = r9.isValid
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6e
        L50:
            if (r6 != 0) goto L66
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LLJJI
            if (r0 == 0) goto L6c
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r0.newShopOrders
        L60:
            boolean r0 = X.C7806033c.LIZ(r0)
            if (r0 == 0) goto L6e
        L66:
            X.C786410Ut5.LJLLLLLL(r4, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6c:
            r0 = 0
            goto L60
        L6e:
            r4 = 8
            goto L66
        L71:
            r3 = 0
            goto L33
        L73:
            r5 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1077804Jk.invoke$0(X.04Jk, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C1077804Jk r49, java.lang.Object r50, java.lang.Object r51, java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1077804Jk.invoke$1(X.04Jk, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C880003cE.LIZ[((EnumC880203cG) obj).ordinal()] == 1) {
            ((PaymentViewModel) c1077804Jk.l0).setState(AFwS228S0000000_1.get$arr$(224));
        } else {
            ((PaymentViewModel) c1077804Jk.l0).setState(AFwS228S0000000_1.get$arr$(227));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zLJFF;
        boolean z;
        int i;
        View viewFindViewById;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        PaymentInfo paymentInfo = (PaymentInfo) obj4;
        AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) obj5;
        if (paymentInfo != null) {
            zLJFF = Intrinsics.LJFF(paymentInfo.isValid, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF && (viewFindViewById = ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.rnv)) != null && viewFindViewById.getVisibility() != 0) {
            z = true;
        } else {
            z = false;
        }
        View viewFindViewById2 = ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.pa2);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        if (zBooleanValue && zBooleanValue2 && anonymousClass0376 != null && Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.TRUE) && z && C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_strengthen_checkout_process", true) != 0) {
            C786410Ut5.LJLLLLLL(0, ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.pa1));
            ((TuxTextView) ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.us_order_submit_select_payment_prompt_text)).setTextColorRes(R.attr.zs);
        } else {
            C786410Ut5.LLLLLLZZ((TuxIconView) ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.pa1), 8);
            ((TuxTextView) ((USPaymentInfoCell) c1077804Jk.l0).itemView.findViewById(R.id.us_order_submit_select_payment_prompt_text)).setTextColorRes(R.attr.a1k);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        EnumC880203cG enumC880203cG = (EnumC880203cG) obj;
        RedirectDetails redirectDetails = (RedirectDetails) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        if (C880903cN.LIZ[enumC880203cG.ordinal()] == 1) {
            CCDCFillCVVViewModel cCDCFillCVVViewModel = (CCDCFillCVVViewModel) c1077804Jk.l0;
            cCDCFillCVVViewModel.getClass();
            cCDCFillCVVViewModel.setState(new AwS11S2000000_1(str, str2, 8));
        } else {
            CCDCFillCVVViewModel cCDCFillCVVViewModel2 = (CCDCFillCVVViewModel) c1077804Jk.l0;
            cCDCFillCVVViewModel2.LLILLJJLI = redirectDetails;
            if (enumC880203cG == EnumC880203cG.NEED_3DS) {
                cCDCFillCVVViewModel2.setState(new AwS580S0100000_1(enumC880203cG, 611));
            } else {
                cCDCFillCVVViewModel2.setState(new AwS580S0100000_1(enumC880203cG, 614));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        EnumC880203cG enumC880203cG = (EnumC880203cG) obj;
        RedirectDetails redirectDetails = (RedirectDetails) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        MaterialCollectionInfo materialCollectionInfo = (MaterialCollectionInfo) obj5;
        int i = C880803cM.LIZ[enumC880203cG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) c1077804Jk.l0;
                    cCDCAddCardViewModel.LLJJIJIL = redirectDetails;
                    cCDCAddCardViewModel.LLJJJ = materialCollectionInfo;
                    if (enumC880203cG == EnumC880203cG.NEED_3DS) {
                        cCDCAddCardViewModel.setState(new AwS580S0100000_1(enumC880203cG, 602));
                    } else {
                        cCDCAddCardViewModel.setState(new AwS580S0100000_1(enumC880203cG, 603));
                    }
                } else {
                    ((CCDCAddCardViewModel) c1077804Jk.l0).OQ2(materialCollectionInfo);
                }
            } else {
                CCDCAddCardViewModel cCDCAddCardViewModel2 = (CCDCAddCardViewModel) c1077804Jk.l0;
                cCDCAddCardViewModel2.LLJJJ = null;
                cCDCAddCardViewModel2.setState(new AwS11S2000000_1(str2, str, 10));
                ((CCDCAddCardViewModel) c1077804Jk.l0).PQ2(str);
            }
        } else {
            CCDCAddCardViewModel cCDCAddCardViewModel3 = (CCDCAddCardViewModel) c1077804Jk.l0;
            cCDCAddCardViewModel3.LLJJJ = null;
            cCDCAddCardViewModel3.setState(new AwS11S2000000_1(str2, str, 9));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC960503pD interfaceC960503pD = (InterfaceC960503pD) obj;
        interfaceC960503pD.withState(((LogisticSelectFragment) c1077804Jk.l0).dS(), new AwS367S0200000_1((LogisticSelectFragment) c1077804Jk.l0, interfaceC960503pD, 360));
        return Unit.LIZ;
    }

    public static final Object invoke$7(C1077804Jk c1077804Jk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String string;
        String string2;
        String string3;
        int i;
        C03CU c03cu = (C03CU) obj3;
        Boolean bool = (Boolean) obj4;
        Integer num = (Integer) obj5;
        if (Intrinsics.LJFF(obj2, Boolean.FALSE)) {
            Context context = ((OrderSubmitFragment) c1077804Jk.l0).getContext();
            if (context != null) {
                OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) c1077804Jk.l0;
                C921103ir c921103ir = C921103ir.LIZ;
                c921103ir.getClass();
                if (C921103ir.LJIIIIZZ()) {
                    if (c03cu == null) {
                        i = -1;
                    } else {
                        i = C036D.LIZ[c03cu.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c921103ir.getClass();
                                C921103ir.LIZLLL(context, "9900508", "order_submit", "prepaidcard", null);
                            }
                        } else {
                            C921103ir.LIZLLL(context, "9900507", "order_submit", "paypal", new AwS280S0300000_1(orderSubmitFragment, bool, num, 15));
                        }
                    } else {
                        C921103ir.LIZLLL(context, "9900506", "order_submit", "ccdc", new AwS280S0300000_1(orderSubmitFragment, bool, num, 14));
                    }
                } else {
                    C03CU c03cu2 = C03CU.SNS_CARD_NOT_CHOOSE_SAVE;
                    if (c03cu != c03cu2 && c03cu != C03CU.SNS_PAYPAL_NOT_CHOOSE_SAVE) {
                        if (c03cu == C03CU.SNS_CARD_IS_PREPAID) {
                            C1397580mTM c1397580mTM = new C1397580mTM(context);
                            c1397580mTM.LIZIZ(orderSubmitFragment.getResources().getString(2131833102));
                            C985403tE.LIZ(c1397580mTM, new AwS580S0100000_1(orderSubmitFragment, 1066));
                            c1397580mTM.LJII = false;
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    } else {
                        if (c03cu == c03cu2) {
                            string = null;
                        } else {
                            string = orderSubmitFragment.getResources().getString(2131833101);
                        }
                        if (c03cu == c03cu2) {
                            string2 = orderSubmitFragment.getResources().getString(2131833169);
                        } else {
                            string2 = orderSubmitFragment.getResources().getString(2131833100);
                        }
                        if (c03cu == c03cu2) {
                            string3 = orderSubmitFragment.getResources().getString(2131833167);
                        } else {
                            string3 = orderSubmitFragment.getResources().getString(2131833099);
                        }
                        C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                        c1397580mTM2.LJI(string);
                        c1397580mTM2.LIZIZ(string2);
                        C985403tE.LIZ(c1397580mTM2, new AwS43S1300000_1(string3, orderSubmitFragment, bool, num, 23));
                        c1397580mTM2.LJII = false;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                    }
                }
            }
            ((OrderSubmitFragment) c1077804Jk.l0).ZR().setState(AFwS228S0000000_1.get$arr$(470));
        }
        return Unit.LIZ;
    }
}
