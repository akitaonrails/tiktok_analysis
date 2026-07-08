package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597030NbJ extends C09AY implements Function0<String> {
    public final /* synthetic */ C1601460rmC LL;
    public final /* synthetic */ FeedItemList LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597030NbJ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
        super(0);
        this.LL = c1601460rmC;
        this.LLILLJJLI = feedItemList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder("response: ");
        sb.append(this.LL.LIZIZ);
        sb.append(',');
        sb.append(this.LLILLJJLI.status_code);
        sb.append(',');
        sb.append(this.LLILLJJLI.error_code);
        sb.append(',');
        sb.append(this.LLILLJJLI.getRequestId());
        sb.append(',');
        List<Aweme> items = this.LLILLJJLI.getItems();
        if (items != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
            Iterator<Aweme> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        return sb.toString();
    }
}
