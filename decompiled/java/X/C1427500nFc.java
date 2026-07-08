package X;

import Y.ACListenerS156S0100000_22;
import Y.ATListenerS455S0100000_22;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427500nFc extends RecyclerView.ViewHolder implements InterfaceC669260QMy {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final InterfaceC1427550nFh LL;
    public final C01GW LLILLJJLI;
    public long LLILLL;
    public final C21415018rM LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public SearchSugEntity LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public Function1<? super Integer, Unit> LLJIJIL;
    public C1427520nFe LLJILJIL;
    public final float LLJILJILJ;
    public final TuxIconDrawable LLJILLL;
    public final TuxIconDrawable LLJJ;
    public final TuxIconDrawable LLJJI;
    public final TuxIconDrawable LLJJIII;

    @Override // X.InterfaceC669260QMy
    public final void onViewDetachedFromWindow() {
    }

    @Override // X.InterfaceC669260QMy
    public final void onVisibilityChanged(boolean z) {
    }

    public final C1424200nAI I5() {
        SearchSugEntity searchSugEntity = this.LLIZ;
        if (searchSugEntity == null) {
            return null;
        }
        String str = searchSugEntity.LIZIZ == -1 ? "template_sug" : "template_sug_cache";
        String str2 = searchSugEntity.content;
        int i = this.LLIZLLLIL;
        Word word = searchSugEntity.mWord;
        return new C1424200nAI(true, str, str2, i, word != null ? word.getId() : null, this.LLJ, C0QNF.LIZLLL(this.LLIZ), searchSugEntity.LJI);
    }

    public final C1361400lX0 L5() {
        return (C1361400lX0) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC669260QMy
    public final void onViewAttachedToWindow() {
        InterfaceC1427550nFh interfaceC1427550nFh;
        C1424200nAI c1424200nAII5 = I5();
        if (c1424200nAII5 == null || (interfaceC1427550nFh = this.LL) == null) {
            return;
        }
        interfaceC1427550nFh.LIZIZ(c1424200nAII5);
    }

    public C1427500nFc(View view, C1427530nFf c1427530nFf) {
        super(view);
        this.LL = c1427530nFf;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(view, 234));
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_start_icon);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.vs_end_icon);
        this.LLJ = "";
        float fLJ = C11VU.LJ(L5()) - C11VU.LIZIZ(32.0f, L5());
        this.LLJILJILJ = fLJ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        view.findViewById(R.id.vs_cover);
        this.LLILZ = (C21415018rM) view.findViewById(R.id.tvl_unified_sug);
        view.findViewById(R.id.tvl_unified_sug_subtitle);
        C427690Gpr.LJ(view, 0.0f);
        if (((Number) C284260BCe.LIZ.getValue()).intValue() != 4) {
            TuxIconView tuxIconView = (TuxIconView) C786410Ut5.LJLLLL(viewStub2).findViewById(R.id.h4q);
            this.LLILZIL = tuxIconView;
            this.LLJILJILJ = fLJ - C11VU.LIZIZ(46.0f, view.getContext());
            if (tuxIconView != null) {
                tuxIconView.setOnTouchListener(new ATListenerS455S0100000_22(this, 2));
                C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 10));
            }
        }
        TuxIconView tuxIconView2 = (TuxIconView) C786410Ut5.LJLLLL(viewStub).findViewById(R.id.vym);
        this.LLILZLL = tuxIconView2;
        if (tuxIconView2 != null) {
            C426750GoL.LJIIIZ(tuxIconView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
            tuxIconView2.setBackgroundDrawable(C800330VaR.LIZIZ(L5(), R.drawable.d3o));
        }
        this.LLJILJILJ -= C11VU.LIZIZ(44.0f, view.getContext());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        c419910GdJ.LIZ = R.raw.icon_x_mark;
        this.LLJILLL = c419910GdJ.LIZ(L5());
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = iLIZIZ;
        c419910GdJ2.LIZJ = iLIZIZ;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
        c419910GdJ2.LIZ = R.raw.icon_clock;
        this.LLJJ = c419910GdJ2.LIZ(L5());
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZIZ = iLIZIZ;
        c419910GdJ3.LIZJ = iLIZIZ;
        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1j);
        c419910GdJ3.LIZ = R.raw.icon_magnifying_glass_offset;
        this.LLJJI = c419910GdJ3.LIZ(L5());
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZIZ = iLIZIZ;
        c419910GdJ4.LIZJ = iLIZIZ;
        c419910GdJ4.LJ = Integer.valueOf(R.attr.a1j);
        c419910GdJ4.LIZ = R.raw.icon_arrow_up_left_ltr;
        this.LLJJIII = c419910GdJ4.LIZ(L5());
    }
}
