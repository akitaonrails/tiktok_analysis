package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import wh6.AbS508S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: renamed from: X.0ggZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175130ggZ extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public TuxTextView LLILLL;
    public C1195630hDd LLILZ;

    public C1175130ggZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final TuxTextView getTitleView() {
        return this.LLILLL;
    }

    public final C1195630hDd getTvViewAll() {
        return this.LLILZ;
    }

    public final void LIZIZ(C1175140gga c1175140gga) {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1175140gga.titleStr);
        }
        C1195630hDd c1195630hDd = this.LLILZ;
        if (c1195630hDd != null) {
            String string = c1175140gga.viewAllStr;
            if (string == null) {
                string = getContext().getResources().getString(2131847459);
            }
            c1195630hDd.LIZLLL(string);
        }
    }

    public final void LIZJ(int i) {
        View view = this.LL;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        }
    }

    public final void setStandardDebounceOnClickListener(View.OnClickListener onClickListener) {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.I7(new AbS508S0200000_18(this, onClickListener, 18, 42), view);
        }
        C1195630hDd c1195630hDd = this.LLILZ;
        if (c1195630hDd != null) {
            C786410Ut5.I7(new AbS699S0100000_18(onClickListener, 23, 42), c1195630hDd);
        }
    }

    public final void setTitleView(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvViewAll(C1195630hDd c1195630hDd) {
        this.LLILZ = c1195630hDd;
    }

    public static void LIZ(C1175130ggZ c1175130ggZ, String str) {
        C1195630hDd c1195630hDd = c1175130ggZ.LLILZ;
        if (c1195630hDd != null) {
            c1195630hDd.setTrackParams(new C1174900ggC("poi_detail_page", "poi_detail_section_header", C2097608Jq.LJIIIIZZ(new Pair("ttls_module_name", str), new Pair("ttls_btn_location", "top_right"))));
        }
    }

    public C1175130ggZ(Context context, AttributeSet attributeSet, int i) {
        View viewFindViewById;
        TuxTextView tuxTextView;
        C1195630hDd c1195630hDd;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewFindViewById2 = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e8s, this, true).findViewById(R.id.rdg);
        this.LL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById = viewFindViewById2.findViewById(R.id.rdf);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById2 != null) {
            tuxTextView = (TuxTextView) viewFindViewById2.findViewById(R.id.y3j);
        } else {
            tuxTextView = null;
        }
        this.LLILLL = tuxTextView;
        if (viewFindViewById2 != null) {
            c1195630hDd = (C1195630hDd) viewFindViewById2.findViewById(R.id.tv_view_all);
        } else {
            c1195630hDd = null;
        }
        this.LLILZ = c1195630hDd;
        if (c1195630hDd != null) {
            c1195630hDd.setTrackParams(new C1174900ggC("poi_detail_page", "poi_detail_section_header", null));
        }
    }
}
