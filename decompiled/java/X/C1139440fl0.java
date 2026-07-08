package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.model.Filter;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.model.LiveRoomEvent;
import com.bytedance.android.livesdk.livesetting.gift.GiftEffectObserveLiveRoomEventSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139440fl0 implements Handler.Callback {
    public static final Map<Integer, Set<C1140490fmh>> LL;
    public static final Map<InterfaceC1140620fmu, Map<Integer, List<JSONObject>>> LLILLJJLI;
    public static final BPEAHandler LLILLL;
    public static boolean LLILZ;
    public static long LLILZIL;

    static {
        C1139440fl0 c1139440fl0 = new C1139440fl0();
        LL = new LinkedHashMap();
        LLILLJJLI = new LinkedHashMap();
        LLILLL = new BPEAHandler(Looper.getMainLooper(), c1139440fl0);
    }

    public static void LJ(InterfaceC1140620fmu interfaceC1140620fmu) {
        if (!GiftEffectObserveLiveRoomEventSetting.INSTANCE.enable()) {
            return;
        }
        Map<Integer, Set<C1140490fmh>> map = LL;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it2.next()).getKey()).intValue()));
        }
        LIZ(arrayList, interfaceC1140620fmu);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws JSONException {
        Map<InterfaceC1140620fmu, Map<Integer, List<JSONObject>>> map = LLILLJJLI;
        if (!map.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                JSONArray jSONArray = new JSONArray();
                InterfaceC1140620fmu interfaceC1140620fmu = (InterfaceC1140620fmu) entry.getKey();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", ((Number) entry2.getKey()).intValue());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = ((Iterable) entry2.getValue()).iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next());
                    }
                    jSONObject.put("payload", jSONArray2);
                    jSONArray.put(jSONObject);
                }
                interfaceC1140620fmu.onEvent(jSONArray);
            }
            ((LinkedHashMap) LLILLJJLI).clear();
        }
        if (!(!LL.isEmpty())) {
            LLILZ = false;
            return true;
        }
        C786410Ut5.LJLJJI(1, 100L, LLILLL);
        return true;
    }

    public static void LIZ(List list, InterfaceC1140620fmu interfaceC1140620fmu) {
        Boolean boolValueOf;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Map<Integer, Set<C1140490fmh>> map = LL;
            Set set = (Set) ((LinkedHashMap) map).get(Integer.valueOf(iIntValue));
            if (set != null) {
                C2044407ze.LIZIZ(set, new AwS596S0100000_17(interfaceC1140620fmu, 279));
                boolValueOf = Boolean.valueOf(set.isEmpty());
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                map.remove(Integer.valueOf(iIntValue));
            }
        }
        Map<InterfaceC1140620fmu, Map<Integer, List<JSONObject>>> map2 = LLILLJJLI;
        map2.remove(interfaceC1140620fmu);
        if (!(!LL.isEmpty())) {
            ((LinkedHashMap) map2).clear();
        }
    }

    public static void LIZLLL(List list, C1139610flH c1139610flH) {
        if (!GiftEffectObserveLiveRoomEventSetting.INSTANCE.enable()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiveRoomEvent liveRoomEvent = (LiveRoomEvent) it2.next();
            Map<Integer, Set<C1140490fmh>> map = LL;
            Set<C1140490fmh> linkedHashSet = (Set) ((LinkedHashMap) map).get(Integer.valueOf(liveRoomEvent.eventType));
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            map.put(Integer.valueOf(liveRoomEvent.eventType), linkedHashSet);
            linkedHashSet.add(new C1140490fmh(c1139610flH, liveRoomEvent.filter));
        }
    }

    public static void LIZIZ(int i, long j, Function0 function0) {
        int size;
        boolean z;
        String str;
        String str2;
        C259800zU c259800zU = new C259800zU();
        Set<C1140490fmh> set = (Set) ((LinkedHashMap) LL).get(Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomEvent, eventType=");
        sbLIZ.append(i);
        sbLIZ.append(", id=");
        sbLIZ.append(j);
        sbLIZ.append(", observerCount=");
        if (set != null) {
            size = set.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        Logger.i("LiveRoomEventManager", C2188811AlT.LIZIZ(sbLIZ));
        if (set != null) {
            for (C1140490fmh c1140490fmh : set) {
                Filter filter = c1140490fmh.LIZIZ;
                String str3 = null;
                if (filter != null && (str2 = filter.id) != null && str2.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = !z;
                if (i == 0 && z2) {
                    Filter filter2 = c1140490fmh.LIZIZ;
                    if (filter2 != null) {
                        str = filter2.id;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, String.valueOf(j))) {
                        LIZJ(i, c259800zU, function0, c1140490fmh);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("filter mismatch, expected=");
                        Filter filter3 = c1140490fmh.LIZIZ;
                        if (filter3 != null) {
                            str3 = filter3.id;
                        }
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", got=");
                        sbLIZ2.append(j);
                        Logger.i("LiveRoomEventManager", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    LIZJ(i, c259800zU, function0, c1140490fmh);
                }
            }
        }
        if (!LLILZ) {
            LLILZ = true;
            C786410Ut5.LJLJJI(1, 100L, LLILLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void LIZJ(int i, C259800zU c259800zU, Function0 function0, C1140490fmh c1140490fmh) {
        Map<InterfaceC1140620fmu, Map<Integer, List<JSONObject>>> map = LLILLJJLI;
        Map linkedHashMap = (Map) ((LinkedHashMap) map).get(c1140490fmh.LIZ);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        map.put(c1140490fmh.LIZ, (Map<Integer, List<JSONObject>>) linkedHashMap);
        List arrayList = (List) linkedHashMap.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        linkedHashMap.put(Integer.valueOf(i), arrayList);
        if (c259800zU.element == 0) {
            c259800zU.element = function0.invoke();
        }
        T t = c259800zU.element;
        if (t != 0) {
            arrayList.add(t);
        }
        C470360IcU.LIZ(new C1140800fnC());
    }
}
