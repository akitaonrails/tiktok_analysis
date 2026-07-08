package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Qrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683660Qrk {
    public static void LIZ(RecyclerView recyclerView, InterfaceC683650Qrj interfaceC683650Qrj, AbstractC1338480kw2 abstractC1338480kw2, int i, boolean z) {
        if (!z) {
            recyclerView.addOnScrollListener(new C1379050lzT(C2213981Bky.LIZIZ.getApplicationContext()));
        }
        C683640Qri c683640Qri = new C683640Qri(recyclerView, interfaceC683650Qrj);
        if (abstractC1338480kw2 != null) {
            ((ArrayList) c683640Qri.LJII).add(abstractC1338480kw2);
        }
        c683640Qri.LJI = i;
        recyclerView.setOnFlingListener(c683640Qri);
    }
}
