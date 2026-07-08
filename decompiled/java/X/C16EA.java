package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EA extends C09AY implements Function2<VideoProgressBarAssem, Integer, Unit> {
    public C16EA() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, Integer num) {
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        int iIntValue = num.intValue();
        C418630GbF c418630GbF = videoProgressBarAssem2.LLLF;
        if (c418630GbF != null) {
            c418630GbF.setMax(((C16EB) videoProgressBarAssem2.Ep().getState()).LLILZIL);
        }
        C418630GbF c418630GbF2 = videoProgressBarAssem2.LLLF;
        if (c418630GbF2 != null) {
            c418630GbF2.setProgress(iIntValue);
        }
        return Unit.LIZ;
    }
}
