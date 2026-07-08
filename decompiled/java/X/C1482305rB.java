package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.05rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1482305rB {
    public static final Set<String> LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("app_launch_cpu_monitor_list", new HashSet());

    public static void LIZ() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), (k) C0C64.LJIILLIIL().LJJII(h.class, null, "app_launch_cpu_monitor_list", true), ArrayList.class);
        if (arrayList != null && arrayList.size() > 0) {
            hashSet.addAll(arrayList);
        }
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("app_launch_cpu_monitor_list", hashSet);
    }
}
