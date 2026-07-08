package X;

import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703790Rj7 implements InterfaceC702640RhG {
    public final Map<String, RuleHitState> LIZ = new LinkedHashMap();
    public final /* synthetic */ VideoFeedMultiTagAssem LIZIZ;

    @Override // X.InterfaceC702640RhG
    public final void init() {
        ((LinkedHashMap) this.LIZ).clear();
    }

    public C703790Rj7(VideoFeedMultiTagAssem videoFeedMultiTagAssem) {
        this.LIZIZ = videoFeedMultiTagAssem;
    }

    @Override // X.InterfaceC702640RhG
    public final String LIZIZ(String str) {
        RuleHitState ruleHitState = (RuleHitState) ((LinkedHashMap) this.LIZ).get(str);
        if (ruleHitState != null) {
            return ruleHitState.ruleStrategy;
        }
        return null;
    }

    @Override // X.InterfaceC702640RhG
    public final boolean LIZ(Aweme aweme, String str) {
        C20653815rs c20653815rs = C20653815rs.LIZ;
        String aid = aweme.getAid();
        String requestId = aweme.getRequestId();
        c20653815rs.getClass();
        RuleHitState ruleHitStateLIZ = C20653815rs.LIZ(aid, str, requestId);
        if (C700340RdY.LIZ(ruleHitStateLIZ)) {
            return true;
        }
        this.LIZ.put(str, ruleHitStateLIZ);
        C699180Rbg c699180Rbg = C699180Rbg.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this.LIZIZ, 164);
        c699180Rbg.getClass();
        C699180Rbg.LIZ(awS555S0100000_11, str, ruleHitStateLIZ);
        return false;
    }
}
