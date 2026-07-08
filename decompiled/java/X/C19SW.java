package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19SW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SW extends Drawable.ConstantState {
    public C19LH LIZ;
    public AnimatorSet LIZIZ;
    public ArrayList<Animator> LIZJ;
    public C830490Whz<Animator, String> LIZLLL;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public C19SW(C19SZ c19sz) {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
