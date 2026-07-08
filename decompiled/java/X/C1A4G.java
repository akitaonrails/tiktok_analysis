package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateCTNViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A4G, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A4G extends ArrayAdapter<String> {
    public final List<String> LL;
    public final C1A4I LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dxh, viewGroup, false);
        }
        final C197039127h c197039127h = (C197039127h) view.findViewById(R.id.yzm);
        c197039127h.setText((CharSequence) ListProtector.get(this.LL, i));
        c197039127h.setBackground(getContext().getDrawable(R.drawable.csz));
        c197039127h.setTextColor(R.attr.bm);
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.1A4H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1A4G c1a4g = this.LL;
                if (!c1a4g.LLILLL) {
                    c1a4g.LLILLL = true;
                    c197039127h.setTuxFont(42);
                    c197039127h.setBackground(this.LL.getContext().getDrawable(R.drawable.ct0));
                    c197039127h.setTextColor(R.attr.bx);
                    C1A4G c1a4g2 = this.LL;
                    c1a4g2.LLILLJJLI.LIZ((String) ListProtector.get(c1a4g2.LL, i));
                    ((AgeGateCTNViewModel) this.LL.LLILZ.getValue()).vQ2(1);
                }
            }
        });
        return view;
    }

    public C1A4G(Context context, List<String> list, C19EG c19eg, C1A4I c1a4i) {
        super(context, 0, list);
        this.LL = list;
        this.LLILLJJLI = c1a4i;
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(c19eg, 4119));
    }
}
