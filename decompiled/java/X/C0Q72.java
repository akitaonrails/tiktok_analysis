package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Q72, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q72 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, final float f) {
        if (view.getContext() == null) {
            return;
        }
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Q71
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), C12ES.LIZJ(f, view2.getContext()));
            }
        });
        view.setClipToOutline(true);
    }
}
