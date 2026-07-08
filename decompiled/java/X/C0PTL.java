package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PTL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTL extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C0PTK LLIZ;
    public final TextView LLIZLLLIL;
    public final View LLJ;
    public SearchMixFeed LLJI;

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final View getView() {
        return this.itemView;
    }

    public final void P5(SearchMixFeed searchMixFeed) {
        C0PTK c0ptk;
        int i;
        this.LLJI = searchMixFeed;
        C0PCB customContent = searchMixFeed.getCustomContent();
        if (customContent == null) {
            return;
        }
        boolean zLJIL = C1255704vj.LIZ().LJIL(C946803n0.LIZ(this.itemView));
        View view = this.LLJ;
        if (view != null) {
            if (!zLJIL && getBindingAdapterPosition() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (C650240Pew.LIZ()) {
            View view2 = this.LLJ;
            if (view2 != null) {
                C648880Pck.LIZIZ(view2);
            }
            View view3 = this.LLJ;
            if (view3 != null) {
                C650240Pew.LIZ.getClass();
                C1744700vVE.LJIIIZ(C650240Pew.LIZJ, view3);
            }
        }
        if (C123100dR.LIZ(customContent.title)) {
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                textView.setText(customContent.title);
            }
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 0);
            }
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
        } else {
            TextView textView3 = this.LLIZLLLIL;
            if (textView3 != null) {
                textView3.setText((CharSequence) null);
            }
            TextView textView4 = this.LLIZLLLIL;
            if (textView4 != null) {
                C786410Ut5.LLIL(textView4, 8);
            }
        }
        C0PCB customContent2 = searchMixFeed.getCustomContent();
        if (customContent2 != null && customContent2.fakeNullifyCardInfo != null && (c0ptk = this.LLIZ) != null) {
            c0ptk.LIZ(searchMixFeed);
        }
    }

    public C0PTL(View view, C0PTK c0ptk) {
        super(view);
        this.LLIZ = c0ptk;
        this.LLJ = view.findViewById(R.id.jhz);
        TextView textView = (TextView) view.findViewById(R.id.uca);
        this.LLIZLLLIL = textView;
        Integer numValueOf = Integer.valueOf(C1913107eT.LJFF());
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            if (textView != null) {
                C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), textView);
            }
        }
        View viewFindViewById = view.findViewById(R.id.ucd);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.lto);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }
}
