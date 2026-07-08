package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717710SDh extends C09AY implements Function2<VideoAuthorInfoRelationAssem, C291001Au<? extends Aweme>, Unit> {
    public C717710SDh() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C291001Au<? extends Aweme> c291001Au) {
        Aweme aweme;
        String aid;
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (aweme = (Aweme) c291001Au2.LIZ) != null) {
            String aid2 = aweme.getAid();
            Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)).getAweme();
            Object obj = null;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                videoAuthorInfoRelationAssem2.LLLJIL = null;
                C724270Sb3 c724270Sb3 = videoAuthorInfoRelationAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                Aweme aweme3 = ((VideoItemParams) obj).getAweme();
                if (aweme3 != null) {
                    aweme3.setInteractionTagInfo(aweme.getInteractionTagInfo());
                    videoAuthorInfoRelationAssem2.lq(aweme3);
                }
            }
        }
        return Unit.LIZ;
    }
}
