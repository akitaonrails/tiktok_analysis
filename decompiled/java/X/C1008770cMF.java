package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008770cMF {
    public static final void LIZ(List<Aweme> list) {
        if (list == null) {
            return;
        }
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(it2.next());
            if (previewData != null && previewData.inPublishing) {
                it2.remove();
            }
        }
    }
}
