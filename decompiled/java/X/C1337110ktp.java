package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: renamed from: X.0ktp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337110ktp implements C19J1 {
    public final View LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;

    @Override // X.C19J1
    public final float getRipple() {
        return this.LLILLL;
    }

    @Override // X.C19J1
    public final float getRubIn() {
        return this.LLILZLL;
    }

    @Override // X.C19J1
    public final float getShine() {
        return this.LLILZ;
    }

    @Override // X.C19J1
    public final float getStretch() {
        return this.LLILZIL;
    }

    public C1337110ktp(View view) {
        this.LL = view;
    }

    public final void LIZ(int i) {
        View view = this.LL;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else {
            if (!(background instanceof ColorDrawable)) {
                return;
            }
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }

    public final void LIZIZ(float f) {
        View view = this.LL;
        if (view == null) {
            return;
        }
        this.LLILLJJLI = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }
}
