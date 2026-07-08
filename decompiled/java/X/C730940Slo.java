package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0Slo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730940Slo extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Boolean>, Unit> {
    public C730940Slo() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Boolean> c291001Au) {
        Object obj;
        Object obj2;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        videoDiggAssem2.getClass();
        if (c291001Au2 != null) {
            if (((Boolean) c291001Au2.LIZ).booleanValue() || C0CBR.LIZLLL) {
                C730950Slp.LIZ(videoDiggAssem2.getContentView().findViewById(R.id.ftt));
            } else if (C589300N9k.LIZIZ()) {
                C731940SnQ c731940SnQ = (C731940SnQ) videoDiggAssem2.getContentView().findViewById(R.id.ftt);
                View viewFindViewById = videoDiggAssem2.getContentView().findViewById(R.id.ftz);
                C724270Sb3 c724270Sb3 = videoDiggAssem2.LLJI;
                Object obj3 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                C724270Sb3 c724270Sb32 = videoDiggAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (!videoDiggAssem2.Ep(aweme, viewFindViewById, c731940SnQ, ((VideoItemParams) obj2).mEventType, true)) {
                    C724270Sb3 c724270Sb33 = videoDiggAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    }
                    c731940SnQ.LJIILLIIL(((VideoItemParams) obj3).getAweme());
                }
            } else {
                ((C731940SnQ) videoDiggAssem2.getContentView().findViewById(R.id.ftt)).LJIILL();
            }
            VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
            videoDiggVMFp.getClass();
            videoDiggVMFp.setState(AFwS243S0000000_11.get$arr$(690));
        }
        return Unit.LIZ;
    }
}
