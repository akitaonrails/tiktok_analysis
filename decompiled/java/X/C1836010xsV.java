package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0xsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836010xsV extends ConstraintLayout {
    public C1836010xsV() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1835980xsS c1835980xsS;
        Integer numValueOf;
        ViewParent parent = getParent();
        ViewParent parent2 = null;
        if (parent != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof C1835980xsS) && (c1835980xsS = (C1835980xsS) parent2) != null && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                c1835980xsS.LIZLLL();
            } else if ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START && c1835980xsS.getNeedHide() && c1835980xsS.LLJJJ) {
                if (c1835980xsS.LLJJIJIL) {
                    c1835980xsS.LIZIZ(3000L);
                } else {
                    c1835980xsS.LLJJIJIIJIL = false;
                    C786410Ut5.c5(c1835980xsS.getContainerFromXml(), 0.0f);
                    c1835980xsS.LIZJ();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1836010xsV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
