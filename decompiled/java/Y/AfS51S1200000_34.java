package Y;

import X.AbstractC848400XPy;
import X.C09JN;
import X.C0XQ7;
import X.C1232850iBf;
import X.C1388190mED;
import X.C13BV;
import X.C1841240y0w;
import X.C1909107dp;
import X.C19EG;
import X.C1B06;
import X.C1B09;
import X.C1C7U;
import X.C2194311AuL;
import X.C2195221Avo;
import X.C2195931Awx;
import X.C2195941Awy;
import X.C2197471AzR;
import X.C2197481AzS;
import X.C2197731Azr;
import X.C2327809Ae;
import X.C786410Ut5;
import X.EnumC1379020lzQ;
import X.EnumC2197771Azv;
import X.EnumC2197781Azw;
import X.InterfaceC2194401AuU;
import X.InterfaceC2194411AuV;
import X.InterfaceC2194431AuX;
import X.InterfaceC2194481Auc;
import X.InterfaceC497601wk;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetTierInfoResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisTierInfo;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams;
import com.ss.android.ugc.aweme.minis.request.SocialRelationshipApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public class AfS51S1200000_34 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS51S1200000_34 afS51S1200000_34, Object obj) {
        boolean z;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        double dDoubleValue;
        String string;
        Double dLJII;
        C1C7U.LIZ("MinisRechargeBeanTask@c3fd.startRechargeFlow$1$rechargeFlow$2");
        MinisGetTierInfoResponse minisGetTierInfoResponse = (MinisGetTierInfoResponse) obj;
        C786410Ut5.LJIIJ(((C2197471AzR) afS51S1200000_34.l1).LJ);
        MinisTierInfo minisTierInfo = minisGetTierInfoResponse.tierInfos.get(afS51S1200000_34.s0);
        HashMap<String, MinisTierInfo> map = minisGetTierInfoResponse.tierInfos;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = "";
        if (!z && minisTierInfo != null) {
            C2197481AzS c2197481AzS = ((C2197471AzR) afS51S1200000_34.l1).LJIIJ;
            C2197481AzS.LIZJ(c2197481AzS, "get_tier_info_success", 0, null, c2197481AzS.LIZ("get_tier_info_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
            ((C2197471AzR) afS51S1200000_34.l1).LJIIJ(minisTierInfo.sku_id);
            Activity activityLIZ = C1B06.LIZJ.LIZ(((C2197471AzR) afS51S1200000_34.l1).LIZ);
            if (activityLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C2197471AzR c2197471AzR = (C2197471AzR) afS51S1200000_34.l1;
                System.currentTimeMillis();
                C2197481AzS c2197481AzS2 = c2197471AzR.LJIIJ;
                c2197481AzS2.LJIILL = "recharge";
                long j = minisTierInfo.tokenAmount;
                try {
                    dLJII = C2327809Ae.LJII(minisTierInfo.price);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (dLJII != null) {
                    dDoubleValue = dLJII.doubleValue();
                } else {
                    dDoubleValue = -1.0d;
                }
                String str2 = minisTierInfo.currency;
                if (str2 == null) {
                    str2 = "";
                }
                c2197481AzS2.LJIILIIL = j;
                c2197481AzS2.LJIIJJI = dDoubleValue;
                c2197481AzS2.LJIIL = str2;
                c2197481AzS2.LJIILJJIL = -1L;
                C2197481AzS c2197481AzS3 = c2197471AzR.LJIIJ;
                C2197481AzS.LIZJ(c2197481AzS3, "show_recharge_sheet", 0, null, c2197481AzS3.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61430);
                long j2 = 0;
                boolean z2 = false;
                C2197481AzS.LIZIZ(c2197471AzR.LJIIJ, "tm_recharge_panel_show", 0L, 0, null, null, null, 62);
                String string2 = c2197471AzR.LIZ.getString(2131822238);
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp != null) {
                    Integer num = minisMetaResp.minisType;
                    int iOrdinal = EnumC1379020lzQ.MINIS_TYPE_GAME.ordinal();
                    if (num != null && num.intValue() == iOrdinal) {
                        string2 = c2197471AzR.LIZ.getString(2131822370);
                    }
                }
                if (C1841240y0w.LIZ()) {
                    string2 = C786410Ut5.j4(c2197471AzR.LIZ.getString(2131857203), Arrays.copyOf(new Object[]{"\u202a" + minisTierInfo.symbol + minisTierInfo.price + (char) 8236}, 1));
                    StringBuilder sb = new StringBuilder();
                    sb.append(minisTierInfo.symbol);
                    sb.append(minisTierInfo.price);
                    string = sb.toString();
                } else {
                    string = minisTierInfo.currency + minisTierInfo.price;
                }
                String str3 = minisTierInfo.tierId;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = minisTierInfo.sku_id;
                if (str4 != null) {
                    str = str4;
                }
                long j3 = minisTierInfo.tokenAmount;
                String str5 = MinisRechargeFragment._pnsPageId;
                c2197471AzR.LJIIL(supportFragmentManager, new MinisRechargeSheetParams(str3, str, j3, j2, string, string2, "MODE_RECHARGE", j2, c2197471AzR.LJII, minisTierInfo.webPrice, minisTierInfo.webPriceDiscountAmount, minisTierInfo.webPriceDiscountRate, minisTierInfo.symbol, z2, j2, 24712), new AwS400S0200000_34(c2197471AzR, minisTierInfo, 6), new AwS578S0100000_34(c2197471AzR, 50), new AwS578S0100000_34(c2197471AzR, 51));
            } else {
                C2197471AzR c2197471AzR2 = (C2197471AzR) afS51S1200000_34.l1;
                c2197471AzR2.getClass();
                C1232850iBf c1232850iBf = C2197731Azr.LJJIIJZLJL;
                C1B09 c1b09 = c2197471AzR2.LIZJ;
                EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.CLIENT_SHOW_SHEET_FAIL;
                int i = c1232850iBf.LIZ;
                String strLIZJ = c1232850iBf.LJ;
                if (strLIZJ == null) {
                    strLIZJ = c2197471AzR2.LIZJ();
                }
                c1b09.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i, null, strLIZJ, EnumC2197781Azw.EXCEPTION, 2), null, 12));
            }
        } else {
            C1232850iBf c1232850iBf2 = C2197731Azr.LJJIIJ;
            C2197481AzS c2197481AzS4 = ((C2197471AzR) afS51S1200000_34.l1).LJIIJ;
            long jLIZ = c2197481AzS4.LIZ("get_tier_info_start");
            int i2 = c1232850iBf2.LIZ;
            String str6 = c1232850iBf2.LIZIZ;
            if (str6 != null) {
                str = str6;
            }
            C2197481AzS.LIZJ(c2197481AzS4, "get_tier_info_fail", i2, str, jLIZ, 0, 0L, 0L, null, null, 0, "SERVER", null, false, c1232850iBf2.LIZJ, c1232850iBf2.LIZLLL, c1232850iBf2, 7152);
            C2197471AzR c2197471AzR3 = (C2197471AzR) afS51S1200000_34.l1;
            C1B09 c1b092 = c2197471AzR3.LIZJ;
            EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.SERVER_LOADING_TIER_FAIL;
            int i3 = c1232850iBf2.LIZ;
            String strLIZJ2 = c1232850iBf2.LJ;
            if (strLIZJ2 == null) {
                strLIZJ2 = c2197471AzR3.LIZJ();
            }
            c1b092.LIZIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i3, null, strLIZJ2, EnumC2197781Azw.SERVER, 2), c1232850iBf2, 4));
        }
        C1C7U.LIZIZ("MinisRechargeBeanTask@c3fd.startRechargeFlow$1$rechargeFlow$2");
    }

    public static final void accept$1(AfS51S1200000_34 afS51S1200000_34, Object obj) {
        C1C7U.LIZ("MinisUserStorageAPIMethodIDL@fec9.handle$getFriendCloudStorageTask$1");
        SocialRelationshipApi.MinisGetFriendCloudStorageResponse minisGetFriendCloudStorageResponse = (SocialRelationshipApi.MinisGetFriendCloudStorageResponse) obj;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        List<SocialRelationshipApi.FriendCloudStorageData> list = minisGetFriendCloudStorageResponse.data;
        if (list != null) {
            String str = afS51S1200000_34.s0;
            C2194311AuL c2194311AuL = (C2194311AuL) afS51S1200000_34.l2;
            for (SocialRelationshipApi.FriendCloudStorageData friendCloudStorageData : list) {
                String str2 = friendCloudStorageData.openId;
                if (str2 != null && str2.length() != 0 && friendCloudStorageData.uid != null && str != null && str.length() != 0) {
                    String str3 = friendCloudStorageData.openId;
                    String string = friendCloudStorageData.uid.toString();
                    c2194311AuL.getClass();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C2194311AuL.LLILLL;
                    Object linkedHashMap2 = linkedHashMap.get(curUserId);
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap.put(curUserId, linkedHashMap2);
                    }
                    Map map = (Map) linkedHashMap2;
                    Object linkedHashMap3 = map.get(str);
                    if (linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                        map.put(str, linkedHashMap3);
                    }
                    ((Map) linkedHashMap3).put(str3, string);
                }
            }
        }
        InterfaceC2194401AuU interfaceC2194401AuU = (InterfaceC2194401AuU) C1909107dp.LIZJ(InterfaceC2194401AuU.class, null);
        InterfaceC2194431AuX interfaceC2194431AuX = (InterfaceC2194431AuX) C1909107dp.LIZJ(InterfaceC2194431AuX.class, null);
        interfaceC2194431AuX.setStatusCode(0);
        List<SocialRelationshipApi.FriendCloudStorageData> list2 = minisGetFriendCloudStorageResponse.data;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
            for (SocialRelationshipApi.FriendCloudStorageData friendCloudStorageData2 : list2) {
                InterfaceC2194411AuV interfaceC2194411AuV = (InterfaceC2194411AuV) C1909107dp.LIZJ(InterfaceC2194411AuV.class, null);
                interfaceC2194411AuV.setDisplayName(friendCloudStorageData2.displayName);
                interfaceC2194411AuV.setAvatarUrl(friendCloudStorageData2.avatarUrl);
                interfaceC2194411AuV.setOpenId(friendCloudStorageData2.openId);
                ArrayList arrayList2 = new ArrayList(C13BV.INSTANCE);
                List<SocialRelationshipApi.UserCloudStorageKVData> list3 = friendCloudStorageData2.data;
                if (list3 != null) {
                    for (SocialRelationshipApi.UserCloudStorageKVData userCloudStorageKVData : list3) {
                        InterfaceC2194481Auc interfaceC2194481Auc = (InterfaceC2194481Auc) C1909107dp.LIZJ(InterfaceC2194481Auc.class, null);
                        interfaceC2194481Auc.setKey(userCloudStorageKVData.key);
                        interfaceC2194481Auc.setValue(userCloudStorageKVData.value);
                        arrayList2.add(interfaceC2194481Auc);
                    }
                }
                interfaceC2194411AuV.setData(arrayList2);
                arrayList.add(interfaceC2194411AuV);
            }
            interfaceC2194431AuX.setData(arrayList);
        }
        interfaceC2194401AuU.setGetFriendCloudStorageResponse(interfaceC2194431AuX);
        ((CompletionBlock) afS51S1200000_34.l1).onSuccess(interfaceC2194401AuU, "");
        C1C7U.LIZIZ("MinisUserStorageAPIMethodIDL@fec9.handle$getFriendCloudStorageTask$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS51S1200000_34(CompletionBlock completionBlock, CompletionBlock<InterfaceC2194401AuU> completionBlock2, String str, C2194311AuL c2194311AuL) {
        this.$t = c2194311AuL;
        this.l1 = completionBlock;
        this.s0 = completionBlock2;
        this.l2 = str;
    }

    public AfS51S1200000_34(C2197471AzR c2197471AzR, String str, InterfaceC497601wk interfaceC497601wk, long j, int i) {
        this.$t = i;
        this.l1 = c2197471AzR;
        this.s0 = str;
        this.l2 = interfaceC497601wk;
    }
}
