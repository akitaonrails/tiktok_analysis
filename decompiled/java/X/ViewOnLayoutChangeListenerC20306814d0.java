package X;

import Y.ARunnableS130S0100000_30;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoCell;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.14d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewOnLayoutChangeListenerC20306814d0 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC20306814d0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC20306814d0 viewOnLayoutChangeListenerC20306814d0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC20306814d0);
        CollisionResolver collisionResolver = (CollisionResolver) ((DetailVideoCell) viewOnLayoutChangeListenerC20306814d0.l0).LLIZ.getValue();
        if (((ArrayList) collisionResolver.LL).size() >= 2) {
            for (int size = ((ArrayList) collisionResolver.LL).size() - 1; -1 < size; size--) {
                C14JG c14jg = (C14JG) ListProtector.get(collisionResolver.LL, size);
                if (c14jg.X5()) {
                    for (int i9 = size - 1; -1 < i9; i9--) {
                        C14JG c14jg2 = (C14JG) ListProtector.get(collisionResolver.LL, i9);
                        Rect rectB8 = c14jg.b8();
                        Rect rectB82 = c14jg2.b8();
                        if (c14jg2.X5() && rectB8 != null && rectB82 != null && rectB8.right >= rectB82.left && rectB8.left <= rectB82.right && rectB8.bottom >= rectB82.top && rectB8.top <= rectB82.bottom) {
                            c14jg2.v3();
                        }
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC20306814d0 viewOnLayoutChangeListenerC20306814d0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TakoMultipleSelectAssem takoMultipleSelectAssem;
        C0HZQ c0hzq;
        if (i4 - i2 != i8 - i6 && (c0hzq = (takoMultipleSelectAssem = (TakoMultipleSelectAssem) viewOnLayoutChangeListenerC20306814d0.l0).LLJJLIIIJLLLLLLLZ) != null) {
            HandlerHook.viewPost(c0hzq, new ARunnableS130S0100000_30(takoMultipleSelectAssem, 17));
        }
    }
}
