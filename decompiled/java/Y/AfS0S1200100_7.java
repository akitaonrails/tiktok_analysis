package Y;

import X.C09JN;
import X.C0IOL;
import X.C0ISJ;
import X.C0KM7;
import X.C0KSE;
import X.C0KSH;
import X.C0W0R;
import X.C1161920gLG;
import X.C158B;
import X.C189200o6;
import X.C19748512Ol;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C389001fE;
import X.C500260Jjc;
import X.C501500Jlc;
import X.C501520Jle;
import X.C512300K7g;
import X.C516010KLn;
import X.C517690KRz;
import X.C517840KSo;
import X.InterfaceC1364105Vn;
import X.InterfaceC517920KSw;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.SuperFanCancelContractResult;
import tikcast.api.fans.SuperFanRecoverResponse;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S1200100_7 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S1200100_7 afS0S1200100_7, Object obj) {
        String str;
        C1C7U.LIZ("FansResubscribeStrategy@14ed.tryRecoverContract$response$1$result$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        SuperFanRecoverResponse.RecoverContractInAppResult recoverContractInAppResult = (SuperFanRecoverResponse.RecoverContractInAppResult) baseResponse.data;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS0S1200100_7.l1;
        C189200o6.m2constructorimpl(baseResponse);
        interfaceC1364105Vn.resumeWith(baseResponse);
        if (recoverContractInAppResult == null || (str = recoverContractInAppResult.contractId) == null) {
            str = "";
        }
        C0KM7 c0km7LIZ = C0W0R.LIZ(((C517690KRz) afS0S1200100_7.l2).LIZJ);
        C516010KLn c516010KLn = C516010KLn.LIZ;
        String str2 = afS0S1200100_7.s0;
        c516010KLn.getClass();
        String str3 = str;
        C516010KLn.LJIILIIL(true, str3, "recover_sub", str2, c0km7LIZ, null);
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S1200100_7.j3;
        String str4 = afS0S1200100_7.s0;
        c516010KLn.getClass();
        C516010KLn.LJIILJJIL(true, str3, jCurrentTimeMillis, "recover_sub", str4, c0km7LIZ, 0, null);
        C516010KLn.LJIIIZ(true, str3, "recover_sub", afS0S1200100_7.s0, c0km7LIZ, null);
        C1C7U.LIZIZ("FansResubscribeStrategy@14ed.tryRecoverContract$response$1$result$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S1200100_7 afS0S1200100_7, Object obj) throws JSONException {
        RechargeCustomError rechargeCustomError;
        CreateSuperFanContractResult.SuperFanEnvelopeInfo superFanEnvelopeInfo;
        Object obj2;
        Room room;
        String idStr;
        List urls;
        int i;
        RechargeCustomError rechargeCustomError2;
        WeakReference<Activity> weakReference;
        RechargeCustomError rechargeCustomError3;
        C1C7U.LIZ("TreasureBoxViewModel@647f.sendStock$disposable$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        CreateSuperFanContractResult createSuperFanContractResult = (CreateSuperFanContractResult) baseResponse.data;
        Activity activity = null;
        if (createSuperFanContractResult != null) {
            rechargeCustomError = createSuperFanContractResult.customerr;
        } else {
            rechargeCustomError = null;
        }
        String str = "";
        if (rechargeCustomError != null) {
            if (createSuperFanContractResult != null && (rechargeCustomError3 = createSuperFanContractResult.customerr) != null) {
                i = rechargeCustomError3.errCode;
            } else {
                i = 0;
            }
            Gson gson = C19748512Ol.LIZJ;
            if (createSuperFanContractResult != null) {
                rechargeCustomError2 = createSuperFanContractResult.customerr;
            } else {
                rechargeCustomError2 = null;
            }
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, rechargeCustomError2), CustomErrorExtra.class);
            IWalletExceptionService iWalletExceptionServiceWalletException = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException();
            C517840KSo c517840KSo = ((TreasureBoxViewModel) afS0S1200100_7.l1).LL;
            if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null) {
                activity = weakReference.get();
            }
            iWalletExceptionServiceWalletException.mO0(activity, customErrorExtra, i, Boolean.TRUE);
            ((C0KSE) afS0S1200100_7.l2).LJIIJ("recharge custom error");
            DataChannel dataChannel = ((TreasureBoxViewModel) afS0S1200100_7.l1).getDataChannel();
            String str2 = afS0S1200100_7.s0;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS0S1200100_7.j3);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("error_code", String.valueOf(i));
            String str3 = baseResponse.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            pairArr[1] = new Pair("log_id", str);
            pairArr[2] = new Pair("detail_error_code", String.valueOf(i));
            pairArr[3] = new Pair("detail_error_msg", "RechargeCustomError");
            C0KSH.LJIIL(dataChannel, CardStruct.IStatusCode.DEFAULT, "treasure_box_in_store", str2, iCurrentTimeMillis, false, "", C2097608Jq.LJIIIIZZ(pairArr));
        } else if (createSuperFanContractResult != null && (superFanEnvelopeInfo = createSuperFanContractResult.envelopeInfo) != null) {
            TreasureBoxViewModel treasureBoxViewModel = (TreasureBoxViewModel) afS0S1200100_7.l1;
            treasureBoxViewModel.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, superFanEnvelopeInfo));
            ImageModel imageModel = superFanEnvelopeInfo.sendUserAvatar;
            if (imageModel == null || (urls = imageModel.getUrls()) == null || (obj2 = ListProtector.get(urls, 0)) == null) {
                obj2 = "";
            }
            jSONObject2.put("send_user_avatar_url", obj2);
            DataChannel dataChannel2 = treasureBoxViewModel.getDataChannel();
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (idStr = room.getIdStr()) != null) {
                str = idStr;
            }
            jSONObject2.put("envelope_room_id", str);
            jSONObject2.put("send_time", C158B.LIZ());
            jSONObject.put("envelope_info", jSONObject2);
            jSONObject.put("display", 1);
            C389001fE.LIZ("liveGoldenEnvelopeCreate", jSONObject, System.currentTimeMillis(), false);
            ((C0KSE) afS0S1200100_7.l2).onSuccess(superFanEnvelopeInfo);
            C0KSH.LJIIL(((TreasureBoxViewModel) afS0S1200100_7.l1).getDataChannel(), CardStruct.IStatusCode.DEFAULT, "treasure_box_in_store", afS0S1200100_7.s0, (int) (System.currentTimeMillis() - afS0S1200100_7.j3), true, "", null);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(AFwS193S0000000_7.get$arr$(225));
            ((C0KSE) afS0S1200100_7.l2).LJIIJ("envelopInfo is null");
            C0KSH.LJIIL(((TreasureBoxViewModel) afS0S1200100_7.l1).getDataChannel(), CardStruct.IStatusCode.DEFAULT, "treasure_box_in_store", afS0S1200100_7.s0, (int) (System.currentTimeMillis() - afS0S1200100_7.j3), false, "", null);
        }
        C1C7U.LIZIZ("TreasureBoxViewModel@647f.sendStock$disposable$2");
    }

    public static final void accept$2(AfS0S1200100_7 afS0S1200100_7, Object obj) {
        C1C7U.LIZ("TreasureBoxViewModel@647f.sendStock$disposable$3");
        Throwable th = (Throwable) obj;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7((TreasureBoxViewModel) afS0S1200100_7.l2, th, 33));
        C0KSE c0kse = (C0KSE) afS0S1200100_7.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZLLL = C512300K7g.LIZLLL(th);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(' ');
        sbLIZ.append(th);
        c0kse.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        C0KSH.LJIIL(((TreasureBoxViewModel) afS0S1200100_7.l2).getDataChannel(), CardStruct.IStatusCode.DEFAULT, "treasure_box_in_store", afS0S1200100_7.s0, (int) (System.currentTimeMillis() - afS0S1200100_7.j3), false, "", C0KSH.LIZ(th));
        C1C7U.LIZIZ("TreasureBoxViewModel@647f.sendStock$disposable$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS0S1200100_7 afS0S1200100_7, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("SuperFanViewModel@dada.cancelRenewal$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        SuperFanCancelContractResult superFanCancelContractResult = (SuperFanCancelContractResult) baseResponse.data;
        if (superFanCancelContractResult != null) {
            numValueOf = Integer.valueOf(superFanCancelContractResult.status);
        } else {
            numValueOf = null;
        }
        if (numValueOf == 1) {
            C389001fE.LIZ("live_super_fan_cancel_success", null, System.currentTimeMillis(), false);
            ((InterfaceC517920KSw) afS0S1200100_7.l1).onSuccess();
            C0KSH.LJIIL(((SuperFanViewModel) afS0S1200100_7.l2).getDataChannel(), "1", "cancel", afS0S1200100_7.s0, (int) (System.currentTimeMillis() - afS0S1200100_7.j3), true, "", null);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(AFwS193S0000000_7.get$arr$(241));
            ((InterfaceC517920KSw) afS0S1200100_7.l1).onFailure();
            DataChannel dataChannel = ((SuperFanViewModel) afS0S1200100_7.l2).getDataChannel();
            String str = afS0S1200100_7.s0;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS0S1200100_7.j3);
            String str2 = baseResponse.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            C0KSH.LJIIL(dataChannel, "1", "cancel", str, iCurrentTimeMillis, false, "", C2097908Jt.LIZJ(new Pair("log_id", str2)));
        }
        C1C7U.LIZIZ("SuperFanViewModel@dada.cancelRenewal$1");
    }

    public static final void accept$4(AfS0S1200100_7 afS0S1200100_7, Object obj) {
        C1C7U.LIZ("SuperFanViewModel@dada.cancelRenewal$2");
        Throwable th = (Throwable) obj;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7((SuperFanViewModel) afS0S1200100_7.l2, th, 38));
        ((InterfaceC517920KSw) afS0S1200100_7.l1).onFailure();
        C0KSH.LJIIL(((SuperFanViewModel) afS0S1200100_7.l2).getDataChannel(), "1", "cancel", afS0S1200100_7.s0, (int) (System.currentTimeMillis() - afS0S1200100_7.j3), false, "", C0KSH.LIZ(th));
        C1C7U.LIZIZ("SuperFanViewModel@dada.cancelRenewal$2");
    }

    public static final void accept$5(AfS0S1200100_7 afS0S1200100_7, Object obj) {
        String simpleName;
        C1C7U.LIZ("DrawRoomListProvider@3742.landscapeFeedsLoad$2$dispose$2");
        Throwable th = (Throwable) obj;
        C0ISJ c0isj = (C0ISJ) afS0S1200100_7.l1;
        c0isj.LLJZIJLIL = false;
        if (th instanceof C501500Jlc) {
            c0isj.LJJIIZI("supply_fail", false);
        } else {
            c0isj.LJJIIZI("load_fail", false);
        }
        ((HashMap) afS0S1200100_7.l2).put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - afS0S1200100_7.j3));
        ((HashMap) afS0S1200100_7.l2).put("request_from", afS0S1200100_7.s0);
        C0ISJ c0isj2 = (C0ISJ) afS0S1200100_7.l1;
        if (th instanceof C501520Jle) {
            simpleName = String.valueOf(((C501520Jle) th).getErrorCode());
        } else {
            simpleName = th.getClass().getSimpleName();
        }
        c0isj2.LLLLIIIILLL = simpleName;
        ((HashMap) afS0S1200100_7.l2).put("error_code", ((C0ISJ) afS0S1200100_7.l1).LLLLIIIILLL);
        HashMap map = (HashMap) afS0S1200100_7.l2;
        String str = ((C0ISJ) afS0S1200100_7.l1).LLLII;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("enter_from_merge", str);
        HashMap map2 = (HashMap) afS0S1200100_7.l2;
        String str3 = ((C0ISJ) afS0S1200100_7.l1).LLLIIII;
        if (str3 != null) {
            str2 = str3;
        }
        map2.put("enter_method", str2);
        C0ISJ c0isj3 = (C0ISJ) afS0S1200100_7.l1;
        HashMap map3 = (HashMap) afS0S1200100_7.l2;
        c0isj3.getClass();
        C0IOL.LJJIZ(map3);
        C1C7U.LIZIZ("DrawRoomListProvider@3742.landscapeFeedsLoad$2$dispose$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S1200100_7(long r2, X.C0KSA r4, com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.l1 = r4
            r0.l2 = r5
            r0.s0 = r6
            r0.j3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l1 = r5
            r0.l2 = r4
            r0.s0 = r6
            r0.j3 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1200100_7.<init>(long, X.0KSA, com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:java.lang.String), (r0 I:Y.AfS0S1200100_7) (LINE:83951625) Y.AfS0S1200100_7.s0 java.lang.String, block:B:2:0x0000 */
    public AfS0S1200100_7(Object obj, C0ISJ c0isj, HashMap<String, Object> map, long j, String str) {
        String str2;
        this.$t = str;
        this.l1 = obj;
        this.l2 = c0isj;
        this.j3 = map;
        this.s0 = str2;
    }
}
