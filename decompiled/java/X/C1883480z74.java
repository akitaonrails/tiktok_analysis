package X;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0z74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883480z74 {
    public final InterfaceC1883030z6L LIZ;
    public Pair<? extends View, ? extends ViewTreeObserver.OnScrollChangedListener> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1883480z74.LIZIZ():void");
    }

    public C1883480z74(InterfaceC1883030z6L interfaceC1883030z6L) {
        this.LIZ = interfaceC1883030z6L;
    }

    public static View LIZ(View view) {
        View view2 = null;
        if (view == null) {
            return null;
        }
        if (view instanceof InterfaceC1354050lL9) {
            return view;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        }
        return LIZ(view2);
    }
}
