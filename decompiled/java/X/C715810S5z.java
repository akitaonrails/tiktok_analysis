package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715810S5z extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715810S5z(Aweme aweme) {
        super(0);
        this.LL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        CaptionItemModel next;
        C20703515zt.LIZ.getClass();
        String strLLIIZ = C20703515zt.LIZIZ.LLIIZ();
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null) {
            return null;
        }
        Iterator<CaptionItemModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.languageCode, strLLIIZ)) {
                break;
            }
        }
        CaptionItemModel captionItemModel = next;
        if (captionItemModel != null) {
            return Integer.valueOf(captionItemModel.subId);
        }
        return null;
    }
}
