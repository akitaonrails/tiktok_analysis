package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cardinsert.M2CardUplinkAllowlistExp;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardInsertRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertCardTypeFreqFixConfig;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardSceneInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20550515bD implements InterfaceC1587720rQ2 {
    public final CopyOnWriteArrayList<CardTypeRequest> LIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<CardTypeRequest> LIZIZ = new CopyOnWriteArrayList<>();
    public volatile int LIZJ = 1;
    public final ConcurrentHashMap<String, Integer> LIZLLL = new ConcurrentHashMap<>();

    public abstract FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo);

    public abstract void LJI(InterfaceC20550615bE interfaceC20550615bE);

    @Override // X.InterfaceC1587720rQ2
    public final String LIZLLL() {
        String strLJIILL = "";
        if (this.LIZIZ.isEmpty()) {
            return "";
        }
        if (C2522609ua.LIZ) {
            for (CardTypeRequest cardTypeRequest : this.LIZIZ) {
                if (M2CardUplinkAllowlistExp.LIZ.list.contains(String.valueOf(cardTypeRequest.cardType))) {
                    Pair<C20554115bn, Map<String, Object>> pairLJIIIZ = C20554315bp.LIZIZ.LJIIIZ(null);
                    if (pairLJIIIZ.getFirst().LIZ == 0) {
                        String str = cardTypeRequest.bizInfo;
                        String str2 = a0.LJJJIL(str) ^ true ? str : null;
                        if (str2 == null) {
                            str2 = "{}";
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            jSONObject.put("conditions", new JSONObject(C20484080s.LIZJ(pairLJIIIZ.getSecond())));
                            cardTypeRequest.bizInfo = C786410Ut5.J3(jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Merge bizInfo failed: ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                }
            }
        }
        try {
            strLJIILL = C7740030o.LIZ().getGson().LJIILL(new CardInsertRequest(this.LIZJ, this.LIZIZ));
            return strLJIILL;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return strLJIILL;
        }
    }

    public final FeedCardInsertData LJFF() {
        Map<Integer, CardShowInfo> map;
        ArrayList arrayList = new ArrayList();
        FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
        FeedCardType feedCardTypeLJ = LJ(feedCardInsertConfigLIZ != null ? feedCardInsertConfigLIZ.sceneInfo : null);
        List<Integer> list = feedCardTypeLJ != null ? feedCardTypeLJ.cards : null;
        if (feedCardInsertConfigLIZ != null && (map = feedCardInsertConfigLIZ.cardInfo) != null) {
            for (Map.Entry<Integer, CardShowInfo> entry : map.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                CardShowInfo value = entry.getValue();
                if (list != null && list.contains(Integer.valueOf(iIntValue))) {
                    arrayList.add(value);
                }
            }
        }
        FeedCardInsertData feedCardInsertData = new FeedCardInsertData();
        feedCardInsertData.showInfoList = arrayList;
        feedCardInsertData.LIZ = this.LIZJ;
        return feedCardInsertData;
    }

    @Override // X.InterfaceC1587720rQ2
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1587720rQ2
    public final void LIZJ(final InterfaceC20550615bE interfaceC20550615bE) {
        List<Aweme> awemeList;
        String logId;
        if (interfaceC20550615bE != null) {
            awemeList = interfaceC20550615bE.getAwemeList();
        } else {
            awemeList = null;
        }
        if (awemeList != null) {
            if (interfaceC20550615bE != null && (logId = interfaceC20550615bE.getLogId()) != null) {
                this.LIZLLL.put(logId, Integer.valueOf(this.LIZJ));
            }
            this.LIZJ++;
        }
        this.LIZIZ.clear();
        if (((Boolean) C266050Abj.LIZ.getValue()).booleanValue()) {
            C0S78.LIZJ(new AwS425S0200000_24(this, interfaceC20550615bE, 48), true);
        } else {
            C15O7.LIZIZ(new Callable() { // from class: X.0rmY
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedCardInsertExecutor@3d0b.increaseRequestCount$3");
                    this.LL.LJI(interfaceC20550615bE);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedCardInsertExecutor@3d0b.increaseRequestCount$3");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
    }

    public static boolean LJII(C0TRR c0trr, int i) {
        if (c0trr == null || c0trr.LIZIZ() != 0) {
            return false;
        }
        if (!((FeedCardInsertCardTypeFreqFixConfig) C20550415bC.LIZIZ.getValue()).enable) {
            return false;
        }
        return !((FeedCardInsertCardTypeFreqFixConfig) r1.getValue()).whitelist.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    @Override // X.InterfaceC1587720rQ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZIZ(com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest r10, X.C0TRR r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20550515bD.LIZIZ(com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest, X.0TRR):void");
    }
}
