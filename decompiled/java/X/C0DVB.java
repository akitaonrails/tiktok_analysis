package X;

import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DVB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVB {
    public static final <T> void LIZ(C627660Ojc<T> c627660Ojc, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1749280vcc c1749280vcc, int i, int i2) {
        boolean z;
        List<T> list = c627660Ojc.LLILZ;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
            return;
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c627660Ojc.LL;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                c1749280vcc.LJ();
                return;
            }
            return;
        }
        if (!(abstractC1623806Xk instanceof C1623606Xi)) {
            return;
        }
        C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        if (c1749280vcc == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        c1749280vcc.setLayoutVariant(1);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n0;
        Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJFF = Integer.valueOf(i);
        c1722300uv6.LJII = Integer.valueOf(i2);
        c1749280vcc.setStatus(c1722300uv6);
        c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(186));
    }
}
