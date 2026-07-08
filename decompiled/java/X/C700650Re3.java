package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Re3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700650Re3 extends C09AY implements Function0<Map<String, ? extends FeedComponentsData>> {
    public C700650Re3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends FeedComponentsData> invoke() {
        try {
            return C700590Rdx.LJFF((FeedMultiSceneComponentsData) C12862051o.LIZ.getValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C700590Rdx.LIZLLL(6, "all_scene");
            return null;
        }
    }
}
