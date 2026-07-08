package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.18nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391018nU extends ViewOutlineProvider {
    public int LIZ;
    public int LIZIZ;
    public float LIZJ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2 = this.LIZ;
        if (i2 > 0 && (i = this.LIZIZ) > 0) {
            outline.setRoundRect(0, 0, i2, i, this.LIZJ);
        } else {
            outline.setEmpty();
        }
    }
}
