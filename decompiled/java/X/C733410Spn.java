package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Spn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733410Spn extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends Aweme>, Unit> {
    public C733410Spn() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends Aweme> c291001Au) {
        Aweme aweme;
        String aid;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        if (c291001Au2 == null) {
            videoShareAssem2.getClass();
        } else {
            VideoShareViewModel videoShareViewModelJp = videoShareAssem2.Jp();
            Aweme aweme2 = (Aweme) c291001Au2.LIZ;
            VideoItemParams item = videoShareViewModelJp.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, aweme.getAid())) {
                    synchronized (aweme) {
                        try {
                            C1251170ifD.LIZ.getClass();
                            if (aweme2 != null) {
                                C1381010m2d.LIZ.getClass();
                                if ((!C1365840leA.LIZ(aweme2)) && C1251170ifD.LJI(aweme2, aweme.getAid(), videoShareViewModelJp.LLILLL)) {
                                    C733650SqB.LIZ.getClass();
                                    C733650SqB.LIZIZ = "like";
                                    videoShareViewModelJp.RQ2();
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
