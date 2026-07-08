package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS160S0101000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361550lXF extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJILJIL = 0;
    public SharePanelViewModel LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C1361580lXI LLJI;
    public int LLJIJIL;

    static {
        new C1341760l1K();
    }

    public final C1303280k1G N5() {
        return (C1303280k1G) this.LLILLL.getValue();
    }

    public final int P5() {
        SharePanelViewModel sharePanelViewModel = this.LL;
        int iLJIILIIL = ((InterfaceC1361560lXG) sharePanelViewModel.LLJLILLLLZIIL.getValue()).LJIILIIL(sharePanelViewModel.LJIIIZ());
        if (!(!this.LL.LJIILL().isEmpty())) {
            return iLJIILIIL;
        }
        if (C13LQ.LJJIJIIJI(Integer.valueOf(iLJIILIIL), new Integer[]{0, 1}) >= 0) {
            return 1;
        }
        if (C13LQ.LJJIJIIJI(Integer.valueOf(iLJIILIIL), new Integer[]{2, 3}) >= 0) {
            return 3;
        }
        return iLJIILIIL;
    }

    public final InterfaceC1361560lXG R5() {
        return (InterfaceC1361560lXG) this.LLILZLL.getValue();
    }

    public static final boolean S5(int i) {
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{1, 3}) >= 0) {
            return true;
        }
        return false;
    }

    public final void T5(int i) {
        if (i == this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = i;
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 1}) >= 0) {
            String strLJIIJJI = R5().LJIIJJI();
            C1303280k1G c1303280k1GN5 = N5();
            if (c1303280k1GN5 != null) {
                c1303280k1GN5.setAnimation(strLJIIJJI);
            }
            ((TextView) this.LLILZIL.getValue()).setText(C20642515q3.LJI(R5().LJII()));
        } else {
            int iLJFF = R5().LJFF();
            C1303280k1G c1303280k1GN52 = N5();
            if (c1303280k1GN52 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iLJFF;
                c1303280k1GN52.setImageDrawable(c419910GdJ.LIZ(c1303280k1GN52.getContext()));
            }
            ((TextView) this.LLILZIL.getValue()).setText(C20642515q3.LJI(R5().LJIIJ()));
        }
        if (S5(i)) {
            C1303280k1G c1303280k1GN53 = N5();
            if (c1303280k1GN53 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1303280k1GN53);
                c1303280k1GN53.setAlpha(0.34f);
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLILZ.getValue();
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 0.34f);
            }
            C786410Ut5.B5((TuxTextView) this.LLILZIL.getValue(), 0.34f);
            return;
        }
        C1303280k1G c1303280k1GN54 = N5();
        if (c1303280k1GN54 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1303280k1GN54);
            c1303280k1GN54.setAlpha(1.0f);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLILZ.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 1.0f);
        }
        C786410Ut5.B5((TuxTextView) this.LLILZIL.getValue(), 1.0f);
    }

    public final void I5(IMContact iMContact, SharePanelViewModel sharePanelViewModel) {
        C1303280k1G c1303280k1GN5;
        this.LL = sharePanelViewModel;
        this.LLJI.LIZ(iMContact, "SHARE_PANEL", new AwS565S0100000_21(this, 1577));
        int iP5 = P5();
        T5(iP5);
        if (!C1360460lVU.LIZIZ.LJJII().LJIILL() && iP5 == 0) {
            R5().LIZJ();
            C1303280k1G c1303280k1GN52 = N5();
            if (c1303280k1GN52 != null) {
                c1303280k1GN52.setRepeatCount(R5().LJIIIIZZ());
            }
            if (!C0CBR.LIZIZ && (c1303280k1GN5 = N5()) != null) {
                c1303280k1GN5.playAnimation();
            }
        }
        U5(iP5, iMContact);
    }

    public final void L5(Context context, IMContact iMContact) {
        SharePanelViewModel sharePanelViewModel = this.LL;
        SharePackage sharePackage = sharePanelViewModel.LL;
        if (sharePackage != null) {
            sharePackage.LJIIIZ(context, null, null, new AwS422S0200000_21(this, iMContact, 129));
        } else {
            sharePanelViewModel.LJIJJLI(iMContact, true);
        }
    }

    public final void U5(int i, IMContact iMContact) {
        if (S5(i)) {
            C1303280k1G c1303280k1GN5 = N5();
            if (c1303280k1GN5 != null) {
                C786410Ut5.A9(c1303280k1GN5, null);
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLILZ.getValue();
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, null);
                return;
            }
            return;
        }
        C1303280k1G c1303280k1GN52 = N5();
        if (c1303280k1GN52 != null) {
            C786410Ut5.A9(c1303280k1GN52, new ACListenerS124S0200000_21(iMContact, this, 95));
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLILZ.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS124S0200000_21(iMContact, this, 96));
        }
        if (!this.LLILLJJLI) {
            return;
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(iMContact, this, 97), this.itemView.findViewById(R.id.l3m));
    }

    public C1361550lXF(View view, SharePanelViewModel sharePanelViewModel, boolean z, int i) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1576));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1579));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1578));
        this.LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(630));
        this.LLIZ = C452501pT.LIZIZ(new AwS160S0101000_21(i, view, 8));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS422S0200000_21(view, this, 127));
        this.LLJ = C452501pT.LIZIZ(new AwS422S0200000_21(view, this, 128));
        this.LLJI = new C1361580lXI();
        this.LLJIJIL = -1;
        C2211751BhN.LIZ(view, this.LLJI);
    }
}
