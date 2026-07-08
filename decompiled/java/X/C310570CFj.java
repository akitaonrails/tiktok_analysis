package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310570CFj extends C09AY implements Function0<Map<String, ? extends Float>> {
    public C310570CFj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Float>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Float> invoke() {
        if (!C1253204vK.LIZ()) {
            String str = HybridKitConfigTask.LL;
            return C1533280q0E.LJFF();
        }
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("keyForDeviceScoreInSpark", "");
        if (string != null && string.length() != 0) {
            return GsonProtectorUtils.fromJson(C08JS.LIZIZ(), string, new TypeToken<Map<String, ? extends Float>>() { // from class: X.00WA
            }.getType());
        }
        String str2 = HybridKitConfigTask.LL;
        Map<String, ? extends Float> mapLJFF = C1533280q0E.LJFF();
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("keyForDeviceScoreInSpark", C08JS.LIZLLL(mapLJFF));
        return mapLJFF;
    }
}
