package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.19Ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC21516119Ih implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C21515719Id LLILLL;
    public final /* synthetic */ View LLILZ;

    public ViewTreeObserverOnGlobalFocusChangeListenerC21516119Ih(ConstraintLayout constraintLayout, C013C c013c, C21515719Id c21515719Id, View view) {
        this.LL = constraintLayout;
        this.LLILLJJLI = c013c;
        this.LLILLL = c21515719Id;
        this.LLILZ = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        C21516019Ig c21516019Ig = null;
        if (this.LL.hasFocus() && !this.LLILLJJLI.element) {
            C21515719Id c21515719Id = this.LLILLL;
            C21516219Ii c21516219Ii = c21515719Id.LJ;
            View view3 = this.LL;
            View view4 = this.LLILZ;
            if (c21516219Ii != null) {
                if (Math.abs(c21516219Ii.LIZLLL) < 0.01f) {
                    C1706630uVp.LIZ("KeyBoardUtils", "un observe");
                    C21515719Id c21515719Id2 = c21516219Ii.LIZJ;
                    if (c21515719Id2 == null) {
                        c21515719Id2 = null;
                    }
                    C21516019Ig c21516019Ig2 = c21516219Ii.LIZ;
                    if (c21516019Ig2 != null) {
                        c21516019Ig = c21516019Ig2;
                    }
                    c21515719Id2.LIZLLL.remove(c21516019Ig);
                    c21516219Ii.LIZIZ = false;
                } else {
                    c21516219Ii.LIZIZ = true;
                }
            }
            c21515719Id.LJ = new C21516219Ii(view3, view4, c21515719Id);
            this.LLILLJJLI.element = true;
            return;
        }
        if (this.LL.hasFocus() || !this.LLILLJJLI.element) {
            return;
        }
        C21516219Ii c21516219Ii2 = this.LLILLL.LJ;
        if (c21516219Ii2 != null) {
            if (Math.abs(c21516219Ii2.LIZLLL) < 0.01f) {
                C1706630uVp.LIZ("KeyBoardUtils", "un observe");
                C21515719Id c21515719Id3 = c21516219Ii2.LIZJ;
                if (c21515719Id3 == null) {
                    c21515719Id3 = null;
                }
                C21516019Ig c21516019Ig3 = c21516219Ii2.LIZ;
                if (c21516019Ig3 != null) {
                    c21516019Ig = c21516019Ig3;
                }
                c21515719Id3.LIZLLL.remove(c21516019Ig);
                c21516219Ii2.LIZIZ = false;
            } else {
                c21516219Ii2.LIZIZ = true;
            }
        }
        this.LLILLJJLI.element = false;
    }
}
