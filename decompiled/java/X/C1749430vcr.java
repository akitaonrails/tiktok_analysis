package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: renamed from: X.0vcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749430vcr extends C214906198m {
    public final View LL;
    public final List<CpfElem> LLILLJJLI;
    public final InterfaceC1631620sYq<C1749430vcr, Integer, CpfElem, Unit> LLILLL;
    public final Function1<Integer, Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final C1749440vcs LLILZLL;
    public List<CpfElem> LLIZ = new ArrayList();

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
            Function0<Unit> function0 = this.LLILZIL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public C1749430vcr(Context context, View view, List list, AwS675S0100000_26 awS675S0100000_26, AwS605S0100000_26 awS605S0100000_26, AwS570S0100000_26 awS570S0100000_26) {
        this.LL = view;
        this.LLILLJJLI = list;
        this.LLILLL = awS675S0100000_26;
        this.LLILZ = awS605S0100000_26;
        this.LLILZIL = awS570S0100000_26;
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.aor, null);
        ListView listView = (ListView) viewLJLLJ.findViewById(R.id.ntl);
        C1749440vcs c1749440vcs = new C1749440vcs(context, new ArrayList(list));
        this.LLILZLL = c1749440vcs;
        c1749440vcs.LLILLL = new AwS640S0100000_26(this, 183);
        listView.setAdapter((ListAdapter) c1749440vcs);
        setWidth(C12ES.LJIIJ(context) - C679280Qkg.LIZ(32));
        setHeight(-2);
        setOutsideTouchable(false);
        setElevation(2.0f);
        setContentView(viewLJLLJ);
    }
}
