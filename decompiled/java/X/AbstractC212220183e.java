package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.183e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212220183e<T extends View, Z> {
    public final T LIZ;
    public final String LIZIZ;
    public AnonymousClass1847 LIZJ;
    public final Context LIZLLL;

    public final Animator LJFF() {
        T t = this.LIZ;
        return C19395710uR.LIZ(t.getAlpha(), 0.0f, t);
    }

    public final boolean LJI() {
        return this.LIZ.getVisibility() == 0;
    }

    public final void LJIIIIZZ() {
        C786410Ut5.T4(this.LIZ, 1.0f);
    }

    public static final boolean LJII(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final Animator LJ(boolean z) {
        float alpha = 0.0f;
        if (z) {
            C786410Ut5.T4(this.LIZ, 0.0f);
        }
        T t = this.LIZ;
        if (t.getAlpha() != 1.0f) {
            alpha = this.LIZ.getAlpha();
        }
        return C19395710uR.LIZ(alpha, 1.0f, t);
    }

    public boolean LJIIJ(boolean z) {
        if (z) {
            if (this.LIZ.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, this.LIZ);
                AnonymousClass1847 anonymousClass1847 = this.LIZJ;
                if (anonymousClass1847 != null) {
                    anonymousClass1847.LIZ();
                }
                return true;
            }
        } else if (this.LIZ.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, this.LIZ);
            AnonymousClass1847 anonymousClass18472 = this.LIZJ;
            if (anonymousClass18472 != null) {
                anonymousClass18472.LIZ();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC212220183e(View view, String str) {
        this.LIZ = view;
        this.LIZIZ = str;
        this.LIZLLL = view.getContext();
    }

    public static final void LJIIIZ(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
