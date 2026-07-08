package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341060DYq extends C09AY implements Function1<List<? extends Aweme>, Unit> {
    public C341060DYq() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Aweme> list) {
        List<? extends Aweme> list2 = list;
        IEcSearchFeedCardService iEcSearchFeedCardService = (IEcSearchFeedCardService) PluggableExtentionKt.pluggableSpi$default(IEcSearchFeedCardService.class, false, false, false, 14, null);
        if (iEcSearchFeedCardService != null) {
            iEcSearchFeedCardService.LIZIZ(list2);
        }
        return Unit.LIZ;
    }
}
