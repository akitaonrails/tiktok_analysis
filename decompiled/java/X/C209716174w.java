package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: X.174w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C209716174w extends AbstractC21144317on {
    @Override // X.AbstractC21144317on
    public final View LJIJI(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @Override // X.AbstractC21144317on
    public final View LJIJJLI(Context context, AttributeSet attributeSet) {
        return new ImageView(context, attributeSet);
    }

    @Override // X.AbstractC21144317on
    public final boolean LJIJ(Context context) {
        if (!AbstractC21144517op.LJIILL(context)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21144317on
    public final View LJIJJ(Context context, AttributeSet attributeSet) {
        return C0J4L.LIZ(context, "ImageView", attributeSet);
    }
}
