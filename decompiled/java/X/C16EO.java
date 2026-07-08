package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16EO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EO extends C09AY implements Function1<C16EB, Unit> {
    public final /* synthetic */ VideoProgressBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16EO(VideoProgressBarAssem videoProgressBarAssem) {
        super(1);
        this.LL = videoProgressBarAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C16EB c16eb) {
        if (!c16eb.LLILLJJLI) {
            VideoProgressBarAssem videoProgressBarAssem = this.LL;
            C418630GbF c418630GbF = videoProgressBarAssem.LLLF;
            if (c418630GbF != null) {
                c418630GbF.setProgress(0);
            }
            C418630GbF c418630GbF2 = videoProgressBarAssem.LLLF;
            if (c418630GbF2 != null) {
                c418630GbF2.clearAnimation();
            }
            C418630GbF c418630GbF3 = videoProgressBarAssem.LLLF;
            if (c418630GbF3 != null) {
                int visibility = c418630GbF3.getVisibility();
                c418630GbF3.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c418630GbF3);
            }
            C2041907zF.LIZJ(videoProgressBarAssem.LLLFF);
            LineProgressBar lineProgressBar = videoProgressBarAssem.LLLFF;
            if (lineProgressBar != null) {
                lineProgressBar.clearAnimation();
            }
            LineProgressBar lineProgressBar2 = videoProgressBarAssem.LLLFF;
            if (lineProgressBar2 != null) {
                lineProgressBar2.LIZIZ();
            }
        }
        return Unit.LIZ;
    }
}
