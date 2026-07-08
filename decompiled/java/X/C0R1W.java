package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0R1W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1W extends ViewOnAttachStateChangeListenerC20604515jv {
    public C0R1W(Context context) {
        this(context, null, 6, 0);
    }

    public C0R1W(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public C0R1W(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEdgeEffectFactory(new C688970R0t(this) { // from class: X.0R1X
            public final View LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C688970R0t
            public final EdgeEffect LIZ(RecyclerView recyclerView, final int i2) {
                final View view = this.LIZ;
                return new EdgeEffect(i2, view) { // from class: X.19cw
                    public final View LIZ;
                    public final int LIZIZ;
                    public float LIZJ;
                    public final C21616519il LIZLLL;

                    @Override // android.widget.EdgeEffect
                    public final boolean draw(Canvas canvas) {
                        return false;
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onRelease() {
                        super.onRelease();
                        if (this.LIZJ != 0.0f) {
                            this.LIZLLL.LJIIIZ();
                            this.LIZJ = 0.0f;
                        }
                    }

                    @Override // android.widget.EdgeEffect
                    public final float getDistance() {
                        return this.LIZJ;
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onAbsorb(int i3) {
                        super.onAbsorb(i3);
                        C21616519il c21616519il = this.LIZLLL;
                        c21616519il.LIZ = i3;
                        c21616519il.LJIIIZ();
                        this.LIZJ = 0.0f;
                    }

                    {
                        super(view.getContext());
                        this.LIZ = view;
                        this.LIZIZ = i2;
                        C21616519il c21616519il = new C21616519il(view, AbstractC21616419ik.LJIIL);
                        C21581419d6 c21581419d6 = new C21581419d6(0.0f);
                        c21581419d6.LIZ(0.85f);
                        c21581419d6.LIZIZ(522.0f);
                        c21616519il.LJJ = c21581419d6;
                        this.LIZLLL = c21616519il;
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onPull(float f, float f2) {
                        int i3;
                        super.onPull(f, f2);
                        if (this.LIZLLL.LJFF) {
                            return;
                        }
                        if (this.LIZIZ == 2) {
                            i3 = -1;
                        } else {
                            i3 = 1;
                        }
                        this.LIZJ += i3 * this.LIZ.getWidth() * f;
                        float width = this.LIZ.getWidth() - Math.abs(this.LIZJ);
                        float f3 = 1;
                        float fAbs = (f3 - (f3 / (((Math.abs(this.LIZJ) * 0.3f) / width) + f3))) * width;
                        float f4 = this.LIZJ;
                        C786410Ut5.Jc(this.LIZ, (f4 / Math.abs(f4)) * fAbs);
                    }
                };
            }
        });
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLJJIJIIJIL.getValue());
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public /* synthetic */ C0R1W(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
