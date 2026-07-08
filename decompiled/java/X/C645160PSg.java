package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645160PSg {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC660500PvU LIZ(SearchMixFeed searchMixFeed, C0PT4 c0pt4) {
        Object next;
        List list = (List) C659990Puf.LIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ISearchVideoAnchorPriorityProtocol) obj).od0(searchMixFeed, searchMixFeed.getAweme(), c0pt4)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int priority = ((ISearchVideoAnchorPriorityProtocol) next).iY1(searchMixFeed.getAweme()).getPriority();
                do {
                    Object next2 = it2.next();
                    int priority2 = ((ISearchVideoAnchorPriorityProtocol) next2).iY1(searchMixFeed.getAweme()).getPriority();
                    if (priority > priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it2.hasNext());
            }
        }
        ISearchVideoAnchorPriorityProtocol iSearchVideoAnchorPriorityProtocol = (ISearchVideoAnchorPriorityProtocol) next;
        if (iSearchVideoAnchorPriorityProtocol != null) {
            InterfaceC660500PvU anchorNewType = iSearchVideoAnchorPriorityProtocol.iY1(searchMixFeed.getAweme()).getAnchorNewType();
            C659990Puf.LIZIZ().put(anchorNewType, iSearchVideoAnchorPriorityProtocol);
            return anchorNewType;
        }
        return C660610Pvf.LIZ;
    }
}
