package X;

import android.graphics.Outline;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0asJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951770asJ {
    public static final void LIZ(final int i, View view) {
        SurfaceHolder holder;
        int i2;
        if ((view instanceof SurfaceView) && (holder = ((SurfaceView) view).getHolder()) != null) {
            if (i == 0) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            holder.setFormat(i2);
        }
        if (i == 0 && C931780aM4.LIZ()) {
            return;
        }
        view.setOutlineProvider(new ViewOutlineProvider(i) { // from class: X.0GZp
            public final int LIZ;

            {
                this.LIZ = i;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (view2 != null && outline != null) {
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), this.LIZ);
                }
            }
        });
        view.setClipToOutline(true);
    }
}
