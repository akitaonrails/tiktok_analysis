package X;

import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0COy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313060COy extends C09AY implements Function0<InboxNoticeCountStrategyExperiment.MetaData> {
    public C313060COy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment$MetaData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InboxNoticeCountStrategyExperiment.MetaData invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InboxNoticeCountStrategyExperiment.MetaData metaData = InboxNoticeCountStrategyExperiment.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(InboxNoticeCountStrategyExperiment.MetaData.class, metaData, "inbox_notice_count_strategy", true);
        return LJJII != 0 ? LJJII : metaData;
    }
}
