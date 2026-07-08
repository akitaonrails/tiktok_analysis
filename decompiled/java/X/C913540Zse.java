package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Zse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913540Zse {
    public static C1389910mGz LIZJ;
    public static WeakReference<View> LIZLLL;
    public static final C913540Zse LIZ = new C913540Zse();
    public static final RunnableC913480ZsY LIZIZ = RunnableC913480ZsY.LL;
    public static final C01GW LJFF = C452501pT.LIZIZ(new C913450ZsV());
    public static final C01GW LJI = C452501pT.LIZIZ(new C913570Zsh());
    public static final C01GW LJII = C452501pT.LIZIZ(new C913580Zsi());
    public static final ViewOnAttachStateChangeListenerC913550Zsf LJ = new View.OnAttachStateChangeListener() { // from class: X.0Zsf
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            View view2;
            C1389910mGz c1389910mGz = C913540Zse.LIZJ;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
            C913540Zse.LIZJ = null;
            WeakReference<View> weakReference = C913540Zse.LIZLLL;
            if (weakReference != null && (view2 = weakReference.get()) != null) {
                view2.removeOnAttachStateChangeListener(C913540Zse.LJ);
            }
            C913540Zse.LIZLLL = null;
        }
    };
}
