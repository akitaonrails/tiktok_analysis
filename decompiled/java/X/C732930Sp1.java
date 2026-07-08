package X;

import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732930Sp1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoCommentAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732930Sp1(VideoCommentAssem videoCommentAssem, View view) {
        super(0);
        this.LL = videoCommentAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CommentService commentService;
        EnumC733380Spk enumC733380SpkLJJI;
        VideoCommentAssem videoCommentAssem = this.LL;
        C724270Sb3 c724270Sb3 = videoCommentAssem.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (commentService = (CommentService) serviceManager.getService(CommentService.class)) != null && (enumC733380SpkLJJI = commentService.LJJI(aweme)) != null && enumC733380SpkLJJI == EnumC733380Spk.ALLOW_COMMENT) {
            C724270Sb3 c724270Sb32 = videoCommentAssem.LLJI;
            DataCenter dataCenter = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(95, "video_comment_preload");
            }
        }
        this.LL.Qp(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
