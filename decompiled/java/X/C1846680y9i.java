package X;

import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0y9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846680y9i implements InterfaceC1846720y9m<C1119430fEj> {
    public final boolean LIZ;
    public final C1846630y9d LIZIZ;
    public boolean LIZJ;
    public CountDownTimerC1811820xFU LIZLLL;

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        this.LIZIZ.setText(C497740JfY.LJIJJ(2131855331, "59m 59s "));
        C1846800y9u.LJIIJJI(this.LIZIZ);
        this.LIZIZ.setText("");
        return new Pair<>(Integer.valueOf(this.LIZIZ.getMeasuredWidth()), Integer.valueOf(this.LIZIZ.getMeasuredHeight()));
    }

    @Override // X.InterfaceC1846720y9m
    public final void onDestroy() {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LIZLLL;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = this.LIZLLL;
        if (countDownTimerC1811820xFU2 != null) {
            countDownTimerC1811820xFU2.LIZ = null;
        }
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC1846720y9m
    public final void LIZIZ(C1119420fEi c1119420fEi) {
        final C1119430fEj c1119430fEj = (C1119430fEj) c1119420fEi;
        if (!this.LIZJ) {
            this.LIZJ = true;
            C500260Jjc.LLFFF(this.LIZIZ);
            this.LIZIZ.setText(C497740JfY.LJIJJ(2131855331, ""));
            long jLIZJ = (c1119430fEj.LJIILLIIL - C158B.LIZJ()) * 1000;
            if (jLIZJ < 0) {
                jLIZJ = 0;
            }
            LIZJ(this, c1119430fEj, jLIZJ);
            if (!this.LIZ && jLIZJ > 0) {
                CountDownTimerC1811820xFU countDownTimerC1811820xFU = new CountDownTimerC1811820xFU(jLIZJ);
                this.LIZLLL = countDownTimerC1811820xFU;
                countDownTimerC1811820xFU.LIZ = new InterfaceC1811830xFV() { // from class: X.0y9k
                    @Override // X.InterfaceC1811830xFV
                    public final void LIZLLL() {
                        C1846680y9i.LIZJ(this.LIZ, c1119430fEj, 0L);
                    }

                    @Override // X.InterfaceC1811830xFV
                    public final void LJJI(long j) {
                        C1846680y9i.LIZJ(this.LIZ, c1119430fEj, j);
                    }
                };
                countDownTimerC1811820xFU.start();
            }
        }
    }

    public C1846680y9i(C1091250eVH c1091250eVH, boolean z) {
        this.LIZ = z;
        this.LIZIZ = (C1846630y9d) c1091250eVH.findViewById(R.id.xwk);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1846680y9i r10, X.C1119430fEj r11, long r12) {
        /*
            r9 = 1
            java.lang.Object[] r8 = new java.lang.Object[r9]
            boolean r0 = r10.LIZ
            r7 = 0
            if (r0 == 0) goto L18
            long r3 = r11.LJIILL
            long r1 = r11.LJIILLIIL
            long r5 = X.C158B.LIZJ()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L37
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L37
        L18:
            java.lang.String r0 = X.C1846800y9u.LJFF(r12, r9)
        L1c:
            r8[r7] = r0
            r0 = 2131855331(0x7f1187e3, float:1.9344362E38)
            java.lang.String r1 = X.C497740JfY.LJIJJ(r0, r8)
            X.0y9d r0 = r10.LIZIZ
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L36
            X.0y9d r0 = r10.LIZIZ
            r0.setText(r1)
        L36:
            return
        L37:
            java.lang.String r0 = "xxm xxs"
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846680y9i.LIZJ(X.0y9i, X.0fEj, long):void");
    }
}
