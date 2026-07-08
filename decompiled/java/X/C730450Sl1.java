package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Sl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730450Sl1 extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Aweme>, Unit> {
    public C730450Sl1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Aweme> c291001Au) {
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        if (c291001Au2 == null) {
            videoDiggAssem2.getClass();
        } else {
            VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
            T t = c291001Au2.LIZ;
            if (videoDiggVMFp.getContext() != null && t != 0) {
                videoDiggVMFp.RQ2(new AwS625S0100000_11(videoDiggVMFp, 131));
            }
        }
        return Unit.LIZ;
    }
}
