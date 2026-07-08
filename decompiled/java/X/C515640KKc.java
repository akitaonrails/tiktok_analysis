package X;

import Y.ARunnableS16S0201000_9;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0KKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515640KKc {
    public static final void LIZ(int i, View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            HandlerHook.viewPost(view, new ARunnableS16S0201000_9(i, viewGroup, view, 2));
        }
    }
}
