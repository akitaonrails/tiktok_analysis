package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0sHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1620800sHO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1620800sHO viewTreeObserverOnGlobalLayoutListenerC1620800sHO) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620800sHO);
        C1599010riF c1599010riF = (C1599010riF) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1;
        if (c1599010riF.LL) {
            return;
        }
        c1599010riF.LL = true;
        C1598660rhg.LIZ.getClass();
        C1598660rhg.LJ.LIZJ(4);
        C1598660rhg.LIZLLL.LIZLLL();
        C1904490zex.LJFF.LJIIJ("skylight", EnumC1889770zHD.SUCCESS);
        C1904100zeK c1904100zeK = C1904100zeK.LIZ;
        C1598650rhf c1598650rhf = (C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l2;
        c1904100zeK.getClass();
        C1904100zeK.LIZ(c1598650rhf);
        C1904370zel c1904370zel = C1904370zel.LIZ;
        C1598650rhf c1598650rhf2 = (C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l2;
        c1904370zel.getClass();
        C1904370zel.LIZ(c1598650rhf2);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1620800sHO viewTreeObserverOnGlobalLayoutListenerC1620800sHO) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620800sHO);
        if (!((C013C) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1).element) {
            return;
        }
        C1598660rhg.LIZ.getClass();
        C1598660rhg.LJ.LIZJ(4);
        C1598660rhg.LIZLLL.LIZLLL();
        C1904490zex.LJFF.LJIIJ("skylight", EnumC1889770zHD.SUCCESS);
        C1904100zeK c1904100zeK = C1904100zeK.LIZ;
        C1598650rhf c1598650rhf = (C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l2;
        c1904100zeK.getClass();
        C1904100zeK.LIZ(c1598650rhf);
        C1904370zel c1904370zel = C1904370zel.LIZ;
        C1598650rhf c1598650rhf2 = (C1598650rhf) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l2;
        c1904370zel.getClass();
        C1904370zel.LIZ(c1598650rhf2);
        ((C013C) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1).element = false;
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1620800sHO viewTreeObserverOnGlobalLayoutListenerC1620800sHO) {
        ((View) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l0).getLocationInWindow((int[]) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout x = ");
        sbLIZ.append(((int[]) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1)[0]);
        sbLIZ.append(", y = ");
        sbLIZ.append(((int[]) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1)[1]);
        C1720106oR.LJI("MusNewNotificationCountView", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1620800sHO);
        C1619010sEV c1619010sEV = (C1619010sEV) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l2;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l0;
        int[] iArr = (int[]) viewTreeObserverOnGlobalLayoutListenerC1620800sHO.l1;
        c1619010sEV.LJJIIZ(iArr[0], iArr[1], view);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1620800sHO(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
