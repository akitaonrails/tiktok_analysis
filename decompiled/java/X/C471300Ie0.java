package X;

import com.bytedance.android.livesdk.chatroom.utils.LastLiveActionInfo;
import com.bytedance.android.livesdk.livesetting.other.EnableLiveEcRecordsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEcRecordFromRoomType;
import com.bytedance.android.livesdk.livesetting.other.LiveEcRecordsMaxCountSetting;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ie0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471300Ie0 implements InterfaceC486670J6r {
    public static final C471070Idd LJ = new Object() { // from class: X.0Idd
    };
    public static final C01GW<C471300Ie0> LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C471320Ie2());
    public final LinkedList<Long> LIZ = new LinkedList<>();
    public final HashMap<Long, LastLiveActionInfo> LIZIZ = new HashMap<>();
    public final LinkedList<Long> LIZJ = new LinkedList<>();
    public final HashMap<Long, LastLiveActionInfo> LIZLLL = new HashMap<>();

    @Override // X.InterfaceC486670J6r
    public final String LIZJ() {
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, LJIIIIZZ(this.LIZJ, this.LIZLLL));
    }

    @Override // X.InterfaceC486670J6r
    public final String LIZLLL() {
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, LJIIIIZZ(this.LIZ, this.LIZIZ));
    }

    public C471300Ie0() {
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).observeAccountChange(new C0J7I() { // from class: X.0Ie1
            @Override // X.C0J7I
            public final void LIZ() {
                C471300Ie0 c471300Ie0 = this.LIZ;
                c471300Ie0.LIZ.clear();
                c471300Ie0.LIZIZ.clear();
                c471300Ie0.LIZJ.clear();
                c471300Ie0.LIZLLL.clear();
            }
        });
    }

    public static LastLiveActionInfo LJI(Map map) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        Long lLJIILIIL4;
        Long lLJIILIIL5;
        if (map != null) {
            LastLiveActionInfo lastLiveActionInfo = new LastLiveActionInfo(0L, "", null, null, null, null, null);
            String str = (String) map.get("room_id");
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                lastLiveActionInfo.roomId = lLJIILIIL.longValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) map.get("enter_from_merge"));
                sbLIZ.append('#');
                sbLIZ.append((String) map.get("enter_method"));
                sbLIZ.append('#');
                sbLIZ.append((String) map.get("action_type"));
                lastLiveActionInfo.entrance = C2188811AlT.LIZIZ(sbLIZ);
                String str2 = (String) map.get("anchor_id");
                if (str2 != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(str2)) != null) {
                    lastLiveActionInfo.authorId = Long.valueOf(lLJIILIIL5.longValue());
                }
                String str3 = (String) map.get("duration");
                if (str3 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(str3)) != null) {
                    lastLiveActionInfo.duration = Long.valueOf(lLJIILIIL4.longValue());
                }
                String str4 = (String) map.get("is_ecom");
                if (str4 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str4)) != null) {
                    lastLiveActionInfo.isEcom = Long.valueOf(lLJIILIIL3.longValue());
                }
                String str5 = (String) map.get("current_product_id");
                if (str5 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str5)) != null) {
                    lastLiveActionInfo.currentProductId = Long.valueOf(lLJIILIIL2.longValue());
                }
                return lastLiveActionInfo;
            }
            return null;
        }
        return null;
    }

    public static final String LJII(EnterRoomConfig enterRoomConfig) {
        String oecInitDataString;
        boolean z;
        boolean z2;
        String str;
        HashMap map = new HashMap();
        if (enterRoomConfig != null) {
            map.put("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId));
            String str2 = enterRoomConfig.mRoomsData.userId;
            if (str2 != null) {
                map.put("anchor_id", str2);
            }
            String str3 = enterRoomConfig.mRoomsData.enterFromMerge;
            if (str3 != null) {
                map.put("enter_from_merge", str3);
            }
            String str4 = enterRoomConfig.mRoomsData.enterMethod;
            if (str4 != null) {
                map.put("enter_method", str4);
            }
            String str5 = enterRoomConfig.mRoomsData.actionType;
            if (str5 != null) {
                map.put("action_type", str5);
            }
            Boolean bool = enterRoomConfig.mRoomsData.hasCommerceGoods;
            if (bool != null) {
                if (bool.booleanValue()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_ecom", str);
            }
            CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
            if (commerceStruct != null && (oecInitDataString = commerceStruct.getOecInitDataString()) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(oecInitDataString);
                    String strOptString = jSONObject.optString("pop_product_id");
                    boolean z3 = true;
                    if (strOptString.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        String strOptString2 = jSONObject.optString("pop_product");
                        if (strOptString2.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            strOptString = new JSONObject(strOptString2).optString("product_id");
                        }
                    }
                    if (strOptString.length() <= 0) {
                        z3 = false;
                    }
                    if (z3) {
                        map.put("current_product_id", strOptString);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        LastLiveActionInfo lastLiveActionInfoLJI = LJI(map);
        if (lastLiveActionInfoLJI != null) {
            return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, lastLiveActionInfoLJI);
        }
        return "";
    }

    @Override // X.InterfaceC486670J6r
    public final void LIZIZ(Map<String, String> map) {
        LastLiveActionInfo lastLiveActionInfoLJI;
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue() && (lastLiveActionInfoLJI = LJI(map)) != null) {
            LJFF(lastLiveActionInfoLJI, this.LIZ, this.LIZIZ);
        }
    }

    @Override // X.InterfaceC486670J6r
    public final void LJ(Map<String, String> map) {
        LastLiveActionInfo lastLiveActionInfoLJI;
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue() && (lastLiveActionInfoLJI = LJI(map)) != null) {
            LJFF(lastLiveActionInfoLJI, this.LIZJ, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC486670J6r
    public final void LIZ(long j, long j2) {
        LastLiveActionInfo lastLiveActionInfo;
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue() && j > 0 && (lastLiveActionInfo = this.LIZIZ.get(Long.valueOf(j))) != null) {
            lastLiveActionInfo.previewDuration = Long.valueOf(j2);
        }
    }

    public final synchronized List<LastLiveActionInfo> LJIIIIZZ(LinkedList<Long> linkedList, HashMap<Long, LastLiveActionInfo> map) {
        LinkedList linkedList2;
        linkedList2 = new LinkedList();
        Iterator<Long> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            LastLiveActionInfo lastLiveActionInfo = map.get(Long.valueOf(it2.next().longValue()));
            if (lastLiveActionInfo != null) {
                linkedList2.add(lastLiveActionInfo);
            }
        }
        return linkedList2;
    }

    public final synchronized void LJFF(LastLiveActionInfo lastLiveActionInfo, LinkedList<Long> linkedList, HashMap<Long, LastLiveActionInfo> map) {
        Long l;
        long j = lastLiveActionInfo.roomId;
        if (j <= 0) {
            return;
        }
        if (LiveEcRecordFromRoomType.INSTANCE.getValue() == 1 && ((l = lastLiveActionInfo.isEcom) == null || l.longValue() != 1)) {
            return;
        }
        if (linkedList.contains(Long.valueOf(j))) {
            linkedList.remove(Long.valueOf(j));
            map.remove(Long.valueOf(j));
        }
        if (!linkedList.isEmpty() && linkedList.size() >= LiveEcRecordsMaxCountSetting.INSTANCE.getValue()) {
            map.remove(Long.valueOf(linkedList.removeFirst().longValue()));
        }
        linkedList.add(Long.valueOf(j));
        map.put(Long.valueOf(j), lastLiveActionInfo);
    }
}
