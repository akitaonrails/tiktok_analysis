package X;

import com.bytedance.android.livesdk.livesetting.message.LiveSignalingFixConcurrentModify;
import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveSinglingSystemCacheSizeSetting;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkLiveStatusData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486370J5n extends C0J66<C486380J5o, DownlinkLiveStatusData> {
    public final int LJ;

    @Override // X.C0J66
    public final boolean LJIIIZ() {
        return true;
    }

    public C486370J5n() {
        super(new C486380J5o(new ConcurrentHashMap(), null, null, 62), "live_status", null);
        this.LJ = LiveSinglingSystemCacheSizeSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J66
    public final List<UplinkModel<UplinkLiveStatusData>> LJ() {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = new ArrayList();
        Map<String, Set<String>> map = ((C486380J5o) this.LIZIZ).LIZ;
        if (map != null) {
            for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                if (LiveSignalingFixConcurrentModify.INSTANCE.getValue()) {
                    synchronized (value) {
                        try {
                            linkedHashSet = new LinkedHashSet(value);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    value = linkedHashSet;
                }
                arrayList.add(C0J66.LIZIZ(this, "live_status", key, new UplinkLiveStatusData(value, null)));
            }
        }
        return arrayList;
    }

    @Override // X.C0J66
    public final Class<DownlinkLiveStatusData> LJIIIIZZ() {
        return DownlinkLiveStatusData.class;
    }

    @Override // X.C0J66
    public final boolean LIZJ(UplinkModel<?> uplinkModel) {
        return LiveSignalingSystemSetting.INSTANCE.needResponseScenes().contains(uplinkModel.subType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J66
    public final List LJFF(C486380J5o c486380J5o) {
        Set<String> linkedHashSet;
        Set<String> linkedHashSet2;
        C486380J5o c486380J5o2 = c486380J5o;
        String str = c486380J5o2.LIZJ;
        if (str == null) {
            return null;
        }
        boolean zContains = LiveSignalingSystemSetting.INSTANCE.needResponseScenes().contains(str);
        if (Intrinsics.LJFF(str, "fyp_skylight_refresh")) {
            C486380J5o c486380J5o3 = (C486380J5o) this.LIZIZ;
            if (c486380J5o3.LIZIZ) {
                return null;
            }
            c486380J5o3.LIZIZ = true;
        }
        if (c486380J5o2.LJFF) {
            Set<String> set = c486380J5o2.LIZLLL;
            if (set != null) {
                linkedHashSet2 = C13LP.LLIIIZ(set);
            } else {
                linkedHashSet2 = new LinkedHashSet<>();
            }
            Map<String, Set<String>> map = ((C486380J5o) this.LIZIZ).LIZ;
            if (map != null) {
                map.put(str, linkedHashSet2);
            }
            UplinkModel uplinkModelLIZIZ = C0J66.LIZIZ(this, "live_status", str, new UplinkLiveStatusData(linkedHashSet2, null));
            T t = uplinkModelLIZIZ.data;
            if (t != 0) {
                t.setNeedResp(zContains);
            }
            return Collections.singletonList(uplinkModelLIZIZ);
        }
        Map<String, Set<String>> map2 = ((C486380J5o) this.LIZIZ).LIZ;
        if (map2 == null || (linkedHashSet = map2.get(str)) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        if (LiveSignalingFixConcurrentModify.INSTANCE.getValue()) {
            synchronized (linkedHashSet) {
                try {
                    Set<String> set2 = c486380J5o2.LIZLLL;
                    if (set2 != null) {
                        linkedHashSet.addAll(set2);
                    }
                    Set<String> set3 = c486380J5o2.LJ;
                    if (set3 != null) {
                        linkedHashSet.removeAll(set3);
                    }
                    Iterator<String> it2 = linkedHashSet.iterator();
                    while (linkedHashSet.size() > this.LJ && it2.hasNext()) {
                        it2.next();
                        it2.remove();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            Set<String> set4 = c486380J5o2.LIZLLL;
            if (set4 != null) {
                linkedHashSet.addAll(set4);
            }
            Set<String> set5 = c486380J5o2.LJ;
            if (set5 != null) {
                linkedHashSet.removeAll(set5);
            }
            Iterator<String> it3 = linkedHashSet.iterator();
            while (linkedHashSet.size() > this.LJ && it3.hasNext()) {
                it3.next();
                it3.remove();
            }
        }
        Map<String, Set<String>> map3 = ((C486380J5o) this.LIZIZ).LIZ;
        if (map3 != null) {
            map3.put(str, linkedHashSet);
        }
        UplinkModel uplinkModelLIZIZ2 = C0J66.LIZIZ(this, "live_status", str, new UplinkLiveStatusData(linkedHashSet, null));
        T t2 = uplinkModelLIZIZ2.data;
        if (t2 != 0) {
            t2.setNeedResp(zContains);
        }
        return Collections.singletonList(uplinkModelLIZIZ2);
    }
}
