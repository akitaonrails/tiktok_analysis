package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133970fcB implements InterfaceC1100860ekm {
    public final DataChannel LIZ;
    public InterfaceC1125480fOU LIZIZ;
    public Map<String, String> LIZJ;

    public final void LIZ(Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedHashMap();
        }
        Map<String, String> map2 = this.LIZJ;
        if (map2 != null) {
            map2.putAll(map);
        }
    }

    public C1133970fcB(Context context, DataChannel dataChannel) {
        C204577153f c204577153f;
        IGiftService iGiftService;
        this.LIZ = dataChannel;
        if (this.LIZIZ == null && (iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class)) != null) {
            this.LIZIZ = iGiftService.createGiftDebugService(context, dataChannel);
        }
        if (((Keva) C1133980fcC.LIZ.getValue()).getBoolean("gift_queue_debug_enabled", false)) {
            synchronized (C1133980fcC.LJ) {
                try {
                    int i = C1133980fcC.LIZLLL + 1;
                    C1133980fcC.LIZLLL = i;
                    if (i == 1 && C1133980fcC.LIZIZ == null) {
                        C1133980fcC.LIZJ.set(0L);
                        try {
                            c204577153f = new C204577153f();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c204577153f = null;
                        }
                        C1133980fcC.LIZIZ = c204577153f;
                        if (c204577153f != null) {
                            try {
                                c204577153f.LJJJI();
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C1133980fcC.LIZIZ = null;
                                C1133980fcC.LIZLLL = 0;
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZJ = new LinkedHashMap();
    }

    public final void LIZIZ(GiftListResult giftListResult, int i, String str, String str2) {
        boolean z;
        String string;
        int i2;
        String str3;
        String str4;
        int size;
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2) && Intrinsics.LJFF(str, str2)) {
            z = true;
        } else {
            z = false;
        }
        AtomicReference<Map<String, String>> atomicReference = C2079808Cu.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (giftListResult != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            linkedHashMap.put("GiftListSourceCode", String.valueOf(i));
            String strLIZIZ = C2079808Cu.LIZLLL.get(Integer.valueOf(i));
            if (strLIZIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UNKNOWN(");
                sbLIZ.append(i);
                sbLIZ.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            linkedHashMap.put("GiftListSource", strLIZIZ);
            Object obj = linkedHashMap.get("GiftListSource");
            if (obj == null) {
                obj = "-";
            }
            linkedHashMap.put("GiftListListenerSource", obj);
            linkedHashMap.put("GiftListDurationMs", "-");
            linkedHashMap.put("GiftListResponseTime", new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(jCurrentTimeMillis)));
            List<GiftPage> list = giftListResult.giftPages;
            if (list == null || (string = Integer.valueOf(list.size()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("GiftListPageCount", string);
            List<GiftPage> list2 = giftListResult.giftPages;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<GiftPage> it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    List<Gift> list3 = it2.next().gifts;
                    if (list3 != null) {
                        size = list3.size();
                    } else {
                        size = 0;
                    }
                    i2 += size;
                }
            } else {
                i2 = 0;
            }
            linkedHashMap.put("GiftListTotalGifts", String.valueOf(i2));
            linkedHashMap.put("GiftListRefreshStatus", String.valueOf(giftListResult.refreshStatus));
            linkedHashMap.put("GiftListIsFullData", String.valueOf(giftListResult.isFullGiftData));
            if (str2 == null || !(!a0.LJJJIL(str2))) {
                str3 = "-";
            } else {
                str3 = str2;
            }
            linkedHashMap.put("GiftListLogId", str3);
            if (str == null || !(!a0.LJJJIL(str))) {
                str = "-";
            }
            linkedHashMap.put("GiftPanelRequestId", str);
            String str5 = giftListResult.realtimeServerPassthrough;
            if (str5 == null || !(!a0.LJJJIL(str5))) {
                str5 = "-";
            }
            linkedHashMap.put("GiftListRealtimePassthrough", str5);
            String str6 = giftListResult.realtimeServerPassthrough;
            if (str6 == null || !(!a0.LJJJIL(str6))) {
                str6 = "-";
            }
            linkedHashMap.put("GiftListRealtimeFromResponse", str6);
            String str7 = giftListResult.strategyToken;
            if (str7 == null || !(!a0.LJJJIL(str7))) {
                str7 = "-";
            }
            linkedHashMap.put("GiftListStrategyToken", str7);
            GiftsInfo giftsInfo = giftListResult.giftsInfo;
            if (giftsInfo == null || (str4 = giftsInfo.strategyContext) == null || !(!a0.LJJJIL(str4))) {
                str4 = "-";
            }
            linkedHashMap.put("GiftListStrategyContext", str4);
            String str8 = giftListResult.responseHash;
            if (str8 == null || !(!a0.LJJJIL(str8))) {
                str8 = "-";
            }
            linkedHashMap.put("GiftListResponseHash", str8);
            linkedHashMap.put("GiftListRoomId", "-");
            linkedHashMap.put("GiftListRequesterRole", "-");
            linkedHashMap.put("GiftListTrigger", "-");
        }
        AtomicReference<Map<String, String>> atomicReference2 = C2079808Cu.LIZ;
        atomicReference2.set(linkedHashMap);
        if (str2 != null && (!a0.LJJJIL(str2)) && str2.length() != 0) {
            synchronized (C2079808Cu.LIZIZ) {
                try {
                    C2079808Cu.LIZJ.put(str2, linkedHashMap);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        AtomicReference<Map<String, String>> atomicReference3 = C2079808Cu.LIZ;
        Map<String, String> map = atomicReference2.get();
        if (map.isEmpty() || !z) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedHashMap();
        }
        Map<String, String> map2 = this.LIZJ;
        if (map2 != null) {
            map2.putAll(map);
        }
    }
}
