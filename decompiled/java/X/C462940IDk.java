package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0IDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462940IDk implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$0(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
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
        }
    }

    public static final void LIZ$0(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LJJJLZIJ((View) c462940IDk.l1, (ViewGroup) c462940IDk.l0);
    }

    public static final void LIZ$1(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LJJJLZIJ((View) c462940IDk.l1, (ViewGroup) c462940IDk.l0);
    }

    public static final void LIZ$2(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) c462940IDk.l1;
        if (interfaceC442640HXi != null) {
            interfaceC442640HXi.onResult(interfaceC1844880y6o);
        }
    }

    public static final void LIZIZ$2(C462940IDk c462940IDk, InterfaceC1844880y6o interfaceC1844880y6o) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) c462940IDk.l0;
        if (interfaceC442640HXi != null) {
            interfaceC442640HXi.onResult(interfaceC1844880y6o);
        }
    }

    public C462940IDk(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
