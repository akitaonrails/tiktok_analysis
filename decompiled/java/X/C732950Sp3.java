package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732950Sp3 extends C09AY implements Function2<VideoCommentAssem, C291001Au<? extends Integer>, Unit> {
    public C732950Sp3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, C291001Au<? extends Integer> c291001Au) {
        VideoCommentAssem videoCommentAssem2 = videoCommentAssem;
        if (!C300900Bqq.LIZ() || c291001Au != null) {
            VideoCommentVM videoCommentVMJp = videoCommentAssem2.Jp();
            videoCommentVMJp.getClass();
            videoCommentVMJp.withState(new C732960Sp4(videoCommentVMJp));
            C732910Soz c732910Soz = videoCommentAssem2.LLLILZJ;
            if (c732910Soz != null) {
                c732910Soz.LIZLLL = false;
            }
        }
        return Unit.LIZ;
    }
}
