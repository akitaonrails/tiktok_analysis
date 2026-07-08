package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962140b92 extends AbstractC960410b6F<C955590ayT, C1E2R> {
    public final InterfaceC956060azE LIZIZ;
    public final InterfaceC956210azT LIZJ;
    public final InterfaceC957060b0q LIZLLL;
    public final DataChannel LJ;

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "InteractUpgradeViewBinderForMultiCoHost";
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd;
        viewGroup.getContext();
        InterfaceC943980afk interfaceC943980afk = (InterfaceC943980afk) C943970afj.LIZIZ.getValue();
        if (interfaceC943980afk != null) {
            viewTd = interfaceC943980afk.LIZJ(viewGroup);
        } else {
            viewTd = null;
        }
        if (viewTd != null) {
            C943970afj.LIZJ(R.layout.grs, true);
        } else {
            C943970afj.LIZJ(R.layout.grs, false);
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.grs, viewGroup, false);
        }
        C1E2R c1e2r = new C1E2R(this, viewTd);
        C962230b9B.LIZJ.getClass();
        return c1e2r;
    }

    public C962140b92(InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, InterfaceC957060b0q interfaceC957060b0q, DataChannel dataChannel) {
        this.LIZIZ = interfaceC956060azE;
        this.LIZJ = interfaceC956210azT;
        this.LIZLLL = interfaceC957060b0q;
        this.LJ = dataChannel;
    }
}
