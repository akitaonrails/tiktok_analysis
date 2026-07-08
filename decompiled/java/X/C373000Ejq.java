package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Ejq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373000Ejq {
    public static void LIZ(C372830EjZ c372830EjZ, boolean z) {
        ViewGroup viewGroup;
        View previewLayout = c372830EjZ.getPreviewLayout();
        if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null) {
            viewGroup.setClipChildren(z);
        }
        c372830EjZ.setClipChildren(z);
    }
}
