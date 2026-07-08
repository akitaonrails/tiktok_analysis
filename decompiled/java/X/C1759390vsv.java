package X;

import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759390vsv {
    public static void LIZ(final PopUpResponseData popUpResponseData, final PdpViewModel pdpViewModel, String str) {
        BasicPopUp basicPopUp;
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ;
        final PopUpButton popUpButton;
        PopUpButton popUpButton2;
        String str2;
        PopUpButtonExtraInfo popUpButtonExtraInfo;
        BasicPopUp basicPopUp2;
        List<PopUpButton> list;
        PopUpButton popUpButton3;
        PopUpButtonExtraInfo popUpButtonExtraInfo2;
        VoucherInfo voucherInfo;
        String str3;
        final PopUpButton popUpButton4;
        C1054004Ag c1054004Ag;
        String str4;
        String str5;
        final PopUpButton popUpButton5;
        final PopUpButton popUpButton6;
        PopUpButton popUpButton7;
        String str6;
        PopUpButtonExtraInfo popUpButtonExtraInfo3;
        BasicPopUp basicPopUp3;
        List<PopUpButton> list2;
        PopUpButton popUpButton8;
        PopUpButtonExtraInfo popUpButtonExtraInfo4;
        VoucherInfo voucherInfo2;
        String str7 = str;
        if (popUpResponseData != null && (basicPopUp = popUpResponseData.popUp) != null) {
            Integer num = basicPopUp.popUpType;
            int value = C0NLF.ALGORITHMIC_COUPON.getValue();
            String str8 = null;
            if (num != null && num.intValue() == value) {
                BasicPopUp basicPopUp4 = popUpResponseData.popUp;
                if (basicPopUp4 != null) {
                    List<PopUpButton> list3 = basicPopUp4.buttons;
                    if (list3 != null) {
                        popUpButton6 = (PopUpButton) C13LP.LJJJLL(list3);
                    } else {
                        popUpButton6 = null;
                    }
                    BasicPopUp basicPopUp5 = popUpResponseData.popUp;
                    C1054004Ag c1054004Ag2 = pdpViewModel.LLJLILLLLZIIL;
                    if (c1054004Ag2 != null) {
                        String str9 = basicPopUp5.daInfo;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ2 = c1054004Ag2.LJJIJLIJ();
                        if (interfaceC1748810vbrLJJIJLIJ2 != null) {
                            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ2, new C1751560vgI(), new AwS140S1100000_26(c1054004Ag2, str9, 68));
                        }
                    }
                    List<PopUpButton> list4 = basicPopUp5.buttons;
                    if (list4 != null) {
                        popUpButton7 = (PopUpButton) C13LP.LJJJLL(list4);
                    } else {
                        popUpButton7 = null;
                    }
                    if (C1759400vsw.LIZ(popUpButton7)) {
                        C1069004Ga c1069004Ga = pdpViewModel.LLLLLLLLLL;
                        if (popUpButton7 != null && (popUpButtonExtraInfo3 = popUpButton7.extraInfo) != null && (basicPopUp3 = popUpButtonExtraInfo3.nextPopUp) != null && (list2 = basicPopUp3.buttons) != null && (popUpButton8 = (PopUpButton) C13LP.LJJJLL(list2)) != null && (popUpButtonExtraInfo4 = popUpButton8.extraInfo) != null && (voucherInfo2 = popUpButtonExtraInfo4.voucherInfo) != null) {
                            str6 = voucherInfo2.voucherTypeId;
                        } else {
                            str6 = null;
                        }
                        c1069004Ga.LIZ = true;
                        c1069004Ga.LIZJ = str6;
                        C1054004Ag c1054004Ag3 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag3 != null) {
                            c1054004Ag3.LJJIJIIJI("to_upgrade", "voucher_lucky_draw", basicPopUp5.daInfo);
                        }
                    } else {
                        C1054004Ag c1054004Ag4 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag4 != null) {
                            c1054004Ag4.LJJIJIIJI("get_new_voucher", "voucher_lucky_draw", basicPopUp5.daInfo);
                        }
                    }
                    pdpViewModel.LLLLJ.LJIIIIZZ(popUpResponseData.popUp, null, new InterfaceC1759670vtN() { // from class: X.0vtB
                        @Override // X.InterfaceC1759670vtN
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1759670vtN
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1759670vtN
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1759670vtN
                        public final void LJFF() {
                        }

                        @Override // X.InterfaceC1759670vtN
                        public final void LJ() {
                            PopUpButton popUpButton9 = popUpButton6;
                            if (popUpButton9 != null) {
                                C1759400vsw.LIZIZ(popUpButton9, pdpViewModel, "cancel");
                            }
                        }

                        @Override // X.InterfaceC1759670vtN
                        public final void LIZLLL(View view) {
                            PopUpButton popUpButton9 = popUpButton6;
                            if (popUpButton9 != null) {
                                PdpViewModel pdpViewModel2 = pdpViewModel;
                                pdpViewModel2.LLLLL.LIZ(new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo), view, false);
                                C1759400vsw.LIZIZ(popUpButton9, pdpViewModel2, "button");
                            }
                        }
                    });
                    return;
                }
                return;
            }
            int value2 = C0NLF.FREE_SHIPPING_ADDON_REMINDER.getValue();
            if (num != null && num.intValue() == value2) {
                final BasicPopUp basicPopUp6 = popUpResponseData.popUp;
                if (basicPopUp6 == null) {
                    return;
                }
                C1054004Ag c1054004Ag5 = pdpViewModel.LLJLILLLLZIIL;
                if (c1054004Ag5 != null) {
                    c1054004Ag5.LJJIJIIJI("free_shipping_layer", "add_on_reminder", basicPopUp6.daInfo);
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp6, null, new InterfaceC1759670vtN() { // from class: X.0veT
                    @Override // X.InterfaceC1759670vtN
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZLLL(View view) {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZ() {
                        BasicPopUp basicPopUp7 = basicPopUp6;
                        C1054004Ag c1054004Ag6 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag6 != null) {
                            String str10 = basicPopUp7.daInfo;
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag6.LJJIJLIJ();
                            if (interfaceC1748810vbrLJJIJLIJ3 != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C10516049i(), new C1057404Bo(c1054004Ag6, str10, "free_shipping_layer", "add_on_reminder", "add_on_layer", "other"));
                            }
                        }
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJ() {
                        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                        C1750440veU.LIZ.getClass();
                        String str10 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
                        Keva keva = C1750440veU.LIZIZ;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                        }
                        keva.storeString(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), str10);
                        BasicPopUp basicPopUp7 = basicPopUp6;
                        C1054004Ag c1054004Ag6 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag6 != null) {
                            String str11 = basicPopUp7.daInfo;
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag6.LJJIJLIJ();
                            if (interfaceC1748810vbrLJJIJLIJ3 != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C10516049i(), new C1057404Bo(c1054004Ag6, str11, "free_shipping_layer", "add_on_reminder", "add_on_layer", "cancel"));
                            }
                        }
                    }
                });
                return;
            }
            int value3 = C0NLF.REWARDS_PROGRAM.getValue();
            if (num != null && num.intValue() == value3) {
                BasicPopUp basicPopUp7 = popUpResponseData.popUp;
                if (basicPopUp7 == null) {
                    return;
                }
                List<PopUpButton> list5 = basicPopUp7.buttons;
                if (list5 != null) {
                    popUpButton5 = (PopUpButton) C13LP.LJJJLL(list5);
                } else {
                    popUpButton5 = null;
                }
                Integer num2 = popUpResponseData.popUp.style;
                int value4 = EnumC1759420vsy.FLOATING_LAYER.getValue();
                if (num2 != null && num2.intValue() == value4) {
                    C1054004Ag c1054004Ag6 = pdpViewModel.LLJLILLLLZIIL;
                    if (c1054004Ag6 != null) {
                        c1054004Ag6.LJJIJIIJI(null, null, popUpResponseData.popUp.daInfo);
                    }
                    str7 = "c08431.d5278";
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(popUpResponseData.popUp, str7, new InterfaceC1759670vtN() { // from class: X.0vt9
                    @Override // X.InterfaceC1759670vtN
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJ() {
                        C1054004Ag c1054004Ag7 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag7 != null) {
                            C1054004Ag.LJJIJ(c1054004Ag7, "cancel", null, null, popUpResponseData.popUp.daInfo, 14);
                        }
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZLLL(View view) {
                        PopUpButton popUpButton9 = popUpButton5;
                        if (popUpButton9 != null) {
                            PdpViewModel pdpViewModel2 = pdpViewModel;
                            PopUpResponseData popUpResponseData2 = popUpResponseData;
                            pdpViewModel2.LLLLL.LIZ(new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo), view, false);
                            C1054004Ag c1054004Ag7 = pdpViewModel2.LLJLILLLLZIIL;
                            if (c1054004Ag7 != null) {
                                C1054004Ag.LJJIJ(c1054004Ag7, "see_offer", null, null, popUpResponseData2.popUp.daInfo, 14);
                            }
                        }
                    }
                });
                return;
            }
            C0NLF c0nlf = C0NLF.EXISTING_COUPON_REMINDER;
            int value5 = c0nlf.getValue();
            if (num != null && num.intValue() == value5) {
                final BasicPopUp basicPopUp8 = popUpResponseData.popUp;
                if (basicPopUp8 == null) {
                    return;
                }
                Integer num3 = basicPopUp8.style;
                int value6 = EnumC1759420vsy.LYNX_FLOATING_LAYER_BOTTOM_ONLY.getValue();
                if (num3 != null && num3.intValue() == value6) {
                    LynxInfo lynxInfo = basicPopUp8.lynxInfo;
                    if (lynxInfo != null) {
                        str5 = lynxInfo.schema;
                        str8 = lynxInfo.lynxData;
                    } else {
                        str5 = null;
                    }
                    pdpViewModel.setState(new AwS605S0100000_26(new C1759460vt2(EnumC1759580vtE.BOTTOM, new C1759590vtF(str5, str8), null, true, false, null, c0nlf, 48), 2));
                    return;
                }
                C1054004Ag c1054004Ag7 = pdpViewModel.LLJLILLLLZIIL;
                if (c1054004Ag7 != null) {
                    c1054004Ag7.LJJIJIIJI("coupon_remind", "existing_coupon_remind", basicPopUp8.daInfo);
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp8, null, new InterfaceC1759670vtN() { // from class: X.0vtK
                    @Override // X.InterfaceC1759670vtN
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZ() {
                        BasicPopUp basicPopUp9 = basicPopUp8;
                        C1054004Ag c1054004Ag8 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag8 != null) {
                            C1054004Ag.LJJIJ(c1054004Ag8, "other", "coupon_remind", "existing_coupon_remind", basicPopUp9.daInfo, 8);
                        }
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZIZ() {
                        PopUpButton popUpButton9;
                        PopUpButtonExtraInfo popUpButtonExtraInfo5;
                        List<PopUpButton> list6 = basicPopUp8.buttons;
                        if (list6 == null || (popUpButton9 = (PopUpButton) C13LP.LJJJLL(list6)) == null || (popUpButtonExtraInfo5 = popUpButton9.extraInfo) == null || popUpButtonExtraInfo5.voucherInfo == null) {
                            return;
                        }
                        int value7 = EnumC1759660vtM.BIZ_TYPE_COUPON.getValue();
                        PdpComponentAction pdpComponentAction = new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo);
                        PopUpButtonExtraInfo popUpButtonExtraInfo6 = popUpButton9.extraInfo;
                        PdpComponentCard pdpComponentCard = new PdpComponentCard(null, null, pdpComponentAction, Integer.valueOf(value7), popUpButtonExtraInfo6 != null ? popUpButtonExtraInfo6.daInfo : null, null);
                        C1759650vtL c1759650vtL = C1759650vtL.LIZ;
                        PdpViewModel pdpViewModel2 = pdpViewModel;
                        C1054004Ag c1054004Ag8 = pdpViewModel2.LLJLILLLLZIIL;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag8 != null ? c1054004Ag8.LJJIJLIJ() : null;
                        c1759650vtL.getClass();
                        C1759650vtL.LIZ(pdpComponentCard, pdpViewModel2, interfaceC1748810vbrLJJIJLIJ3, "no_interaction");
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJ() {
                        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                        PopUpButton popUpButton9;
                        PopUpButtonExtraInfo popUpButtonExtraInfo5;
                        C1759680vtO.LIZ.getClass();
                        String str10 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
                        Keva keva = C1759680vtO.LIZIZ;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                        }
                        keva.storeString(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), str10);
                        BasicPopUp basicPopUp9 = basicPopUp8;
                        C1054004Ag c1054004Ag8 = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag8 != null) {
                            C1054004Ag.LJJIJ(c1054004Ag8, "cancel", "coupon_remind", "existing_coupon_remind", basicPopUp9.daInfo, 8);
                        }
                        List<PopUpButton> list6 = basicPopUp8.buttons;
                        if (list6 == null || (popUpButton9 = (PopUpButton) C13LP.LJJJLL(list6)) == null || (popUpButtonExtraInfo5 = popUpButton9.extraInfo) == null || popUpButtonExtraInfo5.voucherInfo == null) {
                            return;
                        }
                        int value7 = EnumC1759660vtM.BIZ_TYPE_COUPON.getValue();
                        PdpComponentAction pdpComponentAction = new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo);
                        PopUpButtonExtraInfo popUpButtonExtraInfo6 = popUpButton9.extraInfo;
                        PdpComponentCard pdpComponentCard = new PdpComponentCard(null, null, pdpComponentAction, Integer.valueOf(value7), popUpButtonExtraInfo6 != null ? popUpButtonExtraInfo6.daInfo : null, null);
                        C1759650vtL c1759650vtL = C1759650vtL.LIZ;
                        PdpViewModel pdpViewModel2 = pdpViewModel;
                        C1054004Ag c1054004Ag9 = pdpViewModel2.LLJLILLLLZIIL;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag9 != null ? c1054004Ag9.LJJIJLIJ() : null;
                        c1759650vtL.getClass();
                        C1759650vtL.LIZ(pdpComponentCard, pdpViewModel2, interfaceC1748810vbrLJJIJLIJ3, "click_coupon");
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJFF() {
                        PopUpButton popUpButton9;
                        PopUpButtonExtraInfo popUpButtonExtraInfo5;
                        C1054004Ag c1054004Ag8;
                        PopUpButtonExtraInfo popUpButtonExtraInfo6;
                        VoucherInfo voucherInfo3;
                        List<PopUpButton> list6 = basicPopUp8.buttons;
                        if (list6 == null || (popUpButton9 = (PopUpButton) C13LP.LJJJLL(list6)) == null || (popUpButtonExtraInfo5 = popUpButton9.extraInfo) == null || popUpButtonExtraInfo5.voucherInfo == null) {
                            return;
                        }
                        EnumC1759660vtM enumC1759660vtM = EnumC1759660vtM.BIZ_TYPE_COUPON;
                        int value7 = enumC1759660vtM.getValue();
                        PdpComponentAction pdpComponentAction = new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo);
                        PopUpButtonExtraInfo popUpButtonExtraInfo7 = popUpButton9.extraInfo;
                        PdpComponentCard pdpComponentCard = new PdpComponentCard(null, null, pdpComponentAction, Integer.valueOf(value7), popUpButtonExtraInfo7 != null ? popUpButtonExtraInfo7.daInfo : null, null);
                        C1759650vtL c1759650vtL = C1759650vtL.LIZ;
                        PdpViewModel pdpViewModel2 = pdpViewModel;
                        C1054004Ag c1054004Ag9 = pdpViewModel2.LLJLILLLLZIIL;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag9 != null ? c1054004Ag9.LJJIJLIJ() : null;
                        c1759650vtL.getClass();
                        Integer num4 = pdpComponentCard.bizType;
                        if (interfaceC1748810vbrLJJIJLIJ3 != null) {
                            int value8 = enumC1759660vtM.getValue();
                            if (num4 != null && num4.intValue() == value8) {
                                PdpComponentAction pdpComponentAction2 = pdpComponentCard.action;
                                if (pdpComponentAction2 == null || (popUpButtonExtraInfo6 = pdpComponentAction2.extraInfo) == null || (voucherInfo3 = popUpButtonExtraInfo6.voucherInfo) == null || voucherInfo3.voucherTypeId == null) {
                                    pdpComponentCard.bizType.getClass();
                                }
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C1751560vgI(), new AwS392S0200000_26(pdpComponentCard, pdpViewModel2, 115));
                                return;
                            }
                            int value9 = EnumC1759660vtM.BIZ_TYPE_CAMPAIGN.getValue();
                            if (num4 != null && num4.intValue() == value9) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C048X(), new AwS605S0100000_26(pdpComponentCard, 535));
                                return;
                            }
                            int value10 = EnumC1759660vtM.BIZ_TYPE_TASK.getValue();
                            if (num4 == null || num4.intValue() != value10 || (c1054004Ag8 = pdpViewModel2.LLJLILLLLZIIL) == null) {
                                return;
                            }
                            String str10 = pdpComponentCard.daInfo;
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ4 = c1054004Ag8.LJJIJLIJ();
                            if (interfaceC1748810vbrLJJIJLIJ4 != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ4, new C1749000vcA(), new AwS109S1200000_26(c1054004Ag8, (Integer) 1, str10, 41));
                            }
                        }
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZLLL(View view) {
                        PopUpButton popUpButton9;
                        String str10;
                        List<PopUpButton> list6 = popUpResponseData.popUp.buttons;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = null;
                        if (list6 != null && (popUpButton9 = (PopUpButton) C13LP.LJJJLL(list6)) != null) {
                            PdpViewModel pdpViewModel2 = pdpViewModel;
                            PopUpResponseData popUpResponseData2 = popUpResponseData;
                            pdpViewModel2.LLLLL.LIZ(new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo), view, false);
                            C1054004Ag c1054004Ag8 = pdpViewModel2.LLJLILLLLZIIL;
                            if (c1054004Ag8 != null) {
                                C1054004Ag.LJJIJ(c1054004Ag8, "claim", null, null, popUpResponseData2.popUp.daInfo, 14);
                            }
                            PopUpButtonExtraInfo popUpButtonExtraInfo5 = popUpButton9.extraInfo;
                            if (popUpButtonExtraInfo5 != null && popUpButtonExtraInfo5.voucherInfo != null) {
                                EnumC1759660vtM enumC1759660vtM = EnumC1759660vtM.BIZ_TYPE_COUPON;
                                int value7 = enumC1759660vtM.getValue();
                                PdpComponentAction pdpComponentAction = new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo);
                                PopUpButtonExtraInfo popUpButtonExtraInfo6 = popUpButton9.extraInfo;
                                if (popUpButtonExtraInfo6 != null) {
                                    str10 = popUpButtonExtraInfo6.daInfo;
                                } else {
                                    str10 = null;
                                }
                                PdpComponentCard pdpComponentCard = new PdpComponentCard(null, null, pdpComponentAction, Integer.valueOf(value7), str10, null);
                                C1759650vtL c1759650vtL = C1759650vtL.LIZ;
                                C1054004Ag c1054004Ag9 = pdpViewModel2.LLJLILLLLZIIL;
                                if (c1054004Ag9 != null) {
                                    interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag9.LJJIJLIJ();
                                }
                                c1759650vtL.getClass();
                                Integer num4 = pdpComponentCard.bizType;
                                int value8 = enumC1759660vtM.getValue();
                                if (num4 != null && num4.intValue() == value8) {
                                    if (interfaceC1748810vbrLJJIJLIJ3 != null) {
                                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C1751550vgH(), new AwS109S1200000_26(pdpComponentCard, pdpViewModel2, 18));
                                    }
                                } else {
                                    int value9 = EnumC1759660vtM.BIZ_TYPE_CAMPAIGN.getValue();
                                    if (num4 == null || num4.intValue() != value9 || interfaceC1748810vbrLJJIJLIJ3 == null) {
                                        return;
                                    }
                                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C1748030vab(), new AwS605S0100000_26(pdpComponentCard, 533));
                                }
                            }
                        }
                    }
                });
                return;
            }
            int value7 = C0NLF.MANUAL_CLAIM_QCPX_COUPON_REMINDER.getValue();
            if (num != null && num.intValue() == value7) {
                BasicPopUp basicPopUp9 = popUpResponseData.popUp;
                if (basicPopUp9 == null) {
                    return;
                }
                List<PopUpButton> list6 = basicPopUp9.buttons;
                if (list6 != null) {
                    popUpButton4 = (PopUpButton) C13LP.LJJJLL(list6);
                    if (popUpButton4 != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
                        PopUpButtonExtraInfo popUpButtonExtraInfo5 = popUpButton4.extraInfo;
                        if (popUpButtonExtraInfo5 != null) {
                            str4 = popUpButtonExtraInfo5.daInfo;
                        } else {
                            str4 = null;
                        }
                        c1054004Ag.LJJIJIIJI("manual_claim_voucher", "qcpx_voucher", str4);
                    }
                } else {
                    popUpButton4 = null;
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(popUpResponseData.popUp, null, new InterfaceC1759670vtN() { // from class: X.0vtA
                    @Override // X.InterfaceC1759670vtN
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJ() {
                        C1054004Ag c1054004Ag8;
                        PopUpButton popUpButton9 = popUpButton4;
                        if (popUpButton9 == null || (c1054004Ag8 = pdpViewModel.LLJLILLLLZIIL) == null) {
                            return;
                        }
                        PopUpButtonExtraInfo popUpButtonExtraInfo6 = popUpButton9.extraInfo;
                        C1054004Ag.LJJIJ(c1054004Ag8, "cancel", "manual_claim_voucher", "qcpx_voucher", popUpButtonExtraInfo6 != null ? popUpButtonExtraInfo6.daInfo : null, 8);
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZLLL(View view) {
                        String str10;
                        PopUpButton popUpButton9 = popUpButton4;
                        if (popUpButton9 != null) {
                            PdpViewModel pdpViewModel2 = pdpViewModel;
                            pdpViewModel2.LLLLL.LIZ(new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo), view, false);
                            C1054004Ag c1054004Ag8 = pdpViewModel2.LLJLILLLLZIIL;
                            if (c1054004Ag8 != null) {
                                PopUpButtonExtraInfo popUpButtonExtraInfo6 = popUpButton9.extraInfo;
                                if (popUpButtonExtraInfo6 != null) {
                                    str10 = popUpButtonExtraInfo6.daInfo;
                                } else {
                                    str10 = null;
                                }
                                C1054004Ag.LJJIJ(c1054004Ag8, "button", "manual_claim_voucher", "qcpx_voucher", str10, 8);
                            }
                        }
                    }
                });
                return;
            }
            int value8 = C0NLF.POPUPTYPE_NEW_CUSTOMER_OFFER.getValue();
            if (num != null && num.intValue() == value8) {
                BasicPopUp basicPopUp10 = popUpResponseData.popUp;
                if (basicPopUp10 == null) {
                    return;
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp10, null, null);
                return;
            }
            C0NLF c0nlf2 = C0NLF.SURPRISE_COUPON;
            int value9 = c0nlf2.getValue();
            if (num != null && num.intValue() == value9) {
                BasicPopUp basicPopUp11 = popUpResponseData.popUp;
                if (basicPopUp11 == null) {
                    return;
                }
                Integer num4 = basicPopUp11.style;
                int value10 = EnumC1759420vsy.LYNX_FLOATING_LAYER_BOTTOM_ONLY.getValue();
                if (num4 != null && num4.intValue() == value10) {
                    LynxInfo lynxInfo2 = popUpResponseData.popUp.lynxInfo;
                    if (lynxInfo2 != null) {
                        str3 = lynxInfo2.schema;
                        str8 = lynxInfo2.lynxData;
                    } else {
                        str3 = null;
                    }
                    pdpViewModel.setState(new AwS605S0100000_26(new C1759460vt2(EnumC1759580vtE.BOTTOM, new C1759590vtF(str3, str8), null, true, false, null, c0nlf2, 48), 3));
                    return;
                }
                BasicPopUp basicPopUp12 = popUpResponseData.popUp;
                if (basicPopUp12 == null) {
                    return;
                }
                List<PopUpButton> list7 = basicPopUp12.buttons;
                if (list7 != null) {
                    popUpButton = (PopUpButton) C13LP.LJJJLL(list7);
                } else {
                    popUpButton = null;
                }
                C1054004Ag c1054004Ag8 = pdpViewModel.LLJLILLLLZIIL;
                if (c1054004Ag8 != null) {
                    String str10 = basicPopUp12.daInfo;
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ3 = c1054004Ag8.LJJIJLIJ();
                    if (interfaceC1748810vbrLJJIJLIJ3 != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ3, new C1751560vgI(), new AwS140S1100000_26(c1054004Ag8, str10, 68));
                    }
                }
                List<PopUpButton> list8 = basicPopUp12.buttons;
                if (list8 != null) {
                    popUpButton2 = (PopUpButton) C13LP.LJJJLL(list8);
                } else {
                    popUpButton2 = null;
                }
                if (C1759410vsx.LIZ(popUpButton2)) {
                    C1069004Ga c1069004Ga2 = pdpViewModel.LLLLLLLLLL;
                    if (popUpButton2 != null && (popUpButtonExtraInfo = popUpButton2.extraInfo) != null && (basicPopUp2 = popUpButtonExtraInfo.nextPopUp) != null && (list = basicPopUp2.buttons) != null && (popUpButton3 = (PopUpButton) C13LP.LJJJLL(list)) != null && (popUpButtonExtraInfo2 = popUpButton3.extraInfo) != null && (voucherInfo = popUpButtonExtraInfo2.voucherInfo) != null) {
                        str2 = voucherInfo.voucherTypeId;
                    } else {
                        str2 = null;
                    }
                    c1069004Ga2.LIZ = true;
                    c1069004Ga2.LIZJ = str2;
                    C1054004Ag c1054004Ag9 = pdpViewModel.LLJLILLLLZIIL;
                    if (c1054004Ag9 != null) {
                        c1054004Ag9.LJJIJIIJI("to_upgrade", "voucher_lucky_draw", basicPopUp12.daInfo);
                    }
                } else {
                    C1054004Ag c1054004Ag10 = pdpViewModel.LLJLILLLLZIIL;
                    if (c1054004Ag10 != null) {
                        c1054004Ag10.LJJIJIIJI("get_new_voucher", "voucher_lucky_draw", basicPopUp12.daInfo);
                    }
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp12, null, new InterfaceC1759670vtN() { // from class: X.0vtC
                    @Override // X.InterfaceC1759670vtN
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJFF() {
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LJ() {
                        PopUpButton popUpButton9 = popUpButton;
                        if (popUpButton9 != null) {
                            C1759410vsx.LIZIZ(popUpButton9, pdpViewModel, "cancel");
                        }
                    }

                    @Override // X.InterfaceC1759670vtN
                    public final void LIZLLL(View view) {
                        PopUpButton popUpButton9 = popUpButton;
                        if (popUpButton9 != null) {
                            PdpViewModel pdpViewModel2 = pdpViewModel;
                            pdpViewModel2.LLLLL.LIZ(new PdpComponentAction(popUpButton9.action, popUpButton9.schema, popUpButton9.extraInfo), view, false);
                            C1759410vsx.LIZIZ(popUpButton9, pdpViewModel2, "button");
                        }
                    }
                });
                return;
            }
            int value11 = C0NLF.OVERSEAS_SHIPPING_REMINDER.getValue();
            if (num != null && num.intValue() == value11) {
                if (popUpResponseData.popUp == null) {
                    return;
                }
                C1054004Ag c1054004Ag11 = pdpViewModel.LLJLILLLLZIIL;
                if (c1054004Ag11 != null && (interfaceC1748810vbrLJJIJLIJ = c1054004Ag11.LJJIJLIJ()) != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new AnonymousClass0481(), new AwS115S1100000_1(c1054004Ag11, 51));
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(popUpResponseData.popUp, null, null);
                return;
            }
            int value12 = C0NLF.USER_SURVEY.getValue();
            if (num != null && num.intValue() == value12) {
                BasicPopUp basicPopUp13 = popUpResponseData.popUp;
                if (basicPopUp13 == null) {
                    return;
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp13, null, null);
                return;
            }
            int value13 = C0NLF.US_MEMBERSHIP.getValue();
            if (num != null && num.intValue() == value13) {
                BasicPopUp basicPopUp14 = popUpResponseData.popUp;
                if (basicPopUp14 == null) {
                    return;
                }
                pdpViewModel.LLLLJ.LJIIIIZZ(basicPopUp14, null, null);
                return;
            }
            int value14 = C0NLF.INVALID.getValue();
            if (num == null || num.intValue() != value14) {
                return;
            }
            C1019103yf.LIZ(EnumC1014603xw.ERR10000, null, null);
        }
    }

    public static void LIZIZ(C0NLD c0nld, PdpViewModel pdpViewModel, String str) {
        C1056604Bg c1056604Bg = C1054504Al.LIZ;
        c0nld.LIZJ(pdpViewModel, C1741890vQh.LJIIIIZZ(C1054504Al.LIZ(pdpViewModel.getProductId())), Integer.valueOf(c0nld.getId().getValue()), null, null, str, "c5815.d14808", null);
    }

    public static void LIZJ(C0NLD c0nld, PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pdpViewModel), C0PEM.LIZJ, null, new C597900Nci(pdpViewModel, str, num, str2, list, str3, str5, c0nld, str4, null), 2);
    }
}
