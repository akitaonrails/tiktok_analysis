package X;

import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0nio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445600nio {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, float f) {
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if ((outlineProvider instanceof C1445610nip) && outlineProvider != null) {
            view.invalidateOutline();
            return;
        }
        C1445610nip c1445610nip = new C1445610nip();
        c1445610nip.LIZ = f;
        view.setOutlineProvider(c1445610nip);
        view.setClipToOutline(true);
    }
}
