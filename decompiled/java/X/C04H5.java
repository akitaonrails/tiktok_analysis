package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DetailsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04H5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04H5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final PdpViewModel LIZ;
    public final List<Function2<Boolean, String, Unit>> LIZIZ = Collections.synchronizedList(new ArrayList());

    public C04H5(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZIZ(BasicPopUp basicPopUp) {
        PopUpButton popUpButton;
        Integer num = basicPopUp.style;
        int value = EnumC1759420vsy.BOTTOM_SHEET.getValue();
        Integer num2 = null;
        if (num != null && num.intValue() == value) {
            List<PopUpButton> list = basicPopUp.buttons;
            if (list != null && (popUpButton = (PopUpButton) C13LP.LJJJLL(list)) != null) {
                num2 = popUpButton.action;
            }
            int value2 = C04H6.UPGRADE_COUPON.getValue();
            if (num2 != null && num2.intValue() == value2) {
                C1054004Ag c1054004Ag = this.LIZ.LLJLILLLLZIIL;
                if (c1054004Ag != null) {
                    c1054004Ag.LJIIL("to_upgrade", basicPopUp.daInfo);
                    return;
                }
                return;
            }
            int value3 = C04H6.CLAIM_COUPON.getValue();
            if (num2 != null && num2.intValue() == value3) {
                C1054004Ag c1054004Ag2 = this.LIZ.LLJLILLLLZIIL;
                if (c1054004Ag2 == null) {
                    return;
                }
                c1054004Ag2.LJIIL("get_new_voucher", basicPopUp.daInfo);
                return;
            }
            C1054004Ag c1054004Ag3 = this.LIZ.LLJLILLLLZIIL;
            if (c1054004Ag3 == null) {
                return;
            }
            c1054004Ag3.LJIIL("get_new_voucher", basicPopUp.daInfo);
            return;
        }
        C1019103yf.LIZ(EnumC1014603xw.ERR10006, null, null);
    }

    public final void LIZ(PdpComponentAction pdpComponentAction, View view, boolean z) {
        String str;
        Object obj;
        String str2;
        Integer num;
        String str3;
        DetailsInfo detailsInfo;
        BasicPopUp basicPopUp;
        Object obj2;
        String str4;
        String str5;
        HashMap<String, Object> mapLJIIJ;
        BasicPopUp basicPopUp2;
        Integer num2 = pdpComponentAction.action;
        int value = C04H6.SHOW_POP_UP.getValue();
        Map<String, Object> map = null;
        if (num2 != null && num2.intValue() == value) {
            PopUpButtonExtraInfo popUpButtonExtraInfo = pdpComponentAction.extraInfo;
            if (popUpButtonExtraInfo != null && (basicPopUp2 = popUpButtonExtraInfo.nextPopUp) != null) {
                LIZIZ(basicPopUp2);
                this.LIZ.LLLLJ.LJIIIIZZ(basicPopUp2, null, null);
            }
        } else {
            int value2 = C04H6.CLOSE_POP_UP.getValue();
            if (num2 != null && num2.intValue() == value2) {
                this.LIZ.LLLLJ.LJFF();
            } else {
                int value3 = C04H6.CLAIM_COUPON.getValue();
                if (num2 != null && num2.intValue() == value3) {
                    if (z) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C04GT(pdpComponentAction.extraInfo, this, null), 2);
                    } else {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C04GS(pdpComponentAction.extraInfo, this, null), 2);
                    }
                } else {
                    int value4 = C04H6.UPGRADE_COUPON.getValue();
                    if (num2 != null && num2.intValue() == value4) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C04GN(pdpComponentAction.extraInfo, this, null), 2);
                    } else {
                        int value5 = C04H6.ADD_TO_CART.getValue();
                        if (num2 != null && num2.intValue() == value5) {
                            PopUpButtonExtraInfo popUpButtonExtraInfo2 = pdpComponentAction.extraInfo;
                            if (popUpButtonExtraInfo2 != null && (str5 = popUpButtonExtraInfo2.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
                                obj2 = mapLJIIJ.get("actionsheet_name");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str4 = (String) obj2;
                            } else {
                                str4 = null;
                            }
                            PdpViewModel pdpViewModel = this.LIZ;
                            if (str4 == null) {
                                str4 = "algo_voucher";
                            }
                            PdpViewModel.jR2(pdpViewModel, view, view, 2, str4, 48);
                            this.LIZ.LLLLJ.LJFF();
                        } else {
                            int value6 = C04H6.SHOW_LYNX_SHEET.getValue();
                            if (num2 != null && num2.intValue() == value6) {
                                PopUpButtonExtraInfo popUpButtonExtraInfo3 = pdpComponentAction.extraInfo;
                                if (popUpButtonExtraInfo3 != null && (basicPopUp = popUpButtonExtraInfo3.nextPopUp) != null) {
                                    this.LIZ.LLLLJ.LJIIIIZZ(basicPopUp, null, null);
                                }
                            } else {
                                int value7 = C04H6.OPEN_SCHEMA.getValue();
                                if (num2 != null && num2.intValue() == value7) {
                                    Context context = view.getContext();
                                    String str6 = pdpComponentAction.schema;
                                    if (str6 != null) {
                                        C919503ib.LIZIZ(context, this.LIZ.LLILZIL.LJII("c5815.d0", str6, null), C2097608Jq.LJ(), false).open();
                                    }
                                } else {
                                    int value8 = C04H6.OPEN_COUPON_PAGE.getValue();
                                    if (num2 != null && num2.intValue() == value8) {
                                        Context context2 = view.getContext();
                                        String str7 = pdpComponentAction.schema;
                                        if (str7 != null) {
                                            this.LIZ.LLLLLIL.LIZIZ(context2, str7);
                                        }
                                    } else {
                                        int value9 = C04H6.OPEN_DIALOG.getValue();
                                        if (num2 != null && num2.intValue() == value9) {
                                            Context context3 = view.getContext();
                                            PopUpButtonExtraInfo popUpButtonExtraInfo4 = pdpComponentAction.extraInfo;
                                            if (popUpButtonExtraInfo4 != null && (detailsInfo = popUpButtonExtraInfo4.detailInfo) != null) {
                                                C1397580mTM c1397580mTM = new C1397580mTM(context3);
                                                c1397580mTM.LJI(detailsInfo.title);
                                                c1397580mTM.LIZIZ(detailsInfo.content);
                                                C985403tE.LIZ(c1397580mTM, new AwS580S0100000_1(detailsInfo, 845));
                                                new C1397510mTF(c1397580mTM).LIZLLL();
                                            }
                                        } else {
                                            int value10 = C04H6.OPEN_SKU.getValue();
                                            if (num2 != null && num2.intValue() == value10) {
                                                PdpViewModel.iS2(this.LIZ, view, 0, new C1077604Ji(view, this, 4), false, null, null, false, null, null, 1016);
                                            } else {
                                                int value11 = C04H6.CHECK_POPUP.getValue();
                                                if (num2 != null && num2.intValue() == value11) {
                                                    PopUpButtonExtraInfo popUpButtonExtraInfo5 = pdpComponentAction.extraInfo;
                                                    if (popUpButtonExtraInfo5 != null && (num = popUpButtonExtraInfo5.popupType) != null && popUpButtonExtraInfo5.nextRequestScenes != null) {
                                                        C0NLF.Companion.getClass();
                                                        C0NLF c0nlfLIZ = C592240NKs.LIZ(num);
                                                        NextRequestScene nextRequestScene = (NextRequestScene) C13LP.LJJJLL(popUpButtonExtraInfo5.nextRequestScenes);
                                                        if (nextRequestScene != null) {
                                                            str3 = nextRequestScene.sceneValue;
                                                        } else {
                                                            str3 = null;
                                                        }
                                                        C0NLD c0nldLIZ = this.LIZ.LLLLJI.LIZ(c0nlfLIZ);
                                                        if (c0nldLIZ != null) {
                                                            c0nldLIZ.LJ(this.LIZ, str3);
                                                        }
                                                    }
                                                } else {
                                                    int value12 = C04H6.FOLLOW_CLAIM_COUPON.getValue();
                                                    if (num2 != null && num2.intValue() == value12) {
                                                        PopUpButtonExtraInfo popUpButtonExtraInfo6 = pdpComponentAction.extraInfo;
                                                        if (popUpButtonExtraInfo6 == null) {
                                                            str = null;
                                                        } else {
                                                            try {
                                                                str = popUpButtonExtraInfo6.passThroughParams;
                                                            } catch (Exception e) {
                                                                TryCatchGuardChecker.doCheck(e);
                                                                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSON_PARSE, e, null);
                                                            }
                                                        }
                                                        Map map2 = (Map) C1280004ze.LIZIZ(str, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WW
                                                        }.getType());
                                                        if (map2 == null) {
                                                            obj = null;
                                                        } else {
                                                            obj = map2.get("seller_uid");
                                                        }
                                                        String str8 = (String) obj;
                                                        if (popUpButtonExtraInfo6 == null) {
                                                            str2 = null;
                                                        } else {
                                                            try {
                                                                str2 = popUpButtonExtraInfo6.passThroughParams;
                                                            } catch (Exception e2) {
                                                                TryCatchGuardChecker.doCheck(e2);
                                                                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSON_PARSE, e2, null);
                                                            }
                                                        }
                                                        FollowShopAndClaimRequest followShopAndClaimRequest = (FollowShopAndClaimRequest) C1280004ze.LIZ(str2, FollowShopAndClaimRequest.class);
                                                        if (followShopAndClaimRequest != null) {
                                                            C948503nH.LJFF(this.LIZ.LLLLLLLLL.LIZ, C0PEM.LIZJ, new C05F3(followShopAndClaimRequest, str8, new AwS56S0210000_1(this, z, popUpButtonExtraInfo6, 13), null));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePdpAction_");
        sbLIZ.append(pdpComponentAction.action);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
        if (pdpEnterParam != null) {
            map = pdpEnterParam.trackParams;
        }
        c1326490kch.getClass();
        C1326490kch.LJIIIIZZ("PdpActionMgr", strLIZIZ, map);
    }

    public final void LIZJ(String str, String str2, boolean z) {
        int i;
        for (Function2<Boolean, String, Unit> function2 : this.LIZIZ) {
            if (str != null) {
                Boolean boolValueOf = Boolean.valueOf(z);
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    i = 3;
                } else if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                    i = 1;
                } else {
                    i = -1;
                }
                C732802ta.LIZLLL(i, str, str2, null);
            }
            function2.invoke(Boolean.valueOf(z), str);
        }
    }
}
