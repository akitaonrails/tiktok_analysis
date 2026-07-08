package X;

import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0y9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846690y9j implements InterfaceC1846720y9m<C1119430fEj> {
    public final boolean LIZ;
    public final C1846630y9d LIZIZ;
    public final C1846630y9d LIZJ;
    public boolean LIZLLL;
    public CountDownTimerC1811820xFU LJ;

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        this.LIZJ.setText("59m 59s ");
        C1846800y9u.LJIIJJI(this.LIZJ);
        this.LIZJ.setText("");
        C1846800y9u.LJIIJJI(this.LIZIZ);
        int measuredWidth = this.LIZJ.getMeasuredWidth();
        int measuredWidth2 = this.LIZIZ.getMeasuredWidth();
        if (measuredWidth < measuredWidth2) {
            measuredWidth = measuredWidth2;
        }
        return new Pair<>(Integer.valueOf(measuredWidth), Integer.valueOf(this.LIZJ.getMeasuredHeight() + this.LIZIZ.getMeasuredHeight()));
    }

    @Override // X.InterfaceC1846720y9m
    public final void onDestroy() {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LJ;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = this.LJ;
        if (countDownTimerC1811820xFU2 != null) {
            countDownTimerC1811820xFU2.LIZ = null;
        }
        this.LJ = null;
    }

    @Override // X.InterfaceC1846720y9m
    public final void LIZIZ(C1119420fEi c1119420fEi) {
        final C1119430fEj c1119430fEj = (C1119430fEj) c1119420fEi;
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            C500260Jjc.LLFFF(this.LIZIZ);
            C500260Jjc.LLFFF(this.LIZJ);
            long jLIZJ = (c1119430fEj.LJIILLIIL - C158B.LIZJ()) * 1000;
            if (jLIZJ < 0) {
                jLIZJ = 0;
            }
            LIZJ(this, c1119430fEj, jLIZJ);
            if (!this.LIZ && jLIZJ > 0) {
                CountDownTimerC1811820xFU countDownTimerC1811820xFU = new CountDownTimerC1811820xFU(jLIZJ);
                this.LJ = countDownTimerC1811820xFU;
                countDownTimerC1811820xFU.LIZ = new InterfaceC1811830xFV() { // from class: X.0y9l
                    @Override // X.InterfaceC1811830xFV
                    public final void LIZLLL() {
                        C1846690y9j.LIZJ(this.LIZ, c1119430fEj, 0L);
                    }

                    @Override // X.InterfaceC1811830xFV
                    public final void LJJI(long j) {
                        C1846690y9j.LIZJ(this.LIZ, c1119430fEj, j);
                    }
                };
                countDownTimerC1811820xFU.start();
            }
        }
    }

    public C1846690y9j(C1091250eVH c1091250eVH, boolean z) {
        this.LIZ = z;
        this.LIZIZ = (C1846630y9d) c1091250eVH.findViewById(R.id.xwl);
        this.LIZJ = (C1846630y9d) c1091250eVH.findViewById(R.id.xwm);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1846690y9j r8, X.C1119430fEj r9, long r10) {
        /*
            boolean r0 = r8.LIZ
            r7 = 1
            if (r0 == 0) goto L15
            long r3 = r9.LJIILL
            long r1 = r9.LJIILLIIL
            long r5 = X.C158B.LIZJ()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L2b
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2b
        L15:
            java.lang.String r1 = X.C1846800y9u.LJFF(r10, r7)
        L19:
            X.0y9d r0 = r8.LIZJ
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L2a
            X.0y9d r0 = r8.LIZJ
            r0.setText(r1)
        L2a:
            return
        L2b:
            java.lang.String r1 = "xxm xxs"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846690y9j.LIZJ(X.0y9j, X.0fEj, long):void");
    }
}
