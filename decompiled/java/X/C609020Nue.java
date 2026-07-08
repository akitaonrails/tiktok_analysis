package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609020Nue extends C09AY implements Function2<VideoShareAssem, C608750NuD, Unit> {
    public C609020Nue() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C608750NuD c608750NuD) {
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C608750NuD c608750NuD2 = c608750NuD;
        if (c608750NuD2 != null && Intrinsics.LJFF(c608750NuD2.LIZIZ, ((VideoItemParams) C631370Opb.LIZ(videoShareAssem2)).getAweme().getAid())) {
            C1374870lsj.LIZ.getClass();
            C1391870mK9<String> c1391870mK9 = C1374870lsj.LJ;
            String aid = ((VideoItemParams) C631370Opb.LIZ(videoShareAssem2)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            c1391870mK9.LIZ(aid);
        }
        return Unit.LIZ;
    }
}
