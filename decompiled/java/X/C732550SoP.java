package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732550SoP extends C09AY implements Function2<VideoShareAssem, C581630MrZ, Unit> {
    public C732550SoP() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C581630MrZ c581630MrZ) {
        String aid;
        Aweme aweme;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C581630MrZ c581630MrZ2 = c581630MrZ;
        if (c581630MrZ2 == null) {
            videoShareAssem2.getClass();
        } else {
            VideoShareViewModel videoShareViewModelJp = videoShareAssem2.Jp();
            videoShareViewModelJp.getClass();
            if (c581630MrZ2.LIZ == 7) {
                String str = c581630MrZ2.LIZIZ;
                VideoItemParams item = videoShareViewModelJp.getItem();
                Aweme aweme2 = null;
                if (item != null && (aweme = item.getAweme()) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (TextUtils.equals(str, aid)) {
                    synchronized (videoShareViewModelJp) {
                        try {
                            VideoItemParams item2 = videoShareViewModelJp.getItem();
                            if (item2 != null) {
                                aweme2 = item2.getAweme();
                            }
                            videoShareViewModelJp.EQ2(aweme2);
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
