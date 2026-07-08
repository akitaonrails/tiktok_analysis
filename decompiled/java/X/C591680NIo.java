package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591680NIo extends C09AY implements Function0<Keva> {
    public C591680NIo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        Keva repo = Keva.getRepo("NujPerformanceTrackerV2");
        NujPerformanceTrackerV2.LIZIZ = true;
        return repo;
    }
}
