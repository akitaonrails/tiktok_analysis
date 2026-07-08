package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.16g1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20835116g1 extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new FrameLayout(context, attributeSet) { // from class: X.16mL
            @Override // android.view.ViewGroup, android.view.View
            public final boolean gatherTransparentRegion(Region region) {
                if (C20874416mM.LIZ < 0) {
                    C20874416mM.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_surface_transparent_region_opt", true);
                }
                if (C20874416mM.LIZ == 1) {
                    return true;
                }
                return super.gatherTransparentRegion(region);
            }

            @Override // android.view.ViewGroup
            public final boolean drawChild(Canvas canvas, View view, long j) {
                if (C0DG1.LIZ(view) && super.drawChild(canvas, view, j)) {
                    return true;
                }
                return false;
            }
        };
    }
}
