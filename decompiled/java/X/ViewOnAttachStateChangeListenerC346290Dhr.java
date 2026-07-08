package X;

import Y.ARunnableS104S0100000_4;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Dhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnAttachStateChangeListenerC346290Dhr implements View.OnAttachStateChangeListener {
    public final int $t;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC346290Dhr viewOnAttachStateChangeListenerC346290Dhr, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC346290Dhr viewOnAttachStateChangeListenerC346290Dhr, View view) {
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

    public ViewOnAttachStateChangeListenerC346290Dhr(int i) {
        this.$t = i;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC346290Dhr viewOnAttachStateChangeListenerC346290Dhr, View view) {
        view.requestFocus();
        HandlerHook.viewPost(view, new ARunnableS104S0100000_4(view, 98));
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC346290Dhr viewOnAttachStateChangeListenerC346290Dhr, View view) {
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null) {
            int iHashCode = fragmentLIZ.hashCode();
            ConcurrentHashMap<Integer, Integer> concurrentHashMap = IMStackingViewAssem.LLJJIJIIJIL;
            Integer num = concurrentHashMap.get(Integer.valueOf(iHashCode));
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue > 1) {
                    concurrentHashMap.put(Integer.valueOf(iHashCode), Integer.valueOf(iIntValue - 1));
                } else {
                    concurrentHashMap.remove(Integer.valueOf(iHashCode));
                }
            }
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC346290Dhr);
    }
}
