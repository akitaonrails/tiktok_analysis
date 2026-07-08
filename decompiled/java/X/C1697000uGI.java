package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: renamed from: X.0uGI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697000uGI extends RippleDrawable {
    public final boolean LL;
    public C1685910tyP LLILLJJLI;
    public Integer LLILLL;
    public boolean LLILZ;

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.LL) {
            this.LLILZ = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.LLILZ = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.LLILZ;
    }

    public C1697000uGI(boolean z) {
        ColorDrawable colorDrawable;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-16777216);
        if (z) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        super(colorStateListValueOf, null, colorDrawable);
        this.LL = z;
    }
}
