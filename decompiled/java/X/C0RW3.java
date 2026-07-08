package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoSocialTagCategoryProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RW3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW3 extends C09AY implements Function2<VideoTagContainer, C291001Au<? extends Aweme>, Unit> {
    public final /* synthetic */ List<VideoTagCategoryProtocol> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RW3(List<? extends VideoTagCategoryProtocol> list) {
        super(2);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoTagContainer videoTagContainer, C291001Au<? extends Aweme> c291001Au) {
        Aweme awemeLIZ;
        VideoTagContainer videoTagContainer2 = videoTagContainer;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (awemeLIZ = c291001Au2.LIZ()) != null && !AwemeBizExtKt.getReplaceRecTagByRepost(awemeLIZ)) {
            List<VideoTagCategoryProtocol> list = this.LL;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (VideoTagCategoryProtocol videoTagCategoryProtocol : list) {
                    if (videoTagCategoryProtocol instanceof VideoSocialTagCategoryProtocol) {
                        arrayList.add(videoTagCategoryProtocol);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C0RWO) it2.next()).bf(awemeLIZ);
                }
            }
            videoTagContainer2.Bp().LJ(false);
        }
        return Unit.LIZ;
    }
}
