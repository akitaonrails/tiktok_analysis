package Y;

import X.AbstractC1585810rMx;
import X.AbstractC194339111l;
import X.C12QW;
import X.C12QX;
import X.C19399210v0;
import X.C19679711z9;
import X.C19712012Ak;
import X.C20636115p1;
import X.InterfaceC19711512Af;
import X.InterfaceC19711712Ah;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AsS37S0200000_29 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LJJIIZI$3(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 2:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS37S0200000_29(C19712012Ak c19712012Ak, int i) {
        this.$t = i;
        this.l1 = c19712012Ak;
    }

    public AsS37S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i) {
        View viewLJFF;
        if (i == 0 && (viewLJFF = ((C20636115p1) asS37S0200000_29.l0).LJFF(recyclerView.getLayoutManager())) != null) {
            C19399210v0 c19399210v0 = (C19399210v0) asS37S0200000_29.l1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(viewLJFF);
            if (c19399210v0.LLILZIL != childAdapterPosition) {
                c19399210v0.LLILZIL = childAdapterPosition;
                c19399210v0.LLILZLL = childAdapterPosition;
                HandlerHook.viewPost(recyclerView, new ARunnableS34S0201000_29(c19399210v0, childAdapterPosition, viewLJFF, 6));
            }
        }
    }

    public static final void LJJIIJ$1(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i) {
        if (i == 0) {
            AbstractC194339111l abstractC194339111l = (AbstractC194339111l) asS37S0200000_29.l0;
            View view = (View) asS37S0200000_29.l1;
            abstractC194339111l.LIZJ(view, new AwS464S0200000_29(abstractC194339111l, (AbstractC194339111l<int>) view, 17));
        }
    }

    public static final void LJJIIJ$2(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i) {
        InterfaceC19711712Ah interfaceC19711712Ah;
        InterfaceC19711512Af interfaceC19711512Af;
        boolean z;
        InterfaceC19711512Af interfaceC19711512Af2;
        ((C19712012Ak) asS37S0200000_29.l1).LIZLLL.invoke(Integer.valueOf(i));
        if (((C19679711z9) ((C19712012Ak) asS37S0200000_29.l1).LIZ.findViewById(R.id.vkt)).getHasEvent() && ((Boolean) asS37S0200000_29.l0) == null) {
            if (i != 0) {
                InterfaceC19711512Af interfaceC19711512Af3 = (InterfaceC19711512Af) ((C19712012Ak) asS37S0200000_29.l1).LIZIZ.LJFF(InterfaceC19711512Af.class);
                if (interfaceC19711512Af3 != null && !interfaceC19711512Af3.isPaused()) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                asS37S0200000_29.l0 = boolValueOf;
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && (interfaceC19711512Af2 = (InterfaceC19711512Af) ((C19712012Ak) asS37S0200000_29.l1).LIZIZ.LJFF(InterfaceC19711512Af.class)) != null) {
                    interfaceC19711512Af2.pause(false);
                    return;
                }
                return;
            }
        } else if (i != 0) {
            return;
        }
        if (Intrinsics.LJFF((Boolean) asS37S0200000_29.l0, Boolean.TRUE) && (interfaceC19711712Ah = (InterfaceC19711712Ah) ((C19712012Ak) asS37S0200000_29.l1).LIZIZ.LJFF(InterfaceC19711712Ah.class)) != null && interfaceC19711712Ah.A0() && (interfaceC19711512Af = (InterfaceC19711512Af) ((C19712012Ak) asS37S0200000_29.l1).LIZIZ.LJFF(InterfaceC19711512Af.class)) != null) {
            interfaceC19711512Af.play();
        }
        asS37S0200000_29.l0 = null;
    }

    public static final void LJJIIZI$0(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i, int i2) {
        ((C12QW) asS37S0200000_29.l1).LLLZLL(i2, ((GridLayoutManager) asS37S0200000_29.l0).findFirstCompletelyVisibleItemPosition());
    }

    public static final void LJJIIZI$1(AsS37S0200000_29 asS37S0200000_29, RecyclerView recyclerView, int i, int i2) {
        ((C12QX) asS37S0200000_29.l1).LLLZLZ(i2, ((GridLayoutManager) asS37S0200000_29.l0).findFirstCompletelyVisibleItemPosition());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        r6 = (X.C19399210v0) r3.l1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$2(Y.AsS37S0200000_29 r3, androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            java.lang.Object r1 = r3.l0
            X.15p1 r1 = (X.C20636115p1) r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
            android.view.View r0 = r1.LJFF(r0)
            if (r0 == 0) goto L39
            java.lang.Object r6 = r3.l1
            X.10v0 r6 = (X.C19399210v0) r6
            int r5 = r4.getChildAdapterPosition(r0)
            int r4 = r6.LLILZLL
            if (r4 == r5) goto L39
            r3 = -1
            if (r4 == r3) goto L29
            androidx.recyclerview.widget.RecyclerView r2 = r6.LL
            Y.ARunnableS40S0101000_29 r1 = new Y.ARunnableS40S0101000_29
            r0 = 15
            r1.<init>(r6, r4, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L29:
            r6.LLILZLL = r5
            if (r5 == r3) goto L39
            androidx.recyclerview.widget.RecyclerView r2 = r6.LL
            Y.ARunnableS40S0101000_29 r1 = new Y.ARunnableS40S0101000_29
            r0 = 14
            r1.<init>(r6, r5, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS37S0200000_29.LJJIIZI$2(Y.AsS37S0200000_29, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
