package X;

import X.C1676910tjt;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import u4.q0;

/* JADX INFO: renamed from: X.0uIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698310uIP implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
            case 3:
                dispose$3(this);
                break;
            case 4:
                dispose$4(this);
                break;
            case 5:
                dispose$5(this);
                break;
            case 6:
                dispose$6(this);
                break;
            case 7:
                dispose$7(this);
                break;
            case 8:
                dispose$8(this);
                break;
        }
    }

    public static final void dispose$0(C1698310uIP c1698310uIP) {
        C1677750tlF c1677750tlF = (C1677750tlF) c1698310uIP.l0;
        c1677750tlF.LIZIZ.LJIIL((C1677730tlD) c1698310uIP.l1);
    }

    public static final void dispose$1(C1698310uIP c1698310uIP) {
        C05P1 c05p1;
        C1676910tjt c1676910tjt = (C1676910tjt) c1698310uIP.l0;
        C1676910tjt.a aVar = (C1676910tjt.a) c1698310uIP.l1;
        c1676910tjt.getClass();
        C1676850tjn c1676850tjn = (C1676850tjn) ((C13FE) aVar.LIZIZ).getValue();
        if (c1676850tjn != null && (c05p1 = c1676850tjn.LL) != null) {
            c1676910tjt.LJIIIIZZ.remove(c05p1);
        }
    }

    public static final void dispose$2(C1698310uIP c1698310uIP) {
        C1676910tjt c1676910tjt = (C1676910tjt) c1698310uIP.l0;
        c1676910tjt.LJIIIIZZ.remove((C1676910tjt.d) c1698310uIP.l1);
    }

    public static final void dispose$3(C1698310uIP c1698310uIP) {
        C1677780tlI c1677780tlI = (C1677780tlI) c1698310uIP.l0;
        c1677780tlI.LIZ.LJIIL((C1677800tlK) c1698310uIP.l1);
    }

    public static final void dispose$4(C1698310uIP c1698310uIP) {
        C1676910tjt c1676910tjt = (C1676910tjt) c1698310uIP.l0;
        c1676910tjt.LJIIIZ.remove((C1676910tjt) c1698310uIP.l1);
    }

    public static final void dispose$5(C1698310uIP c1698310uIP) {
        ((LiveData) c1698310uIP.l0).removeObserver((Observer) c1698310uIP.l1);
    }

    public static final void dispose$6(C1698310uIP c1698310uIP) {
        C1683860tv6 c1683860tv6 = (C1683860tv6) c1698310uIP.l0;
        View view = (View) c1698310uIP.l1;
        int i = c1683860tv6.LJIJ - 1;
        c1683860tv6.LJIJ = i;
        if (i == 0) {
            C14K9.LJIJJ(view, null);
            q0.LJJII(view, null);
            view.removeOnAttachStateChangeListener(c1683860tv6.LJIJI);
        }
    }

    public static final void dispose$7(C1698310uIP c1698310uIP) {
        C14K9.LJIJJ((View) c1698310uIP.l0, null);
        C786410Ut5.C3(((View) c1698310uIP.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) c1698310uIP.l1);
    }

    public static final void dispose$8(C1698310uIP c1698310uIP) {
        ((C1692980u9o) c1698310uIP.l0).LIZJ.remove((Function1) c1698310uIP.l1);
    }

    public C1698310uIP(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
