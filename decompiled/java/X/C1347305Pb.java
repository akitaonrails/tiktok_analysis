package X;

import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1347305Pb extends C09AY implements Function1<SessionUnconsumptionItem, Boolean> {
    public final /* synthetic */ Set<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347305Pb(Set<String> set) {
        super(1);
        this.LL = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SessionUnconsumptionItem sessionUnconsumptionItem) {
        return Boolean.valueOf(this.LL.contains(sessionUnconsumptionItem.aid));
    }
}
