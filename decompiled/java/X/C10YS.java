package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10YS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YS {
    public final List<InterfaceC19264510Yh> LIZ = new ArrayList();
    public int LIZIZ;

    public final void LIZ(AbstractC19263910Yb abstractC19263910Yb) {
        ((ArrayList) this.LIZ).add(abstractC19263910Yb);
    }

    public final void LIZIZ(C1950707kX c1950707kX, C10YS c10ys) {
        if (this.LIZIZ == ((ArrayList) this.LIZ).size()) {
            return;
        }
        InterfaceC19264510Yh interfaceC19264510Yh = (InterfaceC19264510Yh) ListProtector.get(this.LIZ, this.LIZIZ);
        this.LIZIZ++;
        interfaceC19264510Yh.LIZ(c1950707kX, c10ys);
    }
}
