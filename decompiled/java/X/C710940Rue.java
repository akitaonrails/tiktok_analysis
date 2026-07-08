package X;

import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710940Rue extends C09AY implements Function1<C0RF0, C0RDR> {
    public final /* synthetic */ C713370RyZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710940Rue(C713370RyZ c713370RyZ) {
        super(1);
        this.LL = c713370RyZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0RDR invoke(C0RF0 c0rf0) {
        this.LL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        FullFeedVideoViewHolder fullFeedVideoViewHolder = new FullFeedVideoViewHolder(c0rf0);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_CELL_NEW;
        String start = enumC697290RWt.getStart();
        ((HashMap) fullFeedVideoViewHolder.e).put(start, Long.valueOf(jCurrentTimeMillis));
        String end = enumC697290RWt.getEnd();
        ((HashMap) fullFeedVideoViewHolder.e).put(end, Long.valueOf(jCurrentTimeMillis2));
        return fullFeedVideoViewHolder;
    }
}
