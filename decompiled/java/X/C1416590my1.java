package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0my1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416590my1 implements InterfaceC1416820myO {
    public final /* synthetic */ C094D<Pair<Integer, ? extends AVMusic>> LIZ;
    public final /* synthetic */ C1416540mxw LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC1416820myO
    public final void onStart() {
    }

    @Override // X.InterfaceC1416820myO
    public final void onProgress(int i) {
        this.LIZ.LJIIIIZZ(new Pair<>(Integer.valueOf(i), null));
    }

    @Override // X.InterfaceC1416820myO
    public final void LIZ(Integer num, String str) {
        int iIntValue;
        C094D<Pair<Integer, ? extends AVMusic>> c094d = this.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", downloadMusic failed - ");
        sbLIZ.append(str);
        c094d.LJIIJJI(new C1416460mxo(iIntValue, C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // X.InterfaceC1416820myO
    public final void LIZIZ(final AVMusic aVMusic, final boolean z) {
        C1444820nhY.LJII(aVMusic);
        C1420960n54 c1420960n54 = C1420960n54.LIZ;
        Context context = this.LIZIZ.LL;
        final C094D<Pair<Integer, ? extends AVMusic>> c094d = this.LIZ;
        C1420820n4q c1420820n4q = new C1420820n4q() { // from class: X.0my2
            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
            public final void LIZLLL(AVMusic aVMusic2, boolean z2) {
                int i;
                if (z2) {
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    if (z) {
                        i = -1;
                    } else {
                        i = 100;
                    }
                    c094d2.LJIIIIZZ(new Pair<>(Integer.valueOf(i), aVMusic));
                    c094d.LJIIJJI(null);
                    return;
                }
                this.LIZ(null, "algorithm");
            }
        };
        c1420960n54.getClass();
        C1420960n54.LIZJ(context, aVMusic, c1420820n4q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1416590my1(C094D<? super Pair<Integer, ? extends AVMusic>> c094d, C1416540mxw c1416540mxw, String str) {
        this.LIZ = c094d;
        this.LIZIZ = c1416540mxw;
        this.LIZJ = str;
    }
}
