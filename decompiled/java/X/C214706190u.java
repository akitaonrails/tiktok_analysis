package X;

import android.animation.IntEvaluator;
import android.util.Property;

/* JADX INFO: renamed from: X.190u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214706190u extends AbstractC214710190y {
    @Override // X.AbstractC214710190y
    public final void LJ(boolean z) {
    }

    @Override // X.AbstractC214710190y
    public final C191E LIZJ(boolean z) {
        if (z) {
            if (this.LL.getBackground() != null) {
                this.LL.setBackgroundDrawable(this.LL.getBackground().mutate());
                final C21416118rX c21416118rX = new C21416118rX(this.LL.getBackground());
                c21416118rX.LIZIZ.put(C21416118rX.LIZJ, new C214708190w(new IntEvaluator(), 0, 255));
                return new C191E() { // from class: X.190v
                    {
                        super(0);
                    }

                    @Override // X.C191E
                    public final void LIZIZ(float f) {
                        for (Property property : c21416118rX.LIZIZ.keySet()) {
                            C214708190w c214708190w = c21416118rX.LIZIZ.get(property);
                            property.set(c21416118rX.LIZ, c214708190w.LIZ.evaluate(f, c214708190w.LIZIZ, c214708190w.LIZJ));
                        }
                    }
                };
            }
        } else if (this.LL.getBackground() != null) {
            this.LL.setBackgroundDrawable(this.LL.getBackground().mutate());
            final C21416118rX c21416118rX2 = new C21416118rX(this.LL.getBackground());
            c21416118rX2.LIZIZ.put(C21416118rX.LIZJ, new C214708190w(new IntEvaluator(), 255, 0));
            return new C191E() { // from class: X.190v
                {
                    super(0);
                }

                @Override // X.C191E
                public final void LIZIZ(float f) {
                    for (Property property : c21416118rX2.LIZIZ.keySet()) {
                        C214708190w c214708190w = c21416118rX2.LIZIZ.get(property);
                        property.set(c21416118rX2.LIZ, c214708190w.LIZ.evaluate(f, c214708190w.LIZIZ, c214708190w.LIZJ));
                    }
                }
            };
        }
        return C191E.LIZJ;
    }
}
