package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979570bb9 extends C0J8P<C978790bZt, C979730bbP> {
    public final InterfaceC963450bB9 LIZIZ;
    public final Fragment LIZJ;
    public final DataChannel LIZLLL;
    public C978750bZp LJ;
    public C979730bbP LJFF;
    public boolean LJI;

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C978790bZt c978790bZt) {
        Text text;
        C979730bbP c979730bbP = (C979730bbP) viewHolder;
        c979730bbP.getClass();
        int i = c978790bZt.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.LL(8, c979730bbP.LLILLJJLI);
                    C786410Ut5.LLJJJJ(c979730bbP.LLILLL, 8);
                    C786410Ut5.LL(8, c979730bbP.LL);
                    return;
                }
                return;
            }
            C786410Ut5.LL(0, c979730bbP.LL);
            C786410Ut5.LL(8, c979730bbP.LLILLJJLI);
            C786410Ut5.LLJJJJ(c979730bbP.LLILLL, 0);
            return;
        }
        C786410Ut5.LL(0, c979730bbP.LL);
        C786410Ut5.LL(0, c979730bbP.LLILLJJLI);
        C786410Ut5.LLJJJJ(c979730bbP.LLILLL, 8);
        C979570bb9 c979570bb9 = c979730bbP.LLILZIL;
        c979570bb9.LJ.LIZ(c979730bbP.itemView, c979570bb9.LIZIZ, new AwS559S0100000_15(c979570bb9, 633));
        C979570bb9 c979570bb92 = c979730bbP.LLILZIL;
        if (!c979570bb92.LJI) {
            return;
        }
        C978750bZp c978750bZp = c979570bb92.LJ;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
        if (multiMatchPrepareResponse == null || (text = multiMatchPrepareResponse.giftEventDesc) == null) {
            text = new Text();
            text.defaultPattern = "";
        }
        c978750bZp.LJFF(false, text, true);
        c979730bbP.LLILZIL.LJI = false;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C979730bbP c979730bbP = new C979730bbP(this, C786410Ut5.Td(layoutInflater, R.layout.h7o, viewGroup, false));
        this.LJFF = c979730bbP;
        return c979730bbP;
    }

    public C979570bb9(InterfaceC963450bB9 interfaceC963450bB9, Fragment fragment, DataChannel dataChannel) {
        this.LIZIZ = interfaceC963450bB9;
        this.LIZJ = fragment;
        this.LIZLLL = dataChannel;
        C978750bZp c978750bZp = new C978750bZp(fragment);
        c978750bZp.LIZJ(false);
        this.LJ = c978750bZp;
        this.LJI = true;
    }
}
