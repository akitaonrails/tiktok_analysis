package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;

/* JADX INFO: renamed from: X.19u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21686519u3 {
    public final PowerLayoutManager LIZ;
    public int LIZIZ = Integer.MIN_VALUE;

    public abstract int LIZIZ(View view);

    public abstract int LIZJ(View view);

    public abstract int LIZLLL(View view);

    public abstract int LJ(View view);

    public abstract int LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract int LJIIIIZZ();

    public abstract int LJIIIZ();

    public abstract void LJIIJ(int i);

    public AbstractC21686519u3(PowerLayoutManager powerLayoutManager) {
        this.LIZ = powerLayoutManager;
    }

    public static AbstractC21686519u3 LIZ(final PowerLayoutManager powerLayoutManager, int i) {
        if (i != 0) {
            if (i == 1) {
                return new AbstractC21686519u3(powerLayoutManager) { // from class: X.19tt
                    @Override // X.AbstractC21686519u3
                    public final int LJFF() {
                        return this.LIZ.getHeight();
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LJI() {
                        return this.LIZ.getHeight() - this.LIZ.getPaddingBottom();
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LJII() {
                        return this.LIZ.getPaddingBottom();
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LJIIIIZZ() {
                        return this.LIZ.getPaddingTop();
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LJIIIZ() {
                        return (this.LIZ.getHeight() - this.LIZ.getPaddingTop()) - this.LIZ.getPaddingBottom();
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LIZIZ(View view) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        this.LIZ.getClass();
                        return this.LIZ.getDecoratedBottom(view) + marginLayoutParams.bottomMargin;
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LIZJ(View view) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        this.LIZ.getClass();
                        return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LIZLLL(View view) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }

                    @Override // X.AbstractC21686519u3
                    public final int LJ(View view) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        this.LIZ.getClass();
                        return this.LIZ.getDecoratedTop(view) - marginLayoutParams.topMargin;
                    }

                    @Override // X.AbstractC21686519u3
                    public final void LJIIJ(int i2) {
                        this.LIZ.offsetChildrenVertical(i2);
                    }
                };
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new AbstractC21686519u3(powerLayoutManager) { // from class: X.19ts
            @Override // X.AbstractC21686519u3
            public final int LJFF() {
                return this.LIZ.getWidth();
            }

            @Override // X.AbstractC21686519u3
            public final int LJI() {
                return this.LIZ.getWidth() - this.LIZ.getPaddingRight();
            }

            @Override // X.AbstractC21686519u3
            public final int LJII() {
                return this.LIZ.getPaddingRight();
            }

            @Override // X.AbstractC21686519u3
            public final int LJIIIIZZ() {
                return this.LIZ.getPaddingLeft();
            }

            @Override // X.AbstractC21686519u3
            public final int LJIIIZ() {
                return (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
            }

            @Override // X.AbstractC21686519u3
            public final int LIZIZ(View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                this.LIZ.getClass();
                return this.LIZ.getDecoratedRight(view) + marginLayoutParams.rightMargin;
            }

            @Override // X.AbstractC21686519u3
            public final int LIZJ(View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                this.LIZ.getClass();
                return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }

            @Override // X.AbstractC21686519u3
            public final int LIZLLL(View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }

            @Override // X.AbstractC21686519u3
            public final int LJ(View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                this.LIZ.getClass();
                return this.LIZ.getDecoratedLeft(view) - marginLayoutParams.leftMargin;
            }

            @Override // X.AbstractC21686519u3
            public final void LJIIJ(int i2) {
                this.LIZ.offsetChildrenHorizontal(i2);
            }
        };
    }
}
