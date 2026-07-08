package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373650lql extends LinearLayout {
    public View LL;
    public final LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public AbstractC736370SuZ LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;

    public final View getBoundaryFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f683ci3);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public C1373650lql(Context context) {
        super(context);
        C786410Ut5.LJLLJ(getContext(), R.layout.b82, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.vty);
        this.LLILLJJLI = linearLayout;
        this.LLILZIL = (TuxTextView) findViewById(R.id.vu1);
        this.LLILZLL = (TuxTextView) findViewById(R.id.desc);
        this.LLIZ = (TuxIconView) findViewById(R.id.jxe);
        ((TextView) linearLayout.findViewById(R.id.vtl)).setText("0.5x");
        ((TextView) linearLayout.findViewById(R.id.vtm)).setText("1x");
        ((TextView) linearLayout.findViewById(R.id.vtn)).setText("1.5x");
        ((TextView) linearLayout.findViewById(R.id.vto)).setText("2x");
    }

    public final void setBoundaryFromXml(View view) {
        this.LL = view;
    }
}
