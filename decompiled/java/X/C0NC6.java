package X;

import Y.ARunnableS78S0200000_9;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: renamed from: X.0NC6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NC6 {
    public static final void LIZ(View view) {
        Object obj;
        View.OnLayoutChangeListener onLayoutChangeListener;
        Reference reference;
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.f699eha);
        if ((tag instanceof WeakReference) && (reference = (Reference) tag) != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if ((obj instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) obj) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
            view.setTag(R.id.f699eha, null);
        }
    }

    public static final void LIZIZ(View view, boolean z, Function1<? super View, Unit> function1) {
        if (view.isShown()) {
            if (z) {
                function1.invoke(view);
                return;
            } else {
                HandlerHook.viewPost(view, new ARunnableS78S0200000_9(view, (View) function1, (Function1<? super Bitmap, Unit>) 95));
                return;
            }
        }
        C0P4G c0p4g = new C0P4G(view, new AwS410S0200000_9(view, (View) function1, (Function1<? super View, Unit>) 111), 4);
        view.addOnLayoutChangeListener(c0p4g);
        view.setTag(R.id.f699eha, new WeakReference(c0p4g));
    }
}
