package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731300SmO extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends Integer>, Unit> {
    public C731300SmO() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends Integer> c291001Au) {
        View view;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        if (c291001Au != null) {
            videoFavoriteAssem2.LLLFZ = true;
            C731340SmS c731340SmS = videoFavoriteAssem2.LLLFFI;
            if (c731340SmS != null && C20586815h4.LIZ() && (view = c731340SmS.LIZJ) != null) {
                HandlerHook.viewPostDelay(view, new RunnableC731290SmN(c731340SmS), C300480BqA.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
