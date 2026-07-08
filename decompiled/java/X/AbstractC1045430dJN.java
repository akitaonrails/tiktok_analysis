package X;

import android.view.View;

/* JADX INFO: renamed from: X.0dJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1045430dJN {
    public abstract void LIZ(View view, EnumC1045490dJT enumC1045490dJT);

    public abstract void LIZJ();

    public abstract void LIZLLL(View view);

    public abstract void LJ();

    public abstract void LJFF(View view);

    public abstract void LJI();

    public static C1BUP LIZIZ(C1045760dJu c1045760dJu, C1046930dLn c1046930dLn) {
        if (C1BUQ.LIZ.LIZ) {
            return new C1BUP(c1045760dJu, c1046930dLn);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
