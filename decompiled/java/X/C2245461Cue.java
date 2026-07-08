package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAb;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245461Cue extends C09AY implements Function0<Long> {
    public C2245461Cue() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((long) AdPitayaReRankClientAb.get().minRunInterval) * 1000);
    }
}
