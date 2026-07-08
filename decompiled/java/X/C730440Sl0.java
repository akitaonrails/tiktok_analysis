package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS27S0200100_11;

/* JADX INFO: renamed from: X.0Sl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730440Sl0 extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Aweme>, Unit> {
    public C730440Sl0() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Aweme> c291001Au) {
        long diggCount;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        if (c291001Au2 == null) {
            videoDiggAssem2.getClass();
        } else {
            VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
            Aweme aweme = (Aweme) c291001Au2.LIZ;
            videoDiggVMFp.getClass();
            if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                boolean z = true;
                if (aweme.getUserDigg() != 1) {
                    z = false;
                }
                videoDiggVMFp.LLILLJJLI = z;
                if (aweme.getStatistics() == null) {
                    diggCount = 0;
                } else {
                    diggCount = aweme.getStatistics().getDiggCount();
                }
                videoDiggVMFp.LL = diggCount;
                if (diggCount < 0) {
                    videoDiggVMFp.LL = 0L;
                }
                videoDiggVMFp.setState(new AwS27S0200100_11(videoDiggVMFp, videoDiggVMFp.LL, aweme, 4));
            }
        }
        return Unit.LIZ;
    }
}
