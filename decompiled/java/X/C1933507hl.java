package X;

import com.bytedance.keva.Keva;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.07hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1933507hl {
    public static void LIZ() {
        k kVar = (k) C0C64.LJIILLIIL().LJJII(h.class, null, "coldboot_satellitemethod", true);
        if (kVar == null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_satellitemethod", new HashSet());
        } else {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("coldboot_satellitemethod", new HashSet((Collection) C08JS.LIZ(kVar.toString(), List.class)));
        }
    }
}
