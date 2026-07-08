package X;

import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0uIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698330uIR implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
        }
    }

    public C1698330uIR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C1698330uIR c1698330uIR, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1662830tNB c1662830tNB = (C1662830tNB) c1698330uIR.l0;
        if (c1662830tNB.mView != null) {
            C1295960jpS c1295960jpS = c1662830tNB.LLLLLLZ;
            if (c1295960jpS != null) {
                c1295960jpS.setComposition(c1294720jnS);
            }
            C1295960jpS c1295960jpS2 = ((C1662830tNB) c1698330uIR.l0).LLLLLLZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.playAnimation();
            }
            C1662830tNB c1662830tNB2 = (C1662830tNB) c1698330uIR.l0;
            c1662830tNB2.LLLLZIL(350L, new AwS562S0100000_18(c1662830tNB2, 2224));
            C1295960jpS c1295960jpS3 = ((C1662830tNB) c1698330uIR.l0).LLLLLLZ;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setLayerType(2, null);
            }
            C1662830tNB c1662830tNB3 = (C1662830tNB) c1698330uIR.l0;
            C1295960jpS c1295960jpS4 = c1662830tNB3.LLLLLLZ;
            if (c1295960jpS4 != null) {
                c1295960jpS4.setFailureListener(c1662830tNB3.LLLZLL);
            }
        }
    }

    public static final void onResult$1(C1698330uIR c1698330uIR, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        h hVar = (h) c1698330uIR.l0;
        if (hVar.mView != null) {
            hVar.LLLIIL = true;
            ((h) c1698330uIR.l0).LLLLLIL().setComposition(c1294720jnS);
            ((h) c1698330uIR.l0).LLLLLIL().playAnimation();
            ((h) c1698330uIR.l0).LLLLLIL().setLayerType(2, null);
            ((h) c1698330uIR.l0).LLLLLIL().setFailureListener(((h) c1698330uIR.l0).LLLJIL);
        }
    }
}
