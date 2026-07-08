package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardTaskData;
import com.google.gson.n;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.api.GmtRewardClaimResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0czS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033080czS implements InterfaceC1032500cyW {
    public final InterfaceC1032120cxu LIZ;
    public final String LIZIZ;
    public final InterfaceC1032410cyN LIZJ;
    public final Function1<JSONObject, Unit> LIZLLL;
    public final Function2<Boolean, GmtRewardClaimResult, Unit> LJ;

    @Override // X.InterfaceC1032500cyW
    public final void LJ(long j, long j2) {
    }

    @Override // X.InterfaceC1032500cyW
    public final void onPause() {
    }

    @Override // X.InterfaceC1032500cyW
    public final void onStop() {
    }

    @Override // X.InterfaceC1032500cyW
    public final void onComplete() throws JSONException {
        String str;
        Object next;
        String strRequestIdWithCacheConfig;
        GMTBaseModel gMTBaseModel;
        Long adId;
        Long lLJIILIIL;
        GMTBaseModel gMTBaseModel2;
        AdRewardData adRewardData;
        AdRewardTaskData task;
        String adExtraData;
        InterfaceC1033100czU preRequestManager;
        String string;
        List<HashMap<String, Object>> latestPrefetchParams = this.LIZ.getLatestPrefetchParams();
        InterfaceC1033100czU preRequestManager2 = this.LIZ.getPreRequestManager();
        if (latestPrefetchParams == null) {
            latestPrefetchParams = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HashMap<String, Object>> it2 = latestPrefetchParams.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            HashMap<String, Object> next2 = it2.next();
            Object obj = next2.get("task_id");
            if (obj != null && (string = obj.toString()) != null) {
                str = string;
            }
            if (true ^ a0.LJJJIL(str)) {
                int iLIZ = C115800cG.LIZ(0, "completed_times", next2);
                C1033360czu c1033360czu = EnumC1033270czl.Companion;
                EnumC1033270czl enumC1033270czl = EnumC1033270czl.TASK_CENTER;
                int iLIZ2 = C115800cG.LIZ(enumC1033270czl.getValue(), "engagement_type", next2);
                c1033360czu.getClass();
                EnumC1033270czl enumC1033270czlLIZ = C1033360czu.LIZ(iLIZ2);
                if (enumC1033270czlLIZ.isValid()) {
                    enumC1033270czl = enumC1033270czlLIZ;
                }
                arrayList.add(new C1033320czq(iLIZ, str, enumC1033270czl));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            } else {
                next = it3.next();
                if (((C1033320czq) next).LIZJ == EnumC1033270czl.RE_ENGAGEMENT) {
                    break;
                }
            }
        }
        C1033320czq c1033320czq = (C1033320czq) next;
        if (c1033320czq == null || preRequestManager2 == null || (strRequestIdWithCacheConfig = preRequestManager2.requestIdWithCacheConfig(c1033320czq, "commerce")) == null) {
            strRequestIdWithCacheConfig = "";
        }
        if (strRequestIdWithCacheConfig.length() > 0 && (preRequestManager = this.LIZ.getPreRequestManager()) != null) {
            preRequestManager.clearAllWithParams(this.LIZ.getLatestPrefetchParams());
        }
        GmtRewardAdModel rewardAdModel = this.LIZ.getRewardAdModel();
        if (rewardAdModel != null && (gMTBaseModel2 = rewardAdModel.awemeRawAd) != null && (adRewardData = gMTBaseModel2.adRewardData) != null && (task = adRewardData.getTask()) != null && (adExtraData = task.getAdExtraData()) != null) {
            str = adExtraData;
        }
        String strLJ = this.LIZ.getHostUtils().LJ(this.LIZ.getHostModel());
        long jLongValue = 0;
        long jLongValue2 = (strLJ == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLJ)) == null) ? 0L : lLJIILIIL.longValue();
        GmtRewardAdModel rewardAdModel2 = this.LIZ.getRewardAdModel();
        if (rewardAdModel2 != null && (gMTBaseModel = rewardAdModel2.awemeRawAd) != null && (adId = gMTBaseModel.getAdId()) != null) {
            jLongValue = adId.longValue();
        }
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZ;
        C1033180czc c1033180czc = new C1033180czc(interfaceC1032120cxu);
        if (interfaceC1032120cxu != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "reward_ad");
            C1032900czA.LIZ(interfaceC1032120cxu, "reward_coin_claim_start", jSONObject);
        }
        AwS81S0100100_16 awS81S0100100_16 = new AwS81S0100100_16(SystemClock.elapsedRealtime(), this, 0);
        n nVar = new n();
        nVar.LJJIIJ("next_req_id", strRequestIdWithCacheConfig);
        nVar.LJJIII(Long.valueOf(jLongValue2), "cid");
        nVar.LJJIII(Long.valueOf(jLongValue), "ad_id");
        interfaceC1032120cxu.request(EnumC1033600d0I.POST, "/tiktok/v1/ad/incentive/action/report/", null, C2097608Jq.LJIIJ(new Pair("ad_extra_data", str), new Pair("extra", nVar.toString())), new AwS382S0200000_16(c1033180czc, awS81S0100100_16, 122));
    }

    public C1033080czS(C1032800cz0 c1032800cz0, String str, InterfaceC1032410cyN interfaceC1032410cyN, AwS595S0100000_16 awS595S0100000_16, AwS452S0200000_16 awS452S0200000_16) {
        this.LIZ = c1032800cz0;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1032410cyN;
        this.LIZLLL = awS595S0100000_16;
        this.LJ = awS452S0200000_16;
    }
}
