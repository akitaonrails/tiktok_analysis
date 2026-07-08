package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0eQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088230eQP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, final float f) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0eQO
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (view2 != null && outline != null) {
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), C418440Gaw.LIZIZ(Float.valueOf(f)));
                }
            }
        });
        view.setClipToOutline(true);
    }
}
