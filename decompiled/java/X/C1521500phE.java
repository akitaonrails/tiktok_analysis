package X;

import Y.ARunnableS2S2100100_23;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0phE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521500phE extends C1521750phd {
    public static final C1521500phE LIZ = new C1521500phE();
    public static final CopyOnWriteArrayList<C1521750phd> LIZIZ = new CopyOnWriteArrayList<>();

    @Override // X.C1521750phd
    public final void LIZ(View view, String str) {
        Iterator<C1521750phd> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(view, str);
        }
    }

    @Override // X.C1521750phd
    public final void LIZIZ(View view, String str) {
        Iterator<C1521750phd> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(view, str);
        }
    }

    @Override // X.C1521750phd
    public final void LIZJ(View view, String str) {
        Iterator<C1521750phd> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(view, str);
        }
    }

    @Override // X.C1521750phd
    public final void LIZLLL(View view, String str, String str2, long j) {
        C824310WVh.LIZJ(new ARunnableS2S2100100_23(view, str, str2, j, 1));
    }
}
