package X;

import com.ss.android.ugc.aweme.feed.controller.experiment.MobRefactorSupportScene;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581340Mr6 {
    public final C20518082a LIZ = new LinkedHashMap<String, List<Long>>() { // from class: X.082a
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    };
    public long LIZIZ = -1;
    public Map<String, Long> LIZJ = new HashMap();
    public InterfaceC582690MtH LIZLLL;

    public static boolean LIZ(String str) {
        List list;
        List list2;
        C01GW c01gw = C582160MsQ.LIZ;
        MobRefactorSupportScene mobRefactorSupportScene = (MobRefactorSupportScene) c01gw.getValue();
        if (mobRefactorSupportScene == null || (list = mobRefactorSupportScene.videoPlayTimeScene) == null) {
            list = C13BV.INSTANCE;
        }
        if (!list.contains(str)) {
            MobRefactorSupportScene mobRefactorSupportScene2 = (MobRefactorSupportScene) c01gw.getValue();
            if (mobRefactorSupportScene2 == null || (list2 = mobRefactorSupportScene2.videoPlayTimeScene) == null) {
                list2 = C13BV.INSTANCE;
            }
            if (!list2.contains("all_scene")) {
                return false;
            }
            return true;
        }
        return true;
    }
}
