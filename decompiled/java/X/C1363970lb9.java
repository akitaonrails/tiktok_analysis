package X;

import Y.ACListenerS155S0100000_21;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363970lb9 extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public SharePanelViewModel LL;
    public final TextView LLILLJJLI;
    public final C427660Gpo LLILLL;
    public final C0HZQ LLILZ;
    public final View LLILZIL;
    public IMContact LLILZLL;
    public boolean LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public final C1364290lbf LLJ;
    public final C1361580lXI LLJI;
    public final C2252331DDr LLJIJIL;
    public final C414301jJ LLJILJIL;

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
        C1364290lbf c1364290lbf = this.LLJ;
        if (c1364290lbf != null) {
            c1364290lbf.LIZLLL();
        }
    }

    public C1363970lb9(View view, SharePanelViewModel sharePanelViewModel, boolean z, int i, boolean z2, int i2, int i3) {
        Bundle bundle;
        TuxTextView tuxTextView;
        LinearLayout.LayoutParams layoutParams;
        super(view);
        this.LL = sharePanelViewModel;
        this.LLJI = new C1361580lXI();
        String string = null;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LLJIJIL = c2252331DDrLIZIZ;
        this.LLJILJIL = new C414301jJ(c2252331DDrLIZIZ, new C1402260mau(c2252331DDrLIZIZ, this, 4), new C1364000lbC(null));
        view.getLayoutParams().width = i;
        TextView textView = (TextView) view.findViewById(R.id.p0w);
        this.LLILLJJLI = textView;
        textView.setImportantForAccessibility(2);
        C427660Gpo c427660Gpo = (C427660Gpo) view.findViewById(R.id.biz);
        this.LLILLL = c427660Gpo;
        c427660Gpo.setImportantForAccessibility(2);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.jgi);
        this.LLILZ = c0hzq;
        if (c0hzq != null) {
            textView.setLabelFor(c0hzq.getId());
        }
        c0hzq.setImportantForAccessibility(2);
        View viewFindViewById = view.findViewById(R.id.jgh);
        this.LLILZIL = viewFindViewById;
        viewFindViewById.setImportantForAccessibility(2);
        C1362230lYL c1362230lYL = this.LL.LLJI;
        if (c1362230lYL != null) {
            view.getLayoutParams().width = c1362230lYL.LJIIJJI;
            c427660Gpo.getLayoutParams().width = c1362230lYL.LJIIL;
            c427660Gpo.getLayoutParams().height = c1362230lYL.LJIIL;
            if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    layoutParams = null;
                }
                C786410Ut5.R6(tuxTextView, layoutParams);
                ((TuxTextView) textView).setTextColorRes(R.attr.a1h);
            }
        } else {
            if (z) {
                view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.g6(this.LLILLJJLI, layoutParams3);
            }
            if (z2) {
                int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.a2s);
                c427660Gpo.getLayoutParams().height = dimensionPixelOffset;
                c427660Gpo.getLayoutParams().width = dimensionPixelOffset;
            }
        }
        textView.setMaxLines(i2);
        Integer numLIZJ = C1308910kAL.LIZJ(i3, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        C2211751BhN.LIZ(view, this.LLJI);
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 392);
        C786410Ut5.T8(c427660Gpo, new ACListenerS155S0100000_21(awS600S0100000_21, 264));
        C786410Ut5.T7(textView, new ACListenerS155S0100000_21(awS600S0100000_21, 264));
        C786410Ut5.b9(c0hzq, new ACListenerS155S0100000_21(awS600S0100000_21, 264));
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            string = bundle.getString("panel_source");
        }
        int iLIZLLL = C1369210ljb.LIZLLL(string);
        if (z) {
            C01GW c01gw = C1367480lgo.LIZ;
            if (C1367480lgo.LIZIZ(this.LL.LL)) {
                if (iLIZLLL == 1) {
                    this.LLJ = new C1364290lbf(view.getContext(), this.LL);
                }
                C1364290lbf c1364290lbf = this.LLJ;
                if (c1364290lbf != null) {
                    c1364290lbf.LIZJ((ViewGroup) view, this.LL.LLJI);
                }
            }
        }
    }
}
