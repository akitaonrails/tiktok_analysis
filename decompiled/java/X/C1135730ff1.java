package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ff1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135730ff1 extends AbstractC1135740ff2 {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    public static void LIZJ(CompletionBlock completionBlock, Throwable th) {
        if (th instanceof C1123810fLn) {
            return;
        }
        InterfaceC1135760ff4 interfaceC1135760ff4 = (InterfaceC1135760ff4) C1909107dp.LIZJ(InterfaceC1135760ff4.class, null);
        try {
            interfaceC1135760ff4.setCode(0);
            String strValueOf = "";
            if (th instanceof C501520Jle) {
                interfaceC1135760ff4.setErrorCode(Integer.valueOf(((C501520Jle) th).getErrorCode()));
                strValueOf = String.valueOf(((C501520Jle) th).getErrorCode());
                C1AF0.LJFF(th, "SendGiftMethod API Error");
            } else {
                C1AF0.LJFF(th, "SendGiftMethod Generic Error");
            }
            completionBlock.onFailure(0, strValueOf, interfaceC1135760ff4);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        int iIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int i;
        C1125860fP6 c1125860fP6;
        InterfaceC1135750ff3 interfaceC1135750ff3 = (InterfaceC1135750ff3) xBaseParamModel;
        Number giftId = interfaceC1135750ff3.getGiftId();
        if (giftId != null) {
            jLongValue = giftId.longValue();
        } else {
            jLongValue = 0;
        }
        Number giftCount = interfaceC1135750ff3.getGiftCount();
        if (giftCount != null) {
            iIntValue = giftCount.intValue();
        } else {
            iIntValue = 0;
        }
        String enterFrom = interfaceC1135750ff3.getEnterFrom();
        String str = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        String streamGoalEntrance = interfaceC1135750ff3.getStreamGoalEntrance();
        if (streamGoalEntrance != null) {
            str = streamGoalEntrance;
        }
        Boolean closeGiftPanelImmediate = interfaceC1135750ff3.getCloseGiftPanelImmediate();
        if (closeGiftPanelImmediate != null) {
            zBooleanValue = closeGiftPanelImmediate.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolIsEventReport = interfaceC1135750ff3.isEventReport();
        if (boolIsEventReport != null) {
            zBooleanValue2 = boolIsEventReport.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Boolean closeGiftPanel = interfaceC1135750ff3.getCloseGiftPanel();
        if (closeGiftPanel != null) {
            closeGiftPanel.booleanValue();
        }
        Number comboOffsetX = interfaceC1135750ff3.getComboOffsetX();
        if (comboOffsetX != null) {
            iIntValue2 = comboOffsetX.intValue();
        } else {
            iIntValue2 = 0;
        }
        Number comboOffsetY = interfaceC1135750ff3.getComboOffsetY();
        if (comboOffsetY != null) {
            iIntValue3 = comboOffsetY.intValue();
        } else {
            iIntValue3 = 0;
        }
        Number toastDelaySeconds = interfaceC1135750ff3.getToastDelaySeconds();
        if (toastDelaySeconds != null) {
            iIntValue4 = toastDelaySeconds.intValue();
        } else {
            iIntValue4 = 0;
        }
        Boolean showCombo = interfaceC1135750ff3.getShowCombo();
        if (Intrinsics.LJFF(showCombo, Boolean.TRUE)) {
            i = 1;
        } else if (Intrinsics.LJFF(showCombo, Boolean.FALSE)) {
            i = 2;
        } else if (showCombo == null) {
            i = 0;
        } else {
            throw new C1954807lC();
        }
        if (jLongValue > 0 && iIntValue > 0) {
            C1125830fP3 currentGoalInfo = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getCurrentGoalInfo();
            if (currentGoalInfo != null) {
                c1125860fP6 = currentGoalInfo.LIZ;
            } else {
                c1125860fP6 = null;
            }
            C1129400fUo c1129400fUo = new C1129400fUo(jLongValue, iIntValue, new InterfaceC1125350fOH(completionBlock) { // from class: X.0ff0
                public final CompletionBlock<InterfaceC1135760ff4> LIZ;

                @Override // X.InterfaceC1125350fOH
                public final void LIZ(Throwable th) {
                    C1135730ff1 c1135730ff1 = this.LIZIZ;
                    CompletionBlock<InterfaceC1135760ff4> completionBlock2 = this.LIZ;
                    c1135730ff1.getClass();
                    C1135730ff1.LIZJ(completionBlock2, th);
                }

                @Override // X.InterfaceC1125350fOH
                public final void LIZIZ(SendGiftResult sendGiftResult) {
                    List<GiftResultData> list;
                    int iValueOf;
                    if (sendGiftResult != null) {
                        list = sendGiftResult.gifts;
                    } else {
                        list = null;
                    }
                    if (C0IKQ.LIZ(list)) {
                        C1135730ff1 c1135730ff1 = this.LIZIZ;
                        CompletionBlock<InterfaceC1135760ff4> completionBlock2 = this.LIZ;
                        AssertionError assertionError = new AssertionError();
                        c1135730ff1.getClass();
                        C1135730ff1.LIZJ(completionBlock2, assertionError);
                        return;
                    }
                    if (sendGiftResult == null) {
                        return;
                    }
                    C1135730ff1 c1135730ff12 = this.LIZIZ;
                    CompletionBlock<InterfaceC1135760ff4> completionBlock3 = this.LIZ;
                    c1135730ff12.getClass();
                    List<GiftResultData> list2 = sendGiftResult.gifts;
                    InterfaceC1135760ff4 interfaceC1135760ff4 = (InterfaceC1135760ff4) C1909107dp.LIZJ(InterfaceC1135760ff4.class, null);
                    new JSONObject();
                    try {
                        interfaceC1135760ff4.setCode(1);
                        ArrayList arrayList = new ArrayList();
                        for (GiftResultData giftResultData : list2) {
                            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1135770ff5.class, null);
                            InterfaceC1135770ff5 interfaceC1135770ff5 = (InterfaceC1135770ff5) xBaseModelLIZJ;
                            interfaceC1135770ff5.setGiftId(Long.valueOf(giftResultData.giftId));
                            interfaceC1135770ff5.setGroupCount(Integer.valueOf(giftResultData.groupCount));
                            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftResultData.giftId);
                            if (giftFindGiftById != null) {
                                iValueOf = Integer.valueOf(giftFindGiftById.type);
                            } else {
                                iValueOf = 1;
                            }
                            interfaceC1135770ff5.setGiftType(iValueOf);
                            interfaceC1135770ff5.setComboCount(Integer.valueOf(giftResultData.comboCount));
                            arrayList.add(xBaseModelLIZJ);
                        }
                        interfaceC1135760ff4.setResultList(arrayList);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    completionBlock3.onSuccess(interfaceC1135760ff4, "");
                }

                {
                    this.LIZ = completionBlock;
                }
            }, i, enterFrom, zBooleanValue, iIntValue2, iIntValue3, c1125860fP6, 7200);
            c1129400fUo.LJIILLIIL = str;
            c1129400fUo.LJIILIIL = zBooleanValue2;
            c1129400fUo.LJIILJJIL = iIntValue4;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_jsb_call");
            c474500IjALIZ.LJJII("sendGift", "method_name");
            c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "gift_id");
            c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "gift_count");
            c474500IjALIZ.LJJII(enterFrom, "enter_from");
            c474500IjALIZ.LIZ();
            C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(this, c1129400fUo, 47));
            return;
        }
        LIZJ(completionBlock, new IllegalArgumentException());
    }
}
