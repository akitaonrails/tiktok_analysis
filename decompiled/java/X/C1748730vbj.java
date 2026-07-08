package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748730vbj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final InterfaceC1748810vbr LIZ(View view) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        InterfaceC1748810vbr interfaceC1748810vbr2;
        ?? r1 = view;
        while (r1 != 0) {
            Object tag = r1.getTag(R.id.gib);
            if ((tag instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr2 = (InterfaceC1748810vbr) tag) != null) {
                return interfaceC1748810vbr2;
            }
            Object parent = r1.getParent();
            if (parent instanceof View) {
                r1 = (View) parent;
            } else {
                r1 = 0;
            }
            if (r1 instanceof InterfaceC1748810vbr) {
                return (InterfaceC1748810vbr) r1;
            }
        }
        C128Y c128yLIZ = C946803n0.LIZ(view);
        if ((c128yLIZ instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZ) != null) {
            return interfaceC1748810vbr;
        }
        Context context = view.getContext();
        if (context == null) {
            return null;
        }
        return LIZLLL(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1748810vbr LIZLLL(Context context) {
        if (context instanceof InterfaceC1748810vbr) {
            return (InterfaceC1748810vbr) context;
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof InterfaceC1748810vbr) {
                return (InterfaceC1748810vbr) contextWrapper.getBaseContext();
            }
            return null;
        }
        return null;
    }

    public static final LaneParams LIZIZ(InterfaceC1748810vbr interfaceC1748810vbr, final String str) {
        C04CK c04ck = new C04CK(str) { // from class: X.0vbk
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu[0]);
            }
        };
        c04ck.LJI = interfaceC1748810vbr;
        c04ck.LJIIIIZZ = null;
        c04ck.LJIIIZ = null;
        AbstractC1748750vbl.LIZLLL(c04ck);
        return c04ck.LJFF;
    }

    public static final void LJ(View view, InterfaceC1748860vbw interfaceC1748860vbw) {
        view.setTag(R.id.gia, interfaceC1748860vbw);
    }
}
