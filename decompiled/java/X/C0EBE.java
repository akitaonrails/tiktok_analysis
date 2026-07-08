package X;

import android.view.View;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EBE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBE {
    public static Scene LIZ(View view) {
        while (view != null) {
            Scene scene = (Scene) view.getTag(R.id.d8o);
            if (scene != null) {
                return scene;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }
}
