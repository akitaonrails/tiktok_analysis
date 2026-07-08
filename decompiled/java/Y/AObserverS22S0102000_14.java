package Y;

import X.C786410Ut5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public class AObserverS22S0102000_14 implements Observer {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS22S0102000_14 aObserverS22S0102000_14, Object obj) {
        boolean z;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS22S0102000_14.l0;
        int i = aObserverS22S0102000_14.i1;
        int i2 = aObserverS22S0102000_14.i2;
        Pair pair = (Pair) obj;
        videoPublishContainerScene.getClass();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            TextView textView = videoPublishContainerScene.LLLZIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            videoPublishContainerScene.T(bool);
            VideoPublishContainerScene.X(videoPublishContainerScene.LLZIL, bool);
            videoPublishContainerScene.W(Boolean.TRUE, (Boolean) pair.getSecond());
            return;
        }
        TextView textView2 = videoPublishContainerScene.LLLZIL;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 8);
        }
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        videoPublishContainerScene.T(Boolean.valueOf(z));
        View view = videoPublishContainerScene.LLZIL;
        if (i2 != 0) {
            z2 = false;
        }
        VideoPublishContainerScene.X(view, Boolean.valueOf(z2));
        videoPublishContainerScene.W(Boolean.FALSE, (Boolean) pair.getSecond());
    }

    public static final void onChanged$1(AObserverS22S0102000_14 aObserverS22S0102000_14, Object obj) {
        boolean z;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS22S0102000_14.l0;
        int i = aObserverS22S0102000_14.i1;
        int i2 = aObserverS22S0102000_14.i2;
        videoPublishContainerScene.getClass();
        boolean z2 = false;
        if (((Boolean) obj).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            TextView textView = videoPublishContainerScene.LLLZIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            videoPublishContainerScene.T(bool);
            VideoPublishContainerScene.X(videoPublishContainerScene.LLZIL, bool);
            TextView textView2 = videoPublishContainerScene.LLLZLZ;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 0);
                return;
            }
            return;
        }
        TextView textView3 = videoPublishContainerScene.LLLZIL;
        if (textView3 != null) {
            C786410Ut5.LLIL(textView3, 8);
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        videoPublishContainerScene.T(Boolean.valueOf(z));
        View view = videoPublishContainerScene.LLZIL;
        if (i2 == 0) {
            z2 = true;
        }
        VideoPublishContainerScene.X(view, Boolean.valueOf(z2));
        TextView textView4 = videoPublishContainerScene.LLLZLZ;
        if (textView4 == null) {
            return;
        }
        C786410Ut5.LLIL(textView4, 8);
    }

    public AObserverS22S0102000_14(VideoPublishContainerScene videoPublishContainerScene, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = videoPublishContainerScene;
        this.i1 = i;
        this.i2 = i2;
    }
}
