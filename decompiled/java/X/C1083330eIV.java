package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.ViewIdUtils;

/* JADX INFO: renamed from: X.0eIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1083330eIV {
    public static void LIZ(ConstraintLayout constraintLayout, int[] iArr) {
        Context context = constraintLayout.getContext();
        for (int i : iArr) {
            ViewIdUtils.getIdName(context, i);
            View viewById = constraintLayout.getViewById(i);
            if (viewById != null) {
                viewById.getVisibility();
            }
        }
    }
}
