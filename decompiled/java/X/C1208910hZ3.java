package X;

import com.bytedance.als.h0;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0hZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208910hZ3 implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$2(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
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

    public C1208910hZ3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
        C1662830tNB c1662830tNB = (C1662830tNB) c1208910hZ3.l0;
        h0<Integer> h0Var = c1662830tNB.LLLLZIL;
        int i = c1662830tNB.LLLLZI;
        c1662830tNB.LLLLZI = i + 1;
        h0Var.LJFF(Integer.valueOf(i));
    }

    public static final void LIZ$1(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LLLLLLZZ((TuxIconView) c1208910hZ3.l0, 8);
    }

    public static final void LIZ$2(C1208910hZ3 c1208910hZ3, InterfaceC1844880y6o interfaceC1844880y6o) {
        SmartImageView smartImageView = (SmartImageView) c1208910hZ3.l0;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }
}
