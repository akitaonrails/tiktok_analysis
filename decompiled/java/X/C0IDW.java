package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframeAnchorAssem;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframeAnchorTrigger;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: renamed from: X.0IDW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDW implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(C0IDW c0idw, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C0IDW c0idw, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$1(C0IDW c0idw, View view) {
        SearchDetailKeyframeAnchorTrigger searchDetailKeyframeAnchorTrigger;
        List<SearchKeyFramePoint> list;
        if (view.isShown()) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((SearchDetailKeyframeAnchorAssem) c0idw.l0)).getAweme();
            LifecycleOwner parent = ((SearchDetailKeyframeAnchorAssem) c0idw.l0).getParent();
            if ((parent instanceof SearchDetailKeyframeAnchorTrigger) && (searchDetailKeyframeAnchorTrigger = (SearchDetailKeyframeAnchorTrigger) parent) != null && (list = searchDetailKeyframeAnchorTrigger.LLJL) != null) {
                C2211631BhB.LJ((View) c0idw.l1, new AwS215S0300000_6(aweme, (SearchDetailKeyframeAnchorAssem) c0idw.l0, list, 3));
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(C0IDW c0idw, View view) {
        HandlerHook.viewRemoveCallbacks((View) c0idw.l0, (Runnable) c0idw.l1);
        ((View) c0idw.l0).removeOnAttachStateChangeListener(c0idw);
    }

    public C0IDW(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
