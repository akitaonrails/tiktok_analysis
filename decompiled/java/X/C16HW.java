package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.16HW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HW implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$0(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$2(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$3(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    public static final void LIZ$0(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
        C15EG c15eg = (C15EG) ((LinkedHashMap) ((C15EB) c16hw.l0).LLJJJIL).get((RecyclerView.ViewHolder) c16hw.l1);
        if (c15eg == null) {
            return;
        }
        c15eg.LIZLLL = true;
        ((C15EB) c16hw.l0).LJJIZ((RecyclerView.ViewHolder) c16hw.l1);
    }

    public static final void LIZ$1(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
        C15EG c15eg = (C15EG) ((LinkedHashMap) ((C15EB) c16hw.l0).LLJJJIL).get((RecyclerView.ViewHolder) c16hw.l1);
        if (c15eg == null) {
            return;
        }
        c15eg.LJ = true;
        ((C15EB) c16hw.l0).LJJIZ((RecyclerView.ViewHolder) c16hw.l1);
    }

    public static final void LIZ$2(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C20663915tV) c16hw.l0).LLILZ = (C20665215ti) c16hw.l1;
    }

    public static final void LIZ$3(C16HW c16hw, InterfaceC1844880y6o interfaceC1844880y6o) {
        C20664415ta c20664415ta = ((C20663915tV) c16hw.l0).LLILLL;
        C20665215ti c20665215ti = (C20665215ti) c16hw.l1;
        FrameLayout frameLayout = c20664415ta.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(c20665215ti, frameLayout);
        }
    }

    public C16HW(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
