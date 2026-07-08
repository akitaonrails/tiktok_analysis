package X;

import Y.AfS78S0101000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.FeedItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C468350IYf extends AbstractC468490IYt<FeedItem> {
    public final View LLILLL;
    public final C11RK<Boolean> LLILZ;
    public final C469770IbX LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public C16F5 LLJ;

    public final void S5() {
        TextView textView = this.LLIZ;
        if (textView != null) {
            textView.setText(2131841465);
        }
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 != null) {
            textView2.setText(2131841462);
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(2131841464);
        }
    }

    public void T5() {
        C469770IbX c469770IbX = this.LLILZIL;
        if (Intrinsics.LJFF("following", c469770IbX != null ? c469770IbX.LIZ : null)) {
            TextView textView = this.LLIZ;
            if (textView != null) {
                textView.setText(2131841459);
            }
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 != null) {
                textView2.setText(2131841462);
            }
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                c16f5.setText(2131841459);
                return;
            }
            return;
        }
        C469770IbX c469770IbX2 = this.LLILZIL;
        if (Intrinsics.LJFF("outdoor", c469770IbX2 != null ? c469770IbX2.LIZ : null)) {
            TextView textView3 = this.LLIZ;
            if (textView3 != null) {
                textView3.setText(2131841642);
            }
            TextView textView4 = this.LLIZLLLIL;
            if (textView4 != null) {
                textView4.setText(2131841462);
            }
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                c16f52.setText(2131841641);
                return;
            }
            return;
        }
        C469770IbX c469770IbX3 = this.LLILZIL;
        if (Intrinsics.LJFF("fashion", c469770IbX3 != null ? c469770IbX3.LIZ : null)) {
            TextView textView5 = this.LLIZ;
            if (textView5 != null) {
                textView5.setText(2131841640);
            }
            TextView textView6 = this.LLIZLLLIL;
            if (textView6 != null) {
                textView6.setText(2131841462);
            }
            C16F5 c16f53 = this.LLJ;
            if (c16f53 != null) {
                c16f53.setText(2131841639);
                return;
            }
            return;
        }
        C469770IbX c469770IbX4 = this.LLILZIL;
        if (Intrinsics.LJFF("mix_talent", c469770IbX4 != null ? c469770IbX4.LIZ : null)) {
            TextView textView7 = this.LLIZ;
            if (textView7 != null) {
                textView7.setText(2131841644);
            }
            TextView textView8 = this.LLIZLLLIL;
            if (textView8 != null) {
                textView8.setText(2131841462);
            }
            C16F5 c16f54 = this.LLJ;
            if (c16f54 != null) {
                c16f54.setText(2131841643);
            }
        }
    }

    public final void R5(int i) {
        Object obj;
        if (i == 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_empty_show");
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJ()), "has_banner");
            c474500IjALIZ.LJJII(c467800IWc.LJIIIIZZ, "tab_type");
            c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_explore_no_more_show");
        C467800IWc c467800IWc2 = C467800IWc.LJIJ;
        c474500IjALIZ2.LJJII(Integer.valueOf(c467800IWc2.LJ()), "has_banner");
        c474500IjALIZ2.LJJII(c467800IWc2.LJIIIIZZ, "tab_type");
        C469770IbX c469770IbX = this.LLILZIL;
        if (c469770IbX != null) {
            obj = c469770IbX.LIZ;
        } else {
            obj = null;
        }
        c474500IjALIZ2.LJJII(obj, "no_more_type");
        c474500IjALIZ2.LJJII(c467800IWc2.LJIIL, "landing_reason");
        c474500IjALIZ2.LJJII(Integer.valueOf(i), "show_num");
        c474500IjALIZ2.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZ2.LJJII(Integer.valueOf(c467800IWc2.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZ2.LJJII(c467800IWc2.LIZIZ(), "entrance_type");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LIZ();
    }

    @Override // X.AbstractC468490IYt
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void I5(int i, FeedItem feedItem) {
        if (i == 0) {
            View view = this.LLILZLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TextView textView = this.LLIZ;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
        } else {
            View view2 = this.LLILZLL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            TextView textView2 = this.LLIZ;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 0);
            }
        }
        T5();
        R5(i);
        C11RK<Boolean> c11rk = this.LLILZ;
        if (c11rk != null) {
            N5(c11rk.LJJLJLI(new AfS78S0101000_7(this, i, 2)));
        }
    }

    public C468350IYf(View view, C11RK<Boolean> c11rk, C469770IbX c469770IbX) {
        super(view);
        this.LLILLL = view;
        this.LLILZ = c11rk;
        this.LLILZIL = c469770IbX;
        this.LLILZLL = view.findViewById(R.id.h3f);
        this.LLIZ = (TextView) view.findViewById(R.id.h58);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.g_z);
        this.LLJ = (C16F5) view.findViewById(R.id.tv_suggested_desc);
    }
}
