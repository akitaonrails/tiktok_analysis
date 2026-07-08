package Y;

import X.AbstractC1585810rMx;
import X.AbstractC683590Qrd;
import X.C639530P6p;
import X.C682910QqX;
import X.C682930QqZ;
import X.InterfaceC682870QqT;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class AsS17S0300000_10 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    public static final void LJJIIJ$0(AsS17S0300000_10 asS17S0300000_10, RecyclerView recyclerView, int i) {
        C682910QqX c682910QqX = (C682910QqX) asS17S0300000_10.l0;
        if (!c682910QqX.LIZIZ && i == 1) {
            c682910QqX.LIZIZ = true;
            InterfaceC682870QqT interfaceC682870QqT = (InterfaceC682870QqT) asS17S0300000_10.l1;
            if (interfaceC682870QqT != null) {
                interfaceC682870QqT.LJII();
            }
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) asS17S0300000_10.l2).removeOnScrollListener(asS17S0300000_10);
    }

    public static final void LJJIIJ$1(AsS17S0300000_10 asS17S0300000_10, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C639530P6p c639530P6p = C639530P6p.LIZ;
            Context context = (Context) asS17S0300000_10.l0;
            AbstractC683590Qrd abstractC683590Qrd = (AbstractC683590Qrd) asS17S0300000_10.l1;
            RecyclerView recyclerView2 = (RecyclerView) asS17S0300000_10.l2;
            c639530P6p.getClass();
            C639530P6p.LIZIZ(context, abstractC683590Qrd, recyclerView2, false);
        }
    }

    public static final void LJJIIJ$2(AsS17S0300000_10 asS17S0300000_10, RecyclerView recyclerView, int i) {
        C682930QqZ c682930QqZ = (C682930QqZ) asS17S0300000_10.l0;
        if (!c682930QqZ.LIZIZ && i == 1) {
            c682930QqZ.LIZIZ = true;
            InterfaceC682870QqT interfaceC682870QqT = (InterfaceC682870QqT) asS17S0300000_10.l1;
            if (interfaceC682870QqT != null) {
                interfaceC682870QqT.LJIIIIZZ();
            }
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) asS17S0300000_10.l2).removeOnScrollListener(asS17S0300000_10);
    }

    public AsS17S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
