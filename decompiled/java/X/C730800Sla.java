package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730800Sla extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Boolean>, Unit> {
    public C730800Sla() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Boolean> c291001Au) {
        Object obj;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        videoDiggAssem2.getClass();
        if (c291001Au2 != null && ((Boolean) c291001Au2.LIZ).booleanValue()) {
            if (C589300N9k.LIZIZ()) {
                C731940SnQ c731940SnQ = (C731940SnQ) videoDiggAssem2.getContentView().findViewById(R.id.ftt);
                C724270Sb3 c724270Sb3 = videoDiggAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                c731940SnQ.LJIILIIL(((VideoItemParams) obj).getAweme());
            } else {
                ((C731940SnQ) videoDiggAssem2.getContentView().findViewById(R.id.ftt)).LJIIL();
            }
        }
        return Unit.LIZ;
    }
}
