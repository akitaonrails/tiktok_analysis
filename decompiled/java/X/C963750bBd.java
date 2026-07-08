package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963750bBd extends AbstractC960410b6F<C955590ayT, C963780bBg> {
    public final InterfaceC956060azE LIZIZ;
    public final InterfaceC956210azT LIZJ;
    public final InterfaceC957060b0q LIZLLL;
    public final DataChannel LJ;
    public final boolean LJFF;

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "MultiCoHostSearchUserViewBinder";
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C963780bBg c963780bBg = new C963780bBg(this, C786410Ut5.Td(layoutInflater, R.layout.guz, viewGroup, false));
        C962240b9C.LIZJ.getClass();
        return c963780bBg;
    }

    public C963750bBd(InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, InterfaceC957060b0q interfaceC957060b0q, DataChannel dataChannel, boolean z) {
        this.LIZIZ = interfaceC956060azE;
        this.LIZJ = interfaceC956210azT;
        this.LIZLLL = interfaceC957060b0q;
        this.LJ = dataChannel;
        this.LJFF = z;
    }
}
