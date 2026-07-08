package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Snf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732090Snf extends C09AY implements Function2<VideoCommentAssem, C291001Au<? extends Integer>, Unit> {
    public C732090Snf() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, C291001Au<? extends Integer> c291001Au) {
        View view;
        VideoCommentAssem videoCommentAssem2 = videoCommentAssem;
        if (c291001Au != null) {
            videoCommentAssem2.getClass();
            VideoCommentVM videoCommentVMJp = videoCommentAssem2.Jp();
            videoCommentVMJp.getClass();
            videoCommentVMJp.setState(new C733120SpK(videoCommentVMJp));
            C732050Snb c732050Snb = videoCommentAssem2.LLLILZ;
            if (c732050Snb != null && C20586815h4.LIZ() && (view = c732050Snb.LIZIZ) != null) {
                HandlerHook.viewPostDelay(view, new RunnableC732060Snc(c732050Snb), C300480BqA.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
