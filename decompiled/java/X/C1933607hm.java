package X;

import com.bytedance.keva.Keva;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.07hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1933607hm {
    public static List<String> LIZ;

    public static List<String> LIZ() {
        if (LIZ == null) {
            LIZ = new ArrayList(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("coldboot_taskskiplist", new HashSet()));
        }
        return LIZ;
    }

    public static void LIZIZ() {
        k kVar = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "coldboot_taskskiplist", true);
        if (kVar == null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_taskskiplist", new HashSet());
        } else {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_taskskiplist", new HashSet((Collection) C08JS.LIZ(kVar.toString(), List.class)));
        }
    }
}
