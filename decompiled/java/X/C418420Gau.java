package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Gau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418420Gau {
    public static final void LIZ(View view, float f) {
        final float fLIZLLL = f * C1287910jcT.LIZLLL();
        view.setOutlineProvider(new ViewOutlineProvider(fLIZLLL) { // from class: X.0Gat
            public final float LIZ;

            {
                this.LIZ = fLIZLLL;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.LIZ);
            }
        });
        view.setClipToOutline(true);
    }
}
