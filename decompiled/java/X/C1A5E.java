package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.1A5E, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5E implements C1A5H {
    public static final C1A5E LIZ = new C1A5E();

    @Override // X.C1A5H
    public final boolean LIZ(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (Build.VERSION.SDK_INT >= 29 && C630710OoX.LIZ(view.getParent(), view)) {
            Rect bounds = view.getTouchDelegate().getTouchDelegateInfo().getRegionAt(0).getBounds();
            width = Math.max(bounds.width(), width);
            height = Math.max(bounds.height(), height);
        }
        view.getContext();
        if (width * height > C1A5C.LIZLLL() * C1A5C.LIZJ() * 0.3f) {
            return false;
        }
        return true;
    }
}
