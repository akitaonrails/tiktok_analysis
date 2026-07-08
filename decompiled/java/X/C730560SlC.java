package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730560SlC extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Integer>, Unit> {
    public C730560SlC() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Integer> c291001Au) {
        final VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        if (c291001Au != null) {
            videoDiggAssem2.LLLII = true;
            C0CAU.LIZIZ(new Runnable() { // from class: X.0Slc
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    View view;
                    C1C7U.LIZ("VideoDiggAssem@a0f1.invokeSelectSubscribe$12$1");
                    try {
                        C731140Sm8 c731140Sm8 = videoDiggAssem2.LLLI;
                        if (c731140Sm8 != null && C20586815h4.LIZ() && (view = c731140Sm8.LIZJ) != null) {
                            HandlerHook.viewPostDelay(view, new RunnableC730830Sld(c731140Sm8), C300480BqA.LIZ());
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoDiggAssem@a0f1.invokeSelectSubscribe$12$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
