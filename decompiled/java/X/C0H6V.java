package X;

import X.InterfaceC1316360kMM;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0H6V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6V<DH extends InterfaceC1316360kMM> {
    public boolean LIZ;
    public final ArrayList<C1320770kTT<DH>> LIZIZ = new ArrayList<>();

    public final void LIZIZ() {
        if (this.LIZ) {
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                this.LIZIZ.get(i).LJI();
            }
        }
        this.LIZIZ.clear();
    }

    public final void LIZLLL() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            this.LIZIZ.get(i).LJFF();
        }
    }

    public final void LJ() {
        if (this.LIZ) {
            this.LIZ = false;
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                this.LIZIZ.get(i).LJI();
            }
        }
    }

    public final int LJFF() {
        return this.LIZIZ.size();
    }

    public final void LIZ(C1320770kTT<DH> c1320770kTT) {
        int size = this.LIZIZ.size();
        c1320770kTT.getClass();
        C1322350kW1.LIZJ(size, this.LIZIZ.size() + 1);
        this.LIZIZ.add(size, c1320770kTT);
        if (this.LIZ) {
            c1320770kTT.LJFF();
        }
    }

    public final C1320770kTT<DH> LIZJ(int i) {
        return this.LIZIZ.get(i);
    }

    public final boolean LJI(Drawable drawable) {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (drawable == LIZJ(i).LIZLLL()) {
                return true;
            }
        }
        return false;
    }
}
