package X;

import Y.AsS47S0100000_20;

/* JADX INFO: renamed from: X.0kuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337560kuY {
    public static final /* synthetic */ int LJ = 0;
    public int LIZIZ;
    public ViewTreeObserverOnScrollChangedListenerC1337500kuS LIZJ;
    public int LIZ = -1;
    public final AsS47S0100000_20 LIZLLL = new AsS47S0100000_20(this, 2);

    public final void LIZ(int i, int i2) {
        if (i2 - i >= 0) {
            int i3 = this.LIZ;
            if (i3 == -1) {
                this.LIZ = i;
                this.LIZIZ = i2;
                while (i < i2 + 1) {
                    i++;
                }
                return;
            }
            if (i != i3) {
                if (i <= i3) {
                    for (int i4 = i; i4 < i3; i4++) {
                    }
                } else {
                    while (i3 < i) {
                        i3++;
                    }
                }
                this.LIZ = i;
            }
            int i5 = this.LIZIZ;
            if (i2 != i5) {
                if (i2 <= i5) {
                    for (int i6 = i2; i6 < i5; i6++) {
                    }
                } else {
                    while (i5 < i2) {
                        i5++;
                    }
                }
                this.LIZIZ = i2;
            }
        }
    }
}
